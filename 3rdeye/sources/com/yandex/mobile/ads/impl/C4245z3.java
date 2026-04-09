package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4245z3 {

    /* renamed from: a, reason: collision with root package name */
    private final at0 f36155a;

    /* renamed from: b, reason: collision with root package name */
    private final fi f36156b;

    public /* synthetic */ C4245z3() {
        this(new at0(), new fi());
    }

    public final String a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f36155a.getClass();
        String strA = at0.a(context);
        if (strA == null) {
            strA = this.f36156b.a(context);
        }
        return a(strA);
    }

    public C4245z3(at0 manifestAnalyzer, fi availableHostSelector) {
        kotlin.jvm.internal.l.f(manifestAnalyzer, "manifestAnalyzer");
        kotlin.jvm.internal.l.f(availableHostSelector, "availableHostSelector");
        this.f36155a = manifestAnalyzer;
        this.f36156b = availableHostSelector;
    }

    private static String a(String str) {
        return androidx.work.s.d("https://", str);
    }
}
