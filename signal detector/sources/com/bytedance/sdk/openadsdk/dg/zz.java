package com.bytedance.sdk.openadsdk.dg;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class zz {
    private final boolean bw;
    private final rie emc;
    private final WebView msw;
    private long ru;
    private int uym;
    private int ycc;
    private String zz = "landingpage";
    private final Map<Integer, Long> ypw = new HashMap();
    private final List<Integer> xq = new ArrayList();
    private final Map<Integer, String> dg = new HashMap();

    public zz(rie rieVar, WebView webView, boolean z6) {
        this.emc = rieVar;
        this.msw = webView;
        this.bw = z6;
    }

    public void emc(String str, int i) {
        if (this.bw) {
            i++;
        }
        if (emc(true)) {
            xq.emc(this.emc, this.zz, this.ycc, str, i);
            this.dg.put(Integer.valueOf(this.ycc), str);
            this.ru = SystemClock.elapsedRealtime();
        }
    }

    public void xq(String str) {
        this.zz = str;
    }

    public void ypw(String str) {
        String str2 = this.dg.get(Integer.valueOf(this.ycc));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i = this.ycc;
        if (i > 0) {
            xq.emc(this.emc, this.zz, i, str3, str, 1);
        }
    }

    private void ypw(boolean z6) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = this.msw.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z6) {
                    int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                    this.ycc = currentIndex + 1;
                    if (this.bw) {
                        this.ycc = currentIndex + 2;
                        return;
                    }
                    return;
                }
                int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex();
                this.uym = currentIndex2 + 1;
                if (this.bw) {
                    this.uym = currentIndex2 + 2;
                }
            }
        } catch (Throwable th) {
            ul.xq("ArbitrageLandingLog", th.toString());
        }
    }

    public void emc(String str) {
        if (emc(false)) {
            xq.emc(this.emc, this.zz, this.ycc, str, SystemClock.elapsedRealtime() - this.ru);
        }
    }

    public void emc(WebView webView, String str) {
        rie rieVar = this.emc;
        if (rieVar == null || !com.bytedance.sdk.component.zz.ypw.emc(rieVar.ee().xq(), str)) {
            return;
        }
        String str2 = this.dg.get(Integer.valueOf(this.ycc));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        xq.emc(this.emc, this.zz, this.ycc, str2, str, 2);
    }

    private boolean emc(boolean z6) {
        int i = z6 ? this.ycc : this.uym;
        ypw(z6);
        int i3 = z6 ? this.ycc : this.uym;
        return i3 > 0 && i3 != i;
    }
}
