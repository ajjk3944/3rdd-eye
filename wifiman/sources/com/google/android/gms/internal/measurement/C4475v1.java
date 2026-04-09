package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4475v1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Runnable f35501e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f35502f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4475v1(C4371i1 c4371i1, Runnable runnable) {
        super(c4371i1);
        this.f35501e = runnable;
        this.f35502f = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f35502f.f35258i)).retrieveAndUploadBatches(new BinderC4467u1(this, this.f35501e));
    }
}
