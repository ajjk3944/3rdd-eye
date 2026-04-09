package cl;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2941a;

    /* renamed from: b, reason: collision with root package name */
    public String f2942b;

    public static void a(i0.f fVar, re.c cVar) {
        String str = cVar.f32930a;
        if (str != null) {
            fVar.F("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        fVar.F("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        fVar.F("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.3");
        fVar.F("Accept", "application/json");
        String str2 = cVar.f32931b;
        if (str2 != null) {
            fVar.F("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = cVar.f32932c;
        if (str3 != null) {
            fVar.F("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = cVar.f32933d;
        if (str4 != null) {
            fVar.F("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = cVar.f32934e.c().f27538a;
        if (str5 != null) {
            fVar.F("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(re.c cVar) {
        HashMap map = new HashMap();
        map.put("build_version", cVar.f32936h);
        map.put("display_version", cVar.g);
        map.put("source", Integer.toString(cVar.f32937i));
        String str = cVar.f32935f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return d.h.E(str, " : ", str2);
    }

    public JSONObject c(t7.m mVar) {
        String str = this.f2942b;
        int i4 = mVar.f34473b;
        ge.e eVar = ge.e.f24699a;
        eVar.c("Settings response code was: " + i4);
        if (i4 != 200 && i4 != 201 && i4 != 202 && i4 != 203) {
            String str2 = "Settings request failed; (status: " + i4 + ") from " + str;
            if (eVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = (String) mVar.f34474c;
        try {
            return new JSONObject(str3);
        } catch (Exception e2) {
            eVar.d("Failed to parse settings JSON from " + str, e2);
            eVar.d("Settings response " + str3, null);
            return null;
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.f2942b, str, objArr));
        }
    }

    public String toString() {
        switch (this.f2941a) {
            case 0:
                return r5.c.l(new StringBuilder("<"), this.f2942b, '>');
            default:
                return super.toString();
        }
    }

    public u(String str, int i4) {
        this.f2941a = i4;
        switch (i4) {
            case 2:
                this.f2942b = r5.c.i(Process.myUid(), "UID: [", "]  PID: [", Process.myPid(), "] ").concat(str);
                break;
            default:
                this.f2942b = str;
                break;
        }
    }

    public u(String str, i7.b bVar) {
        this.f2941a = 3;
        if (str != null) {
            this.f2942b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
