package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class G1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Long f35008e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f35009f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f35010g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Bundle f35011h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ boolean f35012i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ boolean f35013j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f35014k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G1(C4371i1 c4371i1, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(c4371i1);
        this.f35008e = l10;
        this.f35009f = str;
        this.f35010g = str2;
        this.f35011h = bundle;
        this.f35012i = z10;
        this.f35013j = z11;
        this.f35014k = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        Long l10 = this.f35008e;
        ((P0) AbstractC7901p.l(this.f35014k.f35258i)).logEvent(this.f35009f, this.f35010g, this.f35011h, this.f35012i, this.f35013j, l10 == null ? this.f35259a : l10.longValue());
    }
}
