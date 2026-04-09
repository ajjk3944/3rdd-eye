package zc;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class f extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public Boolean f26920g;

    /* renamed from: r, reason: collision with root package name */
    public String f26921r;

    /* renamed from: x, reason: collision with root package name */
    public e f26922x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f26923y;

    public final int A1(String str, t tVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) tVar.a(null)).intValue();
        }
        String strH0 = this.f26922x.h0(str, tVar.f27149a);
        if (TextUtils.isEmpty(strH0)) {
            return ((Integer) tVar.a(null)).intValue();
        }
        try {
            return ((Integer) tVar.a(Integer.valueOf(Integer.parseInt(strH0)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) tVar.a(null)).intValue();
        }
    }

    public final double B1(String str, t tVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) tVar.a(null)).doubleValue();
        }
        String strH0 = this.f26922x.h0(str, tVar.f27149a);
        if (TextUtils.isEmpty(strH0)) {
            return ((Double) tVar.a(null)).doubleValue();
        }
        try {
            return ((Double) tVar.a(Double.valueOf(Double.parseDouble(strH0)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) tVar.a(null)).doubleValue();
        }
    }

    public final boolean C1(String str, t tVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) tVar.a(null)).booleanValue();
        }
        String strH0 = this.f26922x.h0(str, tVar.f27149a);
        return TextUtils.isEmpty(strH0) ? ((Boolean) tVar.a(null)).booleanValue() : ((Boolean) tVar.a(Boolean.valueOf("1".equals(strH0)))).booleanValue();
    }

    public final Bundle D1() {
        c1 c1Var = (c1) this.f1504d;
        try {
            Context context = c1Var.f26884a;
            Context context2 = c1Var.f26884a;
            j0 j0Var = c1Var.f26889y;
            if (context.getPackageManager() == null) {
                c1.g(j0Var);
                j0Var.B.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoB = ic.c.a(context2).b(128, context2.getPackageName());
            if (applicationInfoB != null) {
                return applicationInfoB.metaData;
            }
            c1.g(j0Var);
            j0Var.B.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.B.c(e4, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean E1(String str) {
        cc.s.e(str);
        Bundle bundleD1 = D1();
        if (bundleD1 != null) {
            if (bundleD1.containsKey(str)) {
                return Boolean.valueOf(bundleD1.getBoolean(str));
            }
            return null;
        }
        j0 j0Var = ((c1) this.f1504d).f26889y;
        c1.g(j0Var);
        j0Var.B.b("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean F1() {
        ((c1) this.f1504d).getClass();
        Boolean boolE1 = E1("firebase_analytics_collection_deactivated");
        return boolE1 != null && boolE1.booleanValue();
    }

    public final boolean G1() {
        Boolean boolE1 = E1("google_analytics_automatic_screen_reporting_enabled");
        return boolE1 == null || boolE1.booleanValue();
    }

    public final l1 H1(String str, boolean z10) {
        Object obj;
        cc.s.e(str);
        c1 c1Var = (c1) this.f1504d;
        Bundle bundleD1 = D1();
        if (bundleD1 == null) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.b("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleD1.get(str);
        }
        if (obj == null) {
            return l1.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return l1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return l1.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return l1.POLICY;
        }
        j0 j0Var2 = c1Var.f26889y;
        c1.g(j0Var2);
        j0Var2.F.c(str, "Invalid manifest metadata for");
        return l1.UNINITIALIZED;
    }

    public final boolean t1(String str) {
        return "1".equals(this.f26922x.h0(str, "gaia_collection_enabled"));
    }

    public final boolean u1(String str) {
        return "1".equals(this.f26922x.h0(str, "measurement.event_sampling_enabled"));
    }

    public final boolean v1() {
        if (this.f26920g == null) {
            Boolean boolE1 = E1("app_measurement_lite");
            this.f26920g = boolE1;
            if (boolE1 == null) {
                this.f26920g = Boolean.FALSE;
            }
        }
        return this.f26920g.booleanValue() || !((c1) this.f1504d).f26885d;
    }

    public final String w1(String str) {
        c1 c1Var = (c1) this.f1504d;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            cc.s.h(str2);
            return str2;
        } catch (ClassNotFoundException e4) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.c(e4, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e10) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.B.c(e10, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e11) {
            j0 j0Var3 = c1Var.f26889y;
            c1.g(j0Var3);
            j0Var3.B.c(e11, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e12) {
            j0 j0Var4 = c1Var.f26889y;
            c1.g(j0Var4);
            j0Var4.B.c(e12, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void x1() {
        ((c1) this.f1504d).getClass();
    }

    public final String y1(String str, t tVar) {
        return TextUtils.isEmpty(str) ? (String) tVar.a(null) : (String) tVar.a(this.f26922x.h0(str, tVar.f27149a));
    }

    public final long z1(String str, t tVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) tVar.a(null)).longValue();
        }
        String strH0 = this.f26922x.h0(str, tVar.f27149a);
        if (TextUtils.isEmpty(strH0)) {
            return ((Long) tVar.a(null)).longValue();
        }
        try {
            return ((Long) tVar.a(Long.valueOf(Long.parseLong(strH0)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) tVar.a(null)).longValue();
        }
    }
}
