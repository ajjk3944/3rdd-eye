package z9;

/* loaded from: classes4.dex */
public abstract class f {
    public static final kotlinx.serialization.json.b a(o oVar, String key, Boolean bool) {
        kotlin.jvm.internal.p.e(oVar, "<this>");
        kotlin.jvm.internal.p.e(key, "key");
        return oVar.b(key, g.a(bool));
    }

    public static final kotlinx.serialization.json.b b(o oVar, String key, Number number) {
        kotlin.jvm.internal.p.e(oVar, "<this>");
        kotlin.jvm.internal.p.e(key, "key");
        return oVar.b(key, g.b(number));
    }

    public static final kotlinx.serialization.json.b c(o oVar, String key, String str) {
        kotlin.jvm.internal.p.e(oVar, "<this>");
        kotlin.jvm.internal.p.e(key, "key");
        return oVar.b(key, g.c(str));
    }
}
