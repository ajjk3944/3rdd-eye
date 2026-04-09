package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c00 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e00 f9893b;

    public /* synthetic */ c00(e00 e00Var, int i4) {
        this.f9892a = i4;
        this.f9893b = e00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9892a) {
            case 0:
                super/*android.webkit.WebView*/.destroy();
                break;
            default:
                this.f9893b.v();
                break;
        }
    }
}
