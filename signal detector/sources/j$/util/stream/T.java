package j$.util.stream;

import j$.util.C2390j;
import j$.util.C2392l;
import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class T implements ToIntFunction, IntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, Supplier, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction, Consumer, BinaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20967a;

    public /* synthetic */ T(int i) {
        this.f20967a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void o(Object obj) {
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f20967a) {
            case 4:
                break;
            case 9:
                break;
            case 13:
                break;
        }
        return j$.com.android.tools.r8.a.a(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f20967a) {
        }
        return j$.com.android.tools.r8.a.b(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j6) {
        switch (this.f20967a) {
            case 15:
                return Long.valueOf(j6);
            case 23:
                return AbstractC2510w1.f0(j6);
            case 25:
                return AbstractC2510w1.o0(j6);
            default:
                return AbstractC2510w1.p0(j6);
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i3) {
        switch (this.f20967a) {
            case 2:
                return Math.min(i, i3);
            case 5:
                return i + i3;
            default:
                return Math.max(i, i3);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j6, long j7) {
        switch (this.f20967a) {
            case 11:
                return Math.min(j6, j7);
            case 19:
                return Math.max(j6, j7);
            default:
                return j6 + j7;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.f20967a) {
            case 1:
                return Integer.valueOf(i);
            case 14:
                return new Long[i];
            default:
                return new Object[i];
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f20967a) {
            case 7:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j6) {
        switch (this.f20967a) {
            case 10:
                ((C2392l) obj).accept(j6);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j6;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f20967a) {
            case 4:
                ((C2390j) obj).a((C2390j) obj2);
                break;
            case 9:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 13:
                ((C2392l) obj).a((C2392l) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i) {
        switch (this.f20967a) {
            case 3:
                ((C2390j) obj).accept(i);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i;
                break;
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f20967a) {
            case 24:
                return new N0((A0) obj, (A0) obj2);
            case 25:
            case 27:
            default:
                return new R0((G0) obj, (G0) obj2);
            case 26:
                return new O0((C0) obj, (C0) obj2);
            case 28:
                return new P0((E0) obj, (E0) obj2);
        }
    }
}
