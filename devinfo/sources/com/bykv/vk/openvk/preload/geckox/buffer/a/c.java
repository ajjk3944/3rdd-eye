package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class c implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* renamed from: a, reason: collision with root package name */
    private long f6696a;

    /* renamed from: b, reason: collision with root package name */
    private long f6697b;

    /* renamed from: c, reason: collision with root package name */
    private RandomAccessFile f6698c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f6699d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private File f6700e;

    public c(long j, File file) throws IOException {
        this.f6696a = j;
        this.f6700e = file;
        file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f6698c = randomAccessFile;
            randomAccessFile.setLength(j);
        } catch (Exception e2) {
            CloseableUtils.close(this.f6698c);
            throw new IOException("create raf swap failed! path: " + file.getAbsolutePath() + " caused by: " + e2.getMessage(), e2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f6699d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.f6696a;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (this.f6699d.get()) {
            throw new IOException("released!");
        }
        return this.f6697b;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() throws IOException {
        if (this.f6699d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f6698c);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f6700e;
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
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f6699d
            boolean r0 = r0.get()
            if (r0 != 0) goto L1f
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L10
        Le:
            r4 = r0
            goto L17
        L10:
            long r0 = r3.f6696a
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            goto Le
        L17:
            r3.f6697b = r4
            java.io.RandomAccessFile r0 = r3.f6698c
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
    public final void a(int i4) throws IOException {
        a(new byte[]{(byte) i4});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j) throws IOException {
        int iSkipBytes;
        if (this.f6699d.get()) {
            throw new IOException("released!");
        }
        int i4 = (int) j;
        if (i4 == j) {
            iSkipBytes = this.f6698c.skipBytes(i4);
            this.f6697b = this.f6698c.getFilePointer();
        } else {
            throw new IOException("too large:".concat(String.valueOf(j)));
        }
        return iSkipBytes;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i4, int i10) throws IOException {
        if (!this.f6699d.get()) {
            if (bArr == null || i10 <= 0 || i4 < 0 || i4 >= bArr.length) {
                return 0;
            }
            if (i4 + i10 > bArr.length) {
                i10 = bArr.length - i4;
            }
            synchronized (this) {
                try {
                    long j = this.f6697b;
                    long j8 = this.f6696a;
                    if (j == j8) {
                        return -1;
                    }
                    if (i10 + j > j8) {
                        i10 = (int) (j8 - j);
                    }
                    int i11 = this.f6698c.read(bArr, i4, i10);
                    if (i11 == -1) {
                        return -1;
                    }
                    this.f6697b += i11;
                    return i11;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i4, int i10) throws IOException {
        if (!this.f6699d.get()) {
            if (bArr == null || bArr.length == 0 || i10 <= 0 || i4 < 0 || i4 >= bArr.length) {
                return 0;
            }
            if (i4 + i10 > bArr.length) {
                i10 = bArr.length - i4;
            }
            synchronized (this) {
                try {
                    long j = this.f6697b;
                    long j8 = this.f6696a;
                    if (j == j8) {
                        return 0;
                    }
                    if (i10 + j > j8) {
                        i10 = (int) (j8 - j);
                    }
                    this.f6698c.write(bArr, i4, i10);
                    this.f6697b += i10;
                    return i10;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IOException("released!");
    }
}
