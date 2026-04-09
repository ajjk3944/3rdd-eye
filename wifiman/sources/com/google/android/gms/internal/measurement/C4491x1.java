package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4491x1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Q0 f35528e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f35529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4491x1(C4371i1 c4371i1, Q0 q02) {
        super(c4371i1);
        this.f35528e = q02;
        this.f35529f = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f35529f.f35258i)).getGmpAppId(this.f35528e);
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    protected final void b() {
        this.f35528e.a(null);
    }
}
