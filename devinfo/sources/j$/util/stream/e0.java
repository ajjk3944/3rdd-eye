package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class e0 implements Predicate, Supplier, IntFunction, ToIntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26564a;

    public /* synthetic */ e0(int i4) {
        this.f26564a = i4;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void n(Object obj) {
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f26564a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f26564a) {
            case 12:
                break;
            case 17:
                break;
            case 21:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i4, int i10) {
        switch (this.f26564a) {
            case 10:
                return Math.min(i4, i10);
            case 13:
                return i4 + i10;
            default:
                return Math.max(i4, i10);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j8) {
        switch (this.f26564a) {
            case 19:
                return Math.min(j, j8);
            case 27:
                return Math.max(j, j8);
            default:
                return j + j8;
        }
    }

    public /* synthetic */ Predicate negate() {
        switch (this.f26564a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f26564a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f26564a) {
            case 0:
                return ((j$.util.c0) obj).f26294a;
            case 1:
            default:
                return ((Optional) obj).isPresent();
            case 2:
                return ((j$.util.d0) obj).f26365a;
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
        switch (this.f26564a) {
            case 1:
                return new f0();
            case 3:
                return new g0();
            case 5:
                return new h0();
            case 15:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        switch (this.f26564a) {
            case 18:
                ((j$.util.a0) obj).accept(j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f26564a) {
            case 12:
                ((j$.util.y) obj).a((j$.util.y) obj2);
                break;
            case 17:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 21:
                ((j$.util.a0) obj).a((j$.util.a0) obj2);
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
    public void accept(Object obj, int i4) {
        switch (this.f26564a) {
            case 11:
                ((j$.util.y) obj).accept(i4);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i4;
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i4) {
        switch (this.f26564a) {
            case 6:
                return new Object[i4];
            case 7:
                return new Integer[i4];
            case 8:
            default:
                return new Long[i4];
            case 9:
                return Integer.valueOf(i4);
        }
    }
}
