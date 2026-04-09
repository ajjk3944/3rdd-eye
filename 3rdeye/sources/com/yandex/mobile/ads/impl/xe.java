package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class xe {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile li0 f35261a;

    public static final li0 a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        if (f35261a == null) {
            synchronized (li0.f30002h) {
                try {
                    if (f35261a == null) {
                        Context applicationContext = context.getApplicationContext();
                        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
                        f35261a = new li0(applicationContext, me.a(), new ye(), new we(new ve(), me.a()), new bu0(es0.a(applicationContext, "YadPreferenceFile")));
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        li0 li0Var = f35261a;
        kotlin.jvm.internal.l.c(li0Var);
        return li0Var;
    }
}
