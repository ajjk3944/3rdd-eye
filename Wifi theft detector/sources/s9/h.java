package s9;

/* loaded from: classes4.dex */
public abstract class h {
    public static void a(Appendable appendable, Object obj, l9.l lVar) {
        kotlin.jvm.internal.p.e(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
