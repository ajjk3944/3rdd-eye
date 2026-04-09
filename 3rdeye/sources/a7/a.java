package A7;

import b9.C1992A;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: ExpressionList.kt */
/* loaded from: classes.dex */
public final class a<T> implements c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final List<T> f86a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends T> values) {
        l.f(values, "values");
        this.f86a = values;
    }

    @Override // A7.c
    public final j6.d a(d resolver, p9.l<? super List<? extends T>, C1992A> lVar) {
        l.f(resolver, "resolver");
        return j6.d.f42990m8;
    }

    @Override // A7.c
    public final List<T> b(d resolver) {
        l.f(resolver, "resolver");
        return this.f86a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return l.b(this.f86a, ((a) obj).f86a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f86a.hashCode() * 16;
    }
}
