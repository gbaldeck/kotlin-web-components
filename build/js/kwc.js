if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'kwc'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'kwc'.");
}
var kwc = function (_, Kotlin) {
  'use strict';
  var $$importsForInline$$ = _.$$importsForInline$$ || (_.$$importsForInline$$ = {});
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  var Unit = Kotlin.kotlin.Unit;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var defineInlineFunction = Kotlin.defineInlineFunction;
  var wrapFunction = Kotlin.wrapFunction;
  var throwCCE = Kotlin.throwCCE;
  CustomAnchor$Companion.prototype = Object.create(Static.prototype);
  CustomAnchor$Companion.prototype.constructor = CustomAnchor$Companion;
  CustomAnchor.prototype = Object.create(HTMLAnchorElement.prototype);
  CustomAnchor.prototype.constructor = CustomAnchor;
  MyElement$Companion.prototype = Object.create(Static.prototype);
  MyElement$Companion.prototype.constructor = MyElement$Companion;
  MyElement.prototype = Object.create(HTMLElement.prototype);
  MyElement.prototype.constructor = MyElement;
  function CustomAnchor() {
    CustomAnchor$Companion_getInstance();
    HTMLAnchorElement.call(this);
  }
  function CustomAnchor$Companion() {
    CustomAnchor$Companion_instance = this;
    Static.call(this);
  }
  CustomAnchor$Companion.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Companion',
    interfaces: [Static]
  };
  var CustomAnchor$Companion_instance = null;
  function CustomAnchor$Companion_getInstance() {
    if (CustomAnchor$Companion_instance === null) {
      new CustomAnchor$Companion();
    }
    return CustomAnchor$Companion_instance;
  }
  function CustomAnchor$connectedCallback$lambda(e) {
    console.log('test');
    e.preventDefault();
    var result = confirm('Confirmed!');
    return Unit;
  }
  CustomAnchor.prototype.connectedCallback = function () {
    console.log('anchor added to dom 12');
    this.addEventListener('click', CustomAnchor$connectedCallback$lambda);
    console.log('no problemo');
  };
  CustomAnchor.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'CustomAnchor',
    interfaces: []
  };
  function MyElement() {
    MyElement$Companion_getInstance();
    HTMLElement.call(this);
  }
  function MyElement$Companion() {
    MyElement$Companion_instance = this;
    Static.call(this);
  }
  Object.defineProperty(MyElement$Companion.prototype, 'observedAttributes', {
    get: function () {
      return ['demo'];
    }
  });
  MyElement$Companion.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Companion',
    interfaces: [Static]
  };
  var MyElement$Companion_instance = null;
  function MyElement$Companion_getInstance() {
    if (MyElement$Companion_instance === null) {
      new MyElement$Companion();
    }
    return MyElement$Companion_instance;
  }
  MyElement.prototype.connectedCallback = function () {
    console.log('My custom element was added to the dom!');
  };
  MyElement.prototype.attributeChangedCallback = function (name, oldValue, newValue) {
    console.log('Attribute changed!', name, oldValue, newValue);
  };
  MyElement.prototype.disconnectedCallback = function () {
    console.log('my element was removed from the dom!');
  };
  MyElement.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'MyElement',
    interfaces: []
  };
  var getKClass = Kotlin.getKClass;
  var get_js = Kotlin.kotlin.js.get_js_1yb8b7$;
  function main(array) {
    console.log('this was run');
    var elementName = 'test-element';
    var element = MyElement$Companion_getInstance();
    var options;
    options = undefined;
    __finalizeElement(elementName, get_js(getKClass(MyElement)), element, options);
    var anchorOptions = jsObject();
    anchorOptions.extends = 'a';
    var elementName_0 = 'custom-anchor';
    var element_0 = CustomAnchor$Companion_getInstance();
    __finalizeElement(elementName_0, get_js(getKClass(CustomAnchor)), element_0, anchorOptions);
  }
  function Static() {
    this.observedAttributes_ld06sp$_0 = null;
  }
  Object.defineProperty(Static.prototype, 'observedAttributes', {
    get: function () {
      return this.observedAttributes_ld06sp$_0;
    }
  });
  Static.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Static',
    interfaces: []
  };
  var defineElement = defineInlineFunction('kwc.io.gbaldeck.kwc.defineElement_n5713a$', wrapFunction(function () {
    var getKClass = Kotlin.getKClass;
    var get_js = Kotlin.kotlin.js.get_js_1yb8b7$;
    var __finalizeElement = _.io.gbaldeck.kwc.__finalizeElement_cazn0n$;
    return function (T_0, isT, elementName, element, options) {
      if (options === void 0)
        options = undefined;
      __finalizeElement(elementName, get_js(getKClass(T_0)), element, options);
    };
  }));
  function __finalizeElement(elementName, tClass, source, options) {
    var tmp$, tmp$_0, tmp$_1, tmp$_2;
    var c = tClass;
    var ownNames = Kotlin.isArray(tmp$ = Object.getOwnPropertyNames(source)) ? tmp$ : throwCCE();
    var protoNames = Kotlin.isArray(tmp$_0 = Object.getOwnPropertyNames(source.constructor.prototype)) ? tmp$_0 : throwCCE();
    tmp$_1 = ownNames.concat(protoNames);
    for (tmp$_2 = 0; tmp$_2 !== tmp$_1.length; ++tmp$_2) {
      var name = tmp$_1[tmp$_2];
      c[name] = source[name];
    }
    window.customElements.define(elementName, c, options);
  }
  function jsObject() {
    return {};
  }
  Object.defineProperty(CustomAnchor, 'Companion', {
    get: CustomAnchor$Companion_getInstance
  });
  _.CustomAnchor = CustomAnchor;
  Object.defineProperty(MyElement, 'Companion', {
    get: MyElement$Companion_getInstance
  });
  _.MyElement = MyElement;
  $$importsForInline$$.kwc = _;
  _.main_kand9s$ = main;
  var package$io = _.io || (_.io = {});
  var package$gbaldeck = package$io.gbaldeck || (package$io.gbaldeck = {});
  var package$kwc = package$gbaldeck.kwc || (package$gbaldeck.kwc = {});
  package$kwc.Static = Static;
  package$kwc.__finalizeElement_cazn0n$ = __finalizeElement;
  package$kwc.jsObject = jsObject;
  main([]);
  Kotlin.defineModule('kwc', _);
  return _;
}(typeof kwc === 'undefined' ? {} : kwc, kotlin);
