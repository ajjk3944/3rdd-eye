package com.bytedance.sdk.openadsdk.core.bly;

import com.bytedance.sdk.openadsdk.utils.bs;
import je.u;
import org.json.JSONException;
import org.json.JSONObject;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class mwh implements com.bytedance.adsdk.ugeno.core.vm, com.bytedance.sdk.component.adexpress.vt.bly {
    private long fkw;

    /* renamed from: le, reason: collision with root package name */
    private boolean f8067le;

    /* renamed from: lh, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.yu.yu.fkw f8068lh;
    final String ouw;
    final com.bytedance.sdk.openadsdk.core.model.vpp vt;
    private final String yu;

    public mwh(com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar, String str, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str2, boolean z3) {
        this.f8068lh = fkwVar;
        this.ouw = str;
        this.yu = str2;
        this.vt = vppVar;
        this.f8067le = z3;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void bly() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "no native render");
        this.f8068lh.ko();
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void cf() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "render success");
        this.f8068lh.vt();
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void fkw() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "WebView start load");
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void le() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "webview render success");
        this.f8068lh.vt();
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void lh(int i4) {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onDynamicParseEnd() called with: renderType = [" + i4 + "]");
        if (i4 == 3) {
            this.f8068lh.yu("dynamic_sub_analysis2_end");
        } else {
            this.f8068lh.yu("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void ouw(boolean z3) {
        this.f8068lh.ouw(z3 ? 1 : 0);
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "webview start request");
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void pno() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "native success");
        this.f8068lh.ryl();
        this.f8068lh.jg();
        bs.vt(new com.bytedance.sdk.component.pno.pno("native_success") { // from class: com.bytedance.sdk.openadsdk.core.bly.mwh.2
            @Override // java.lang.Runnable
            public final void run() {
                mwh mwhVar = mwh.this;
                com.bytedance.sdk.openadsdk.yu.lh.vt(mwhVar.vt, mwhVar.ouw, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void ra() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "native render start");
        this.f8068lh.lh();
    }

    public final void ryl() {
        this.f8068lh.cf();
        this.f8068lh.mwh();
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void tlj() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "render fail");
        this.f8068lh.rn();
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void vt(int i4) {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onDynamicParseStart() called with: renderType = [" + i4 + "]");
        if (i4 == 3) {
            this.f8068lh.yu("dynamic_sub_analysis2_start");
        } else {
            this.f8068lh.yu("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void yu() {
        this.f8068lh.ouw();
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "start render ");
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void fkw(int i4) {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onDynamicRealRenderEnd() called with: renderType = [" + i4 + "]");
        if (i4 == 3) {
            this.f8068lh.yu("dynamic_sub_render2_end");
        } else {
            this.f8068lh.yu("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void le(int i4) {
        final String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbW = u.w(i4, "dynamic render success render type: ", "; ****cost time(ms): ");
        sbW.append(jCurrentTimeMillis - this.fkw);
        sbW.append("****");
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", sbW.toString());
        if (i4 == 3) {
            this.f8068lh.ra("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.f8068lh.ra("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.f8068lh.ryl();
        bs.vt(new com.bytedance.sdk.component.pno.pno("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.bly.mwh.1
            @Override // java.lang.Runnable
            public final void run() {
                mwh mwhVar = mwh.this;
                com.bytedance.sdk.openadsdk.yu.lh.vt(mwhVar.vt, mwhVar.ouw, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void ouw(int i4, String str) throws JSONException {
        this.f8068lh.ouw(i4, str);
        cf.ouw("Web", i4, str, this.ouw, this.yu, this.vt);
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onWebViewFail() called with: errorCode = [" + i4 + "]");
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void yu(int i4) {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onDynamicRealRenderStart() called with: renderType = [" + i4 + "]");
        if (i4 == 3) {
            this.f8068lh.yu("dynamic_sub_render2_start");
        } else {
            this.f8068lh.yu("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.vm
    public final void lh() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "ugen real render start ");
        this.f8068lh.fkw("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.vm
    public final void vt() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "ugen parse end");
        this.f8068lh.fkw("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void ouw(int i4) {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onDynamicStart() called with: renderType = [" + i4 + "]");
        this.fkw = System.currentTimeMillis();
        if (i4 == 3) {
            this.f8068lh.lh("dynamic_render2_start");
        } else {
            this.f8068lh.lh("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void ouw(int i4, int i10, String str, boolean z3) throws JSONException {
        StringBuilder sbN = c.n(i4, "onDynamicFail() called with: renderType = [", "], errorCode = [", i10, "], hasNext = [");
        sbN.append(z3);
        sbN.append("]");
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", sbN.toString());
        if (!z3) {
            this.f8068lh.ryl();
        }
        if (i4 == 3) {
            this.f8068lh.vt(i10, "dynamic_render2_error");
        } else {
            this.f8068lh.vt(i10, "dynamic_render_error");
        }
        cf.ouw("NDR", i10, str, this.ouw, this.yu, this.vt);
    }

    @Override // com.bytedance.adsdk.ugeno.core.vm
    public final void ouw() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "ugen parse start");
        this.f8068lh.ouw("ugen_render_start", this.f8067le);
        this.f8068lh.fkw("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.vm
    public final void ouw(com.bytedance.adsdk.ugeno.core.zih zihVar) throws JSONException {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "ugen real render end ");
        int i4 = zihVar.ouw;
        if (i4 == 0) {
            this.f8068lh.fkw("ugen_sub_render_end");
            this.f8068lh.le("ugen_render_success");
        } else {
            this.f8068lh.lh(i4, "ugen_render_error");
            cf.ouw("UGen", zihVar.ouw, zihVar.vt, this.ouw, this.yu, this.vt);
        }
        this.f8068lh.ryl();
    }
}
