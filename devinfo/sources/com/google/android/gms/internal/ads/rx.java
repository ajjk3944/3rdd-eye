package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15779a;

    /* renamed from: b, reason: collision with root package name */
    public final sx f15780b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15781c;

    public rx(sx sxVar) {
        this.f15779a = 2;
        this.f15781c = false;
        this.f15780b = sxVar;
    }

    public void a() {
        this.f15781c = true;
        this.f15780b.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15779a) {
            case 0:
                this.f15780b.c("windowVisibilityChanged", "isVisible", String.valueOf(this.f15781c));
                break;
            case 1:
                boolean z3 = this.f15781c;
                sx sxVar = this.f15780b;
                sxVar.getClass();
                sxVar.c("windowFocusChanged", "hasWindowFocus", String.valueOf(z3));
                break;
            default:
                if (!this.f15781c) {
                    this.f15780b.b();
                    ya.b0 b0Var = ya.f0.f37440l;
                    b0Var.removeCallbacks(this);
                    b0Var.postDelayed(this, 250L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rx(sx sxVar, boolean z3, int i4) {
        this.f15779a = i4;
        this.f15781c = z3;
        this.f15780b = sxVar;
    }
}
