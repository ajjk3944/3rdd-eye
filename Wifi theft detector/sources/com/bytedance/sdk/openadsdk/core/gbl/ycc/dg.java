package com.bytedance.sdk.openadsdk.core.gbl.ycc;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.sup;
import com.bytedance.adsdk.ugeno.core.sz;
import com.bytedance.adsdk.ugeno.core.vk;
import com.bytedance.adsdk.ugeno.dg.ycc;
import com.bytedance.sdk.component.adexpress.ypw.qh;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.vk;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.core.zz.ul;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg implements cf, vk, com.bytedance.sdk.component.adexpress.dynamic.dg, com.bytedance.sdk.component.adexpress.ypw.dg<View> {
    private static float dr = 0.0f;
    private static float lt = 0.0f;
    private static long sb = 0;
    private static float sf = 0.0f;
    private static float xmt = 0.0f;
    protected static int ylm = 24;

    /* renamed from: aa, reason: collision with root package name */
    protected float f9283aa;
    protected rie bw;
    protected float cf;
    private bw cuf;
    private boolean db;
    protected JSONObject dg;
    private com.bytedance.sdk.component.adexpress.ypw.uym ee;
    protected sup emc;
    protected JSONObject hxp;
    protected com.bytedance.sdk.component.adexpress.ypw.msw msw;
    protected float qh;
    private ul rtt;
    protected qh ru;
    protected long sba;
    protected String sra;
    protected com.bytedance.adsdk.ugeno.ypw.xq sup;
    protected com.bytedance.adsdk.ugeno.ypw.xq sz;
    protected FrameLayout uym;
    protected float vk;
    protected com.bytedance.adsdk.ugeno.ypw.xq<View> xq;
    protected emc ycc;
    protected Context ypw;
    protected long yzg;
    protected com.bytedance.sdk.openadsdk.core.zz.cf zz;
    protected boolean ul = true;
    public SparseArray<xq.emc> rie = new SparseArray<>();
    private String mkp = "";
    private final com.bytedance.sdk.component.msw.msw iyl = new com.bytedance.sdk.component.msw.msw("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.gbl.ycc.dg.1
        @Override // java.lang.Runnable
        public void run() {
            dg dgVar = dg.this;
            dgVar.dg = dgVar.emc();
            if (dg.this.rtt != null) {
                dg dgVar2 = dg.this;
                dgVar2.mkp = dgVar2.rtt.getUgenTemplateErrorReason();
            } else {
                dg.this.mkp = "expressView is null";
            }
            com.bytedance.sdk.openadsdk.core.qh.xq().post(dg.this.mxo);
        }
    };
    private final Runnable mxo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbl.ycc.dg.2
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (dg.this.ee != null) {
                dg dgVar = dg.this;
                dgVar.ypw(dgVar.ee);
            }
        }
    };
    private boolean tp = false;
    protected AtomicBoolean gbl = new AtomicBoolean(false);

    static {
        if (aa.emc() != null) {
            ylm = aa.ypw();
        }
    }

    public dg(Context context, rie rieVar, boolean z10, emc emcVar, ViewGroup viewGroup) {
        this.ypw = context;
        this.db = z10;
        this.emc = new sup(context);
        this.bw = rieVar;
        this.ycc = emcVar;
        this.uym = new FrameLayout(context);
        if (viewGroup instanceof ul) {
            this.rtt = (ul) viewGroup;
        }
        this.sra = emcVar.dg();
        JSONObject jSONObjectYpw = ypw();
        this.hxp = jSONObjectYpw;
        this.cuf = new bw(this.ypw, this.bw, this.sra, jSONObjectYpw);
    }

    private void zz() throws JSONException {
        com.bytedance.adsdk.ugeno.ypw.xq<T> xqVarBw;
        if (this.xq == null) {
            return;
        }
        if (this.bw.jn() && (xqVarBw = this.xq.bw("tvskip")) != 0) {
            xqVarBw.xq(8);
        }
        com.bytedance.adsdk.ugeno.ypw.xq<T> xqVarBw2 = this.xq.bw("skip");
        if (xqVarBw2 != 0 && (xqVarBw2 instanceof com.bytedance.adsdk.ugeno.zz.dg.xq)) {
            if (!gbl.xq().qh(String.valueOf(this.bw.tx())) || this.bw.fu() == 5 || this.bw.fu() == 6 || this.bw.blf() == 3) {
                ((com.bytedance.adsdk.ugeno.zz.dg.xq) xqVarBw2).cf("local://tt_close_btn");
                xqVarBw2.ypw();
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.dg
    public View bw() {
        return this.uym;
    }

    public int dg() throws JSONException {
        this.emc.emc((cf) this);
        this.emc.emc((vk) this);
        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVarEmc = this.emc.emc(this.dg);
        this.xq = xqVarEmc;
        bw bwVar = this.cuf;
        if (bwVar != null && xqVarEmc != null) {
            bwVar.emc(xqVarEmc);
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg)) {
            this.ycc.cuf().ypw();
            this.ycc.cuf().xq();
        }
        this.emc.ypw(this.hxp);
        return 0;
    }

    public void emc(long j10, long j11) {
    }

    public com.bytedance.adsdk.ugeno.ypw.xq msw() {
        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar = this.xq;
        if (xqVar == null) {
            return null;
        }
        return xqVar.bw("video");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dg
    public void onvideoComplate() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dg
    public void setSoundMute(boolean z10) throws JSONException {
        com.bytedance.adsdk.ugeno.ypw.xq<T> xqVarBw;
        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar = this.xq;
        if (xqVar == null || (xqVarBw = xqVar.bw(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) == 0) {
            return;
        }
        if (z10) {
            ((com.bytedance.adsdk.ugeno.zz.dg.xq) xqVarBw).cf("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.zz.dg.xq) xqVarBw).cf("local://tt_reward_full_unmute");
        }
        xqVarBw.ypw();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dg
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        if (this.xq == null) {
            return;
        }
        boolean z11 = i10 == 1;
        emc(charSequence, z11, i11, z10);
        ypw(charSequence, z11, i11, z10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dg
    public void setTimeUpdate(int i10) {
    }

    public com.bytedance.adsdk.ugeno.ypw.xq uym() {
        return null;
    }

    public com.bytedance.adsdk.ugeno.ypw.xq ycc() {
        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar = this.xq;
        if (xqVar == null) {
            return null;
        }
        return xqVar.ycc("PlayableComponent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(com.bytedance.sdk.component.adexpress.ypw.uym uymVar) throws JSONException {
        if (this instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg) {
            this.ycc.bw().ycc();
        } else {
            this.ycc.cuf().emc();
        }
        if (this.dg == null) {
            uymVar.emc(133, "ugen template is null real reason is " + this.mkp);
            return;
        }
        if (this.hxp == null) {
            uymVar.emc(133, "ugen data is null");
            return;
        }
        int iDg = dg();
        if (this.emc.emc()) {
            List<String> listYpw = this.emc.ypw();
            if (listYpw == null) {
                uymVar.emc(138, "unknow widget");
                return;
            }
            uymVar.emc(138, "unknow widget;" + listYpw.toString());
            return;
        }
        if (iDg != 0) {
            uymVar.emc(iDg, "ugen render fail");
            return;
        }
        if (this.xq == null) {
            uymVar.emc(138, "ugen render error");
            return;
        }
        ypw ypwVar = new ypw();
        this.ru = ypwVar;
        ypwVar.emc(true);
        this.ru.emc(xq());
        setSoundMute(this.db);
        zz();
        com.bytedance.adsdk.ugeno.ypw.xq xqVarMsw = msw();
        this.sup = xqVarMsw;
        if (xqVarMsw != null && (xqVarMsw instanceof com.bytedance.sdk.openadsdk.core.gbl.ypw.ycc.ypw)) {
            ((ypw) this.ru).emc((FrameLayout) ((com.bytedance.sdk.openadsdk.core.gbl.ypw.ycc.ypw) xqVarMsw).dg());
        }
        bw bwVar = this.cuf;
        if (bwVar != null) {
            bwVar.emc();
        }
        com.bytedance.adsdk.ugeno.ypw.xq xqVarYcc = ycc();
        this.sz = xqVarYcc;
        if (xqVarYcc != null && (xqVarYcc instanceof com.bytedance.adsdk.ugeno.zz.ypw.ypw)) {
            ((ypw) this.ru).ypw((FrameLayout) xqVarYcc.gbl());
        }
        if (dr.xq(this.bw)) {
            com.bytedance.adsdk.ugeno.ypw.xq xqVarUym = uym();
            if (xqVarUym instanceof com.bytedance.sdk.openadsdk.core.gbl.ypw.xq.ypw) {
                ((ypw) this.ru).xq(((com.bytedance.sdk.openadsdk.core.gbl.ypw.xq.ypw) xqVarUym).dg());
            }
        }
        int iIyl = this.xq.iyl();
        int iMxo = this.xq.mxo();
        this.uym.removeAllViews();
        this.uym.addView(this.xq.gbl(), new FrameLayout.LayoutParams(iIyl, iMxo));
        float fDr = this.ycc.dr();
        float fXmt = this.ycc.xmt();
        float fYpw = vw.ypw(this.ypw, fDr);
        float fYpw2 = vw.ypw(this.ypw, fXmt);
        if (xq() != 7) {
            this.uym.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else if (fXmt <= 0.0f) {
            this.uym.setLayoutParams(new FrameLayout.LayoutParams((int) fYpw, -2));
        } else {
            this.uym.setLayoutParams(new FrameLayout.LayoutParams((int) fYpw, (int) fYpw2));
        }
        if (fXmt <= 0.0f || fDr <= 0.0f) {
            this.uym.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int iXq = vw.xq(this.ypw, this.uym.getMeasuredWidth());
            int iXq2 = vw.xq(this.ypw, this.uym.getMeasuredHeight());
            this.ru.emc(iXq);
            this.ru.ypw(iXq2);
        } else {
            this.ru.emc(fDr);
            this.ru.ypw(fXmt);
        }
        if (this.gbl.get()) {
            uymVar.emc(137, "ugen render timeout");
        } else {
            this.emc.emc(this.xq, "renderDidFinish", new Object[0]);
            uymVar.emc(this.uym, this.ru);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.cf
    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, ycc.emc emcVar) {
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.dg
    public int xq() {
        return this.bw.ej();
    }

    public void emc(rie rieVar, boolean z10, emc emcVar, ViewGroup viewGroup) {
        this.bw = rieVar;
        this.ycc = emcVar;
        this.sra = emcVar.dg();
        this.hxp = ypw();
        if (viewGroup instanceof ul) {
            this.rtt = (ul) viewGroup;
        }
        this.db = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.dg
    public void emc(com.bytedance.sdk.component.adexpress.ypw.uym uymVar) {
        this.ee = uymVar;
        iyl.ypw(this.iyl);
    }

    public JSONObject emc() {
        return this.ycc.xq();
    }

    public void emc(boolean z10) {
        this.gbl.set(z10);
    }

    public void emc(com.bytedance.sdk.component.adexpress.ypw.msw mswVar) {
        this.msw = mswVar;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.zz.cf cfVar) {
        this.zz = cfVar;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.widget.bw bwVar) {
        bw bwVar2 = this.cuf;
        if (bwVar2 != null) {
            bwVar2.emc(bwVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.cf
    public void emc(sz szVar, cf.ypw ypwVar, cf.emc emcVar) {
        if (szVar == null) {
            return;
        }
        if (szVar.ypw() == 1 || szVar.ypw() == 4) {
            emc(szVar);
        }
        if (szVar.ypw() == 10) {
            emc(szVar.xq());
        }
        if (ypwVar == null || szVar.dg() == null) {
            return;
        }
        ypwVar.emc(szVar.dg());
    }

    private void emc(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.ypw.xq<T> xqVarBw;
        if (this.xq == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        String strOptString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(strOptString2) || (xqVarBw = this.xq.bw(strOptString2)) == 0) {
            return;
        }
        if (TextUtils.equals(strOptString, "onShow")) {
            xqVarBw.xq(0);
        } else if (TextUtils.equals(strOptString, "onDismiss")) {
            xqVarBw.xq(8);
        }
    }

    private void emc(sz szVar) {
        int i10;
        JSONObject jSONObjectDg;
        boolean zEmc;
        int i11;
        String str;
        bw bwVar;
        bw bwVar2;
        bw bwVar3;
        if (this.msw == null) {
            return;
        }
        String strOptString = szVar.xq().optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        if ("swiperLeft".equals(strOptString) && (bwVar3 = this.cuf) != null) {
            bwVar3.ypw();
            return;
        }
        if ("swiperRight".equals(strOptString) && (bwVar2 = this.cuf) != null) {
            bwVar2.xq();
            return;
        }
        i10 = 2;
        if (!"swiperClick".equals(strOptString) || (bwVar = this.cuf) == null) {
            jSONObjectDg = null;
            zEmc = false;
            i11 = 0;
        } else {
            zEmc = bwVar.emc(szVar);
            jSONObjectDg = this.cuf.dg();
            i11 = 2;
        }
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                i10 = 7;
                break;
            case "feedback":
                i10 = 3;
                break;
            case "mute":
                i10 = 5;
                break;
            case "skip":
                i10 = 6;
                break;
            case "video":
                i10 = 4;
                break;
            case "creative":
                break;
            default:
                i10 = i11;
                break;
        }
        com.bytedance.adsdk.ugeno.ypw.xq xqVarEmc = szVar.emc();
        vk.emc emcVarEmc = new vk.emc().dg(this.qh).xq(this.cf).ypw(this.vk).emc(this.f9283aa).ypw(this.sba).emc(this.yzg).emc(this.rie).emc(szVar.ypw() != 1 || this.ul);
        if (xqVarEmc == null) {
            str = "";
        } else {
            str = xqVarEmc.mkp() + "_" + xqVarEmc.rtt();
        }
        this.msw.emc(szVar.emc().gbl(), i10, emcVarEmc.emc(str).ypw(zEmc).ypw(jSONObjectDg).emc());
    }

    public JSONObject ypw() {
        return this.ycc.lt();
    }

    private void ypw(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.ypw.xq<T> xqVarBw;
        View viewGbl;
        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar = this.xq;
        if (xqVar == null || (xqVarBw = xqVar.bw("skip")) == 0 || (viewGbl = xqVarBw.gbl()) == null) {
            return;
        }
        int i11 = 0;
        if (!z10 && !z11) {
            i11 = 8;
        }
        viewGbl.setVisibility(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    @Override // com.bytedance.adsdk.ugeno.core.vk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(com.bytedance.adsdk.ugeno.ypw.xq r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.gbl.ycc.dg.emc(com.bytedance.adsdk.ugeno.ypw.xq, android.view.MotionEvent):void");
    }

    private void emc(CharSequence charSequence, boolean z10, int i10, boolean z11) throws NumberFormatException {
        com.bytedance.adsdk.ugeno.ypw.xq<T> xqVarBw;
        int i11;
        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar = this.xq;
        if (xqVar == null || (xqVarBw = xqVar.bw("countdown")) == 0) {
            return;
        }
        View viewGbl = xqVarBw.gbl();
        if (viewGbl instanceof TextView) {
            try {
                i11 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                com.bytedance.sdk.component.utils.ul.xq("UGenRender", "parse duration exception", charSequence);
                i11 = 0;
            }
            if (!z11 && i11 > 0 && !this.tp) {
                viewGbl.setVisibility(0);
                if (!z10 && this.ycc.emc() && com.bytedance.sdk.component.adexpress.dg.ycc.ypw(this.ycc.dg())) {
                    ((TextView) viewGbl).setText(String.format(com.bytedance.sdk.component.utils.rie.emc(com.bytedance.sdk.component.adexpress.dg.emc(), "tt_reward_full_skip"), Integer.valueOf(i10)));
                    return;
                }
                if (!"open_ad".equals(this.ycc.dg()) && this.ycc.emc()) {
                    this.tp = true;
                    viewGbl.setVisibility(8);
                    return;
                } else {
                    ((TextView) viewGbl).setText(((Object) charSequence) + "s");
                    return;
                }
            }
            viewGbl.setVisibility(8);
        }
    }
}
