package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b91 extends l71 implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f9635h;

    public b91(Runnable runnable) {
        runnable.getClass();
        this.f9635h = runnable;
    }

    @Override // com.google.android.gms.internal.ads.m71
    public final String h() {
        String string = this.f9635h.toString();
        return r5.c.m(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f9635h.run();
        } catch (Throwable th2) {
            f(th2);
            throw th2;
        }
    }
}
