package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.cf.lh.yu;
import com.bytedance.sdk.openadsdk.core.ksc;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vm implements com.bytedance.sdk.openadsdk.core.bly.ko, com.bytedance.sdk.openadsdk.core.cf.lh.ouw, yu.ouw, ksc {
    private int bly;

    /* renamed from: cf, reason: collision with root package name */
    private boolean f8512cf;
    private final com.bytedance.sdk.openadsdk.core.le.lh fkw;

    /* renamed from: le, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.lh.ouw f8513le;

    /* renamed from: lh, reason: collision with root package name */
    private final ouw f8514lh;
    public boolean ouw;
    private bs ra;
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw vt;
    private final com.bytedance.sdk.openadsdk.core.cf.lh.vt yu;
    private int pno = 0;
    private int tlj = 1;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void fkw();

        void le();

        void lh();

        void ouw();

        void vt();

        int yu();
    }

    public vm(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, ouw ouwVar2) {
        this.vt = ouwVar;
        this.f8514lh = ouwVar2;
        this.fkw = new com.bytedance.sdk.openadsdk.core.le.lh(ouwVar.jvy) { // from class: com.bytedance.sdk.openadsdk.core.widget.vm.1
            @Override // android.view.View
            public final void onWindowFocusChanged(boolean z3) throws JSONException {
                super.onWindowFocusChanged(z3);
                vm.this.ouw(z3);
            }
        };
        com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar = new com.bytedance.sdk.openadsdk.core.cf.lh.vt(ouwVar.hun, ouwVar.vt, true);
        this.yu = vtVar;
        vtVar.ouw((com.bytedance.sdk.openadsdk.core.bly.ko) this);
        vtVar.ouw((com.bytedance.sdk.openadsdk.core.cf.lh.ouw) this);
        com.bytedance.sdk.openadsdk.core.cf.lh.lh lhVar = vtVar.ouw;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.cf.lh.yu) {
            com.bytedance.sdk.openadsdk.core.cf.lh.yu yuVar = (com.bytedance.sdk.openadsdk.core.cf.lh.yu) lhVar;
            yuVar.vt = this;
            bs bsVar = yuVar.ouw;
            this.ra = bsVar;
            if (bsVar != null) {
                bsVar.f8110pd = this;
                bsVar.ouw = ouwVar.vt.vt();
            }
        }
        Context context = ouwVar.hun;
        vpp vppVar = ouwVar.vt;
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.core.lh.ouw(context, vppVar, vppVar.vt(), uoy.vt(ouwVar.vt));
        this.f8513le = ouwVar3;
        ouwVar3.ouw(com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), ouwVar.vt.vt()));
        HashMap map = new HashMap();
        if (od.vt(ouwVar.vt)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 2);
        }
        ouwVar3.ouw(map);
    }

    private void cf() {
        this.fkw.setVisibility(8);
    }

    public final void bly() {
        this.ouw = true;
        ViewParent parent = this.fkw.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.fkw);
        }
        com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar = this.yu;
        if (vtVar != null) {
            vtVar.lh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final long fkw() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final boolean l_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final int le() {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.yu.ouw
    public final void pno() {
        if (this.bly != 1) {
            return;
        }
        this.bly = 3;
        View viewVt = this.yu.vt();
        if (viewVt != null) {
            ViewGroup viewGroup = (ViewGroup) viewVt.getParent();
            if (viewGroup != null) {
                if (viewGroup == this.fkw) {
                    return;
                } else {
                    viewGroup.removeView(viewVt);
                }
            }
            if (this.fkw != null) {
                viewVt.setVisibility(0);
                this.fkw.addView(viewVt, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ksc
    public final int q_() {
        ouw ouwVar = this.f8514lh;
        if (ouwVar != null) {
            return ouwVar.yu();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ksc
    public final void r_() {
        ouw ouwVar = this.f8514lh;
        if (ouwVar != null) {
            ouwVar.fkw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ksc
    public final void s_() {
        ouw ouwVar = this.f8514lh;
        if (ouwVar != null) {
            ouwVar.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ksc
    public final void t_() {
        this.tlj = 2;
    }

    public final boolean tlj() {
        return this.fkw.isAttachedToWindow() && this.fkw.getVisibility() == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void vt(int i4) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final long yu() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i4) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ksc
    public final void vt() throws JSONException {
        if (this.ouw || !tlj()) {
            return;
        }
        cf();
        ouw ouwVar = this.f8514lh;
        if (ouwVar != null) {
            ouwVar.vt();
        }
        ouw(false);
        bs bsVar = this.ra;
        if (bsVar != null) {
            bsVar.ouw("popupDidDismiss", (JSONObject) null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i4, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i4, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(boolean z3, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final boolean ouw(JSONObject jSONObject) {
        return false;
    }

    public final void ouw(ViewGroup viewGroup) {
        View viewVt = this.yu.vt();
        if (viewVt == null) {
            return;
        }
        viewVt.setVisibility(4);
        viewGroup.addView(viewVt, new ViewGroup.LayoutParams(-1, -1));
        this.yu.ouw();
        this.bly = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(boolean z3) throws JSONException {
        com.bytedance.sdk.openadsdk.core.cf.lh.lh lhVar = this.yu.ouw;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.cf.lh.yu) {
            ((com.bytedance.sdk.openadsdk.core.cf.lh.yu) lhVar).ouw(z3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(String str, JSONObject jSONObject) {
        ouw ouwVar;
        if (!"skipToNextAd".equals(str) || (ouwVar = this.f8514lh) == null) {
            return;
        }
        ouwVar.ouw();
    }

    public final boolean ouw(Activity activity) throws JSONException {
        if (!this.ouw && activity != null && !activity.isFinishing()) {
            if (this.bly == 3 && this.tlj == 2) {
                if (this.fkw.isAttachedToWindow() && this.fkw.getVisibility() == 0) {
                    return true;
                }
                if (!this.fkw.isAttachedToWindow()) {
                    Window window = activity.getWindow();
                    if (window == null) {
                        this.f8512cf = false;
                    } else {
                        this.f8512cf = true;
                        window.addContentView(this.fkw, new WindowManager.LayoutParams(-1, -1));
                    }
                }
                this.fkw.setVisibility(0);
                this.pno++;
                ouw ouwVar = this.f8514lh;
                if (ouwVar != null) {
                    ouwVar.lh();
                }
                ouw(true);
                bs bsVar = this.ra;
                if (bsVar != null) {
                    bsVar.ouw("popupDidShow", (JSONObject) null);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    ouw ouwVar2 = this.f8514lh;
                    if (ouwVar2 != null) {
                        jSONObject2.put("click_countdown_remaining", Math.max(ouwVar2.yu(), 0));
                    }
                    jSONObject2.put("popup_sequence", this.pno);
                    jSONObject.put("pag_json_data", jSONObject2.toString());
                } catch (JSONException e2) {
                    com.bytedance.sdk.component.utils.qbp.lh("UserIdleAskDialog", e2.getMessage());
                }
                vpp vppVar = this.vt.vt;
                com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, vppVar.vt(), "show_popup", jSONObject);
                return true;
            }
            try {
                HashMap map = new HashMap();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("webview_status", this.bly);
                jSONObject3.put("js_finish", this.tlj);
                jSONObject3.put("has_window", this.f8512cf ? 1 : 0);
                map.put("pag_json_data", jSONObject3.toString());
                vpp vppVar2 = this.vt.vt;
                com.bytedance.sdk.openadsdk.yu.lh.ouw("show_popup_fail", vppVar2, vppVar2.vt(), map);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void lh() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ksc
    public final void p_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ra() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.ouw
    public final void ouw(View view, int i4, com.bytedance.sdk.component.adexpress.lh lhVar) {
        if (i4 == 2) {
            com.bytedance.sdk.openadsdk.core.model.ko koVar = (com.bytedance.sdk.openadsdk.core.model.ko) lhVar;
            String str = koVar.ra;
            if (koVar.ryl > 0) {
                com.bytedance.sdk.openadsdk.core.uoy.ouw(true);
            }
            com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = this.f8513le;
            ouwVar.ex = str;
            ouwVar.ouw(view, koVar.ouw, koVar.vt, koVar.f8235lh, koVar.yu, koVar.tlj, koVar.f8232cf);
            this.vt.fqk.kn();
            com.bytedance.sdk.openadsdk.core.uoy.ouw(false);
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.vt.vt, 9);
        }
    }
}
