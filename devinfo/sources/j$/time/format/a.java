package j$.time.format;

import j$.time.ZoneOffset;
import j$.util.a0;
import j$.util.b0;
import j$.util.function.Predicate$CC;
import j$.util.stream.d0;
import j$.util.x;
import j$.util.y;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements IntFunction, Supplier, BiConsumer, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction, Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26126a;

    public /* synthetic */ a(int i4) {
        this.f26126a = i4;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f26126a) {
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d10) {
        return Double.valueOf(d10);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d10, double d11) {
        switch (this.f26126a) {
            case 16:
                return Math.min(d10, d11);
            default:
                return Math.max(d10, d11);
        }
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return ((b0) obj).f26288a;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f26126a) {
            case 9:
                return new x();
            case 10:
                return new y();
            case 11:
                return new a0();
            case 12:
                return new LinkedHashSet();
            case 17:
                return new double[4];
            case 26:
                return new double[3];
            default:
                return new d0();
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d10) {
        switch (this.f26126a) {
            case 18:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                j$.util.stream.j.a(dArr, d10);
                dArr[3] = dArr[3] + d10;
                break;
            case 19:
            default:
                double[] dArr2 = (double[]) obj;
                j$.util.stream.j.a(dArr2, d10);
                dArr2[2] = dArr2[2] + d10;
                break;
            case 20:
                ((x) obj).accept(d10);
                break;
        }
    }

    public Object a(j$.time.temporal.n nVar) {
        switch (this.f26126a) {
            case 0:
                j$.time.v vVar = (j$.time.v) nVar.l(j$.time.temporal.r.f26222a);
                if (vVar == null || (vVar instanceof ZoneOffset)) {
                    return null;
                }
                return vVar;
            case 1:
                return (j$.time.v) nVar.l(j$.time.temporal.r.f26222a);
            case 2:
                return (j$.time.chrono.m) nVar.l(j$.time.temporal.r.f26223b);
            case 3:
                return (j$.time.temporal.s) nVar.l(j$.time.temporal.r.f26224c);
            case 4:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (nVar.e(aVar)) {
                    return ZoneOffset.I(nVar.i(aVar));
                }
                return null;
            case 5:
                j$.time.v vVar2 = (j$.time.v) nVar.l(j$.time.temporal.r.f26222a);
                return vVar2 != null ? vVar2 : (j$.time.v) nVar.l(j$.time.temporal.r.f26225d);
            case 6:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (nVar.e(aVar2)) {
                    return j$.time.f.L(nVar.w(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (nVar.e(aVar3)) {
                    return j$.time.i.G(nVar.w(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f26126a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f26126a) {
            case 13:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 14:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 15:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                j$.util.stream.j.a(dArr, dArr2[0]);
                j$.util.stream.j.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 16:
            case 17:
            case 18:
            default:
                ((x) obj).a((x) obj2);
                break;
            case 19:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                j$.util.stream.j.a(dArr3, dArr4[0]);
                j$.util.stream.j.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i4) {
        switch (this.f26126a) {
            case 8:
                return new Object[i4];
            default:
                return new Double[i4];
        }
    }
}
