package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.ylm.emc.emc;
import org.json.JSONException;

/* loaded from: classes.dex */
public class uym extends zz implements Handler.Callback {
    int bw;
    private int db;
    int dg;
    private int ee;
    boolean emc;
    private boolean hxp;
    private int rie;
    private boolean sb;
    private int sra;
    private final Handler ul;
    protected int uym;
    int xq;
    boolean ycc;
    private boolean ylm;
    long ypw;

    public uym(emc emcVar) {
        super(emcVar);
        this.ul = new Handler(this);
        this.emc = false;
        this.ypw = 0L;
        this.xq = 0;
        this.dg = 0;
        this.bw = 0;
        this.ycc = false;
        this.ylm = false;
        this.sra = 0;
        this.hxp = false;
        this.ee = 0;
        this.db = 0;
        this.sb = false;
        this.uym = dr.zz(this.ru);
        this.dg = this.ru.un();
        int iPx = this.ru.px();
        this.bw = iPx;
        this.ee = Math.max(0, this.dg - iPx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        int i = !this.hxp ? this.bw - this.xq : this.bw + this.db;
        int i3 = com.bytedance.sdk.openadsdk.core.aa.dg().db(String.valueOf(this.sup.ycc)).ycc;
        int i6 = this.dg;
        boolean z6 = false;
        boolean z7 = i6 <= 0 || (((float) i) / ((float) i6)) * 100.0f >= ((float) i3);
        int iEmc = com.bytedance.sdk.openadsdk.core.aa.dg().emc(String.valueOf(this.sup.ycc));
        if (iEmc == 0) {
            com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.sba;
            boolean zYcc = emcVar != null ? emcVar.ycc() : false;
            if (this.cf) {
                zYcc = true;
            }
            if (z7 && zYcc) {
                z6 = true;
            }
        } else if (iEmc == 1) {
            z6 = z7;
        }
        if (z6) {
            this.sup.tp.ypw(true);
        }
    }

    private boolean sba() {
        return this.msw && dr.xq(this.sup.ypw) && !this.yzg.get();
    }

    private boolean vk() {
        if (this.sup.wbn) {
            return false;
        }
        int i = this.uym;
        return 1 == i || 2 == i;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public void bw() {
        if (this.qh) {
            super.bw();
            zz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public void dg() {
        com.bytedance.sdk.openadsdk.core.widget.ypw ypwVar;
        if (this.qh) {
            super.dg();
            if (DeviceUtils.uym() == 0) {
                this.sup.yz = true;
            }
            emc emcVar = this.sup;
            if (emcVar.yz) {
                emcVar.cuf.ypw(true);
                xq(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar2 = this.sup.cn;
            if ((ypwVar2 == null || (ypwVar = ypwVar2.sup) == null || !ypwVar.isShowing()) && gbl() && uym() > 0) {
                emc(0L);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 900 || !sba()) {
            return true;
        }
        int i = message.arg1;
        boolean z6 = false;
        if (this.hxp) {
            int i3 = this.bw;
            int i6 = this.db;
            int i7 = i3 + i6;
            int i8 = this.dg;
            if (i7 < i8) {
                this.db = i6 + 1;
                Message messageObtain = Message.obtain();
                messageObtain.what = 900;
                messageObtain.arg1 = 0;
                this.ul.sendMessageDelayed(messageObtain, 1000L);
            } else {
                this.db = i8 - i3;
            }
        } else if (i > 0) {
            if (this.sra == 0 && 2 == this.uym) {
                z6 = true;
            }
            this.sup.cuf.dg(true);
            if (!z6) {
                this.sup.cuf.emc(String.valueOf(i), null);
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 900;
            int i9 = i - 1;
            messageObtain2.arg1 = i9;
            this.ul.sendMessageDelayed(messageObtain2, 1000L);
            this.xq = i9;
            this.rie = i;
        } else {
            this.ycc = true;
            if (!dr.msw(this.ru) || (dr.ul(this.ru) && this.sba.bw())) {
                this.sup.cuf.dg(false);
                this.sup.vk.set(true);
                this.sup.cn.sz();
            } else {
                this.sup.cuf.xq();
                this.sup.cuf.bw(true);
            }
            com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.sba;
            if (emcVar == null || emcVar.bw()) {
                this.cf = true;
            }
            if (this.ee > 0) {
                this.hxp = true;
                this.db++;
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 900;
                messageObtain3.arg1 = 0;
                this.ul.sendMessageDelayed(messageObtain3, 1000L);
            }
            this.rie = 0;
        }
        aa();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public int msw() {
        return this.rie;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public boolean ru() {
        return this.ycc;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public int uym() {
        return this.xq;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public void xq() throws JSONException {
        if (this.qh) {
            this.msw = true;
            boolean zVk = vk();
            if (zVk) {
                this.sba.emc(new emc.InterfaceC0103emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.uym.2
                    @Override // com.bytedance.sdk.openadsdk.ylm.emc.emc.InterfaceC0103emc
                    public void emc(int i) {
                        if (uym.this.sb) {
                            return;
                        }
                        uym.this.sra = i;
                        uym.this.sba.emc((emc.InterfaceC0103emc) null);
                        uym.this.ypw(i);
                    }
                });
            }
            this.sba.emc();
            if (dr.msw(this.ru)) {
                this.sup.xmt.ycc();
            }
            this.ypw = System.currentTimeMillis();
            if (!zVk) {
                ypw(0);
            }
            this.sup.tp.fu();
            com.bytedance.sdk.openadsdk.component.reward.sup supVar = this.sup.yid;
            if (supVar != null) {
                supVar.emc(this.dg);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public void ycc() {
        if (this.qh && !this.vk) {
            super.ycc();
            this.ul.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public void zz() {
        if (this.qh) {
            this.ylm = true;
            this.ul.removeMessages(900);
            this.ul.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public void emc() {
        if (this.qh && !this.sz) {
            super.emc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public com.bytedance.sdk.openadsdk.sz.ycc ypw() {
        return new com.bytedance.sdk.openadsdk.sz.ycc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.uym.1
            @Override // com.bytedance.sdk.openadsdk.sz.ycc
            public void emc() {
                uym.this.aa();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(int i) {
        emc(this.bw);
        if (this.ylm) {
            return;
        }
        Handler handler = this.ul;
        handler.sendMessage(handler.obtainMessage(900, this.bw, i));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public void emc(boolean z6) {
        if (this.aa != null) {
            try {
                com.bytedance.sdk.openadsdk.ylm.emc.ypw ypwVarEmc = com.bytedance.sdk.openadsdk.ylm.emc.dg.emc().emc(this.ru, this.aa, ypw());
                this.sba = ypwVarEmc;
                ypwVarEmc.emc(this.sup.tp);
            } catch (Throwable th) {
                ul.xq("RVIVPlayableNewManager", "PreRender injection exception" + th.getMessage());
            }
            if (this.sba == null) {
                super.emc(z6);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public void emc(int i) {
        this.xq = i;
        this.rie = i;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.zz
    public void emc(long j6) {
        if (this.qh && this.msw && !this.sup.ru.get() && this.ylm) {
            this.ylm = false;
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            messageObtain.arg1 = uym();
            messageObtain.arg2 = this.sra;
            this.ul.sendMessageDelayed(messageObtain, j6);
        }
    }
}
