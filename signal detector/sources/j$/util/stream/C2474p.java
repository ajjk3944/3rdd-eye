package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2474p extends AbstractC2437h2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2404b f21133c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2474p(AbstractC2404b abstractC2404b, InterfaceC2472o2 interfaceC2472o2, int i) {
        super(interfaceC2472o2);
        this.f21132b = i;
        this.f21133c = abstractC2404b;
    }

    @Override // j$.util.stream.AbstractC2437h2, j$.util.stream.InterfaceC2472o2
    public void c(long j6) {
        switch (this.f21132b) {
            case 4:
                this.f21082a.c(-1L);
                break;
            default:
                super.c(j6);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) {
        switch (this.f21132b) {
            case 0:
                this.f21082a.accept((InterfaceC2472o2) ((DoubleFunction) ((C2479q) this.f21133c).f21139t).apply(d6));
                return;
            case 1:
                ((r) this.f21133c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d6);
                throw null;
            case 2:
                ((C2488s) this.f21133c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d6);
                throw null;
            case 3:
                ((C2493t) this.f21133c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d6);
                throw null;
            case 4:
                ((r) this.f21133c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d6);
                throw null;
            default:
                ((DoubleConsumer) ((C2503v) this.f21133c).f21175t).accept(d6);
                this.f21082a.accept(d6);
                return;
        }
    }
}
