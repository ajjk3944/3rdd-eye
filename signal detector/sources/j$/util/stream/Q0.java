package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract class Q0 extends I0 implements F0 {
    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return AbstractC2510w1.M(this, intFunction);
    }

    @Override // j$.util.stream.F0
    public final void g(Object obj) {
        ((F0) this.f20880a).g(obj);
        ((F0) this.f20881b).g(obj);
    }

    @Override // j$.util.stream.F0
    public final void f(Object obj, int i) {
        G0 g02 = this.f20880a;
        ((F0) g02).f(obj, i);
        ((F0) this.f20881b).f(obj, i + ((int) ((F0) g02).count()));
    }

    @Override // j$.util.stream.F0
    public final Object b() {
        long j6 = this.f20882c;
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) j6);
        f(objNewArray, 0);
        return objNewArray;
    }

    public final String toString() {
        long j6 = this.f20882c;
        return j6 < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f20880a, this.f20881b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j6));
    }
}
