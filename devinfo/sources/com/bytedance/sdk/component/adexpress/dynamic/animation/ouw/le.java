package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends yu {
    public le(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        float f10 = this.yu.getLayoutParams().width;
        this.yu.setTranslationX(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "translationX", f10, 0.0f).setDuration((int) (this.vt.vt * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.yu, "alpha", 0.0f, 1.0f).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        arrayList.add(ouw(duration2));
        return arrayList;
    }
}
