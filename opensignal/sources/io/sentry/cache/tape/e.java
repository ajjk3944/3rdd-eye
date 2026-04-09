package io.sentry.cache.tape;

import h7.h0;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    public final i f12138a;

    /* renamed from: d, reason: collision with root package name */
    public final c f12139d = new c();

    /* renamed from: g, reason: collision with root package name */
    public final h0 f12140g;

    public e(i iVar, h0 h0Var) {
        this.f12138a = iVar;
        this.f12140g = h0Var;
    }

    @Override // io.sentry.cache.tape.f
    public final void Y(int i10) {
        this.f12138a.n0(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3, types: [long] */
    /* JADX WARN: Type inference failed for: r28v4 */
    @Override // io.sentry.cache.tape.f
    public final void b(Object obj) throws IOException {
        long j;
        boolean z10;
        long j7;
        long j10;
        long j11;
        long j12;
        c cVar = this.f12139d;
        cVar.reset();
        h0 h0Var = this.f12140g;
        h0Var.getClass();
        io.sentry.e eVar = (io.sentry.e) obj;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(cVar, io.sentry.cache.f.f12132c));
        try {
            ((io.sentry.cache.f) h0Var.f10078a).f12133a.getSerializer().e(eVar, bufferedWriter);
            bufferedWriter.close();
            byte[] bArrB = cVar.b();
            int size = cVar.size();
            i iVar = this.f12138a;
            iVar.getClass();
            byte[] bArr = iVar.B;
            if (bArrB == null) {
                throw new NullPointerException("data == null");
            }
            if (size < 0 || size > bArrB.length) {
                throw new IndexOutOfBoundsException();
            }
            if (iVar.F) {
                throw new IllegalStateException("closed");
            }
            int i10 = iVar.E;
            if (i10 != -1 && iVar.f12151r == i10) {
                iVar.n0(1);
            }
            long j13 = size + 4;
            long j14 = iVar.f12150g;
            long jR0 = 32;
            if (iVar.f12151r == 0) {
                z10 = 1;
                j = 4;
                j7 = 32;
            } else {
                g gVar = iVar.f12153y;
                long j15 = gVar.f12142a;
                int i11 = gVar.f12143b;
                j = 4;
                long j16 = iVar.f12152x.f12142a;
                if (j15 >= j16) {
                    j7 = (j15 - j16) + 4 + i11 + 32;
                    z10 = 1;
                } else {
                    z10 = 1;
                    j7 = (((j15 + 4) + i11) + j14) - j16;
                }
            }
            long j17 = j14 - j7;
            if (j17 < j13) {
                do {
                    j17 += j14;
                    j14 <<= z10;
                } while (j17 < j13);
                iVar.f12148a.setLength(j14);
                iVar.f12148a.getChannel().force(z10);
                long jR02 = iVar.r0(iVar.f12153y.f12142a + j + r4.f12143b);
                if (jR02 <= iVar.f12152x.f12142a) {
                    FileChannel channel = iVar.f12148a.getChannel();
                    channel.position(iVar.f12150g);
                    j10 = jR02 - 32;
                    if (channel.transferTo(32L, j10, channel) != j10) {
                        throw new AssertionError("Copied insufficient number of bytes!");
                    }
                } else {
                    j10 = 0;
                }
                long j18 = iVar.f12153y.f12142a;
                long j19 = iVar.f12152x.f12142a;
                if (j18 < j19) {
                    j12 = 0;
                    long j20 = (iVar.f12150g + j18) - 32;
                    j11 = j14;
                    iVar.s0(iVar.f12151r, j11, j19, j20);
                    iVar.f12153y = new g(iVar.f12153y.f12143b, j20);
                } else {
                    j11 = j14;
                    j12 = 0;
                    iVar.s0(iVar.f12151r, j11, j19, j18);
                }
                iVar.f12150g = j11;
                long j21 = 32;
                long j22 = j10;
                while (j22 > j12) {
                    int iMin = (int) Math.min(j22, 4096);
                    iVar.q0(iMin, j21, i.G);
                    long j23 = iMin;
                    j22 -= j23;
                    j21 += j23;
                }
            }
            boolean z11 = iVar.f12151r == 0;
            if (!z11) {
                jR0 = iVar.r0(iVar.f12153y.f12142a + j + r4.f12143b);
            }
            long j24 = jR0;
            g gVar2 = new g(size, j24);
            i.t0(bArr, 0, size);
            iVar.q0(4, j24, bArr);
            iVar.q0(size, j24 + j, bArrB);
            iVar.s0(iVar.f12151r + 1, iVar.f12150g, z11 ? j24 : iVar.f12152x.f12142a, j24);
            iVar.f12153y = gVar2;
            iVar.f12151r++;
            iVar.D++;
            if (z11) {
                iVar.f12152x = gVar2;
            }
        } finally {
        }
    }

    @Override // io.sentry.cache.tape.f
    public final void clear() throws IOException {
        this.f12138a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12138a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        i iVar = this.f12138a;
        iVar.getClass();
        return new d(this, new h(iVar));
    }

    @Override // io.sentry.cache.tape.f
    public final int size() {
        return this.f12138a.f12151r;
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.f12138a + '}';
    }
}
