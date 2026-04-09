package com.bytedance.sdk.openadsdk.ylm.emc;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.sz.ycc;
import com.bytedance.sdk.openadsdk.utils.vw;
import org.json.JSONException;

/* loaded from: classes.dex */
public class ypw extends emc {
    private FrameLayout bw;
    private final FrameLayout dg;
    private ycc xq;
    private String ycc;
    private volatile boolean ypw;

    public ypw(Context context, rie rieVar, int i, boolean z6, FrameLayout frameLayout, String str) {
        super(context, rieVar, i, z6, frameLayout);
        this.dg = frameLayout;
        this.ycc = str;
        ypw(false);
        int iXq = vw.xq(context);
        int iBw = vw.bw(context);
        if (i == 1) {
            if (iXq <= iBw) {
                this.emc.layout(0, 0, iXq, iBw);
                return;
            }
        } else {
            if (i != 2) {
                return;
            }
            if (iXq > iBw) {
                this.emc.layout(0, 0, iXq, iBw);
                return;
            }
        }
        this.emc.layout(0, 0, iBw, iXq);
    }

    public void msw() {
        super.emc(true, new ycc() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.ypw.1
            @Override // com.bytedance.sdk.openadsdk.sz.ycc
            public void emc() {
                if (ypw.this.xq != null) {
                    ypw.this.xq.emc();
                } else {
                    ypw.this.ypw = true;
                }
            }
        });
    }

    public String zz() {
        return this.ycc;
    }

    public void emc(FrameLayout frameLayout, ycc yccVar) {
        this.bw = frameLayout;
        frameLayout.addView(this.dg);
        this.xq = yccVar;
        if (this.ypw) {
            this.xq.emc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ylm.emc.emc
    public void emc() throws JSONException {
        this.bw.setVisibility(0);
        super.emc();
    }
}
