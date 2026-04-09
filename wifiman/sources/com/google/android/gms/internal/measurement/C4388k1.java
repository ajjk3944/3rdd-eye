package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4388k1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f35277e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f35278f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Object f35279g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ boolean f35280h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f35281i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4388k1(C4371i1 c4371i1, String str, String str2, Object obj, boolean z10) {
        super(c4371i1);
        this.f35277e = str;
        this.f35278f = str2;
        this.f35279g = obj;
        this.f35280h = z10;
        this.f35281i = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f35281i.f35258i)).setUserProperty(this.f35277e, this.f35278f, x3.b.n0(this.f35279g), this.f35280h, this.f35259a);
    }
}
