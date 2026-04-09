package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a30 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b30 f9196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9197c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9198d;

    public /* synthetic */ a30(b30 b30Var, int i4, int i10, int i11) {
        this.f9195a = i11;
        this.f9196b = b30Var;
        this.f9197c = i4;
        this.f9198d = i10;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f9195a) {
            case 0:
                b30 b30Var = this.f9196b;
                b30Var.f9568b.execute(new a30(b30Var, this.f9197c, this.f9198d, 1));
                break;
            default:
                this.f9196b.f(this.f9197c - 1, this.f9198d);
                break;
        }
    }
}
