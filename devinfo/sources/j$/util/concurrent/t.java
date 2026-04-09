package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.stream.a7;
import j$.util.stream.b7;
import j$.util.stream.g8;
import j$.util.stream.j7;
import j$.util.stream.m1;
import j$.util.stream.q1;
import j$.util.stream.r1;
import j$.util.stream.s1;
import j$.util.stream.v3;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer, Supplier, g8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26347a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26348b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26349c;

    public /* synthetic */ t(int i4, Object obj, Object obj2) {
        this.f26347a = i4;
        this.f26348b = obj;
        this.f26349c = obj2;
    }

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.f26347a = 2;
        this.f26349c = biFunction;
        this.f26348b = function;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f26347a) {
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.com.android.tools.r8.a.c(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26347a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f26348b).apply(((BiFunction) this.f26349c).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f26347a) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) this.f26348b;
                BiFunction biFunction = (BiFunction) this.f26349c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
            default:
                BiConsumer biConsumer = (BiConsumer) this.f26348b;
                BiConsumer biConsumer2 = (BiConsumer) this.f26349c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                break;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new m1((r1) this.f26348b, (Predicate) this.f26349c);
    }

    public t(b7 b7Var, r1 r1Var, Supplier supplier) {
        this.f26347a = 6;
        this.f26348b = r1Var;
        this.f26349c = supplier;
    }

    @Override // j$.util.stream.g8
    public int w() {
        return a7.f26493u | a7.f26490r;
    }

    @Override // j$.util.stream.g8
    public Object f(j$.util.stream.a aVar, Spliterator spliterator) {
        q1 q1Var = (q1) ((Supplier) this.f26349c).get();
        aVar.w0(spliterator, q1Var);
        return Boolean.valueOf(q1Var.f26726b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.g8
    public Object j(v3 v3Var, Spliterator spliterator) {
        return (Boolean) new s1(this, (j$.util.stream.a) v3Var, spliterator).invoke();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void n(Object obj) {
        switch (this.f26347a) {
            case 3:
                Consumer consumer = (Consumer) this.f26348b;
                Consumer consumer2 = (Consumer) this.f26349c;
                consumer.n(obj);
                consumer2.n(obj);
                break;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f26348b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f26349c;
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
                j7 j7Var = (j7) this.f26348b;
                Consumer consumer3 = (Consumer) this.f26349c;
                if (j7Var.f26634b.putIfAbsent(obj != null ? obj : j7.f26632d, Boolean.TRUE) == null) {
                    consumer3.n(obj);
                    break;
                }
                break;
            case 7:
                ((BiConsumer) this.f26348b).accept(this.f26349c, obj);
                break;
        }
    }
}
