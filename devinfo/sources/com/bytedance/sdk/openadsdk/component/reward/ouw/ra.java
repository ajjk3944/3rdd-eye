package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.zin.ouw.ouw;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra extends bly implements Handler.Callback {
    private int ex;
    int fkw;
    private int jae;
    private int jqy;
    private int ksc;

    /* renamed from: le, reason: collision with root package name */
    boolean f7972le;

    /* renamed from: lh, reason: collision with root package name */
    int f7973lh;

    /* renamed from: od, reason: collision with root package name */
    private boolean f7974od;
    boolean ouw;
    protected int ra;
    private boolean tc;
    private boolean vpp;
    long vt;
    int yu;
    private final Handler zin;

    public ra(ouw ouwVar) {
        super(ouwVar);
        this.zin = new Handler(this);
        this.ouw = false;
        this.vt = 0L;
        this.f7973lh = 0;
        this.yu = 0;
        this.fkw = 0;
        this.f7972le = false;
        this.vpp = false;
        this.jqy = 0;
        this.tc = false;
        this.ksc = 0;
        this.jae = 0;
        this.f7974od = false;
        od odVarOuw = od.ouw(this.tlj);
        this.ra = odVarOuw == null ? 0 : odVarOuw.f8247cf;
        this.yu = this.tlj.od();
        int iNjr = this.tlj.njr();
        this.fkw = iNjr;
        this.ksc = Math.max(0, this.yu - iNjr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jg() {
        int i4 = !this.tc ? this.fkw - this.f7973lh : this.fkw + this.jae;
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int i10 = com.bytedance.sdk.openadsdk.core.settings.cf.qbp(String.valueOf(this.ryl.f7961le)).f8455le;
        int i11 = this.yu;
        boolean z3 = false;
        boolean z10 = i11 <= 0 || (((float) i4) / ((float) i11)) * 100.0f >= ((float) i10);
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int iOuw = com.bytedance.sdk.openadsdk.core.settings.cf.ouw(String.valueOf(this.ryl.f7961le));
        com.bytedance.sdk.component.utils.ko.vt("RVIVPlayableNewManager", "tryRewardVerifyByOnlyPlayable: isPlayableWatchingRateOk = " + z10 + ",playedSecond =" + i4 + ",watchingRate =" + i10 + ",playableRewardType =" + iOuw);
        if (iOuw == 0) {
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.vm;
            boolean zFkw = ouwVar != null ? ouwVar.fkw() : false;
            if (this.ko) {
                zFkw = true;
            }
            if (z10 && zFkw) {
                z3 = true;
            }
        } else if (iOuw == 1) {
            z3 = z10;
        }
        if (z3) {
            this.ryl.fqk.ouw(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final boolean bly() {
        return this.f7972le;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void fkw() {
        if (this.f7936jg) {
            super.fkw();
            pno();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        od odVarOuw;
        if (message.what == 900 && this.pno && od.lh(this.ryl.vt) && !this.f7937th.get()) {
            int i4 = message.arg1;
            boolean z3 = false;
            if (this.tc) {
                int i10 = this.fkw;
                int i11 = this.jae;
                int i12 = i10 + i11;
                int i13 = this.yu;
                if (i12 < i13) {
                    this.jae = i11 + 1;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 900;
                    messageObtain.arg1 = 0;
                    this.zin.sendMessageDelayed(messageObtain, 1000L);
                } else {
                    this.jae = i13 - i10;
                }
            } else if (i4 > 0) {
                if (this.jqy == 0 && 2 == this.ra) {
                    z3 = true;
                }
                this.ryl.uoy.yu(true);
                if (!z3) {
                    this.ryl.uoy.ouw(String.valueOf(i4), null);
                }
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 900;
                int i14 = i4 - 1;
                messageObtain2.arg1 = i14;
                this.zin.sendMessageDelayed(messageObtain2, 1000L);
                this.f7973lh = i14;
                this.ex = i4;
            } else {
                this.f7972le = true;
                if (!od.pno(this.tlj) || ((odVarOuw = od.ouw(this.tlj)) != null && odVarOuw.tlj && this.vm.tlj)) {
                    this.ryl.uoy.yu(false);
                    this.ryl.f7967th.set(true);
                    this.ryl.coz.jg();
                } else {
                    this.ryl.uoy.vt();
                    this.ryl.uoy.fkw(true);
                }
                com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.vm;
                if (ouwVar == null || ouwVar.tlj) {
                    this.ko = true;
                }
                if (this.ksc > 0) {
                    this.tc = true;
                    this.jae++;
                    Message messageObtain3 = Message.obtain();
                    messageObtain3.what = 900;
                    messageObtain3.arg1 = 0;
                    this.zin.sendMessageDelayed(messageObtain3, 1000L);
                }
                this.ex = 0;
            }
            jg();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void le() {
        if (this.f7936jg && !this.rn) {
            super.le();
            this.zin.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void lh() throws JSONException {
        int i4;
        if (this.f7936jg) {
            boolean z3 = true;
            this.pno = true;
            com.bytedance.sdk.component.utils.ko.vt("RVIVPlayableNewManager", "showPlayable,countDownShowType =" + this.ra + ",mPlayableDurationTime =" + this.yu + ",mPlayableCloseTime=" + this.fkw);
            if (this.ryl.euf || (1 != (i4 = this.ra) && 2 != i4)) {
                z3 = false;
            }
            if (z3) {
                this.vm.rn = new ouw.InterfaceC0124ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.ra.2
                    @Override // com.bytedance.sdk.openadsdk.zin.ouw.ouw.InterfaceC0124ouw
                    public final void ouw(int i10) {
                        if (ra.this.f7974od) {
                            return;
                        }
                        ra.this.jqy = i10;
                        ra raVar = ra.this;
                        raVar.vm.rn = null;
                        raVar.vt(i10);
                    }
                };
            }
            this.vm.ouw();
            if (od.pno(this.tlj)) {
                this.ryl.bs.vt();
            }
            this.vt = System.currentTimeMillis();
            if (!z3) {
                vt(0);
            }
            this.ryl.fqk.zih();
            com.bytedance.sdk.openadsdk.component.reward.tlj tljVar = this.ryl.ycd;
            if (tljVar != null) {
                tljVar.ouw(this.yu);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void pno() {
        if (this.f7936jg) {
            this.vpp = true;
            this.zin.removeMessages(900);
            this.zin.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final int ra() {
        return this.ex;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void yu() {
        com.bytedance.sdk.openadsdk.core.widget.vt vtVar;
        if (this.f7936jg) {
            super.yu();
            if (DeviceUtils.ra() == 0) {
                this.ryl.f7958cj = true;
            }
            ouw ouwVar = this.ryl;
            if (ouwVar.f7958cj) {
                ouwVar.uoy.vt(true);
                lh(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar2 = this.ryl.coz;
            if ((vtVar2 == null || (vtVar = vtVar2.mwh) == null || !vtVar.isShowing()) && tlj() && this.f7973lh > 0) {
                ouw(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void ouw() {
        if (this.f7936jg && !this.mwh) {
            super.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final com.bytedance.sdk.openadsdk.mwh.le vt() {
        return new com.bytedance.sdk.openadsdk.mwh.le() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.ra.1
            @Override // com.bytedance.sdk.openadsdk.mwh.le
            public final void ouw() {
                ra.this.jg();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt(int i4) {
        ouw(this.fkw);
        if (this.vpp) {
            return;
        }
        Handler handler = this.zin;
        handler.sendMessage(handler.obtainMessage(900, this.fkw, i4));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void ouw(boolean z3) {
        AdSlot adSlot;
        com.bytedance.sdk.openadsdk.zin.ouw.vt vtVar;
        if (this.zih != null) {
            try {
                com.bytedance.sdk.openadsdk.zin.ouw.yu yuVarOuw = com.bytedance.sdk.openadsdk.zin.ouw.yu.ouw();
                vpp vppVar = this.tlj;
                FrameLayout frameLayout = this.zih;
                com.bytedance.sdk.openadsdk.mwh.le leVarVt = vt();
                com.bytedance.sdk.openadsdk.zin.ouw.vt vtVar2 = null;
                if (yuVarOuw.vt() && (adSlot = vppVar.yiz) != null && !TextUtils.isEmpty(adSlot.getBidAdm()) && od.le(vppVar) && frameLayout != null) {
                    String strUx = vppVar.ux();
                    if (!TextUtils.isEmpty(strUx)) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= yuVarOuw.vt.size()) {
                                i4 = -1;
                                vtVar = null;
                                break;
                            } else {
                                vtVar = yuVarOuw.vt.get(i4);
                                if (strUx.equals(vtVar.zin)) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        if (vtVar == null) {
                            com.bytedance.sdk.component.utils.ko.vt("PlayablePreRenderManager", "getPreRenderPlayable fail");
                        } else {
                            yuVarOuw.ouw.removeMessages(strUx.hashCode());
                            yuVarOuw.vt.remove(i4);
                            com.bytedance.sdk.component.utils.ko.ouw("PlayablePreRenderManager", "getPreRenderPlayable success, size:", Integer.valueOf(yuVarOuw.vt.size()));
                            vppVar.kn();
                            com.bytedance.sdk.component.utils.ko.vt("PlayablePreManager", "initPreRenderPlb");
                            vtVar.qbp = frameLayout;
                            frameLayout.addView(vtVar.f8876th);
                            vtVar.vm = leVarVt;
                            if (vtVar.zih) {
                                vtVar.vm.ouw();
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, uoy.lh(vppVar.yiz.getDurationSlotType()), "PL_use_pre_render");
                            vtVar2 = vtVar;
                        }
                    }
                }
                this.vm = vtVar2;
                vtVar2.ouw(this.ryl.fqk);
            } catch (Throwable th2) {
                th2.printStackTrace();
                qbp.lh("RVIVPlayableNewManager", "PreRender injection exception" + th2.getMessage());
            }
            if (this.vm == null) {
                super.ouw(z3);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void ouw(int i4) {
        this.f7973lh = i4;
        this.ex = i4;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void ouw(long j) {
        if (this.f7936jg && this.pno && !this.ryl.f7957cf.get() && this.vpp) {
            this.vpp = false;
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            messageObtain.arg1 = this.f7973lh;
            messageObtain.arg2 = this.jqy;
            this.zin.sendMessageDelayed(messageObtain, j);
        }
    }
}
