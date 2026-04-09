package com.bytedance.sdk.openadsdk.core.ra.ouw;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.vt.cf;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.model.ko;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends lh implements com.bytedance.sdk.component.adexpress.dynamic.le.ouw {
    protected WeakReference<View> ouw;
    private cf vt;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.le.ouw
    public final void ouw(cf cfVar) {
        this.vt = cfVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.le.ouw
    public final void ouw(View view) {
        this.ouw = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.lh
    public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (this.vt != null) {
            String strValueOf = "";
            try {
                int i4 = com.bytedance.sdk.component.adexpress.dynamic.ouw.zin;
                if (view.getTag(i4) != null) {
                    strValueOf = String.valueOf(view.getTag(i4));
                }
            } catch (Exception unused) {
            }
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.f8238le = f10;
            ouwVar.fkw = f11;
            ouwVar.yu = f12;
            ouwVar.f8239lh = f13;
            ouwVar.vt = this.uq;
            ouwVar.ouw = this.f8203pd;
            ko.ouw ouwVarOuw = ouwVar.ouw(sparseArray);
            ouwVarOuw.ko = this.osn;
            ouwVarOuw.pno = strValueOf;
            this.vt.ouw(view, iIntValue, ouwVarOuw.ouw());
        }
    }
}
