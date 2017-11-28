import io.gbaldeck.kwc.HTMLElement
import io.gbaldeck.kwc.Static

abstract class MyElement: HTMLElement() {

  companion object: Static<MyElement>() {
    override val observedAttributes: Array<String>?
      get() = arrayOf("demo")
  }


  override fun connectedCallback() {
    console.log("My custom element was added to the dom!")
  }

  override fun attributeChangedCallback(name: String, oldValue: dynamic, newValue: dynamic) {
    console.log("Attribute changed!", name, oldValue, newValue)
  }

  override fun disconnectedCallback() {
    console.log("my element was removed from the dom!")
  }
}