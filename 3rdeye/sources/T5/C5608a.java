package t5;

import android.util.Log;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r5.f;
import s5.C5576b;
import v5.b;
import v5.c;
import v5.d;

/* compiled from: RolloutsStateFactory.java */
/* renamed from: t5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5608a {

    /* renamed from: a, reason: collision with root package name */
    public C5576b f46424a;

    /* renamed from: b, reason: collision with root package name */
    public C5576b f46425b;

    public final c a(com.google.firebase.remoteconfig.internal.b bVar) throws f {
        String string;
        JSONArray jSONArray = bVar.f23304g;
        long j4 = bVar.f23303f;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                com.google.firebase.remoteconfig.internal.b bVarC = this.f46424a.c();
                String string3 = null;
                if (bVarC == null) {
                    string = null;
                } else {
                    try {
                        string = bVarC.f23299b.getString(strOptString);
                    } catch (JSONException unused) {
                    }
                }
                if (string == null) {
                    com.google.firebase.remoteconfig.internal.b bVarC2 = this.f46425b.c();
                    if (bVarC2 != null) {
                        try {
                            string3 = bVarC2.f23299b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i10 = d.f47058a;
                b.a aVar = new b.a();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                aVar.f47051a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                aVar.f47052b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                aVar.f47053c = strOptString;
                aVar.f47054d = string;
                aVar.f47055e = j4;
                aVar.f47056f = (byte) (aVar.f47056f | 1);
                hashSet.add(aVar.a());
            } catch (JSONException e4) {
                throw new f("Exception parsing rollouts metadata to create RolloutsState.", e4);
            }
        }
        return new c(hashSet);
    }
}
