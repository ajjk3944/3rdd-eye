package mg;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.z0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.liuzh.deviceinfo.DeviceInfoApp;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements cg.b {

    /* renamed from: a, reason: collision with root package name */
    public FirebaseAnalytics f29374a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences f29375b;

    @Override // cg.b
    public final void a(String str) {
        k1 k1Var = this.f29374a.f20708a;
        k1Var.getClass();
        k1Var.c(new e1(k1Var, (String) null, str, (Bundle) null, false));
    }

    @Override // cg.b
    public final void b(String str, String str2) {
        k1 k1Var = this.f29374a.f20708a;
        k1Var.getClass();
        k1Var.c(new w0(k1Var, str, str2));
    }

    @Override // cg.b
    public final void c(DeviceInfoApp deviceInfoApp) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(deviceInfoApp);
        this.f29374a = firebaseAnalytics;
        k1 k1Var = firebaseAnalytics.f20708a;
        Boolean bool = Boolean.TRUE;
        k1Var.getClass();
        k1Var.c(new z0(k1Var, bool));
        this.f29375b = deviceInfoApp.getSharedPreferences("TaichiTroasCache", 0);
        HashMap map = new HashMap();
        zd.b bVar = zd.b.f38241b;
        zd.a aVar = zd.a.f38238a;
        map.put(bVar, aVar);
        zd.b bVar2 = zd.b.f38240a;
        map.put(bVar2, aVar);
        zd.b bVar3 = zd.b.f38242c;
        map.put(bVar3, aVar);
        zd.b bVar4 = zd.b.f38243d;
        map.put(bVar4, aVar);
        FirebaseAnalytics firebaseAnalytics2 = this.f29374a;
        firebaseAnalytics2.getClass();
        Bundle bundle = new Bundle();
        zd.a aVar2 = (zd.a) map.get(bVar2);
        if (aVar2 != null) {
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        zd.a aVar3 = (zd.a) map.get(bVar);
        if (aVar3 != null) {
            int iOrdinal2 = aVar3.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        zd.a aVar4 = (zd.a) map.get(bVar3);
        if (aVar4 != null) {
            int iOrdinal3 = aVar4.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        zd.a aVar5 = (zd.a) map.get(bVar4);
        if (aVar5 != null) {
            int iOrdinal4 = aVar5.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        k1 k1Var2 = firebaseAnalytics2.f20708a;
        k1Var2.getClass();
        k1Var2.c(new x0(k1Var2, bundle, 1));
    }

    @Override // cg.b
    public final void d(pi.b bVar) {
        Bundle bundle = new Bundle();
        double d10 = bVar.f32010a;
        bundle.putString("ad_platform", "admobOri");
        bundle.putString("ad_source", bVar.f32011b);
        bundle.putString("ad_format", bVar.f32012c);
        bundle.putString("ad_unit_name", bVar.f32013d);
        bundle.putDouble("value", d10);
        bundle.putString(AppLovinEventParameters.REVENUE_CURRENCY, "USD");
        if (!bVar.f32011b.toLowerCase().contains(AppLovinMediationProvider.ADMOB)) {
            k1 k1Var = this.f29374a.f20708a;
            k1Var.getClass();
            k1Var.c(new e1(k1Var, (String) null, "ad_impression", bundle, false));
        }
        k1 k1Var2 = this.f29374a.f20708a;
        k1Var2.getClass();
        k1Var2.c(new e1(k1Var2, (String) null, "Ad_Impression_Revenue", bundle, false));
        float f10 = (float) (this.f29375b.getFloat("TaichiTroasCache", 0.0f) + d10);
        SharedPreferences.Editor editorEdit = this.f29375b.edit();
        double d11 = f10;
        if (d11 >= 0.01d) {
            Bundle bundle2 = new Bundle();
            bundle2.putDouble("value", d11);
            bundle2.putString(AppLovinEventParameters.REVENUE_CURRENCY, "USD");
            k1 k1Var3 = this.f29374a.f20708a;
            k1Var3.getClass();
            k1Var3.c(new e1(k1Var3, (String) null, "Total_Ads_Revenue_001", bundle2, false));
            editorEdit.putFloat("TaichiTroasCache", 0.0f);
        } else {
            editorEdit.putFloat("TaichiTroasCache", f10);
        }
        editorEdit.commit();
    }

    @Override // cg.b
    public final void f(Bundle bundle, String str) {
        k1 k1Var = this.f29374a.f20708a;
        k1Var.getClass();
        k1Var.c(new e1(k1Var, (String) null, str, bundle, false));
    }

    @Override // cg.b
    public final void e(DeviceInfoApp deviceInfoApp) {
    }
}
