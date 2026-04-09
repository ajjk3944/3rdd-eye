package defpackage;

import java.util.HashMap;
import java.util.StringTokenizer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class tj0 {
    public static HashMap a;

    static {
        try {
            b();
        } catch (SecurityException unused) {
        }
    }

    public static boolean a() {
        HashMap map = a;
        return (map == null || map.get("multiline") == null) ? false : true;
    }

    public static void b() {
        String property = System.getProperty("dnsjava.options");
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(61);
                if (iIndexOf == -1) {
                    if (a == null) {
                        a = new HashMap();
                    }
                    a.put(strNextToken.toLowerCase(), "true");
                } else {
                    String strSubstring = strNextToken.substring(0, iIndexOf);
                    String strSubstring2 = strNextToken.substring(iIndexOf + 1);
                    if (a == null) {
                        a = new HashMap();
                    }
                    a.put(strSubstring.toLowerCase(), strSubstring2.toLowerCase());
                }
            }
        }
    }
}
