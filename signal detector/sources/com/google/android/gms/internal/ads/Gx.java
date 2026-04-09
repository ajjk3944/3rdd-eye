package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class Gx extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public H5.a f8483d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1009cp f8485f;

    /* renamed from: g, reason: collision with root package name */
    public int f8486g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gx(C1009cp c1009cp, j5.b bVar) {
        super(bVar);
        this.f8485f = c1009cp;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f8484e = obj;
        this.f8486g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f8485f.f(this);
    }
}
