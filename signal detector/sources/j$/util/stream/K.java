package j$.util.stream;

import j$.util.C2387g;
import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public final class K implements IntFunction, LongFunction {

    /* renamed from: a, reason: collision with root package name */
    public IntFunction f20896a;

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        Object objApply = this.f20896a.apply(i);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        C2387g.a(objApply.getClass(), "java.util.stream.IntStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j6) {
        return AbstractC2510w1.X(j6, this.f20896a);
    }
}
