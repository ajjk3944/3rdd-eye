package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class N1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f35072e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Q0 f35073f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ C4371i1.c f35074g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N1(C4371i1.c cVar, Activity activity, Q0 q02) {
        super(C4371i1.this);
        this.f35072e = activity;
        this.f35073f = q02;
        this.f35074g = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(C4371i1.this.f35258i)).onActivitySaveInstanceStateByScionActivityInfo(C4353g1.b(this.f35072e), this.f35073f, this.f35260b);
    }
}
