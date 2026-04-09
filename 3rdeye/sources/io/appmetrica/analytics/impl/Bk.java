package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class Bk {

    /* renamed from: a, reason: collision with root package name */
    public final C4940s5 f39202a;

    /* renamed from: b, reason: collision with root package name */
    public final Sk f39203b;

    /* renamed from: c, reason: collision with root package name */
    public final Ek f39204c;

    /* renamed from: d, reason: collision with root package name */
    public long f39205d;

    /* renamed from: e, reason: collision with root package name */
    public long f39206e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicLong f39207f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39208g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Qk f39209h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f39210j;

    /* renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f39211k;

    public Bk(C4940s5 c4940s5, Sk sk, Ek ek, SystemTimeProvider systemTimeProvider) {
        this.f39202a = c4940s5;
        this.f39203b = sk;
        this.f39204c = ek;
        this.f39211k = systemTimeProvider;
        a();
    }

    public final void a() {
        Ek ek = this.f39204c;
        long jElapsedRealtime = this.f39211k.elapsedRealtime();
        Long l5 = ek.f39375c;
        if (l5 != null) {
            jElapsedRealtime = l5.longValue();
        }
        this.f39206e = jElapsedRealtime;
        Long l10 = this.f39204c.f39374b;
        this.f39205d = l10 == null ? -1L : l10.longValue();
        Long l11 = this.f39204c.f39377e;
        this.f39207f = new AtomicLong(l11 == null ? 0L : l11.longValue());
        Boolean bool = this.f39204c.f39378f;
        this.f39208g = bool == null ? true : bool.booleanValue();
        Long l12 = this.f39204c.f39379g;
        long jLongValue = l12 != null ? l12.longValue() : 0L;
        this.i = jLongValue;
        Ek ek2 = this.f39204c;
        long jLongValue2 = jLongValue - this.f39206e;
        Long l13 = ek2.f39380h;
        if (l13 != null) {
            jLongValue2 = l13.longValue();
        }
        this.f39210j = jLongValue2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{id=");
        sb.append(this.f39205d);
        sb.append(", creationTime=");
        sb.append(this.f39206e);
        sb.append(", currentReportId=");
        sb.append(this.f39207f);
        sb.append(", sessionRequestParams=");
        sb.append(this.f39209h);
        sb.append(", sleepStart=");
        return androidx.work.s.f(sb, this.i, '}');
    }
}
