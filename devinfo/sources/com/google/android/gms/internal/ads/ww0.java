package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ww0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public long f18217a;

    /* renamed from: b, reason: collision with root package name */
    public gl.c f18218b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18219c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf0 f18220d;

    /* renamed from: e, reason: collision with root package name */
    public int f18221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww0(yf0 yf0Var, ek.c cVar) {
        super(cVar);
        this.f18220d = yf0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f18219c = obj;
        this.f18221e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f18220d.p(0L, this);
    }
}
