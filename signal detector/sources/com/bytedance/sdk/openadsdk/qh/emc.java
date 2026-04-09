package com.bytedance.sdk.openadsdk.qh;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.model.yzg;
import com.bytedance.sdk.openadsdk.core.widget.emc.bw;
import com.bytedance.sdk.openadsdk.core.widget.emc.xq;
import com.bytedance.sdk.openadsdk.dg.sz;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.sra;
import com.bytedance.sdk.openadsdk.uym.ypw;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private static long dg = 3600000;
    private static volatile emc emc = null;
    private static int xq = 2;
    private LinkedHashMap<Integer, SoftReference<ycc>> bw;
    private final Handler ypw;

    public emc() {
        xq = com.bytedance.sdk.openadsdk.sra.emc.emc("pre_render_count", 2);
        long jEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("pre_render_duration", 3600000);
        dg = jEmc;
        if (xq <= 0) {
            xq = 2;
        }
        if (jEmc <= 0) {
            dg = 3600000L;
        }
        this.bw = new LinkedHashMap<>();
        this.ypw = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.qh.emc.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                SoftReference softReference;
                int i = message.what;
                if (emc.this.bw == null || (softReference = (SoftReference) emc.this.bw.get(Integer.valueOf(i))) == null) {
                    return false;
                }
                ycc yccVar = (ycc) softReference.get();
                emc.this.emc(i, 2, new rie(), yccVar == null ? "" : yccVar.getTag());
                return false;
            }
        });
    }

    public static boolean xq(rie rieVar) {
        return ul.msw(rieVar) || ul.ypw(rieVar) || ul.xq(rieVar);
    }

    public ycc ypw(rie rieVar) {
        if (rieVar == null || TextUtils.isEmpty(rieVar.xst())) {
            return null;
        }
        String strXst = rieVar.xst();
        if (TextUtils.isEmpty(strXst)) {
            return null;
        }
        int iHashCode = strXst.hashCode();
        SoftReference<ycc> softReference = this.bw.get(Integer.valueOf(iHashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        ycc yccVar = softReference.get();
        emc(rieVar, yccVar.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - rieVar.ipz()).floatValue(), "web_use_pre_render");
        emc(iHashCode, 3, rieVar, yccVar.getTag());
        return yccVar;
    }

    public static emc emc() {
        if (emc == null) {
            synchronized (emc.class) {
                try {
                    if (emc == null) {
                        emc = new emc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public void emc(final rie rieVar) {
        final String str;
        if (rieVar == null || !xq(rieVar)) {
            return;
        }
        yzg yzgVarDb = rieVar.db();
        if (yzgVarDb == null) {
            yzgVarDb = new yzg();
        }
        rieVar.ckv();
        if (rieVar.ckv()) {
            String strXst = rieVar.xst();
            if (TextUtils.isEmpty(strXst)) {
                return;
            }
            final int iHashCode = strXst.hashCode();
            if (ul.ypw(rieVar)) {
                str = "landingpage_split_screen";
            } else if (ul.dg(rieVar)) {
                str = "landingpage_direct";
            } else if (ul.xq(rieVar)) {
                str = "landingpage_split_ceiling";
            } else {
                str = "";
            }
            LinkedHashMap<Integer, SoftReference<ycc>> linkedHashMap = this.bw;
            if (linkedHashMap == null || !linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                HashMap map = new HashMap();
                map.put(rieVar.qlw(), rieVar);
                if (yzgVarDb.ypw() == 2) {
                    ypw.emc().emc((Map<String, rie>) map, new ypw.emc() { // from class: com.bytedance.sdk.openadsdk.qh.emc.2
                        @Override // com.bytedance.sdk.openadsdk.uym.ypw.emc
                        public void emc() {
                            emc.this.emc(iHashCode, rieVar, str, true);
                        }
                    }, true);
                    return;
                }
                if (yzgVarDb.ypw() == 1) {
                    ypw.emc().emc((Map<String, rie>) map, (ypw.emc) null, true);
                    emc(iHashCode, rieVar, str, true);
                } else if (yzgVarDb.ypw() == 0) {
                    emc(iHashCode, rieVar, str, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final int i, final rie rieVar, final String str, final boolean z6) {
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qh.emc.3
            private bw emc(final ycc yccVar, sz szVar) {
                bw bwVar = new bw(aa.emc(), null, rieVar.ye(), szVar, true) { // from class: com.bytedance.sdk.openadsdk.qh.emc.3.3
                    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str2) {
                        ycc yccVar2 = yccVar;
                        if (yccVar2 != null) {
                            yccVar2.setPreFinish(true);
                        }
                        super.onPageFinished(webView, str2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                    public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        ycc yccVar2 = yccVar;
                        if (yccVar2 != null) {
                            yccVar2.setPreStart(true);
                        }
                        super.onPageStarted(webView, str2, bitmap);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, int i3, String str2, String str3) {
                        String strDg = bw.dg(str3);
                        boolean z7 = false;
                        boolean z8 = strDg != null && strDg.startsWith("image");
                        if (strDg != null && strDg.startsWith("mp4")) {
                            z7 = true;
                        }
                        if (!z8 && !z7 && !yccVar.xq()) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            emc.this.emc(i, 4, rieVar, str);
                        }
                        super.onReceivedError(webView, i3, str2, str3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (sslErrorHandler != null) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            emc.this.emc(i, 4, rieVar, str);
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                        try {
                            if (!z6) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            ycc yccVar2 = yccVar;
                            if (yccVar2 != null) {
                                yccVar2.emc++;
                            }
                            WebResourceResponseModel webResourceResponseModelEmc = ypw.emc().emc(ypw.emc().ypw(), rieVar.qlw(), str2);
                            if (webResourceResponseModelEmc != null && webResourceResponseModelEmc.getWebResourceResponse() != null) {
                                ycc yccVar3 = yccVar;
                                if (yccVar3 != null) {
                                    yccVar3.ypw++;
                                }
                                return webResourceResponseModelEmc.getWebResourceResponse();
                            }
                            if (yccVar != null && webResourceResponseModelEmc != null && webResourceResponseModelEmc.getMsg() == 2) {
                                yccVar.xq++;
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable unused) {
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                        return super.shouldOverrideUrlLoading(webView, str2);
                    }
                };
                bwVar.emc(rieVar);
                bwVar.emc(str);
                return bwVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 387
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.qh.emc.AnonymousClass3.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i, int i3, rie rieVar, String str) {
        LinkedHashMap<Integer, SoftReference<ycc>> linkedHashMap = this.bw;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i))) {
            this.bw.remove(Integer.valueOf(i));
        }
        Handler handler = this.ypw;
        if (handler != null) {
            handler.removeMessages(i);
        }
        emc(rieVar, str, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(ycc yccVar, String str) {
        if (yccVar == null) {
            return;
        }
        xq.emc(aa.emc()).emc(false).ypw(false).emc(yccVar.getWebView());
        yccVar.setMixedContentMode(0);
        sra.emc(yccVar, str);
    }

    public static void emc(rie rieVar, String str, final float f2, String str2) {
        com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, str, str2, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.qh.emc.4
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", f2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void emc(rie rieVar, final String str, final int i) {
        com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.qh.emc.5
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }
}
