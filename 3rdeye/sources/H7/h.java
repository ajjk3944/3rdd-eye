package H7;

import a9.InterfaceC1676a;
import android.database.Cursor;
import b9.C1992A;
import java.io.Closeable;
import p9.InterfaceC5480a;

/* compiled from: ReadState.kt */
/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5480a<C1992A> f2293b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1676a<Cursor> f2294c;

    /* renamed from: d, reason: collision with root package name */
    public Cursor f2295d;

    public h(InterfaceC5480a<C1992A> onCloseState, InterfaceC1676a<Cursor> interfaceC1676a) {
        kotlin.jvm.internal.l.f(onCloseState, "onCloseState");
        this.f2293b = onCloseState;
        this.f2294c = interfaceC1676a;
    }

    public final Cursor a() {
        if (this.f2295d != null) {
            throw new RuntimeException("Cursor should be called only once");
        }
        Cursor c10 = this.f2294c.get();
        this.f2295d = c10;
        kotlin.jvm.internal.l.e(c10, "c");
        return c10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Cursor cursor = this.f2295d;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        this.f2293b.invoke();
    }
}
