package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15192a = "d";

    public d(String str, String str2) {
        setKey(str);
        setRKE(str2);
    }

    private void a(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) throws JSONException {
        if (eVar.f15124b.f15149d == 204) {
            a(new JSONObject());
        } else {
            b(eVar);
        }
    }

    private void b(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) throws JSONException {
        JSONObject jSONObject = eVar.f15125c;
        if (jSONObject == null) {
            a("response result is null");
            return;
        }
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, -9999);
        if (iOptInt == -9999) {
            a(eVar.f15125c);
            return;
        }
        if (iOptInt != 1 && iOptInt != 200) {
            String strOptString = eVar.f15125c.optString(NotificationCompat.CATEGORY_MESSAGE);
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = "error message is null";
            }
            a(strOptString);
            return;
        }
        JSONObject jSONObjectOptJSONObject = eVar.f15125c.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            try {
                String strOptString2 = jSONObjectOptJSONObject.optString("r");
                if (!TextUtils.isEmpty(strOptString2)) {
                    String strA = v0.a(strOptString2, "ebmclXzZOhtU2sRlZxGL8A");
                    if (!TextUtils.isEmpty(strA)) {
                        try {
                            jSONObjectOptJSONObject = new JSONObject(strA);
                        } catch (Exception e10) {
                            q0.b(f15192a, e10.getMessage(), e10);
                        }
                    }
                }
            } catch (Exception e11) {
                q0.b(f15192a, "put rk error", e11);
            }
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.put("rk", getKey());
        }
        a(jSONObjectOptJSONObject);
    }

    public abstract void a(String str);

    public abstract void a(JSONObject jSONObject);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f15192a, "errorCode = " + aVar.f15126a);
        a(com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) throws JSONException {
        if (eVar == null) {
            a("response is null");
            return;
        }
        super.onSuccess(eVar);
        if (eVar.f15124b == null) {
            b(eVar);
        } else {
            a(eVar);
        }
    }

    public d() {
    }
}
