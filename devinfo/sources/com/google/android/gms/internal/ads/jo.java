package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jo implements p81, n00 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qz f12803a;

    public /* synthetic */ jo(qz qzVar) {
        this.f12803a = qzVar;
    }

    @Override // com.google.android.gms.internal.ads.n00, com.google.android.gms.internal.ads.pm
    /* renamed from: b */
    public /* synthetic */ void mo169b() {
        this.f12803a.a0();
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo163h(Object obj) {
        String str = (String) obj;
        qz qzVar = this.f12803a;
        new ya.u(qzVar.getContext(), qzVar.J1().f38129a, str, qzVar.s() != null ? qzVar.s().f18117x0 : null).A();
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        ua.j.C.f35265h.f("DefaultGmsgHandlers.attributionReportingManager", th2);
    }
}
