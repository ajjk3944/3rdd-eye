package p0;

import android.annotation.TargetApi;
import android.os.Build;
import android.telephony.TelephonyManager;

@TargetApi(24)
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3143a = "i";

    /* renamed from: b, reason: collision with root package name */
    private static TelephonyManager f3144b = null;

    /* renamed from: c, reason: collision with root package name */
    private static TelephonyManager f3145c = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f3146d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static int f3147e = -1;

    /* JADX WARN: Removed duplicated region for block: B:42:0x0092 A[Catch: Exception -> 0x00d7, SecurityException -> 0x00e2, TryCatch #4 {SecurityException -> 0x00e2, Exception -> 0x00d7, blocks: (B:29:0x006a, B:31:0x006e, B:33:0x0072, B:34:0x0079, B:40:0x008c, B:42:0x0092, B:44:0x0098, B:45:0x00a2, B:48:0x00a9, B:50:0x00b9, B:51:0x00bf, B:53:0x00c3, B:54:0x00c8, B:36:0x007f, B:37:0x0085, B:39:0x0089), top: B:65:0x006a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.telephony.TelephonyManager r3, p0.b r4, android.content.Context r5) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.i.a(android.telephony.TelephonyManager, p0.b, android.content.Context):boolean");
    }

    public static boolean b(TelephonyManager telephonyManager, b bVar, int i2) {
        if (telephonyManager == null) {
            return false;
        }
        if (i2 == 0) {
            bVar.f3112c = telephonyManager.getSimState() == 5;
        } else if (i2 == 1) {
            bVar.f3113d = telephonyManager.getSimState() == 5;
        }
        try {
            int dataNetworkType = telephonyManager.getDataNetworkType();
            if (i2 == 0) {
                bVar.f3115f = dataNetworkType;
            } else {
                bVar.f3116g = dataNetworkType;
            }
        } catch (SecurityException unused) {
        }
        String simOperator = telephonyManager.getSimOperator();
        if (i2 == 0) {
            bVar.f3117h = simOperator;
        } else {
            bVar.f3118i = simOperator;
        }
        String simOperatorName = telephonyManager.getSimOperatorName();
        if (i2 == 0) {
            bVar.f3119j = simOperatorName;
        } else {
            bVar.f3120k = simOperatorName;
        }
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (i2 == 0) {
            bVar.f3121l = simCountryIso;
        } else {
            bVar.f3122m = simCountryIso;
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (i2 == 0) {
            bVar.f3123n = networkOperator;
        } else {
            bVar.f3124o = networkOperator;
        }
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        if (i2 == 0) {
            bVar.f3125p = networkOperatorName;
        } else {
            bVar.f3126q = networkOperatorName;
        }
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (i2 == 0) {
            bVar.f3127r = networkCountryIso;
        } else {
            bVar.f3128s = networkCountryIso;
        }
        int phoneType = telephonyManager.getPhoneType();
        if (i2 == 0) {
            bVar.f3129t = phoneType;
        } else {
            bVar.f3130u = phoneType;
        }
        boolean zIsNetworkRoaming = telephonyManager.isNetworkRoaming();
        if (i2 == 0) {
            bVar.f3131v = zIsNetworkRoaming;
        } else {
            bVar.f3132w = zIsNetworkRoaming;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            int i3 = telephonyManager.getDataState() != 0 ? 1 : 0;
            if (i2 == 0) {
                bVar.f3133x = i3;
            } else {
                bVar.f3134y = i3;
            }
        }
        return true;
    }
}
