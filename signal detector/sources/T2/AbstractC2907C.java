package t2;

import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC1480la;
import com.google.android.gms.internal.ads.C1448kw;
import com.google.android.gms.internal.ads.XA;
import com.google.android.gms.internal.ads.YA;
import java.util.Iterator;

/* renamed from: t2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2907C extends u2.k {
    public static void m(String str) {
        if (!o()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        C1448kw c1448kw = u2.k.f23815a;
        Iterator itE = ((YA) c1448kw.f15314b).e(c1448kw, str);
        boolean z6 = true;
        while (true) {
            XA xa = (XA) itE;
            if (!xa.hasNext()) {
                return;
            }
            String str2 = (String) xa.next();
            if (z6) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z6 = false;
        }
    }

    public static void n(String str, Throwable th) {
        if (o()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean o() {
        return u2.k.l(2) && ((Boolean) AbstractC1480la.f15412a.v()).booleanValue();
    }
}
