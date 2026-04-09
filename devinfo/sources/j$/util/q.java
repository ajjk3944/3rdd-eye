package j$.util;

import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import j$.util.stream.e8;
import j$.util.stream.l7;
import j$.util.stream.m5;
import j$.util.stream.n7;
import j$.util.stream.p7;
import j$.util.stream.y6;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Consumer, Predicate, Supplier, DoubleFunction, Function, LongFunction, BooleanSupplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26443a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26444b;

    public /* synthetic */ q(int i4) {
        this.f26443a = i4;
    }

    public /* synthetic */ q(int i4, Object obj) {
        this.f26443a = i4;
        this.f26444b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26443a) {
            case 0:
                break;
            case 7:
                break;
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f26444b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.f26444b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return y6.f((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof j$.util.stream.b0) {
            return j$.util.stream.a0.f((j$.util.stream.b0) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return j$.util.stream.z.f((DoubleStream) objApply);
        }
        if (objApply instanceof j$.util.stream.k1) {
            return j$.util.stream.j1.f((j$.util.stream.k1) objApply);
        }
        if (objApply instanceof LongStream) {
            return j$.util.stream.i1.f((LongStream) objApply);
        }
        g.a(objApply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d10) {
        Object objApply = ((DoubleFunction) this.f26444b).apply(d10);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.b0) {
            return j$.util.stream.a0.f((j$.util.stream.b0) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return j$.util.stream.z.f((DoubleStream) objApply);
        }
        g.a(objApply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.f26444b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.k1) {
            return j$.util.stream.j1.f((j$.util.stream.k1) objApply);
        }
        if (objApply instanceof LongStream) {
            return j$.util.stream.i1.f((LongStream) objApply);
        }
        g.a(objApply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f26443a) {
            case 9:
                l7 l7Var = (l7) this.f26444b;
                return l7Var.f26530d.tryAdvance(l7Var.f26531e);
            case 10:
                n7 n7Var = (n7) this.f26444b;
                return n7Var.f26530d.tryAdvance(n7Var.f26531e);
            case 11:
                p7 p7Var = (p7) this.f26444b;
                return p7Var.f26530d.tryAdvance(p7Var.f26531e);
            default:
                e8 e8Var = (e8) this.f26444b;
                return e8Var.f26530d.tryAdvance(e8Var.f26531e);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f26443a) {
            case 2:
                return ((j$.util.stream.a) this.f26444b).I0(0);
            default:
                return (Spliterator) this.f26444b;
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f26443a) {
            case 0:
                ((Consumer) this.f26444b).accept(new r((Map.Entry) obj));
                break;
            case 7:
                ((m5) this.f26444b).accept((m5) obj);
                break;
            default:
                ((java.util.List) this.f26444b).add(obj);
                break;
        }
    }
}
