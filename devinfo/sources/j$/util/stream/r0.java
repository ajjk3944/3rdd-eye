package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class r0 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public Spliterator f26736a;

    /* renamed from: b, reason: collision with root package name */
    public final m5 f26737b;

    /* renamed from: c, reason: collision with root package name */
    public final v3 f26738c;

    /* renamed from: d, reason: collision with root package name */
    public long f26739d;

    public r0(v3 v3Var, Spliterator spliterator, m5 m5Var) {
        super(null);
        this.f26737b = m5Var;
        this.f26738c = v3Var;
        this.f26736a = spliterator;
        this.f26739d = 0L;
    }

    public r0(r0 r0Var, Spliterator spliterator) {
        super(r0Var);
        this.f26736a = spliterator;
        this.f26737b = r0Var.f26737b;
        this.f26739d = r0Var.f26739d;
        this.f26738c = r0Var.f26738c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f26736a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f26739d;
        if (jE == 0) {
            jE = d.e(jEstimateSize);
            this.f26739d = jE;
        }
        boolean zL = a7.SHORT_CIRCUIT.l(((a) this.f26738c).f26462m);
        m5 m5Var = this.f26737b;
        boolean z3 = false;
        r0 r0Var = this;
        while (true) {
            if (zL && m5Var.e()) {
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            r0 r0Var2 = new r0(r0Var, spliteratorTrySplit);
            r0Var.addToPendingCount(1);
            if (z3) {
                spliterator = spliteratorTrySplit;
            } else {
                r0 r0Var3 = r0Var;
                r0Var = r0Var2;
                r0Var2 = r0Var3;
            }
            z3 = !z3;
            r0Var.fork();
            r0Var = r0Var2;
            jEstimateSize = spliterator.estimateSize();
        }
        r0Var.f26738c.d0(spliterator, m5Var);
        r0Var.f26736a = null;
        r0Var.propagateCompletion();
    }
}
