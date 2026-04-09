package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.stream.AbstractC2404b;
import j$.util.stream.AbstractC2489s0;
import j$.util.stream.AbstractC2510w1;
import j$.util.stream.C2458l3;
import j$.util.stream.C2470o0;
import j$.util.stream.C2499u0;
import j$.util.stream.EnumC2413c3;
import j$.util.stream.EnumC2418d3;
import j$.util.stream.EnumC2494t0;
import j$.util.stream.I3;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer, Supplier, I3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20761a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20762b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20763c;

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.f20761a = i;
        this.f20762b = obj;
        this.f20763c = obj2;
    }

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.f20761a = 2;
        this.f20763c = biFunction;
        this.f20762b = function;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f20761a) {
        }
        return j$.com.android.tools.r8.a.a(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.com.android.tools.r8.a.b(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f20761a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f20762b).apply(((BiFunction) this.f20763c).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f20761a) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) this.f20762b;
                BiFunction biFunction = (BiFunction) this.f20763c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
            default:
                BiConsumer biConsumer = (BiConsumer) this.f20762b;
                BiConsumer biConsumer2 = (BiConsumer) this.f20763c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                break;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C2470o0((EnumC2494t0) this.f20762b, (Predicate) this.f20763c);
    }

    public t(EnumC2418d3 enumC2418d3, EnumC2494t0 enumC2494t0, Supplier supplier) {
        this.f20761a = 6;
        this.f20762b = enumC2494t0;
        this.f20763c = supplier;
    }

    @Override // j$.util.stream.I3
    public int v() {
        return EnumC2413c3.f21041u | EnumC2413c3.f21038r;
    }

    @Override // j$.util.stream.I3
    public Object f(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        AbstractC2489s0 abstractC2489s0 = (AbstractC2489s0) ((Supplier) this.f20763c).get();
        abstractC2404b.w0(spliterator, abstractC2489s0);
        return Boolean.valueOf(abstractC2489s0.f21158b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.I3
    public Object j(AbstractC2510w1 abstractC2510w1, Spliterator spliterator) {
        return (Boolean) new C2499u0(this, (AbstractC2404b) abstractC2510w1, spliterator).invoke();
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f20761a) {
            case 3:
                Consumer consumer = (Consumer) this.f20762b;
                Consumer consumer2 = (Consumer) this.f20763c;
                consumer.accept(obj);
                consumer2.accept(obj);
                break;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f20762b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f20763c;
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    break;
                } else {
                    atomicBoolean.set(true);
                    break;
                }
            case 5:
            case 6:
            default:
                C2458l3 c2458l3 = (C2458l3) this.f20762b;
                Consumer consumer3 = (Consumer) this.f20763c;
                if (c2458l3.f21116b.putIfAbsent(obj != null ? obj : C2458l3.f21114d, Boolean.TRUE) == null) {
                    consumer3.accept(obj);
                    break;
                }
                break;
            case 7:
                ((BiConsumer) this.f20762b).accept(this.f20763c, obj);
                break;
        }
    }
}
