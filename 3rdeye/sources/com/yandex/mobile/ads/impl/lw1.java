package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class lw1 {

    /* renamed from: a, reason: collision with root package name */
    private final m11 f30114a;

    public /* synthetic */ lw1() {
        this(new m11());
    }

    public final String a() throws NumberFormatException {
        this.f30114a.getClass();
        ta2 ta2VarA = m11.a();
        return String.format(Locale.US, "%d.%d%d", Arrays.copyOf(new Object[]{Integer.valueOf(ta2VarA.a()), Integer.valueOf(ta2VarA.b()), Integer.valueOf(ta2VarA.c())}, 3));
    }

    public final String b() throws NumberFormatException {
        this.f30114a.getClass();
        ta2 ta2VarA = m11.a();
        return String.format(Locale.US, "%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(ta2VarA.a()), Integer.valueOf(ta2VarA.b()), Integer.valueOf(ta2VarA.c())}, 3));
    }

    public lw1(m11 mobileAdsVersionInfoProvider) {
        kotlin.jvm.internal.l.f(mobileAdsVersionInfoProvider, "mobileAdsVersionInfoProvider");
        this.f30114a = mobileAdsVersionInfoProvider;
    }
}
