package v1;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class d implements u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f24699a;

    public d(SQLiteProgram sQLiteProgram) {
        this.f24699a = sQLiteProgram;
    }

    @Override // u1.d
    public void N(int i10, byte[] bArr) {
        this.f24699a.bindBlob(i10, bArr);
    }

    @Override // u1.d
    public void R(int i10) {
        this.f24699a.bindNull(i10);
    }

    @Override // u1.d
    public void c(int i10, double d10) {
        this.f24699a.bindDouble(i10, d10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24699a.close();
    }

    @Override // u1.d
    public void i(int i10, String str) {
        this.f24699a.bindString(i10, str);
    }

    @Override // u1.d
    public void s(int i10, long j10) {
        this.f24699a.bindLong(i10, j10);
    }
}
