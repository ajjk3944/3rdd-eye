package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
public final class F1 extends AbstractC2510w1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f20859h;
    public final /* synthetic */ double i;

    @Override // j$.util.stream.AbstractC2510w1
    public final R1 v0() {
        return new A1(this.i, this.f20859h);
    }

    public F1(EnumC2418d3 enumC2418d3, DoubleBinaryOperator doubleBinaryOperator, double d6) {
        this.f20859h = doubleBinaryOperator;
        this.i = d6;
    }
}
