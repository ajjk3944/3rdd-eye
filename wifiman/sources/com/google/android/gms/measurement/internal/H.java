package com.google.android.gms.measurement.internal;

import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class H {

    /* renamed from: a, reason: collision with root package name */
    final String f35902a;

    /* renamed from: b, reason: collision with root package name */
    final String f35903b;

    /* renamed from: c, reason: collision with root package name */
    final long f35904c;

    /* renamed from: d, reason: collision with root package name */
    final long f35905d;

    /* renamed from: e, reason: collision with root package name */
    final long f35906e;

    /* renamed from: f, reason: collision with root package name */
    final long f35907f;

    /* renamed from: g, reason: collision with root package name */
    final long f35908g;

    /* renamed from: h, reason: collision with root package name */
    final Long f35909h;

    /* renamed from: i, reason: collision with root package name */
    final Long f35910i;

    /* renamed from: j, reason: collision with root package name */
    final Long f35911j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f35912k;

    H(String str, String str2, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j12, 0L, null, null, null, null);
    }

    final H a(long j10) {
        return new H(this.f35902a, this.f35903b, this.f35904c, this.f35905d, this.f35906e, j10, this.f35908g, this.f35909h, this.f35910i, this.f35911j, this.f35912k);
    }

    final H b(long j10, long j11) {
        return new H(this.f35902a, this.f35903b, this.f35904c, this.f35905d, this.f35906e, this.f35907f, j10, Long.valueOf(j11), this.f35910i, this.f35911j, this.f35912k);
    }

    final H c(Long l10, Long l11, Boolean bool) {
        return new H(this.f35902a, this.f35903b, this.f35904c, this.f35905d, this.f35906e, this.f35907f, this.f35908g, this.f35909h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    H(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        AbstractC7901p.f(str);
        AbstractC7901p.f(str2);
        AbstractC7901p.a(j10 >= 0);
        AbstractC7901p.a(j11 >= 0);
        AbstractC7901p.a(j12 >= 0);
        AbstractC7901p.a(j14 >= 0);
        this.f35902a = str;
        this.f35903b = str2;
        this.f35904c = j10;
        this.f35905d = j11;
        this.f35906e = j12;
        this.f35907f = j13;
        this.f35908g = j14;
        this.f35909h = l10;
        this.f35910i = l11;
        this.f35911j = l12;
        this.f35912k = bool;
    }
}
