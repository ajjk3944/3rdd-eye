package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rf0 extends e50 implements dy {
    public final /* synthetic */ int g;
    public final /* synthetic */ tf0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf0(tf0 tf0Var, sf0 sf0Var, int i) {
        super(1);
        this.g = i;
        this.h = tf0Var;
    }

    @Override // defpackage.dy
    public final Object g(Object obj) {
        switch (this.g) {
            case 0:
                this.h.d();
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tf0.h;
                tf0 tf0Var = this.h;
                atomicReferenceFieldUpdater.set(tf0Var, null);
                tf0Var.d();
                break;
        }
        return z31.a;
    }
}
