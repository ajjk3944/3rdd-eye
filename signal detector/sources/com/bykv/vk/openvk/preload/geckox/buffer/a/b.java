package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class b implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* renamed from: a, reason: collision with root package name */
    private RandomAccessFile f6704a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f6705b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private File f6706c;

    public b(File file) throws IOException {
        this.f6706c = file;
        file.getParentFile().mkdirs();
        try {
            this.f6704a = new RandomAccessFile(file, "rw");
        } catch (Exception e6) {
            CloseableUtils.close(this.f6704a);
            throw new IOException("create raf mSwap failed! path: " + file.getAbsolutePath() + " caused by: " + e6.getMessage(), e6);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f6705b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.f6704a.length();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (this.f6705b.get()) {
            throw new IOException("released!");
        }
        return this.f6704a.getFilePointer();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() {
        byte[] bArr = new byte[1];
        if (b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() throws IOException {
        if (this.f6705b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f6704a);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f6706c;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j6) throws IOException {
        if (this.f6705b.get()) {
            throw new IOException("released!");
        }
        if (j6 < 0) {
            j6 = 0;
        }
        this.f6704a.seek(j6);
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
        if (this.f6705b.get()) {
            throw new IOException("released!");
        }
        if (((int) j6) == j6) {
        } else {
            throw new IOException("too large:".concat(String.valueOf(j6)));
        }
        return this.f6704a.skipBytes(r0);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i, int i3) throws IOException {
        int i6;
        if (!this.f6705b.get()) {
            if (bArr == null || i3 <= 0 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i3 > bArr.length) {
                i3 = bArr.length - i;
            }
            synchronized (this) {
                i6 = this.f6704a.read(bArr, i, i3);
            }
            return i6;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i, int i3) throws IOException {
        if (!this.f6705b.get()) {
            if (bArr == null || bArr.length == 0 || i3 <= 0 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i3 > bArr.length) {
                i3 = bArr.length - i;
            }
            synchronized (this) {
                this.f6704a.write(bArr, i, i3);
            }
            return i3;
        }
        throw new IOException("released!");
    }
}
