package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.snmp4j.util.SnmpConfigurator;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class Z2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f36311a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f36312b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f36313c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ X2 f36314d;

    public Z2(X2 x22, String str, Bundle bundle) {
        this.f36314d = x22;
        AbstractC7901p.f(str);
        this.f36311a = str;
        this.f36312b = new Bundle();
    }

    private final String c(Bundle bundle) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(SnmpConfigurator.O_CONTEXT_NAME, str);
                    if (com.google.android.gms.internal.measurement.U6.a() && this.f36314d.a().p(N.f36054W0)) {
                        if (obj instanceof String) {
                            jSONObject.put(SnmpConfigurator.O_VERSION, String.valueOf(obj));
                            jSONObject.put(SnmpConfigurator.O_TIMEOUT, "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put(SnmpConfigurator.O_VERSION, String.valueOf(obj));
                            jSONObject.put(SnmpConfigurator.O_TIMEOUT, "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put(SnmpConfigurator.O_VERSION, Arrays.toString((int[]) obj));
                            jSONObject.put(SnmpConfigurator.O_TIMEOUT, "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put(SnmpConfigurator.O_VERSION, Arrays.toString((long[]) obj));
                            jSONObject.put(SnmpConfigurator.O_TIMEOUT, "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put(SnmpConfigurator.O_VERSION, String.valueOf(obj));
                            jSONObject.put(SnmpConfigurator.O_TIMEOUT, "d");
                        } else {
                            this.f36314d.zzj().C().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } else {
                        jSONObject.put(SnmpConfigurator.O_VERSION, String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put(SnmpConfigurator.O_TIMEOUT, "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put(SnmpConfigurator.O_TIMEOUT, "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put(SnmpConfigurator.O_TIMEOUT, "d");
                        } else {
                            this.f36314d.zzj().C().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e10) {
                    this.f36314d.zzj().C().b("Cannot serialize bundle value to SharedPreferences", e10);
                }
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120 A[Catch: NumberFormatException | JSONException -> 0x0128, NumberFormatException | JSONException -> 0x0128, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0128, blocks: (B:9:0x0025, B:42:0x0091, B:42:0x0091, B:43:0x00a2, B:43:0x00a2, B:45:0x00a8, B:45:0x00a8, B:47:0x00b6, B:47:0x00b6, B:49:0x00c8, B:49:0x00c8, B:50:0x00d1, B:50:0x00d1, B:51:0x00d5, B:51:0x00d5, B:53:0x00db, B:53:0x00db, B:55:0x00e9, B:55:0x00e9, B:57:0x00fb, B:57:0x00fb, B:58:0x0104, B:58:0x0104, B:59:0x0108, B:59:0x0108, B:60:0x0114, B:60:0x0114, B:61:0x0120, B:61:0x0120, B:20:0x0052, B:23:0x005c, B:26:0x0066, B:29:0x0070, B:32:0x007a), top: B:75:0x0025, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Z2.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences.Editor editorEdit = this.f36314d.G().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.f36311a);
        } else {
            editorEdit.putString(this.f36311a, c(bundle2));
        }
        editorEdit.apply();
        this.f36313c = bundle2;
    }
}
