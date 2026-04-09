package i9;

import java.io.File;
import kotlin.jvm.internal.p;
import s9.u;

/* loaded from: classes4.dex */
public abstract class e {
    public static final int a(String str) {
        int iA0;
        char c10 = File.separatorChar;
        int iA02 = u.a0(str, c10, 0, false, 4, null);
        if (iA02 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (iA0 = u.a0(str, c10, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iA03 = u.a0(str, c10, iA0 + 1, false, 4, null);
            return iA03 >= 0 ? iA03 + 1 : str.length();
        }
        if (iA02 > 0 && str.charAt(iA02 - 1) == ':') {
            return iA02 + 1;
        }
        if (iA02 == -1 && u.S(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final boolean b(File file) {
        p.e(file, "<this>");
        String path = file.getPath();
        p.d(path, "getPath(...)");
        return a(path) > 0;
    }
}
