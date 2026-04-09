package r9;

/* loaded from: classes4.dex */
public abstract class d {
    public static final Object a(c cVar, Object obj) {
        kotlin.jvm.internal.p.e(cVar, "<this>");
        if (cVar.a(obj)) {
            kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + cVar.h());
    }
}
