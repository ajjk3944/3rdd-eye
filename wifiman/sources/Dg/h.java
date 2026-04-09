package Dg;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import zg.AbstractC8759l;

/* loaded from: classes4.dex */
public final class h extends AtomicReferenceArray implements f {

    /* renamed from: f, reason: collision with root package name */
    private static final Integer f3310f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: a, reason: collision with root package name */
    final int f3311a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicLong f3312b;

    /* renamed from: c, reason: collision with root package name */
    long f3313c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicLong f3314d;

    /* renamed from: e, reason: collision with root package name */
    final int f3315e;

    public h(int i10) {
        super(AbstractC8759l.a(i10));
        this.f3311a = length() - 1;
        this.f3312b = new AtomicLong();
        this.f3314d = new AtomicLong();
        this.f3315e = Math.min(i10 / 4, f3310f.intValue());
    }

    int a(long j10) {
        return ((int) j10) & this.f3311a;
    }

    int c(long j10, int i10) {
        return ((int) j10) & i10;
    }

    @Override // Dg.g
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    Object d(int i10) {
        return get(i10);
    }

    void g(long j10) {
        this.f3314d.lazySet(j10);
    }

    void h(int i10, Object obj) {
        lazySet(i10, obj);
    }

    @Override // Dg.g
    public boolean isEmpty() {
        return this.f3312b.get() == this.f3314d.get();
    }

    void j(long j10) {
        this.f3312b.lazySet(j10);
    }

    @Override // Dg.g
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.f3311a;
        long j10 = this.f3312b.get();
        int iC = c(j10, i10);
        if (j10 >= this.f3313c) {
            long j11 = this.f3315e + j10;
            if (d(c(j11, i10)) == null) {
                this.f3313c = j11;
            } else if (d(iC) != null) {
                return false;
            }
        }
        h(iC, obj);
        j(j10 + 1);
        return true;
    }

    @Override // Dg.f, Dg.g
    public Object poll() {
        long j10 = this.f3314d.get();
        int iA = a(j10);
        Object objD = d(iA);
        if (objD == null) {
            return null;
        }
        g(j10 + 1);
        h(iA, null);
        return objD;
    }
}
