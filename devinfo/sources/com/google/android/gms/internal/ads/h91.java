package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h91 extends m81 implements RunnableFuture {

    /* renamed from: h, reason: collision with root package name */
    public volatile u81 f11779h;

    public h91(Callable callable) {
        this.f11779h = new g91(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.m71
    public final void g() {
        u81 u81Var;
        if (m() && (u81Var = this.f11779h) != null) {
            u81Var.g();
        }
        this.f11779h = null;
    }

    @Override // com.google.android.gms.internal.ads.m71
    public final String h() {
        u81 u81Var = this.f11779h;
        if (u81Var == null) {
            return super.h();
        }
        String string = u81Var.toString();
        return r5.c.m(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        u81 u81Var = this.f11779h;
        if (u81Var != null) {
            u81Var.run();
        }
        this.f11779h = null;
    }
}
