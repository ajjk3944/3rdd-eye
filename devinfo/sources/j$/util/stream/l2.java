package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public class l2 extends d {

    /* renamed from: h, reason: collision with root package name */
    public final v3 f26659h;

    /* renamed from: i, reason: collision with root package name */
    public final LongFunction f26660i;
    public final BinaryOperator j;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.f26545d;
        if (dVar != null) {
            this.f26547f = (e2) this.j.apply((e2) ((l2) dVar).f26547f, (e2) ((l2) this.f26546e).f26547f);
        }
        super.onCompletion(countedCompleter);
    }

    public l2(v3 v3Var, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(v3Var, spliterator);
        this.f26659h = v3Var;
        this.f26660i = longFunction;
        this.j = binaryOperator;
    }

    public l2(l2 l2Var, Spliterator spliterator) {
        super(l2Var, spliterator);
        this.f26659h = l2Var.f26659h;
        this.f26660i = l2Var.f26660i;
        this.j = l2Var.j;
    }

    @Override // j$.util.stream.d
    public d c(Spliterator spliterator) {
        return new l2(this, spliterator);
    }

    @Override // j$.util.stream.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final e2 a() {
        w1 w1Var = (w1) this.f26660i.apply(this.f26659h.i0(this.f26543b));
        this.f26659h.w0(this.f26543b, w1Var);
        return w1Var.build();
    }
}
