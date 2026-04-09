package com.bytedance.sdk.openadsdk.component.reward.emc;

import A2.C0115c;
import J1.b;
import L1.f;
import P1.a;
import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.emc.emc.emc.xq.c;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sz.dg.emc;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.cf;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.io.File;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cf {
    private boolean cf;
    final boolean dg;
    private emc.InterfaceC0077emc dr;
    private long gbl;
    private boolean hxp;
    private final rie msw;
    private boolean qh;
    private final emc rie;
    private final String ru;
    private long sba;
    private boolean sra;
    private long sup;
    private boolean sz;
    private String ul;
    private final Activity uym;
    private com.bytedance.sdk.openadsdk.dg.uym xmt;
    boolean xq;
    f ycc;
    private long yzg;
    private FrameLayout zz;
    protected boolean emc = false;
    boolean ypw = false;
    protected boolean bw = false;
    private long vk = -1;
    private int aa = -1;
    private boolean ee = false;
    private int db = 0;
    private float sb = 1.0f;
    private boolean sf = false;
    private HashSet<String> ylm = new HashSet<>();

    public cf(emc emcVar) {
        this.rie = emcVar;
        this.uym = emcVar.mxo;
        this.msw = emcVar.ypw;
        this.dg = emcVar.dg;
        this.ru = emcVar.bw;
    }

    private void wpn() {
        f fVar = this.ycc;
        if (fVar == null || fVar.gbl() == null) {
            return;
        }
        this.gbl = this.ycc.ycc();
        if (this.ycc.gbl().xq() || !this.ycc.gbl().ypw()) {
            this.ycc.ypw();
            this.ycc.dg();
            this.emc = true;
        }
    }

    public b aa() {
        f fVar = this.ycc;
        if (fVar != null) {
            return fVar.gbl();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.dg.uym bw() {
        return this.xmt;
    }

    public void cf() {
        try {
            if (ycc()) {
                this.ycc.ypw();
            }
        } catch (Throwable th) {
            ul.xq("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage(), new Object[0]);
        }
    }

    public void cuf() {
        this.ee = false;
        sba();
    }

    public long db() {
        f fVar = this.ycc;
        if (fVar != null) {
            return fVar.zz();
        }
        return 0L;
    }

    public boolean dg() {
        int i;
        return this.sf ? this.ee && this.db == 1 : this.ee && ((i = this.db) == 2 || i == 1);
    }

    public boolean dr() {
        f fVar = this.ycc;
        return fVar != null && fVar.gbl() == null;
    }

    public long ee() {
        f fVar = this.ycc;
        if (fVar == null) {
            return 0L;
        }
        return this.ycc.uym() + fVar.zz();
    }

    public boolean gbl() {
        return this.emc;
    }

    public int hxp() {
        f fVar = this.ycc;
        if (fVar != null) {
            return fVar.msw();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double iyl() {
        /*
            r5 = this;
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r5.msw
            com.bytedance.sdk.openadsdk.core.model.ylm r0 = r0.hxp()
            com.bytedance.sdk.openadsdk.core.model.rie r1 = r5.msw
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.ul.dg(r1)
            if (r1 == 0) goto L16
            if (r0 == 0) goto L16
            long r0 = r0.ypw()
        L14:
            double r0 = (double) r0
            goto L37
        L16:
            com.bytedance.sdk.openadsdk.core.model.rie r1 = r5.msw
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.ul.uym(r1)
            if (r1 == 0) goto L25
            if (r0 == 0) goto L25
            long r0 = r0.dg()
            goto L14
        L25:
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r5.msw
            com.bykv.vk.openvk.emc.emc.emc.xq.c r0 = r0.iat()
            if (r0 == 0) goto L35
            double r1 = r0.f6583d
            int r0 = r0.f6596r
            double r3 = (double) r0
            double r0 = r1 * r3
            goto L37
        L35:
            r0 = 0
        L37:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r2 = r5.rie
            com.bytedance.sdk.openadsdk.component.reward.sup r2 = r2.yid
            if (r2 == 0) goto L41
            long r3 = (long) r0
            r2.emc(r3)
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.emc.cf.iyl():double");
    }

    public boolean lt() {
        return this.xq;
    }

    public boolean mkp() {
        f fVar = this.ycc;
        if (fVar == null || fVar.gbl() == null) {
            return false;
        }
        return this.ycc.gbl().emc();
    }

    public a msw() {
        f fVar = this.ycc;
        if (fVar != null) {
            return fVar instanceof com.bytedance.sdk.openadsdk.component.reward.dg ? ((com.bytedance.sdk.openadsdk.component.reward.dg) fVar).aa() : fVar.sup();
        }
        return null;
    }

    public void mxo() {
        f fVar = this.ycc;
        if (fVar instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
            ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) fVar).iyl();
        }
    }

    public long qh() {
        return this.gbl;
    }

    public void ra() {
        f fVar = this.ycc;
        if (fVar instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
            ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) fVar).ra();
        }
    }

    public int rie() {
        f fVar = this.ycc;
        if (fVar != null) {
            return fVar.ru();
        }
        return 0;
    }

    public void rtt() {
        try {
            if (ycc()) {
                this.bw = true;
                ylm();
            }
        } catch (Exception e6) {
            ul.xq("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e6.getMessage());
        }
    }

    public boolean ru() {
        f fVar = this.ycc;
        return fVar != null && fVar.qh();
    }

    public boolean sb() {
        f fVar = this.ycc;
        if (fVar != null) {
            if (fVar.gbl() != null) {
                b bVarGbl = this.ycc.gbl();
                if (bVarGbl.uym() || bVarGbl.msw()) {
                    f fVar2 = this.ycc;
                    if (fVar2 instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
                        ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) fVar2).mxo();
                    }
                    return true;
                }
            } else if (gbl()) {
                emc(false);
                f fVar3 = this.ycc;
                if (fVar3 instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
                    ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) fVar3).mxo();
                }
                return true;
            }
        }
        return false;
    }

    public void sba() {
        f fVar = this.ycc;
        if (fVar == null) {
            return;
        }
        fVar.dg();
        this.ycc = null;
    }

    public boolean sf() {
        return this.ycc != null;
    }

    public long sra() {
        f fVar = this.ycc;
        if (fVar != null) {
            return fVar.zz();
        }
        return 0L;
    }

    public long sup() {
        f fVar = this.ycc;
        return fVar != null ? fVar.ycc() : this.gbl;
    }

    public long sz() {
        return this.sup;
    }

    public View tp() {
        f fVar = this.ycc;
        if (fVar instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
            return (View) ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) fVar).tp();
        }
        return null;
    }

    public void ul() {
        f fVar = this.ycc;
        if (fVar != null) {
            fVar.xq();
        }
    }

    public boolean uym() {
        f fVar = this.ycc;
        return fVar != null && fVar.sz();
    }

    public long vk() {
        f fVar = this.ycc;
        if (fVar != null) {
            return fVar.uym();
        }
        return 0L;
    }

    public void vw() {
        f fVar = this.ycc;
        if (fVar instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
            ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) fVar).vw();
        }
    }

    public void wo() {
        f fVar = this.ycc;
        if (fVar != null) {
            fVar.emc();
        }
    }

    public void xmt() {
        int i = this.db;
        if (i == 1 || i == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                emc(jSONObject);
            } catch (Throwable th) {
                ul.emc("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th);
            }
        }
    }

    public void xxg() {
        f fVar = this.ycc;
        if (fVar == null || fVar.gbl() == null) {
            return;
        }
        this.gbl = this.ycc.ycc();
        yzg();
        emc(true);
        this.sz = true;
    }

    public boolean ycc() {
        f fVar = this.ycc;
        return (fVar == null || fVar.gbl() == null || !this.ycc.gbl().ycc()) ? false : true;
    }

    public void ylm() {
        f fVar = this.ycc;
        if (fVar != null) {
            fVar.ypw();
        }
    }

    public boolean yz() {
        return this.sz;
    }

    public void yzg() {
        f fVar = this.ycc;
        if (fVar != null) {
            fVar.bw();
        }
    }

    public boolean zz() {
        f fVar = this.ycc;
        return (fVar == null || fVar.gbl() == null || !this.ycc.gbl().uym()) ? false : true;
    }

    public void bw(boolean z6) {
        this.cf = z6;
        f fVar = this.ycc;
        if (fVar instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
            ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) fVar).ycc(z6);
        }
    }

    public long emc() {
        return this.vk;
    }

    public boolean xq() {
        return this.ee;
    }

    public long ypw() {
        return this.sba;
    }

    private void ypw(long j6, long j7) {
        int iAbs = (int) Math.abs(this.aa - j6);
        int i = this.aa;
        if (i < 0 || iAbs > 500 || i > j7 || iAbs >= 500 || this.ylm.contains(this.ul)) {
            return;
        }
        if (this.aa > j6) {
            com.bytedance.sdk.openadsdk.core.qh.xq().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.cf.1
                @Override // java.lang.Runnable
                public void run() {
                    cf.this.rtt();
                    cf.this.rie.hxp.emc(cf.this.aa, cf.this.ul);
                }
            }, iAbs);
        } else {
            rtt();
            this.rie.hxp.emc(this.aa, this.ul);
        }
        this.ylm.add(this.ul);
    }

    public void emc(long j6) {
        this.vk = j6;
    }

    public void xq(boolean z6) {
        this.xq = z6;
    }

    public void dg(boolean z6) {
        this.hxp = z6;
        if (this.ycc instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
            if (z6) {
                ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) this.ycc).ypw(this.msw.iat().f6596r);
            } else {
                c cVarIat = this.msw.iat();
                cVarIat.getClass();
                cVarIat.f6596r = Math.min(4, Math.max(1, 1));
                ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) this.ycc).ypw(1);
            }
        }
    }

    public void emc(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.dg.uym uymVar) {
        if (this.sra) {
            return;
        }
        this.sra = true;
        this.zz = frameLayout;
        if (this.msw.pdk() != null) {
            this.db = this.msw.pdk().ypw();
            this.sb = this.msw.pdk().emc();
        }
        this.xmt = uymVar;
        if (rie.bw(this.msw)) {
            this.sf = true;
            this.ycc = new com.bytedance.sdk.openadsdk.core.sz.dg.emc(this.uym, this.zz, this.msw, uymVar);
            dg(this.hxp);
            emc.InterfaceC0077emc interfaceC0077emc = this.dr;
            if (interfaceC0077emc != null) {
                ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) this.ycc).emc(interfaceC0077emc);
            }
            ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) this.ycc).ycc(this.cf);
            return;
        }
        this.sf = false;
        com.bytedance.sdk.openadsdk.component.reward.dg dgVar = new com.bytedance.sdk.openadsdk.component.reward.dg(this.msw, uymVar);
        this.ycc = dgVar;
        emc.InterfaceC0077emc interfaceC0077emc2 = this.dr;
        if (interfaceC0077emc2 != null) {
            dgVar.emc(interfaceC0077emc2);
        }
    }

    public void ypw(long j6) {
        this.gbl = j6;
    }

    public void ypw(boolean z6) {
        f fVar = this.ycc;
        if (fVar != null) {
            fVar.ypw();
            this.qh = z6;
        }
    }

    public void ypw(com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar) {
        if (!sb() || ypwVar == null) {
            return;
        }
        ypwVar.emc(qh(), true);
    }

    public void emc(com.bytedance.sdk.openadsdk.dg.uym uymVar) {
        this.xmt = uymVar;
    }

    public void emc(long j6, long j7) {
        this.sup = j6;
        ypw(j6, j7);
    }

    public void emc(int i, String str) {
        this.aa = i;
        this.ul = str;
    }

    public void emc(boolean z6) {
        this.emc = z6;
    }

    public void emc(int i, int i3) {
        if (this.ycc != null) {
            cf.emc emcVar = new cf.emc();
            emcVar.xq(vk());
            emcVar.dg(ee());
            emcVar.ypw(sup());
            emcVar.emc(i);
            emcVar.ypw(i3);
            com.bytedance.sdk.openadsdk.dg.bw.emc.emc.dg(this.ycc.sup(), emcVar);
        }
    }

    public void emc(L1.c cVar) {
        f fVar = this.ycc;
        if (fVar != null) {
            fVar.emc(cVar);
        }
    }

    public void emc(boolean z6, String str) {
        f fVar = this.ycc;
        if (fVar != null) {
            fVar.emc(z6, str);
        }
    }

    public void emc(String str, boolean z6) {
        if (this.ycc != null) {
            long jSup = sup();
            if (this.msw.but()) {
                jSup = this.rie.ycc();
            }
            long j6 = jSup;
            JSONObject jSONObjectEmc = tp.emc(this.msw, this.ycc.uym(), this.ycc.gbl());
            try {
                jSONObjectEmc.put("auto_click", z6);
                if (!z6) {
                    emc emcVar = this.rie;
                    com.bytedance.sdk.openadsdk.dg.xq.emc(jSONObjectEmc, emcVar.dg ? emcVar.ypw.iw() : emcVar.ypw.bhr(), (int) j6);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.dg.xq.emc(this.msw, this.ru, str, j6, rie(), jSONObjectEmc, this.xmt);
            ee();
            rie();
        }
        vw();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean emc(long r4, boolean r6, java.util.Map<java.lang.String, java.lang.Object> r7, com.bytedance.sdk.openadsdk.component.reward.ypw.ypw r8) {
        /*
            r3 = this;
            boolean r0 = r3.sf()
            java.lang.String r1 = "show_ad_fail"
            r2 = 0
            if (r0 != 0) goto L15
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r4 = r3.rie
            com.bytedance.sdk.openadsdk.core.model.rie r5 = r4.ypw
            java.lang.String r4 = r4.bw
            java.lang.String r6 = "video_controller_not_ready"
            com.bytedance.sdk.openadsdk.dg.ru.emc(r5, r1, r4, r6)
            return r2
        L15:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.rie
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r0.ypw
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.ul.dg(r0)
            if (r0 != 0) goto L66
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.rie
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r0.ypw
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.ul.uym(r0)
            if (r0 == 0) goto L2a
            goto L66
        L2a:
            if (r6 == 0) goto L32
            boolean r0 = r3.dr()
            if (r0 != 0) goto L35
        L32:
            r3.emc(r8)
        L35:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r8 = r3.rie     // Catch: java.lang.Exception -> L43
            boolean r8 = r8.yz     // Catch: java.lang.Exception -> L43
            boolean r4 = r3.emc(r4, r8)     // Catch: java.lang.Exception -> L43
            r3.sz = r2     // Catch: java.lang.Exception -> L40
            goto L4c
        L40:
            r5 = move-exception
            r2 = r4
            goto L44
        L43:
            r5 = move-exception
        L44:
            java.lang.String r4 = "TTAD.RFVideoPlayerMag"
            java.lang.String r8 = "playVideo: "
            android.util.Log.e(r4, r8, r5)
            r4 = r2
        L4c:
            if (r4 == 0) goto L58
            if (r6 != 0) goto L58
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r5 = r3.rie
            com.bytedance.sdk.openadsdk.component.reward.emc.ru r5 = r5.db
            r5.emc(r7)
            goto L65
        L58:
            if (r4 != 0) goto L65
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r5 = r3.rie
            com.bytedance.sdk.openadsdk.core.model.rie r6 = r5.ypw
            java.lang.String r5 = r5.bw
            java.lang.String r7 = "video_play_fail"
            com.bytedance.sdk.openadsdk.dg.ru.emc(r6, r1, r5, r7)
        L65:
            return r4
        L66:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.emc.cf.emc(long, boolean, java.util.Map, com.bytedance.sdk.openadsdk.component.reward.ypw.ypw):boolean");
    }

    public void emc(com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar) {
        if (this.rie.zz.get()) {
            return;
        }
        emc emcVar = this.rie;
        if (emcVar.wpn && !dr.xq(emcVar.ypw)) {
            boolean zBw = rie.bw(this.rie.ypw);
            boolean zDg = this.rie.hxp.dg();
            int iSz = com.bytedance.sdk.openadsdk.core.aa.dg().sz(String.valueOf(this.rie.ycc));
            if ((!zBw && iSz == 1 && zDg) || com.bytedance.sdk.openadsdk.core.model.ul.dg(this.rie.ypw) || com.bytedance.sdk.openadsdk.core.model.ul.uym(this.rie.ypw) || this.bw || !ypwVar.bw()) {
                return;
            }
            this.rie.ra.removeMessages(300);
            Message messageObtain = Message.obtain();
            messageObtain.what = 300;
            this.rie.ra.sendMessageDelayed(messageObtain, 5000L);
        }
    }

    public boolean emc(JSONObject jSONObject) {
        int i;
        if (this.ycc != null && jSONObject != null && ((i = this.db) == 1 || i == 2)) {
            int iOptInt = jSONObject.optInt("switch", 0);
            float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
            this.sb = fOptDouble;
            if (fOptDouble <= 0.0f && this.rie.ypw.pdk() != null) {
                this.sb = this.rie.ypw.pdk().emc();
            }
            if (iOptInt == 0) {
                this.sb = 1.0f;
                if (this.ee) {
                    long jCurrentTimeMillis = (System.currentTimeMillis() - this.yzg) + this.sba;
                    this.sba = jCurrentTimeMillis;
                    f fVar = this.ycc;
                    if (fVar != null) {
                        fVar.emc(jCurrentTimeMillis);
                    }
                    com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar = this.rie.tp;
                    if (ypwVar != null) {
                        ypwVar.dg(false);
                    }
                }
            } else if (iOptInt == 1 && !this.ee) {
                this.yzg = System.currentTimeMillis();
                com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar2 = this.rie.tp;
                if (ypwVar2 != null) {
                    ypwVar2.dg(true);
                }
            }
            this.ee = iOptInt == 1;
            if (this.db == 1) {
                return true;
            }
            f fVar2 = this.ycc;
            if (fVar2 == null) {
                return false;
            }
            return fVar2.emc(this.sb);
        }
        this.ee = false;
        return false;
    }

    private boolean emc(long j6, boolean z6) {
        if (this.ycc == null || this.msw.iat() == null) {
            return false;
        }
        String strB = ((C0115c) CacheDirFactory.getICacheDir(this.msw.zxw())).b();
        File file = new File(strB, this.msw.iat().b());
        if (file.exists() && file.length() > 0) {
            this.ypw = true;
        }
        com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(strB, this.msw);
        ypwVarEmc.ypw(this.msw.ye());
        ypwVarEmc.ypw(this.zz.getWidth());
        ypwVarEmc.xq(this.zz.getHeight());
        ypwVarEmc.xq(this.msw.wdp());
        ypwVarEmc.emc(j6);
        ypwVarEmc.emc(z6);
        return this.ycc.emc(ypwVarEmc);
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar) {
        try {
            this.bw = false;
            if (gbl()) {
                wpn();
                ypw(ypwVar);
            } else if (zz()) {
                ul();
            }
        } catch (Throwable th) {
            ul.xq("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void emc(boolean z6, com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar, boolean z7) {
        if (this.qh || !(!z7 || z6 || this.bw)) {
            if (zz()) {
                ul();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
            } else {
                wpn();
                ypw(ypwVar);
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
            }
            this.qh = false;
        }
    }

    public void emc(emc.InterfaceC0077emc interfaceC0077emc) {
        this.dr = interfaceC0077emc;
    }
}
