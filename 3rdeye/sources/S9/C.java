package S9;

import R9.AbstractC1564a;

/* compiled from: JsonStreams.kt */
/* loaded from: classes3.dex */
public final class C {
    public static final void a(AbstractC1564a abstractC1564a, L l5, M9.b serializer, Object obj) {
        kotlin.jvm.internal.l.f(abstractC1564a, "<this>");
        kotlin.jvm.internal.l.f(serializer, "serializer");
        T mode = T.OBJ;
        R9.r[] rVarArr = new R9.r[T.values().length];
        kotlin.jvm.internal.l.f(mode, "mode");
        new O(new C1584p(l5), abstractC1564a, mode, rVarArr).x(serializer, obj);
    }
}
