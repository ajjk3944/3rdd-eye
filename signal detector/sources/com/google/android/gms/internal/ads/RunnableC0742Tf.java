package com.google.android.gms.internal.ads;

import t2.C2911G;
import t2.HandlerC2908D;

/* renamed from: com.google.android.gms.internal.ads.Tf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0742Tf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0793Wf f11419b;

    public /* synthetic */ RunnableC0742Tf(TextureViewSurfaceTextureListenerC0793Wf textureViewSurfaceTextureListenerC0793Wf, int i) {
        this.f11418a = i;
        this.f11419b = textureViewSurfaceTextureListenerC0793Wf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11418a) {
            case 0:
                C0946bg c0946bg = this.f11419b.f12233E;
                if (c0946bg != null) {
                    c0946bg.h();
                    break;
                }
                break;
            case 1:
                C0946bg c0946bg2 = this.f11419b.f12233E;
                if (c0946bg2 != null) {
                    RunnableC0891ag runnableC0891ag = c0946bg2.f13416e;
                    runnableC0891ag.f13158c = false;
                    HandlerC2908D handlerC2908D = C2911G.f23576l;
                    handlerC2908D.removeCallbacks(runnableC0891ag);
                    handlerC2908D.postDelayed(runnableC0891ag, 250L);
                    handlerC2908D.post(new RunnableC0844Zf(c0946bg2, 0));
                    break;
                }
                break;
            case 2:
                TextureViewSurfaceTextureListenerC0793Wf textureViewSurfaceTextureListenerC0793Wf = this.f11419b;
                C0946bg c0946bg3 = textureViewSurfaceTextureListenerC0793Wf.f12233E;
                if (c0946bg3 != null) {
                    c0946bg3.g();
                    textureViewSurfaceTextureListenerC0793Wf.f12233E.i();
                    break;
                }
                break;
            case 3:
                TextureViewSurfaceTextureListenerC0793Wf textureViewSurfaceTextureListenerC0793Wf2 = this.f11419b;
                C0946bg c0946bg4 = textureViewSurfaceTextureListenerC0793Wf2.f12233E;
                if (c0946bg4 != null) {
                    if (!textureViewSurfaceTextureListenerC0793Wf2.f12234F) {
                        c0946bg4.k();
                        textureViewSurfaceTextureListenerC0793Wf2.f12234F = true;
                    }
                    textureViewSurfaceTextureListenerC0793Wf2.f12233E.f();
                    break;
                }
                break;
            default:
                C0946bg c0946bg5 = this.f11419b.f12233E;
                if (c0946bg5 != null) {
                    c0946bg5.g();
                    break;
                }
                break;
        }
    }
}
