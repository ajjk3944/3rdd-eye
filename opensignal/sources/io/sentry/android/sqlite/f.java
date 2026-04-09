package io.sentry.android.sqlite;

import io.sentry.k;
import java.io.IOException;
import lq.q;

/* loaded from: classes.dex */
public final class f implements o7.b {

    /* renamed from: a, reason: collision with root package name */
    public final o7.b f12057a;

    /* renamed from: d, reason: collision with root package name */
    public final k f12058d;

    /* renamed from: g, reason: collision with root package name */
    public final q f12059g = kc.f.F(new e(this, 1));

    /* renamed from: r, reason: collision with root package name */
    public final q f12060r = kc.f.F(new e(this, 0));

    public f(o7.b bVar) {
        this.f12057a = bVar;
        this.f12058d = new k(bVar.getDatabaseName(), 3);
    }

    @Override // o7.b
    public final o7.a F() {
        return (o7.a) this.f12060r.getValue();
    }

    @Override // o7.b
    public final o7.a I() {
        return (o7.a) this.f12059g.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12057a.close();
    }

    @Override // o7.b
    public final String getDatabaseName() {
        return this.f12057a.getDatabaseName();
    }

    @Override // o7.b
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        this.f12057a.setWriteAheadLoggingEnabled(z10);
    }
}
