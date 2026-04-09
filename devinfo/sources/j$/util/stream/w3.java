package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final class w3 extends v3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f26796h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f26797i;

    @Override // j$.util.stream.v3
    public final q4 v0() {
        return new o4(this.f26797i, this.f26796h);
    }

    public w3(b7 b7Var, LongBinaryOperator longBinaryOperator, long j) {
        this.f26796h = longBinaryOperator;
        this.f26797i = j;
    }
}
