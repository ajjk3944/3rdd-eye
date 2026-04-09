package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class aw1 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f9461a;

    /* renamed from: b, reason: collision with root package name */
    public final zv1 f9462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bw1 f9463c;

    public /* synthetic */ aw1(bw1 bw1Var) {
        this.f9463c = bw1Var;
        Handler handlerN = bq0.n();
        this.f9461a = handlerN;
        zv1 zv1Var = new zv1(this);
        this.f9462b = zv1Var;
        bw1Var.f9821a.registerStreamEventCallback(new aa(handlerN, 1), zv1Var);
    }

    public final /* synthetic */ void a() {
        this.f9463c.f9821a.unregisterStreamEventCallback(this.f9462b);
        this.f9461a.removeCallbacksAndMessages(null);
    }
}
