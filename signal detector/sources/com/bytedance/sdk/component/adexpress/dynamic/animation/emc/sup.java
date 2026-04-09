package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class sup extends dg {
    public sup(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        super(view, emcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> emc() {
        int i;
        int i3;
        this.xq.setTag(2097610711, Integer.valueOf(this.ypw.dg()));
        View view = this.xq;
        if (view == null || !com.bytedance.sdk.component.adexpress.dg.ypw.emc(view.getContext())) {
            i = 0;
            i3 = 1;
        } else {
            i3 = 0;
            i = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "shineValue", i, i3).setDuration((int) (this.ypw.ru() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(emc(duration));
        return arrayList;
    }
}
