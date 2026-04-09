package p7;

import android.database.sqlite.SQLiteProgram;
import br.l;

/* loaded from: classes.dex */
public class j implements o7.c {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f20334a;

    public j(SQLiteProgram sQLiteProgram) {
        l.e(sQLiteProgram, "delegate");
        this.f20334a = sQLiteProgram;
    }

    @Override // o7.c
    public final void A(int i10, long j) {
        this.f20334a.bindLong(i10, j);
    }

    @Override // o7.c
    public final void T(double d6, int i10) {
        this.f20334a.bindDouble(i10, d6);
    }

    @Override // o7.c
    public final void U(int i10) {
        this.f20334a.bindNull(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20334a.close();
    }

    @Override // o7.c
    public final void m(int i10, String str) {
        l.e(str, "value");
        this.f20334a.bindString(i10, str);
    }
}
