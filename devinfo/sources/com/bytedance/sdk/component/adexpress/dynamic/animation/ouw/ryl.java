package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl extends yu {
    public ryl(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    @SuppressLint({"ObjectAnimatorBinding"})
    public final List<ObjectAnimator> ouw() {
        int i4;
        int i10;
        this.yu.setTag(2097610711, Integer.valueOf(this.vt.f7298cf));
        View view = this.yu;
        if (view == null || !com.bytedance.sdk.component.adexpress.yu.vt.ouw(view.getContext())) {
            i4 = 0;
            i10 = 1;
        } else {
            i10 = 0;
            i4 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "shineValue", i4, i10).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        return arrayList;
    }
}
