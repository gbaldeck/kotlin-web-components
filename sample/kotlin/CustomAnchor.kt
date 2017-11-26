
import io.gbaldeck.kwc.CustomElement
import io.gbaldeck.kwc.confirm
import org.w3c.dom.HTMLAnchorElement

class CustomAnchor: CustomElement<HTMLAnchorElement>(){

  companion object: Static<CustomAnchor>()

  override fun connectedCallback() {
    this.asDynamic().addEventListener("click", {
      e: dynamic ->
      e.preventDefault();
      val result = confirm("Confirmed!")
    } as Function<Unit>)
    console.log("no problemo")
  }
}