package com.bytedance.sdk.openadsdk.core.ryl.ouw;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class vt {
    public int fkw;

    /* renamed from: le, reason: collision with root package name */
    public ouw f8416le;

    /* renamed from: lh, reason: collision with root package name */
    protected int f8417lh;
    public int ouw;
    protected final Context vt;
    protected double yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        /* renamed from: lh, reason: collision with root package name */
        public boolean f8418lh;
        public int ouw;
        public int vt;
    }

    public vt(Context context, int i4, int i10) {
        this.f8417lh = 0;
        this.yu = 0.0d;
        if (i10 > 0 && i4 > 0) {
            this.yu = i4 / i10;
        }
        float fBly = osn.bly(context);
        if (fBly != 0.0f && i4 > 0) {
            this.f8417lh = (int) (i4 / fBly);
        }
        this.vt = context.getApplicationContext();
    }

    public static boolean ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public abstract com.bytedance.sdk.openadsdk.core.ryl.ouw ouw(String str, File file, List<lh> list);

    public final String ouw(String str, List<lh> list) throws JSONException {
        int i4 = this.ouw;
        if (i4 >= 5) {
            return null;
        }
        this.ouw = i4 + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
            vtVarVt.ouw(str);
            return vtVarVt.ouw().yu;
        } catch (Exception e2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("exception", e2.getMessage());
                jSONObject.put("error_code", 0);
                com.bytedance.sdk.openadsdk.rn.lh.ouw().ouw("load_vast", jSONObject);
            } catch (Exception unused) {
            }
            if (!list.isEmpty()) {
                lh.vt(null, list, com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.WRAPPER_TIMEOUT, -1L, null, null);
            }
            return null;
        }
    }
}
