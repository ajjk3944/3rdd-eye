package y1;

import E.u;
import b9.C1992A;
import c9.C2097r;
import d9.C4284b;
import java.util.concurrent.locks.ReentrantLock;
import m0.C5310c;
import p9.InterfaceC5480a;

/* compiled from: ConnectionPoolImpl.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f47956a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5480a<E1.a> f47957b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f47958c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public int f47959d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f47960e;

    /* renamed from: f, reason: collision with root package name */
    public final C5797h[] f47961f;

    /* renamed from: g, reason: collision with root package name */
    public final K9.g f47962g;

    /* renamed from: h, reason: collision with root package name */
    public final C5310c<C5797h> f47963h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [E[], java.lang.Object[]] */
    public j(int i, InterfaceC5480a<? extends E1.a> interfaceC5480a) {
        this.f47956a = i;
        this.f47957b = interfaceC5480a;
        this.f47961f = new C5797h[i];
        int i10 = K9.i.f3772a;
        this.f47962g = new K9.g(i, 0);
        C5310c<C5797h> c5310c = new C5310c<>();
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        c5310c.f44015d = i - 1;
        c5310c.f44012a = new Object[i];
        this.f47963h = c5310c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r0.g(b9.C1992A.f18074a, r8.f3768c);
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(h9.c r8) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.j.a(h9.c):java.lang.Object");
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f47958c;
        reentrantLock.lock();
        try {
            this.f47960e = true;
            for (C5797h c5797h : this.f47961f) {
                if (c5797h != null) {
                    c5797h.close();
                }
            }
            C1992A c1992a = C1992A.f18074a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c(StringBuilder sb) {
        C5310c<C5797h> c5310c = this.f47963h;
        ReentrantLock reentrantLock = this.f47958c;
        reentrantLock.lock();
        try {
            C4284b c4284bU = u.u();
            int i = (c5310c.f44014c - c5310c.f44013b) & c5310c.f44015d;
            for (int i10 = 0; i10 < i; i10++) {
                if (i10 >= 0) {
                    int i11 = c5310c.f44014c;
                    int i12 = c5310c.f44013b;
                    int i13 = c5310c.f44015d;
                    if (i10 < ((i11 - i12) & i13)) {
                        C5797h c5797h = c5310c.f44012a[(i12 + i10) & i13];
                        kotlin.jvm.internal.l.c(c5797h);
                        c4284bU.add(c5797h);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            C4284b c4284bM = u.m(c4284bU);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f47956a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            K9.g gVar = this.f47962g;
            gVar.getClass();
            sb2.append(Math.max(K9.g.f3766h.get(gVar), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + c4284bM.c() + ")[" + C2097r.u0(c4284bM, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            C5797h[] c5797hArr = this.f47961f;
            int length = c5797hArr.length;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                C5797h c5797h2 = c5797hArr[i15];
                i14++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i14);
                sb3.append("] - ");
                sb3.append(c5797h2 != null ? c5797h2.f47948b.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (c5797h2 != null) {
                    c5797h2.d(sb);
                }
            }
            C1992A c1992a = C1992A.f18074a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(C5797h connection) {
        kotlin.jvm.internal.l.f(connection, "connection");
        ReentrantLock reentrantLock = this.f47958c;
        reentrantLock.lock();
        try {
            this.f47963h.a(connection);
            C1992A c1992a = C1992A.f18074a;
            reentrantLock.unlock();
            this.f47962g.d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
