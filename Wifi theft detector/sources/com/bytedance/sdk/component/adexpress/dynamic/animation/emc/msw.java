package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class msw extends dg {
    public msw(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        super(view, emcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> emc() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.ypw.ru() * 1000.0d));
        ((ViewGroup) this.xq.getParent()).setClipChildren(false);
        ((ViewGroup) this.xq.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.xq.getParent().getParent().getParent()).setClipChildren(false);
        this.xq.setTag(2097610712, this.ypw.msw());
        ArrayList arrayList = new ArrayList();
        arrayList.add(emc(duration));
        return arrayList;
    }
}
