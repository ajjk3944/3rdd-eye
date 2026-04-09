package cv;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class k implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f6719a;

    /* renamed from: d, reason: collision with root package name */
    public long f6720d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6721g;

    public k(r rVar, long j) {
        this.f6719a = rVar;
        this.f6720d = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r rVar = this.f6719a;
        if (this.f6721g) {
            return;
        }
        this.f6721g = true;
        ReentrantLock reentrantLock = rVar.f6737g;
        reentrantLock.lock();
        try {
            int i10 = rVar.f6736d - 1;
            rVar.f6736d = i10;
            if (i10 == 0) {
                if (rVar.f6735a) {
                    synchronized (rVar) {
                        rVar.f6738r.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // cv.f0
    public final h0 g() {
        return h0.f6707d;
    }

    @Override // cv.f0
    public final long u(g gVar, long j) {
        long j7;
        long j10;
        int i10;
        br.l.e(gVar, "sink");
        if (this.f6721g) {
            throw new IllegalStateException("closed");
        }
        r rVar = this.f6719a;
        long j11 = this.f6720d;
        if (j < 0) {
            throw new IllegalArgumentException(c7.a.m(j, "byteCount < 0: ").toString());
        }
        long j12 = j + j11;
        long j13 = j11;
        while (true) {
            if (j13 >= j12) {
                j7 = -1;
                break;
            }
            a0 a0VarF0 = gVar.f0(1);
            byte[] bArr = a0VarF0.f6678a;
            int i11 = a0VarF0.f6680c;
            j7 = -1;
            int iMin = (int) Math.min(j12 - j13, 8192 - i11);
            synchronized (rVar) {
                br.l.e(bArr, "array");
                rVar.f6738r.seek(j13);
                i10 = 0;
                while (true) {
                    if (i10 >= iMin) {
                        break;
                    }
                    int i12 = rVar.f6738r.read(bArr, i11, iMin - i10);
                    if (i12 != -1) {
                        i10 += i12;
                    } else if (i10 == 0) {
                        i10 = -1;
                    }
                }
            }
            if (i10 == -1) {
                if (a0VarF0.f6679b == a0VarF0.f6680c) {
                    gVar.f6705a = a0VarF0.a();
                    b0.a(a0VarF0);
                }
                if (j11 == j13) {
                    j10 = -1;
                }
            } else {
                a0VarF0.f6680c += i10;
                long j14 = i10;
                j13 += j14;
                gVar.f6706d += j14;
            }
        }
        j10 = j13 - j11;
        if (j10 != j7) {
            this.f6720d += j10;
        }
        return j10;
    }
}
