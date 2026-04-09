package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import com.mbridge.msdk.foundation.controller.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class WebGLCheckSignal extends BaseWebGLCheckSignal {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f16218g = 0;

    public void webglState(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            c.n().c(jSONObject.optInt("webgl"));
            c.n().a(jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
