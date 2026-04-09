package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class z20 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b30 f18978b;

    public /* synthetic */ z20(b30 b30Var, int i4) {
        this.f18977a = i4;
        this.f18978b = b30Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f18977a) {
            case 0:
                b30 b30Var = this.f18978b;
                b30Var.f9568b.execute(new z20(b30Var, 1));
                break;
            default:
                this.f18978b.g();
                break;
        }
    }
}
