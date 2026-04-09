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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f30 implements nq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10974a;

    /* renamed from: b, reason: collision with root package name */
    public final vg f10975b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager f10976c;

    public f30(Context context, vg vgVar) {
        this.f10974a = context;
        this.f10975b = vgVar;
        this.f10976c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.nq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject h(i30 i30Var) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        wg wgVar = i30Var.f12137e;
        if (wgVar == null) {
            jSONObject = new JSONObject();
        } else {
            vg vgVar = this.f10975b;
            if (vgVar.f17615b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z3 = wgVar.f18011a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", vgVar.f17617d).put("activeViewJSON", vgVar.f17615b).put("timestamp", i30Var.f12135c).put("adFormat", vgVar.f17614a).put("hashCode", vgVar.f17616c).put("isMraid", false).put("isStopped", false).put("isPaused", i30Var.f12134b).put("isNative", vgVar.f17618e).put("isScreenOn", this.f10976c.isInteractive()).put("appMuted", ua.j.C.f35266i.d()).put("appVolume", r6.f35266i.b());
            Context context = this.f10974a;
            jSONObjectPut.put("deviceVolume", ya.a.e(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", wgVar.f18012b).put("isAttachedToWindow", z3);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = wgVar.f18013c;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = wgVar.f18014d;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = wgVar.f18015e;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", wgVar.f18016f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = wgVar.g;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", wgVar.f18017h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = wgVar.f18018i;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", i30Var.f12133a);
            if (((Boolean) va.s.f36163e.f36166c.a(sk.N1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = wgVar.f18019k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(i30Var.f12136d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
