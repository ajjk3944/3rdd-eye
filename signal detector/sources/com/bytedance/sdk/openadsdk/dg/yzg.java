package com.bytedance.sdk.openadsdk.dg;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yzg implements com.bytedance.sdk.openadsdk.dg.dg.bw {
    private Boolean bw;
    private Boolean dg;
    private String emc;
    private JSONArray msw;
    private JSONArray uym;
    private Boolean xq;
    private JSONObject ycc;
    private rie ypw;

    public yzg(int i, String str, rie rieVar) throws JSONException {
        Boolean bool = Boolean.FALSE;
        this.xq = bool;
        this.dg = bool;
        this.bw = bool;
        this.emc = str;
        this.ypw = rieVar;
        this.ycc = new JSONObject();
        this.uym = new JSONArray();
        this.msw = new JSONArray();
        emc(this.ycc, "webview_source", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean aa() {
        if (this.bw.booleanValue()) {
            return true;
        }
        return this.dg.booleanValue() && this.xq.booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.dg
    public void cf() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.16
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.bw
    public void gbl() {
        this.xq = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.xq
    public void msw() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.2
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.ypw
    public void qh() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.15
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.xq
    public void ru() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.4
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg.this.emc(jSONObject, "type", "native_enterForeground");
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.uym, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.bw
    public void sup() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.10
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (yzg.this.aa()) {
                    if (yzg.this.uym != null && yzg.this.uym.length() != 0) {
                        try {
                            yzg.this.ycc.put("native_switchBackgroundAndForeground", yzg.this.uym);
                        } catch (Exception unused) {
                        }
                    }
                    if (yzg.this.msw != null && yzg.this.msw.length() != 0) {
                        try {
                            yzg.this.ycc.put("intercept_source", yzg.this.msw);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("webview_time_track", yzg.this.ycc);
                    } catch (JSONException e6) {
                        ul.emc("WebviewTimeTrack", "trySendTrackInfo json error", e6);
                    }
                    if (com.bytedance.sdk.openadsdk.core.zz.ypw().aa() && yzg.this.ycc != null) {
                        JSONObject unused3 = yzg.this.ycc;
                    }
                    xq.ypw(yzg.this.ypw, yzg.this.emc, "webview_time_track", jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.ypw
    public void sz() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.14
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "native_render_end", jSONObject);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                yzg.this.emc(jSONObject2, "ts", Long.valueOf(jCurrentTimeMillis2));
                yzg yzgVar2 = yzg.this;
                yzgVar2.emc(yzgVar2.ycc, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.xq
    public void uym() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.31
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.dg
    public void vk() {
        try {
            com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.17
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    yzg yzgVar = yzg.this;
                    yzgVar.emc(yzgVar.ycc, "render_did_finish", jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.xq
    public void zz() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.3
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg.this.emc(jSONObject, "type", "native_enterBackground");
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.uym, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.ycc
    public void bw() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.28
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.xq
    public void dg() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.27
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.emc
    public void uym(final String str) {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.24
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.ypw
    public void xq() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.26
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.ycc
    public void ycc() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.29
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.dg
    public void ypw() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.12
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.emc
    public void bw(final String str) {
        try {
            com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.20
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    yzg yzgVar = yzg.this;
                    yzgVar.emc(yzgVar.ycc, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.emc
    public void dg(final String str) {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.18
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.emc
    public void xq(final String str) {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.11
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.emc
    public void ycc(final String str) {
        try {
            com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.21
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    yzg yzgVar = yzg.this;
                    yzgVar.emc(yzgVar.ycc, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.ycc
    public void ypw(final String str, final long j6, final long j7, final int i) {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.6
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str) || j7 < j6) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "start_ts", Long.valueOf(j6));
                yzg.this.emc(jSONObject, "end_ts", Long.valueOf(j7));
                yzg.this.emc(jSONObject, "intercept_type", Integer.valueOf(i));
                yzg.this.emc(jSONObject, "type", "intercept_js");
                yzg.this.emc(jSONObject, "url", str);
                yzg.this.emc(jSONObject, "duration", Long.valueOf(j7 - j6));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.msw, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.emc
    public void xq(final int i, final String str) {
        try {
            com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.22
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    yzg.this.emc(jSONObject, "code", Integer.valueOf(i));
                    yzg yzgVar = yzg.this;
                    yzgVar.emc(yzgVar.ycc, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.ycc
    public void ypw(final String str) {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.8
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg.this.emc(jSONObject, "jsb", str);
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.ycc
    public void ypw(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.9
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject2;
                if (yzg.this.ycc == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    yzg yzgVar = yzg.this;
                    yzgVar.emc(yzgVar.ycc, next, jSONObject.opt(next));
                }
                yzg.this.dg = Boolean.TRUE;
                yzg.this.sup();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.dg
    public void emc() {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.1
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg yzgVar = yzg.this;
                yzgVar.emc(jSONObject, "render_sequence", Integer.valueOf(yzgVar.ypw.ej()));
                if (yzg.this.ypw != null) {
                    if (yzg.this.ypw.zhk() != null) {
                        if (yzg.this.ypw.zhk().sup()) {
                            yzg.this.emc(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.bw.bw.emc().dg()));
                            yzg.this.emc(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.bw.bw.emc().dg()));
                        } else {
                            yzg.this.emc(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.bw.bw.emc().xq()));
                            yzg.this.emc(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.bw.bw.emc().xq()));
                        }
                    } else if (yzg.this.ypw.kv() != null) {
                        yzg.this.emc(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.bw.bw.emc().dg()));
                        yzg.this.emc(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.bw.bw.emc().dg()));
                    }
                }
                yzg yzgVar2 = yzg.this;
                yzgVar2.emc(yzgVar2.ycc, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.emc
    public void ypw(final int i, final String str) {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.13
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg.this.emc(jSONObject, "code", Integer.valueOf(i));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.dg
    public void emc(final int i, final String str) {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.23
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg.this.emc(jSONObject, "code", Integer.valueOf(i));
                String str2 = str;
                if (str2 != null) {
                    yzg.this.emc(jSONObject, "reason", str2);
                }
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.ycc
    public void emc(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.30
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                yzg.this.emc(jSONObject2, "ts", Long.valueOf(System.currentTimeMillis()));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.ycc
    public void emc(final String str, final long j6, final long j7, final int i) {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.5
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str) || j7 < j6) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "start_ts", Long.valueOf(j6));
                yzg.this.emc(jSONObject, "end_ts", Long.valueOf(j7));
                yzg.this.emc(jSONObject, "intercept_type", Integer.valueOf(i));
                yzg.this.emc(jSONObject, "type", "intercept_html");
                yzg.this.emc(jSONObject, "url", str);
                yzg.this.emc(jSONObject, "duration", Long.valueOf(j7 - j6));
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.msw, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.ycc
    public void emc(final String str) {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.7
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg.this.emc(jSONObject, "jsb", str);
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "webview_jsb_start", jSONObject);
            }
        });
    }

    public yzg() {
        this.emc = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.xq = bool;
        this.dg = bool;
        this.bw = bool;
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.bw
    public void emc(boolean z6) {
        this.bw = Boolean.valueOf(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(JSONObject jSONObject, String str, Object obj, boolean z6) throws JSONException {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z6) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(JSONObject jSONObject, String str, Object obj) throws JSONException {
        emc(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.emc
    public void emc(final String str, final boolean z6) {
        try {
            com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.19
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    yzg.this.emc(jSONObject, "isReuse", Integer.valueOf(z6 ? 1 : 0));
                    yzg yzgVar = yzg.this;
                    yzgVar.emc(yzgVar.ycc, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.dg.dg.ycc
    public void emc(final int i) {
        com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.yzg.25
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                yzg.this.emc(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                yzg.this.emc(jSONObject, "isWebViewCache", Integer.valueOf(i));
                if (yzg.this.ypw != null) {
                    if (yzg.this.ypw.dor()) {
                        yzg.this.emc(jSONObject, "engine_version", "v3");
                    } else {
                        yzg.this.emc(jSONObject, "engine_version", "v1");
                    }
                }
                yzg yzgVar = yzg.this;
                yzgVar.emc(yzgVar.ycc, "before_webview_request", jSONObject);
            }
        });
    }
}
