package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.stream.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2525z1 extends AbstractC2510w1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21210h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C2525z1(EnumC2418d3 enumC2418d3, Object obj, int i) {
        this.f21210h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final R1 v0() {
        switch (this.f21210h) {
            case 0:
                return new Q1((LongBinaryOperator) this.i);
            case 1:
                return new C1((DoubleBinaryOperator) this.i);
            case 2:
                return new H1((BinaryOperator) this.i);
            default:
                return new N1((IntBinaryOperator) this.i);
        }
    }
}
