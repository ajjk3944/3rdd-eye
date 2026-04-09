package Kj;

import android.util.Log;
import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class a implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    private static final String f10892c = "a";

    /* renamed from: a, reason: collision with root package name */
    private final long f10893a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10894b;

    protected a(long j10) {
        if (j10 == 0) {
            throw new IllegalArgumentException("Failed to load C++ pointer from JNI");
        }
        this.f10893a = j10;
    }

    protected void a() {
        if (isClosed()) {
            throw new IllegalStateException("Internal error: The task lib has already been closed.");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f10894b) {
            return;
        }
        g(this.f10893a);
        this.f10894b = true;
    }

    protected void finalize() throws Throwable {
        try {
            if (!this.f10894b) {
                Log.w(f10892c, "Closing an already closed native lib");
                close();
            }
        } finally {
            super.finalize();
        }
    }

    protected abstract void g(long j10);

    public long h() {
        return this.f10893a;
    }

    public boolean isClosed() {
        return this.f10894b;
    }
}
