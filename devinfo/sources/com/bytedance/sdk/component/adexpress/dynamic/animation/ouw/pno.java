package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends yu {
    public pno(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    @SuppressLint({"ObjectAnimatorBinding"})
    public final List<ObjectAnimator> ouw() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.vt.vt * 1000.0d));
        ((ViewGroup) this.yu.getParent()).setClipChildren(false);
        ((ViewGroup) this.yu.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.yu.getParent().getParent().getParent()).setClipChildren(false);
        this.yu.setTag(2097610712, this.vt.ko);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        return arrayList;
    }
}
