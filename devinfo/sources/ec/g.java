package ec;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends a8.a {

    /* renamed from: c, reason: collision with root package name */
    public Boolean f22716c;

    /* renamed from: d, reason: collision with root package name */
    public String f22717d;

    /* renamed from: e, reason: collision with root package name */
    public f f22718e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f22719f;

    public final boolean C(String str) {
        return "1".equals(this.f22718e.e(str, "gaia_collection_enabled"));
    }

    public final boolean D(String str) {
        return "1".equals(this.f22718e.e(str, "measurement.event_sampling_enabled"));
    }

    public final boolean E() {
        if (this.f22716c == null) {
            Boolean boolN = N("app_measurement_lite");
            this.f22716c = boolN;
            if (boolN == null) {
                this.f22716c = Boolean.FALSE;
            }
        }
        return this.f22716c.booleanValue() || !((o1) this.f218b).f22950b;
    }

    public final String F(String str) {
        o1 o1Var = (o1) this.f218b;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            pb.y.h(str2);
            return str2;
        } catch (ClassNotFoundException e2) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.e(e2, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e10) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.g.e(e10, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e11) {
            s0 s0Var3 = o1Var.f22954f;
            o1.m(s0Var3);
            s0Var3.g.e(e11, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e12) {
            s0 s0Var4 = o1Var.f22954f;
            o1.m(s0Var4);
            s0Var4.g.e(e12, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void G() {
        ((o1) this.f218b).getClass();
    }

    public final String H(String str, c0 c0Var) {
        return TextUtils.isEmpty(str) ? (String) c0Var.a(null) : (String) c0Var.a(this.f22718e.e(str, c0Var.f22601a));
    }

    public final long I(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c0Var.a(null)).longValue();
        }
        String strE = this.f22718e.e(str, c0Var.f22601a);
        if (TextUtils.isEmpty(strE)) {
            return ((Long) c0Var.a(null)).longValue();
        }
        try {
            return ((Long) c0Var.a(Long.valueOf(Long.parseLong(strE)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c0Var.a(null)).longValue();
        }
    }

    public final int J(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c0Var.a(null)).intValue();
        }
        String strE = this.f22718e.e(str, c0Var.f22601a);
        if (TextUtils.isEmpty(strE)) {
            return ((Integer) c0Var.a(null)).intValue();
        }
        try {
            return ((Integer) c0Var.a(Integer.valueOf(Integer.parseInt(strE)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c0Var.a(null)).intValue();
        }
    }

    public final double K(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c0Var.a(null)).doubleValue();
        }
        String strE = this.f22718e.e(str, c0Var.f22601a);
        if (TextUtils.isEmpty(strE)) {
            return ((Double) c0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) c0Var.a(Double.valueOf(Double.parseDouble(strE)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c0Var.a(null)).doubleValue();
        }
    }

    public final boolean L(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c0Var.a(null)).booleanValue();
        }
        String strE = this.f22718e.e(str, c0Var.f22601a);
        return TextUtils.isEmpty(strE) ? ((Boolean) c0Var.a(null)).booleanValue() : ((Boolean) c0Var.a(Boolean.valueOf("1".equals(strE)))).booleanValue();
    }

    public final Bundle M() {
        o1 o1Var = (o1) this.f218b;
        try {
            Context context = o1Var.f22949a;
            Context context2 = o1Var.f22949a;
            s0 s0Var = o1Var.f22954f;
            if (context.getPackageManager() == null) {
                o1.m(s0Var);
                s0Var.g.d("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoD = ub.b.a(context2).d(128, context2.getPackageName());
            if (applicationInfoD != null) {
                return applicationInfoD.metaData;
            }
            o1.m(s0Var);
            s0Var.g.d("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.g.e(e2, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean N(String str) {
        pb.y.e(str);
        Bundle bundleM = M();
        if (bundleM != null) {
            if (bundleM.containsKey(str)) {
                return Boolean.valueOf(bundleM.getBoolean(str));
            }
            return null;
        }
        s0 s0Var = ((o1) this.f218b).f22954f;
        o1.m(s0Var);
        s0Var.g.d("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean O() {
        ((o1) this.f218b).getClass();
        Boolean boolN = N("firebase_analytics_collection_deactivated");
        return boolN != null && boolN.booleanValue();
    }

    public final boolean P() {
        Boolean boolN = N("google_analytics_automatic_screen_reporting_enabled");
        return boolN == null || boolN.booleanValue();
    }

    public final x1 Q(String str, boolean z3) {
        Object obj;
        pb.y.e(str);
        o1 o1Var = (o1) this.f218b;
        Bundle bundleM = M();
        if (bundleM == null) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.d("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM.get(str);
        }
        x1 x1Var = x1.UNINITIALIZED;
        if (obj == null) {
            return x1Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return x1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return x1.DENIED;
        }
        if (z3 && "eu_consent_policy".equals(obj)) {
            return x1.POLICY;
        }
        s0 s0Var2 = o1Var.f22954f;
        o1.m(s0Var2);
        s0Var2.j.e(str, "Invalid manifest metadata for");
        return x1Var;
    }
}
