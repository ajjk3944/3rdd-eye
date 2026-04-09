package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vq implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17686a;

    /* renamed from: b, reason: collision with root package name */
    public final vd.b f17687b;

    public /* synthetic */ vq(int i4, vd.b bVar) {
        this.f17686a = i4;
        this.f17687b = bVar;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) {
        switch (this.f17686a) {
            case 0:
                return yo0.F(this.f17687b, new sq(1, this, obj), fx.g);
            default:
                return this.f17687b;
        }
    }
}
