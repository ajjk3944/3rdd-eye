package H5;

import c5.C0412i;
import i5.EnumC2380a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.AbstractC3046w;
import z5.C3030f;

/* loaded from: classes3.dex */
public final class d extends i implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1818g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = e.f1819a;

    public final Object c(j5.b bVar) {
        int i;
        char c6;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f1826f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i3 <= 0) {
                    c6 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    f1818g.set(this, null);
                    c6 = 0;
                    break;
                }
            }
        }
        C0412i c0412i = C0412i.f5929a;
        if (c6 != 0) {
            if (c6 != 1) {
                if (c6 != 2) {
                    throw new IllegalStateException("unexpected");
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
            }
            C3030f c3030fI = AbstractC3046w.i(com.bumptech.glide.c.B(bVar));
            try {
                a(new c(this, c3030fI));
                Object objS = c3030fI.s();
                EnumC2380a enumC2380a = EnumC2380a.f20635a;
                if (objS != enumC2380a) {
                    objS = c0412i;
                }
                if (objS == enumC2380a) {
                    return objS;
                }
            } catch (Throwable th) {
                c3030fI.A();
                throw th;
            }
        }
        return c0412i;
    }

    public final void d() {
        while (Math.max(i.f1826f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1818g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            B2.a aVar = e.f1819a;
            if (obj != aVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC3046w.h(this));
        sb.append("[isLocked=");
        sb.append(Math.max(i.f1826f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f1818g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
