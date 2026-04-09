package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0759Uf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11706c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0827Yf f11707d;

    public /* synthetic */ RunnableC0759Uf(AbstractC0827Yf abstractC0827Yf, int i, int i3, int i6) {
        this.f11704a = i6;
        this.f11705b = i;
        this.f11706c = i3;
        this.f11707d = abstractC0827Yf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11704a) {
            case 0:
                C0946bg c0946bg = ((TextureViewSurfaceTextureListenerC0793Wf) this.f11707d).f12233E;
                if (c0946bg != null) {
                    c0946bg.j(this.f11705b, this.f11706c);
                    break;
                }
                break;
            default:
                C0946bg c0946bg2 = ((TextureViewSurfaceTextureListenerC1648og) this.f11707d).f15981g;
                if (c0946bg2 != null) {
                    c0946bg2.j(this.f11705b, this.f11706c);
                    break;
                }
                break;
        }
    }
}
