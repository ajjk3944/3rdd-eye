package l2;

import java.util.Collections;
import v2.C5673a;

/* compiled from: ValueCallbackKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class q<K, A> extends AbstractC5268a<K, A> {
    public final A i;

    public q(B0.f fVar, A a10) {
        super(Collections.EMPTY_LIST);
        k(fVar);
        this.i = a10;
    }

    @Override // l2.AbstractC5268a
    public final float c() {
        return 1.0f;
    }

    @Override // l2.AbstractC5268a
    public final A f() {
        B0.f fVar = this.f43690e;
        float f10 = this.f43689d;
        A a10 = this.i;
        return (A) fVar.e(0.0f, 0.0f, a10, a10, f10, f10, f10);
    }

    @Override // l2.AbstractC5268a
    public final A g(C5673a<K> c5673a, float f10) {
        return f();
    }

    @Override // l2.AbstractC5268a
    public final void i() {
        if (this.f43690e != null) {
            super.i();
        }
    }

    @Override // l2.AbstractC5268a
    public final void j(float f10) {
        this.f43689d = f10;
    }
}
