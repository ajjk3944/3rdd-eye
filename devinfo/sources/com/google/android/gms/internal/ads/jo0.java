package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jo0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12804a;

    /* renamed from: b, reason: collision with root package name */
    public final t7.m f12805b;

    public /* synthetic */ jo0(t7.m mVar, int i4) {
        this.f12804a = i4;
        this.f12805b = mVar;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f12804a) {
            case 0:
                String str = ((iu) this.f12805b.f34474c).f12476d;
                al0.z(str);
                return str;
            case 1:
                return Integer.valueOf(this.f12805b.f34473b);
            case 2:
                return Boolean.valueOf(((iu) this.f12805b.f34474c).f12482l);
            case 3:
                return Boolean.valueOf(((iu) this.f12805b.f34474c).f12481k);
            case 4:
                String str2 = ((iu) this.f12805b.f34474c).f12479h;
                al0.z(str2);
                return str2;
            case 5:
                return Integer.valueOf(this.f12805b.G());
            default:
                return Integer.valueOf(((iu) this.f12805b.f34474c).f12485o);
        }
    }
}
