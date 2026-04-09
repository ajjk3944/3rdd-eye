package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class C1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Q0 f34957e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f34958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1(C4371i1 c4371i1, Q0 q02) {
        super(c4371i1);
        this.f34957e = q02;
        this.f34958f = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f34958f.f35258i)).getCurrentScreenClass(this.f34957e);
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    protected final void b() {
        this.f34957e.a(null);
    }
}
