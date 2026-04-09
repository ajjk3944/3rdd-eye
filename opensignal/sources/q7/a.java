package q7;

import io.sentry.android.core.e0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import xu.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f20720e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20721a;

    /* renamed from: b, reason: collision with root package name */
    public final File f20722b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f20723c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f20724d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f20721a = z10;
        this.f20722b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f20720e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f20723c = lock;
    }

    public final void a(boolean z10) throws IOException {
        this.f20723c.lock();
        if (z10) {
            File file = this.f20722b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = l.k(new FileOutputStream(file), file).getChannel();
                channel.lock();
                this.f20724d = channel;
            } catch (IOException e4) {
                this.f20724d = null;
                e0.q("SupportSQLiteLock", "Unable to grab file lock.", e4);
            }
        }
    }

    public final void b() throws IOException {
        try {
            FileChannel fileChannel = this.f20724d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f20723c.unlock();
    }
}
