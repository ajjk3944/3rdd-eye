package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ax0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f9477a;

    /* renamed from: b, reason: collision with root package name */
    public gl.c f9478b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf0 f9480d;

    /* renamed from: e, reason: collision with root package name */
    public int f9481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax0(yf0 yf0Var, ek.c cVar) {
        super(cVar);
        this.f9480d = yf0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f9479c = obj;
        this.f9481e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f9480d.q(this);
    }
}
