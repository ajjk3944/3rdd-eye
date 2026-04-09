package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb0 implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w71 f13858b;

    public /* synthetic */ mb0(w71 w71Var, int i4) {
        this.f13857a = i4;
        this.f13858b = w71Var;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) throws qj0 {
        qz qzVar = (qz) obj;
        switch (this.f13857a) {
            case 0:
                if (qzVar != null) {
                    return this.f13858b;
                }
                throw new qj0(1, "Retrieve Web View from image ad response failed.");
            default:
                if (qzVar == null || qzVar.z1() == null) {
                    throw new qj0(1, "Retrieve video view in html5 ad response failed.");
                }
                return this.f13858b;
        }
    }
}
