package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4451s1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f35458e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f35459f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4451s1(C4371i1 c4371i1, String str) {
        super(c4371i1);
        this.f35458e = str;
        this.f35459f = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f35459f.f35258i)).endAdUnitExposure(this.f35458e, this.f35260b);
    }
}
