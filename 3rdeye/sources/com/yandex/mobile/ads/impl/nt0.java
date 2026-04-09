package com.yandex.mobile.ads.impl;

import c9.C2097r;

/* loaded from: classes3.dex */
public final class nt0 implements ui1 {

    /* renamed from: a, reason: collision with root package name */
    private final wl0 f30998a;

    /* renamed from: b, reason: collision with root package name */
    private final zs f30999b;

    public nt0(wl0 instreamAdPlayerController, zs instreamAdBreak) {
        kotlin.jvm.internal.l.f(instreamAdPlayerController, "instreamAdPlayerController");
        kotlin.jvm.internal.l.f(instreamAdBreak, "instreamAdBreak");
        this.f30998a = instreamAdPlayerController;
        this.f30999b = instreamAdBreak;
    }

    @Override // com.yandex.mobile.ads.impl.ui1
    public final float getVolume() {
        tn0 tn0Var = (tn0) C2097r.q0(this.f30999b.g());
        if (tn0Var != null) {
            return this.f30998a.c(tn0Var);
        }
        return 0.0f;
    }
}
