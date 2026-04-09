package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class Z1 implements IntFunction, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20989a;

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i = this.f20989a;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f20989a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.f20989a) {
            case 0:
                return new Object[i];
            case 1:
                return new Integer[i];
            case 2:
                return new Long[i];
            case 3:
                return new Double[i];
            case 4:
            case 5:
            default:
                return new Double[i];
            case 6:
                return new Integer[i];
            case 7:
                return new Integer[i];
            case 8:
                return new Long[i];
            case 9:
                return new Long[i];
            case 10:
                return new Double[i];
        }
    }
}
