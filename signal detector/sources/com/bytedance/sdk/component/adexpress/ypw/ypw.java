package com.bytedance.sdk.component.adexpress.ypw;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.ypw.ru;

/* loaded from: classes.dex */
public class ypw implements ru {
    private sz bw;
    private msw dg;
    private Context emc;
    private ThemeStatusBroadcastReceiver xq;
    private int ycc;
    private com.bytedance.sdk.component.adexpress.dynamic.emc.emc ypw;

    public ypw(Context context, sz szVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z6, com.bytedance.sdk.component.adexpress.dynamic.bw.msw mswVar, msw mswVar2, com.bytedance.sdk.component.adexpress.dynamic.ycc.emc emcVar, com.bytedance.sdk.component.adexpress.dynamic.emc.emc emcVar2) {
        this.emc = context;
        this.bw = szVar;
        this.xq = themeStatusBroadcastReceiver;
        this.dg = mswVar2;
        if (emcVar2 != null) {
            this.ypw = emcVar2;
        } else {
            this.ypw = new com.bytedance.sdk.component.adexpress.dynamic.emc.emc(context, themeStatusBroadcastReceiver, z6, mswVar, szVar, emcVar);
        }
        this.ypw.emc(this.dg);
        if (mswVar instanceof com.bytedance.sdk.component.adexpress.dynamic.bw.uym) {
            this.ycc = 3;
        } else {
            this.ycc = 2;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru
    public boolean emc(final ru.emc emcVar) {
        this.bw.bw().emc(this.ycc);
        this.ypw.emc(new uym() { // from class: com.bytedance.sdk.component.adexpress.ypw.ypw.1
            @Override // com.bytedance.sdk.component.adexpress.ypw.uym
            public void emc(View view, qh qhVar) {
                if (emcVar.xq()) {
                    return;
                }
                ypw.this.bw.bw().bw(ypw.this.ycc);
                ypw.this.bw.bw().ycc(ypw.this.ycc);
                ypw.this.bw.bw().ru();
                cf cfVarYpw = emcVar.ypw();
                if (cfVarYpw == null) {
                    return;
                }
                cfVarYpw.emc(ypw.this.ypw, qhVar);
                emcVar.emc(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.ypw.uym
            public void emc(int i, String str) {
                ypw.this.bw.bw().emc(ypw.this.ycc, i, str, emcVar.ypw(ypw.this));
                if (emcVar.ypw(ypw.this)) {
                    emcVar.emc(ypw.this);
                    return;
                }
                cf cfVarYpw = emcVar.ypw();
                if (cfVarYpw == null) {
                    return;
                }
                cfVarYpw.a_(i);
            }
        });
        return true;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.dg ypw() {
        com.bytedance.sdk.component.adexpress.dynamic.emc.emc emcVar = this.ypw;
        if (emcVar != null) {
            return emcVar.dg();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru
    public void emc() {
        com.bytedance.sdk.component.adexpress.dynamic.emc.emc emcVar = this.ypw;
        if (emcVar != null) {
            emcVar.ypw();
        }
    }
}
