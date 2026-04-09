package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class c implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* renamed from: a, reason: collision with root package name */
    private long f6707a;

    /* renamed from: b, reason: collision with root package name */
    private long f6708b;

    /* renamed from: c, reason: collision with root package name */
    private RandomAccessFile f6709c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f6710d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private File f6711e;

    public c(long j6, File file) throws IOException {
        this.f6707a = j6;
        this.f6711e = file;
        file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f6709c = randomAccessFile;
            randomAccessFile.setLength(j6);
        } catch (Exception e6) {
            CloseableUtils.close(this.f6709c);
            throw new IOException("create raf swap failed! path: " + file.getAbsolutePath() + " caused by: " + e6.getMessage(), e6);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f6710d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.f6707a;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (this.f6710d.get()) {
            throw new IOException("released!");
        }
        return this.f6708b;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() {
        byte[] bArr = new byte[1];
        if (b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() throws IOException {
        if (this.f6710d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f6709c);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f6711e;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e A[PHI: r0
  0x000e: PHI (r0v5 long) = (r0v2 long), (r0v3 long) binds: [B:5:0x000c, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r4) throws java.io.IOException {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f6710d
            boolean r0 = r0.get()
            if (r0 != 0) goto L1f
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L10
        Le:
            r4 = r0
            goto L17
        L10:
            long r0 = r3.f6707a
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            goto Le
        L17:
            r3.f6708b = r4
            java.io.RandomAccessFile r0 = r3.f6709c
            r0.seek(r4)
            return
        L1f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "released!"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.buffer.a.c.b(long):void");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(int i) throws IOException {
        a(new byte[]{(byte) i});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j6) {
        int iSkipBytes;
        if (this.f6710d.get()) {
            throw new IOException("released!");
        }
        int i = (int) j6;
        if (i == j6) {
            iSkipBytes = this.f6709c.skipBytes(i);
            this.f6708b = this.f6709c.getFilePointer();
        } else {
            throw new IOException("too large:".concat(String.valueOf(j6)));
        }
        return iSkipBytes;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i, int i3) throws IOException {
        if (!this.f6710d.get()) {
            if (bArr == null || i3 <= 0 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i3 > bArr.length) {
                i3 = bArr.length - i;
            }
            synchronized (this) {
                try {
                    long j6 = this.f6708b;
                    long j7 = this.f6707a;
                    if (j6 == j7) {
                        return -1;
                    }
                    if (i3 + j6 > j7) {
                        i3 = (int) (j7 - j6);
                    }
                    int i6 = this.f6709c.read(bArr, i, i3);
                    if (i6 == -1) {
                        return -1;
                    }
                    this.f6708b += i6;
                    return i6;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i, int i3) throws IOException {
        if (!this.f6710d.get()) {
            if (bArr == null || bArr.length == 0 || i3 <= 0 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i3 > bArr.length) {
                i3 = bArr.length - i;
            }
            synchronized (this) {
                try {
                    long j6 = this.f6708b;
                    long j7 = this.f6707a;
                    if (j6 == j7) {
                        return 0;
                    }
                    if (i3 + j6 > j7) {
                        i3 = (int) (j7 - j6);
                    }
                    this.f6709c.write(bArr, i, i3);
                    this.f6708b += i3;
                    return i3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IOException("released!");
    }
}
