package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class B1 extends AbstractC2510w1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20828h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f20829j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f20830k;

    public /* synthetic */ B1(EnumC2418d3 enumC2418d3, Object obj, Object obj2, Object obj3, int i) {
        this.f20828h = i;
        this.f20829j = obj;
        this.f20830k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final R1 v0() {
        switch (this.f20828h) {
            case 0:
                return new C2520y1((Supplier) this.i, (ObjLongConsumer) this.f20830k, (C2469o) this.f20829j);
            case 1:
                return new E1((Supplier) this.i, (ObjDoubleConsumer) this.f20830k, (C2469o) this.f20829j);
            case 2:
                return new G1(this.i, (BiFunction) this.f20830k, (BinaryOperator) this.f20829j);
            case 3:
                return new K1((Supplier) this.i, (BiConsumer) this.f20830k, (BiConsumer) this.f20829j);
            default:
                return new O1((Supplier) this.i, (ObjIntConsumer) this.f20830k, (C2469o) this.f20829j);
        }
    }
}
