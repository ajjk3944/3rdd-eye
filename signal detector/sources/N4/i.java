package N4;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.l f3005b;

    public /* synthetic */ i(p5.l lVar, int i) {
        this.f3004a = i;
        this.f3005b = lVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f3004a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f3004a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f3004a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f3004a) {
        }
        return ((Boolean) ((D4.d) this.f3005b).f(obj)).booleanValue();
    }
}
