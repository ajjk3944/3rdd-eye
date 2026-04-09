package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ et0 f10548b;

    public /* synthetic */ dt0(et0 et0Var, int i4) {
        this.f10547a = i4;
        this.f10548b = et0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10547a) {
            case 0:
                this.f10548b.k();
                return;
            case 1:
                this.f10548b.k();
                return;
            case 2:
                this.f10548b.k();
                return;
            case 3:
                this.f10548b.k();
                return;
            default:
                et0 et0Var = this.f10548b;
                synchronized (et0Var) {
                    et0Var.f10857b.set(false);
                    et0Var.k();
                }
                return;
        }
    }
}
