import io.gbaldeck.kwc.Static
import org.w3c.dom.HTMLElement

abstract class MyElement: HTMLElement() {

  companion object: Static<MyElement>() {
    val observedAttributes: Array<String>?
      get() = arrayOf("demo")
  }


  @JsName("connectedCallback")
  fun connectedCallback() {
    console.log("My custom element was added to the dom!")
  }

  @JsName("attributeChangedCallback")
  fun attributeChangedCallback(name: String, oldValue: dynamic, newValue: dynamic) {
    console.log("Attribute changed!", name, oldValue, newValue)
  }

  @JsName("disconnectedCallback")
  fun disconnectedCallback() {
    console.log("my element was removed from the dom!")
  }
}