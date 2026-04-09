package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0844Zf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0946bg f12911b;

    public /* synthetic */ RunnableC0844Zf(C0946bg c0946bg, int i) {
        this.f12910a = i;
        this.f12911b = c0946bg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12910a) {
            case 0:
                this.f12911b.c("surfaceCreated", new String[0]);
                break;
            case 1:
                this.f12911b.c("surfaceDestroyed", new String[0]);
                break;
            default:
                this.f12911b.c("firstFrameRendered", new String[0]);
                break;
        }
    }
}
