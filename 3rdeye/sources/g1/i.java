package G1;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.l;

/* compiled from: FrameworkSQLiteProgram.android.kt */
/* loaded from: classes.dex */
public class i implements F1.d {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteProgram f1889b;

    public i(SQLiteProgram delegate) {
        l.f(delegate, "delegate");
        this.f1889b = delegate;
    }

    @Override // F1.d
    public final void b(int i, long j4) {
        this.f1889b.bindLong(i, j4);
    }

    @Override // F1.d
    public final void b0(int i, byte[] bArr) {
        this.f1889b.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1889b.close();
    }

    @Override // F1.d
    public final void f(int i) {
        this.f1889b.bindNull(i);
    }

    @Override // F1.d
    public final void h(int i, String value) {
        l.f(value, "value");
        this.f1889b.bindString(i, value);
    }

    @Override // F1.d
    public final void p(int i, double d10) {
        this.f1889b.bindDouble(i, d10);
    }
}
