package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vt0 f15653b;

    public /* synthetic */ rh0(vt0 vt0Var, int i4) {
        this.f15652a = i4;
        this.f15653b = vt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15652a) {
            case 0:
                this.f15653b.a();
                break;
            default:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16040a6)).booleanValue() && jz.f12903z.f15871b) {
                    this.f15653b.c();
                    break;
                }
                break;
        }
    }
}
