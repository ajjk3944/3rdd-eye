package t2;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8025a {

    /* renamed from: e, reason: collision with root package name */
    public static final C2168a f61710e = new C2168a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Map f61711f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f61712a;

    /* renamed from: b, reason: collision with root package name */
    private final File f61713b;

    /* renamed from: c, reason: collision with root package name */
    private final Lock f61714c;

    /* renamed from: d, reason: collision with root package name */
    private FileChannel f61715d;

    /* renamed from: t2.a$a, reason: collision with other inner class name */
    public static final class C2168a {
        public /* synthetic */ C2168a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (C8025a.f61711f) {
                try {
                    Map map = C8025a.f61711f;
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
            return lock;
        }

        private C2168a() {
        }
    }

    public C8025a(String name, File file, boolean z10) {
        File file2;
        AbstractC6492s.i(name, "name");
        this.f61712a = z10;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f61713b = file2;
        this.f61714c = f61710e.b(name);
    }

    public static /* synthetic */ void c(C8025a c8025a, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = c8025a.f61712a;
        }
        c8025a.b(z10);
    }

    public final void b(boolean z10) throws IOException {
        this.f61714c.lock();
        if (z10) {
            try {
                File file = this.f61713b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f61713b).getChannel();
                channel.lock();
                this.f61715d = channel;
            } catch (IOException e10) {
                this.f61715d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() throws IOException {
        try {
            FileChannel fileChannel = this.f61715d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f61714c.unlock();
    }
}
