package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class Ex extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public Object f8048d;

    /* renamed from: e, reason: collision with root package name */
    public long f8049e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f8050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1009cp f8051g;

    /* renamed from: h, reason: collision with root package name */
    public int f8052h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ex(C1009cp c1009cp, j5.b bVar) {
        super(bVar);
        this.f8051g = c1009cp;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f8050f = obj;
        this.f8052h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f8051g.k(this);
    }
}
