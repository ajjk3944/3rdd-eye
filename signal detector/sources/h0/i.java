package H0;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class i implements G0.c {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f1751a;

    public i(SQLiteProgram sQLiteProgram) {
        q5.i.e(sQLiteProgram, "delegate");
        this.f1751a = sQLiteProgram;
    }

    @Override // G0.c
    public final void c(int i, String str) {
        q5.i.e(str, "value");
        this.f1751a.bindString(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1751a.close();
    }

    @Override // G0.c
    public final void f(int i, long j6) {
        this.f1751a.bindLong(i, j6);
    }

    @Override // G0.c
    public final void g(int i, byte[] bArr) {
        this.f1751a.bindBlob(i, bArr);
    }

    @Override // G0.c
    public final void j(double d6, int i) {
        this.f1751a.bindDouble(i, d6);
    }

    @Override // G0.c
    public final void l(int i) {
        this.f1751a.bindNull(i);
    }
}
