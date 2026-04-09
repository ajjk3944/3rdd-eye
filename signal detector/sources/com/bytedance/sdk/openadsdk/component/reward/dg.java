package com.bytedance.sdk.openadsdk.component.reward;

import J1.b;
import L1.c;
import L1.f;
import L1.g;
import P1.a;
import android.graphics.SurfaceTexture;
import android.os.CountDownTimer;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sz.dg.emc;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.cf;
import org.json.JSONException;

/* loaded from: classes.dex */
public class dg implements f {
    private final emc emc;
    private emc.InterfaceC0077emc msw;
    private long uym;
    private final a xq;
    private final rie ypw;
    private boolean dg = true;
    private long bw = 0;
    private boolean ycc = false;

    public static class emc implements b {
        private int bw = 0;
        private long dg;
        private final long emc;
        private long msw;
        private c uym;
        private final com.bytedance.sdk.openadsdk.dg.uym xq;
        private CountDownTimer ycc;
        private final a ypw;
        private long zz;

        public emc(long j6, a aVar, com.bytedance.sdk.openadsdk.dg.uym uymVar) {
            this.emc = j6;
            this.ypw = aVar;
            this.xq = uymVar;
        }

        public long aa() {
            return this.msw;
        }

        @Override // J1.b
        public int bw() {
            return 0;
        }

        public int cf() {
            return 0;
        }

        @Override // J1.b
        public int dg() {
            return 0;
        }

        @Override // J1.b
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
            final long j6 = jVk - this.dg;
            CountDownTimer countDownTimer = new CountDownTimer(j6, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.dg.emc.1
                @Override // android.os.CountDownTimer
                public void onFinish() throws JSONException {
                    if (emc.this.uym != null) {
                        c cVar = emc.this.uym;
                        long j7 = jVk;
                        cVar.emc(j7, j7);
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
                public void onTick(long j7) {
                    long j8 = (j6 - j7) + emc.this.dg;
                    emc.this.msw = j8;
                    if (emc.this.uym != null) {
                        emc.this.uym.emc(j8, jVk);
                    }
                }
            };
            this.ycc = countDownTimer;
            countDownTimer.start();
        }

        @Override // J1.b
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

        @Override // J1.b
        public boolean uym() {
            return this.bw == 2;
        }

        public long vk() {
            return this.emc;
        }

        @Override // J1.b
        public boolean xq() {
            return false;
        }

        public long zz() {
            return this.zz;
        }

        @Override // J1.b
        public boolean ycc() {
            return this.bw == 1;
        }

        @Override // J1.b
        public boolean ypw() {
            return this.bw == 4;
        }

        public void ypw(long j6) {
            this.dg = j6;
        }

        public void emc(long j6) {
            this.zz = j6;
        }

        public void emc(c cVar) {
            this.uym = cVar;
        }
    }

    public dg(rie rieVar, com.bytedance.sdk.openadsdk.dg.uym uymVar) {
        a aVar = new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.dg.1
        };
        this.xq = aVar;
        this.ypw = rieVar;
        com.bykv.vk.openvk.emc.emc.emc.xq.c cVarIat = rieVar.iat();
        long j6 = 10;
        long j7 = cVarIat != null ? (long) cVarIat.f6583d : 10L;
        if (j7 <= 0) {
            cVarIat.f6583d = 10.0d;
        } else {
            j6 = j7;
        }
        this.emc = new emc(j6 * 1000, aVar, uymVar);
    }

    public a aa() {
        return this.xq;
    }

    @Override // L1.f
    public void bw() {
        dg();
    }

    @Override // L1.f
    public boolean cf() {
        return false;
    }

    @Override // L1.f
    public void dg() {
        this.emc.sz();
    }

    @Override // L1.f
    public void emc(SurfaceTexture surfaceTexture) {
    }

    @Override // L1.f
    public b gbl() {
        return this.emc;
    }

    @Override // L1.f
    public int msw() {
        return 0;
    }

    @Override // L1.f
    public boolean qh() {
        return false;
    }

    @Override // L1.f
    public int ru() {
        return R1.a.a(this.emc.msw, this.emc.emc);
    }

    @Override // L1.f
    public g sup() {
        return null;
    }

    @Override // L1.f
    public boolean sz() {
        return this.emc.ypw();
    }

    @Override // L1.f
    public long uym() {
        return 0L;
    }

    public long vk() {
        return this.uym;
    }

    @Override // L1.f
    public void xq() {
        this.emc.gbl();
        cf.emc emcVar = new cf.emc();
        emcVar.ypw(ycc());
        emcVar.dg(zz());
        emcVar.xq(uym());
        com.bytedance.sdk.openadsdk.dg.bw.emc.emc.ypw(this.xq, emcVar);
        emc.InterfaceC0077emc interfaceC0077emc = this.msw;
        if (interfaceC0077emc != null) {
            interfaceC0077emc.emc(1);
        }
    }

    @Override // L1.f
    public long ycc() {
        return this.emc.aa();
    }

    @Override // L1.f
    public void ypw() {
        this.emc.sup();
        cf.emc emcVar = new cf.emc();
        emcVar.ypw(ycc());
        emcVar.dg(zz());
        emcVar.xq(uym());
        emcVar.emc(vk());
        com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(this.xq, emcVar);
        emc.InterfaceC0077emc interfaceC0077emc = this.msw;
        if (interfaceC0077emc != null) {
            interfaceC0077emc.emc(2);
        }
    }

    @Override // L1.f
    public long zz() {
        return this.emc.vk();
    }

    @Override // L1.f
    public boolean emc(float f2) {
        return false;
    }

    @Override // L1.f
    public void emc(long j6) {
        this.uym = j6;
        emc emcVar = this.emc;
        if (emcVar != null) {
            emcVar.emc(j6);
        }
    }

    public void emc(boolean z6, int i) {
        dg();
    }

    @Override // L1.f
    public boolean emc(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar) throws JSONException {
        this.ycc = bVar.gbl();
        if (bVar.ru() > 0) {
            this.emc.ypw(bVar.ru());
        }
        bVar.ypw(com.bytedance.sdk.openadsdk.sra.emc.emc("player_force_raw_url", 0) == 1);
        com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(this.ypw, this.xq, bVar);
        this.emc.gbl();
        emc.InterfaceC0077emc interfaceC0077emc = this.msw;
        if (interfaceC0077emc != null) {
            interfaceC0077emc.emc(1);
        }
        return true;
    }

    @Override // L1.f
    public void emc(boolean z6, String str) {
        this.ycc = z6;
    }

    @Override // L1.f
    public void emc(c cVar) {
        this.emc.emc(cVar);
    }

    public void emc(emc.InterfaceC0077emc interfaceC0077emc) {
        this.msw = interfaceC0077emc;
    }

    @Override // L1.f
    public void emc() {
        this.emc.ru();
    }
}
