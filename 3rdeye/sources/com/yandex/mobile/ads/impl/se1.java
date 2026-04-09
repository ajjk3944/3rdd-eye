package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.os.Build;

/* loaded from: classes3.dex */
public final class se1 {
    public static pe1 a(Activity activity, C4229x0 c4229x0) {
        Object objA;
        kotlin.jvm.internal.l.f(activity, "activity");
        try {
            objA = Build.VERSION.SDK_INT >= 33 ? new re1(activity, c4229x0) : new qe1();
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        Throwable thA = b9.m.a(objA);
        if (thA != null) {
            fp0.f(thA);
            objA = new qe1();
        }
        return (pe1) objA;
    }
}
