package com.bytedance.sdk.openadsdk.core.cf.le;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ra extends yu {
    private float bs;

    /* renamed from: cd, reason: collision with root package name */
    private float f8129cd;
    private boolean fvf;
    private com.bytedance.adsdk.ugeno.vt.lh jae;
    private com.bytedance.adsdk.ugeno.vt.lh ksc;

    /* renamed from: od, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.fkw f8130od;

    /* renamed from: pd, reason: collision with root package name */
    private float f8131pd;
    private com.bytedance.adsdk.ugeno.vt.lh tc;
    private boolean uq;

    public ra(Context context, vpp vppVar, boolean z3, ouw ouwVar, ViewGroup viewGroup) {
        super(context, vppVar, z3, ouwVar, viewGroup);
        this.uq = false;
        this.fvf = true;
        if (TextUtils.equals(this.vpp, "fullscreen_interstitial_ad")) {
            this.f8129cd = this.fkw.myk();
        } else if (TextUtils.equals(this.vpp, "rewarded_video")) {
            this.f8129cd = this.fkw.ng();
        }
    }

    private void jg() {
        cf cfVar = new cf();
        HashMap map = new HashMap();
        map.put("image_info", this.f8138le.ra);
        map.put("cache_dir", this.f8138le.tlj);
        cfVar.yu = map;
        cfVar.ouw = this.vt;
        cfVar.vt = this.yu;
        cfVar.f6844lh = this.ex;
        this.ouw.ouw("ad", cfVar);
    }

    private int ko() {
        jg();
        try {
            ryl rylVar = this.ouw;
            JSONObject jSONObject = this.ex;
            com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f8139lh;
            rylVar.ouw(jSONObject, lhVar);
            rylVar.ouw(lhVar);
            if (this.f8139lh != null) {
                if (TextUtils.equals(this.vpp, "rewarded_video")) {
                    this.tc = this.f8139lh.le("RVCountdown");
                    this.ksc = this.f8139lh.le("RVSkipView");
                } else {
                    this.tc = this.f8139lh.le("FVCountdown");
                    this.ksc = this.f8139lh.le("FVSkipView");
                }
                mwh();
            }
            if (this instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu) {
                return 0;
            }
            this.f8138le.f8125cd.vt();
            this.f8138le.f8125cd.lh();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return 139;
        } catch (Throwable unused3) {
            return 141;
        }
    }

    private void mwh() {
        com.bytedance.adsdk.ugeno.vt.lh lhVar = this.tc;
        if (lhVar != null) {
            lhVar.vt(8);
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVar2 = this.ksc;
        if (lhVar2 != null) {
            lhVar2.vt(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int ryl() {
        /*
            r5 = this;
            r5.jg()
            com.bytedance.adsdk.ugeno.core.ryl r0 = r5.ouw
            r0.ouw(r5)
            com.bytedance.adsdk.ugeno.core.ryl r0 = r5.ouw
            r0.ouw = r5
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r5.fkw
            r1 = 0
            if (r0 == 0) goto L25
            int r2 = r0.ptd
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r2) goto L21
            org.json.JSONObject r0 = r0.jvj
            if (r0 == 0) goto L21
            java.lang.String r2 = "click_trigger_type"
            int r2 = r0.optInt(r2, r1)
        L21:
            r0 = 1
            if (r2 != r0) goto L25
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 == 0) goto L31
            com.bytedance.adsdk.ugeno.core.ryl r0 = r5.ouw
            com.bytedance.sdk.openadsdk.core.cf.le.lh r2 = new com.bytedance.sdk.openadsdk.core.cf.le.lh
            r2.<init>()
            r0.vt = r2
        L31:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r5.fkw
            com.bytedance.sdk.openadsdk.core.model.pd r0 = r0.lht
            if (r0 != 0) goto L4e
            java.lang.String r2 = r5.vpp     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            boolean r2 = com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu.ouw(r2)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            if (r2 == 0) goto L40
            goto L4e
        L40:
            com.bytedance.adsdk.ugeno.core.ryl r0 = r5.ouw     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            org.json.JSONObject r2 = r5.yu     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            org.json.JSONObject r3 = r5.ex     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r4 = 0
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.ouw(r2, r3, r4)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.f8139lh = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            goto L5e
        L4e:
            org.json.JSONObject r0 = r5.ouw(r0)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            com.bytedance.adsdk.ugeno.core.ryl r2 = r5.ouw     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            org.json.JSONObject r3 = r5.yu     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            org.json.JSONObject r4 = r5.ex     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            com.bytedance.adsdk.ugeno.vt.lh r0 = r2.ouw(r3, r4, r0)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.f8139lh = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
        L5e:
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r0 = r5.f8139lh     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            if (r0 == 0) goto L99
            java.lang.String r2 = "RVCountdown"
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.le(r2)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.tc = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            if (r0 != 0) goto L76
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r0 = r5.f8139lh     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            java.lang.String r2 = "FVCountdown"
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.le(r2)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.tc = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
        L76:
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r0 = r5.f8139lh     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            java.lang.String r2 = "RVSkipView"
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.le(r2)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.ksc = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            if (r0 != 0) goto L8c
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r0 = r5.f8139lh     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            java.lang.String r2 = "FVSkipView"
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.le(r2)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.ksc = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
        L8c:
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r0 = r5.f8139lh     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            java.lang.String r2 = "ProgressBar"
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.le(r2)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.jae = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.mwh()     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
        L99:
            boolean r0 = r5 instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            if (r0 != 0) goto Lab
            com.bytedance.sdk.openadsdk.core.cf.le.ouw r0 = r5.f8138le     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            com.bytedance.adsdk.ugeno.core.vm r0 = r0.f8125cd     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r0.vt()     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            com.bytedance.sdk.openadsdk.core.cf.le.ouw r0 = r5.f8138le     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            com.bytedance.adsdk.ugeno.core.vm r0 = r0.f8125cd     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r0.lh()     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
        Lab:
            return r1
        Lac:
            r0 = 141(0x8d, float:1.98E-43)
            return r0
        Laf:
            r0 = 140(0x8c, float:1.96E-43)
            return r0
        Lb2:
            r0 = 139(0x8b, float:1.95E-43)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.ra.ryl():int");
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public com.bytedance.adsdk.ugeno.vt.lh bly() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f8139lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.le("VideoV3");
    }

    public final void cf() {
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            rylVar.ouw(this.f8139lh, "show", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final int fkw() {
        if (!this.f8138le.fvf) {
            return ryl();
        }
        qbp.ouw("UGenRender", "renderWidget: only update data");
        return ko();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public JSONObject ouw() {
        JSONObject jSONObjectOuw = this.f8138le.ouw();
        if (jSONObjectOuw != null) {
            return jSONObjectOuw.optJSONObject("xTemplate");
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final com.bytedance.adsdk.ugeno.vt.lh pno() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f8139lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.le("Playable");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu, com.bytedance.sdk.component.adexpress.dynamic.yu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTime(java.lang.CharSequence r15, int r16, int r17, boolean r18) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.ra.setTime(java.lang.CharSequence, int, int, boolean):void");
    }

    public final void tlj() {
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            rylVar.ouw(this.f8139lh, "videoFail", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final JSONObject yu() {
        return this.f8138le.ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final void ouw(com.bytedance.sdk.openadsdk.core.widget.fkw fkwVar) {
        this.f8130od = fkwVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0155 A[Catch: all -> 0x014b, TryCatch #1 {all -> 0x014b, blocks: (B:79:0x011b, B:97:0x015c, B:84:0x013e, B:86:0x0144, B:91:0x014e, B:94:0x0155), top: B:117:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu, com.bytedance.adsdk.ugeno.core.ko
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh r14, com.bytedance.adsdk.ugeno.yu.le.ouw r15) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.ra.ouw(com.bytedance.adsdk.ugeno.vt.lh, com.bytedance.adsdk.ugeno.yu.le$ouw):void");
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu, com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setSoundMute(boolean z3) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final void ouw(long j, long j8) {
        super.ouw(j, j8);
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            rylVar.ouw(this.f8139lh, "videoProgress", Long.valueOf(j), Long.valueOf(j8));
        }
    }

    public JSONObject ouw(pd pdVar) {
        if (pdVar != null) {
            return pdVar.fkw;
        }
        return null;
    }
}
