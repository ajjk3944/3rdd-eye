package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zv1 extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aw1 f19192a;

    public zv1(aw1 aw1Var) {
        this.f19192a = aw1Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i4) {
        yf0 yf0Var = this.f19192a.f9463c.f9827h;
        yf0Var.c(-1, uu1.f17349f);
        yf0Var.d();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        yf0 yf0Var = this.f19192a.f9463c.f9827h;
        yf0Var.c(-1, uu1.f17347d);
        yf0Var.d();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        yf0 yf0Var = this.f19192a.f9463c.f9827h;
        yf0Var.c(-1, uu1.f17348e);
        yf0Var.d();
    }
}
