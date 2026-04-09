package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class Cx extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public long f7702d;

    /* renamed from: e, reason: collision with root package name */
    public H5.d f7703e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f7704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1009cp f7705g;

    /* renamed from: h, reason: collision with root package name */
    public int f7706h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cx(C1009cp c1009cp, j5.b bVar) {
        super(bVar);
        this.f7705g = c1009cp;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f7704f = obj;
        this.f7706h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f7705g.m(this);
    }
}
