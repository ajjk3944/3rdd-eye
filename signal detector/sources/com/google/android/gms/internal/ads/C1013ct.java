package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ct, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013ct implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13692a;

    /* renamed from: b, reason: collision with root package name */
    public final L2.w f13693b;

    public /* synthetic */ C1013ct(L2.w wVar, int i) {
        this.f13692a = i;
        this.f13693b = wVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f13692a) {
            case 0:
                String str = ((C1807re) this.f13693b.f2570c).f16579d;
                Cr.v(str);
                return str;
            case 1:
                return Integer.valueOf(this.f13693b.f2569b);
            case 2:
                return Boolean.valueOf(((C1807re) this.f13693b.f2570c).f16586l);
            case 3:
                return Boolean.valueOf(((C1807re) this.f13693b.f2570c).f16585k);
            case 4:
                String str2 = ((C1807re) this.f13693b.f2570c).f16583h;
                Cr.v(str2);
                return str2;
            case 5:
                return Integer.valueOf(this.f13693b.x());
            default:
                return Integer.valueOf(((C1807re) this.f13693b.f2570c).f16575C);
        }
    }
}
