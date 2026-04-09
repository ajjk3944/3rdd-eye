package j$.util.function;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f20796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Predicate f20797c;

    public /* synthetic */ f(Predicate predicate, Predicate predicate2, int i) {
        this.f20795a = i;
        this.f20796b = predicate;
        this.f20797c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f20795a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f20795a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f20795a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f20795a) {
            case 0:
                return this.f20796b.test(obj) && this.f20797c.test(obj);
            default:
                return this.f20796b.test(obj) || this.f20797c.test(obj);
        }
    }
}
