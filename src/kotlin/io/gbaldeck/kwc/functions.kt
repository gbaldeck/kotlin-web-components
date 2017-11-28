package io.gbaldeck.kwc

inline fun <reified T: ElementReference> defineElement(elementName: String, element: Static<T>, options:dynamic = undefined){
  __finalizeElement(elementName, T::class.js, element, options)
}

fun __finalizeElement(elementName: String, tClass: JsClass<*>, source: Any, options: dynamic) {
  val c = tClass.asDynamic()
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