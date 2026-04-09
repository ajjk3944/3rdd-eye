package com.bytedance.sdk.openadsdk.core.bly;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.TypedValue;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.yu.bly;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tlj.yu;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj extends com.bytedance.sdk.openadsdk.core.widget.ouw.fkw {
    private static final byte[] vm = {-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 1, 0, 0, 0, 1, 8, 6, 0, 0, 0, 31, 21, -60, -119, 0, 0, 0, 10, 73, 68, 65, 84, 120, -100, 99, 96, 96, 96, 96, 0, 0, 0, 3, 0, 1, -2, 60, -79, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    public ArrayList<Integer> ouw;
    private com.bytedance.sdk.component.adexpress.vt.mwh rn;
    private final com.bytedance.sdk.openadsdk.core.model.vpp vt;
    private boolean zih;

    public tlj(Context context, bs bsVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, com.bytedance.sdk.openadsdk.yu.mwh mwhVar, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar2) {
        super(context, bsVar, vppVar.pv, mwhVar, false);
        this.zih = false;
        this.ouw = new ArrayList<>();
        this.vt = vppVar;
        this.rn = mwhVar2;
        this.zih = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("inject_data_normal_open", 0) == 1;
    }

    private com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouw(String str, bly.ouw ouwVar) {
        pd.ouw ouwVar2;
        JSONArray jSONArray;
        pd pdVar = this.vt.lht;
        if (pdVar != null && (ouwVar2 = pdVar.f8254le) != null && (jSONArray = ouwVar2.ouw) != null && jSONArray.length() > 0) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.cf.lh.ouw(jSONArray.optString(i4), com.bytedance.sdk.openadsdk.core.settings.cf.vt().tlj()), str) && ouwVar == bly.ouw.IMAGE) {
                    com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouwVar3 = new com.bytedance.sdk.component.adexpress.ouw.vt.ouw();
                    ouwVar3.vt = 5;
                    ouwVar3.ouw = ouw(str, com.bytedance.sdk.component.utils.fkw.ouw(str));
                    return ouwVar3;
                }
            }
        }
        return null;
    }

    private static WebResourceResponse yu() throws Resources.NotFoundException {
        InputStream inputStreamOpenRawResource;
        int iBly = com.bytedance.sdk.openadsdk.core.bly.ouw().bly();
        if (iBly == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.zih.ouw().getResources();
        if (resources != null) {
            try {
                TypedValue typedValue = new TypedValue();
                resources.getValueForDensity(iBly, 0, typedValue, true);
                CharSequence charSequence = typedValue.string;
                inputStreamOpenRawResource = (charSequence == null || !charSequence.toString().endsWith(".xml")) ? resources.openRawResource(iBly) : new ByteArrayInputStream(vm);
            } catch (Resources.NotFoundException e2) {
                com.bytedance.sdk.component.utils.qbp.lh("ExpressClient", e2.toString());
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource != null) {
            return new WebResourceResponse(bly.ouw.IMAGE.fkw, "UTF-8", inputStreamOpenRawResource);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.ra = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.pno = false;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.component.adexpress.vt.mwh mwhVar = this.rn;
        if (mwhVar != null && mwhVar.vpp && this.zih) {
            com.bytedance.sdk.component.utils.ko.ouw("Android_jsb", "trigger SDK_INJECT_DATA in pageStart, templateInfo is：", mwhVar.ouw());
            com.bytedance.sdk.component.utils.jg.ouw(webView, "javascript:window.SDK_INJECT_DATA=" + this.rn.ouw());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
    @TargetApi(21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw("ExpressClient", "shouldInterceptRequest error1", th2);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0162 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:3:0x0008, B:93:0x0184, B:95:0x018a, B:99:0x0191, B:101:0x0195, B:104:0x019a, B:114:0x01ba, B:116:0x01bf, B:118:0x01c3, B:120:0x01eb, B:122:0x01ef, B:7:0x0028, B:9:0x003b, B:12:0x0045, B:14:0x004b, B:16:0x0051, B:18:0x0059, B:26:0x0086, B:30:0x008d, B:21:0x0068, B:23:0x0071, B:31:0x00ac, B:33:0x00b8, B:36:0x00c1, B:49:0x00df, B:50:0x00e9, B:53:0x00f1, B:56:0x00f6, B:58:0x00fa, B:61:0x0101, B:39:0x00c9, B:42:0x00ce, B:44:0x00d2, B:47:0x00d9, B:64:0x0108, B:66:0x010c, B:67:0x0114, B:69:0x011a, B:71:0x0128, B:73:0x012e, B:76:0x0138, B:77:0x013c, B:79:0x0142, B:81:0x0148, B:85:0x0151, B:89:0x0158, B:91:0x0162, B:92:0x0176), top: B:127:0x0008 }] */
    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.bly.tlj.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }

    private static com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouw(JSONArray jSONArray, String str, bly.ouw ouwVar) {
        InputStream inputStreamLh;
        WebResourceResponse webResourceResponse = null;
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.cf.lh.ouw(jSONArray.optString(i4), com.bytedance.sdk.openadsdk.core.settings.cf.vt().tlj()), str)) {
                    com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouwVar2 = new com.bytedance.sdk.component.adexpress.ouw.vt.ouw();
                    ouwVar2.vt = 5;
                    if (!TextUtils.isEmpty(str) && (inputStreamLh = jg.lh(str)) != null) {
                        webResourceResponse = new WebResourceResponse(ouwVar.fkw, "UTF-8", inputStreamLh);
                        ouw(webResourceResponse);
                    }
                    ouwVar2.ouw = webResourceResponse;
                    return ouwVar2;
                }
            }
        }
        return null;
    }

    public final String ouw() {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.vt;
        if (vppVar == null) {
            return null;
        }
        vpp.ouw ouwVar = vppVar.xn;
        if (ouwVar != null) {
            return ouwVar.tlj;
        }
        if (vppVar.lht != null) {
            return "v3";
        }
        return null;
    }

    private static WebResourceResponse ouw(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamOuw = yu.ouw.vt.ouw(str, str2);
            if (inputStreamOuw == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(bly.ouw.IMAGE.fkw, "utf-8", inputStreamOuw);
            try {
                ouw(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th2) {
                th = th2;
                webResourceResponse = webResourceResponse2;
                com.bytedance.sdk.component.utils.qbp.ouw("ExpressClient", "get image WebResourceResponse error", th);
                return webResourceResponse;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static void ouw(WebResourceResponse webResourceResponse) {
        HashMap map = new HashMap();
        map.put("Access-Control-Allow-Origin", "*");
        webResourceResponse.setResponseHeaders(map);
    }
}
