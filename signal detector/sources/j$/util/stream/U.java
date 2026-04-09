package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final class U extends AbstractC2442i2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2404b f20970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(AbstractC2404b abstractC2404b, InterfaceC2472o2 interfaceC2472o2, int i) {
        super(interfaceC2472o2);
        this.f20969b = i;
        this.f20970c = abstractC2404b;
    }

    @Override // j$.util.stream.AbstractC2442i2, j$.util.stream.InterfaceC2472o2
    public void c(long j6) {
        switch (this.f20969b) {
            case 5:
                this.f21088a.c(-1L);
                break;
            default:
                super.c(j6);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC2462m2, j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        switch (this.f20969b) {
            case 0:
                this.f21088a.accept((InterfaceC2472o2) ((IntFunction) ((C2479q) this.f20970c).f21139t).apply(i));
                return;
            case 1:
                ((IntConsumer) ((V) this.f20970c).f20972t).accept(i);
                this.f21088a.accept(i);
                return;
            case 2:
                ((C2488s) this.f20970c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i);
                throw null;
            case 3:
                ((C2493t) this.f20970c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i);
                throw null;
            case 4:
                ((r) this.f20970c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i);
                throw null;
            default:
                ((C2488s) this.f20970c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i);
                throw null;
        }
    }
}
