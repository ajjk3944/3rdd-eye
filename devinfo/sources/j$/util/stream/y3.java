package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final class y3 extends v3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26822h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f26823i;

    public /* synthetic */ y3(b7 b7Var, Object obj, int i4) {
        this.f26822h = i4;
        this.f26823i = obj;
    }

    @Override // j$.util.stream.v3
    public final q4 v0() {
        switch (this.f26822h) {
            case 0:
                return new p4((LongBinaryOperator) this.f26823i);
            case 1:
                return new b4((DoubleBinaryOperator) this.f26823i);
            case 2:
                return new g4((BinaryOperator) this.f26823i);
            default:
                return new m4((IntBinaryOperator) this.f26823i);
        }
    }
}
