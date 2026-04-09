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
        int i10;
        int i11;
        this.xq.setTag(2097610711, Integer.valueOf(this.ypw.dg()));
        View view = this.xq;
        if (view == null || !com.bytedance.sdk.component.adexpress.dg.ypw.emc(view.getContext())) {
            i10 = 0;
            i11 = 1;
        } else {
            i11 = 0;
            i10 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "shineValue", i10, i11).setDuration((int) (this.ypw.ru() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(emc(duration));
        return arrayList;
    }
}
