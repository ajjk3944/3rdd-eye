package F9;

import F9.AbstractC0662e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: ConcurrentLinkedList.kt */
/* renamed from: F9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0662e<N extends AbstractC0662e<N>> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1750b = AtomicReferenceFieldUpdater.newUpdater(AbstractC0662e.class, Object.class, "_next$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1751c = AtomicReferenceFieldUpdater.newUpdater(AbstractC0662e.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC0662e(w wVar) {
        this._prev$volatile = wVar;
    }

    public final void b() {
        f1751c.set(this, null);
    }

    public final N c() {
        Object obj = f1750b.get(this);
        if (obj == C0661d.f1749a) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean d();

    public final void e() {
        AbstractC0662e abstractC0662eC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1751c;
            AbstractC0662e abstractC0662e = (AbstractC0662e) atomicReferenceFieldUpdater.get(this);
            while (abstractC0662e != null && abstractC0662e.d()) {
                abstractC0662e = (AbstractC0662e) atomicReferenceFieldUpdater.get(abstractC0662e);
            }
            AbstractC0662e abstractC0662eC2 = c();
            kotlin.jvm.internal.l.c(abstractC0662eC2);
            while (abstractC0662eC2.d() && (abstractC0662eC = abstractC0662eC2.c()) != null) {
                abstractC0662eC2 = abstractC0662eC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC0662eC2);
                AbstractC0662e abstractC0662e2 = ((AbstractC0662e) obj) == null ? null : abstractC0662e;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0662eC2, obj, abstractC0662e2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC0662eC2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC0662e != null) {
                f1750b.set(abstractC0662e, abstractC0662eC2);
            }
            if (!abstractC0662eC2.d() || abstractC0662eC2.c() == null) {
                if (abstractC0662e == null || !abstractC0662e.d()) {
                    return;
                }
            }
        }
    }
}
