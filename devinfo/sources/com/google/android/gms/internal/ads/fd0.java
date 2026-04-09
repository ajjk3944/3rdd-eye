package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gd0 f11108b;

    public /* synthetic */ fd0(gd0 gd0Var, int i4) {
        this.f11107a = i4;
        this.f11108b = gd0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f11107a) {
            case 0:
                gd0 gd0Var = this.f11108b;
                gd0Var.f11500c.execute(new fd0(gd0Var, 1));
                break;
            case 1:
                this.f11108b.a();
                break;
            default:
                this.f11108b.a();
                break;
        }
    }
}
