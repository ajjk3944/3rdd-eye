package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class mwh {
    String bly;

    /* renamed from: le, reason: collision with root package name */
    volatile long f7954le;

    /* renamed from: lh, reason: collision with root package name */
    final vpp f7955lh;
    com.bytedance.adsdk.ugeno.vt.lh mwh;
    public final ouw ouw;
    volatile long pno;
    volatile long ra;
    public boolean rn;
    com.bytedance.adsdk.ugeno.vt.lh ryl;
    public FrameLayout vt;
    final AtomicBoolean yu = new AtomicBoolean(false);
    public final AtomicBoolean fkw = new AtomicBoolean(false);
    private final AtomicBoolean zih = new AtomicBoolean(false);
    long tlj = 0;

    /* renamed from: cf, reason: collision with root package name */
    long f7952cf = 0;

    /* renamed from: jg, reason: collision with root package name */
    String f7953jg = null;
    boolean ko = false;

    public mwh(ouw ouwVar) {
        this.ouw = ouwVar;
        this.f7955lh = ouwVar.vt;
        this.bly = ouwVar.fkw;
    }

    private void le() {
        com.bytedance.sdk.openadsdk.yu.lh.lh(this.f7955lh, this.bly);
    }

    public final void fkw() {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(SystemClock.elapsedRealtime() - this.pno, this.f7955lh, this.bly);
    }

    public final void lh() {
        com.bytedance.adsdk.ugeno.vt.lh lhVar = this.mwh;
        if (lhVar != null) {
            this.vt.addView(lhVar.fkw, new FrameLayout.LayoutParams(this.mwh.od(), this.mwh.cd()));
        }
    }

    public final void ouw() {
        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar;
        vpp vppVar = this.f7955lh;
        if (vppVar == null || (ouwVar = vppVar.upp) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.cf.yu.vt vtVar = new com.bytedance.sdk.openadsdk.core.cf.yu.vt(this.ouw.jvy, vppVar, ouwVar, this.bly, new com.bytedance.sdk.openadsdk.core.cf.ra.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.mwh.1
            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
            public final void ouw(String str) {
                mwh.this.tlj = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
            public final void vt(String str) {
                mwh mwhVar = mwh.this;
                mwhVar.f7953jg = str;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar.f7955lh, false, mwhVar.bly, "success", SystemClock.elapsedRealtime() - mwh.this.tlj, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
            public final void ouw(int i4, String str, String str2) {
                mwh mwhVar = mwh.this;
                mwhVar.f7953jg = str2;
                mwhVar.yu.set(false);
                mwh mwhVar2 = mwh.this;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar2.f7955lh, false, mwhVar2.bly, "fail", SystemClock.elapsedRealtime() - mwh.this.tlj, str2, "endcard", i4, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.vt
            public final void ouw() {
                mwh mwhVar = mwh.this;
                mwhVar.f7954le = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar.f7955lh, mwhVar.bly);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.vt
            public final void ouw(int i4, String str) {
                mwh.this.yu.set(false);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                mwh mwhVar = mwh.this;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar.f7955lh, mwhVar.bly, jElapsedRealtime - mwhVar.f7954le, i4, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.vt
            public final void ouw(com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
                com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar2;
                mwh mwhVar = mwh.this;
                mwhVar.ryl = lhVar;
                mwhVar.yu.set(true);
                mwh.this.ra = SystemClock.elapsedRealtime();
                if (mwh.this.ouw.bs.cf()) {
                    View viewTlj = mwh.this.ouw.ey.tlj();
                    if (viewTlj instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
                        ((com.bytedance.sdk.openadsdk.core.le.yu) viewTlj).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(mwh.this.ouw.hun, "tt_skip_btn"));
                    }
                }
                final mwh mwhVar2 = mwh.this;
                vpp vppVar2 = mwhVar2.f7955lh;
                if (vppVar2 != null && (ouwVar2 = vppVar2.nit) != null) {
                    com.bytedance.sdk.openadsdk.core.cf.yu.vt vtVar2 = new com.bytedance.sdk.openadsdk.core.cf.yu.vt(mwhVar2.ouw.jvy, vppVar2, ouwVar2, mwhVar2.bly, new com.bytedance.sdk.openadsdk.core.cf.ra.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.mwh.3
                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.vt
                        public final void ouw() {
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
                        public final void vt(String str) {
                            mwh mwhVar3 = mwh.this;
                            com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar3.f7955lh, true, mwhVar3.bly, "success", SystemClock.elapsedRealtime() - mwh.this.f7952cf, str, "endcard", 0, null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
                        public final void ouw(String str) {
                            mwh.this.f7952cf = SystemClock.elapsedRealtime();
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
                        public final void ouw(int i4, String str, String str2) {
                            mwh.this.fkw.set(false);
                            mwh mwhVar3 = mwh.this;
                            com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar3.f7955lh, true, mwhVar3.bly, "fail", SystemClock.elapsedRealtime() - mwh.this.f7952cf, str2, "endcard", i4, str);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.vt
                        public final void ouw(int i4, String str) {
                            mwh.this.fkw.set(false);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.vt
                        public final void ouw(com.bytedance.adsdk.ugeno.vt.lh<View> lhVar2) {
                            mwh mwhVar3 = mwh.this;
                            mwhVar3.mwh = lhVar2;
                            mwhVar3.fkw.set(true);
                        }
                    });
                    vtVar2.ouw = new com.bytedance.sdk.openadsdk.core.cf.ra.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.mwh.4
                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.ouw
                        public final String ouw() {
                            return "overlay";
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.cf.ra.ouw
                        public final void vt() {
                            mwh mwhVar3 = mwh.this;
                            mwhVar3.ko = true;
                            mwhVar3.ouw.ey.tlj().performClick();
                        }
                    };
                    vtVar2.ouw();
                    vtVar2.vt = mwhVar2.ouw.ey.tlj();
                }
                mwh.this.yu();
                mwh mwhVar3 = mwh.this;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar3.f7955lh, mwhVar3.bly, mwhVar3.ra - mwh.this.f7954le);
            }
        });
        if (this.f7955lh.nit != null) {
            vtVar.ouw = new com.bytedance.sdk.openadsdk.core.cf.ra.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.mwh.2
                @Override // com.bytedance.sdk.openadsdk.core.cf.ra.ouw
                public final String ouw() {
                    return "normal";
                }

                @Override // com.bytedance.sdk.openadsdk.core.cf.ra.ouw
                public final void vt() {
                }
            };
        }
        vtVar.ouw();
        vtVar.vt = this.ouw.ey.tlj();
    }

    public final void vt() {
        le();
        yu();
        com.bytedance.adsdk.ugeno.vt.lh lhVar = this.ryl;
        if (lhVar != null) {
            this.vt.addView(lhVar.fkw, new FrameLayout.LayoutParams(this.ryl.od(), this.ryl.cd()));
        }
    }

    public final void yu() {
        if (this.pno <= 0 || this.ra <= 0 || this.zih.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.ra - this.pno, this.f7955lh, this.bly, this.f7953jg);
    }

    public final void ouw(int i4) {
        osn.ouw((View) this.vt, i4);
    }
}
