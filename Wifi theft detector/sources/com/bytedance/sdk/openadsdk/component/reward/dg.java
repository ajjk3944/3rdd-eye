package com.bytedance.sdk.openadsdk.component.reward;

import android.graphics.SurfaceTexture;
import android.os.CountDownTimer;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sz.dg.emc;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.cf;
import org.json.JSONException;
import s2.b;
import s2.c;
import w2.a;

/* loaded from: classes.dex */
public class dg implements b {
    private final emc emc;
    private emc.InterfaceC0162emc msw;
    private long uym;
    private final a xq;
    private final rie ypw;
    private boolean dg = true;
    private long bw = 0;
    private boolean ycc = false;

    public static class emc implements q2.a {
        private int bw = 0;
        private long dg;
        private final long emc;
        private long msw;
        private b.InterfaceC0477b uym;
        private final com.bytedance.sdk.openadsdk.dg.uym xq;
        private CountDownTimer ycc;
        private final a ypw;
        private long zz;

        public emc(long j10, a aVar, com.bytedance.sdk.openadsdk.dg.uym uymVar) {
            this.emc = j10;
            this.ypw = aVar;
            this.xq = uymVar;
        }

        public long aa() {
            return this.msw;
        }

        @Override // q2.a
        public int bw() {
            return 0;
        }

        public int cf() {
            return 0;
        }

        @Override // q2.a
        public int dg() {
            return 0;
        }

        @Override // q2.a
        public boolean emc() {
            return false;
        }

        public void gbl() {
            if (this.bw == 1) {
                return;
            }
            this.bw = 1;
            final long jVk = vk();
            if (this.dg >= jVk) {
                this.dg = 0L;
            }
            final long j10 = jVk - this.dg;
            CountDownTimer countDownTimer = new CountDownTimer(j10, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.dg.emc.1
                @Override // android.os.CountDownTimer
                public void onFinish() throws JSONException {
                    if (emc.this.uym != null) {
                        b.InterfaceC0477b interfaceC0477b = emc.this.uym;
                        long j11 = jVk;
                        interfaceC0477b.emc(j11, j11);
                    }
                    emc.this.bw = 4;
                    emc.this.msw = jVk;
                    emc.this.dg = jVk;
                    if (emc.this.uym != null) {
                        emc.this.uym.emc(emc.this.aa(), 100);
                    }
                    cf.emc emcVar = new cf.emc();
                    emcVar.ypw(jVk);
                    emcVar.dg(jVk);
                    emcVar.xq(emc.this.qh());
                    emcVar.dg(emc.this.cf());
                    emcVar.emc(emc.this.zz());
                    com.bytedance.sdk.openadsdk.dg.bw.emc.emc.ypw(emc.this.ypw, emcVar, emc.this.xq);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j11) {
                    long j12 = (j10 - j11) + emc.this.dg;
                    emc.this.msw = j12;
                    if (emc.this.uym != null) {
                        emc.this.uym.emc(j12, jVk);
                    }
                }
            };
            this.ycc = countDownTimer;
            countDownTimer.start();
        }

        @Override // q2.a
        public boolean msw() {
            return this.bw == 0;
        }

        public long qh() {
            return 0L;
        }

        public void ru() {
            this.msw = 0L;
            gbl();
        }

        public void sup() {
            this.bw = 2;
            this.dg = this.msw;
            CountDownTimer countDownTimer = this.ycc;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.ycc = null;
            }
        }

        public void sz() {
            this.bw = 0;
            CountDownTimer countDownTimer = this.ycc;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.ycc = null;
            }
            if (this.uym != null) {
                this.uym = null;
            }
        }

        @Override // q2.a
        public boolean uym() {
            return this.bw == 2;
        }

        public long vk() {
            return this.emc;
        }

        @Override // q2.a
        public boolean xq() {
            return false;
        }

        public long zz() {
            return this.zz;
        }

        @Override // q2.a
        public boolean ycc() {
            return this.bw == 1;
        }

        @Override // q2.a
        public boolean ypw() {
            return this.bw == 4;
        }

        public void ypw(long j10) {
            this.dg = j10;
        }

        public void emc(long j10) {
            this.zz = j10;
        }

        public void emc(b.InterfaceC0477b interfaceC0477b) {
            this.uym = interfaceC0477b;
        }
    }

    public dg(rie rieVar, com.bytedance.sdk.openadsdk.dg.uym uymVar) {
        a aVar = new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.dg.1
        };
        this.xq = aVar;
        this.ypw = rieVar;
        com.bykv.vk.openvk.emc.emc.emc.xq.b bVarIat = rieVar.iat();
        long j10 = 10;
        long jE = bVarIat != null ? (long) bVarIat.E() : 10L;
        if (jE <= 0) {
            bVarIat.j(10.0d);
        } else {
            j10 = jE;
        }
        this.emc = new emc(j10 * 1000, aVar, uymVar);
    }

    public a aa() {
        return this.xq;
    }

    @Override // s2.b
    public void bw() {
        dg();
    }

    @Override // s2.b
    public boolean cf() {
        return false;
    }

    @Override // s2.b
    public void dg() {
        this.emc.sz();
    }

    @Override // s2.b
    public void emc(SurfaceTexture surfaceTexture) {
    }

    @Override // s2.b
    public q2.a gbl() {
        return this.emc;
    }

    @Override // s2.b
    public int msw() {
        return 0;
    }

    @Override // s2.b
    public boolean qh() {
        return false;
    }

    @Override // s2.b
    public int ru() {
        return y2.a.a(this.emc.msw, this.emc.emc);
    }

    @Override // s2.b
    public c sup() {
        return null;
    }

    @Override // s2.b
    public boolean sz() {
        return this.emc.ypw();
    }

    @Override // s2.b
    public long uym() {
        return 0L;
    }

    public long vk() {
        return this.uym;
    }

    @Override // s2.b
    public void xq() throws JSONException {
        this.emc.gbl();
        cf.emc emcVar = new cf.emc();
        emcVar.ypw(ycc());
        emcVar.dg(zz());
        emcVar.xq(uym());
        com.bytedance.sdk.openadsdk.dg.bw.emc.emc.ypw(this.xq, emcVar);
        emc.InterfaceC0162emc interfaceC0162emc = this.msw;
        if (interfaceC0162emc != null) {
            interfaceC0162emc.emc(1);
        }
    }

    @Override // s2.b
    public long ycc() {
        return this.emc.aa();
    }

    @Override // s2.b
    public void ypw() throws JSONException {
        this.emc.sup();
        cf.emc emcVar = new cf.emc();
        emcVar.ypw(ycc());
        emcVar.dg(zz());
        emcVar.xq(uym());
        emcVar.emc(vk());
        com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(this.xq, emcVar);
        emc.InterfaceC0162emc interfaceC0162emc = this.msw;
        if (interfaceC0162emc != null) {
            interfaceC0162emc.emc(2);
        }
    }

    @Override // s2.b
    public long zz() {
        return this.emc.vk();
    }

    @Override // s2.b
    public boolean emc(float f10) {
        return false;
    }

    @Override // s2.b
    public void emc(long j10) {
        this.uym = j10;
        emc emcVar = this.emc;
        if (emcVar != null) {
            emcVar.emc(j10);
        }
    }

    public void emc(boolean z10, int i10) {
        dg();
    }

    @Override // s2.b
    public boolean emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar) throws JSONException {
        this.ycc = xqVar.gbl();
        if (xqVar.ru() > 0) {
            this.emc.ypw(xqVar.ru());
        }
        xqVar.ypw(com.bytedance.sdk.openadsdk.sra.emc.emc("player_force_raw_url", 0) == 1);
        com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(this.ypw, this.xq, xqVar);
        this.emc.gbl();
        emc.InterfaceC0162emc interfaceC0162emc = this.msw;
        if (interfaceC0162emc != null) {
            interfaceC0162emc.emc(1);
        }
        return true;
    }

    @Override // s2.b
    public void emc(boolean z10, String str) {
        this.ycc = z10;
    }

    @Override // s2.b
    public void emc(b.InterfaceC0477b interfaceC0477b) {
        this.emc.emc(interfaceC0477b);
    }

    public void emc(emc.InterfaceC0162emc interfaceC0162emc) {
        this.msw = interfaceC0162emc;
    }

    @Override // s2.b
    public void emc() {
        this.emc.ru();
    }
}
