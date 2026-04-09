package cg;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.utilities.f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f2847a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final a f2848b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static long f2849c = 0;

    public static void h(float f10) {
        f fVar = f.f21256b;
        Locale locale = Locale.US;
        if (f.f21257c.getBoolean(String.format(locale, "reported_revenue_line_%.2f", Float.valueOf(f10)), false)) {
            return;
        }
        String strT = u.t("ltv_", String.format(locale, "%.1f", Float.valueOf(f10)).replace(".", "_"));
        ArrayList arrayList = f2847a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((b) obj).f(null, strT);
        }
        f fVar2 = f.f21256b;
        f.k(String.format(Locale.US, "reported_revenue_line_%.2f", Float.valueOf(f10)), true);
    }

    @Override // cg.b
    public final void a(String str) {
        f(null, str);
    }

    @Override // cg.b
    public final void b(String str, String str2) {
        ArrayList arrayList = f2847a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((b) obj).b(str, str2);
        }
    }

    @Override // cg.b
    public final void c(DeviceInfoApp deviceInfoApp) {
        ArrayList arrayList = f2847a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((b) obj).c(deviceInfoApp);
        }
    }

    @Override // cg.b
    public final void d(pi.b bVar) {
        f fVar = f.f21256b;
        double d10 = bVar.f32010a;
        SharedPreferences sharedPreferences = f.f21257c;
        f.m("total_ad_revenue", new BigDecimal(sharedPreferences.getString("total_ad_revenue", "0")).add(new BigDecimal(String.valueOf(d10))).toPlainString());
        double dDoubleValue = new BigDecimal(sharedPreferences.getString("total_ad_revenue", "0")).doubleValue();
        if (dDoubleValue >= 2.0d) {
            h(2.0f);
        } else if (dDoubleValue >= 1.8d) {
            h(1.8f);
        } else if (dDoubleValue >= 1.6d) {
            h(1.6f);
        } else if (dDoubleValue >= 1.5d) {
            h(1.5f);
        } else if (dDoubleValue >= 1.4d) {
            h(1.4f);
        } else if (dDoubleValue >= 1.3d) {
            h(1.3f);
        } else if (dDoubleValue >= 1.2d) {
            h(1.2f);
        } else if (dDoubleValue >= 1.1d) {
            h(1.1f);
        } else if (dDoubleValue >= 1.0d) {
            h(1.0f);
        } else if (dDoubleValue >= 0.9d) {
            h(0.9f);
        } else if (dDoubleValue >= 0.8d) {
            h(0.8f);
        } else if (dDoubleValue >= 0.7d) {
            h(0.7f);
        } else if (dDoubleValue >= 0.6d) {
            h(0.6f);
        } else if (dDoubleValue >= 0.5d) {
            h(0.5f);
        } else if (dDoubleValue >= 0.4d) {
            h(0.4f);
        } else if (dDoubleValue >= 0.3d) {
            h(0.3f);
        } else if (dDoubleValue >= 0.2d) {
            h(0.2f);
        } else if (dDoubleValue >= 0.1d) {
            h(0.1f);
        }
        ArrayList arrayList = f2847a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((b) obj).d(bVar);
        }
    }

    @Override // cg.b
    public final void e(DeviceInfoApp deviceInfoApp) {
        ArrayList arrayList = f2847a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((b) obj).e(deviceInfoApp);
        }
    }

    @Override // cg.b
    public final void f(Bundle bundle, String str) {
        ArrayList arrayList = f2847a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            b bVar = (b) obj;
            if (bundle == null || bundle.isEmpty()) {
                bVar.a(str);
            } else {
                bVar.f(bundle, str);
            }
        }
    }

    public final void g() {
        if (System.currentTimeMillis() - f2849c <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        f2849c = System.currentTimeMillis();
        f(null, "dev_alive");
    }
}
