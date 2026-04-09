package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pv3 {
    public static final pv3 b = new pv3();
    public final AtomicReference a = new AtomicReference(new dw3(new mr2(14)));

    public final synchronized void a(aw3 aw3Var) {
        AtomicReference atomicReference = this.a;
        mr2 mr2Var = new mr2((dw3) atomicReference.get());
        mr2Var.u(aw3Var);
        atomicReference.set(new dw3(mr2Var));
    }

    public final synchronized void b(ew3 ew3Var) {
        AtomicReference atomicReference = this.a;
        mr2 mr2Var = new mr2((dw3) atomicReference.get());
        mr2Var.y(ew3Var);
        atomicReference.set(new dw3(mr2Var));
    }
}
