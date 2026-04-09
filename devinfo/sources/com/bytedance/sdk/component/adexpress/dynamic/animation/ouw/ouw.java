package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends yu {
    public ouw(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        float f10 = r0.zih / 100.0f;
        float f11 = r0.vm / 100.0f;
        if ("reverse".equals(this.vt.pno) && this.vt.f7300le <= 0.0d) {
            f11 = f10;
            f10 = f11;
        }
        this.yu.setAlpha(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "alpha", f10, f11).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        return arrayList;
    }
}
