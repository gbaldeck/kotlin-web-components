

import io.gbaldeck.kwc.HTMLAnchorElement
import io.gbaldeck.kwc.Static
import io.gbaldeck.kwc.confirm

//This is not working because the w3c spec to extend elements other than HTMLElement
//hasnt been implemented in Chrome yet
abstract class CustomAnchor: HTMLAnchorElement(){

  companion object: Static<CustomAnchor>()

  override fun connectedCallback() {
    console.log("anchor added to dom 12")
    this.addEventListener("click", {
      e: dynamic ->
      console.log("test")
      e.preventDefault();
      val result = confirm("Confirmed!")
    })
    console.log("no problemo")
  }
}