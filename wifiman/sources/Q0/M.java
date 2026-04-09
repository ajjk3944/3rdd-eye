package Q0;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class M {
    public static final I a() {
        return Build.VERSION.SDK_INT >= 28 ? new K() : new L();
    }

    public static final String b(String str, A a10) {
        int iP = a10.p() / 100;
        if (iP >= 0 && iP < 2) {
            return str + "-thin";
        }
        if (2 <= iP && iP < 4) {
            return str + "-light";
        }
        if (iP == 4) {
            return str;
        }
        if (iP == 5) {
            return str + "-medium";
        }
        if ((6 <= iP && iP < 8) || 8 > iP || iP >= 11) {
            return str;
        }
        return str + "-black";
    }

    public static final Typeface c(Typeface typeface, z zVar, Context context) {
        return P.f19005a.a(typeface, zVar, context);
    }
}
