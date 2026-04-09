package x3;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class u implements Closeable {

    public interface a {
        a a(Context context);

        u build();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        d().close();
    }

    public abstract f4.d d();

    public abstract t h();
}
