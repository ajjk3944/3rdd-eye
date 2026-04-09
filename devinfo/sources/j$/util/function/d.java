package j$.util.function;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f26389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f26390c;

    public /* synthetic */ d(Function function, Function function2, int i4) {
        this.f26388a = i4;
        this.f26389b = function;
        this.f26390c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f26388a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f26388a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f26388a) {
            case 0:
                return this.f26390c.apply(this.f26389b.apply(obj));
            default:
                return this.f26389b.apply(this.f26390c.apply(obj));
        }
    }
}
