package F9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: Atomic.kt */
/* renamed from: F9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0659b<T> extends s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1747a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0659b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = C0658a.f1744a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F9.s
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1747a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        y yVar = C0658a.f1744a;
        if (obj2 == yVar) {
            y yVarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == yVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, yVar, yVarC)) {
                        obj2 = yVarC;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != yVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t10, Object obj);

    public abstract y c(Object obj);
}
