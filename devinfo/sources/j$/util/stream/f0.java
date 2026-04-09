package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class f0 extends i0 implements k5 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f26572c;

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f26573d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.i0, j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public final void accept(int i4) {
        n(Integer.valueOf(i4));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f26604a) {
            return new j$.util.c0(((Integer) this.f26605b).intValue());
        }
        return null;
    }

    static {
        b7 b7Var = b7.INT_VALUE;
        e0 e0Var = new e0(0);
        e0 e0Var2 = new e0(1);
        j$.util.c0 c0Var = j$.util.c0.f26293c;
        f26572c = new c0(true, b7Var, c0Var, e0Var, e0Var2);
        f26573d = new c0(false, b7Var, c0Var, new e0(0), new e0(1));
    }
}
