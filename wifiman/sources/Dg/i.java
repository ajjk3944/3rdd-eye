package Dg;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import zg.AbstractC8759l;

/* loaded from: classes4.dex */
public final class i implements f {

    /* renamed from: i, reason: collision with root package name */
    static final int f3316i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j, reason: collision with root package name */
    private static final Object f3317j = new Object();

    /* renamed from: b, reason: collision with root package name */
    int f3319b;

    /* renamed from: c, reason: collision with root package name */
    long f3320c;

    /* renamed from: d, reason: collision with root package name */
    final int f3321d;

    /* renamed from: e, reason: collision with root package name */
    AtomicReferenceArray f3322e;

    /* renamed from: f, reason: collision with root package name */
    final int f3323f;

    /* renamed from: g, reason: collision with root package name */
    AtomicReferenceArray f3324g;

    /* renamed from: a, reason: collision with root package name */
    final AtomicLong f3318a = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    final AtomicLong f3325h = new AtomicLong();

    public i(int i10) {
        int iA = AbstractC8759l.a(Math.max(8, i10));
        int i11 = iA - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iA + 1);
        this.f3322e = atomicReferenceArray;
        this.f3321d = i11;
        a(iA);
        this.f3324g = atomicReferenceArray;
        this.f3323f = i11;
        this.f3320c = iA - 2;
        p(0L);
    }

    private void a(int i10) {
        this.f3319b = Math.min(i10 / 4, f3316i);
    }

    private static int b(int i10) {
        return i10;
    }

    private static int c(long j10, int i10) {
        return b(((int) j10) & i10);
    }

    private long d() {
        return this.f3325h.get();
    }

    private long e() {
        return this.f3318a.get();
    }

    private long f() {
        return this.f3325h.get();
    }

    private static Object g(AtomicReferenceArray atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    private AtomicReferenceArray h(AtomicReferenceArray atomicReferenceArray, int i10) {
        int iB = b(i10);
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, iB);
        n(atomicReferenceArray, iB, null);
        return atomicReferenceArray2;
    }

    private long i() {
        return this.f3318a.get();
    }

    private Object j(AtomicReferenceArray atomicReferenceArray, long j10, int i10) {
        this.f3324g = atomicReferenceArray;
        int iC = c(j10, i10);
        Object objG = g(atomicReferenceArray, iC);
        if (objG != null) {
            n(atomicReferenceArray, iC, null);
            m(j10 + 1);
        }
        return objG;
    }

    private void l(AtomicReferenceArray atomicReferenceArray, long j10, int i10, Object obj, long j11) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f3322e = atomicReferenceArray2;
        this.f3320c = (j11 + j10) - 1;
        n(atomicReferenceArray2, i10, obj);
        o(atomicReferenceArray, atomicReferenceArray2);
        n(atomicReferenceArray, i10, f3317j);
        p(j10 + 1);
    }

    private void m(long j10) {
        this.f3325h.lazySet(j10);
    }

    private static void n(AtomicReferenceArray atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    private void o(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        n(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void p(long j10) {
        this.f3318a.lazySet(j10);
    }

    private boolean q(AtomicReferenceArray atomicReferenceArray, Object obj, long j10, int i10) {
        n(atomicReferenceArray, i10, obj);
        p(j10 + 1);
        return true;
    }

    @Override // Dg.g
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // Dg.g
    public boolean isEmpty() {
        return i() == f();
    }

    public boolean k(Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f3322e;
        long jI = i();
        int i10 = this.f3321d;
        long j10 = 2 + jI;
        if (g(atomicReferenceArray, c(j10, i10)) == null) {
            int iC = c(jI, i10);
            n(atomicReferenceArray, iC + 1, obj2);
            n(atomicReferenceArray, iC, obj);
            p(j10);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f3322e = atomicReferenceArray2;
        int iC2 = c(jI, i10);
        n(atomicReferenceArray2, iC2 + 1, obj2);
        n(atomicReferenceArray2, iC2, obj);
        o(atomicReferenceArray, atomicReferenceArray2);
        n(atomicReferenceArray, iC2, f3317j);
        p(j10);
        return true;
    }

    @Override // Dg.g
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f3322e;
        long jE = e();
        int i10 = this.f3321d;
        int iC = c(jE, i10);
        if (jE < this.f3320c) {
            return q(atomicReferenceArray, obj, jE, iC);
        }
        long j10 = this.f3319b + jE;
        if (g(atomicReferenceArray, c(j10, i10)) == null) {
            this.f3320c = j10 - 1;
            return q(atomicReferenceArray, obj, jE, iC);
        }
        if (g(atomicReferenceArray, c(1 + jE, i10)) == null) {
            return q(atomicReferenceArray, obj, jE, iC);
        }
        l(atomicReferenceArray, jE, iC, obj, i10);
        return true;
    }

    @Override // Dg.f, Dg.g
    public Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f3324g;
        long jD = d();
        int i10 = this.f3323f;
        int iC = c(jD, i10);
        Object objG = g(atomicReferenceArray, iC);
        boolean z10 = objG == f3317j;
        if (objG == null || z10) {
            if (z10) {
                return j(h(atomicReferenceArray, i10 + 1), jD, i10);
            }
            return null;
        }
        n(atomicReferenceArray, iC, null);
        m(jD + 1);
        return objG;
    }
}
