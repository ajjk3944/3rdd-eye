package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class Lx extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public H5.d f9784d;

    /* renamed from: e, reason: collision with root package name */
    public long f9785e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f9786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1009cp f9787g;

    /* renamed from: h, reason: collision with root package name */
    public int f9788h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lx(C1009cp c1009cp, j5.b bVar) {
        super(bVar);
        this.f9787g = c1009cp;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f9786f = obj;
        this.f9788h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f9787g.j(this);
    }
}
