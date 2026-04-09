package com.bytedance.sdk.openadsdk.xq;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.xq.dg;
import com.bytedance.sdk.openadsdk.xq.sup;
import java.util.List;

/* loaded from: classes.dex */
public class xq implements dr {
    private dr.emc bw;
    private boolean dg;
    public sup emc;
    private dg xq;
    private final Context ypw;

    public xq(Context context, String str, List<FilterWord> list, String str2, rie rieVar) {
        this.ypw = context;
        emc(str, list, str2, rieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg() {
        Context context = this.ypw;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.emc.isShowing()) {
            return;
        }
        this.emc.show();
    }

    private void emc(String str, List<FilterWord> list, String str2, rie rieVar) {
        this.xq = new dg(this.ypw, str, list);
        sup supVar = new sup(this.ypw, this.xq.getDislikeManager());
        this.emc = supVar;
        supVar.emc(str2, rieVar);
        this.emc.emc(new sup.emc() { // from class: com.bytedance.sdk.openadsdk.xq.xq.1
            @Override // com.bytedance.sdk.openadsdk.xq.sup.emc
            public void emc() {
            }

            @Override // com.bytedance.sdk.openadsdk.xq.sup.emc
            public void xq() {
                xq.this.emc();
            }

            @Override // com.bytedance.sdk.openadsdk.xq.sup.emc
            public void ypw() {
                xq.this.emc();
            }

            @Override // com.bytedance.sdk.openadsdk.xq.sup.emc
            public void emc(int i, FilterWord filterWord, String str3) {
                xq.this.xq.onSuggestionSubmit(str3);
                xq.this.emc();
            }
        });
        this.xq.emc(new dg.emc() { // from class: com.bytedance.sdk.openadsdk.xq.xq.2
            @Override // com.bytedance.sdk.openadsdk.xq.dg.emc
            public void emc() {
                xq.this.emc(true);
                if (xq.this.xq != null && xq.this.xq.isShowing()) {
                    xq.this.xq.hide();
                }
                xq.this.dg();
            }

            @Override // com.bytedance.sdk.openadsdk.xq.dg.emc
            public void ypw() {
                try {
                    if (xq.this.bw != null) {
                        xq.this.bw.emc();
                    }
                } catch (Throwable th) {
                    ul.emc("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.xq.dg.emc
            public void emc(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && xq.this.bw != null) {
                        xq.this.bw.emc(i, filterWord.getName());
                    }
                    filterWord.getName();
                } catch (Throwable unused) {
                }
            }
        });
    }

    public boolean xq() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.dr
    public void ypw() {
        dg dgVar = this.xq;
        if (dgVar != null) {
            dgVar.destroy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.dr
    public void emc() {
        Context context = this.ypw;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.xq.isShowing()) {
            return;
        }
        this.xq.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.dr
    public void emc(dr.emc emcVar) {
        this.bw = emcVar;
    }

    public void emc(String str) {
        dg dgVar = this.xq;
        if (dgVar != null) {
            dgVar.emc(str);
        }
    }

    public void emc(boolean z6) {
        this.dg = z6;
    }
}
