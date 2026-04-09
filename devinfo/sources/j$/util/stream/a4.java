package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class a4 extends v3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26473h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f26474i;
    public final /* synthetic */ Object j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f26475k;

    public /* synthetic */ a4(b7 b7Var, Object obj, Object obj2, Object obj3, int i4) {
        this.f26473h = i4;
        this.j = obj;
        this.f26475k = obj2;
        this.f26474i = obj3;
    }

    @Override // j$.util.stream.v3
    public final q4 v0() {
        switch (this.f26473h) {
            case 0:
                return new x3((Supplier) this.f26474i, (ObjLongConsumer) this.f26475k, (n) this.j);
            case 1:
                return new d4((Supplier) this.f26474i, (ObjDoubleConsumer) this.f26475k, (n) this.j);
            case 2:
                return new f4(this.f26474i, (BiFunction) this.f26475k, (BinaryOperator) this.j);
            case 3:
                return new j4((Supplier) this.f26474i, (BiConsumer) this.f26475k, (BiConsumer) this.j);
            default:
                return new n4((Supplier) this.f26474i, (ObjIntConsumer) this.f26475k, (n) this.j);
        }
    }
}
