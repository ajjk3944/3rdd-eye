package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class Jx extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public Object f9398d;

    /* renamed from: e, reason: collision with root package name */
    public long f9399e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f9400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1009cp f9401g;

    /* renamed from: h, reason: collision with root package name */
    public int f9402h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jx(C1009cp c1009cp, j5.b bVar) {
        super(bVar);
        this.f9401g = c1009cp;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f9400f = obj;
        this.f9402h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f9401g.l(this);
    }
}
