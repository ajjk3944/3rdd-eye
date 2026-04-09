package com.mbridge.msdk.video.module.listener.impl;

import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public class m extends o {
    private Timer A;
    private Handler B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private MBridgeVideoView.u H;

    /* renamed from: x, reason: collision with root package name */
    private MBridgeVideoView f19204x;

    /* renamed from: y, reason: collision with root package name */
    private MBridgeContainerView f19205y;

    /* renamed from: z, reason: collision with root package name */
    private int f19206z;

    public class a extends TimerTask {

        /* renamed from: com.mbridge.msdk.video.module.listener.impl.m$a$a, reason: collision with other inner class name */
        public class RunnableC0344a implements Runnable {
            public RunnableC0344a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m.this.f19205y.showVideoClickView(-1);
                m.this.f19204x.soundOperate(0, 2);
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                m.this.B.post(new RunnableC0344a());
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }

    public m(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i10, int i11, com.mbridge.msdk.video.module.listener.a aVar2, int i12, boolean z10, int i13) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i12, z10);
        this.B = new Handler();
        this.C = false;
        this.D = false;
        this.E = false;
        this.f19204x = mBridgeVideoView;
        this.f19205y = mBridgeContainerView;
        this.G = i10;
        this.f19206z = i11;
        this.F = i13;
        if (mBridgeVideoView != null) {
            this.C = mBridgeVideoView.getVideoSkipTime() == 0;
        }
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f19187a = false;
        }
    }

    private void n() {
        try {
            Timer timer = this.A;
            if (timer != null) {
                timer.cancel();
                this.A = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void o() {
        if (!this.D && this.F == 1) {
            j();
            h();
            i();
            if (s0.a().a("i_l_s_t_r_i", false) && !this.E) {
                this.E = true;
                MBridgeVideoView.u uVar = this.H;
                if (uVar != null) {
                    uVar.a();
                }
            }
        }
        if (this.f19188b.getAdSpaceT() != 2) {
            this.f19205y.showEndcard(this.f19188b.getVideo_end_type());
        } else {
            this.f19205y.showVideoEndCover();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void p() {
        /*
            r4 = this;
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r4.f19188b
            if (r0 == 0) goto L70
            int r0 = r0.getDynamicTempCode()
            r1 = 5
            if (r0 != r1) goto L70
            com.mbridge.msdk.video.module.MBridgeVideoView r0 = r4.f19204x
            if (r0 == 0) goto L5c
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r0.mCampOrderViewData
            if (r0 == 0) goto L5c
            r0 = 0
            r1 = r0
        L15:
            com.mbridge.msdk.video.module.MBridgeVideoView r2 = r4.f19204x
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r2.mCampOrderViewData
            int r2 = r2.size()
            if (r1 >= r2) goto L45
            com.mbridge.msdk.video.module.MBridgeVideoView r2 = r4.f19204x
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r2.mCampOrderViewData
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L42
            com.mbridge.msdk.video.module.MBridgeVideoView r2 = r4.f19204x
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r2.mCampOrderViewData
            java.lang.Object r2 = r2.get(r1)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2
            java.lang.String r2 = r2.getId()
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r4.f19188b
            java.lang.String r3 = r3.getId()
            if (r2 != r3) goto L42
            int r0 = r1 + (-1)
            goto L45
        L42:
            int r1 = r1 + 1
            goto L15
        L45:
            if (r0 < 0) goto L5c
            com.mbridge.msdk.video.module.MBridgeVideoView r1 = r4.f19204x
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r1.mCampOrderViewData
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L5c
            com.mbridge.msdk.video.module.MBridgeVideoView r1 = r4.f19204x
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r1.mCampOrderViewData
            java.lang.Object r0 = r1.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            goto L5d
        L5c:
            r0 = 0
        L5d:
            if (r0 == 0) goto L70
            com.mbridge.msdk.video.module.MBridgeVideoView r1 = r4.f19204x
            if (r1 == 0) goto L66
            r1.setCampaign(r0)
        L66:
            com.mbridge.msdk.video.module.MBridgeContainerView r1 = r4.f19205y
            if (r1 == 0) goto L6d
            r1.setCampaign(r0)
        L6d:
            r4.a(r0)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.listener.impl.m.p():void");
    }

    private void q() {
        try {
            n();
            this.A = new Timer();
            this.A.schedule(new a(), 3000L);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0321  */
    @Override // com.mbridge.msdk.video.module.listener.impl.o, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.listener.impl.m.a(int, java.lang.Object):void");
    }

    private void a(int i10, int i11) {
        CampaignEx campaignEx;
        if (this.C || this.f19204x == null || (campaignEx = this.f19188b) == null) {
            return;
        }
        int i12 = this.f19206z;
        int i13 = (i12 < 0 || i10 < i12) ? 1 : 2;
        if (i13 != 2 && (campaignEx.getVideoCompleteTime() != 0 ? i10 > this.f19188b.getVideoCompleteTime() : this.f19204x.mCurrPlayNum > 1)) {
            i13 = 2;
        }
        if (i13 != 2 && this.f19204x.mCurrPlayNum > 1 && i10 == i11) {
            i13 = 2;
        }
        if (i13 == 2) {
            this.f19204x.closeVideoOperate(0, i13);
            this.C = true;
        }
    }
}
