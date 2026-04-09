package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class L1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f35062e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C4371i1.c f35063f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L1(C4371i1.c cVar, Activity activity) {
        super(C4371i1.this);
        this.f35062e = activity;
        this.f35063f = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(C4371i1.this.f35258i)).onActivityPausedByScionActivityInfo(C4353g1.b(this.f35062e), this.f35260b);
    }
}
