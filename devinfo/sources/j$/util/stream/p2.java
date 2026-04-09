package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract class p2 extends h2 implements d2 {
    @Override // j$.util.stream.e2
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return v3.M(this, intFunction);
    }

    @Override // j$.util.stream.d2
    public final void g(Object obj) {
        ((d2) this.f26594a).g(obj);
        ((d2) this.f26595b).g(obj);
    }

    @Override // j$.util.stream.d2
    public final void f(int i4, Object obj) {
        e2 e2Var = this.f26594a;
        ((d2) e2Var).f(i4, obj);
        ((d2) this.f26595b).f(i4 + ((int) ((d2) e2Var).count()), obj);
    }

    @Override // j$.util.stream.d2
    public final Object b() {
        long j = this.f26596c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) j);
        f(0, objNewArray);
        return objNewArray;
    }

    public final String toString() {
        long j = this.f26596c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f26594a, this.f26595b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
