package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.sf;

/* loaded from: classes.dex */
public class sup extends com.bytedance.sdk.openadsdk.core.ycc.xq {
    private Runnable bw;
    private long dg;
    protected gbl emc;
    private int msw;
    private boolean uym;
    private int xq;
    private Runnable ycc;
    protected boolean ypw;

    public sup(@NonNull Context context) {
        super(context);
        this.dg = 10L;
        this.ypw = true;
        this.uym = false;
        this.msw = 1;
        xq();
    }

    private void xq() {
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(int i10) {
        gbl gblVar = this.emc;
        if (gblVar != null) {
            gblVar.emc(i10);
        }
        if (i10 == 100 && this.ypw) {
            ypw();
        }
    }

    public gbl getLoadingStyle() {
        return this.emc;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xq(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.bw;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.bw = null;
        }
    }

    public void setOnlyLoading(boolean z10) {
        this.uym = z10;
    }

    private void xq(int i10) {
        if (this.msw != i10) {
            this.msw = i10;
        }
    }

    public void emc(rie rieVar) {
        com.bytedance.sdk.openadsdk.core.model.ylm ylmVarHxp;
        if (rieVar != null && (ylmVarHxp = rieVar.hxp()) != null) {
            this.dg = ylmVarHxp.emc();
        }
        gbl gblVar = new gbl(getContext());
        this.emc = gblVar;
        View viewEmc = gblVar.emc();
        if (viewEmc.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewEmc.getParent()).removeView(viewEmc);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewEmc.setLayoutParams(layoutParams);
        if (rieVar != null) {
            boolean zOug = rieVar.oug();
            com.bytedance.sdk.openadsdk.core.widget.aa aaVarYpw = this.emc.ypw();
            if (aaVarYpw != null) {
                if (!this.uym && !zOug) {
                    com.bytedance.sdk.openadsdk.core.model.sba sbaVarYa = (rieVar.ya() == null || TextUtils.isEmpty(rieVar.ya().emc())) ? null : rieVar.ya();
                    if (sbaVarYa != null && !TextUtils.isEmpty(sbaVarYa.emc())) {
                        try {
                            com.bytedance.sdk.openadsdk.ru.dg.emc(sbaVarYa).xq(1).emc(new com.bytedance.sdk.openadsdk.ru.ypw(rieVar, sbaVarYa.emc(), new sf(aaVarYpw)));
                        } catch (Throwable unused) {
                        }
                    } else {
                        aaVarYpw.setVisibility(8);
                    }
                } else {
                    aaVarYpw.setVisibility(8);
                }
            }
            com.bytedance.sdk.openadsdk.core.ycc.msw mswVarXq = this.emc.xq();
            if (mswVarXq != null) {
                if (!this.uym && !zOug) {
                    if (!TextUtils.isEmpty(rieVar.xou())) {
                        mswVarXq.setText(rieVar.xou());
                    } else {
                        mswVarXq.setVisibility(8);
                    }
                } else {
                    mswVarXq.setText("Loading");
                }
            }
        }
        addView(viewEmc);
        xq(getResources().getConfiguration().orientation);
    }

    public void ypw() {
        this.xq = 0;
        gbl gblVar = this.emc;
        if (gblVar != null) {
            removeView(gblVar.emc);
            this.emc.dg();
        }
        setVisibility(8);
        this.emc = null;
        Runnable runnable = this.bw;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.ycc;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.ycc = null;
        this.bw = null;
    }

    public void emc() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sup.1
            @Override // java.lang.Runnable
            public void run() {
                sup supVar = sup.this;
                if (supVar.emc != null) {
                    supVar.setVisibility(0);
                }
            }
        });
        if (this.bw == null) {
            this.bw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sup.2
                @Override // java.lang.Runnable
                public void run() {
                    sup.this.ypw();
                }
            };
        }
        postDelayed(this.bw, this.dg * 1000);
    }

    public void emc(int i10) {
        if (i10 == 100 || Math.abs(i10 - this.xq) >= 7) {
            this.xq = i10;
            if (d3.a.a()) {
                ypw(this.xq);
                return;
            }
            if (this.ycc == null) {
                this.ycc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sup.3
                    @Override // java.lang.Runnable
                    public void run() {
                        sup supVar = sup.this;
                        supVar.ypw(supVar.xq);
                    }
                };
            }
            post(this.ycc);
        }
    }
}
