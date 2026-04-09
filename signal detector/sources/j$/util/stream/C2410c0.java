package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.stream.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2410c0 extends AbstractC2447j2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2404b f21023c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2410c0(AbstractC2404b abstractC2404b, InterfaceC2472o2 interfaceC2472o2, int i) {
        super(interfaceC2472o2);
        this.f21022b = i;
        this.f21023c = abstractC2404b;
    }

    @Override // j$.util.stream.AbstractC2447j2, j$.util.stream.InterfaceC2472o2
    public void c(long j6) {
        switch (this.f21022b) {
            case 4:
                this.f21100a.c(-1L);
                break;
            default:
                super.c(j6);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC2467n2, j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        switch (this.f21022b) {
            case 0:
                this.f21100a.accept((InterfaceC2472o2) ((LongFunction) ((C2479q) this.f21023c).f21139t).apply(j6));
                return;
            case 1:
                ((C2493t) this.f21023c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j6);
                throw null;
            case 2:
                ((C2488s) this.f21023c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j6);
                throw null;
            case 3:
                ((r) this.f21023c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j6);
                throw null;
            case 4:
                ((C2493t) this.f21023c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j6);
                throw null;
            default:
                ((LongConsumer) ((C2425f0) this.f21023c).f21075t).accept(j6);
                this.f21100a.accept(j6);
                return;
        }
    }
}
