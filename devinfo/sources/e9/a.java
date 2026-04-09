package e9;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f22461e = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final f9.a f22462a;

    /* renamed from: b, reason: collision with root package name */
    public long f22463b = -2147483648L;

    /* renamed from: c, reason: collision with root package name */
    public final Context f22464c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bykv.vk.openvk.ouw.ouw.ouw.lh.a f22465d;

    public a(Context context, com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        this.f22464c = context;
        this.f22465d = aVar;
        this.f22462a = new f9.a(aVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        pk.a.y("SdkMediaDataSource", "close: ", this.f22465d.pno());
        f9.a aVar = this.f22462a;
        if (aVar != null) {
            try {
                if (!aVar.f23846h) {
                    aVar.j.close();
                }
                File file = aVar.f23843d;
                if (file != null) {
                    file.setLastModified(System.currentTimeMillis());
                }
                File file2 = aVar.f23844e;
                if (file2 != null) {
                    file2.setLastModified(System.currentTimeMillis());
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            aVar.f23846h = true;
        }
        f22461e.remove(this.f22465d.bly());
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        if (this.f22463b == -2147483648L) {
            long j = -1;
            if (this.f22464c == null || TextUtils.isEmpty(this.f22465d.pno())) {
                return -1L;
            }
            f9.a aVar = this.f22462a;
            if (aVar.f23844e.exists()) {
                aVar.f23841b = aVar.f23844e.length();
            } else {
                synchronized (aVar.f23842c) {
                    int i4 = 0;
                    while (aVar.f23841b == -2147483648L && !aVar.f23846h) {
                        try {
                            try {
                                pk.a.x("CSJ_MediaDLPlay", "totalLength: wait");
                                i4 += 15;
                                aVar.f23842c.wait(5L);
                                if (i4 > 20000) {
                                    break;
                                }
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                                throw new IOException("total length InterruptException");
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                this.f22463b = j;
                pk.a.x("SdkMediaDataSource", "getSize: " + this.f22463b);
            }
            pk.a.y("CSJ_MediaDLPlay", "totalLength= ", Long.valueOf(aVar.f23841b));
            j = aVar.f23841b;
            this.f22463b = j;
            pk.a.x("SdkMediaDataSource", "getSize: " + this.f22463b);
        }
        return this.f22463b;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i4, int i10) throws IOException {
        char c9;
        char c10;
        int i11;
        f9.a aVar = this.f22462a;
        aVar.getClass();
        try {
            int i12 = 3;
            int i13 = -1;
            if (j == aVar.f23841b) {
                i11 = i12;
                c9 = 2;
                c10 = 1;
            } else {
                int i14 = 0;
                int i15 = 0;
                while (!aVar.f23846h) {
                    synchronized (aVar.f23842c) {
                        try {
                            long length = aVar.f23844e.exists() ? aVar.f23844e.length() : aVar.f23843d.length();
                            c9 = 2;
                            c10 = 1;
                            if (j < length) {
                                Long lValueOf = Long.valueOf(j);
                                Object[] objArr = new Object[i12];
                                objArr[0] = "read:  read ";
                                objArr[1] = lValueOf;
                                objArr[2] = " success";
                                pk.a.y("CSJ_MediaDLPlay", objArr);
                                aVar.j.seek(j);
                                i15 = aVar.j.read(bArr, i4, i10);
                                i11 = i12;
                            } else {
                                i11 = i12;
                                Long lValueOf2 = Long.valueOf(j);
                                Long lValueOf3 = Long.valueOf(length);
                                Object[] objArr2 = new Object[4];
                                objArr2[0] = "read: wait at ";
                                objArr2[1] = lValueOf2;
                                objArr2[2] = ", file size = ";
                                objArr2[i11] = lValueOf3;
                                pk.a.y("CSJ_MediaDLPlay", objArr2);
                                i14 += 33;
                                aVar.f23849l = j;
                                aVar.f23842c.wait(33L);
                                aVar.f23849l = -1L;
                            }
                        } finally {
                        }
                    }
                    if (i15 > 0) {
                        i13 = i15;
                        break;
                    }
                    if (aVar.f23848k.ouw() && aVar.g != -100 && (!aVar.f23847i || aVar.f23841b == -1)) {
                        throw new IOException();
                    }
                    if (i14 >= 20000) {
                        throw new SocketTimeoutException();
                    }
                    i12 = i11;
                }
                i11 = i12;
                c9 = 2;
                c10 = 1;
            }
            Long lValueOf4 = Long.valueOf(j);
            Integer numValueOf = Integer.valueOf(bArr.length);
            Integer numValueOf2 = Integer.valueOf(i4);
            Integer numValueOf3 = Integer.valueOf(i13);
            Object[] objArr3 = new Object[8];
            objArr3[0] = "readAt: position = ";
            objArr3[c10] = lValueOf4;
            objArr3[c9] = "  buffer.length =";
            objArr3[i11] = numValueOf;
            objArr3[4] = "  offset = ";
            objArr3[5] = numValueOf2;
            objArr3[6] = " size =";
            objArr3[7] = numValueOf3;
            pk.a.y("SdkMediaDataSource", objArr3);
            return i13;
        } catch (Throwable th2) {
            if (th2 instanceof IOException) {
                throw th2;
            }
            throw new IOException();
        }
    }
}
