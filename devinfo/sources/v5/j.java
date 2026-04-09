package v5;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f35889a;

    /* renamed from: b, reason: collision with root package name */
    public final mk.a f35890b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f35891c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public int f35892d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35893e;

    /* renamed from: f, reason: collision with root package name */
    public final f[] f35894f;
    public final gl.h g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f35895h;

    public j(int i4, mk.a aVar) {
        this.f35889a = i4;
        this.f35890b = aVar;
        this.f35894f = new f[i4];
        int i10 = gl.i.f24768a;
        this.g = new gl.h(i4, 0);
        androidx.datastore.preferences.protobuf.k kVar = new androidx.datastore.preferences.protobuf.k();
        if (i4 < 1) {
            y.a.c("capacity must be >= 1");
            throw null;
        }
        if (i4 > 1073741824) {
            y.a.c("capacity must be <= 2^30");
            throw null;
        }
        i4 = Integer.bitCount(i4) != 1 ? Integer.highestOneBit(i4 - 1) << 1 : i4;
        kVar.f1002c = i4 - 1;
        kVar.f1003d = new Object[i4];
        this.f35895h = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r0.f(r4, r9.f24767b);
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ek.c r9) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.j.a(ek.c):java.lang.Object");
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f35891c;
        reentrantLock.lock();
        try {
            this.f35893e = true;
            for (f fVar : this.f35894f) {
                if (fVar != null) {
                    fVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(StringBuilder sb2) {
        androidx.datastore.preferences.protobuf.k kVar = this.f35895h;
        ReentrantLock reentrantLock = this.f35891c;
        reentrantLock.lock();
        try {
            ak.c cVarF = cm.g.f();
            int i4 = (kVar.f1001b - kVar.f1000a) & kVar.f1002c;
            for (int i10 = 0; i10 < i4; i10++) {
                if (i10 >= 0) {
                    int i11 = kVar.f1001b;
                    int i12 = kVar.f1000a;
                    int i13 = kVar.f1002c;
                    if (i10 < ((i11 - i12) & i13)) {
                        Object obj = ((Object[]) kVar.f1003d)[(i12 + i10) & i13];
                        nk.k.b(obj);
                        cVarF.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            ak.c cVarD = cm.g.d(cVarF);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f35889a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            gl.h hVar = this.g;
            hVar.getClass();
            sb3.append(Math.max(gl.g.g.get(hVar), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + cVarD.a() + ")[" + zj.n.g0(cVarD, null, null, null, null, 63) + "], ");
            sb2.append(")");
            sb2.append('\n');
            f[] fVarArr = this.f35894f;
            int length = fVarArr.length;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                f fVar = fVarArr[i15];
                i14++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i14);
                sb4.append("] - ");
                sb4.append(fVar != null ? fVar.f35874a.toString() : null);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (fVar != null) {
                    fVar.g(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(f fVar) {
        nk.k.e(fVar, "connection");
        ReentrantLock reentrantLock = this.f35891c;
        reentrantLock.lock();
        try {
            this.f35895h.c(fVar);
            reentrantLock.unlock();
            this.g.b();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
