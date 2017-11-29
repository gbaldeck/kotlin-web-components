import io.gbaldeck.kwc.HTMLElement
import io.gbaldeck.kwc.Static
import io.gbaldeck.kwc.jsObject

abstract class MyElement: HTMLElement() {

  companion object: Static<MyElement>() {
    override val observedAttributes: Array<String>?
      get() = arrayOf("demo")
  }


  override fun connectedCallback() {
    console.log("My custom element was added to the dom!")
    val config = jsObject()
    config.mode = "open"
    this.attachShadow(config)
    this.shadowRoot!!.innerHTML = """
      <style>
        p {
          color: blue;
        }
      </style>
      <p>Paragraph text within the Shadow DOM!</p>
    """.trimIndent()
  }

  override fun attributeChangedCallback(name: String, oldValue: dynamic, newValue: dynamic) {
    console.log("Attribute changed!", name, oldValue, newValue)
  }

  override fun disconnectedCallback() {
    console.log("my element was removed from the dom!")
  }
}