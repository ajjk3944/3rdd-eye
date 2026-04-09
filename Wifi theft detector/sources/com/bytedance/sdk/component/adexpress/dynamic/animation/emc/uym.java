package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class uym extends dg {
    public uym(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        super(view, emcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> emc() {
        this.xq.setTag(2097610709, Integer.valueOf(this.ypw.xq()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.ypw.ru() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(emc(duration));
        return arrayList;
    }
}
