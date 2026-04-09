package s1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final Map f24226e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final File f24227a;

    /* renamed from: b, reason: collision with root package name */
    public final Lock f24228b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24229c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f24230d;

    public a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f24227a = file2;
        this.f24228b = a(file2.getAbsolutePath());
        this.f24229c = z10;
    }

    public static Lock a(String str) {
        Lock reentrantLock;
        Map map = f24226e;
        synchronized (map) {
            try {
                reentrantLock = (Lock) map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return reentrantLock;
    }

    public void b() throws IOException {
        this.f24228b.lock();
        if (this.f24229c) {
            try {
                FileChannel channel = new FileOutputStream(this.f24227a).getChannel();
                this.f24230d = channel;
                channel.lock();
            } catch (IOException e10) {
                throw new IllegalStateException("Unable to grab copy lock.", e10);
            }
        }
    }

    public void c() throws IOException {
        FileChannel fileChannel = this.f24230d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f24228b.unlock();
    }
}
