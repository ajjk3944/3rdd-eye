package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class Rj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f40070a;

    public Rj(Map map) {
        this.f40070a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.reportAnr(this.f40070a);
    }
}
