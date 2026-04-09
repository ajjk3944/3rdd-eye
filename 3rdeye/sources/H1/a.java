package H1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ProcessLock.android.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f2017e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2018a;

    /* renamed from: b, reason: collision with root package name */
    public final File f2019b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f2020c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f2021d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f2018a = z10;
        this.f2019b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f2017e;
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
        this.f2020c = lock;
    }

    public final void a(boolean z10) throws IOException {
        this.f2020c.lock();
        if (z10) {
            File file = this.f2019b;
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
                this.f2021d = channel;
            } catch (IOException e4) {
                this.f2021d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e4);
            }
        }
    }

    public final void b() throws IOException {
        try {
            FileChannel fileChannel = this.f2021d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f2020c.unlock();
    }
}
