package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: com.google.android.gms.internal.ads.rx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1826rx extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public Object f16647d;

    /* renamed from: e, reason: collision with root package name */
    public H5.d f16648e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f16649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1009cp f16650g;

    /* renamed from: h, reason: collision with root package name */
    public int f16651h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826rx(C1009cp c1009cp, j5.b bVar) {
        super(bVar);
        this.f16650g = c1009cp;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f16649f = obj;
        this.f16651h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f16650g.n(null, this);
    }
}
