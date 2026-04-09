package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a00 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qz f9163b;

    public /* synthetic */ a00(qz qzVar, int i4) {
        this.f9162a = i4;
        this.f9163b = qzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9162a) {
            case 0:
                this.f9163b.destroy();
                break;
            case 1:
                this.f9163b.destroy();
                break;
            case 2:
                this.f9163b.onPause();
                break;
            case 3:
                this.f9163b.onResume();
                break;
            case 4:
                this.f9163b.destroy();
                break;
            case 5:
                this.f9163b.a("onSdkImpression", new x.e(0));
                break;
            case 6:
                this.f9163b.destroy();
                break;
            default:
                this.f9163b.o0();
                break;
        }
    }
}
