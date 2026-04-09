package cv;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class r implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6735a;

    /* renamed from: d, reason: collision with root package name */
    public int f6736d;

    /* renamed from: g, reason: collision with root package name */
    public final ReentrantLock f6737g = new ReentrantLock();

    /* renamed from: r, reason: collision with root package name */
    public final RandomAccessFile f6738r;

    public r(RandomAccessFile randomAccessFile) {
        this.f6738r = randomAccessFile;
    }

    public final k b(long j) {
        ReentrantLock reentrantLock = this.f6737g;
        reentrantLock.lock();
        try {
            if (this.f6735a) {
                throw new IllegalStateException("closed");
            }
            this.f6736d++;
            reentrantLock.unlock();
            return new k(this, j);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f6737g;
        reentrantLock.lock();
        try {
            if (this.f6735a) {
                return;
            }
            this.f6735a = true;
            if (this.f6736d != 0) {
                return;
            }
            synchronized (this) {
                this.f6738r.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f6737g;
        reentrantLock.lock();
        try {
            if (this.f6735a) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f6738r.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
