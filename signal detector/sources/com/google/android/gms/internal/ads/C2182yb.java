package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2182yb implements BD, InterfaceC1864sh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0828Yg f17724a;

    public /* synthetic */ C2182yb(InterfaceC0828Yg interfaceC0828Yg) {
        this.f17724a = interfaceC0828Yg;
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo11d(Object obj) {
        String str = (String) obj;
        InterfaceC0828Yg interfaceC0828Yg = this.f17724a;
        new t2.x(interfaceC0828Yg.getContext(), interfaceC0828Yg.r().f23784a, str, interfaceC0828Yg.J() != null ? interfaceC0828Yg.J().f10801x0 : null).k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1864sh
    public /* synthetic */ void l(String str, int i, String str2, boolean z6) {
        InterfaceC0828Yg interfaceC0828Yg = this.f17724a;
        interfaceC0828Yg.e1();
        interfaceC0828Yg.l0().O();
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        p2.j.f22785C.f22795h.f("DefaultGmsgHandlers.attributionReportingManager", th);
    }
}
