package io.sentry.android.sqlite;

import android.database.Cursor;
import br.l;
import io.sentry.k;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d implements o7.a {

    /* renamed from: a, reason: collision with root package name */
    public final o7.a f12053a;

    /* renamed from: d, reason: collision with root package name */
    public final k f12054d;

    public d(o7.a aVar, k kVar) {
        l.e(aVar, "delegate");
        l.e(kVar, "sqLiteSpanManager");
        this.f12053a = aVar;
        this.f12054d = kVar;
    }

    @Override // o7.a
    public final void C() {
        this.f12053a.C();
    }

    @Override // o7.a
    public final void E() {
        this.f12053a.E();
    }

    @Override // o7.a
    public final void K() {
        this.f12053a.K();
    }

    @Override // o7.a
    public final boolean X() {
        return this.f12053a.X();
    }

    @Override // o7.a
    public final boolean c0() {
        return this.f12053a.c0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12053a.close();
    }

    @Override // o7.a
    public final void j() {
        this.f12053a.j();
    }

    @Override // o7.a
    public final void l(String str) throws Throwable {
        l.e(str, "sql");
        this.f12054d.j0(str, new ah.d(this, 23, str));
    }

    @Override // o7.a
    public final o7.e o(String str) {
        l.e(str, "sql");
        return new h(this.f12053a.o(str), this.f12054d, str);
    }

    @Override // o7.a
    public final Cursor t(o7.d dVar) {
        return (Cursor) this.f12054d.j0(dVar.f(), new ah.d(this, 24, dVar));
    }
}
