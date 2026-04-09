package F9;

import A9.I;
import N7.B8;
import O4.C1457c;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: Symbol.kt */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1788a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final String f1789b;

    public y(String str) {
        this.f1789b = str;
    }

    public static void a(S4.a aVar, V4.i iVar) {
        String str = iVar.f12941a;
        if (str != null) {
            aVar.c("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        aVar.c("X-CRASHLYTICS-API-CLIENT-TYPE", ConstantDeviceInfo.APP_PLATFORM);
        aVar.c("X-CRASHLYTICS-API-CLIENT-VERSION", "19.0.3");
        aVar.c("Accept", "application/json");
        String str2 = iVar.f12942b;
        if (str2 != null) {
            aVar.c("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = iVar.f12943c;
        if (str3 != null) {
            aVar.c("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = iVar.f12944d;
        if (str4 != null) {
            aVar.c("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((C1457c) iVar.f12945e.c()).f10301a;
        if (str5 != null) {
            aVar.c("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(V4.i iVar) {
        HashMap map = new HashMap();
        map.put("build_version", iVar.f12948h);
        map.put("display_version", iVar.f12947g);
        map.put(AdRevenueConstants.SOURCE_KEY, Integer.toString(iVar.i));
        String str = iVar.f12946f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject c(S4.b bVar) {
        StringBuilder sb = new StringBuilder("Settings response code was: ");
        int i = bVar.f11912b;
        sb.append(i);
        String string = sb.toString();
        L4.e eVar = L4.e.f4061a;
        eVar.c(string);
        String str = this.f1789b;
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str2 = (String) bVar.f11913c;
            try {
                return new JSONObject(str2);
            } catch (Exception e4) {
                eVar.d("Failed to parse settings JSON from " + str, e4);
                eVar.d("Settings response " + str2, null);
            }
        } else {
            String str3 = "Settings request failed; (status: " + i + ") from " + str;
            if (eVar.a(6)) {
                Log.e("FirebaseCrashlytics", str3, null);
                return null;
            }
        }
        return null;
    }

    public String toString() {
        switch (this.f1788a) {
            case 0:
                return B8.j(new StringBuilder("<"), this.f1789b, '>');
            default:
                return super.toString();
        }
    }

    public y(String str, I i) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f1789b = str;
    }
}
