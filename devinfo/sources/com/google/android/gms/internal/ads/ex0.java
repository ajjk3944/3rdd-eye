package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ex0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public gl.a f10900a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yf0 f10902c;

    /* renamed from: d, reason: collision with root package name */
    public int f10903d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex0(yf0 yf0Var, ek.c cVar) {
        super(cVar);
        this.f10902c = yf0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f10901b = obj;
        this.f10903d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f10902c.f(this);
    }
}
