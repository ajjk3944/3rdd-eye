package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.ksc;
import com.bytedance.sdk.openadsdk.utils.osn;
import nh.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class mwh extends com.bytedance.sdk.openadsdk.core.le.lh {
    private Runnable fkw;

    /* renamed from: le, reason: collision with root package name */
    private Runnable f7838le;

    /* renamed from: lh, reason: collision with root package name */
    private int f7839lh;
    protected ryl ouw;
    private int pno;
    private boolean ra;
    protected boolean vt;
    private long yu;

    public mwh(Context context) {
        super(context);
        this.yu = 10L;
        this.vt = true;
        this.ra = false;
        this.pno = 1;
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    private void lh(int i4) {
        if (this.pno != i4) {
            this.pno = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt(int i4) {
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            rylVar.ouw(i4);
        }
        if (i4 == 100 && this.vt) {
            vt();
        }
    }

    public ryl getLoadingStyle() {
        return this.ouw;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        lh(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.fkw;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.fkw = null;
        }
    }

    public void setOnlyLoading(boolean z3) {
        this.ra = z3;
    }

    public void ouw() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.mwh.1
            @Override // java.lang.Runnable
            public final void run() {
                mwh mwhVar = mwh.this;
                if (mwhVar.ouw != null) {
                    mwhVar.setVisibility(0);
                }
            }
        });
        if (this.fkw == null) {
            this.fkw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.mwh.2
                @Override // java.lang.Runnable
                public final void run() {
                    mwh.this.vt();
                }
            };
        }
        postDelayed(this.fkw, this.yu * 1000);
    }

    public final void vt() {
        this.f7839lh = 0;
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            removeView(rylVar.ouw);
            this.ouw.vt();
        }
        setVisibility(8);
        this.ouw = null;
        Runnable runnable = this.fkw;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f7838le;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.f7838le = null;
        this.fkw = null;
    }

    public final void ouw(int i4) {
        if (i4 == 100 || Math.abs(i4 - this.f7839lh) >= 7) {
            this.f7839lh = i4;
            if (a.o()) {
                vt(this.f7839lh);
                return;
            }
            if (this.f7838le == null) {
                this.f7838le = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.mwh.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        mwh mwhVar = mwh.this;
                        mwhVar.vt(mwhVar.f7839lh);
                    }
                };
            }
            post(this.f7838le);
        }
    }

    public final void ouw(vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.qbp qbpVar;
        if (vppVar != null && (qbpVar = vppVar.kq) != null) {
            this.yu = qbpVar.ouw;
        }
        ryl rylVar = new ryl(getContext());
        this.ouw = rylVar;
        View viewOuw = rylVar.ouw();
        if (viewOuw.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewOuw.getParent()).removeView(viewOuw);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewOuw.setLayoutParams(layoutParams);
        if (vppVar != null) {
            boolean zZin = vppVar.zin();
            com.bytedance.sdk.openadsdk.core.widget.zih zihVar = this.ouw.f7846lh;
            if (zihVar != null) {
                if (!this.ra && !zZin) {
                    com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = vppVar.fak;
                    com.bytedance.sdk.openadsdk.core.model.zih zihVar3 = (zihVar2 == null || TextUtils.isEmpty(zihVar2.ouw)) ? null : vppVar.fak;
                    if (zihVar3 != null && !TextUtils.isEmpty(zihVar3.ouw)) {
                        try {
                            yu.ouw.ouw(yu.ouw.vt.ouw(zihVar3.ouw).ouw(zihVar3.vt).vt(zihVar3.f8323lh).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).ouw(zihVar3.f8322le)).lh(1).vt(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, zihVar3.ouw, new ksc(zihVar)));
                        } catch (Throwable unused) {
                        }
                    } else {
                        zihVar.setVisibility(8);
                    }
                } else {
                    zihVar.setVisibility(8);
                }
            }
            com.bytedance.sdk.openadsdk.core.le.pno pnoVar = this.ouw.yu;
            if (pnoVar != null) {
                if (!this.ra && !zZin) {
                    if (!TextUtils.isEmpty(vppVar.fqk)) {
                        pnoVar.setText(vppVar.fqk);
                    } else {
                        pnoVar.setVisibility(8);
                    }
                } else {
                    pnoVar.setText("Loading");
                }
            }
        }
        addView(viewOuw);
        lh(getResources().getConfiguration().orientation);
    }
}
