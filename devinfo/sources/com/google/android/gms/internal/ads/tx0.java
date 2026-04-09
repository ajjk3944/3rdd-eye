package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tx0 implements js1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16982b;

    public /* synthetic */ tx0(int i4, Object obj) {
        this.f16981a = i4;
        this.f16982b = obj;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final /* synthetic */ Object a() {
        switch (this.f16981a) {
            case 0:
                return new kh0(12, (d80) ((d80) this.f16982b).f10363a);
            case 1:
                return new ne0(18, (d80) ((d80) this.f16982b).f10363a);
            case 2:
                return new rg0(15, (d80) ((d80) this.f16982b).f10363a);
            default:
                aw awVar = (aw) this.f16982b;
                d80 d80Var = (d80) awVar.f9451b;
                aw awVar2 = (aw) awVar.f9454e;
                com.google.android.gms.internal.consent_sdk.d dVar = new com.google.android.gms.internal.consent_sdk.d();
                dVar.f19295a = d80Var;
                dVar.f19296b = awVar2;
                return dVar;
        }
    }
}
