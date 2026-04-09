package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class x4 extends d {

    /* renamed from: h, reason: collision with root package name */
    public final v3 f26816h;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.f26545d;
        if (dVar != null) {
            q4 q4Var = (q4) ((x4) dVar).f26547f;
            q4Var.i((q4) ((x4) this.f26546e).f26547f);
            this.f26547f = q4Var;
        }
        super.onCompletion(countedCompleter);
    }

    public x4(v3 v3Var, v3 v3Var2, Spliterator spliterator) {
        super(v3Var2, spliterator);
        this.f26816h = v3Var;
    }

    public x4(x4 x4Var, Spliterator spliterator) {
        super(x4Var, spliterator);
        this.f26816h = x4Var.f26816h;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new x4(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        v3 v3Var = this.f26542a;
        q4 q4VarV0 = this.f26816h.v0();
        v3Var.w0(this.f26543b, q4VarV0);
        return q4VarV0;
    }
}
