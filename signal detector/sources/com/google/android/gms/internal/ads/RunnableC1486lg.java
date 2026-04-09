package com.google.android.gms.internal.ads;

import java.io.IOException;
import t2.C2911G;
import t2.HandlerC2908D;

/* renamed from: com.google.android.gms.internal.ads.lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1486lg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1648og f15421b;

    public /* synthetic */ RunnableC1486lg(TextureViewSurfaceTextureListenerC1648og textureViewSurfaceTextureListenerC1648og, int i) {
        this.f15420a = i;
        this.f15421b = textureViewSurfaceTextureListenerC1648og;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15420a) {
            case 0:
                C0946bg c0946bg = this.f15421b.f15981g;
                if (c0946bg != null) {
                    c0946bg.e();
                    break;
                }
                break;
            case 1:
                C0946bg c0946bg2 = this.f15421b.f15981g;
                if (c0946bg2 != null) {
                    c0946bg2.k();
                    break;
                }
                break;
            case 2:
                C0946bg c0946bg3 = this.f15421b.f15981g;
                if (c0946bg3 != null) {
                    c0946bg3.h();
                    break;
                }
                break;
            case 3:
                C0946bg c0946bg4 = this.f15421b.f15981g;
                if (c0946bg4 != null) {
                    c0946bg4.f();
                    break;
                }
                break;
            case 4:
                C0946bg c0946bg5 = this.f15421b.f15981g;
                if (c0946bg5 != null) {
                    c0946bg5.g();
                    break;
                }
                break;
            case 5:
                C0946bg c0946bg6 = this.f15421b.f15981g;
                if (c0946bg6 != null) {
                    RunnableC0891ag runnableC0891ag = c0946bg6.f13416e;
                    runnableC0891ag.f13158c = false;
                    HandlerC2908D handlerC2908D = C2911G.f23576l;
                    handlerC2908D.removeCallbacks(runnableC0891ag);
                    handlerC2908D.postDelayed(runnableC0891ag, 250L);
                    handlerC2908D.post(new RunnableC0844Zf(c0946bg6, 0));
                    break;
                }
                break;
            case 6:
                C0946bg c0946bg7 = this.f15421b.f15981g;
                if (c0946bg7 != null) {
                    c0946bg7.i();
                    break;
                }
                break;
            default:
                TextureViewSurfaceTextureListenerC1648og textureViewSurfaceTextureListenerC1648og = this.f15421b;
                C1432kg c1432kg = textureViewSurfaceTextureListenerC1648og.f12647b;
                float f2 = c1432kg.f15179c ? c1432kg.f15181e ? 0.0f : c1432kg.f15182f : 0.0f;
                C0641Ng c0641Ng = textureViewSurfaceTextureListenerC1648og.i;
                if (c0641Ng == null) {
                    u2.k.h("Trying to set volume before player is initialized.");
                    break;
                } else {
                    try {
                        C2232zO c2232zO = c0641Ng.f10026g;
                        if (c2232zO != null) {
                            c2232zO.f17873d.d();
                            c2232zO.f17872c.H1(f2);
                            break;
                        }
                    } catch (IOException e6) {
                        u2.k.i("", e6);
                        return;
                    }
                }
                break;
        }
    }
}
