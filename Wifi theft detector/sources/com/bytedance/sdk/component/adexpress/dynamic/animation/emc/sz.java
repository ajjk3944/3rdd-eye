package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class sz extends dg {
    public sz(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        super(view, emcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg
    public List<ObjectAnimator> emc() {
        View view = this.xq;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gbl)) {
            View view2 = (View) this.xq.getParent();
            this.xq = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.xq.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.ypw.ru() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(emc(duration));
        return arrayList;
    }
}
