package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Yx implements InterfaceC2069wN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12737b;

    public /* synthetic */ Yx(int i, Object obj) {
        this.f12736a = i;
        this.f12737b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final /* synthetic */ Object c() {
        switch (this.f12736a) {
            case 0:
                return new C0909ay((K4.e) ((K4.e) this.f12737b).f2237a);
            case 1:
                return new Zx((K4.e) ((K4.e) this.f12737b).f2237a);
            case 2:
                return new C1018cy((K4.e) ((K4.e) this.f12737b).f2237a);
            default:
                C1431kf c1431kf = (C1431kf) this.f12737b;
                return new C1072dy((K4.e) c1431kf.f15173b, (C1431kf) c1431kf.f15176e);
        }
    }
}
