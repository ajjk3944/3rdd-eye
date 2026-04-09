package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ycc extends dg {
    public ycc(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        super(view, emcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg
    public List<ObjectAnimator> emc() {
        float f10 = this.xq.getLayoutParams().width;
        this.xq.setTranslationX(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "translationX", f10, 0.0f).setDuration((int) (this.ypw.ru() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.xq, "alpha", 0.0f, 1.0f).setDuration((int) (this.ypw.ru() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(emc(duration));
        arrayList.add(emc(duration2));
        return arrayList;
    }
}
