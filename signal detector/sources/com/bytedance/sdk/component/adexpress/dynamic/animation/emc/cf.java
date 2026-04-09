package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class cf extends dg {
    public cf(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        super(view, emcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg
    public List<ObjectAnimator> emc() {
        float f2;
        float fEmc = com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.ypw.ycc());
        float fEmc2 = com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.ypw.uym());
        float f5 = 0.0f;
        if ("reverse".equals(this.ypw.vk())) {
            f2 = fEmc2;
            fEmc2 = 0.0f;
            f5 = fEmc;
            fEmc = 0.0f;
        } else {
            f2 = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.dg.ypw.emc(this.xq.getContext())) {
            fEmc = -fEmc;
            f5 = -f5;
        }
        this.xq.setTranslationX(fEmc);
        this.xq.setTranslationY(fEmc2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "translationX", fEmc, f5).setDuration((int) (this.ypw.ru() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.xq, "translationY", fEmc2, f2).setDuration((int) (this.ypw.ru() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(emc(duration));
        arrayList.add(emc(duration2));
        return arrayList;
    }
}
