package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
public final class TD extends AbstractC2167yD implements RunnableFuture {

    /* renamed from: h, reason: collision with root package name */
    public volatile GD f11359h;

    public TD(Callable callable) {
        this.f11359h = new SD(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final void f() {
        GD gd;
        if (l() && (gd = this.f11359h) != null) {
            gd.g();
        }
        this.f11359h = null;
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final String g() {
        GD gd = this.f11359h;
        if (gd == null) {
            return super.g();
        }
        String string = gd.toString();
        return AbstractC1135f5.n(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        GD gd = this.f11359h;
        if (gd != null) {
            gd.run();
        }
        this.f11359h = null;
    }
}
