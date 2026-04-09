package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public class m implements q {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f19665a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19666b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19667c;

    public m(FileChannel fileChannel, long j6, long j7) {
        if (j6 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j7)));
        }
        if (j7 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j7)));
        }
        this.f19665a = fileChannel;
        this.f19666b = j6;
        this.f19667c = j7;
    }

    @Override // com.pgl.ssdk.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m a(long j6, long j7) {
        long jA = a();
        a(j6, j7, jA);
        return (j6 == 0 && j7 == jA) ? this : new m(this.f19665a, this.f19666b + j6, j7);
    }

    private static void a(long j6, long j7, long j8) {
        if (j6 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j6)));
        }
        if (j7 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j7)));
        }
        if (j6 > j8) {
            throw new IndexOutOfBoundsException("offset (" + j6 + ") > source size (" + j8 + ")");
        }
        long j9 = j6 + j7;
        if (j9 < j6) {
            throw new IndexOutOfBoundsException("offset (" + j6 + ") + size (" + j7 + ") overflow");
        }
        if (j9 <= j8) {
            return;
        }
        throw new IndexOutOfBoundsException("offset (" + j6 + ") + size (" + j7 + ") > source size (" + j8 + ")");
    }

    @Override // com.pgl.ssdk.q
    public long a() {
        long j6 = this.f19667c;
        if (j6 != -1) {
            return j6;
        }
        try {
            return this.f19665a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    public void a(long j6, int i, ByteBuffer byteBuffer) {
        int i3;
        a(j6, i, a());
        if (i == 0) {
            return;
        }
        if (i <= byteBuffer.remaining()) {
            long j7 = this.f19666b + j6;
            int iLimit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + i);
                while (i > 0) {
                    synchronized (this.f19665a) {
                        this.f19665a.position(j7);
                        i3 = this.f19665a.read(byteBuffer);
                    }
                    j7 += i3;
                    i -= i3;
                }
                return;
            } finally {
                byteBuffer.limit(iLimit);
            }
        }
        throw new BufferOverflowException();
    }

    @Override // com.pgl.ssdk.q
    public ByteBuffer a(long j6, int i) {
        if (i >= 0) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            a(j6, i, byteBufferAllocate);
            byteBufferAllocate.flip();
            return byteBufferAllocate;
        }
        throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i)));
    }
}
