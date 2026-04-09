package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class s1 extends b {
    public final j$.util.concurrent.t j;

    public s1(j$.util.concurrent.t tVar, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.j = tVar;
    }

    public s1(s1 s1Var, Spliterator spliterator) {
        super(s1Var, spliterator);
        this.j = s1Var.j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new s1(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        v3 v3Var = this.f26542a;
        q1 q1Var = (q1) ((Supplier) this.j.f26349c).get();
        v3Var.w0(this.f26543b, q1Var);
        boolean z3 = q1Var.f26726b;
        if (z3 == ((r1) this.j.f26348b).f26742b) {
            Boolean boolValueOf = Boolean.valueOf(z3);
            AtomicReference atomicReference = this.f26502h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return Boolean.valueOf(!((r1) this.j.f26348b).f26742b);
    }
}
