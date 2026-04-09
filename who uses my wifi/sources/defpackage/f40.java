package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f40 extends y8 {
    public final b40 b;
    public oh0 c;
    public final /* synthetic */ g40 d;
    public final /* synthetic */ l20 e;

    public f40(b40 b40Var, g40 g40Var, l20 l20Var) {
        this.d = g40Var;
        this.e = l20Var;
        this.b = b40Var;
    }

    @Override // defpackage.y8
    public final void b(Object obj, Object obj2) {
        b80 b80Var = (b80) obj;
        boolean z = obj2 == null;
        b40 b40Var = this.b;
        Object obj3 = z ? b40Var : this.c;
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b80.f;
            while (!atomicReferenceFieldUpdater.compareAndSet(b80Var, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(b80Var) != this) {
                    return;
                }
            }
            if (z) {
                oh0 oh0Var = this.c;
                i30.j(oh0Var);
                b40Var.g(oh0Var);
            }
        }
    }

    @Override // defpackage.y8
    public final gs3 c(Object obj) {
        if (this.d.A() == this.e) {
            return null;
        }
        return m54.a;
    }
}
