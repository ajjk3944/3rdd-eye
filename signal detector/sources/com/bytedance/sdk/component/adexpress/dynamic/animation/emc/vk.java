package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class vk extends dg {
    public vk(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        super(view, emcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg
    public List<ObjectAnimator> emc() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), 20.0f), 0.0f, -com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), 20.0f), 0.0f).setDuration((int) (this.ypw.ru() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(emc(duration));
        return arrayList;
    }
}
