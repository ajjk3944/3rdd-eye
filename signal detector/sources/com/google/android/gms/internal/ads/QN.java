package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class QN implements InterfaceC0801Wn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1747qO f10612b;

    public /* synthetic */ QN(C1747qO c1747qO, int i) {
        this.f10611a = 2;
        this.f10612b = c1747qO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public final /* synthetic */ void mo4b(Object obj) {
        int i = this.f10611a;
        C1747qO c1747qO = this.f10612b;
        D6 d6 = (D6) obj;
        switch (i) {
            case 0:
                int i3 = UN.f11644s0;
                boolean z6 = c1747qO.f16358g;
                d6.d();
                break;
            case 1:
                int i6 = UN.f11644s0;
                int i7 = c1747qO.f16364n;
                d6.k();
                break;
            default:
                int i8 = UN.f11644s0;
                AbstractC1353j8 abstractC1353j8 = c1747qO.f16352a;
                d6.c();
                break;
        }
    }

    public /* synthetic */ QN(C1747qO c1747qO, int i, byte b5) {
        this.f10611a = i;
        this.f10612b = c1747qO;
    }
}
