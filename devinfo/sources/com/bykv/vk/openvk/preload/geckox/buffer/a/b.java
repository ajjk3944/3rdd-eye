package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class b implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* renamed from: a, reason: collision with root package name */
    private RandomAccessFile f6693a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f6694b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private File f6695c;

    public b(File file) throws IOException {
        this.f6695c = file;
        file.getParentFile().mkdirs();
        try {
            this.f6693a = new RandomAccessFile(file, "rw");
        } catch (Exception e2) {
            CloseableUtils.close(this.f6693a);
            throw new IOException("create raf mSwap failed! path: " + file.getAbsolutePath() + " caused by: " + e2.getMessage(), e2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f6694b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() throws IOException {
        return this.f6693a.length();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (this.f6694b.get()) {
            throw new IOException("released!");
        }
        return this.f6693a.getFilePointer();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() throws IOException {
        if (this.f6694b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f6693a);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f6695c;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j) throws IOException {
        if (this.f6694b.get()) {
            throw new IOException("released!");
        }
        if (j < 0) {
            j = 0;
        }
        this.f6693a.seek(j);
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
        if (this.f6694b.get()) {
            throw new IOException("released!");
        }
        if (((int) j) == j) {
        } else {
            throw new IOException("too large:".concat(String.valueOf(j)));
        }
        return this.f6693a.skipBytes(r0);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i4, int i10) throws IOException {
        int i11;
        if (!this.f6694b.get()) {
            if (bArr == null || i10 <= 0 || i4 < 0 || i4 >= bArr.length) {
                return 0;
            }
            if (i4 + i10 > bArr.length) {
                i10 = bArr.length - i4;
            }
            synchronized (this) {
                i11 = this.f6693a.read(bArr, i4, i10);
            }
            return i11;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i4, int i10) throws IOException {
        if (!this.f6694b.get()) {
            if (bArr == null || bArr.length == 0 || i10 <= 0 || i4 < 0 || i4 >= bArr.length) {
                return 0;
            }
            if (i4 + i10 > bArr.length) {
                i10 = bArr.length - i4;
            }
            synchronized (this) {
                this.f6693a.write(bArr, i4, i10);
            }
            return i10;
        }
        throw new IOException("released!");
    }
}
