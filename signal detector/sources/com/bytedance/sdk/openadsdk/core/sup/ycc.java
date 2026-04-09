package com.bytedance.sdk.openadsdk.core.sup;

import R2.a;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc {
    final Set<Pair<View, FriendlyObstructionPurpose>> emc = new HashSet();
    private uym ypw;

    private ycc() {
        bw.emc(aa.emc());
    }

    private Handler bw() {
        return com.bytedance.sdk.component.utils.zz.ypw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void msw() {
        uym uymVar = this.ypw;
        if (uymVar != null) {
            try {
                uymVar.xq();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uym() {
        uym uymVar = this.ypw;
        if (uymVar != null) {
            try {
                uymVar.dg();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycc() {
        if (this.ypw != null) {
            try {
                emc((View) null, (FriendlyObstructionPurpose) null);
                this.ypw.ypw();
            } catch (Throwable unused) {
            }
        }
    }

    public void dg() {
        if (a.i()) {
            msw();
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.7
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.msw();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(WebView webView) {
        try {
            if (this.ypw == null) {
                this.ypw = msw.emc(webView);
            }
        } catch (Throwable th) {
            ul.xq("createWebViewSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createWebViewSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            bw.emc(map);
        }
    }

    public void xq() {
        if (a.i()) {
            uym();
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.6
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.uym();
                }
            });
        }
    }

    public static ycc emc() {
        return new ycc();
    }

    public void emc(final WebView webView) {
        if (webView == null || this.ypw != null) {
            return;
        }
        if (a.i()) {
            ypw(webView);
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.1
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.ypw(webView);
                }
            });
        }
    }

    public void ypw() {
        if (a.i()) {
            ycc();
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.4
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.ycc();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(boolean z6, float f2) {
        if (this.ypw != null) {
            try {
                emc((View) null, (FriendlyObstructionPurpose) null);
                this.ypw.emc(z6, f2);
            } catch (Throwable unused) {
            }
        }
    }

    public void emc(final View view, final rie rieVar) {
        if (this.ypw != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = rieVar.eh();
        final Set<ru> setYpw = dgVarEh != null ? dgVarEh.ypw() : null;
        if (view == null || setYpw == null) {
            return;
        }
        if (a.i()) {
            emc(view, setYpw, rieVar);
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.3
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.emc(view, (Set<ru>) setYpw, rieVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        uym uymVar = this.ypw;
        try {
            if (uymVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.emc.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                uymVar.emc(view, friendlyObstructionPurpose);
            }
            if (this.emc.size() > 0) {
                uymVar.emc(this.emc);
                this.emc.clear();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(View view, Set<ru> set, rie rieVar) {
        try {
            if (this.ypw == null) {
                this.ypw = msw.emc(view, set);
                if (rieVar.ak()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, rieVar.bw(), "track_create", (JSONObject) null);
            }
        } catch (Throwable th) {
            ul.xq("createVideoSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createVideoSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            bw.emc(map);
        }
    }

    public void ypw(long j6, boolean z6) {
        uym uymVar = this.ypw;
        if (uymVar != null) {
            try {
                uymVar.emc(j6 / 1000.0f, z6);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(boolean z6) {
        uym uymVar = this.ypw;
        if (uymVar != null) {
            try {
                uymVar.emc(z6);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(int i) {
        uym uymVar = this.ypw;
        if (uymVar != null) {
            try {
                uymVar.ypw(i);
            } catch (Throwable unused) {
            }
        }
    }

    public void emc(final boolean z6, final float f2) {
        if (a.i()) {
            ypw(z6, f2);
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.5
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.ypw(z6, f2);
                }
            });
        }
    }

    public void emc(final View view, final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (a.i()) {
            ypw(view, friendlyObstructionPurpose);
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.8
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.ypw(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    public void emc(final long j6, final boolean z6) {
        if (a.i()) {
            ypw(j6, z6);
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.9
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.ypw(j6, z6);
                }
            });
        }
    }

    public void emc(final boolean z6) {
        if (a.i()) {
            ypw(z6);
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.10
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.ypw(z6);
                }
            });
        }
    }

    public void emc(final int i) {
        if (a.i()) {
            ypw(i);
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.2
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.ypw(i);
                }
            });
        }
    }
}
