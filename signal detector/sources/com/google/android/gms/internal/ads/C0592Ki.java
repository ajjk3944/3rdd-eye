package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import t2.C2917a;

/* renamed from: com.google.android.gms.internal.ads.Ki, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0592Ki implements InterfaceC2237zc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9516a;

    /* renamed from: b, reason: collision with root package name */
    public final K7 f9517b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager f9518c;

    public C0592Ki(Context context, K7 k7) {
        this.f9516a = context;
        this.f9517b = k7;
        this.f9518c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2237zc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject d(C0626Mi c0626Mi) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        L7 l7 = c0626Mi.f9889e;
        if (l7 == null) {
            jSONObject = new JSONObject();
        } else {
            K7 k7 = this.f9517b;
            if (k7.f9453b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z6 = l7.f9621a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", k7.f9455d).put("activeViewJSON", k7.f9453b).put("timestamp", c0626Mi.f9887c).put("adFormat", k7.f9452a).put("hashCode", k7.f9454c).put("isMraid", false).put("isStopped", false).put("isPaused", c0626Mi.f9886b).put("isNative", k7.f9456e).put("isScreenOn", this.f9518c.isInteractive()).put("appMuted", p2.j.f22785C.i.d()).put("appVolume", r6.i.b());
            Context context = this.f9516a;
            jSONObjectPut.put("deviceVolume", C2917a.e(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", l7.f9622b).put("isAttachedToWindow", z6);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = l7.f9623c;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = l7.f9624d;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = l7.f9625e;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", l7.f9626f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = l7.f9627g;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", l7.f9628h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = l7.i;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", c0626Mi.f9885a);
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8638N1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = l7.f9630k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c0626Mi.f9888d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
