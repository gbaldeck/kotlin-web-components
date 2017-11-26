package io.gbaldeck.kwc

import org.w3c.dom.Element

abstract class CustomElement<out T: Element> {

  abstract class Static<K: CustomElement<*>>{
    open val observedAttributes: Array<String>? = null
  }

  init{
    js("console.log(this)")
    js("console.log(this.constructor)")
    js("console.log(this.constructor.kwcBaseElement)")
    js("this.constructor.kwcBaseElement.call(this)") //static property set in functions
  }

//  val self = this.asDynamic() as T

  @JsName("connectedCallback")
  open fun connectedCallback(){}

  @JsName("attributeChangedCallback")
  open fun attributeChangedCallback(name: String, oldValue: dynamic, newValue: dynamic){}

  @JsName("disconnectedCallback")
  open fun disconnectedCallback(){}
}


//var CustomElement.observedAttributes: Array<String>?
//  set(attrs){
//    val tmp123 = this::class.js.asDynamic()
//    tmp123.__observedAttrBackingField = attrs
//    if(!tmp123.observedAttributesInitialized) {
//      console.log("Got here once")
//      js("Object.defineProperty(tmp123, 'observedAttributes', {\n" +
//        "    get: function () {\n" +
//        "      return tmp123.__observedAttrBackingField;\n" +
//        "    },\n" +
//        "  });")
//    }
//    console.log("IT HAS BEEN RUN", tmp123)
//    tmp123.observedAttributesInitialized = true
//  }
//  get() = this::class.js.asDynamic().observedAttributes as Array<String>