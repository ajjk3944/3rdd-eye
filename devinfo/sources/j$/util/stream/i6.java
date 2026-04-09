package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class i6 extends c5 {

    /* renamed from: s, reason: collision with root package name */
    public final boolean f26618s;

    /* renamed from: t, reason: collision with root package name */
    public final Comparator f26619t;

    public i6(e5 e5Var) {
        super(e5Var, a7.f26489q | a7.f26487o);
        this.f26618s = true;
        this.f26619t = j$.util.f.INSTANCE;
    }

    public i6(e5 e5Var, Comparator comparator) {
        super(e5Var, a7.f26489q | a7.f26488p);
        this.f26618s = false;
        this.f26619t = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        Objects.requireNonNull(m5Var);
        if (a7.SORTED.l(i4) && this.f26618s) {
            return m5Var;
        }
        if (a7.SIZED.l(i4)) {
            return new n6(m5Var, this.f26619t);
        }
        return new j6(m5Var, this.f26619t);
    }

    @Override // j$.util.stream.a
    public final e2 E0(v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        if (a7.SORTED.l(((a) v3Var).f26462m) && this.f26618s) {
            return v3Var.h0(spliterator, false, intFunction);
        }
        Object[] objArrM = v3Var.h0(spliterator, true, intFunction).m(intFunction);
        Arrays.sort(objArrM, this.f26619t);
        return new i2(objArrM);
    }
}
