package I0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f1883e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1884a;

    /* renamed from: b, reason: collision with root package name */
    public final File f1885b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f1886c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f1887d;

    public a(File file, String str, boolean z6) {
        Lock lock;
        this.f1884a = z6;
        this.f1885b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f1883e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1886c = lock;
    }

    public final void a(boolean z6) throws IOException {
        this.f1886c.lock();
        if (z6) {
            File file = this.f1885b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f1887d = channel;
            } catch (IOException e6) {
                this.f1887d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e6);
            }
        }
    }

    public final void b() throws IOException {
        try {
            FileChannel fileChannel = this.f1887d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f1886c.unlock();
    }
}
