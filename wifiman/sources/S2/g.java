package s2;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public class g implements r2.g {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteProgram f61170a;

    public g(SQLiteProgram delegate) {
        AbstractC6492s.i(delegate, "delegate");
        this.f61170a = delegate;
    }

    @Override // r2.g
    public void bindBlob(int i10, byte[] value) {
        AbstractC6492s.i(value, "value");
        this.f61170a.bindBlob(i10, value);
    }

    @Override // r2.g
    public void bindDouble(int i10, double d10) {
        this.f61170a.bindDouble(i10, d10);
    }

    @Override // r2.g
    public void bindLong(int i10, long j10) {
        this.f61170a.bindLong(i10, j10);
    }

    @Override // r2.g
    public void bindNull(int i10) {
        this.f61170a.bindNull(i10);
    }

    @Override // r2.g
    public void bindString(int i10, String value) {
        AbstractC6492s.i(value, "value");
        this.f61170a.bindString(i10, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f61170a.close();
    }
}
