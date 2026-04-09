package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4404m1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f35395e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f35396f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Bundle f35397g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f35398h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4404m1(C4371i1 c4371i1, String str, String str2, Bundle bundle) {
        super(c4371i1);
        this.f35395e = str;
        this.f35396f = str2;
        this.f35397g = bundle;
        this.f35398h = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f35398h.f35258i)).clearConditionalUserProperty(this.f35395e, this.f35396f, this.f35397g);
    }
}
