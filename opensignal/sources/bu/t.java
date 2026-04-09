package bu;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.e0;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t implements o7.d, yi.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2989a;

    /* renamed from: d, reason: collision with root package name */
    public String f2990d;

    public /* synthetic */ t() {
        this.f2989a = 7;
    }

    public static void i(io.sentry.k kVar, qf.e eVar) {
        String str = eVar.f20893a;
        if (str != null) {
            kVar.d0("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        kVar.d0("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        kVar.d0("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.3");
        kVar.d0("Accept", "application/json");
        String str2 = eVar.f20894b;
        if (str2 != null) {
            kVar.d0("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = eVar.f20895c;
        if (str3 != null) {
            kVar.d0("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = eVar.f20896d;
        if (str4 != null) {
            kVar.d0("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = eVar.f20897e.c().f10640a;
        if (str5 != null) {
            kVar.d0("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0247 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static bu.t j(io.sentry.c r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.t.j(io.sentry.c, java.util.List):bu.t");
    }

    public static String k(String str, yi.a aVar, yi.c cVar) {
        StringBuilder sbU = c7.a.u("/sys/class/net/", str, "/statistics/");
        String lowerCase = aVar.name().toLowerCase();
        br.l.d(lowerCase, "toLowerCase(...)");
        sbU.append(lowerCase);
        sbU.append('_');
        String lowerCase2 = cVar.name().toLowerCase();
        br.l.d(lowerCase2, "toLowerCase(...)");
        sbU.append(lowerCase2);
        return sbU.toString();
    }

    public static HashMap l(qf.e eVar) {
        HashMap map = new HashMap();
        map.put("build_version", eVar.f20900h);
        map.put("display_version", eVar.f20899g);
        map.put("source", Integer.toString(eVar.f20901i));
        String str = eVar.f20898f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public static t n(fb.f fVar) {
        String str;
        fVar.z(2);
        int iO = fVar.o();
        int i10 = iO >> 1;
        int iO2 = ((fVar.o() >> 3) & 31) | ((iO & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = iO2 < 10 ? ".0" : ".";
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 24);
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(iO2);
        return new t(sb2.toString(), 5);
    }

    public static Long o(String... strArr) throws NumberFormatException {
        long j;
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                try {
                    String strA = zh.f.a(new File(strArr[i10]));
                    br.l.d(strA, "getFileContent(...)");
                    j = Long.parseLong(strA);
                } catch (NumberFormatException e4) {
                    ch.n.b("DataUsageReaderBelowApi24", e4);
                    j = -1;
                }
                return Long.valueOf(j);
            } catch (Exception e10) {
                ch.n.b("DataUsageReaderBelowApi24", e10);
            }
        }
        return null;
    }

    @Override // yi.e
    public long a(int i10) {
        return TrafficStats.getUidRxBytes(i10);
    }

    @Override // yi.e
    public Long b(yi.b bVar, yi.a aVar, yi.c cVar) {
        br.l.e(bVar, "dataInterface");
        br.l.e(aVar, "dataDirection");
        br.l.e(cVar, "dataUnit");
        int i10 = yi.h.f26404a[bVar.ordinal()];
        if (i10 == 1) {
            return o(k("rmnet_data0", aVar, cVar), k("rmnet0", aVar, cVar), k("rmnet_usb0", aVar, cVar));
        }
        if (i10 != 2) {
            throw new bf.n();
        }
        if (this.f2990d == null) {
            this.f2990d = "eth0";
        }
        return o(k(this.f2990d, aVar, cVar));
    }

    @Override // yi.e
    public long c() {
        return TrafficStats.getTotalRxBytes();
    }

    @Override // yi.e
    public long d() {
        return TrafficStats.getTotalTxBytes();
    }

    @Override // yi.e
    public long e(int i10) {
        return TrafficStats.getUidTxBytes(i10);
    }

    @Override // o7.d
    public String f() {
        return this.f2990d;
    }

    @Override // yi.e
    public long g(int i10) {
        return TrafficStats.getUidTxBytes(i10) + TrafficStats.getUidRxBytes(i10);
    }

    public JSONObject m(ag.b bVar) {
        String str = this.f2990d;
        int i10 = bVar.f345d;
        Log.isLoggable("FirebaseCrashlytics", 2);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            e0.c("FirebaseCrashlytics", "Settings request failed; (status: " + i10 + ") from " + str, null);
            return null;
        }
        String str2 = (String) bVar.f346g;
        try {
            return new JSONObject(str2);
        } catch (Exception e4) {
            e0.q("FirebaseCrashlytics", "Failed to parse settings JSON from " + str, e4);
            e0.q("FirebaseCrashlytics", "Settings response " + str2, null);
            return null;
        }
    }

    public String toString() {
        switch (this.f2989a) {
            case 0:
                return h0.b.r(new StringBuilder("<"), this.f2990d, '>');
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.f2990d;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(String str, int i10) {
        this.f2989a = i10;
        this.f2990d = str;
    }

    public t(String str) {
        this.f2989a = 3;
        br.l.e(str, "query");
        this.f2990d = str;
    }

    public t(String str, df.c cVar) {
        this.f2989a = 4;
        if (str != null) {
            this.f2990d = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    @Override // o7.d
    public void h(o7.c cVar) {
    }
}
