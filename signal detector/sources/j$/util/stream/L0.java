package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public final class L0 extends M0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20905k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i) {
        super(abstractC2510w1, spliterator, longFunction, binaryOperator);
        this.f20905k = i;
    }

    @Override // j$.util.stream.M0, j$.util.stream.AbstractC2419e
    public final AbstractC2419e c(Spliterator spliterator) {
        switch (this.f20905k) {
        }
        return new M0(this, spliterator);
    }

    @Override // j$.util.stream.M0, j$.util.stream.AbstractC2419e
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f20905k) {
        }
        return a();
    }
}
