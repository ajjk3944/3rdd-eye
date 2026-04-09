package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class G {
    public static final String a(Zh.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        List listH = dVar.h();
        AbstractC6492s.h(listH, "pathSegments(...)");
        return c(listH);
    }

    public static final String b(Zh.f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        if (!e(fVar)) {
            String strB = fVar.b();
            AbstractC6492s.h(strB, "asString(...)");
            return strB;
        }
        StringBuilder sb2 = new StringBuilder();
        String strB2 = fVar.b();
        AbstractC6492s.h(strB2, "asString(...)");
        sb2.append('`' + strB2);
        sb2.append('`');
        return sb2.toString();
    }

    public static final String c(List pathSegments) {
        AbstractC6492s.i(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = pathSegments.iterator();
        while (it.hasNext()) {
            Zh.f fVar = (Zh.f) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(fVar));
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public static final String d(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        AbstractC6492s.i(lowerRendered, "lowerRendered");
        AbstractC6492s.i(lowerPrefix, "lowerPrefix");
        AbstractC6492s.i(upperRendered, "upperRendered");
        AbstractC6492s.i(upperPrefix, "upperPrefix");
        AbstractC6492s.i(foldedPrefix, "foldedPrefix");
        if (kotlin.text.t.P(lowerRendered, lowerPrefix, false, 2, null) && kotlin.text.t.P(upperRendered, upperPrefix, false, 2, null)) {
            String strSubstring = lowerRendered.substring(lowerPrefix.length());
            AbstractC6492s.h(strSubstring, "substring(...)");
            String strSubstring2 = upperRendered.substring(upperPrefix.length());
            AbstractC6492s.h(strSubstring2, "substring(...)");
            String str = foldedPrefix + strSubstring;
            if (AbstractC6492s.d(strSubstring, strSubstring2)) {
                return str;
            }
            if (f(strSubstring, strSubstring2)) {
                return str + '!';
            }
        }
        return null;
    }

    private static final boolean e(Zh.f fVar) {
        String strB = fVar.b();
        AbstractC6492s.h(strB, "asString(...)");
        if (!B.f52046a.contains(strB)) {
            int i10 = 0;
            while (true) {
                if (i10 < strB.length()) {
                    char cCharAt = strB.charAt(i10);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i10++;
                } else if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "lower"
            kotlin.jvm.internal.AbstractC6492s.i(r7, r0)
            java.lang.String r0 = "upper"
            kotlin.jvm.internal.AbstractC6492s.i(r8, r0)
            r5 = 4
            r6 = 0
            java.lang.String r2 = "?"
            java.lang.String r3 = ""
            r4 = 0
            r1 = r8
            java.lang.String r0 = kotlin.text.t.L(r1, r2, r3, r4, r5, r6)
            boolean r0 = kotlin.jvm.internal.AbstractC6492s.d(r7, r0)
            if (r0 != 0) goto L5a
            r0 = 2
            r1 = 0
            java.lang.String r2 = "?"
            r3 = 0
            boolean r0 = kotlin.text.t.B(r8, r2, r3, r0, r1)
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r1 = 63
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.AbstractC6492s.d(r0, r8)
            if (r0 != 0) goto L5a
        L3e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ")?"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = kotlin.jvm.internal.AbstractC6492s.d(r7, r8)
            if (r7 == 0) goto L5b
        L5a:
            r3 = 1
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.G.f(java.lang.String, java.lang.String):boolean");
    }
}
