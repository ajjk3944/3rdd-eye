package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class gbl extends dg {
    public gbl(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        super(view, emcVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg
    public List<ObjectAnimator> emc() {
        float f2;
        float fGbl = (float) this.ypw.gbl();
        float fSup = (float) this.ypw.sup();
        String strVk = this.ypw.vk();
        float f5 = 1.0f;
        if ("reverse".equals(strVk) || "alternate-reverse".equals(strVk)) {
            f2 = 1.0f;
        } else {
            f2 = fSup;
            fSup = 1.0f;
            f5 = fGbl;
            fGbl = 1.0f;
        }
        this.xq.setTag(2097610710, this.ypw.ypw());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "scaleX", fGbl, f5).setDuration((int) (this.ypw.ru() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.xq, "scaleY", fSup, f2).setDuration((int) (this.ypw.ru() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(emc(duration));
        arrayList.add(emc(duration2));
        return arrayList;
    }
}
