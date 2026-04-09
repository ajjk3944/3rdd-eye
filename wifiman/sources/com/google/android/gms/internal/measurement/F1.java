package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class F1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C4371i1.b f34996e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f34997f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F1(C4371i1 c4371i1, C4371i1.b bVar) {
        super(c4371i1);
        this.f34996e = bVar;
        this.f34997f = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f34997f.f35258i)).registerOnMeasurementEventListener(this.f34996e);
    }
}
