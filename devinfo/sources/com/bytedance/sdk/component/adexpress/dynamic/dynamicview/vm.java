package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vm extends le {
    public vt ouw;

    public vm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final GradientDrawable getDrawable() {
        vt vtVar = new vt();
        this.ouw = vtVar;
        return vtVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final vt ouw(Bitmap bitmap) {
        ouw ouwVar = new ouw(bitmap, this.ouw);
        this.ouw = ouwVar;
        return ouwVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        return super.ra();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final GradientDrawable ouw(GradientDrawable.Orientation orientation, int[] iArr) {
        vt vtVar = new vt(orientation, iArr);
        this.ouw = vtVar;
        return vtVar;
    }
}
