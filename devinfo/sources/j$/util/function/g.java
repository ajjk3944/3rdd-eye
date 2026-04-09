package j$.util.function;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f26396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Predicate f26397c;

    public /* synthetic */ g(Predicate predicate, Predicate predicate2, int i4) {
        this.f26395a = i4;
        this.f26396b = predicate;
        this.f26397c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f26395a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f26395a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f26395a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f26395a) {
            case 0:
                return this.f26396b.test(obj) && this.f26397c.test(obj);
            default:
                return this.f26396b.test(obj) || this.f26397c.test(obj);
        }
    }
}
