package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final class l4 extends v3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f26661h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26662i;

    @Override // j$.util.stream.v3
    public final q4 v0() {
        return new k4(this.f26662i, this.f26661h);
    }

    public l4(b7 b7Var, IntBinaryOperator intBinaryOperator, int i4) {
        this.f26661h = intBinaryOperator;
        this.f26662i = i4;
    }
}
