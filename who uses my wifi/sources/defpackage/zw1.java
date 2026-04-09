package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zw1 extends PushbackInputStream {
    public final /* synthetic */ xb4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw1(xb4 xb4Var, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.f = xb4Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        ((wy0) this.f.i).d();
        super.close();
    }
}
