package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: com.google.android.gms.internal.ads.wx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2096wx extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public H5.d f17518d;

    /* renamed from: e, reason: collision with root package name */
    public long f17519e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f17520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1009cp f17521g;

    /* renamed from: h, reason: collision with root package name */
    public int f17522h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2096wx(C1009cp c1009cp, j5.b bVar) {
        super(bVar);
        this.f17521g = c1009cp;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f17520f = obj;
        this.f17522h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f17521g.i(this);
    }
}
