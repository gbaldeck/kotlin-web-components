package io.gbaldeck.kwc

import org.w3c.dom.Element

abstract class Static<K: Element>


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