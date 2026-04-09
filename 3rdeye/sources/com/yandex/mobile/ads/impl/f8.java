package com.yandex.mobile.ads.impl;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class f8 implements InterfaceC4086c3 {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f27239b;

    /* renamed from: a, reason: collision with root package name */
    private final ao1 f27240a = bo1.a(null);

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(f8.class, "adEventsReceiver", "getAdEventsReceiver()Lcom/monetization/ads/base/AdEventsReceiver;");
        kotlin.jvm.internal.x.f43661a.getClass();
        f27239b = new w9.i[]{nVar};
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4086c3
    public final void a(int i, Bundle bundle) {
        InterfaceC4086c3 interfaceC4086c3 = (InterfaceC4086c3) this.f27240a.getValue(this, f27239b[0]);
        if (interfaceC4086c3 != null) {
            interfaceC4086c3.a(i, bundle);
            fp0.d(Integer.valueOf(i));
        }
    }

    public final void a(InterfaceC4086c3 interfaceC4086c3) {
        this.f27240a.setValue(this, f27239b[0], interfaceC4086c3);
    }
}
