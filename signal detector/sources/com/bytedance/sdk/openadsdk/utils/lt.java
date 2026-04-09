package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.sz.dg.emc;

/* loaded from: classes.dex */
public class lt implements Handler.Callback, emc.InterfaceC0077emc {
    private final com.bytedance.sdk.openadsdk.component.reward.emc.emc bw;
    private final com.bytedance.sdk.openadsdk.core.model.rie dg;
    private boolean msw;
    private int ru;
    private int sup;
    private boolean uym;
    private boolean ycc;
    private boolean zz;
    private float emc = 1.0f;
    private int ypw = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private final Handler xq = new Handler(Looper.getMainLooper(), this);
    private int gbl = 0;

    public lt(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        this.ru = 0;
        this.sup = 0;
        this.bw = emcVar;
        this.dg = rieVar;
        if (rieVar.zc()) {
            if (rieVar.iw() >= 0) {
                this.sup = rieVar.iw();
            } else {
                this.sup = com.bytedance.sdk.openadsdk.core.aa.dg().ru(String.valueOf(rieVar.tx()));
            }
        } else if (rieVar.qxc()) {
            if (rieVar.bhr() >= 0) {
                this.sup = rieVar.bhr();
            } else {
                this.sup = com.bytedance.sdk.openadsdk.core.aa.dg().yzg(String.valueOf(rieVar.tx()));
            }
        }
        this.ru = (int) emcVar.ylm.iyl();
        com.bytedance.sdk.component.utils.ul.emc("TTAD.TopLayoutHelper", "totalTime: " + this.ru + ", skipTime=" + this.sup);
    }

    public void bw() {
        this.xq.removeMessages(1024);
        this.ycc = false;
        this.msw = true;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.bw;
        if (emcVar != null) {
            emcVar.ylm.xmt();
        }
    }

    public void dg() {
        if (!this.ycc || this.uym) {
            return;
        }
        this.xq.removeMessages(1024);
        this.uym = true;
    }

    public boolean emc() {
        return this.ycc;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws NumberFormatException {
        if (message.what == 1024) {
            int i = this.ru;
            int i3 = this.gbl;
            int i6 = i - i3;
            this.bw.ylm.emc(i3 * 1000);
            com.bytedance.sdk.component.utils.ul.emc("TTAD.TopLayoutHelper", "handleMessage: currentTime= " + this.gbl + ", mRemainTimeInSeconds=" + i6);
            if (i6 > 0) {
                Activity activity = this.bw.mxo;
                if (activity instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) activity).xq(this.gbl * 1000, this.ru);
                }
                com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = this.bw.hxp;
                boolean z6 = false;
                if (zzVar != null && zzVar.emc() != null) {
                    this.bw.hxp.emc().setTime(String.valueOf(i6), this.gbl, 0, false);
                }
                if (this.dg.zc()) {
                    com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar2 = this.bw.hxp;
                    if (zzVar2 != null) {
                        if (zzVar2.zz() && this.sup > 0) {
                            z6 = true;
                        }
                        this.zz = z6;
                    }
                    if (!this.zz || this.gbl < this.sup || this.bw.ypw.fu() == 5 || this.bw.ypw.fu() == 33) {
                        this.bw.cuf.emc(String.valueOf(i6), null);
                    } else {
                        this.bw.emc(true);
                        this.bw.cuf.emc(String.valueOf(i6), TTAdDislikeToast.getSkipText());
                        this.bw.cuf.bw(true);
                    }
                } else if (this.dg.qxc() && (this.bw.hxp.zz() || this.bw.ypw.tze())) {
                    Activity activity2 = this.bw.mxo;
                    if (activity2 instanceof TTFullScreenVideoActivity) {
                        ((TTFullScreenVideoActivity) activity2).xq(this.gbl);
                    }
                    this.bw.cuf.dg(true);
                    this.bw.cuf.emc(String.valueOf(i6), null);
                }
                this.gbl++;
                if (this.bw.ylm.xq()) {
                    com.bytedance.sdk.openadsdk.core.model.xmt xmtVarPdk = this.bw.ypw.pdk();
                    if (xmtVarPdk != null) {
                        float fEmc = xmtVarPdk.emc();
                        this.emc = fEmc;
                        if (fEmc <= 0.0f) {
                            this.emc = 1.0f;
                        }
                    }
                } else {
                    this.emc = 1.0f;
                }
                int i7 = (int) (1000.0f / this.emc);
                com.bytedance.sdk.component.utils.ul.emc("TTAD.TopLayoutHelper", "handleMessage: next msg intervalInMillis = ".concat(String.valueOf(i7)));
                this.xq.sendEmptyMessageDelayed(message.what, i7);
            }
        }
        return true;
    }

    public void xq() {
        if (this.ycc) {
            this.xq.removeMessages(1024);
            this.xq.sendEmptyMessage(1024);
            this.uym = false;
        }
    }

    public void ypw() {
        this.xq.sendEmptyMessage(1024);
        this.uym = false;
    }

    public void emc(long j6) {
        int iCeil = (int) Math.ceil(j6 / 1000.0d);
        if (this.uym && !this.msw) {
            this.gbl = iCeil;
            xq();
        } else {
            if (this.ycc || this.msw) {
                return;
            }
            this.gbl = iCeil;
            this.ycc = true;
            ypw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.emc.InterfaceC0077emc
    public void emc(int i) {
        com.bytedance.sdk.component.utils.ul.emc("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i)));
        if (i == 1) {
            xq();
            return;
        }
        if (i == 2) {
            dg();
        } else if (i == 3 || i == 4) {
            bw();
        }
    }
}
