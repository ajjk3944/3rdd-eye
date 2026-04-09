package com.bytedance.sdk.openadsdk.component.reward.ouw;

import a9.a;
import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import b9.b;
import b9.e;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.yu.ouw;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import v8.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko {
    public boolean bly;

    /* renamed from: cd, reason: collision with root package name */
    private boolean f7944cd;

    /* renamed from: cf, reason: collision with root package name */
    public boolean f7945cf;
    private FrameLayout ex;
    final boolean fkw;

    /* renamed from: jg, reason: collision with root package name */
    public long f7946jg;
    private final vpp jqy;
    String ko;
    private long ksc;

    /* renamed from: od, reason: collision with root package name */
    private boolean f7949od;
    public long ouw;
    public long pno;
    public ouw.InterfaceC0093ouw qbp;
    public e ra;
    final ouw rn;
    private final String tc;
    public boolean tlj;
    private final Activity vpp;
    public boolean yu;
    public com.bytedance.sdk.openadsdk.yu.ra zin;
    protected boolean vt = false;

    /* renamed from: lh, reason: collision with root package name */
    boolean f7948lh = false;

    /* renamed from: le, reason: collision with root package name */
    protected boolean f7947le = false;
    public long ryl = -1;
    int mwh = -1;
    public boolean zih = false;
    public int vm = 0;
    private float uq = 1.0f;

    /* renamed from: th, reason: collision with root package name */
    public boolean f7950th = false;
    private HashSet<String> jae = new HashSet<>();

    public ko(ouw ouwVar) {
        this.rn = ouwVar;
        this.vpp = ouwVar.jvy;
        this.jqy = ouwVar.vt;
        this.fkw = ouwVar.yu;
        this.tc = ouwVar.fkw;
    }

    private boolean jae() {
        e eVar = this.ra;
        if (eVar != null) {
            if (eVar.zin() != null) {
                c cVarZin = this.ra.zin();
                if (cVarZin.ra() || cVarZin.pno()) {
                    e eVar2 = this.ra;
                    if (eVar2 instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
                        ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) eVar2).rrs();
                    }
                    return true;
                }
            } else if (this.vt) {
                this.vt = false;
                e eVar3 = this.ra;
                if (eVar3 instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
                    ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) eVar3).rrs();
                }
                return true;
            }
        }
        return false;
    }

    private void ksc() {
        e eVar = this.ra;
        if (eVar == null || eVar.zin() == null) {
            return;
        }
        this.ouw = this.ra.rn();
        if (this.ra.zin().lh() || !this.ra.zin().vt()) {
            this.ra.cf();
            this.ra.mwh();
            this.vt = true;
        }
    }

    private void od() {
        e eVar = this.ra;
        if (eVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) eVar).hun();
        }
    }

    public final void bly() {
        e eVar = this.ra;
        if (eVar == null) {
            return;
        }
        eVar.mwh();
        this.ra = null;
    }

    public final void cf() {
        e eVar = this.ra;
        if (eVar != null) {
            eVar.ryl();
        }
    }

    public final void ex() {
        e eVar = this.ra;
        if (eVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) eVar).ux();
        }
    }

    public final long fkw() {
        e eVar = this.ra;
        return eVar != null ? eVar.rn() : this.ouw;
    }

    public final int jg() {
        e eVar = this.ra;
        if (eVar != null) {
            return eVar.vm();
        }
        return 0;
    }

    public final View jqy() {
        e eVar = this.ra;
        if (eVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            return (View) ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) eVar).fqk();
        }
        return null;
    }

    public final long ko() {
        e eVar = this.ra;
        if (eVar == null) {
            return 0L;
        }
        return this.ra.zih() + eVar.th();
    }

    public final void le() {
        this.vt = true;
    }

    public final a lh() {
        e eVar = this.ra;
        if (eVar != null) {
            return eVar instanceof com.bytedance.sdk.openadsdk.component.reward.lh ? ((com.bytedance.sdk.openadsdk.component.reward.lh) eVar).ouw : eVar.vpp();
        }
        return null;
    }

    public final int mwh() {
        e eVar = this.ra;
        if (eVar != null) {
            return eVar.qbp();
        }
        return 0;
    }

    public final void ouw(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.yu.ra raVar) {
        if (this.f7949od) {
            return;
        }
        this.f7949od = true;
        this.ex = frameLayout;
        vpp vppVar = this.jqy;
        cd cdVar = vppVar.f8311tj;
        if (cdVar != null) {
            this.vm = cdVar.vt;
            this.uq = cdVar.ouw;
        }
        this.zin = raVar;
        if (!vpp.fkw(vppVar)) {
            this.f7950th = false;
            com.bytedance.sdk.openadsdk.component.reward.lh lhVar = new com.bytedance.sdk.openadsdk.component.reward.lh(this.jqy, raVar);
            this.ra = lhVar;
            ouw.InterfaceC0093ouw interfaceC0093ouw = this.qbp;
            if (interfaceC0093ouw != null) {
                lhVar.vt = interfaceC0093ouw;
                return;
            }
            return;
        }
        this.f7950th = true;
        this.ra = new com.bytedance.sdk.openadsdk.core.mwh.yu.ouw(this.vpp, this.ex, this.jqy, raVar);
        ouw(this.f7944cd);
        ouw.InterfaceC0093ouw interfaceC0093ouw2 = this.qbp;
        if (interfaceC0093ouw2 != null) {
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) this.ra).ucs = interfaceC0093ouw2;
        }
        ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) this.ra).wp = this.f7945cf;
    }

    public final long pno() {
        e eVar = this.ra;
        if (eVar != null) {
            return eVar.zih();
        }
        return 0L;
    }

    public final boolean qbp() {
        e eVar = this.ra;
        if (eVar == null || eVar.zin() == null) {
            return false;
        }
        return this.ra.zin().ouw();
    }

    public final void ra() {
        try {
            if (ouw()) {
                this.ra.cf();
            }
        } catch (Throwable th2) {
            qbp.yu("RewardFullVideoPlayerManager onPause throw Exception :" + th2.getMessage(), new Object[0]);
        }
    }

    public final long rn() {
        e eVar = this.ra;
        if (eVar != null) {
            return eVar.th();
        }
        return 0L;
    }

    public final void ryl() {
        e eVar = this.ra;
        if (eVar != null) {
            eVar.cf();
        }
    }

    public final void tc() {
        e eVar = this.ra;
        if (eVar != null) {
            eVar.bly();
        }
    }

    public final void th() {
        try {
            if (ouw()) {
                this.f7947le = true;
                ryl();
            }
        } catch (Exception e2) {
            qbp.lh("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e2.getMessage());
        }
    }

    public final void tlj() {
        e eVar = this.ra;
        if (eVar != null) {
            eVar.ko();
        }
    }

    public final void vm() {
        this.zih = false;
        bly();
    }

    public final void vpp() {
        e eVar = this.ra;
        if (eVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) eVar).ey();
        }
    }

    public final boolean vt() {
        e eVar = this.ra;
        return eVar != null && eVar.jqy();
    }

    public final boolean yu() {
        e eVar = this.ra;
        return (eVar == null || eVar.zin() == null || !this.ra.zin().ra()) ? false : true;
    }

    public final void zih() {
        int i4 = this.vm;
        if (i4 == 1 || i4 == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                ouw(jSONObject);
            } catch (Throwable th2) {
                qbp.ouw("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double zin() {
        /*
            r5 = this;
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r5.jqy
            com.bytedance.sdk.openadsdk.core.model.qbp r1 = r0.kq
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.th.yu(r0)
            if (r0 == 0) goto L10
            if (r1 == 0) goto L10
            long r0 = r1.vt
        Le:
            double r0 = (double) r0
            goto L2d
        L10:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r5.jqy
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.th.ra(r0)
            if (r0 == 0) goto L1d
            if (r1 == 0) goto L1d
            long r0 = r1.yu
            goto Le
        L1d:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r5.jqy
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.c r0 = r0.f8309sd
            if (r0 == 0) goto L2b
            double r1 = r0.f6576d
            int r0 = r0.f6588r
            double r3 = (double) r0
            double r0 = r1 * r3
            goto L2d
        L2b:
            r0 = 0
        L2d:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r2 = r5.rn
            com.bytedance.sdk.openadsdk.component.reward.tlj r2 = r2.ycd
            if (r2 == 0) goto L37
            long r3 = (long) r0
            r2.ouw(r3)
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ouw.ko.zin():double");
    }

    private void vt(long j, long j8) throws JSONException {
        int iAbs = (int) Math.abs(this.mwh - j);
        int i4 = this.mwh;
        if (i4 < 0 || iAbs > 500 || i4 > j8 || iAbs >= 500 || this.jae.contains(this.ko)) {
            return;
        }
        if (this.mwh > j) {
            com.bytedance.sdk.openadsdk.core.jg.lh().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.ko.1
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    ko.this.th();
                    ko koVar = ko.this;
                    koVar.rn.jae.ouw(koVar.mwh, koVar.ko);
                }
            }, iAbs);
        } else {
            th();
            this.rn.jae.ouw(this.mwh, this.ko);
        }
        this.jae.add(this.ko);
    }

    private void vt(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        if (!jae() || vtVar == null) {
            return;
        }
        vtVar.ouw(this.ouw, true);
    }

    public final boolean ouw() {
        e eVar = this.ra;
        return (eVar == null || eVar.zin() == null || !this.ra.zin().le()) ? false : true;
    }

    public final void ouw(long j, long j8) {
        this.pno = j;
        vt(j, j8);
    }

    public final void ouw(int i4, int i10) {
        if (this.ra != null) {
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.vt = pno();
            ouwVar.vt(ko());
            ouwVar.ouw(fkw());
            ouwVar.pno = i4;
            ouwVar.bly = i10;
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.yu(this.ra.vpp(), ouwVar);
        }
    }

    public final void ouw(b bVar) {
        e eVar = this.ra;
        if (eVar != null) {
            eVar.ouw(bVar);
        }
    }

    public final void ouw(boolean z3, String str) {
        e eVar = this.ra;
        if (eVar != null) {
            eVar.ouw(z3, str);
        }
    }

    public final void ouw(String str, boolean z3) {
        if (this.ra != null) {
            long jFkw = fkw();
            if (this.jqy.ryl()) {
                jFkw = this.rn.ouw();
            }
            long j = jFkw;
            JSONObject jSONObjectOuw = uoy.ouw(this.jqy, this.ra.zih(), this.ra.zin());
            try {
                jSONObjectOuw.put("auto_click", z3);
                if (!z3) {
                    ouw ouwVar = this.rn;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(jSONObjectOuw, ouwVar.yu ? ouwVar.vt.ng() : ouwVar.vt.myk(), (int) j);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(this.jqy, this.tc, str, j, mwh(), jSONObjectOuw, this.zin);
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFVideoPlayerMag", "event tag:" + this.tc + ", TotalPlayDuration=" + ko() + ",mBasevideoController.getPct()=" + mwh());
        }
        od();
    }

    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        if (this.rn.tlj.get()) {
            return;
        }
        ouw ouwVar = this.rn;
        if (!ouwVar.pv || od.lh(ouwVar.vt)) {
            return;
        }
        if (!vpp.fkw(this.rn.vt)) {
            com.bytedance.sdk.openadsdk.core.zih.yu();
            if (com.bytedance.sdk.openadsdk.core.settings.cf.bly(String.valueOf(this.rn.f7961le)) == 1 && this.rn.jae.fkw) {
                return;
            }
        }
        if (th.yu(this.rn.vt) || th.ra(this.rn.vt) || this.f7947le || !vtVar.le()) {
            return;
        }
        this.rn.ux.removeMessages(300);
        Message messageObtain = Message.obtain();
        messageObtain.what = 300;
        this.rn.ux.sendMessageDelayed(messageObtain, 5000L);
    }

    public final boolean ouw(JSONObject jSONObject) {
        int i4;
        cd cdVar;
        if (this.ra != null && jSONObject != null && ((i4 = this.vm) == 1 || i4 == 2)) {
            int iOptInt = jSONObject.optInt("switch", 0);
            float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
            this.uq = fOptDouble;
            if (fOptDouble <= 0.0f && (cdVar = this.rn.vt.f8311tj) != null) {
                this.uq = cdVar.ouw;
            }
            if (iOptInt == 0) {
                this.uq = 1.0f;
                if (this.zih) {
                    long jCurrentTimeMillis = (System.currentTimeMillis() - this.ksc) + this.f7946jg;
                    this.f7946jg = jCurrentTimeMillis;
                    e eVar = this.ra;
                    if (eVar != null) {
                        eVar.ouw(jCurrentTimeMillis);
                    }
                    com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = this.rn.fqk;
                    if (vtVar != null) {
                        vtVar.lh(false);
                    }
                }
            } else if (iOptInt == 1 && !this.zih) {
                this.ksc = System.currentTimeMillis();
                com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar2 = this.rn.fqk;
                if (vtVar2 != null) {
                    vtVar2.lh(true);
                }
            }
            this.zih = iOptInt == 1;
            if (this.vm == 1) {
                return true;
            }
            e eVar2 = this.ra;
            if (eVar2 == null) {
                return false;
            }
            return eVar2.ouw(this.uq);
        }
        this.zih = false;
        return false;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        try {
            this.f7947le = false;
            if (this.vt) {
                ksc();
                vt(vtVar);
            } else if (yu()) {
                cf();
            }
        } catch (Throwable th2) {
            qbp.lh("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th2.getMessage());
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, boolean z3) {
        if (this.tlj || (z3 && !this.f7947le)) {
            if (yu()) {
                cf();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
            } else {
                ksc();
                vt(vtVar);
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
            }
            this.tlj = false;
        }
    }

    public final void ouw(boolean z3) {
        this.f7944cd = z3;
        e eVar = this.ra;
        if (eVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            if (z3) {
                ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) eVar).ey = this.jqy.f8309sd.f6588r;
                return;
            }
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.c cVar = this.jqy.f8309sd;
            cVar.getClass();
            cVar.f6588r = Math.min(4, Math.max(1, 1));
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) this.ra).ey = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ouw(long r11, boolean r13, final java.util.Map<java.lang.String, java.lang.Object> r14, com.bytedance.sdk.openadsdk.component.reward.vt.vt r15) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ouw.ko.ouw(long, boolean, java.util.Map, com.bytedance.sdk.openadsdk.component.reward.vt.vt):boolean");
    }
}
