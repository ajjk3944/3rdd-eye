package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4412n1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f35404e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f35405f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4412n1(C4371i1 c4371i1, Bundle bundle) {
        super(c4371i1);
        this.f35404e = bundle;
        this.f35405f = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f35405f.f35258i)).setConditionalUserProperty(this.f35404e, this.f35259a);
    }
}
