package w5;

import f6.j;
import java.io.IOException;
import nk.k;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: d, reason: collision with root package name */
    public final j f36483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e6.a aVar, String str) {
        super(aVar, str);
        k.e(aVar, "db");
        k.e(str, "sql");
        this.f36483d = aVar.l(str);
    }

    @Override // d6.c
    public final String D(int i4) {
        c();
        i0.v(21, "no row");
        throw null;
    }

    @Override // d6.c
    public final boolean P() {
        c();
        this.f36483d.f23688b.execute();
        return false;
    }

    @Override // d6.c
    public final void a(int i4, long j) {
        c();
        this.f36483d.a(i4, j);
    }

    @Override // d6.c
    public final void b(int i4, byte[] bArr) {
        c();
        this.f36483d.b(i4, bArr);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f36483d.close();
        this.f36486c = true;
    }

    @Override // d6.c
    public final void d(int i4) {
        c();
        this.f36483d.d(i4);
    }

    @Override // d6.c
    public final byte[] getBlob(int i4) {
        c();
        i0.v(21, "no row");
        throw null;
    }

    @Override // d6.c
    public final int getColumnCount() {
        c();
        return 0;
    }

    @Override // d6.c
    public final String getColumnName(int i4) {
        c();
        i0.v(21, "no row");
        throw null;
    }

    @Override // d6.c
    public final long getLong(int i4) {
        c();
        i0.v(21, "no row");
        throw null;
    }

    @Override // d6.c
    public final boolean isNull(int i4) {
        c();
        i0.v(21, "no row");
        throw null;
    }

    @Override // d6.c
    public final void q(int i4, String str) {
        k.e(str, "value");
        c();
        this.f36483d.k(i4, str);
    }

    @Override // d6.c
    public final void reset() {
    }
}
