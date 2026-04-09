package be;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.play_billing.m1;
import ec.b2;
import java.util.Arrays;
import ud.d;
import ud.f;
import ud.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2140a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f2141b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f2142c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f2143d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f2144e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f2145f;

    static {
        int i4 = f.f35302c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f2140a = f.j(objArr, 15);
        ud.b bVar = d.f35298b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        m1.g(objArr2, 7);
        f2141b = d.g(objArr2, 7);
        Object[] objArr3 = {"auto", "app", "am"};
        m1.g(objArr3, 3);
        f2142c = d.g(objArr3, 3);
        Object[] objArr4 = {"_r", "_dbg"};
        m1.g(objArr4, 2);
        f2143d = d.g(objArr4, 2);
        com.bumptech.glide.f.g(4, "initialCapacity");
        String[] strArr = b2.f22585i;
        m1.g(strArr, 15);
        Object[] objArrCopyOf = Arrays.copyOf(new Object[4], d5.e(4, 15));
        System.arraycopy(strArr, 0, objArrCopyOf, 0, 15);
        String[] strArr2 = b2.j;
        m1.g(strArr2, 15);
        if (objArrCopyOf.length < 30) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, d5.e(objArrCopyOf.length, 30));
        }
        System.arraycopy(strArr2, 0, objArrCopyOf, 15, 15);
        f2144e = d.g(objArrCopyOf, 30);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        m1.g(objArr5, 2);
        f2145f = d.g(objArr5, 2);
    }

    public static boolean a(Bundle bundle, String str) {
        if (!f2141b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            h hVar = f2143d;
            int i4 = hVar.f35308d;
            int i10 = 0;
            while (i10 < i4) {
                boolean zContainsKey = bundle.containsKey((String) hVar.get(i10));
                i10++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!f2142c.contains(str) && bundle != null) {
            h hVar = f2143d;
            int i4 = hVar.f35308d;
            int i10 = 0;
            while (true) {
                if (i10 >= i4) {
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
                    boolean zContainsKey = bundle.containsKey((String) hVar.get(i10));
                    i10++;
                    if (zContainsKey) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
