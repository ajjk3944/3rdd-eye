package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class lm0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mm0 f13550b;

    public /* synthetic */ lm0(mm0 mm0Var, int i4) {
        this.f13549a = i4;
        this.f13550b = mm0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f13549a) {
            case 0:
                mm0 mm0Var = this.f13550b;
                mm0Var.f13952a.set(new km0(mm0Var.f13956e.b(), mm0Var.f13957f, mm0Var.f13954c));
                break;
            default:
                mm0 mm0Var2 = this.f13550b;
                mm0Var2.f13955d.execute(new lm0(mm0Var2, 0));
                break;
        }
    }
}
