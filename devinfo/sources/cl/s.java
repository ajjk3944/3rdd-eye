package cl;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import xk.k1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class s extends c implements k1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2938d = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f2939c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public s(long j, s sVar, int i4) {
        super(sVar);
        this.f2939c = j;
        this.cleanedAndPointers$volatile = i4 << 16;
    }

    @Override // cl.c
    public final boolean d() {
        return f2938d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f2938d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i4, ck.h hVar);

    public final void i() {
        if (f2938d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f2938d;
            i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 65536 + i4));
        return true;
    }
}
