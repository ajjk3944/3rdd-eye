package com.bytedance.sdk.openadsdk.core.zz;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.dg.zz;
import com.bytedance.sdk.openadsdk.core.model.cuf;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class ru extends com.bytedance.sdk.openadsdk.core.widget.emc.bw {
    private static final byte[] sup = {-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 1, 0, 0, 0, 1, 8, 6, 0, 0, 0, 31, 21, -60, -119, 0, 0, 0, 10, 73, 68, 65, 84, 120, -100, 99, 96, 96, 96, 96, 0, 0, 0, 3, 0, 1, -2, 60, -79, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    public ArrayList<Integer> emc;
    private boolean gbl;
    private com.bytedance.sdk.component.adexpress.ypw.sz ru;
    private final com.bytedance.sdk.openadsdk.core.model.rie ypw;

    public ru(Context context, rtt rttVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar, com.bytedance.sdk.openadsdk.dg.sz szVar, com.bytedance.sdk.component.adexpress.ypw.sz szVar2) {
        super(context, rttVar, rieVar.ye(), szVar, false);
        this.gbl = false;
        this.emc = new ArrayList<>();
        this.ypw = rieVar;
        this.ru = szVar2;
        this.gbl = com.bytedance.sdk.openadsdk.sra.emc.emc("inject_data_normal_open", 0) == 1;
    }

    private WebResourceResponse bw() throws Resources.NotFoundException {
        InputStream inputStreamOpenRawResource;
        int iZz = com.bytedance.sdk.openadsdk.core.zz.ypw().zz();
        if (iZz == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.aa.emc().getResources();
        if (resources != null) {
            try {
                TypedValue typedValue = new TypedValue();
                resources.getValueForDensity(iZz, 0, typedValue, true);
                CharSequence charSequence = typedValue.string;
                inputStreamOpenRawResource = (charSequence == null || !charSequence.toString().endsWith(".xml")) ? resources.openRawResource(iZz) : new ByteArrayInputStream(sup);
            } catch (Resources.NotFoundException e10) {
                com.bytedance.sdk.component.utils.ul.xq("ExpressClient", e10.toString());
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource != null) {
            return new WebResourceResponse(zz.emc.IMAGE.emc(), C.UTF8_NAME, inputStreamOpenRawResource);
        }
        return null;
    }

    private WebResourceResponse dg(String str, zz.emc emcVar) {
        InputStream inputStreamYpw;
        if (TextUtils.isEmpty(str) || (inputStreamYpw = qh.ypw(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(emcVar.emc(), C.UTF8_NAME, inputStreamYpw);
        emc(webResourceResponse);
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.emc.ypw.emc xq(String str, zz.emc emcVar) {
        cuf.emc emcVarYcc;
        JSONArray jSONArrayXq;
        cuf cufVarKv = this.ypw.kv();
        if (cufVarKv == null || (emcVarYcc = cufVarKv.ycc()) == null || (jSONArrayXq = emcVarYcc.xq()) == null || jSONArrayXq.length() <= 0) {
            return null;
        }
        return emc(jSONArrayXq, str, emcVar);
    }

    private com.bytedance.sdk.component.adexpress.emc.ypw.emc ypw(String str, zz.emc emcVar) {
        cuf.emc emcVarYcc;
        JSONArray jSONArrayYpw;
        cuf cufVarKv = this.ypw.kv();
        if (cufVarKv == null || (emcVarYcc = cufVarKv.ycc()) == null || (jSONArrayYpw = emcVarYcc.ypw()) == null || jSONArrayYpw.length() <= 0) {
            return null;
        }
        return emc(jSONArrayYpw, str, emcVar);
    }

    public int emc() {
        ArrayList<Integer> arrayList = this.emc;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Integer num = arrayList.get(i10);
            i10++;
            Integer num2 = num;
            if (num2.intValue() == 3 || num2.intValue() == 2 || num2.intValue() == -1) {
                return num2.intValue();
            }
        }
        return TextUtils.isEmpty(dg()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.uym = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.msw = false;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.component.adexpress.ypw.sz szVar = this.ru;
        if (szVar != null && szVar.rie() && this.gbl) {
            this.ru.xq();
            com.bytedance.sdk.component.utils.qh.emc(webView, "javascript:window.SDK_INJECT_DATA=" + this.ru.xq());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.emc("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            com.bytedance.sdk.component.adexpress.emc.ypw.emc r0 = r8.emc(r9, r10)     // Catch: java.lang.Throwable -> L19
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1d
            android.webkit.WebResourceResponse r1 = r0.emc()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1d
            r1 = 1
        L15:
            r6 = r10
            r7 = r1
            r1 = r8
            goto L1f
        L19:
            r0 = move-exception
            r1 = r8
            r6 = r10
            goto L4b
        L1d:
            r1 = 2
            goto L15
        L1f:
            r1.emc(r2, r4, r6, r7)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3e
            int r10 = r0.ypw()     // Catch: java.lang.Throwable -> L3c
            r2 = 5
            if (r10 == r2) goto L3e
            r0.ypw()     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList<java.lang.Integer> r10 = r1.emc     // Catch: java.lang.Throwable -> L3c
            int r2 = r0.ypw()     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3c
            r10.add(r2)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r0 = move-exception
            goto L4b
        L3e:
            if (r0 == 0) goto L52
            android.webkit.WebResourceResponse r10 = r0.emc()     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L52
            android.webkit.WebResourceResponse r9 = r0.emc()     // Catch: java.lang.Throwable -> L3c
            return r9
        L4b:
            java.lang.String r10 = "ExpressClient"
            java.lang.String r2 = "shouldInterceptRequest error2"
            com.bytedance.sdk.component.utils.ul.emc(r10, r2, r0)
        L52:
            android.webkit.WebResourceResponse r9 = super.shouldInterceptRequest(r9, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.zz.ru.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }

    private String dg() {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.ypw;
        if (rieVar == null) {
            return null;
        }
        if (rieVar.zhk() != null) {
            return this.ypw.zhk().gbl();
        }
        if (this.ypw.kv() != null) {
            return "v3";
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.emc.ypw.emc emc(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.sba sbaVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.equals("local://pag_open_icon_id") && !str.equals(com.bytedance.sdk.openadsdk.core.zz.emc.ypw.emc)) {
            rie.emc emcVarZhk = this.ypw.zhk();
            if (emcVarZhk != null && !TextUtils.isEmpty(str) && str.equals(emcVarZhk.ypw())) {
                com.bytedance.sdk.component.adexpress.emc.ypw.emc emcVar = new com.bytedance.sdk.component.adexpress.emc.ypw.emc();
                emcVar.emc(5);
                WebResourceResponse webResourceResponseBw = bw(str);
                emcVar.emc(webResourceResponseBw);
                com.bytedance.sdk.openadsdk.core.bw.emc.emc().emc(webResourceResponseBw != null);
                return emcVar;
            }
            zz.emc emcVarEmc = com.bytedance.sdk.component.adexpress.dg.zz.emc(str);
            if (qh.ypw(this.ypw)) {
                com.bytedance.sdk.component.adexpress.emc.ypw.emc emcVarEmc2 = emc(str, emcVarEmc);
                if (emcVarEmc2 != null) {
                    return emcVarEmc2;
                }
                com.bytedance.sdk.component.adexpress.emc.ypw.emc emcVarYpw = ypw(str, emcVarEmc);
                if (emcVarYpw != null) {
                    Log.d("ExpressClient", "interceptTemplate: Hit fetch file cache url=".concat(str));
                    return emcVarYpw;
                }
                com.bytedance.sdk.component.adexpress.emc.ypw.emc emcVarXq = xq(str, emcVarEmc);
                if (emcVarXq != null) {
                    return emcVarXq;
                }
            }
            if (emcVarEmc != zz.emc.IMAGE) {
                Iterator<com.bytedance.sdk.openadsdk.core.model.sba> it = this.ypw.rr().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.bytedance.sdk.openadsdk.core.model.sba next = it.next();
                    if (!TextUtils.isEmpty(next.emc()) && !TextUtils.isEmpty(str)) {
                        String strEmc = next.emc();
                        if (strEmc.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                            strEmc = strEmc.replaceFirst(HttpRequest.DEFAULT_SCHEME, "http");
                        }
                        if ((str.startsWith(HttpRequest.DEFAULT_SCHEME) ? str.replaceFirst(HttpRequest.DEFAULT_SCHEME, "http") : str).equals(strEmc)) {
                            sbaVar = next;
                            break;
                        }
                    }
                }
            }
            if (emcVarEmc != zz.emc.IMAGE && sbaVar == null) {
                return com.bytedance.sdk.component.adexpress.emc.ypw.ypw.emc(str, emcVarEmc, "", dg());
            }
            com.bytedance.sdk.component.adexpress.emc.ypw.emc emcVar2 = new com.bytedance.sdk.component.adexpress.emc.ypw.emc();
            emcVar2.emc(5);
            emcVar2.emc(emc(str, com.bytedance.sdk.openadsdk.core.zz.emc.ypw.emc(this.ypw, str)));
            return emcVar2;
        }
        com.bytedance.sdk.component.adexpress.emc.ypw.emc emcVar3 = new com.bytedance.sdk.component.adexpress.emc.ypw.emc();
        emcVar3.emc(5);
        emcVar3.emc(bw());
        return emcVar3;
    }

    private WebResourceResponse bw(String str) {
        InputStream inputStreamEmc;
        if (TextUtils.isEmpty(str) || (inputStreamEmc = com.bytedance.sdk.openadsdk.core.bw.emc.emc().emc(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", C.UTF8_NAME, inputStreamEmc);
        emc(webResourceResponse);
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.emc.ypw.emc emc(String str, zz.emc emcVar) {
        cuf.emc emcVarYcc;
        JSONArray jSONArrayEmc;
        cuf cufVarKv = this.ypw.kv();
        if (cufVarKv != null && (emcVarYcc = cufVarKv.ycc()) != null && (jSONArrayEmc = emcVarYcc.emc()) != null && jSONArrayEmc.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayEmc.length(); i10++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.gbl.dg.emc(jSONArrayEmc.optString(i10), com.bytedance.sdk.openadsdk.core.settings.gbl.xq().ylm()), str) && emcVar == zz.emc.IMAGE) {
                    com.bytedance.sdk.component.adexpress.emc.ypw.emc emcVar2 = new com.bytedance.sdk.component.adexpress.emc.ypw.emc();
                    emcVar2.emc(5);
                    emcVar2.emc(emc(str, com.bytedance.sdk.component.utils.bw.emc(str)));
                    return emcVar2;
                }
            }
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.emc.ypw.emc emc(JSONArray jSONArray, String str, zz.emc emcVar) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.gbl.dg.emc(jSONArray.optString(i10), com.bytedance.sdk.openadsdk.core.settings.gbl.xq().ylm()), str)) {
                    com.bytedance.sdk.component.adexpress.emc.ypw.emc emcVar2 = new com.bytedance.sdk.component.adexpress.emc.ypw.emc();
                    emcVar2.emc(5);
                    emcVar2.emc(dg(str, emcVar));
                    return emcVar2;
                }
            }
        }
        return null;
    }

    private WebResourceResponse emc(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamEmc = com.bytedance.sdk.openadsdk.ru.dg.emc(str, str2);
            if (inputStreamEmc == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(zz.emc.IMAGE.emc(), "utf-8", inputStreamEmc);
            try {
                emc(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th) {
                th = th;
                webResourceResponse = webResourceResponse2;
                com.bytedance.sdk.component.utils.ul.emc("ExpressClient", "get image WebResourceResponse error", th);
                return webResourceResponse;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void emc(long j10, long j11, String str, int i10) {
        com.bytedance.sdk.openadsdk.dg.sz szVar = this.ycc;
        if (szVar == null || szVar.ypw() == null) {
            return;
        }
        zz.emc emcVarEmc = com.bytedance.sdk.component.adexpress.dg.zz.emc(str);
        if (emcVarEmc == zz.emc.HTML) {
            this.ycc.ypw().emc(str, j10, j11, i10);
        } else if (emcVarEmc == zz.emc.JS) {
            this.ycc.ypw().ypw(str, j10, j11, i10);
        }
    }

    private void emc(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Access-Control-Allow-Origin", Marker.ANY_MARKER);
        webResourceResponse.setResponseHeaders(map);
    }
}
