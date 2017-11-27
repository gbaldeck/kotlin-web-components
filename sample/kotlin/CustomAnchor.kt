

import io.gbaldeck.kwc.Static
import io.gbaldeck.kwc.confirm
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.HTMLElement

abstract class CustomAnchor: HTMLAnchorElement(){

  companion object: Static<CustomAnchor>()

  @JsName("connectedCallback")
  fun connectedCallback() {
    console.log("anchor added to dom")
    this.asDynamic().addEventListener("click", {
      e: dynamic ->
      console.log("test")
      e.preventDefault();
      val result = confirm("Confirmed!")
    } as (dynamic) -> Unit)
    console.log("no problemo")
  }
}