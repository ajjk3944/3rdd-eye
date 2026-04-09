package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2469o implements BinaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f21126b;

    public /* synthetic */ C2469o(BiConsumer biConsumer, int i) {
        this.f21125a = i;
        this.f21126b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f21125a) {
        }
        return j$.com.android.tools.r8.a.b(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f21125a) {
            case 0:
                this.f21126b.accept(obj, obj2);
                break;
            case 1:
                this.f21126b.accept(obj, obj2);
                break;
            default:
                this.f21126b.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
