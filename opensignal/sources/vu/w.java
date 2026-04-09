package vu;

import cv.f0;
import cv.h0;

/* loaded from: classes.dex */
public final class w implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f24056a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24057d;

    /* renamed from: g, reason: collision with root package name */
    public final cv.g f24058g = new cv.g();

    /* renamed from: r, reason: collision with root package name */
    public final cv.g f24059r = new cv.g();

    /* renamed from: x, reason: collision with root package name */
    public boolean f24060x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y f24061y;

    public w(y yVar, long j, boolean z10) {
        this.f24061y = yVar;
        this.f24056a = j;
        this.f24057d = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        y yVar = this.f24061y;
        synchronized (yVar) {
            this.f24060x = true;
            cv.g gVar = this.f24059r;
            j = gVar.f6706d;
            gVar.b();
            yVar.notifyAll();
        }
        if (j > 0) {
            y yVar2 = this.f24061y;
            byte[] bArr = pu.b.f20645a;
            yVar2.f24064b.w(j);
        }
        this.f24061y.a();
    }

    @Override // cv.f0
    public final h0 g() {
        return this.f24061y.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0095 A[LOOP:0: B:4:0x000e->B:47:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0099 A[SYNTHETIC] */
    @Override // cv.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long u(cv.g r15, long r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vu.w.u(cv.g, long):long");
    }
}
