package com.bytedance.sdk.openadsdk.component.reward.ypw;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bykv.vk.openvk.emc.emc.emc.xq.c;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.component.reward.emc.cf;
import com.bytedance.sdk.openadsdk.component.reward.emc.msw;
import com.bytedance.sdk.openadsdk.component.reward.emc.sup;
import com.bytedance.sdk.openadsdk.component.reward.emc.vk;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.gbl;
import com.bytedance.sdk.openadsdk.component.reward.view.zz;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sba;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.qh;
import com.bytedance.sdk.openadsdk.utils.vw;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ypw extends emc {
    protected com.bytedance.sdk.openadsdk.core.xq.bw gbl;
    public com.bytedance.sdk.openadsdk.core.widget.ypw sup;
    private com.bytedance.sdk.openadsdk.sz.ycc sz;

    public ypw(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        super(emcVar);
    }

    private void dg(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        sup supVar = emcVar.cuf;
        if (supVar != null) {
            supVar.dg();
        }
    }

    private void xq(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        gbl gblVar = emcVar.mkp;
        if (gblVar == null || gblVar.ru() == null) {
            return;
        }
        emcVar.mkp.ru().performClick();
    }

    public void aa() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        if (emcVar == null) {
            return;
        }
        try {
            emcVar.wpn = false;
            boolean z6 = emcVar.yz;
            if (!emcVar.ru.get()) {
                this.emc.ylm.cf();
            }
            qh();
            this.emc.xmt.vk();
            this.emc.rie.msw();
            this.emc.yzg.set(true);
            if (this.emc.zz.get()) {
                this.emc.sba.set(true);
            }
            qh qhVar = this.emc.nw;
            if (qhVar != null) {
                qhVar.ypw();
            }
            this.emc.bw();
        } catch (Throwable unused) {
        }
    }

    public abstract boolean bw();

    public void cf() {
        if (this.emc.pe != null || ((!dr.ypw(this.ypw) && !dr.xq(this.ypw)) || (dr.msw(this.ypw) && this.emc.xmt.dr() && !this.emc.xmt.cuf()))) {
            vk();
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        if (emcVar == null) {
            return;
        }
        qh qhVar = emcVar.nw;
        if (qhVar != null) {
            qhVar.emc();
        }
        this.emc.dg();
    }

    public boolean db() {
        return true;
    }

    public abstract boolean dg();

    public final void ee() {
        if (this.emc.mxo.isFinishing()) {
            return;
        }
        this.emc.xmt.ru();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        String str = emcVar.dg ? "reward_endcard" : "fullscreen_endcard";
        emcVar.xmt.emc(this.sz, str, emcVar.tp);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.emc;
        if (emcVar2.bv) {
            emcVar2.rie.emc(emcVar2.yz);
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = this.emc;
        emcVar3.xmt.emc(str, emcVar3.tp);
        this.emc.xmt.bw();
    }

    public abstract void emc(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.emc
    public void emc(com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar, sf sfVar) {
        super.emc(ypwVar, sfVar);
        if (this.emc.ypw.ycc()) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
            if (emcVar.fu) {
                emcVar.xmt.emc(false);
            }
        }
    }

    public void gbl() {
    }

    public void hxp() {
        xq();
        if (!this.emc.ypw.ak() && db()) {
            ee();
        }
        if (db()) {
            this.emc.rtt.ypw();
        }
        if (ul.dg(this.emc.ypw) || ul.uym(this.emc.ypw)) {
            this.ru.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        emcVar.mkp.emc(emcVar.wad == 100.0f);
        sra();
        ycc();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View msw() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ypw.ypw.msw():android.view.View");
    }

    public void qh() {
        sf sfVar = this.ru;
        if (sfVar != null) {
            sfVar.removeMessages(300);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void rie() {
        /*
            r4 = this;
            boolean r0 = r4.bw()
            if (r0 != 0) goto L12
            boolean r0 = r4 instanceof com.bytedance.sdk.openadsdk.component.reward.ypw.uym
            if (r0 == 0) goto L12
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r4.emc
            com.bytedance.sdk.openadsdk.component.reward.emc.ru r0 = r0.db
            r0.ypw()
            return
        L12:
            com.bytedance.sdk.openadsdk.core.sz.dg.ypw r0 = r4.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r4.bw
            long r1 = r1.qh()
            r3 = 0
            boolean r0 = r0.emc(r1, r3)
            if (r0 != 0) goto L4b
            com.bytedance.sdk.component.utils.sf r0 = r4.ru
            r1 = 300(0x12c, float:4.2E-43)
            r0.removeMessages(r1)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r4.emc
            boolean r1 = r0.wbn
            if (r1 == 0) goto L3a
            com.bytedance.sdk.openadsdk.activity.msw r0 = r0.pe
            boolean r1 = r0 instanceof com.bytedance.sdk.openadsdk.activity.emc
            if (r1 == 0) goto L3a
            com.bytedance.sdk.openadsdk.activity.emc r0 = (com.bytedance.sdk.openadsdk.activity.emc) r0
            r0.hxp()
            goto L4b
        L3a:
            int r0 = com.bytedance.sdk.openadsdk.dg.ypw.C0089ypw.emc
            r4.emc(r0)
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r0 = r4.bw
            boolean r1 = r0.mkp()
            r1 = r1 ^ 1
            r2 = 4
            r0.emc(r1, r2)
        L4b:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r4.emc
            if (r0 == 0) goto L6a
            com.bytedance.sdk.openadsdk.core.model.rie r1 = r0.ypw
            if (r1 == 0) goto L6a
            com.bytedance.sdk.openadsdk.utils.qh r0 = r0.nw
            if (r0 == 0) goto L6a
            boolean r0 = r1.tze()
            if (r0 == 0) goto L6a
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r4.emc
            com.bytedance.sdk.openadsdk.utils.qh r1 = r0.nw
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r0 = r0.ylm
            long r2 = r0.db()
            r1.emc(r2)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ypw.ypw.rie():void");
    }

    public void ru() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        emcVar.ee.emc(emcVar.dg);
        this.emc.mkp.ypw();
        this.emc.rtt.emc();
        if (!this.emc.ypw.ak()) {
            this.emc.xmt.emc();
            this.emc.lt.emc();
        }
        this.emc.rie.uym();
        this.emc.cuf.emc();
        if (dr.ycc(this.emc.ypw)) {
            this.emc.mkp.dg();
            vw.emc((View) this.emc.xmt.msw(), 4);
        }
        if (ul.dg(this.emc.ypw) || ul.ypw(this.emc.ypw) || ul.uym(this.emc.ypw)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.emc;
        emcVar2.mkp.emc(vw.ypw(emcVar2.vw, emcVar2.but), vw.ypw(this.emc.vw, r2.wd));
        this.emc.sra.emc();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = this.emc;
        if (emcVar3.xhi) {
            emcVar3.mkp.emc(0);
        }
    }

    public void sba() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        if (emcVar == null) {
            return;
        }
        gbl gblVar = emcVar.mkp;
        if (gblVar != null) {
            gblVar.vk();
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.emc;
        boolean z6 = emcVar2.yz;
        emcVar2.dr.emc();
        DeviceUtils.uym();
        this.emc.xmt.cf();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = this.emc;
        if (emcVar3.yz) {
            emcVar3.mxo.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ypw.ypw.1
                @Override // java.lang.Runnable
                public void run() {
                    if (ypw.this.emc.dr.emc() > 0) {
                        ypw.this.emc.dr.emc(false);
                    }
                }
            });
        }
    }

    public void sra() {
        this.gbl = this.emc.db.xq();
    }

    public void sup() {
        com.bytedance.sdk.openadsdk.core.widget.ypw ypwVar = this.sup;
        if (ypwVar == null || !ypwVar.isShowing()) {
            return;
        }
        this.sup.dismiss();
    }

    public void sz() {
        if (this.emc.uym()) {
            this.emc.cuf.bw();
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
            if (emcVar.wbn && (emcVar.pe instanceof com.bytedance.sdk.openadsdk.activity.emc)) {
                return;
            }
            emcVar.mkp.ycc(0);
        }
    }

    public void ul() {
        if (!this.emc.rie.gbl() && aa.dg().ylm(String.valueOf(this.emc.ycc)) == 1) {
            int iEmc = emc(this.emc);
            if (ypw(this.emc)) {
                xq(this.emc);
            } else if (emc(this.emc, iEmc)) {
                dg(this.emc);
            }
        }
    }

    public RFEndCardBackUpLayout uym() {
        return new RFEndCardBackUpLayout(this.emc.vw);
    }

    public void vk() {
        int i;
        if (this.emc.zz.get() && this.emc.sba.getAndSet(false) && ((i = this.emc.uym) >= 0 || i == -1)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 700;
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
            messageObtain.arg1 = emcVar.uym;
            emcVar.ra.sendMessage(messageObtain);
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.emc;
        if (emcVar2.msw <= 0 || !emcVar2.yzg.getAndSet(false)) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 900;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = this.emc;
        messageObtain2.arg1 = emcVar3.msw;
        emcVar3.ra.sendMessage(messageObtain2);
    }

    public abstract void ycc();

    public void ylm() {
        this.emc.cuf.xq();
        this.emc.cuf.bw(true);
    }

    public void ypw(boolean z6) {
        try {
            zz zzVar = this.emc.hxp;
            if (zzVar != null && !z6) {
                zzVar.ycc();
            }
            gbl gblVar = this.emc.mkp;
            if (gblVar != null) {
                gblVar.qh();
            }
            this.emc.ylm.cuf();
            if (!dg()) {
                this.emc.zz.get();
            }
            vk vkVar = this.emc.xmt;
            if (vkVar != null) {
                vkVar.gbl();
            }
            msw mswVar = this.emc.rie;
            if (mswVar != null) {
                mswVar.xq(msw.emc);
            }
            gbl gblVar2 = this.emc.mkp;
            if (gblVar2 != null) {
                gblVar2.sup();
            }
            com.bytedance.sdk.openadsdk.component.reward.emc.bw bwVar = this.emc.rtt;
            if (bwVar != null) {
                bwVar.xq();
            }
            qh qhVar = this.emc.nw;
            if (qhVar != null) {
                qhVar.xq();
            }
        } catch (Throwable unused) {
        }
    }

    public void yzg() {
        ypw(false);
    }

    public View zz() {
        com.bytedance.sdk.openadsdk.core.ycc.uym uymVar;
        if (this.ypw.pxj() != 5) {
            uymVar = new com.bytedance.sdk.openadsdk.core.ycc.uym(this.emc.mxo);
            uymVar.setId(com.bytedance.sdk.openadsdk.utils.vk.mjd);
        } else {
            uymVar = null;
        }
        Objects.toString(uymVar);
        return uymVar;
    }

    public void emc(com.bytedance.sdk.openadsdk.component.reward.view.msw mswVar) {
        emc(mswVar, this.emc);
    }

    public void emc(boolean z6, boolean z7, boolean z8, int i) {
        this.emc.rtt.emc(z6, z7, z8, this, i);
    }

    private int emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        if (dr.xq(emcVar.ypw)) {
            return emcVar.ypw.px();
        }
        if (emcVar.dg) {
            return emcVar.ypw.iw();
        }
        return emcVar.ypw.bhr();
    }

    private boolean emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, int i) {
        if (i == -1) {
            return false;
        }
        boolean z6 = !emcVar.zz.get() || dr.xq(emcVar.ypw);
        cf cfVar = emcVar.ylm;
        boolean z7 = cfVar != null && cfVar.sz() >= ((long) i) * 1000;
        msw mswVar = emcVar.rie;
        return z6 && (z7 || (mswVar != null && mswVar.dg()));
    }

    private boolean ypw(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        gbl gblVar = emcVar.mkp;
        return gblVar != null && gblVar.zz();
    }

    public void emc(int i) {
        this.bw.yzg();
        emc(false, true, false, i);
        if (this.emc.dg) {
            this.zz.ypw(10000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ypw.ypw.emc(android.os.Message):void");
    }

    private void emc(long j6, long j7) {
        long j8 = j7 - j6;
        Activity activity = this.emc.mxo;
        if (activity instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) activity).xq(j8, j7);
        }
    }

    public static void emc(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        final com.bytedance.sdk.openadsdk.core.ycc.dg dgVar;
        Context context = frameLayout.getContext();
        if (emcVar.fu) {
            com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
            xqVar.setId(com.bytedance.sdk.openadsdk.utils.vk.sup);
            frameLayout.addView(xqVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutEmc = emc(context);
            String strEmc = "";
            if (rie.bw(emcVar.ypw)) {
                c cVarIat = emcVar.ypw.iat();
                if (cVarIat != null) {
                    strEmc = cVarIat.f6585f;
                }
            } else {
                List<sba> listRr = emcVar.ypw.rr();
                if (listRr != null && !listRr.isEmpty()) {
                    strEmc = listRr.get(0).emc();
                }
            }
            if (TextUtils.isEmpty(strEmc)) {
                dgVar = null;
            } else {
                dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
                int i = com.bytedance.sdk.openadsdk.utils.vk.un;
                dgVar.setId(i);
                dgVar.setTag(i, strEmc);
                dgVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutEmc.addView(dgVar);
            }
            xqVar.addView(frameLayoutEmc);
            xqVar.addView(new com.bytedance.sdk.openadsdk.core.widget.gbl(context), new FrameLayout.LayoutParams(-1, -1));
            View dgVar2 = new com.bytedance.sdk.openadsdk.component.reward.view.dg(context);
            dgVar2.setId(com.bytedance.sdk.openadsdk.utils.vk.qh);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(dgVar2, layoutParams);
            dgVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ypw.ypw.2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i3, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = emcVar.iyl.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = emcVar.iyl.findViewById(com.bytedance.sdk.openadsdk.utils.vk.kda);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = emcVar.iyl.findViewById(com.bytedance.sdk.openadsdk.utils.vk.gef);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.ycc.dg dgVar3 = dgVar;
                    if (dgVar3 != null) {
                        ViewGroup.LayoutParams layoutParams5 = dgVar3.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            dgVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
            bwVar.setId(com.bytedance.sdk.openadsdk.utils.vk.cf);
            bwVar.setOrientation(1);
            bwVar.setVisibility(8);
            frameLayout.addView(bwVar, new FrameLayout.LayoutParams(-1, -1));
        }
        if (emcVar.wo) {
            View yccVar = new com.bytedance.sdk.component.zz.ycc(context, true, ycc.xq.ENDCARD);
            yccVar.setId(com.bytedance.sdk.openadsdk.utils.vk.vk);
            yccVar.setLayerType(2, null);
            yccVar.setVisibility(4);
            boolean zYcc = ul.ycc(emcVar.ypw);
            boolean zSup = ul.sup(emcVar.ypw);
            if (!emcVar.ipv && (zYcc || zSup)) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = vw.ypw(emcVar.vw, 58.0f);
                frameLayout.addView(yccVar, layoutParams2);
            } else {
                frameLayout.addView(yccVar, new FrameLayout.LayoutParams(-1, -1));
            }
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(com.bytedance.sdk.openadsdk.utils.vk.aa);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (dr.ypw(emcVar.ypw)) {
                View xqVar2 = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
                xqVar2.setId(com.bytedance.sdk.openadsdk.utils.vk.lce);
                xqVar2.setVisibility(4);
                frameLayout.addView(xqVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public static FrameLayout emc(Context context) {
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        xqVar.setId(com.bytedance.sdk.openadsdk.utils.vk.sz);
        xqVar.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        xqVar.setLayoutParams(layoutParams);
        return xqVar;
    }
}
