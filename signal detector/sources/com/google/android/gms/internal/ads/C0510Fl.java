package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510Fl implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8179a;

    /* renamed from: b, reason: collision with root package name */
    public final C0697Ql f8180b;

    public /* synthetic */ C0510Fl(C0697Ql c0697Ql, int i) {
        this.f8179a = i;
        this.f8180b = c0697Ql;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f8179a) {
            case 0:
                InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f8180b.f10692c;
                if (interfaceC0828Yg == null) {
                    return null;
                }
                return interfaceC0828Yg.t();
            case 1:
                InterfaceC0828Yg interfaceC0828Yg2 = (InterfaceC0828Yg) this.f8180b.f10692c;
                if (interfaceC0828Yg2 != null) {
                    return interfaceC0828Yg2.t();
                }
                return null;
            default:
                return (InterfaceC0828Yg) this.f8180b.f10692c;
        }
    }
}
