package io.sentry.android.sqlite;

import br.l;
import io.sentry.k;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h implements o7.e {

    /* renamed from: a, reason: collision with root package name */
    public final o7.e f12063a;

    /* renamed from: d, reason: collision with root package name */
    public final k f12064d;

    /* renamed from: g, reason: collision with root package name */
    public final String f12065g;

    public h(o7.e eVar, k kVar, String str) {
        l.e(eVar, "delegate");
        l.e(kVar, "sqLiteSpanManager");
        l.e(str, "sql");
        this.f12063a = eVar;
        this.f12064d = kVar;
        this.f12065g = str;
    }

    @Override // o7.c
    public final void A(int i10, long j) {
        this.f12063a.A(i10, j);
    }

    @Override // o7.c
    public final void T(double d6, int i10) {
        this.f12063a.T(d6, i10);
    }

    @Override // o7.c
    public final void U(int i10) {
        this.f12063a.U(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12063a.close();
    }

    @Override // o7.e
    public final long j0() {
        return ((Number) this.f12064d.j0(this.f12065g, new g(this, 0))).longValue();
    }

    @Override // o7.c
    public final void m(int i10, String str) {
        l.e(str, "value");
        this.f12063a.m(i10, str);
    }

    @Override // o7.e
    public final int n() {
        return ((Number) this.f12064d.j0(this.f12065g, new g(this, 1))).intValue();
    }
}
