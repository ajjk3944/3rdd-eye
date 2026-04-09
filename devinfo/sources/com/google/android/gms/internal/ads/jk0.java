package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class jk0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kk0 f12769b;

    public /* synthetic */ jk0(kk0 kk0Var, int i4) {
        this.f12768a = i4;
        this.f12769b = kk0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f12768a) {
            case 0:
                this.f12769b.e();
                break;
            case 1:
                this.f12769b.e();
                break;
            default:
                kk0 kk0Var = this.f12769b;
                kk0Var.getClass();
                kk0Var.f13182f.execute(new jk0(kk0Var, 1));
                break;
        }
    }
}
