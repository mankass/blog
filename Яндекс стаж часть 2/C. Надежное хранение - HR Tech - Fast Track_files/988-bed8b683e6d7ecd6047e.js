(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[988],{52390:function(e,t,n){"use strict";n.d(t,{R:function(){return o},S:function(){return r}});var o={BACKSPACE:8,TAB:9,ENTER:13,CAPS_LOCK:20,ESC:27,SPACE:32,PAGE_UP:33,PAGE_DOWN:34,END:35,HOME:36,LEFT:37,UP:38,RIGHT:39,DOWN:40,INSERT:45,DELETE:46};function r(e,t){return t.some((function(t){return o[t]===e||t===e}))}},94866:function(e,t,n){"use strict";n.d(t,{l:function(){return r},Q:function(){return i}});var o=n(89731),r=function(e){for(var t=[],n=1;n<arguments.length;n++)t[n-1]=arguments[n];return(0,o.N)()&&requestAnimationFrame((function(){t.forEach((function(t){void 0!==e&&void 0!==t&&("function"===typeof t?t(e.current):t.current=e.current)}))})),e};function i(){for(var e=[],t=0;t<arguments.length;t++)e[t]=arguments[t];return function(t){e.forEach((function(e){"function"===typeof e?e(t):null!==e&&void 0!==e&&(e.current=t)}))}}},55997:function(e,t,n){"use strict";var o=this&&this.__importDefault||function(e){return e&&e.__esModule?e:{default:e}};Object.defineProperty(t,"__esModule",{value:!0}),t.getInvitePageUrl=t.invitePageUrlTemplate=t.getProblemPageUrl=t.problemPageUrlTemplate=t.getStatisticsPageUrl=t.statisticsPageUrlTemplate=t.getFinishPageUrl=t.finishPageUrlTemplate=t.getStartPageUrl=t.startPageUrlTemplate=void 0;var r=o(n(80129));t.startPageUrlTemplate="/[contestId]/start";t.getStartPageUrl=function(e){return"/".concat(e,"/start")},t.finishPageUrlTemplate="/[contestId]/finish";t.getFinishPageUrl=function(e){return"/".concat(e,"/finish")},t.statisticsPageUrlTemplate="/[contestId]/statistics";t.getStatisticsPageUrl=function(e){return"/".concat(e,"/statistics")},t.problemPageUrlTemplate="/[contestId]/problem";t.getProblemPageUrl=function(e,t){return"/".concat(e,"/problem?id=").concat(t)},t.invitePageUrlTemplate="/enter/invite";t.getInvitePageUrl=function(e){var t=r.default.stringify(e);return"/enter/invite?".concat(t)}},83363:function(e,t,n){"use strict";n.d(t,{zx:function(){return j},iF:function(){return N},XF:function(){return S}});var o,r=n(26265),i=n(85893),s=n(87756),c=n(67294),a=n(87066),u=n(24624),p=n(66581),f=n(94866),l=n(52390),d=(n(97894),function(e){var t=e.side,n=e.provider,o=(0,u._T)(e,["side","provider"]);return n(m("Icon",{side:t},[o.className]))}),v=(n(60529),function(e){var t=e.children,n=e.className,o=(0,u._T)(e,["children","className"]);return c.createElement("span",(0,u.pi)({},o,{className:m("Text",null,[n])}),t)}),m=(n(86471),(0,p.cn)("Button2")),h={autoComplete:"off",pressKeys:[l.R.SPACE,l.R.ENTER],prvntKeys:[],as:"button",type:"button"},y=((o=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.state={pressed:!1},t.internalInnerRef=(0,c.createRef)(),t.onKeyDown=function(e){(0,l.S)(e.keyCode,t.props.pressKeys)&&(t.setState({pressed:!0}),(0,l.S)(e.keyCode,t.props.prvntKeys)&&e.preventDefault()),void 0!==t.props.onKeyDown&&t.props.onKeyDown(e)},t.onKeyUp=function(e){(0,l.S)(e.keyCode,t.props.prvntKeys)&&e.preventDefault(),(0,l.S)(e.keyCode,t.props.pressKeys)&&t.setState({pressed:!1}),void 0!==t.props.onKeyUp&&t.props.onKeyUp(e)},t.onClick=function(e){null!==t.internalInnerRef.current&&t.internalInnerRef.current.focus(),void 0!==t.props.onClick&&t.props.onClick(e)},t.onMouseDown=function(e){navigator.userAgent.match(/safari/i)&&e.preventDefault(),t.setState({pressed:!0}),void 0!==t.props.onMouseDown&&t.props.onMouseDown(e)},t.onMouseUp=function(e){t.setState({pressed:!1}),void 0!==t.props.onMouseUp&&t.props.onMouseUp(e)},t.onMouseLeave=function(e){t.setState({pressed:!1}),void 0!==t.props.onMouseLeave&&t.props.onMouseLeave(e)},t.onBlur=function(e){t.setState({pressed:!1}),void 0!==t.props.onBlur&&t.props.onBlur(e)},t}return(0,u.ZT)(t,e),t.prototype.render=function(){var e=this.props,t=e.addonAfter,n=e.addonBefore,o=e.autoComplete,r=e.checked,i=e.children,s=e.icon,a=e.iconLeft,p=e.iconRight,l=e.progress,h=e.disabled,y=e.as,g=e.type,b=e.className,P=e.innerRef,w=e.controlRef,O=e.title,U=e.role,E=(e.pressKeys,e.prvntKeys,e.view,e.theme,e.baseline,e.pin,e.width,(0,u._T)(e,["addonAfter","addonBefore","autoComplete","checked","children","icon","iconLeft","iconRight","progress","disabled","as","type","className","innerRef","controlRef","title","role","pressKeys","prvntKeys","view","theme","baseline","pin","width"])),C=this.state.pressed,D=y;E["string"===typeof y?"ref":"innerRef"]=(0,f.Q)(this.internalInnerRef,P,w);var M=a||s,S=Boolean(i)&&!0!==i||0===i;return c.createElement(D,(0,u.pi)({},E,{type:g,disabled:Boolean(l||h),className:m({checked:r,progress:l,pressed:C},[b]),onKeyDown:this.onKeyDown,onKeyUp:this.onKeyUp,onClick:this.onClick,onMouseDown:this.onMouseDown,onMouseUp:this.onMouseUp,onMouseLeave:this.onMouseLeave,onBlur:this.onBlur,"aria-pressed":r,"aria-disabled":h,autoComplete:o,title:O,role:U,"aria-busy":l}),n,M&&c.createElement(d,{provider:M,side:S&&a?"left":void 0}),p&&c.createElement(d,{provider:p,side:S?"right":void 0}),S&&c.createElement(v,null,i),t)},t}(c.PureComponent)).displayName=m(),o.defaultProps=h,o),g=(n(78284),(0,a.withBemMod)(m(),{view:"action"})),b=(n(85888),n(24036),(0,a.withBemMod)(m(),{view:"default"})),P=(n(64542),n(78738),(0,a.withBemMod)(m(),{view:"clear"})),w=(n(89133),n(41855),(0,a.withBemMod)(m(),{view:"pseudo"})),O=(n(37543),n(57874),(0,a.withBemMod)(m(),{width:"max"})),U=(n(9166),(0,a.withBemMod)(m(),{size:"s"})),E=(n(9827),(0,a.withBemMod)(m(),{size:"m"})),C=(n(25667),(0,a.withBemMod)(m(),{size:"l"}));n(92014),n(79101);function D(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var o=Object.getOwnPropertySymbols(e);t&&(o=o.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,o)}return n}function M(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?D(Object(n),!0).forEach((function(t){(0,r.Z)(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):D(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}var S=(0,s.compose)((0,s.composeU)(g,b,P,w),O,(0,s.composeU)(U,E,C))(y),j=(0,c.forwardRef)((function(e,t){return(0,i.jsx)(S,M(M({innerRef:t||void 0},e),{},{view:e.view}))})),N=(0,c.forwardRef)((function(e,t){return(0,i.jsx)(S,M(M({innerRef:t||void 0},e),{},{view:e.view,as:"a"}))}))},88887:function(e,t,n){"use strict";n.d(t,{NotificationsContext:function(){return i},useNotificationContextValue:function(){return f}});var o=n(67294),r={notifications:[],addNotification:function(){},removeNotification:function(){}},i=(0,o.createContext)(r),s=n(26265),c=n(59999);function a(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var o=Object.getOwnPropertySymbols(e);t&&(o=o.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,o)}return n}function u(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?a(Object(n),!0).forEach((function(t){(0,s.Z)(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):a(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}var p=0;function f(){var e=(0,o.useState)([]),t=e[0],n=e[1];return{notifications:t,addNotification:(0,o.useCallback)((function(e){n((function(t){return[].concat((0,c.Z)(t),[u(u({autoclosable:!0,autocloseTimeout:5e3},e),{},{id:++p})])}))}),[n]),removeNotification:(0,o.useCallback)((function(e){return n((function(t){return t.filter((function(t){return t.id!==e}))}))}),[n])}}},86471:function(){},79101:function(){},97894:function(){},60529:function(){},25667:function(){},9827:function(){},9166:function(){},78284:function(){},85888:function(){},78738:function(){},89133:function(){},24036:function(){},64542:function(){},41855:function(){},37543:function(){},57874:function(){}}]);