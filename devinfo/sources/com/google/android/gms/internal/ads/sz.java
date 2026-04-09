package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16597c;

    public /* synthetic */ sz(Object obj, long j, int i4) {
        this.f16595a = i4;
        this.f16597c = obj;
        this.f16596b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16595a) {
            case 0:
                ((i00) this.f16597c).f12081a.A0(this.f16596b, true);
                break;
            case 1:
                d9.o oVar = (d9.o) this.f16597c;
                if (oVar.ra != null) {
                    oVar.ra.obtainMessage(106, Long.valueOf(this.f16596b)).sendToTarget();
                    break;
                }
                break;
            case 2:
                ((ec.w) this.f16597c).H(this.f16596b);
                break;
            default:
                ec.b3 b3Var = (ec.b3) this.f16597c;
                ec.w wVar = ((ec.o1) b3Var.f218b).f22960n;
                ec.o1.j(wVar);
                wVar.E(this.f16596b);
                b3Var.f22589f = null;
                break;
        }
    }

    public sz(ec.w wVar, long j) {
        this.f16595a = 2;
        this.f16596b = j;
        Objects.requireNonNull(wVar);
        this.f16597c = wVar;
    }

    public sz(ec.b3 b3Var, long j) {
        this.f16595a = 3;
        this.f16596b = j;
        Objects.requireNonNull(b3Var);
        this.f16597c = b3Var;
    }
}
