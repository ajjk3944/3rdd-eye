package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: com.google.android.gms.internal.ads.tx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1934tx extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public long f17004d;

    /* renamed from: e, reason: collision with root package name */
    public H5.d f17005e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f17006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1009cp f17007g;

    /* renamed from: h, reason: collision with root package name */
    public int f17008h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1934tx(C1009cp c1009cp, j5.b bVar) {
        super(bVar);
        this.f17007g = c1009cp;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f17006f = obj;
        this.f17008h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f17007g.p(0L, this);
    }
}
