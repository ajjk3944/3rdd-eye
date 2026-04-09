package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: com.google.android.gms.internal.ads.ux, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1988ux extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public H5.a f17193d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f17194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1009cp f17195f;

    /* renamed from: g, reason: collision with root package name */
    public int f17196g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1988ux(C1009cp c1009cp, j5.b bVar) {
        super(bVar);
        this.f17195f = c1009cp;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f17194e = obj;
        this.f17196g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f17195f.o(this);
    }
}
