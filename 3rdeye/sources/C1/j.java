package C1;

import c9.C2097r;
import java.util.Collection;
import kotlin.jvm.internal.l;
import y9.C5828j;
import y9.q;

/* compiled from: TableInfo.kt */
/* loaded from: classes.dex */
public final class j {
    public static final boolean a(String current, String str) {
        l.f(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i < current.length()) {
                    char cCharAt = current.charAt(i);
                    int i12 = i11 + 1;
                    if (i11 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i10++;
                    } else if (cCharAt == ')' && i10 - 1 == 0 && i11 != current.length() - 1) {
                        break;
                    }
                    i++;
                    i11 = i12;
                } else if (i10 == 0) {
                    String strSubstring = current.substring(1, current.length() - 1);
                    l.e(strSubstring, "substring(...)");
                    return l.b(q.w0(strSubstring).toString(), str);
                }
            }
        }
        return false;
    }

    public static final String b(Collection<?> collection) {
        l.f(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return C5828j.K(C2097r.u0(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }
}
