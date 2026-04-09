package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1540mg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1648og f15634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15635c;

    public /* synthetic */ RunnableC1540mg(TextureViewSurfaceTextureListenerC1648og textureViewSurfaceTextureListenerC1648og, String str, int i) {
        this.f15633a = i;
        this.f15634b = textureViewSurfaceTextureListenerC1648og;
        this.f15635c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15633a) {
            case 0:
                C0946bg c0946bg = this.f15634b.f15981g;
                if (c0946bg != null) {
                    c0946bg.c("exception", "what", "ExoPlayerAdapter exception", "extra", this.f15635c);
                    break;
                }
                break;
            default:
                C0946bg c0946bg2 = this.f15634b.f15981g;
                if (c0946bg2 != null) {
                    c0946bg2.c("error", "what", "ExoPlayerAdapter error", "extra", this.f15635c);
                    break;
                }
                break;
        }
    }
}
