package F4;

import F4.a;
import G4.f;
import T1.B;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzij;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.1.1 */
/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile b f1649c;

    /* renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public final AppMeasurementSdk f1650a;

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final ConcurrentHashMap f1651b;

    public b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f1650a = appMeasurementSdk;
        this.f1651b = new ConcurrentHashMap();
    }

    @Override // F4.a
    @KeepForSdk
    public final Map<String, Object> a(boolean z10) {
        return this.f1650a.getUserProperties(null, null, z10);
    }

    @Override // F4.a
    @KeepForSdk
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f1650a.getConditionalUserProperties("frc", "")) {
            HashSet hashSet = G4.b.f1898a;
            Preconditions.checkNotNull(bundle);
            a.C0028a c0028a = new a.C0028a();
            c0028a.f1635a = (String) Preconditions.checkNotNull((String) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null));
            c0028a.f1636b = (String) Preconditions.checkNotNull((String) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null));
            c0028a.f1637c = zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
            c0028a.f1638d = (String) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            c0028a.f1639e = ((Long) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            c0028a.f1640f = (String) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            c0028a.f1641g = (Bundle) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            c0028a.f1642h = (String) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            c0028a.i = (Bundle) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            c0028a.f1643j = ((Long) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            c0028a.f1644k = (String) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            c0028a.f1645l = (Bundle) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            c0028a.f1647n = ((Boolean) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            c0028a.f1646m = ((Long) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            c0028a.f1648o = ((Long) zzgu.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(c0028a);
        }
        return arrayList;
    }

    @Override // F4.a
    @KeepForSdk
    public final void c(a.C0028a c0028a) {
        HashSet hashSet = G4.b.f1898a;
        String str = c0028a.f1635a;
        if (str == null || str.isEmpty()) {
            return;
        }
        Object obj = c0028a.f1637c;
        if ((obj == null || zzij.zza(obj) != null) && G4.b.c(str) && G4.b.d(str, c0028a.f1636b)) {
            String str2 = c0028a.f1644k;
            if (str2 == null || (G4.b.b(c0028a.f1645l, str2) && G4.b.a(str, c0028a.f1644k, c0028a.f1645l))) {
                String str3 = c0028a.f1642h;
                if (str3 == null || (G4.b.b(c0028a.i, str3) && G4.b.a(str, c0028a.f1642h, c0028a.i))) {
                    String str4 = c0028a.f1640f;
                    if (str4 == null || (G4.b.b(c0028a.f1641g, str4) && G4.b.a(str, c0028a.f1640f, c0028a.f1641g))) {
                        Bundle bundle = new Bundle();
                        String str5 = c0028a.f1635a;
                        if (str5 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str5);
                        }
                        String str6 = c0028a.f1636b;
                        if (str6 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str6);
                        }
                        Object obj2 = c0028a.f1637c;
                        if (obj2 != null) {
                            zzgu.zzb(bundle, obj2);
                        }
                        String str7 = c0028a.f1638d;
                        if (str7 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str7);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, c0028a.f1639e);
                        String str8 = c0028a.f1640f;
                        if (str8 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str8);
                        }
                        Bundle bundle2 = c0028a.f1641g;
                        if (bundle2 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                        }
                        String str9 = c0028a.f1642h;
                        if (str9 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str9);
                        }
                        Bundle bundle3 = c0028a.i;
                        if (bundle3 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, c0028a.f1643j);
                        String str10 = c0028a.f1644k;
                        if (str10 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str10);
                        }
                        Bundle bundle4 = c0028a.f1645l;
                        if (bundle4 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, c0028a.f1646m);
                        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, c0028a.f1647n);
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, c0028a.f1648o);
                        this.f1650a.setConditionalUserProperty(bundle);
                    }
                }
            }
        }
    }

    @Override // F4.a
    @KeepForSdk
    public final void d(String str, String str2, Bundle bundle) {
        if (G4.b.c(str) && G4.b.b(bundle, str2) && G4.b.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f1650a.logEvent(str, str2, bundle);
        }
    }

    @Override // F4.a
    @KeepForSdk
    public final B e(String str, K4.b bVar) {
        Preconditions.checkNotNull(bVar);
        if (G4.b.c(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f1651b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = AppMeasurement.FIAM_ORIGIN.equals(str);
                AppMeasurementSdk appMeasurementSdk = this.f1650a;
                Object dVar = zEquals ? new G4.d(appMeasurementSdk, bVar) : (AppMeasurement.CRASH_ORIGIN.equals(str) || "clx".equals(str)) ? new f(appMeasurementSdk, bVar) : null;
                if (dVar != null) {
                    concurrentHashMap.put(str, dVar);
                    return new B();
                }
            }
        }
        return null;
    }

    @Override // F4.a
    @KeepForSdk
    public final int f() {
        return this.f1650a.getMaxUserProperties("frc");
    }

    @Override // F4.a
    @KeepForSdk
    public final void g(String str) {
        this.f1650a.clearConditionalUserProperty(str, null, null);
    }

    @Override // F4.a
    @KeepForSdk
    public final void h(String str) {
        if (G4.b.c(AppMeasurement.FCM_ORIGIN) && G4.b.d(AppMeasurement.FCM_ORIGIN, "_ln")) {
            this.f1650a.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", str);
        }
    }
}
