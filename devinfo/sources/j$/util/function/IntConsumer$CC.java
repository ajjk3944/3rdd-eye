package j$.util.function;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* renamed from: j$.util.function.IntConsumer$-CC, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class IntConsumer$CC {
    public static IntConsumer $default$andThen(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.e
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return IntConsumer$CC.$default$andThen(this, intConsumer3);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i4) {
                intConsumer.accept(i4);
                intConsumer2.accept(i4);
            }
        };
    }
}
