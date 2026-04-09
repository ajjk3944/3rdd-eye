package z5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class b0 extends E5.b {

    /* renamed from: b, reason: collision with root package name */
    public final X f24519b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f24520c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f24521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24522e;

    public b0(X x6, c0 c0Var, Object obj) {
        this.f24521d = c0Var;
        this.f24522e = obj;
        this.f24519b = x6;
    }

    @Override // E5.b
    public final void b(Object obj, Object obj2) {
        E5.k kVar = (E5.k) obj;
        boolean z6 = obj2 == null;
        X x6 = this.f24519b;
        O o5 = z6 ? x6 : this.f24520c;
        if (o5 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E5.k.f1397a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, o5)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z6) {
                d0 d0Var = this.f24520c;
                q5.i.b(d0Var);
                x6.j(d0Var);
            }
        }
    }

    @Override // E5.b
    public final B2.a c(Object obj) {
        if (this.f24521d.y() == this.f24522e) {
            return null;
        }
        return E5.a.f1376e;
    }
}
