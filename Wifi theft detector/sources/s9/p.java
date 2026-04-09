package s9;

/* loaded from: classes4.dex */
public abstract class p extends o {
    public static Double m(String str) {
        kotlin.jvm.internal.p.e(str, "<this>");
        try {
            if (g.f24370b.a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
