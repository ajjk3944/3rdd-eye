package D6;

import kotlin.jvm.internal.l;

/* compiled from: ExpressionInputFilter.kt */
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Boolean> f1064a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.d f1065b;

    public b(A7.b<Boolean> bVar, A7.d resolver) {
        l.f(resolver, "resolver");
        this.f1064a = bVar;
        this.f1065b = resolver;
    }

    @Override // D6.a
    public final boolean a(String str) {
        return this.f1064a.a(this.f1065b).booleanValue();
    }
}
