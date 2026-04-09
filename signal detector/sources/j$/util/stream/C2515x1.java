package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2515x1 extends AbstractC2510w1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f21192h;
    public final /* synthetic */ long i;

    @Override // j$.util.stream.AbstractC2510w1
    public final R1 v0() {
        return new P1(this.i, this.f21192h);
    }

    public C2515x1(EnumC2418d3 enumC2418d3, LongBinaryOperator longBinaryOperator, long j6) {
        this.f21192h = longBinaryOperator;
        this.i = j6;
    }
}
