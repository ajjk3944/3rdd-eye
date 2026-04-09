package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class emc extends dg {
    public emc(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        super(view, emcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg
    public List<ObjectAnimator> emc() {
        float fSba = this.ypw.sba() / 100.0f;
        float fYzg = this.ypw.yzg() / 100.0f;
        if ("reverse".equals(this.ypw.vk()) && this.ypw.qh() <= 0.0d) {
            fYzg = fSba;
            fSba = fYzg;
        }
        this.xq.setAlpha(fSba);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "alpha", fSba, fYzg).setDuration((int) (this.ypw.ru() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(emc(duration));
        return arrayList;
    }
}
