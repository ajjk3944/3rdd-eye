package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
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
import q2.a;
import s2.b;

/* loaded from: classes.dex */
public class cf {
    private boolean cf;
    final boolean dg;
    private emc.InterfaceC0162emc dr;
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
    b ycc;
    private long yzg;
    private FrameLayout zz;
    protected boolean emc = false;
    boolean ypw = false;
    protected boolean bw = false;
    private long vk = -1;

    /* renamed from: aa, reason: collision with root package name */
    private int f9272aa = -1;
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
        b bVar = this.ycc;
        if (bVar == null || bVar.gbl() == null) {
            return;
        }
        this.gbl = this.ycc.ycc();
        if (this.ycc.gbl().xq() || !this.ycc.gbl().ypw()) {
            this.ycc.ypw();
            this.ycc.dg();
            this.emc = true;
        }
    }

    public a aa() {
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.gbl();
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
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.zz();
        }
        return 0L;
    }

    public boolean dg() {
        int i10;
        return this.sf ? this.ee && this.db == 1 : this.ee && ((i10 = this.db) == 2 || i10 == 1);
    }

    public boolean dr() {
        b bVar = this.ycc;
        return bVar != null && bVar.gbl() == null;
    }

    public long ee() {
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.zz() + this.ycc.uym();
        }
        return 0L;
    }

    public boolean gbl() {
        return this.emc;
    }

    public int hxp() {
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.msw();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
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
            goto L3b
        L16:
            com.bytedance.sdk.openadsdk.core.model.rie r1 = r5.msw
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.ul.uym(r1)
            if (r1 == 0) goto L25
            if (r0 == 0) goto L25
            long r0 = r0.dg()
            goto L14
        L25:
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r5.msw
            com.bykv.vk.openvk.emc.emc.emc.xq.b r0 = r0.iat()
            if (r0 == 0) goto L39
            double r1 = r0.E()
            int r0 = r0.u()
            double r3 = (double) r0
            double r0 = r1 * r3
            goto L3b
        L39:
            r0 = 0
        L3b:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r2 = r5.rie
            com.bytedance.sdk.openadsdk.component.reward.sup r2 = r2.yid
            if (r2 == 0) goto L45
            long r3 = (long) r0
            r2.emc(r3)
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.emc.cf.iyl():double");
    }

    public boolean lt() {
        return this.xq;
    }

    public boolean mkp() {
        b bVar = this.ycc;
        if (bVar == null || bVar.gbl() == null) {
            return false;
        }
        return this.ycc.gbl().emc();
    }

    public w2.a msw() {
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar instanceof com.bytedance.sdk.openadsdk.component.reward.dg ? ((com.bytedance.sdk.openadsdk.component.reward.dg) bVar).aa() : bVar.sup();
        }
        return null;
    }

    public void mxo() {
        b bVar = this.ycc;
        if (bVar instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
            ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) bVar).iyl();
        }
    }

    public long qh() {
        return this.gbl;
    }

    public void ra() {
        b bVar = this.ycc;
        if (bVar instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
            ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) bVar).ra();
        }
    }

    public int rie() {
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.ru();
        }
        return 0;
    }

    public void rtt() {
        try {
            if (ycc()) {
                this.bw = true;
                ylm();
            }
        } catch (Exception e10) {
            ul.xq("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e10.getMessage());
        }
    }

    public boolean ru() {
        b bVar = this.ycc;
        return bVar != null && bVar.qh();
    }

    public boolean sb() {
        b bVar = this.ycc;
        if (bVar != null) {
            if (bVar.gbl() != null) {
                a aVarGbl = this.ycc.gbl();
                if (aVarGbl.uym() || aVarGbl.msw()) {
                    b bVar2 = this.ycc;
                    if (bVar2 instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
                        ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) bVar2).mxo();
                    }
                    return true;
                }
            } else if (gbl()) {
                emc(false);
                b bVar3 = this.ycc;
                if (bVar3 instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
                    ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) bVar3).mxo();
                }
                return true;
            }
        }
        return false;
    }

    public void sba() {
        b bVar = this.ycc;
        if (bVar == null) {
            return;
        }
        bVar.dg();
        this.ycc = null;
    }

    public boolean sf() {
        return this.ycc != null;
    }

    public long sra() {
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.zz();
        }
        return 0L;
    }

    public long sup() {
        b bVar = this.ycc;
        return bVar != null ? bVar.ycc() : this.gbl;
    }

    public long sz() {
        return this.sup;
    }

    public View tp() {
        b bVar = this.ycc;
        if (bVar instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
            return (View) ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) bVar).tp();
        }
        return null;
    }

    public void ul() {
        b bVar = this.ycc;
        if (bVar != null) {
            bVar.xq();
        }
    }

    public boolean uym() {
        b bVar = this.ycc;
        return bVar != null && bVar.sz();
    }

    public long vk() {
        b bVar = this.ycc;
        if (bVar != null) {
            return bVar.uym();
        }
        return 0L;
    }

    public void vw() {
        b bVar = this.ycc;
        if (bVar instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
            ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) bVar).vw();
        }
    }

    public void wo() {
        b bVar = this.ycc;
        if (bVar != null) {
            bVar.emc();
        }
    }

    public void xmt() {
        int i10 = this.db;
        if (i10 == 1 || i10 == 2) {
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
        b bVar = this.ycc;
        if (bVar == null || bVar.gbl() == null) {
            return;
        }
        this.gbl = this.ycc.ycc();
        yzg();
        emc(true);
        this.sz = true;
    }

    public boolean ycc() {
        b bVar = this.ycc;
        return (bVar == null || bVar.gbl() == null || !this.ycc.gbl().ycc()) ? false : true;
    }

    public void ylm() {
        b bVar = this.ycc;
        if (bVar != null) {
            bVar.ypw();
        }
    }

    public boolean yz() {
        return this.sz;
    }

    public void yzg() {
        b bVar = this.ycc;
        if (bVar != null) {
            bVar.bw();
        }
    }

    public boolean zz() {
        b bVar = this.ycc;
        return (bVar == null || bVar.gbl() == null || !this.ycc.gbl().uym()) ? false : true;
    }

    public void bw(boolean z10) {
        this.cf = z10;
        b bVar = this.ycc;
        if (bVar instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
            ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) bVar).ycc(z10);
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

    private void ypw(long j10, long j11) {
        int iAbs = (int) Math.abs(this.f9272aa - j10);
        int i10 = this.f9272aa;
        if (i10 < 0 || iAbs > 500 || i10 > j11 || iAbs >= 500 || this.ylm.contains(this.ul)) {
            return;
        }
        if (this.f9272aa > j10) {
            com.bytedance.sdk.openadsdk.core.qh.xq().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.cf.1
                @Override // java.lang.Runnable
                public void run() {
                    cf.this.rtt();
                    cf.this.rie.hxp.emc(cf.this.f9272aa, cf.this.ul);
                }
            }, iAbs);
        } else {
            rtt();
            this.rie.hxp.emc(this.f9272aa, this.ul);
        }
        this.ylm.add(this.ul);
    }

    public void emc(long j10) {
        this.vk = j10;
    }

    public void xq(boolean z10) {
        this.xq = z10;
    }

    public void dg(boolean z10) {
        this.hxp = z10;
        if (this.ycc instanceof com.bytedance.sdk.openadsdk.core.sz.dg.emc) {
            if (z10) {
                ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) this.ycc).ypw(this.msw.iat().u());
            } else {
                this.msw.iat().s(1);
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
            emc.InterfaceC0162emc interfaceC0162emc = this.dr;
            if (interfaceC0162emc != null) {
                ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) this.ycc).emc(interfaceC0162emc);
            }
            ((com.bytedance.sdk.openadsdk.core.sz.dg.emc) this.ycc).ycc(this.cf);
            return;
        }
        this.sf = false;
        com.bytedance.sdk.openadsdk.component.reward.dg dgVar = new com.bytedance.sdk.openadsdk.component.reward.dg(this.msw, uymVar);
        this.ycc = dgVar;
        emc.InterfaceC0162emc interfaceC0162emc2 = this.dr;
        if (interfaceC0162emc2 != null) {
            dgVar.emc(interfaceC0162emc2);
        }
    }

    public void ypw(long j10) {
        this.gbl = j10;
    }

    public void ypw(boolean z10) {
        b bVar = this.ycc;
        if (bVar != null) {
            bVar.ypw();
            this.qh = z10;
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

    public void emc(long j10, long j11) {
        this.sup = j10;
        ypw(j10, j11);
    }

    public void emc(int i10, String str) {
        this.f9272aa = i10;
        this.ul = str;
    }

    public void emc(boolean z10) {
        this.emc = z10;
    }

    public void emc(int i10, int i11) {
        if (this.ycc != null) {
            cf.emc emcVar = new cf.emc();
            emcVar.xq(vk());
            emcVar.dg(ee());
            emcVar.ypw(sup());
            emcVar.emc(i10);
            emcVar.ypw(i11);
            com.bytedance.sdk.openadsdk.dg.bw.emc.emc.dg(this.ycc.sup(), emcVar);
        }
    }

    public void emc(b.InterfaceC0477b interfaceC0477b) {
        b bVar = this.ycc;
        if (bVar != null) {
            bVar.emc(interfaceC0477b);
        }
    }

    public void emc(boolean z10, String str) {
        b bVar = this.ycc;
        if (bVar != null) {
            bVar.emc(z10, str);
        }
    }

    public void emc(String str, boolean z10) {
        if (this.ycc != null) {
            long jSup = sup();
            if (this.msw.but()) {
                jSup = this.rie.ycc();
            }
            long j10 = jSup;
            JSONObject jSONObjectEmc = tp.emc(this.msw, this.ycc.uym(), this.ycc.gbl());
            try {
                jSONObjectEmc.put("auto_click", z10);
                if (!z10) {
                    emc emcVar = this.rie;
                    com.bytedance.sdk.openadsdk.dg.xq.emc(jSONObjectEmc, emcVar.dg ? emcVar.ypw.iw() : emcVar.ypw.bhr(), (int) j10);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.dg.xq.emc(this.msw, this.ru, str, j10, rie(), jSONObjectEmc, this.xmt);
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
        int i10;
        if (this.ycc != null && jSONObject != null && ((i10 = this.db) == 1 || i10 == 2)) {
            int iOptInt = jSONObject.optInt("switch", 0);
            float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
            this.sb = fOptDouble;
            if (fOptDouble <= 0.0f && this.rie.ypw.pdk() != null) {
                this.sb = this.rie.ypw.pdk().emc();
            }
            if (iOptInt == 0) {
                this.sb = 1.0f;
                if (this.ee) {
                    long jCurrentTimeMillis = this.sba + (System.currentTimeMillis() - this.yzg);
                    this.sba = jCurrentTimeMillis;
                    b bVar = this.ycc;
                    if (bVar != null) {
                        bVar.emc(jCurrentTimeMillis);
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
            b bVar2 = this.ycc;
            if (bVar2 == null) {
                return false;
            }
            return bVar2.emc(this.sb);
        }
        this.ee = false;
        return false;
    }

    private boolean emc(long j10, boolean z10) {
        if (this.ycc == null || this.msw.iat() == null) {
            return false;
        }
        String strEmc = CacheDirFactory.getICacheDir(this.msw.zxw()).emc();
        File file = new File(strEmc, this.msw.iat().q());
        if (file.exists() && file.length() > 0) {
            this.ypw = true;
        }
        com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(strEmc, this.msw);
        ypwVarEmc.ypw(this.msw.ye());
        ypwVarEmc.ypw(this.zz.getWidth());
        ypwVarEmc.xq(this.zz.getHeight());
        ypwVarEmc.xq(this.msw.wdp());
        ypwVarEmc.emc(j10);
        ypwVarEmc.emc(z10);
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

    public void emc(boolean z10, com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar, boolean z11) {
        if (this.qh || !(!z11 || z10 || this.bw)) {
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

    public void emc(emc.InterfaceC0162emc interfaceC0162emc) {
        this.dr = interfaceC0162emc;
    }
}
