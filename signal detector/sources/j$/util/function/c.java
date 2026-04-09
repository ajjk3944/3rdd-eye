package j$.util.function;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f20789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f20790c;

    public /* synthetic */ c(Function function, Function function2, int i) {
        this.f20788a = i;
        this.f20789b = function;
        this.f20790c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f20788a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f20788a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f20788a) {
            case 0:
                return this.f20790c.apply(this.f20789b.apply(obj));
            default:
                return this.f20789b.apply(this.f20790c.apply(obj));
        }
    }
}
