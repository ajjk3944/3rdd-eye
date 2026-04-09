package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final class M1 extends AbstractC2510w1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f20914h;
    public final /* synthetic */ int i;

    @Override // j$.util.stream.AbstractC2510w1
    public final R1 v0() {
        return new L1(this.i, this.f20914h);
    }

    public M1(EnumC2418d3 enumC2418d3, IntBinaryOperator intBinaryOperator, int i) {
        this.f20914h = intBinaryOperator;
        this.i = i;
    }
}
