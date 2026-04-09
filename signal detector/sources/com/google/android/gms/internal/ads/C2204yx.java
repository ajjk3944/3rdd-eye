package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: com.google.android.gms.internal.ads.yx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2204yx extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public Object f17794d;

    /* renamed from: e, reason: collision with root package name */
    public H5.d f17795e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f17796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1009cp f17797g;

    /* renamed from: h, reason: collision with root package name */
    public int f17798h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2204yx(C1009cp c1009cp, j5.b bVar) {
        super(bVar);
        this.f17797g = c1009cp;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f17796f = obj;
        this.f17798h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f17797g.q(this);
    }
}
