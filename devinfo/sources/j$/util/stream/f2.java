package j$.util.stream;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class f2 implements IntFunction, LongFunction, BinaryOperator, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26574a;

    public /* synthetic */ f2(int i4) {
        this.f26574a = i4;
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void n(Object obj) {
        int i4 = this.f26574a;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f26574a) {
        }
        return j$.com.android.tools.r8.a.c(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26574a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.f26574a) {
            case 1:
                return v3.f0(j);
            case 2:
            default:
                return v3.p0(j);
            case 3:
                return v3.o0(j);
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i4) {
        switch (this.f26574a) {
            case 0:
                return new Object[i4];
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            default:
                return new Double[i4];
            case 8:
                return new Object[i4];
            case 9:
                return new Integer[i4];
            case 10:
                return new Long[i4];
            case 11:
                return new Double[i4];
            case 14:
                return new Integer[i4];
            case 15:
                return new Integer[i4];
            case 16:
                return new Long[i4];
            case 17:
                return new Long[i4];
            case 18:
                return new Double[i4];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f26574a) {
            case 2:
                return new m2((y1) obj, (y1) obj2);
            case 3:
            case 5:
            default:
                return new q2((e2) obj, (e2) obj2);
            case 4:
                return new n2((a2) obj, (a2) obj2);
            case 6:
                return new o2((c2) obj, (c2) obj2);
        }
    }
}
