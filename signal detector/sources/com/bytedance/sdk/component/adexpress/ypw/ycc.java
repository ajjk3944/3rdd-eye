package com.bytedance.sdk.component.adexpress.ypw;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.ypw.ru;

/* loaded from: classes.dex */
public class ycc implements ru {
    private Context emc;
    private sz xq;
    private emc ypw;

    public ycc(Context context, sz szVar, emc emcVar) {
        this.emc = context;
        this.ypw = emcVar;
        this.xq = szVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru
    public void emc() {
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru
    public boolean emc(final ru.emc emcVar) {
        this.xq.bw().ycc();
        this.ypw.emc(new uym() { // from class: com.bytedance.sdk.component.adexpress.ypw.ycc.1
            @Override // com.bytedance.sdk.component.adexpress.ypw.uym
            public void emc(View view, qh qhVar) {
                if (emcVar.xq()) {
                    return;
                }
                cf cfVarYpw = emcVar.ypw();
                if (cfVarYpw != null) {
                    cfVarYpw.emc(ycc.this.ypw, qhVar);
                }
                emcVar.emc(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.ypw.uym
            public void emc(int i, String str) {
                cf cfVarYpw = emcVar.ypw();
                if (cfVarYpw != null) {
                    cfVarYpw.a_(i);
                }
            }
        });
        return true;
    }

    public void emc(xq xqVar) {
        this.ypw.emc(xqVar);
    }
}
