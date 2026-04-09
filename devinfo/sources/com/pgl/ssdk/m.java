package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class m implements q {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f21536a;

    /* renamed from: b, reason: collision with root package name */
    private final long f21537b;

    /* renamed from: c, reason: collision with root package name */
    private final long f21538c;

    public m(FileChannel fileChannel, long j, long j8) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j8)));
        }
        if (j8 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j8)));
        }
        this.f21536a = fileChannel;
        this.f21537b = j;
        this.f21538c = j8;
    }

    @Override // com.pgl.ssdk.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m a(long j, long j8) {
        long jA = a();
        a(j, j8, jA);
        return (j == 0 && j8 == jA) ? this : new m(this.f21536a, this.f21537b + j, j8);
    }

    private static void a(long j, long j8, long j9) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j)));
        }
        if (j8 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j8)));
        }
        if (j > j9) {
            throw new IndexOutOfBoundsException(je.u.s(j9, ")", d.h.y(j, "offset (", ") > source size (")));
        }
        long j10 = j + j8;
        if (j10 < j) {
            throw new IndexOutOfBoundsException(je.u.s(j8, ") overflow", d.h.y(j, "offset (", ") + size (")));
        }
        if (j10 <= j9) {
            return;
        }
        StringBuilder sbY = d.h.y(j, "offset (", ") + size (");
        sbY.append(j8);
        sbY.append(") > source size (");
        sbY.append(j9);
        sbY.append(")");
        throw new IndexOutOfBoundsException(sbY.toString());
    }

    @Override // com.pgl.ssdk.q
    public long a() {
        long j = this.f21538c;
        if (j != -1) {
            return j;
        }
        try {
            return this.f21536a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    public void a(long j, int i4, ByteBuffer byteBuffer) throws IOException {
        int i10;
        a(j, i4, a());
        if (i4 == 0) {
            return;
        }
        if (i4 <= byteBuffer.remaining()) {
            long j8 = this.f21537b + j;
            int iLimit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + i4);
                while (i4 > 0) {
                    synchronized (this.f21536a) {
                        this.f21536a.position(j8);
                        i10 = this.f21536a.read(byteBuffer);
                    }
                    j8 += i10;
                    i4 -= i10;
                }
                return;
            } finally {
                byteBuffer.limit(iLimit);
            }
        }
        throw new BufferOverflowException();
    }

    @Override // com.pgl.ssdk.q
    public ByteBuffer a(long j, int i4) throws IOException {
        if (i4 >= 0) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i4);
            a(j, i4, byteBufferAllocate);
            byteBufferAllocate.flip();
            return byteBufferAllocate;
        }
        throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i4)));
    }
}
