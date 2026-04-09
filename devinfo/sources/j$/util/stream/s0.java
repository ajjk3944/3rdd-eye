package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final class s0 extends g5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f26752c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(a aVar, m5 m5Var, int i4) {
        super(m5Var);
        this.f26751b = i4;
        this.f26752c = aVar;
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public void c(long j) {
        switch (this.f26751b) {
            case 5:
                this.f26589a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // j$.util.stream.k5, java.util.function.IntConsumer
    public final void accept(int i4) {
        switch (this.f26751b) {
            case 0:
                this.f26589a.accept((m5) ((IntFunction) ((p) this.f26752c).f26707t).apply(i4));
                return;
            case 1:
                ((IntConsumer) ((t0) this.f26752c).f26759t).accept(i4);
                this.f26589a.accept(i4);
                return;
            case 2:
                ((r) this.f26752c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i4);
                throw null;
            case 3:
                ((s) this.f26752c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i4);
                throw null;
            case 4:
                ((u) this.f26752c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i4);
                throw null;
            default:
                ((r) this.f26752c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i4);
                throw null;
        }
    }
}
