package A3;

import E.u;
import I.j;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import d0.q;
import d0.s;
import d0.w;
import g5.InterfaceC4392b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import v.a0;
import v.o0;
import v.q0;
import v3.C5675a;
import v3.C5677c;
import v3.e;
import v3.i;
import y.C5787a;
import z1.C5852a;

/* compiled from: InstanceFactory.java */
/* loaded from: classes.dex */
public final class c implements b, I.c, z7.c, E1.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36c;

    public /* synthetic */ c(Object obj, int i) {
        this.f35b = i;
        this.f36c = obj;
    }

    public static boolean p(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String s(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // E1.b
    public E1.a a(String fileName) {
        l.f(fileName, "fileName");
        return new C5852a(((F1.c) this.f36c).getWritableDatabase());
    }

    @Override // z7.c
    public void b(Exception exc) {
        d(exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject c(android.view.View r5) throws org.json.JSONException {
        /*
            r4 = this;
            r5 = 0
            org.json.JSONObject r0 = L5.a.a(r5, r5, r5, r5)
            G5.i r1 = L5.c.f4068a
            android.app.UiModeManager r1 = A9.I.f190b
            r2 = 1
            if (r1 == 0) goto L15
            int r1 = r1.getCurrentModeType()
            if (r1 == r2) goto L1b
            r3 = 4
            if (r1 == r3) goto L18
        L15:
            G5.g r1 = G5.g.OTHER
            goto L1d
        L18:
            G5.g r1 = G5.g.CTV
            goto L1d
        L1b:
            G5.g r1 = G5.g.MOBILE
        L1d:
            G5.g r3 = G5.g.CTV
            if (r1 == r3) goto L24
            G5.i r1 = G5.i.UNKNOWN
            goto L26
        L24:
            G5.i r1 = L5.c.f4068a
        L26:
            int[] r3 = L5.a.C0070a.f4067a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 == r2) goto L31
            goto L32
        L31:
            r5 = r2
        L32:
            java.lang.String r1 = "noOutputDevice"
            r0.put(r1, r5)     // Catch: org.json.JSONException -> L38
            return r0
        L38:
            r5 = move-exception
            java.lang.String r1 = "OMIDLIB"
            java.lang.String r2 = "Error with setting output device status"
            android.util.Log.e(r1, r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.c.c(android.view.View):org.json.JSONObject");
    }

    @Override // z7.c
    public void d(Exception exc) {
        ((z7.c) this.f36c).b(exc);
    }

    public boolean e(String str) {
        String strM = m(str);
        return "1".equals(strM) || Boolean.parseBoolean(strM);
    }

    public Integer f(String str) {
        String strM = m(str);
        if (TextUtils.isEmpty(strM)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + s(str) + "(" + strM + ") into an int");
            return null;
        }
    }

    public JSONArray g(String str) {
        String strM = m(str);
        if (TextUtils.isEmpty(strM)) {
            return null;
        }
        try {
            return new JSONArray(strM);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + s(str) + ": " + strM + ", falling back to default");
            return null;
        }
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        return this.f36c;
    }

    public int[] h() throws JSONException {
        JSONArray jSONArrayG = g("gcm.n.light_settings");
        if (jSONArrayG == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayG.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayG.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayG.optInt(1);
            iArr[2] = jSONArrayG.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e4) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayG + ". " + e4.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayG + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] i(String str) {
        JSONArray jSONArrayG = g(str.concat("_loc_args"));
        if (jSONArrayG == null) {
            return null;
        }
        int length = jSONArrayG.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayG.optString(i);
        }
        return strArr;
    }

    public String j(String str) {
        return m(str.concat("_loc_key"));
    }

    public Long k() {
        String strM = m("gcm.n.event_time");
        if (TextUtils.isEmpty(strM)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strM));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + s("gcm.n.event_time") + "(" + strM + ") into a long");
            return null;
        }
    }

    public String l(String str, Resources resources, String str2) {
        String strM = m(str2);
        if (!TextUtils.isEmpty(strM)) {
            return strM;
        }
        String strJ = j(str2);
        if (!TextUtils.isEmpty(strJ)) {
            int identifier = resources.getIdentifier(strJ, "string", str);
            if (identifier == 0) {
                Log.w("NotificationParams", s(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
                return null;
            }
            Object[] objArrI = i(str2);
            if (objArrI == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, objArrI);
            } catch (MissingFormatArgumentException e4) {
                Log.w("NotificationParams", "Missing format argument for " + s(str2) + ": " + Arrays.toString(objArrI) + " Default value will be used.", e4);
            }
        }
        return null;
    }

    public String m(String str) {
        Bundle bundle = (Bundle) this.f36c;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public int n(byte[] bArr) {
        int i;
        byte b10;
        if (((LargeJpegImageQuirk) this.f36c) == null || !(("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.f15128a.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.d() || bArr.length > 10000000)) {
            return bArr.length;
        }
        int i10 = 2;
        while (true) {
            if (i10 + 4 <= bArr.length && (b10 = bArr[i10]) == -1) {
                int i11 = i10 + 2;
                int i12 = ((bArr[i11] & 255) << 8) | (bArr[i10 + 3] & 255);
                if (b10 == -1 && bArr[i10 + 1] == -38) {
                    while (true) {
                        i = i11 + 2;
                        if (i <= bArr.length) {
                            if (bArr[i11] == -1 && bArr[i11 + 1] == -39) {
                                break;
                            }
                            i11++;
                        } else {
                            break;
                        }
                    }
                } else {
                    i10 += i12 + 2;
                }
            } else {
                break;
            }
        }
        i = -1;
        return i != -1 ? i : bArr.length;
    }

    public long[] o() throws JSONException {
        JSONArray jSONArrayG = g("gcm.n.vibrate_timings");
        if (jSONArrayG == null) {
            return null;
        }
        try {
            if (jSONArrayG.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayG.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayG.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayG + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    @Override // I.c
    public void onFailure(Throwable th) {
        o0 o0Var;
        switch (this.f35b) {
            case 4:
                ((s) this.f36c).b(0, "Unable to acquire InputBuffer.", th);
                return;
            default:
                q0 q0Var = (q0) this.f36c;
                q0Var.c();
                a0 a0Var = q0Var.f46835b;
                Iterator it = a0Var.c().iterator();
                while (it.hasNext() && (o0Var = (o0) it.next()) != q0Var) {
                    o0Var.c();
                }
                synchronized (a0Var.f46663b) {
                    a0Var.f46666e.remove(q0Var);
                }
                return;
        }
    }

    @Override // I.c
    public void onSuccess(Object obj) {
        switch (this.f35b) {
            case 4:
                w wVar = (w) obj;
                s sVar = (s) this.f36c;
                sVar.f37273q.getClass();
                wVar.d(u.S());
                wVar.a();
                wVar.c();
                j.a(wVar.b(), new q(this), sVar.f37265h);
                break;
            default:
                break;
        }
    }

    public void q(w5.w wVar) {
        ((i) ((InterfaceC4392b) this.f36c).get()).a("FIREBASE_APPQUALITY_SESSION", new C5677c("json"), new B8.b(this, 17)).a(new C5675a(wVar, e.DEFAULT, null), new androidx.work.s());
    }

    public Bundle r() {
        Bundle bundle = (Bundle) this.f36c;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public c(z7.c logger, String templateId) {
        this.f35b = 5;
        l.f(logger, "logger");
        l.f(templateId, "templateId");
        this.f36c = logger;
    }

    public c(int i) {
        this.f35b = i;
        switch (i) {
            case 3:
                this.f36c = (LargeJpegImageQuirk) K.b.f2936a.e(LargeJpegImageQuirk.class);
                break;
            case 10:
                this.f36c = (SmallDisplaySizeQuirk) C5787a.f47852a.e(SmallDisplaySizeQuirk.class);
                break;
            default:
                this.f36c = new ConcurrentLinkedQueue();
                break;
        }
    }

    public c(F1.c openHelper) {
        this.f35b = 11;
        l.f(openHelper, "openHelper");
        this.f36c = openHelper;
    }

    public c(Bundle bundle) {
        this.f35b = 6;
        if (bundle != null) {
            this.f36c = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }
}
