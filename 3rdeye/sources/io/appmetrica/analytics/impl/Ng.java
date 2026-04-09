package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class Ng implements InterfaceC4581e8 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4966t5 f39904a;

    public Ng(InterfaceC4966t5 interfaceC4966t5) {
        this.f39904a = interfaceC4966t5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4581e8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Mg a(Context context, C4759l5 c4759l5, K4 k42) {
        return new Mg(context, c4759l5, k42, this.f39904a, new C4785m5(), El.a());
    }

    public final InterfaceC4966t5 a() {
        return this.f39904a;
    }
}
