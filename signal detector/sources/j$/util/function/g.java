package j$.util.function;

import j$.util.C2387g;
import j$.util.Spliterator;
import j$.util.stream.A;
import j$.util.stream.AbstractC2404b;
import j$.util.stream.B;
import j$.util.stream.C;
import j$.util.stream.C2403a3;
import j$.util.stream.C2450k0;
import j$.util.stream.C2455l0;
import j$.util.stream.C2468n3;
import j$.util.stream.C2478p3;
import j$.util.stream.C2487r3;
import j$.util.stream.EnumC2408b3;
import j$.util.stream.G3;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC2460m0;
import j$.util.stream.InterfaceC2472o2;
import j$.util.stream.Stream;
import java.util.EnumMap;
import java.util.List;
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
public final /* synthetic */ class g implements Predicate, Supplier, DoubleFunction, Function, LongFunction, Consumer, BooleanSupplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20798a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20799b;

    public /* synthetic */ g(int i) {
        this.f20798a = i;
    }

    public /* synthetic */ g(Object obj, int i) {
        this.f20798a = i;
        this.f20799b = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void o(Object obj) {
        switch (this.f20798a) {
            case 6:
                ((InterfaceC2472o2) this.f20799b).o((InterfaceC2472o2) obj);
                break;
            default:
                ((List) this.f20799b).add(obj);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f20798a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
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
        return !((Predicate) this.f20799b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.f20799b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return C2403a3.f((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof C) {
            return B.f((C) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return A.f((DoubleStream) objApply);
        }
        if (objApply instanceof InterfaceC2460m0) {
            return C2455l0.f((InterfaceC2460m0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C2450k0.f((LongStream) objApply);
        }
        C2387g.a(objApply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d6) {
        Object objApply = ((DoubleFunction) this.f20799b).apply(d6);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof C) {
            return B.f((C) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return A.f((DoubleStream) objApply);
        }
        C2387g.a(objApply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j6) {
        Object objApply = ((LongFunction) this.f20799b).apply(j6);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC2460m0) {
            return C2455l0.f((InterfaceC2460m0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C2450k0.f((LongStream) objApply);
        }
        C2387g.a(objApply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f20798a) {
            case 9:
                C2468n3 c2468n3 = (C2468n3) this.f20799b;
                return c2468n3.f21068d.tryAdvance(c2468n3.f21069e);
            case 10:
                C2478p3 c2478p3 = (C2478p3) this.f20799b;
                return c2478p3.f21068d.tryAdvance(c2478p3.f21069e);
            case 11:
                C2487r3 c2487r3 = (C2487r3) this.f20799b;
                return c2487r3.f21068d.tryAdvance(c2487r3.f21069e);
            default:
                G3 g32 = (G3) this.f20799b;
                return g32.f21068d.tryAdvance(g32.f21069e);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f20798a) {
            case 1:
                return ((AbstractC2404b) this.f20799b).I0(0);
            default:
                return (Spliterator) this.f20799b;
        }
    }

    public void a(EnumC2408b3 enumC2408b3) {
        ((EnumMap) ((Map) this.f20799b)).put((EnumMap) enumC2408b3, (EnumC2408b3) 1);
    }
}
