package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.component.reward.emc.gbl;
import com.bytedance.sdk.openadsdk.component.reward.sup;
import com.bytedance.sdk.openadsdk.component.reward.vk;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.hxp;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.dg.ru;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    private static com.bytedance.sdk.openadsdk.emc.xq.ypw xq;
    private static com.bytedance.sdk.openadsdk.emc.bw.emc ypw;

    /* renamed from: aa, reason: collision with root package name */
    private Runnable f9259aa;
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

        public bw(int i10, com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
            this.ypw = i10;
            this.xq = emcVar;
        }

        public String toString() {
            return super.toString();
        }
    }

    public static class dg extends AbstractC0133ypw {
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

        @Override // com.bytedance.sdk.openadsdk.activity.ypw.AbstractC0133ypw
        public int emc(rie rieVar) {
            if (rieVar != null) {
                return rieVar.gy();
            }
            return 30;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.ypw.AbstractC0133ypw, android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
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

        @Override // com.bytedance.sdk.openadsdk.activity.ypw.AbstractC0133ypw
        public void emc(int i10, rie rieVar) {
            boolean z10 = this.ycc == 0;
            int i11 = this.dg;
            super.emc(i10, rieVar);
            if (!z10) {
                if (this.xq < i11) {
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

    public static class emc extends AbstractC0133ypw {
        public emc(ypw ypwVar, rie rieVar, com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar) {
            super(ypwVar, rieVar, xqVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.ypw.AbstractC0133ypw
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
    public static abstract class AbstractC0133ypw implements Handler.Callback {

        /* renamed from: aa, reason: collision with root package name */
        private boolean f9260aa;
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
        private final int sz = 1000;
        protected int uym = -1;
        private int yzg = 1000;
        private boolean lt = false;
        boolean msw = false;
        public int zz = -1;

        public AbstractC0133ypw(ypw ypwVar, rie rieVar, com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar) {
            this.emc = ypwVar;
            this.ypw = rieVar;
            this.gbl = xqVar;
            this.sup = xqVar.getContext();
            this.dg = emc(rieVar);
        }

        private void bw(int i10) {
            if (this.wpn && i10 == 4) {
                this.ycc = i10;
                emc(i10, 1000);
            }
        }

        private void dg(int i10) {
            if (this.uym > 0 && this.f9260aa && i10 == 3) {
                this.ycc = i10;
                emc(i10, 1000);
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
            int i10 = this.uym;
            if (i10 > 0) {
                this.uym = i10 - 1;
            }
            if (this.uym == 0 && this.f9260aa) {
                this.f9260aa = false;
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
            int i10 = this.rtt;
            int i11 = this.vw;
            boolean z10 = this.yz;
            int i12 = this.wo;
            int i13 = this.ra;
            if (i10 < i11 || z10) {
                return;
            }
            if (i12 >= i13) {
                this.xxg = false;
            } else {
                this.wo = i12 + 1;
                qh();
            }
        }

        public int emc() {
            return this.dg;
        }

        public abstract int emc(rie rieVar);

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 == 1 || i10 == 2) {
                emc(message);
            } else if (i10 == 3) {
                if (this.uym > 0) {
                    ru();
                    if (this.uym >= 0) {
                        emc(message.what, 1000);
                    }
                }
            } else if (i10 == 4) {
                if (this.wpn) {
                    bw();
                    if (this.wpn && !this.dr) {
                        emc(message.what, 1000);
                    }
                }
            } else if (i10 == 5 && this.xxg) {
                uym();
                if (this.xxg && !this.dr) {
                    emc(message.what, 1000);
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
                int i10 = this.cuf;
                int i11 = this.rtt;
                boolean z10 = this.db;
                int i12 = i10 + 1;
                this.cuf = i12;
                this.rtt = i11 + 1;
                if (z10 && i12 >= this.mkp) {
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

        public void emc(boolean z10) {
            this.db = z10;
            this.rtt = 0;
            if (z10) {
                int i10 = this.rie;
                int i11 = this.ylm;
                this.ul = i10 - i11;
                this.ee = i11;
                this.hxp = i10;
            }
        }

        public void xq(int i10) {
            this.uym = i10;
            if (i10 > 0) {
                this.f9260aa = true;
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
                int i10 = this.sf;
                boolean z10 = this.db;
                int i11 = i10 + 1;
                this.sf = i11;
                if (z10) {
                    this.hxp = this.rie;
                } else {
                    this.hxp = this.ul + this.ylm;
                }
                if (i11 >= this.ul) {
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
                    int i12 = this.ee;
                    this.ee = i12 - 1;
                    xqVar.emc(i12, this.dg);
                } else {
                    this.msw = false;
                    this.emc.gbl.emc(-1, this.dg);
                }
                if (this.db && this.sf >= this.sra) {
                    boolean z11 = this.cf;
                    boolean z12 = this.vk;
                    if (!z11 && !z12) {
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

        public void emc(int i10) {
            int i11 = this.ycc;
            if (i10 != -1) {
                this.zz = i10;
            }
            this.ru.removeMessages(i11);
        }

        private void emc(@NonNull Message message) {
            if (this.dg > 0) {
                int i10 = (int) (((r1 - r0) * 100.0d) / this.bw);
                com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = this.gbl;
                StringBuilder sb = new StringBuilder();
                int i11 = this.dg;
                this.dg = i11 - 1;
                sb.append(i11);
                sb.append("s");
                xqVar.setCountDownFor1InN(sb.toString(), i10);
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

        public void ypw(int i10) {
            if (this.zz != 2 || i10 == 1) {
                if (i10 != -1) {
                    this.zz = i10;
                }
                if (this.ru.hasMessages(this.ycc) || this.lt) {
                    return;
                }
                ypw ypwVar = this.emc;
                if (ypwVar == null || ypwVar.gbl() == null || this.emc.gbl().ee() == null || !this.emc.gbl().ee().ru.get()) {
                    int i11 = this.dg;
                    boolean z10 = this.cf;
                    int i12 = this.ycc;
                    if (i12 == 1 || i12 == 2) {
                        if (i11 < 0 || z10 || this.vk) {
                            return;
                        }
                        this.ru.sendEmptyMessageDelayed(i12, this.yzg);
                        return;
                    }
                    if (i12 == 3) {
                        dg(3);
                    } else if (i12 == 4) {
                        bw(4);
                    } else if (i12 == 5) {
                        emc(5, true);
                    }
                }
            }
        }

        private void emc(int i10, int i11) {
            if (this.lt) {
                return;
            }
            this.ru.removeMessages(i10);
            this.ru.sendEmptyMessageDelayed(i10, i11);
        }

        private void emc(int i10, boolean z10) {
            if (this.xxg && i10 == 5) {
                this.ycc = i10;
                if (z10) {
                    emc(i10, 1000);
                } else {
                    this.ru.sendEmptyMessage(i10);
                }
            }
        }

        public void ypw(boolean z10) {
            if (z10) {
                this.yzg = (int) (1000.0f / this.sba);
            } else {
                this.yzg = 1000;
            }
        }

        public void emc(rie rieVar, boolean z10) {
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
            this.dr = z10;
            if (this.dg <= 0 || this.cf) {
                bw(4);
            }
        }

        public void emc(int i10, rie rieVar) {
            if (rieVar != null && rieVar.pdk() != null) {
                this.sba = rieVar.pdk().emc();
                this.ypw = rieVar;
            }
            int i11 = this.dg;
            boolean z10 = this.cf;
            boolean z11 = this.vk;
            int i12 = this.ycc;
            if (z10 || z11) {
                return;
            }
            float f10 = i10;
            this.xq = f10;
            if (f10 <= i11) {
                this.ycc = 2;
                this.dg = (int) f10;
            } else if (i12 == 0) {
                this.ycc = 1;
            }
            if (!this.qh) {
                this.bw = this.dg;
                this.qh = true;
            }
            int i13 = this.ycc;
            if (i12 == i13 && this.ru.hasMessages(i13)) {
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
            this.dr = mswVar.f9258aa;
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

    public ypw(Activity activity, rie rieVar, boolean z10) {
        this.dg = rieVar;
        this.ul = z10;
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
        Runnable runnable = this.f9259aa;
        if (runnable != null) {
            runnable.run();
            this.f9259aa = null;
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
        int i10 = this.qh;
        if (i10 == 2) {
            mswVar.sz();
            return;
        }
        if (i10 == 3) {
            mswVar.sz();
            mswVar.xq();
            mswVar.xq(true);
        } else if (i10 == 4) {
            mswVar.xq(false);
            mswVar.qh();
        } else {
            if (i10 != 5) {
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

    public void emc(boolean z10) {
        this.gbl.emc(z10);
    }

    public void ypw(boolean z10) {
        this.yzg = z10;
    }

    public void emc(TTAdActivity tTAdActivity, Bundle bundle, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.emc.ypw.emc(this.dg, tTAdActivity != null ? tTAdActivity.getIntent() : null, bundle, i10);
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

    public void ypw(msw mswVar, int i10) {
        this.gbl.ypw(mswVar, i10);
    }

    public void emc(msw mswVar, bw bwVar) {
        this.gbl.emc(mswVar, null, bwVar);
    }

    public void emc(Activity activity) {
        this.gbl.ypw(activity);
    }

    public void emc(final msw mswVar, final boolean z10, final int i10, final String str, final int i11, final String str2) {
        Activity activity;
        if (!sba()) {
            this.f9259aa = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ypw.2
                @Override // java.lang.Runnable
                public void run() {
                    ypw.this.emc(mswVar, z10, i10, str, i11, str2);
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
                ypw.this.uym.emc(z10, i10, str, i11, str2);
            }
        });
        if (ycc()) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), mswVar.ycc, mswVar.d_(), z10 ? "reward_success" : "reward_fail");
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.activity.emc emcVar, boolean z10) {
        this.gbl.emc(emcVar, z10);
    }

    public void emc(msw mswVar) {
        com.bytedance.sdk.openadsdk.activity.xq xqVar = this.gbl;
        if (xqVar == null) {
            return;
        }
        xqVar.emc(mswVar);
    }

    public void emc(msw mswVar, boolean z10) {
        com.bytedance.sdk.openadsdk.activity.xq xqVar = this.gbl;
        if (xqVar == null) {
            return;
        }
        xqVar.emc(mswVar, z10);
    }

    public void emc(View view) {
        this.gbl.emc(view);
    }

    public void emc(View view, boolean z10) {
        this.gbl.emc(view, z10);
    }

    public boolean emc(msw mswVar, int i10) {
        return this.gbl.emc(mswVar, i10);
    }

    public void emc(float f10) {
        this.gbl.emc(f10);
    }

    public void emc(Map<String, Object> map, msw mswVar, float f10, float f11) {
        this.gbl.emc(map, mswVar, f10, f11);
    }

    public void emc(int i10) {
        this.gbl.emc(i10);
    }

    public void emc(msw mswVar, boolean z10, boolean z11, boolean z12, int i10) {
        this.gbl.emc(mswVar, z10, z11, z12, i10);
    }
}
