package com.bytedance.sdk.openadsdk.core.sup;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import d3.a;
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

    @UiThread
    public void dg() {
        if (a.a()) {
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

    @UiThread
    public void xq() {
        if (a.a()) {
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

    @UiThread
    public void emc(final WebView webView) {
        if (webView == null || this.ypw != null) {
            return;
        }
        if (a.a()) {
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

    @UiThread
    public void ypw() {
        if (a.a()) {
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
    public void ypw(boolean z10, float f10) {
        if (this.ypw != null) {
            try {
                emc((View) null, (FriendlyObstructionPurpose) null);
                this.ypw.emc(z10, f10);
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
        if (a.a()) {
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
    public void ypw(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
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

    public void ypw(long j10, boolean z10) {
        uym uymVar = this.ypw;
        if (uymVar != null) {
            try {
                uymVar.emc(j10 / 1000.0f, z10);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(boolean z10) {
        uym uymVar = this.ypw;
        if (uymVar != null) {
            try {
                uymVar.emc(z10);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(int i10) {
        uym uymVar = this.ypw;
        if (uymVar != null) {
            try {
                uymVar.ypw(i10);
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public void emc(final boolean z10, final float f10) {
        if (a.a()) {
            ypw(z10, f10);
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.5
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.ypw(z10, f10);
                }
            });
        }
    }

    @UiThread
    public void emc(@Nullable final View view, @Nullable final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (a.a()) {
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

    @UiThread
    public void emc(final long j10, final boolean z10) {
        if (a.a()) {
            ypw(j10, z10);
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.9
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.ypw(j10, z10);
                }
            });
        }
    }

    @UiThread
    public void emc(final boolean z10) {
        if (a.a()) {
            ypw(z10);
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.10
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.ypw(z10);
                }
            });
        }
    }

    @UiThread
    public void emc(final int i10) {
        if (a.a()) {
            ypw(i10);
        } else {
            bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.ycc.2
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.ypw(i10);
                }
            });
        }
    }
}
