package com.bytedance.sdk.openadsdk.yu;

import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly {
    private int bly;

    /* renamed from: le, reason: collision with root package name */
    public long f8754le;

    /* renamed from: lh, reason: collision with root package name */
    public final boolean f8755lh;
    public final vpp ouw;
    private final WebView tlj;
    public int yu;
    public String fkw = "landingpage";
    private final Map<Integer, Long> ra = new HashMap();
    private final List<Integer> pno = new ArrayList();
    public final Map<Integer, String> vt = new HashMap();

    public bly(vpp vppVar, WebView webView, boolean z3) {
        this.ouw = vppVar;
        this.tlj = webView;
        this.f8755lh = z3;
    }

    private void vt(boolean z3) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = this.tlj.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z3) {
                    int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                    this.yu = currentIndex + 1;
                    if (this.f8755lh) {
                        this.yu = currentIndex + 2;
                        return;
                    }
                    return;
                }
                int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex();
                this.bly = currentIndex2 + 1;
                if (this.f8755lh) {
                    this.bly = currentIndex2 + 2;
                }
            }
        } catch (Throwable th2) {
            qbp.lh("ArbitrageLandingLog", th2.toString());
        }
    }

    public final boolean ouw(boolean z3) {
        int i4 = z3 ? this.yu : this.bly;
        vt(z3);
        int i10 = z3 ? this.yu : this.bly;
        return i10 > 0 && i10 != i4;
    }
}
