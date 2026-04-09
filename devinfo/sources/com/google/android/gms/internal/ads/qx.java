package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sx f15462b;

    public /* synthetic */ qx(sx sxVar, int i4) {
        this.f15461a = i4;
        this.f15462b = sxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15461a) {
            case 0:
                this.f15462b.c("surfaceCreated", new String[0]);
                break;
            case 1:
                this.f15462b.c("surfaceDestroyed", new String[0]);
                break;
            default:
                this.f15462b.c("firstFrameRendered", new String[0]);
                break;
        }
    }
}
