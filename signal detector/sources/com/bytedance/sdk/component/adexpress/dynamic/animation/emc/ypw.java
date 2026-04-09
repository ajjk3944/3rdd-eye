package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mkp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ypw implements mkp {
    List<dg> emc = new ArrayList();

    public ypw(View view, List<com.bytedance.sdk.component.adexpress.dynamic.dg.emc> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.dg.emc> it = list.iterator();
        while (it.hasNext()) {
            dg dgVarEmc = xq.emc().emc(view, it.next());
            if (dgVarEmc != null) {
                this.emc.add(dgVarEmc);
            }
        }
    }

    public void emc() {
        Iterator<dg> it = this.emc.iterator();
        while (it.hasNext()) {
            try {
                it.next().xq();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mkp
    public void ypw() {
        Iterator<dg> it = this.emc.iterator();
        while (it.hasNext()) {
            try {
                it.next().ypw();
            } catch (Exception unused) {
            }
        }
    }
}
