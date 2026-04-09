package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class n8 {
    public static in2 a(o8 o8Var, p8 p8Var) {
        if (oe1.a()) {
            return new in2(o8Var, p8Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void a();

    public abstract void a(View view);

    public abstract void a(View view, oc0 oc0Var, String str);

    public abstract void b();
}
