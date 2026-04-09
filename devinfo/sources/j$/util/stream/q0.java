package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class q0 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public final v3 f26719a;

    /* renamed from: b, reason: collision with root package name */
    public Spliterator f26720b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26721c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f26722d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f26723e;

    /* renamed from: f, reason: collision with root package name */
    public final q0 f26724f;
    public e2 g;

    public q0(v3 v3Var, Spliterator spliterator, p0 p0Var) {
        super(null);
        this.f26719a = v3Var;
        this.f26720b = spliterator;
        this.f26721c = d.e(spliterator.estimateSize());
        this.f26722d = new ConcurrentHashMap(Math.max(16, d.g << 1));
        this.f26723e = p0Var;
        this.f26724f = null;
    }

    public q0(q0 q0Var, Spliterator spliterator, q0 q0Var2) {
        super(q0Var);
        this.f26719a = q0Var.f26719a;
        this.f26720b = spliterator;
        this.f26721c = q0Var.f26721c;
        this.f26722d = q0Var.f26722d;
        this.f26723e = q0Var.f26723e;
        this.f26724f = q0Var2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f26720b;
        long j = this.f26721c;
        boolean z3 = false;
        q0 q0Var = this;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            q0 q0Var2 = new q0(q0Var, spliteratorTrySplit, q0Var.f26724f);
            q0 q0Var3 = new q0(q0Var, spliterator, q0Var2);
            q0Var.addToPendingCount(1);
            q0Var3.addToPendingCount(1);
            q0Var.f26722d.put(q0Var2, q0Var3);
            if (q0Var.f26724f != null) {
                q0Var2.addToPendingCount(1);
                if (q0Var.f26722d.replace(q0Var.f26724f, q0Var, q0Var2)) {
                    q0Var.addToPendingCount(-1);
                } else {
                    q0Var2.addToPendingCount(-1);
                }
            }
            if (z3) {
                spliterator = spliteratorTrySplit;
                q0Var = q0Var2;
                q0Var2 = q0Var3;
            } else {
                q0Var = q0Var3;
            }
            z3 = !z3;
            q0Var2.fork();
        }
        if (q0Var.getPendingCount() > 0) {
            e0 e0Var = new e0(6);
            v3 v3Var = q0Var.f26719a;
            w1 w1VarT0 = v3Var.t0(v3Var.i0(spliterator), e0Var);
            q0Var.f26719a.w0(spliterator, w1VarT0);
            q0Var.g = w1VarT0.build();
            q0Var.f26720b = null;
        }
        q0Var.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        e2 e2Var = this.g;
        if (e2Var != null) {
            e2Var.forEach(this.f26723e);
            this.g = null;
        } else {
            Spliterator spliterator = this.f26720b;
            if (spliterator != null) {
                this.f26719a.w0(spliterator, this.f26723e);
                this.f26720b = null;
            }
        }
        q0 q0Var = (q0) this.f26722d.remove(this);
        if (q0Var != null) {
            q0Var.tryComplete();
        }
    }
}
