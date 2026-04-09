package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1594ng implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15794d;

    public /* synthetic */ RunnableC1594ng(Object obj, boolean z6, long j6, int i) {
        this.f15791a = i;
        this.f15794d = obj;
        this.f15792b = z6;
        this.f15793c = j6;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f15791a) {
            case 0:
                TextureViewSurfaceTextureListenerC1648og textureViewSurfaceTextureListenerC1648og = (TextureViewSurfaceTextureListenerC1648og) this.f15794d;
                textureViewSurfaceTextureListenerC1648og.f15977c.L0(this.f15793c, this.f15792b);
                break;
            default:
                ((InterfaceC0828Yg) this.f15794d).L0(this.f15793c, this.f15792b);
                break;
        }
    }
}
