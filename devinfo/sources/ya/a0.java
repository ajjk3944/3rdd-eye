package ya;

import android.util.Log;
import com.google.android.gms.internal.ads.j31;
import com.google.android.gms.internal.ads.k31;
import com.google.android.gms.internal.ads.rg0;
import com.google.android.gms.internal.ads.wl;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a0 extends za.i {
    public static void m(String str) {
        if (!o()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        rg0 rg0Var = za.i.f38155a;
        Iterator itM = ((k31) rg0Var.f15651b).m(rg0Var, str);
        boolean z3 = true;
        while (true) {
            j31 j31Var = (j31) itM;
            if (!j31Var.hasNext()) {
                return;
            }
            String str2 = (String) j31Var.next();
            if (z3) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z3 = false;
        }
    }

    public static void n(String str, Throwable th2) {
        if (o()) {
            Log.v("Ads", str, th2);
        }
    }

    public static boolean o() {
        return za.i.l(2) && ((Boolean) wl.f18052a.u()).booleanValue();
    }
}
