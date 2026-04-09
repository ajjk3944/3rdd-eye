package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class w30 implements r70 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17854b;

    public /* synthetic */ w30(int i4, Object obj) {
        this.f17853a = i4;
        this.f17854b = obj;
    }

    @Override // com.google.android.gms.internal.ads.r70
    public final /* synthetic */ void a() {
        xa.i iVarK0;
        switch (this.f17853a) {
            case 0:
                ((k70) this.f17854b).h();
                break;
            default:
                qz qzVar = (qz) this.f17854b;
                if (qzVar != null && (iVarK0 = qzVar.k0()) != null) {
                    iVarK0.m();
                    break;
                }
                break;
        }
    }
}
