package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class t72 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f33474a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f33475b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33476c = 0;

    private t72() {
    }

    public static void a(Context context, mp1 reporter) {
        du1 du1VarA;
        new l42();
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        if (f33474a) {
            return;
        }
        synchronized (f33475b) {
            try {
                if (!f33474a && (du1VarA = ew1.a.a().a(context)) != null && du1VarA.s()) {
                    Thread.setDefaultUncaughtExceptionHandler(new s72(reporter, Thread.getDefaultUncaughtExceptionHandler(), du1VarA));
                    f33474a = true;
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
