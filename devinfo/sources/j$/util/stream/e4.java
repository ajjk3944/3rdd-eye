package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
public final class e4 extends v3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f26565h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f26566i;

    @Override // j$.util.stream.v3
    public final q4 v0() {
        return new z3(this.f26566i, this.f26565h);
    }

    public e4(b7 b7Var, DoubleBinaryOperator doubleBinaryOperator, double d10) {
        this.f26565h = doubleBinaryOperator;
        this.f26566i = d10;
    }
}
