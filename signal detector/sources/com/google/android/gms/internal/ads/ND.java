package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ND extends XC implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f9977h;

    public ND(Runnable runnable) {
        runnable.getClass();
        this.f9977h = runnable;
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final String g() {
        String string = this.f9977h.toString();
        return AbstractC1135f5.n(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f9977h.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
