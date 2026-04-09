package com.google.android.gms.internal.ads;

import t2.C2911G;
import t2.HandlerC2908D;

/* renamed from: com.google.android.gms.internal.ads.ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0891ag implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13156a;

    /* renamed from: b, reason: collision with root package name */
    public final C0946bg f13157b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13158c;

    public RunnableC0891ag(C0946bg c0946bg) {
        this.f13156a = 2;
        this.f13158c = false;
        this.f13157b = c0946bg;
    }

    public void a() {
        this.f13158c = true;
        this.f13157b.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13156a) {
            case 0:
                this.f13157b.c("windowVisibilityChanged", "isVisible", String.valueOf(this.f13158c));
                break;
            case 1:
                boolean z6 = this.f13158c;
                C0946bg c0946bg = this.f13157b;
                c0946bg.getClass();
                c0946bg.c("windowFocusChanged", "hasWindowFocus", String.valueOf(z6));
                break;
            default:
                if (!this.f13158c) {
                    this.f13157b.b();
                    HandlerC2908D handlerC2908D = C2911G.f23576l;
                    handlerC2908D.removeCallbacks(this);
                    handlerC2908D.postDelayed(this, 250L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0891ag(C0946bg c0946bg, boolean z6, int i) {
        this.f13156a = i;
        this.f13158c = z6;
        this.f13157b = c0946bg;
    }
}
