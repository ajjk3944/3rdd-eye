package com.bytedance.sdk.openadsdk.component.reward.ypw;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.component.reward.view.msw;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sba;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vk;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class uym extends ypw {
    private com.bytedance.sdk.openadsdk.component.reward.view.ycc cf;
    private ViewGroup qh;
    private final int sz;
    private String vk;

    public uym(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        super(emcVar);
        this.vk = "fullscreen_interstitial_ad";
        this.sz = this.ypw.in();
    }

    private void dr() {
        sba sbaVar;
        List<sba> listRr = this.ypw.rr();
        if (listRr == null || listRr.size() <= 0 || (sbaVar = listRr.get(0)) == null) {
            return;
        }
        try {
            int iYpw = sbaVar.ypw();
            int iXq = sbaVar.xq();
            if (iYpw != 0 && iXq != 0) {
                this.cf.setRatio(iYpw / iXq);
                return;
            }
            int i10 = this.sz;
            if (i10 == 33) {
                this.cf.setRatio(1.0f);
            } else if (i10 == 3) {
                this.cf.setRatio(1.91f);
            } else {
                this.cf.setRatio(0.56f);
            }
        } catch (Exception e10) {
            ul.xq("TTAD.RFTI", e10.getMessage());
        }
    }

    private void emc(ImageView imageView) {
        List<sba> listRr;
        sba sbaVar;
        rie rieVar = this.ypw;
        if (rieVar == null || (listRr = rieVar.rr()) == null || listRr.size() <= 0 || (sbaVar = listRr.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ru.dg.emc(listRr.get(0)).xq(1).emc(com.bytedance.sdk.openadsdk.ru.xq.emc(this.ypw, sbaVar.emc(), imageView));
    }

    private void sb() {
        FrameLayout frameLayout = new FrameLayout(this.emc.mxo);
        this.qh = frameLayout;
        frameLayout.setId(vk.gef);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.qh.setLayoutParams(layoutParams);
        View viewGbl = this.emc.mkp.gbl();
        if (viewGbl != null) {
            layoutParams.bottomMargin = viewGbl.getHeight();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.ycc yccVar = new com.bytedance.sdk.openadsdk.component.reward.view.ycc(this.emc.mxo);
        this.cf = yccVar;
        yccVar.setId(vk.hoq);
        FrameLayout.LayoutParams layoutParams2 = this.emc.ypw.ono() == 1 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        this.cf.setLayoutParams(layoutParams2);
        this.qh.addView(this.cf);
        sf();
    }

    private void sf() {
        if (this.qh == null) {
            return;
        }
        emc((View) this.cf);
    }

    private boolean xmt() {
        rie rieVar = this.ypw;
        return rieVar != null && rieVar.yid() == 2;
    }

    private com.bytedance.sdk.openadsdk.ul.emc.emc.xq xq(rie rieVar) {
        if (rieVar.sx() == 4) {
            return new com.bytedance.sdk.openadsdk.ul.emc.emc.ypw(aa.emc(), this.vk);
        }
        return null;
    }

    private void ypw(rie rieVar) {
        if (rieVar == null || this.cf == null) {
            return;
        }
        dr();
        emc((ImageView) this.cf);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public boolean bw() {
        return xmt();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public boolean dg() {
        return xmt();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public void ycc() {
        if (com.bytedance.sdk.openadsdk.core.model.ul.ypw(this.ypw)) {
            this.ycc.ypw(8);
        }
        this.msw.xq(false);
        this.msw.dg(false);
        if (this.ypw.yid() == 2) {
            this.msw.emc(false);
            this.ycc.ycc(8);
            return;
        }
        this.msw.emc(this.ypw.lr());
        if (this.emc.fu) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
            int iIyl = (int) (emcVar.ylm.iyl() * 1000.0d);
            emcVar.msw = iIyl;
            messageObtain.arg1 = iIyl;
            this.emc.ra.sendMessage(messageObtain);
        }
    }

    public void emc(View view) {
        if (view == null || this.emc.mxo == null || this.ypw == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.xq.ypw emcVar = this.gbl;
        if (emcVar == null) {
            Activity activity = this.emc.mxo;
            rie rieVar = this.ypw;
            String str = this.vk;
            emcVar = new com.bytedance.sdk.openadsdk.core.xq.emc(activity, rieVar, str, tp.emc(str));
            emcVar.emc(xq(this.ypw));
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            emcVar.emc(map);
        }
        Activity activity2 = this.emc.mxo;
        if (activity2 != null) {
            emcVar.emc(activity2);
        }
        view.setOnTouchListener(emcVar);
        view.setOnClickListener(emcVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public void emc(FrameLayout frameLayout) {
        try {
            sb();
            ypw(this.ypw);
            frameLayout.addView(this.qh);
        } catch (Exception e10) {
            Log.e("TTAD.RFTI", "bindAd: ", e10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ypw.ypw
    public void emc(msw mswVar) {
        if (com.bytedance.sdk.openadsdk.core.model.ul.ypw(this.ypw)) {
            dg.emc(mswVar, this.ypw);
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
            emcVar.nw.emc((long) (emcVar.ylm.iyl() * 1000.0d));
        } else {
            if (!com.bytedance.sdk.openadsdk.core.model.ul.dg(this.ypw) && !com.bytedance.sdk.openadsdk.core.model.ul.uym(this.ypw)) {
                super.emc(mswVar);
                return;
            }
            dg.ypw(mswVar, this.ypw);
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.emc;
            if (emcVar2.wbn) {
                return;
            }
            emcVar2.nw.emc((long) (emcVar2.ylm.iyl() * 1000.0d));
        }
    }

    public static boolean emc(rie rieVar) {
        return !rie.bw(rieVar) && rieVar.kx() == 100.0f;
    }
}
