package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4428p1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f35423e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f35424f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Q0 f35425g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f35426h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4428p1(C4371i1 c4371i1, String str, String str2, Q0 q02) {
        super(c4371i1);
        this.f35423e = str;
        this.f35424f = str2;
        this.f35425g = q02;
        this.f35426h = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f35426h.f35258i)).getConditionalUserProperties(this.f35423e, this.f35424f, this.f35425g);
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    protected final void b() {
        this.f35425g.a(null);
    }
}
