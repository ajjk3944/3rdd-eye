package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class V5 extends A {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C5 f36240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V5(C5 c52, InterfaceC4821c4 interfaceC4821c4) {
        super(interfaceC4821c4);
        this.f36240e = c52;
    }

    @Override // com.google.android.gms.measurement.internal.A
    public final void d() {
        this.f36240e.zzj().H().a("Tasks have been queued for a long time");
    }
}
