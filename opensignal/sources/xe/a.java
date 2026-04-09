package xe;

import android.os.Bundle;
import oe.e0;
import oe.f0;
import oe.h0;
import oe.k0;
import oe.s;
import oe.u0;
import zc.p1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f25299a;

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f25300b;

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f25301c;

    /* renamed from: d, reason: collision with root package name */
    public static final u0 f25302d;

    /* renamed from: e, reason: collision with root package name */
    public static final u0 f25303e;

    /* renamed from: f, reason: collision with root package name */
    public static final u0 f25304f;

    static {
        int i10 = k0.f19344g;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f25299a = k0.l(15, objArr);
        f0 f0Var = h0.f19336d;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        s.a(7, objArr2);
        f25300b = h0.k(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        s.a(3, objArr3);
        f25301c = h0.k(3, objArr3);
        f25302d = h0.r("_r", "_dbg");
        e0 e0Var = new e0();
        e0Var.b(p1.f27083i);
        e0Var.b(p1.j);
        f25303e = e0Var.d();
        f25304f = h0.r("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !f25301c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (!f25300b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            u0 u0Var = f25302d;
            int i10 = u0Var.f19385r;
            int i11 = 0;
            while (i11 < i10) {
                boolean zContainsKey = bundle.containsKey((String) u0Var.get(i11));
                i11++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!f25303e.contains(str2)) {
            u0 u0Var = f25304f;
            int i10 = u0Var.f19385r;
            int i11 = 0;
            while (i11 < i10) {
                boolean zMatches = str2.matches((String) u0Var.get(i11));
                i11++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (a(str) && bundle != null) {
            u0 u0Var = f25302d;
            int i10 = u0Var.f19385r;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != 101200) {
                        if (iHashCode != 101230) {
                            if (iHashCode == 3142703 && str.equals("fiam")) {
                                bundle.putString("_cis", "fiam_integration");
                                return true;
                            }
                        } else if (str.equals("fdl")) {
                            bundle.putString("_cis", "fdl_integration");
                            return true;
                        }
                    } else if (str.equals("fcm")) {
                        bundle.putString("_cis", "fcm_integration");
                        return true;
                    }
                } else {
                    boolean zContainsKey = bundle.containsKey((String) u0Var.get(i11));
                    i11++;
                    if (zContainsKey) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
