package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class E1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f34991e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Q0 f34992f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f34993g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E1(C4371i1 c4371i1, String str, Q0 q02) {
        super(c4371i1);
        this.f34991e = str;
        this.f34992f = q02;
        this.f34993g = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f34993g.f35258i)).getMaxUserProperties(this.f34991e, this.f34992f);
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    protected final void b() {
        this.f34992f.a(null);
    }
}
