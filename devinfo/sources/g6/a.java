package g6;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f24541e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24542a;

    /* renamed from: b, reason: collision with root package name */
    public final File f24543b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f24544c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f24545d;

    public a(File file, String str, boolean z3) {
        Lock lock;
        this.f24542a = z3;
        this.f24543b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f24541e;
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
        this.f24544c = lock;
    }

    public final void a(boolean z3) throws IOException {
        this.f24544c.lock();
        if (z3) {
            File file = this.f24543b;
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
                this.f24545d = channel;
            } catch (IOException e2) {
                this.f24545d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void b() throws IOException {
        try {
            FileChannel fileChannel = this.f24545d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f24544c.unlock();
    }
}
