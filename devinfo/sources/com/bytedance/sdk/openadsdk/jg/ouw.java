package com.bytedance.sdk.openadsdk.jg;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vm;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.ra.vt;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.bytedance.sdk.openadsdk.yu.lh;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {

    /* renamed from: lh, reason: collision with root package name */
    private static int f8551lh = 2;
    private static volatile ouw ouw = null;
    private static long yu = 3600000;
    private LinkedHashMap<Integer, SoftReference<le>> fkw;
    private final Handler vt;

    public ouw() {
        f8551lh = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pre_render_count", 2);
        long jOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pre_render_duration", 3600000);
        yu = jOuw;
        if (f8551lh <= 0) {
            f8551lh = 2;
        }
        if (jOuw <= 0) {
            yu = 3600000L;
        }
        this.fkw = new LinkedHashMap<>();
        this.vt = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                SoftReference softReference;
                int i4 = message.what;
                if (ouw.this.fkw == null || (softReference = (SoftReference) ouw.this.fkw.get(Integer.valueOf(i4))) == null) {
                    return false;
                }
                le leVar = (le) softReference.get();
                ouw.this.ouw(i4, 2, new vpp(), leVar == null ? "" : leVar.getTag());
                ko.vt("LPPreRenderManager", "time to delete PreRenderModel, reason is MODEL_DESTROY_REASON_OVER_TIME");
                return false;
            }
        });
    }

    public static boolean lh(vpp vppVar) {
        return th.pno(vppVar) || th.vt(vppVar) || th.lh(vppVar);
    }

    public final le vt(vpp vppVar) {
        if (vppVar == null || TextUtils.isEmpty(vppVar.osn)) {
            return null;
        }
        String str = vppVar.osn;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iHashCode = str.hashCode();
        SoftReference<le> softReference = this.fkw.get(Integer.valueOf(iHashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        le leVar = softReference.get();
        ouw(vppVar, leVar.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - vpp.ouw(vppVar.fak())).floatValue(), "web_use_pre_render");
        ouw(iHashCode, 3, vppVar, leVar.getTag());
        return leVar;
    }

    public static ouw ouw() {
        if (ouw == null) {
            synchronized (ouw.class) {
                try {
                    if (ouw == null) {
                        ouw = new ouw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }

    public final void ouw(final vpp vppVar) {
        final String str;
        if (vppVar == null || !lh(vppVar)) {
            return;
        }
        vm vmVar = vppVar.f8301mb;
        if (vmVar == null) {
            vmVar = new vm();
        }
        ko.ouw("LPPreRenderManager", "open pre render:", Boolean.valueOf(vppVar.ucs()));
        if (vppVar.ucs()) {
            String str2 = vppVar.osn;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            final int iHashCode = str2.hashCode();
            if (th.vt(vppVar)) {
                str = "landingpage_split_screen";
            } else if (th.yu(vppVar)) {
                str = "landingpage_direct";
            } else if (th.lh(vppVar)) {
                str = "landingpage_split_ceiling";
            } else {
                str = "";
            }
            LinkedHashMap<Integer, SoftReference<le>> linkedHashMap = this.fkw;
            if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                ko.vt("LPPreRenderManager", "mPreRenderLPModelMap has target url, return");
                return;
            }
            HashMap map = new HashMap();
            map.put(vppVar.f8298ki, vppVar);
            int i4 = vmVar.bly;
            if (i4 == 2) {
                vt.ouw().ouw((Map<String, vpp>) map, new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.2
                    @Override // com.bytedance.sdk.openadsdk.ra.vt.ouw
                    public final void ouw() {
                        ouw.this.ouw(iHashCode, vppVar, str, true);
                    }
                }, true);
                return;
            }
            if (i4 == 1) {
                vt.ouw().ouw((Map<String, vpp>) map, (vt.ouw) null, true);
                ouw(iHashCode, vppVar, str, true);
            } else if (i4 == 0) {
                ouw(iHashCode, vppVar, str, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final int i4, final vpp vppVar, final String str, final boolean z3) {
        ko.ouw("LPPreRenderManager", "begin pre render, useGecko", Boolean.valueOf(z3));
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.3
            /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 402
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.jg.ouw.AnonymousClass3.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(int i4, int i10, vpp vppVar, String str) {
        LinkedHashMap<Integer, SoftReference<le>> linkedHashMap = this.fkw;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i4))) {
            this.fkw.remove(Integer.valueOf(i4));
        }
        Handler handler = this.vt;
        if (handler != null) {
            handler.removeMessages(i4);
        }
        ouw(vppVar, str, i10);
    }

    public static void ouw(vpp vppVar, String str, final float f10, String str2) {
        lh.ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.4
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", f10);
                } catch (Throwable unused) {
                }
                ko.ouw("LPPreRenderManager", "onWebPreRender", Float.valueOf(f10));
                return jSONObject;
            }
        });
    }

    private static void ouw(vpp vppVar, final String str, final int i4) {
        lh.ouw(System.currentTimeMillis(), vppVar, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.5
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i4);
                } catch (Throwable unused) {
                }
                ko.ouw("LPPreRenderManager", "onDeletePreRenderWeb", jSONObject, str);
                return jSONObject;
            }
        });
    }

    public static /* synthetic */ void ouw(le leVar, String str) {
        if (leVar != null) {
            com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(zih.ouw());
            lhVarOuw.vt = false;
            lhVarOuw.ouw = false;
            lhVarOuw.ouw(leVar.getWebView());
            leVar.setMixedContentMode(0);
            ko.ouw("LPPreRenderManager", "begin to render,url is", str);
            zin.ouw(leVar, str);
        }
    }
}
