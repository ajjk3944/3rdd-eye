package S1;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f3474e = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final T1.a f3475a;

    /* renamed from: b, reason: collision with root package name */
    public long f3476b = -2147483648L;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3477c;

    /* renamed from: d, reason: collision with root package name */
    public final b f3478d;

    public a(Context context, b bVar) {
        this.f3477c = context;
        this.f3478d = bVar;
        this.f3475a = new T1.a(bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3478d.vk();
        T1.a aVar = this.f3475a;
        if (aVar != null) {
            try {
                if (!aVar.f3565h) {
                    aVar.f3566j.close();
                }
                File file = aVar.f3561d;
                if (file != null) {
                    file.setLastModified(System.currentTimeMillis());
                }
                File file2 = aVar.f3562e;
                if (file2 != null) {
                    file2.setLastModified(System.currentTimeMillis());
                }
            } catch (Throwable unused) {
            }
            aVar.f3565h = true;
        }
        f3474e.remove(this.f3478d.aa());
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        if (this.f3476b == -2147483648L) {
            long j6 = -1;
            if (this.f3477c == null || TextUtils.isEmpty(this.f3478d.vk())) {
                return -1L;
            }
            T1.a aVar = this.f3475a;
            if (aVar.f3562e.exists()) {
                aVar.f3559b = aVar.f3562e.length();
            } else {
                synchronized (aVar.f3560c) {
                    int i = 0;
                    while (aVar.f3559b == -2147483648L && !aVar.f3565h) {
                        try {
                            i += 15;
                            try {
                                aVar.f3560c.wait(5L);
                                if (i > 20000) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new IOException("total length InterruptException");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.f3476b = j6;
            }
            j6 = aVar.f3559b;
            this.f3476b = j6;
        }
        return this.f3476b;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j6, byte[] bArr, int i, int i3) throws IOException {
        T1.a aVar = this.f3475a;
        aVar.getClass();
        try {
            int i6 = -1;
            if (j6 != aVar.f3559b) {
                int i7 = 0;
                int i8 = 0;
                do {
                    if (!aVar.f3565h) {
                        synchronized (aVar.f3560c) {
                            try {
                                File file = aVar.f3562e;
                                if (j6 < (file.exists() ? file.length() : aVar.f3561d.length())) {
                                    aVar.f3566j.seek(j6);
                                    i8 = aVar.f3566j.read(bArr, i, i3);
                                } else {
                                    i7 += 33;
                                    aVar.f3568l = j6;
                                    aVar.f3560c.wait(33L);
                                    aVar.f3568l = -1L;
                                }
                            } finally {
                            }
                        }
                        if (i8 > 0) {
                            i6 = i8;
                        } else if (aVar.f3567k.emc() && aVar.f3564g != -100 && (!aVar.i || aVar.f3559b == -1)) {
                            throw new IOException();
                        }
                    }
                } while (i7 < 20000);
                throw new SocketTimeoutException();
            }
            int length = bArr.length;
            return i6;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }
}
