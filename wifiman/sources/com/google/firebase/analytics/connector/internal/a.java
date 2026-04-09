package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.AbstractC4898l4;
import com.google.android.gms.measurement.internal.AbstractC4914n4;
import com.google.common.collect.AbstractC5069o;
import com.google.common.collect.r;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final r f38613a = r.M0("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5069o f38614b = AbstractC5069o.K0("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5069o f38615c = AbstractC5069o.q0("auto", "app", "am");

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5069o f38616d = AbstractC5069o.b0("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC5069o f38617e = new AbstractC5069o.a().e(AbstractC4914n4.f36603a).e(AbstractC4914n4.f36604b).f();

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC5069o f38618f = AbstractC5069o.b0("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static String a(String str) {
        String strA = AbstractC4898l4.a(str);
        return strA != null ? strA : str;
    }

    public static void b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean c(String str, Bundle bundle) {
        if (f38614b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC5069o abstractC5069o = f38616d;
        int size = abstractC5069o.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = abstractC5069o.get(i10);
            i10++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!f(str) || bundle == null) {
            return false;
        }
        AbstractC5069o abstractC5069o = f38616d;
        int size = abstractC5069o.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = abstractC5069o.get(i10);
            i10++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.hashCode();
        switch (str) {
            case "fcm":
                bundle.putString("_cis", "fcm_integration");
                return true;
            case "fdl":
                bundle.putString("_cis", "fdl_integration");
                return true;
            case "fiam":
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean e(String str) {
        return !f38613a.contains(str);
    }

    public static boolean f(String str) {
        return !f38615c.contains(str);
    }
}
