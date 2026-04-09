package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.xq.ru;
import com.bytedance.sdk.openadsdk.xq.sup;

/* loaded from: classes.dex */
public class aa extends com.bytedance.sdk.openadsdk.core.ycc.xq implements ru.ypw {
    private String bw;
    private Context dg;
    private View emc;
    private final com.bytedance.sdk.openadsdk.xq.ru uym;
    private emc xq;
    private boolean ycc;
    private rie ypw;

    public interface emc {
        void emc(View view);

        void emc(FilterWord filterWord);

        void ypw(View view);
    }

    public aa(Context context, rie rieVar) {
        this(context.getApplicationContext());
        this.ypw = rieVar;
        this.dg = context;
        dg();
        bw();
    }

    private void bw() {
        com.bytedance.sdk.openadsdk.xq.ru ruVar;
        rie rieVar = this.ypw;
        if (rieVar == null || (ruVar = this.uym) == null) {
            return;
        }
        ruVar.emc(rieVar.pz());
    }

    private void dg() {
        this.uym.emc(this.ypw.wdp());
        this.uym.emc(this);
    }

    private sup.emc ycc() {
        return new sup.emc() { // from class: com.bytedance.sdk.openadsdk.common.aa.2
            @Override // com.bytedance.sdk.openadsdk.xq.sup.emc
            public void emc() {
                aa.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.xq.sup.emc
            public void xq() {
                aa.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.xq.sup.emc
            public void ypw() {
                aa.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.xq.sup.emc
            public void emc(int i, FilterWord filterWord, String str) {
                aa.this.uym.xq(str);
                aa.this.setVisibility(0);
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.xq.ru ruVar = this.uym;
        if (ruVar != null) {
            ruVar.emc();
        }
    }

    public void setCallback(emc emcVar) {
        this.xq = emcVar;
    }

    public void setDislikeSource(String str) {
        this.bw = str;
        this.uym.ypw(str);
    }

    public void xq() {
        Context context = this.dg;
        if (context instanceof Activity) {
            boolean zIsFinishing = ((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.xq.sup supVar = new com.bytedance.sdk.openadsdk.xq.sup(this.dg, this.uym);
            supVar.emc(ycc());
            supVar.emc("", this.ypw);
            if (zIsFinishing || supVar.isShowing()) {
                return;
            }
            supVar.show();
        }
    }

    public void ypw() {
        setVisibility(8);
        this.ycc = false;
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.ypw(this);
        }
    }

    private void emc(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.aa.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (aa.this.uym != null) {
                    aa.this.uym.bw();
                } else {
                    aa.this.ypw();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.emc = new com.bytedance.sdk.openadsdk.xq.zz(context, this.uym);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = vw.ypw(getContext(), 20.0f);
        layoutParams.rightMargin = vw.ypw(getContext(), 20.0f);
        this.emc.setLayoutParams(layoutParams);
        this.emc.setClickable(true);
        bw();
    }

    public aa(Context context) {
        this(context, (AttributeSet) null);
    }

    public aa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public aa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ycc = false;
        this.uym = new com.bytedance.sdk.openadsdk.xq.ru();
        emc(context, attributeSet);
    }

    public void emc() {
        if (this.emc.getParent() == null) {
            addView(this.emc);
        }
        setVisibility(0);
        this.ycc = true;
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.emc(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.xq.ru.ypw
    public void emc(int i) {
        if (com.bytedance.sdk.openadsdk.xq.ru.ypw == i) {
            FilterWord filterWordYpw = this.uym.ypw();
            if (filterWordYpw == null || com.bytedance.sdk.openadsdk.xq.ru.emc.equals(filterWordYpw)) {
                return;
            }
            emc emcVar = this.xq;
            if (emcVar != null) {
                try {
                    emcVar.emc(filterWordYpw);
                } catch (Throwable unused) {
                }
            }
            ypw();
            return;
        }
        if (com.bytedance.sdk.openadsdk.xq.ru.xq == i) {
            ypw();
        } else if (com.bytedance.sdk.openadsdk.xq.ru.bw == i) {
            xq();
        }
    }
}
