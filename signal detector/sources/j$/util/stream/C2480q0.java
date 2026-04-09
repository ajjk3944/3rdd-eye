package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2480q0 extends AbstractC2489s0 implements InterfaceC2467n2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2467n2
    public final /* synthetic */ void l(Long l2) {
        AbstractC2510w1.I(this, l2);
    }

    @Override // j$.util.stream.AbstractC2489s0, j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        if (this.f21157a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j6);
        throw null;
    }
}
