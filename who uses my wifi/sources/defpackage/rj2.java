package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rj2 implements g62 {
    public final Context f;
    public final mv1 g;
    public final PowerManager h;

    public rj2(Context context, mv1 mv1Var) {
        this.f = context;
        this.g = mv1Var;
        this.h = (PowerManager) context.getSystemService("power");
    }

    @Override // defpackage.g62
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject p(wj2 wj2Var) throws JSONException {
        boolean z;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        nv1 nv1Var = wj2Var.e;
        if (nv1Var == null) {
            jSONObject = new JSONObject();
        } else {
            mv1 mv1Var = this.g;
            if (mv1Var.b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z2 = nv1Var.a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", mv1Var.d).put("activeViewJSON", mv1Var.b).put("timestamp", wj2Var.c).put("adFormat", mv1Var.a).put("hashCode", mv1Var.c).put("isMraid", false).put("isStopped", false).put("isPaused", wj2Var.b).put("isNative", mv1Var.e).put("isScreenOn", this.h.isInteractive());
            jd1 jd1Var = hg4.C.i;
            synchronized (jd1Var) {
                z = jd1Var.a;
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("appMuted", z).put("appVolume", r10.i.a());
            Context context = this.f;
            jSONObjectPut2.put("deviceVolume", jd1.b(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut3 = jSONObject3.put("windowVisibility", nv1Var.b).put("isAttachedToWindow", z2);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = nv1Var.c;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = nv1Var.d;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = nv1Var.e;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", nv1Var.f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = nv1Var.g;
            JSONObject jSONObjectPut7 = jSONObjectPut6.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", nv1Var.h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = nv1Var.i;
            jSONObjectPut7.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", wj2Var.a);
            if (((Boolean) tw1.e.c.a(mz1.y1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = nv1Var.k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(wj2Var.d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
