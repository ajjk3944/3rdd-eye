package j4;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class P extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) {
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(c2762a.z(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        c2764c.w(locale == null ? null : locale.toString());
    }
}
