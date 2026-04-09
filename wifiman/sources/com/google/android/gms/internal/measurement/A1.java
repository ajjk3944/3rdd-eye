package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class A1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f34923e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f34924f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ boolean f34925g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Q0 f34926h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f34927i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A1(C4371i1 c4371i1, String str, String str2, boolean z10, Q0 q02) {
        super(c4371i1);
        this.f34923e = str;
        this.f34924f = str2;
        this.f34925g = z10;
        this.f34926h = q02;
        this.f34927i = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        ((P0) AbstractC7901p.l(this.f34927i.f35258i)).getUserProperties(this.f34923e, this.f34924f, this.f34925g, this.f34926h);
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    protected final void b() {
        this.f34926h.a(null);
    }
}
