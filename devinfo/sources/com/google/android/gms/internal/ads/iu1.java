package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class iu1 extends zx1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12486c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12487d;

    public iu1(uh uhVar, h5 h5Var) {
        super(uhVar);
        this.f12487d = h5Var;
    }

    @Override // com.google.android.gms.internal.ads.zx1, com.google.android.gms.internal.ads.uh
    public fh b(int i4, fh fhVar, long j) {
        switch (this.f12486c) {
            case 1:
                this.f19232b.b(i4, fhVar, j);
                h5 h5Var = (h5) this.f12487d;
                fhVar.f11165b = h5Var;
                o2 o2Var = h5Var.f11706b;
                return fhVar;
            default:
                return super.b(i4, fhVar, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zx1, com.google.android.gms.internal.ads.uh
    public tg d(int i4, tg tgVar, boolean z3) {
        switch (this.f12486c) {
            case 0:
                uh uhVar = this.f19232b;
                tg tgVarD = uhVar.d(i4, tgVar, z3);
                if (uhVar.b(tgVarD.f16811c, (fh) this.f12487d, 0L).b()) {
                    Object obj = tgVar.f16809a;
                    Object obj2 = tgVar.f16810b;
                    int i10 = tgVar.f16811c;
                    long j = tgVar.f16812d;
                    mu muVar = mu.f14017b;
                    tgVarD.a(obj, obj2, i10, j, true);
                } else {
                    tgVarD.f16813e = true;
                }
                return tgVarD;
            default:
                return super.d(i4, tgVar, z3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu1(ju1 ju1Var, uh uhVar) {
        super(uhVar);
        Objects.requireNonNull(ju1Var);
        this.f12487d = new fh();
    }
}
