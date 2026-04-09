package j$.util.stream;

import j$.util.C2389i;
import j$.util.C2390j;
import j$.util.C2392l;
import j$.util.C2393m;
import j$.util.C2394n;
import j$.util.C2395o;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2399a implements IntFunction, Supplier, BiConsumer, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction, Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20992a;

    public /* synthetic */ C2399a(int i) {
        this.f20992a = i;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f20992a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f20992a) {
        }
        return j$.com.android.tools.r8.a.a(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d6) {
        return Double.valueOf(d6);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d6, double d7) {
        switch (this.f20992a) {
            case 8:
                return Math.min(d6, d7);
            default:
                return Math.max(d6, d7);
        }
    }

    public /* synthetic */ Predicate negate() {
        switch (this.f20992a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f20992a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f20992a) {
            case 20:
                return ((C2393m) obj).f20808a;
            case 21:
            case 23:
            default:
                return ((Optional) obj).isPresent();
            case 22:
                return ((C2394n) obj).f20811a;
            case 24:
                return ((C2395o) obj).f20814a;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f20992a) {
            case 1:
                return new C2389i();
            case 2:
                return new C2390j();
            case 3:
                return new C2392l();
            case 4:
                return new LinkedHashSet();
            case 9:
                return new double[4];
            case 18:
                return new double[3];
            case 21:
                return new E();
            case 23:
                return new F();
            case 25:
                return new G();
            default:
                return new H();
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d6) {
        switch (this.f20992a) {
            case 10:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                AbstractC2449k.a(dArr, d6);
                dArr[3] = dArr[3] + d6;
                break;
            case 11:
            default:
                double[] dArr2 = (double[]) obj;
                AbstractC2449k.a(dArr2, d6);
                dArr2[2] = dArr2[2] + d6;
                break;
            case 12:
                ((C2389i) obj).accept(d6);
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f20992a) {
            case 5:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 6:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 7:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC2449k.a(dArr, dArr2[0]);
                AbstractC2449k.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 8:
            case 9:
            case 10:
            default:
                ((C2389i) obj).a((C2389i) obj2);
                break;
            case 11:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC2449k.a(dArr3, dArr4[0]);
                AbstractC2449k.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.f20992a) {
            case 0:
                return new Object[i];
            case 16:
                return new Double[i];
            case 28:
                return new Object[i];
            default:
                return new Integer[i];
        }
    }
}
