package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes2.dex */
public final class o extends f5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26689b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f26690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(a aVar, m5 m5Var, int i4) {
        super(m5Var);
        this.f26689b = i4;
        this.f26690c = aVar;
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public void c(long j) {
        switch (this.f26689b) {
            case 4:
                this.f26578a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.m5
    public final void accept(double d10) {
        switch (this.f26689b) {
            case 0:
                this.f26578a.accept((m5) ((DoubleFunction) ((p) this.f26690c).f26707t).apply(d10));
                return;
            case 1:
                this.f26578a.accept(((DoubleUnaryOperator) ((q) this.f26690c).f26718t).applyAsDouble(d10));
                return;
            case 2:
                ((r) this.f26690c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d10);
                throw null;
            case 3:
                ((s) this.f26690c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d10);
                throw null;
            case 4:
                ((u) this.f26690c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d10);
                throw null;
            default:
                ((DoubleConsumer) ((q) this.f26690c).f26718t).accept(d10);
                this.f26578a.accept(d10);
                return;
        }
    }
}
