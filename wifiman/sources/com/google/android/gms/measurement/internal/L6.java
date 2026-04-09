package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class L6 extends A {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ M6 f35998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L6(M6 m62, InterfaceC4821c4 interfaceC4821c4) {
        super(interfaceC4821c4);
        this.f35998e = m62;
    }

    @Override // com.google.android.gms.measurement.internal.A
    public final void d() {
        this.f35998e.v();
        this.f35998e.zzj().G().a("Starting upload from DelayedRunnable");
        this.f35998e.f36173b.P0();
    }
}
