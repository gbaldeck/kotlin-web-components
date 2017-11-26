package io.gbaldeck.kwc

import org.w3c.dom.Element

inline fun <reified Z: Element, reified T: CustomElement<Z>> defineElement(elementName: String, element: CustomElement.Static<T>, options:dynamic = jsObject()){
  __finalizeElement(elementName, T::class.js, Z::class.js, element, options)
}

fun __finalizeElement(elementName: String, tClass: JsClass<*>, zClass: JsClass<*>, source: Any, options: dynamic) {
  val c = tClass.asDynamic()
  c.kwcBaseElement = zClass

  //Assign static members
  val ownNames = js("Object").getOwnPropertyNames(source) as Array<String>
  val protoNames = js("Object").getOwnPropertyNames(source.asDynamic().constructor.prototype) as Array<String>

  for (name in ownNames + protoNames) {
    c[name] = source.asDynamic()[name]
  }
  ////////

  window.customElements.define(elementName, c, options)
}

fun jsObject(): dynamic = js("{}")