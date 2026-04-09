package v5;

import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements d6.c {

    /* renamed from: a, reason: collision with root package name */
    public final d6.c f35896a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f35898c;

    public k(r rVar, d6.c cVar) {
        nk.k.e(cVar, "delegate");
        this.f35898c = rVar;
        this.f35896a = cVar;
        this.f35897b = com.bumptech.glide.d.l();
    }

    @Override // d6.c
    public final String D(int i4) {
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            return this.f35896a.D(i4);
        }
        i0.v(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // d6.c
    public final boolean P() {
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            return this.f35896a.P();
        }
        i0.v(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // d6.c
    public final void a(int i4, long j) {
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            this.f35896a.a(i4, j);
        } else {
            i0.v(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // d6.c
    public final void b(int i4, byte[] bArr) {
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            this.f35896a.b(i4, bArr);
        } else {
            i0.v(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            this.f35896a.close();
        } else {
            i0.v(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // d6.c
    public final void d(int i4) {
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            this.f35896a.d(i4);
        } else {
            i0.v(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // d6.c
    public final byte[] getBlob(int i4) {
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            return this.f35896a.getBlob(i4);
        }
        i0.v(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // d6.c
    public final int getColumnCount() {
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            return this.f35896a.getColumnCount();
        }
        i0.v(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // d6.c
    public final String getColumnName(int i4) {
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            return this.f35896a.getColumnName(i4);
        }
        i0.v(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // d6.c
    public final long getLong(int i4) {
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            return this.f35896a.getLong(i4);
        }
        i0.v(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // d6.c
    public final boolean isNull(int i4) {
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            return this.f35896a.isNull(i4);
        }
        i0.v(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // d6.c
    public final void q(int i4, String str) {
        nk.k.e(str, "value");
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            this.f35896a.q(i4, str);
        } else {
            i0.v(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // d6.c
    public final boolean r() {
        return getLong(0) != 0;
    }

    @Override // d6.c
    public final void reset() {
        if (this.f35898c.f35929d.get()) {
            i0.v(21, "Statement is recycled");
            throw null;
        }
        if (this.f35897b == com.bumptech.glide.d.l()) {
            this.f35896a.reset();
        } else {
            i0.v(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
