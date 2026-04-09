package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.component.reward.emc.gbl;
import com.bytedance.sdk.openadsdk.component.reward.sup;
import com.bytedance.sdk.openadsdk.component.reward.vk;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.hxp;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.dg.ru;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    private static com.bytedance.sdk.openadsdk.emc.xq.ypw xq;
    private static com.bytedance.sdk.openadsdk.emc.bw.emc ypw;
    private Runnable aa;
    private Bundle cf;
    private final rie dg;
    public sup emc;
    private com.bytedance.sdk.openadsdk.activity.xq gbl;
    private com.bytedance.sdk.openadsdk.emc.xq.ypw msw;
    private int qh;
    private final boolean ru;
    private final boolean sup;
    private Activity sz;
    private boolean ul;
    private com.bytedance.sdk.openadsdk.emc.bw.emc uym;
    private boolean vk;
    private final com.bytedance.sdk.openadsdk.sz.zz ycc;
    private final boolean ylm;
    private boolean yzg;
    private final boolean zz;
    private final Bundle bw = new Bundle();
    private final gbl.ypw sba = new gbl.ypw();
    private final boolean sra = com.bytedance.sdk.openadsdk.sra.emc.ru();

    public static class bw {
        public boolean bw;
        public boolean dg;
        public final Bundle emc = new Bundle();
        public final com.bytedance.sdk.openadsdk.component.reward.emc.emc xq;
        public final int ypw;

        public bw(int i, com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
            this.ypw = i;
            this.xq = emcVar;
        }

        public String toString() {
            return super.toString();
        }
    }

    public static class dg extends AbstractC0048ypw {
        private int gbl;
        private final int ru;
        private boolean sup;

        public dg(ypw ypwVar, rie rieVar, com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar) {
            super(ypwVar, rieVar, xqVar);
            if (rieVar == null) {
                this.ru = 100;
            } else if (rieVar.bv() >= 0) {
                this.ru = Math.min(100, rieVar.bv());
            } else {
                this.ru = aa.dg().db(String.valueOf(rieVar.tx())).ycc;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.ypw.AbstractC0048ypw
        public int emc(rie rieVar) {
            if (rieVar != null) {
                return rieVar.gy();
            }
            return 30;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.ypw.AbstractC0048ypw, android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (!this.sup && this.dg <= this.gbl) {
                this.sup = true;
                msw mswVarGbl = this.emc.gbl();
                if (mswVarGbl != null) {
                    mswVarGbl.rqm();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.ypw.AbstractC0048ypw
        public void emc(int i, rie rieVar) {
            boolean z6 = this.ycc == 0;
            int i3 = this.dg;
            super.emc(i, rieVar);
            if (!z6) {
                if (this.xq < i3) {
                    this.gbl = (int) ((1.0f - (this.ru / 100.0f)) * this.dg);
                    return;
                }
                return;
            }
            if (this.ycc == 1) {
                this.gbl = 3;
            } else {
                this.gbl = (int) ((1.0f - (this.ru / 100.0f)) * this.xq);
            }
            sup supVar = this.emc.emc;
            if (supVar != null) {
                supVar.emc(this.dg);
            }
        }
    }

    public static class emc extends AbstractC0048ypw {
        public emc(ypw ypwVar, rie rieVar, com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar) {
            super(ypwVar, rieVar, xqVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.ypw.AbstractC0048ypw
        public int emc(rie rieVar) {
            if (rieVar != null) {
                return rieVar.qve();
            }
            return 5;
        }
    }

    public static class xq implements Runnable {
        private final rie emc;

        public xq(rie rieVar) {
            this.emc = rieVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.emc.wh()) {
                return;
            }
            if (this.emc.zc()) {
                if (com.bytedance.sdk.openadsdk.utils.ypw.ypw()) {
                    com.bytedance.sdk.openadsdk.component.reward.aa.emc(aa.emc()).emc(this.emc.vaf());
                    return;
                } else {
                    vk.emc(aa.emc()).emc(this.emc.vaf());
                    return;
                }
            }
            if (com.bytedance.sdk.openadsdk.utils.ypw.ypw()) {
                com.bytedance.sdk.openadsdk.component.reward.uym.emc(aa.emc()).emc(this.emc.vaf());
            } else {
                com.bytedance.sdk.openadsdk.component.reward.ycc.emc(aa.emc()).emc(this.emc.vaf());
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.ypw$ypw, reason: collision with other inner class name */
    public static abstract class AbstractC0048ypw implements Handler.Callback {
        private boolean aa;
        protected int bw;
        private boolean cf;
        private int cuf;
        private boolean db;
        protected int dg;
        private boolean dr;
        private int ee;
        protected final ypw emc;
        private final com.bytedance.sdk.openadsdk.component.reward.top.xq gbl;
        private int hxp;
        private boolean iyl;
        private int mkp;
        private boolean mxo;
        private boolean qh;
        private int ra;
        private int rie;
        private int rtt;
        private boolean sb;
        private float sba;
        private int sf;
        private int sra;
        private final Context sup;
        private boolean tp;
        private int ul;
        private boolean vk;
        private int vw;
        private int wo;
        private boolean wpn;
        private int xmt;
        protected float xq;
        private boolean xxg;
        protected int ycc;
        private int ylm;
        protected rie ypw;
        private boolean yz;
        private final Handler ru = new Handler(Looper.getMainLooper(), this);
        private final int sz = TTAdConstant.STYLE_SIZE_RADIO_1_1;
        protected int uym = -1;
        private int yzg = TTAdConstant.STYLE_SIZE_RADIO_1_1;
        private boolean lt = false;
        boolean msw = false;
        public int zz = -1;

        public AbstractC0048ypw(ypw ypwVar, rie rieVar, com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar) {
            this.emc = ypwVar;
            this.ypw = rieVar;
            this.gbl = xqVar;
            this.sup = xqVar.getContext();
            this.dg = emc(rieVar);
        }

        private void bw(int i) {
            if (this.wpn && i == 4) {
                this.ycc = i;
                emc(i, TTAdConstant.STYLE_SIZE_RADIO_1_1);
            }
        }

        private void dg(int i) {
            if (this.uym > 0 && this.aa && i == 3) {
                this.ycc = i;
                emc(i, TTAdConstant.STYLE_SIZE_RADIO_1_1);
            }
        }

        private void gbl() {
            if (this.emc.yzg()) {
                this.gbl.showSkipButton();
                this.cf = true;
            } else {
                this.vk = true;
                this.gbl.showCloseButton();
            }
            this.gbl.setShowPlayableNextAd(false, this.ypw);
        }

        private void qh() {
            msw mswVarGbl;
            this.yz = true;
            this.rtt = 0;
            ypw ypwVar = this.emc;
            if (ypwVar == null || (mswVarGbl = ypwVar.gbl()) == null || mswVarGbl.xhi()) {
                return;
            }
            sup();
        }

        private void ru() {
            int i = this.uym;
            if (i > 0) {
                this.uym = i - 1;
            }
            if (this.uym == 0 && this.aa) {
                this.aa = false;
                ypw ypwVar = this.emc;
                if (ypwVar == null || ypwVar.gbl() == null) {
                    return;
                }
                msw mswVarGbl = this.emc.gbl();
                if (mswVarGbl instanceof com.bytedance.sdk.openadsdk.activity.bw) {
                    ((com.bytedance.sdk.openadsdk.activity.bw) mswVarGbl).ylm();
                }
            }
        }

        private void sup() {
            com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar;
            if (this.dr || this.cf || this.vk || (xqVar = this.gbl) == null) {
                return;
            }
            xqVar.setShowEndCardNextAd(true, this.ypw);
        }

        private void sz() {
            int i = this.rtt;
            int i3 = this.vw;
            boolean z6 = this.yz;
            int i6 = this.wo;
            int i7 = this.ra;
            if (i < i3 || z6) {
                return;
            }
            if (i6 >= i7) {
                this.xxg = false;
            } else {
                this.wo = i6 + 1;
                qh();
            }
        }

        public int emc() {
            return this.dg;
        }

        public abstract int emc(rie rieVar);

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1 || i == 2) {
                emc(message);
            } else if (i == 3) {
                if (this.uym > 0) {
                    ru();
                    if (this.uym >= 0) {
                        emc(message.what, TTAdConstant.STYLE_SIZE_RADIO_1_1);
                    }
                }
            } else if (i == 4) {
                if (this.wpn) {
                    bw();
                    if (this.wpn && !this.dr) {
                        emc(message.what, TTAdConstant.STYLE_SIZE_RADIO_1_1);
                    }
                }
            } else if (i == 5 && this.xxg) {
                uym();
                if (this.xxg && !this.dr) {
                    emc(message.what, TTAdConstant.STYLE_SIZE_RADIO_1_1);
                }
            }
            return true;
        }

        public void msw() {
            if (this.xxg) {
                sup();
                this.yz = false;
            }
        }

        public void uym() {
            if (this.sb && this.xxg && !this.dr) {
                int i = this.cuf;
                int i3 = this.rtt;
                boolean z6 = this.db;
                int i6 = i + 1;
                this.cuf = i6;
                this.rtt = i3 + 1;
                if (z6 && i6 >= this.mkp) {
                    sup();
                }
                if (this.mxo || this.iyl) {
                    sz();
                }
            }
        }

        public void xq() {
            this.ru.removeMessages(this.ycc);
        }

        public void ycc() {
            this.sb = true;
        }

        public void ypw() {
            this.wpn = false;
            this.xxg = false;
            this.msw = false;
            this.xmt = 0;
            this.zz = -1;
            this.yz = false;
            this.ra = 0;
            this.rtt = 0;
            this.cuf = 0;
            this.db = false;
            this.wo = 0;
            this.lt = false;
            com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = this.gbl;
            if (xqVar != null) {
                xqVar.setShowPlayableNextAd(false, this.ypw);
            }
        }

        public void zz() {
            if (this.xxg) {
                this.yz = true;
            }
        }

        public void emc(boolean z6) {
            this.db = z6;
            this.rtt = 0;
            if (z6) {
                int i = this.rie;
                int i3 = this.ylm;
                this.ul = i - i3;
                this.ee = i3;
                this.hxp = i;
            }
        }

        public void xq(int i) {
            this.uym = i;
            if (i > 0) {
                this.aa = true;
                if (this.dg <= 0 || this.cf) {
                    dg(3);
                }
            }
        }

        public void bw() {
            if (this.sb && this.wpn) {
                if (this.vk) {
                    this.wpn = false;
                }
                if (this.dr) {
                    return;
                }
                int i = this.sf;
                boolean z6 = this.db;
                int i3 = i + 1;
                this.sf = i3;
                if (z6) {
                    this.hxp = this.rie;
                } else {
                    this.hxp = this.ul + this.ylm;
                }
                if (i3 >= this.ul) {
                    if (!this.msw) {
                        this.xmt++;
                        this.msw = true;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("click_countdown_remaining", this.dg);
                            jSONObject.put("hint_sequence", this.xmt);
                            com.bytedance.sdk.openadsdk.dg.xq.dg(this.ypw, this.emc.gbl().d_(), jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.xq xqVar = this.emc.gbl;
                    int i6 = this.ee;
                    this.ee = i6 - 1;
                    xqVar.emc(i6, this.dg);
                } else {
                    this.msw = false;
                    this.emc.gbl.emc(-1, this.dg);
                }
                if (this.db && this.sf >= this.sra) {
                    boolean z7 = this.cf;
                    boolean z8 = this.vk;
                    if (!z7 && !z8) {
                        this.gbl.setShowPlayableNextAd(true, this.ypw);
                    }
                }
                if (this.sf < this.hxp || this.emc.gbl() == null) {
                    return;
                }
                msw mswVarGbl = this.emc.gbl();
                if (mswVarGbl instanceof com.bytedance.sdk.openadsdk.activity.bw) {
                    this.ru.removeMessages(4);
                    ((com.bytedance.sdk.openadsdk.activity.bw) mswVarGbl).ylm();
                }
            }
        }

        public void dg() {
            if (this.cf || this.vk) {
                return;
            }
            emc(-1);
            this.lt = true;
            com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = this.gbl;
            if (xqVar != null) {
                xqVar.setCountDownFor1InN("", -1);
                this.gbl.setShowEndCardNextAd(true, this.ypw);
            }
        }

        public void emc(int i) {
            int i3 = this.ycc;
            if (i != -1) {
                this.zz = i;
            }
            this.ru.removeMessages(i3);
        }

        private void emc(Message message) {
            if (this.dg > 0) {
                int i = (int) (((r1 - r0) * 100.0d) / this.bw);
                com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = this.gbl;
                StringBuilder sb = new StringBuilder();
                int i3 = this.dg;
                this.dg = i3 - 1;
                sb.append(i3);
                sb.append("s");
                xqVar.setCountDownFor1InN(sb.toString(), i);
                ru();
                bw();
                if (this.dg >= 0) {
                    emc(message.what, this.yzg);
                }
                uym();
                return;
            }
            dg(3);
            bw(4);
            emc(5, true);
            gbl();
        }

        public void ypw(int i) {
            if (this.zz != 2 || i == 1) {
                if (i != -1) {
                    this.zz = i;
                }
                if (this.ru.hasMessages(this.ycc) || this.lt) {
                    return;
                }
                ypw ypwVar = this.emc;
                if (ypwVar == null || ypwVar.gbl() == null || this.emc.gbl().ee() == null || !this.emc.gbl().ee().ru.get()) {
                    int i3 = this.dg;
                    boolean z6 = this.cf;
                    int i6 = this.ycc;
                    if (i6 == 1 || i6 == 2) {
                        if (i3 < 0 || z6 || this.vk) {
                            return;
                        }
                        this.ru.sendEmptyMessageDelayed(i6, this.yzg);
                        return;
                    }
                    if (i6 == 3) {
                        dg(3);
                    } else if (i6 == 4) {
                        bw(4);
                    } else if (i6 == 5) {
                        emc(5, true);
                    }
                }
            }
        }

        private void emc(int i, int i3) {
            if (this.lt) {
                return;
            }
            this.ru.removeMessages(i);
            this.ru.sendEmptyMessageDelayed(i, i3);
        }

        private void emc(int i, boolean z6) {
            if (this.xxg && i == 5) {
                this.ycc = i;
                if (z6) {
                    emc(i, TTAdConstant.STYLE_SIZE_RADIO_1_1);
                } else {
                    this.ru.sendEmptyMessage(i);
                }
            }
        }

        public void ypw(boolean z6) {
            if (z6) {
                this.yzg = (int) (1000.0f / this.sba);
            } else {
                this.yzg = TTAdConstant.STYLE_SIZE_RADIO_1_1;
            }
        }

        public void emc(rie rieVar, boolean z6) {
            this.ul = dr.ylm(rieVar);
            this.ylm = dr.ee(rieVar);
            this.sra = dr.db(rieVar);
            this.rie = dr.sb(rieVar);
            this.ee = this.ylm;
            this.sb = false;
            this.db = false;
            this.sf = 0;
            this.wpn = true;
            com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = this.gbl;
            if (xqVar != null) {
                xqVar.setShowPlayableNextAd(false, rieVar);
            }
            this.dr = z6;
            if (this.dg <= 0 || this.cf) {
                bw(4);
            }
        }

        public void emc(int i, rie rieVar) {
            if (rieVar != null && rieVar.pdk() != null) {
                this.sba = rieVar.pdk().emc();
                this.ypw = rieVar;
            }
            int i3 = this.dg;
            boolean z6 = this.cf;
            boolean z7 = this.vk;
            int i6 = this.ycc;
            if (z6 || z7) {
                return;
            }
            float f2 = i;
            this.xq = f2;
            if (f2 <= i3) {
                this.ycc = 2;
                this.dg = (int) f2;
            } else if (i6 == 0) {
                this.ycc = 1;
            }
            if (!this.qh) {
                this.bw = this.dg;
                this.qh = true;
            }
            int i7 = this.ycc;
            if (i6 == i7 && this.ru.hasMessages(i7)) {
                return;
            }
            this.ru.removeCallbacksAndMessages(null);
            this.ru.sendEmptyMessage(this.ycc);
        }

        public void emc(msw mswVar) {
            rie rieVar;
            hxp hxpVarEmc;
            if (mswVar == null || (rieVar = mswVar.ycc) == null || (hxpVarEmc = rieVar.emc()) == null) {
                return;
            }
            this.mkp = hxpVarEmc.xq();
            this.dr = mswVar.aa;
            this.ra = hxpVarEmc.emc();
            this.tp = mswVar.vk;
            this.vw = hxpVarEmc.ypw();
            this.iyl = ul.ycc(mswVar.ycc);
            this.mxo = ul.bw(mswVar.ycc);
            this.xxg = true;
            if ((this.dg <= 0 || this.cf) && !this.ru.hasMessages(5)) {
                emc(5, false);
            }
        }
    }

    public ypw(Activity activity, rie rieVar, boolean z6) {
        this.dg = rieVar;
        this.ul = z6;
        this.sz = activity;
        this.ycc = new com.bytedance.sdk.openadsdk.sz.zz(activity.getApplicationContext());
        boolean zWpn = rieVar.wpn();
        this.zz = zWpn;
        this.ru = zWpn && 39 == rieVar.fu();
        this.sup = zWpn && 40 == rieVar.fu();
        int iFu = rieVar.fu();
        if (iFu == 43 || iFu == 44) {
            this.gbl = new com.bytedance.sdk.openadsdk.activity.dg(this.sz, rieVar, this);
        } else {
            this.gbl = new zz(this.sz, rieVar, this);
        }
        this.ylm = com.bytedance.sdk.openadsdk.sra.emc.emc("adapt_decor_size", 0) == 1;
        this.gbl.emc();
        cuf();
    }

    private void cuf() {
        if (this.dg.zc()) {
            this.emc = new sup(new sup.emc() { // from class: com.bytedance.sdk.openadsdk.activity.ypw.1
                @Override // com.bytedance.sdk.openadsdk.component.reward.sup.emc
                public void emc() {
                    msw mswVarGbl;
                    if (ypw.this.sup().getBoolean("reward_verify", false) || ypw.this.vk() || ypw.this.sup().getBoolean("user_has_give_up_reward", false) || (mswVarGbl = ypw.this.gbl()) == null) {
                        return;
                    }
                    mswVarGbl.dg(1);
                }
            });
        }
    }

    public void aa() {
        this.vk = true;
        sup supVar = this.emc;
        if (supVar != null) {
            supVar.xq();
        }
    }

    public boolean bw() {
        if (this.dg != null && this.zz) {
            return this.ru || this.sup;
        }
        return false;
    }

    public void cf() {
        if (sba()) {
            return;
        }
        ul();
        Objects.toString(this.uym);
        Objects.toString(this.msw);
        com.bytedance.sdk.openadsdk.emc.bw.emc emcVar = this.uym;
        if (emcVar != null) {
            emcVar.emc();
        } else {
            com.bytedance.sdk.openadsdk.emc.xq.ypw ypwVar = this.msw;
            if (ypwVar != null) {
                ypwVar.emc();
            } else {
                msw mswVarGbl = gbl();
                ru.emc(this.dg, "show", mswVarGbl != null ? mswVarGbl.ra() : 0);
            }
        }
        Runnable runnable = this.aa;
        if (runnable != null) {
            runnable.run();
            this.aa = null;
        }
    }

    public boolean db() {
        return this.yzg;
    }

    public boolean dg() {
        return this.sup;
    }

    public void dr() {
        this.gbl.sba();
    }

    public boolean ee() {
        return this.gbl instanceof com.bytedance.sdk.openadsdk.activity.dg;
    }

    public msw gbl() {
        return this.gbl.gbl();
    }

    public msw hxp() {
        return this.gbl.sz();
    }

    public int lt() {
        return this.gbl.msw();
    }

    public Activity msw() {
        com.bytedance.sdk.openadsdk.activity.xq xqVar = this.gbl;
        return xqVar == null ? this.sz : xqVar.emc;
    }

    public void qh() {
        com.bytedance.sdk.openadsdk.emc.bw.emc emcVar = this.uym;
        if (emcVar != null) {
            emcVar.ypw();
            return;
        }
        com.bytedance.sdk.openadsdk.emc.xq.ypw ypwVar = this.msw;
        if (ypwVar != null) {
            ypwVar.ypw();
        } else {
            msw mswVarGbl = gbl();
            ru.emc(this.dg, "close", mswVarGbl != null ? mswVarGbl.ra() : 0);
        }
    }

    public com.bytedance.sdk.openadsdk.component.reward.top.xq rie() {
        return this.gbl.sup();
    }

    public int ru() {
        return this.gbl.ru();
    }

    public List<rie> sb() {
        return this.gbl.cf();
    }

    public boolean sba() {
        return this.dg.vw();
    }

    public void sf() {
        this.gbl.aa();
    }

    public boolean sra() {
        return this.gbl.bw();
    }

    public Bundle sup() {
        return this.bw;
    }

    public void sz() {
        com.bytedance.sdk.openadsdk.emc.bw.emc emcVar = this.uym;
        if (emcVar != null) {
            emcVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.emc.xq.ypw ypwVar = this.msw;
        if (ypwVar != null) {
            ypwVar.onAdClicked();
        }
    }

    public void ul() {
        this.dg.uym(true);
        this.gbl.vk();
    }

    public void uym() {
        Activity activity = this.sz;
        if (activity != null) {
            activity.finish();
        }
    }

    public boolean vk() {
        return this.vk;
    }

    public void xmt() {
        this.gbl.yzg();
    }

    public boolean xq() {
        return this.sra;
    }

    public boolean ycc() {
        return this.zz;
    }

    public com.bytedance.sdk.openadsdk.sz.zz ylm() {
        return this.ycc;
    }

    public boolean yzg() {
        return this.gbl.dg();
    }

    public void zz() {
        this.gbl.zz();
    }

    public void dg(TTAdActivity tTAdActivity) {
        this.qh = 5;
        this.gbl.uym();
    }

    public rie emc() {
        return this.dg;
    }

    public void xq(TTAdActivity tTAdActivity) {
        this.qh = 4;
        this.gbl.xq();
        sup supVar = this.emc;
        if (supVar != null) {
            supVar.emc();
        }
    }

    public boolean ypw() {
        return this.ylm;
    }

    public boolean emc(rie rieVar) {
        return (rieVar == null || ul.sz(rieVar) || rieVar.vcl() || rieVar.ivb() == null || rieVar.ivb().dg() <= 0) ? false : true;
    }

    public void ypw(TTAdActivity tTAdActivity) {
        this.qh = 3;
        this.gbl.ypw();
        sup supVar = this.emc;
        if (supVar != null) {
            supVar.ypw();
        }
        this.sba.emc(tTAdActivity, this.dg.ono(), this.dg.kx(), this.ylm);
    }

    public void bw(TTAdActivity tTAdActivity) {
        this.qh = 6;
        this.gbl.emc(tTAdActivity);
        this.sba.emc(tTAdActivity);
        this.sz = null;
    }

    public void emc(TTAdActivity tTAdActivity, Bundle bundle, com.bytedance.sdk.openadsdk.emc.bw.emc emcVar, com.bytedance.sdk.openadsdk.emc.xq.ypw ypwVar) {
        this.cf = bundle;
        this.qh = 1;
        this.uym = emcVar;
        this.msw = ypwVar;
        if (!this.ul && bundle != null) {
            if (emcVar == null) {
                this.uym = ypw;
                ypw = null;
            }
            if (ypwVar == null) {
                this.msw = xq;
                xq = null;
            }
        }
        this.gbl.emc(bundle);
    }

    public void ypw(msw mswVar) {
        mswVar.emc(this.sz, this.cf);
        int i = this.qh;
        if (i == 2) {
            mswVar.sz();
            return;
        }
        if (i == 3) {
            mswVar.sz();
            mswVar.xq();
            mswVar.xq(true);
        } else if (i == 4) {
            mswVar.xq(false);
            mswVar.qh();
        } else {
            if (i != 5) {
                return;
            }
            mswVar.dg();
        }
    }

    public void emc(TTAdActivity tTAdActivity) {
        this.qh = 2;
        this.gbl.ycc();
    }

    public void ypw(msw mswVar, bw bwVar) {
        this.gbl.emc(mswVar, bwVar);
    }

    public void emc(boolean z6) {
        this.gbl.emc(z6);
    }

    public void ypw(boolean z6) {
        this.yzg = z6;
    }

    public void emc(TTAdActivity tTAdActivity, Bundle bundle, int i) {
        com.bytedance.sdk.openadsdk.component.reward.emc.ypw.emc(this.dg, tTAdActivity != null ? tTAdActivity.getIntent() : null, bundle, i);
        if (this.ul) {
            return;
        }
        com.bytedance.sdk.openadsdk.emc.bw.emc emcVar = this.uym;
        if (emcVar != null) {
            ypw = emcVar;
            return;
        }
        com.bytedance.sdk.openadsdk.emc.xq.ypw ypwVar = this.msw;
        if (ypwVar != null) {
            xq = ypwVar;
        }
    }

    public void ypw(msw mswVar, int i) {
        this.gbl.ypw(mswVar, i);
    }

    public void emc(msw mswVar, bw bwVar) {
        this.gbl.emc(mswVar, null, bwVar);
    }

    public void emc(Activity activity) {
        this.gbl.ypw(activity);
    }

    public void emc(final msw mswVar, final boolean z6, final int i, final String str, final int i3, final String str2) {
        Activity activity;
        if (!sba()) {
            this.aa = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ypw.2
                @Override // java.lang.Runnable
                public void run() {
                    ypw.this.emc(mswVar, z6, i, str, i3, str2);
                }
            };
            return;
        }
        if (vk()) {
            return;
        }
        aa();
        if (this.uym == null || (activity = this.sz) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ypw.3
            @Override // java.lang.Runnable
            public void run() {
                ypw.this.uym.emc(z6, i, str, i3, str2);
            }
        });
        if (ycc()) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), mswVar.ycc, mswVar.d_(), z6 ? "reward_success" : "reward_fail");
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.activity.emc emcVar, boolean z6) {
        this.gbl.emc(emcVar, z6);
    }

    public void emc(msw mswVar) {
        com.bytedance.sdk.openadsdk.activity.xq xqVar = this.gbl;
        if (xqVar == null) {
            return;
        }
        xqVar.emc(mswVar);
    }

    public void emc(msw mswVar, boolean z6) {
        com.bytedance.sdk.openadsdk.activity.xq xqVar = this.gbl;
        if (xqVar == null) {
            return;
        }
        xqVar.emc(mswVar, z6);
    }

    public void emc(View view) {
        this.gbl.emc(view);
    }

    public void emc(View view, boolean z6) {
        this.gbl.emc(view, z6);
    }

    public boolean emc(msw mswVar, int i) {
        return this.gbl.emc(mswVar, i);
    }

    public void emc(float f2) {
        this.gbl.emc(f2);
    }

    public void emc(Map<String, Object> map, msw mswVar, float f2, float f5) {
        this.gbl.emc(map, mswVar, f2, f5);
    }

    public void emc(int i) {
        this.gbl.emc(i);
    }

    public void emc(msw mswVar, boolean z6, boolean z7, boolean z8, int i) {
        this.gbl.emc(mswVar, z6, z7, z8, i);
    }
}
