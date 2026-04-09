package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class d0 extends i0 implements j5 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f26548c;

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f26549d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.i0, j$.util.stream.m5
    public final void accept(double d10) {
        n(Double.valueOf(d10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f26604a) {
            return new j$.util.b0(((Double) this.f26605b).doubleValue());
        }
        return null;
    }

    static {
        b7 b7Var = b7.DOUBLE_VALUE;
        j$.time.format.a aVar = new j$.time.format.a(28);
        j$.time.format.a aVar2 = new j$.time.format.a(29);
        j$.util.b0 b0Var = j$.util.b0.f26287c;
        f26548c = new c0(true, b7Var, b0Var, aVar, aVar2);
        f26549d = new c0(false, b7Var, b0Var, new j$.time.format.a(28), new j$.time.format.a(29));
    }
}
