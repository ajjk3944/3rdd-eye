package com.bytedance.sdk.openadsdk.core.zz;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class dg {
    private static volatile dg xq;
    private static int ypw;
    private final List<bw> emc = new ArrayList();

    public static dg emc() {
        if (xq == null) {
            synchronized (dg.class) {
                try {
                    if (xq == null) {
                        xq = new dg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return xq;
    }

    public int xq() {
        return this.emc.size();
    }

    @Nullable
    public bw ypw() {
        bw bwVarRemove;
        if (xq() > 0 && (bwVarRemove = this.emc.remove(0)) != null) {
            return bwVarRemove;
        }
        return null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void xq(bw bwVar) {
        if (bwVar == null || bwVar.getWebView() == null) {
            return;
        }
        if (bwVar.getParent() != null) {
            ((ViewGroup) bwVar.getParent()).removeView(bwVar);
        }
        try {
            bwVar.removeAllViews();
            bwVar.uym();
            bwVar.setWebChromeClient(null);
            bwVar.setWebViewClient(null);
            bwVar.setDownloadListener(null);
            bwVar.setDefaultTextEncodingName(C.UTF8_NAME);
            bwVar.setAllowFileAccess(false);
            bwVar.setJavaScriptEnabled(true);
            bwVar.setCacheMode(-1);
            bwVar.setDatabaseEnabled(true);
            bwVar.setSupportZoom(false);
            bwVar.getWebView().setLayerType(0, null);
            bwVar.setBackgroundColor(0);
            bwVar.getWebView().setHorizontalScrollBarEnabled(false);
            bwVar.getWebView().setHorizontalScrollbarOverlay(false);
            bwVar.getWebView().setVerticalScrollBarEnabled(false);
            bwVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.emc.xq.emc(bwVar);
            bwVar.qh();
            bwVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void ypw(bw bwVar) {
        if (bwVar != null) {
            if (this.emc.size() >= ypw) {
                bwVar.vk();
            } else {
                if (this.emc.contains(bwVar)) {
                    return;
                }
                xq(bwVar);
                this.emc.add(bwVar);
            }
        }
    }

    @UiThread
    public void emc(bw bwVar) {
        if (bwVar != null) {
            ypw(bwVar);
        }
    }
}
