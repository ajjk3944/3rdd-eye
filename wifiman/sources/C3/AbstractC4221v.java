package c3;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import k3.InterfaceC6370d;

/* renamed from: c3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4221v implements Closeable {

    /* renamed from: c3.v$a */
    interface a {
        AbstractC4221v a();

        a b(Context context);
    }

    AbstractC4221v() {
    }

    abstract InterfaceC6370d a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }

    abstract C4220u g();
}
