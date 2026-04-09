package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class M1 implements InterfaceC4696ik {

    /* renamed from: b, reason: collision with root package name */
    public static final L1 f39818b = new L1();

    /* renamed from: c, reason: collision with root package name */
    public static final int f39819c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4858p0 f39820a;

    public M1(InterfaceC4858p0 interfaceC4858p0) {
        this.f39820a = interfaceC4858p0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4696ik
    public final void reportData(int i, Bundle bundle) {
        ((J1) this.f39820a).a(bundle);
    }
}
