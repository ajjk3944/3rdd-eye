package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class D1 extends C4371i1.a {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f34967f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Object f34968g;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f34971j;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f34966e = 5;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Object f34969h = null;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Object f34970i = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D1(C4371i1 c4371i1, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f34967f = str;
        this.f34968g = obj;
        this.f34971j = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f34971j.f35258i)).logHealthData(this.f34966e, this.f34967f, x3.b.n0(this.f34968g), x3.b.n0(null), x3.b.n0(null));
    }
}
