package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14485c;

    public /* synthetic */ ny1(int i4, Object obj, Object obj2) {
        this.f14483a = i4;
        this.f14484b = obj;
        this.f14485c = obj2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f14483a) {
            case 0:
                ((jb0) this.f14484b).mo160c(this.f14485c);
                break;
            default:
                bz1 bz1Var = (bz1) this.f14484b;
                m2 m2Var = (m2) this.f14485c;
                bz1Var.f9884z = bz1Var.f9875q == null ? m2Var : new d2(-9223372036854775807L, 0L);
                bz1Var.A = m2Var.b();
                boolean z3 = false;
                if (!bz1Var.H && m2Var.b() == -9223372036854775807L) {
                    z3 = true;
                }
                bz1Var.B = z3;
                bz1Var.C = true == z3 ? 7 : 1;
                if (!bz1Var.f9880v) {
                    bz1Var.s();
                    break;
                } else {
                    bz1Var.f9866f.s(bz1Var.A, m2Var, z3);
                    break;
                }
                break;
        }
    }
}
