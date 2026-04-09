package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4436q1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C4353g1 f35435e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f35436f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f35437g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f35438h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4436q1(C4371i1 c4371i1, C4353g1 c4353g1, String str, String str2) {
        super(c4371i1);
        this.f35435e = c4353g1;
        this.f35436f = str;
        this.f35437g = str2;
        this.f35438h = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f35438h.f35258i)).setCurrentScreenByScionActivityInfo(this.f35435e, this.f35436f, this.f35437g, this.f35259a);
    }
}
