package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.aq1;
import com.yandex.mobile.ads.impl.ew1;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class j21 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f28930a;

    public interface a {
        void a(String str);
    }

    static {
        Pattern patternCompile = Pattern.compile("(?m)^\\s+");
        kotlin.jvm.internal.l.e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher("!function(e){function t(r){if(n[r])return n[r].exports;var o=n[r]={exports:{},id:r,loaded:!1};return e[r].call(o.exports,o,o.exports,t),o.loaded=!0,o.exports}var n={};return t.m=e,t.c=n,t.p=\"\",t(0)}([function(e,t,n){var r,o;r=[n,t,n(1)],o=function(e,t,n){\"use strict\";Object.defineProperty(t,\"__esModule\",{value:!0});var r=window;r.mraid=n.mraid,r.mraidbridge=n.mraidbridge}.apply(t,r),!(void 0!==o&&(e.exports=o))},function(e,t,n){var r,o;r=[n,t,n(2)],o=function(e,t,n){\"use strict\";function r(){return O}function o(){return b}function i(){return I}function s(e,t){e&&t||V(_.ERROR,\"Both event and listener are required.\",\"addEventListener\"),\"undefined\"==typeof w[e]&&(w[e]=new n.default(e)),w[e].add(t)}function u(e,t){if(!e)return void V(_.ERROR,\"Event is required.\",\"removeEventListener\");if(t){var n=!1;if(w[e]&&(n=w[e].remove(t)),!n)return void V(_.ERROR,\"Listener not currently registered for event.\",\"removeEventListener\")}else!t&&w[e]&&w[e].removeAll();w[e]&&0===w[e].count&&(w[e]=null,delete w[e])}function a(e){for(var t in e)if(e.hasOwnProperty(t)){var n=U[t];n(e[t])}}function d(e){I=e,V(\"stateChange\",I)}function l(e){N=e}function c(){return{x:N.x,y:N.y,width:N.width,height:N.height}}function f(e){P=e}function v(){return{x:P.x,y:P.y,width:P.width,height:P.height}}function p(){L=!0,V(\"ready\")}function E(e,t){V(_.ERROR,e,t)}function h(e){T=Boolean(e),m([\"usecustomclose\",\"shouldUseCustomClose\",e?\"true\":\"false\"])}function R(){return T}function g(){return 0===G.length?void(H=!1):void(x.location=G.pop())}function y(e){e?m([\"open\",\"url\",e]):V(_.ERROR,\"`url` parameter is required\",\"open\")}function m(e){var t=e.shift();if(!L)return console.log(\"rejecting \"+t+\" because mraid is not ready\"),void E(\"mraid is not ready\",t);for(var n=\"mraid://\"+t,r=!0,o=0;o<e.length;o+=2){var i=void 0,s=void 0;i=e[o],s=e[o+1],null!==s&&(r?(n+=\"?\",r=!1):n+=\"&\",n+=encodeURIComponent(i)+\"=\"+encodeURIComponent(s))}H?G.push(n):(x.location=n,H=!0)}function C(e){return S[e]}function A(){I===D.HIDDEN?V(_.ERROR,\"Ad cannot be closed when it is already hidden.\",\"close\"):m([\"close\"])}Object.defineProperty(t,\"__esModule\",{value:!0});var x=window,O=\"2.0\",b=!1,w={},P={},N={},D={LOADING:\"loading\",DEFAULT:\"default\",EXPANDED:\"expanded\",RESIZED:\"resized\",HIDDEN:\"hidden\"},_={READY:\"ready\",ERROR:\"error\",STATE_CHANGE:\"stateChange\",VIEWABLECHANGE:\"viewableChange\",SIZECHANGE:\"sizeChange\",EXPOSURECHANGE:\"exposureChange\"},S={sms:!1,tel:!1,calendar:!1,storePicture:!1,inlineVideo:!1},I=\"loading\",L=!1,H=!1,G=[],T=!1,V=function(){for(var e=[],t=0;t<arguments.length;t++)e[t]=arguments[t];var n=e.shift();w[n]&&(r=w[n]).broadcast.apply(r,e);var r},U={state:function(e){I=e,V(_.STATE_CHANGE,I)},viewable:function(e){b=e,V(_.VIEWABLECHANGE,b)},supports:function(e){S=e},exposure:function(e){var t=e.exposedPercentage,n=e.visibleRectangle,r=e.occlusionRectangles;V(_.EXPOSURECHANGE,t,n,r)}};t.mraidbridge={setState:d,setCurrentPosition:f,setDefaultPosition:l,notifyReadyEvent:p,notifyErrorEvent:E,executeNativeCall:m,fireChangeEvent:a,nativeCallComplete:g},t.mraid={EVENTS:_,STATES:D,getVersion:r,getCurrentPosition:v,getDefaultPosition:c,isViewable:o,getState:i,addEventListener:s,removeEventListener:u,supports:C,close:A,useCustomClose:h,open:y,__PRIV__:{usesCustomClose:R}}}.apply(t,r),!(void 0!==o&&(e.exports=o))},function(e,t,n){var r,o;r=[n,t],o=function(e,t){\"use strict\";Object.defineProperty(t,\"__esModule\",{value:!0});var n=function(){function e(e){this.event=e,this.count=0,this.listeners=[]}return e.prototype.add=function(e){var t=this.listeners;t.push(e),this.count++},e.prototype.remove=function(e){var t=this.listeners,n=t.indexOf(e);return n!==-1&&(t.splice(n,1),this.count--,!0)},e.prototype.removeAll=function(){this.listeners;this.listeners=[],this.count=0},e.prototype.broadcast=function(){for(var e=[],t=0;t<arguments.length;t++)e[t]=arguments[t];for(var n=this.listeners,r=0,o=n;r<o.length;r++){var i=o[r];i.apply(void 0,e)}},e}();t.default=n}.apply(t,r),!(void 0!==o&&(e.exports=o))}]);").replaceAll("");
        kotlin.jvm.internal.l.e(strReplaceAll, "replaceAll(...)");
        Pattern patternCompile2 = Pattern.compile("(?m)^//.*(?=\\n)");
        kotlin.jvm.internal.l.e(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
        kotlin.jvm.internal.l.e(strReplaceAll2, "replaceAll(...)");
        f28930a = strReplaceAll2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a onLoadListener, String str) {
        kotlin.jvm.internal.l.f(onLoadListener, "$onLoadListener");
        kotlin.jvm.internal.l.c(str);
        onLoadListener.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a onLoadListener, fi2 fi2Var) {
        kotlin.jvm.internal.l.f(onLoadListener, "$onLoadListener");
        onLoadListener.a(f28930a);
        fp0.f(new Object[0]);
    }

    public static void a(Context context, String requestTag, a onLoadListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(requestTag, "requestTag");
        kotlin.jvm.internal.l.f(onLoadListener, "onLoadListener");
        du1 du1VarA = ew1.a.a().a(context);
        String strF = du1VarA != null ? du1VarA.F() : null;
        if (strF != null && strF.length() > 0) {
            s22 request = a(strF, requestTag, onLoadListener);
            synchronized (aq1.a.a()) {
                kotlin.jvm.internal.l.f(request, "request");
                xc1.a(context).a(request);
            }
            return;
        }
        onLoadListener.a(f28930a);
        fp0.f(new Object[0]);
    }

    private static s22 a(String str, String str2, a aVar) {
        s22 s22Var = new s22(str, new R1(aVar, 4), new K0(aVar, 6));
        s22Var.b((Object) str2);
        return s22Var;
    }
}
