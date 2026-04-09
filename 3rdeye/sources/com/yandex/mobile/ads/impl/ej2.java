package com.yandex.mobile.ads.impl;

import g0.C4356c;
import java.util.Arrays;
import java.util.Locale;
import y9.C5828j;

/* loaded from: classes3.dex */
public final class ej2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26879a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f26880b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f26881c = 0;

    static {
        Locale locale = Locale.US;
        f26879a = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%3$s) { \n      return %4$s.%1$s(%2$s, %3$s); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"onAdRender", "document.querySelector('#rtb').offsetHeight", "testTag", "AdPerformActionsJSI"}, 4));
        f26880b = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function() { \n      return %2$s.%1$s(); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"getBannerInfo", "AdPerformActionsJSI"}, 2));
    }

    public static String a(int i, int i10) {
        return C5828j.L("\n\n        <style>ytag.container { width:" + i + "px; height:" + i10 + "px; }</style>\n\n        ");
    }

    public static String b() {
        return f26879a;
    }

    public static String a(int i) {
        return C4356c.i(i, "<body style='width:", "px;'>");
    }

    public static String a() {
        return f26880b;
    }
}
