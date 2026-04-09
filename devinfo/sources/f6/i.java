package f6;

import android.database.sqlite.SQLiteProgram;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class i implements e6.d {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f23687a;

    public i(SQLiteProgram sQLiteProgram) {
        k.e(sQLiteProgram, "delegate");
        this.f23687a = sQLiteProgram;
    }

    @Override // e6.d
    public final void H(double d10, int i4) {
        this.f23687a.bindDouble(i4, d10);
    }

    @Override // e6.d
    public final void a(int i4, long j) {
        this.f23687a.bindLong(i4, j);
    }

    @Override // e6.d
    public final void b(int i4, byte[] bArr) {
        this.f23687a.bindBlob(i4, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23687a.close();
    }

    @Override // e6.d
    public final void d(int i4) {
        this.f23687a.bindNull(i4);
    }

    @Override // e6.d
    public final void k(int i4, String str) {
        k.e(str, "value");
        this.f23687a.bindString(i4, str);
    }
}
