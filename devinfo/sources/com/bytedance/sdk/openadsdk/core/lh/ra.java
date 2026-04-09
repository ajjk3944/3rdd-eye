package com.bytedance.sdk.openadsdk.core.lh;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.utils.rn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ra extends lh {

    /* renamed from: lh, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.ryl.ouw f8206lh;
    private final String ouw;
    public lh vt;

    public ra(String str, com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar) {
        this(str, ouwVar, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.lh, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.lh
    public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) {
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar = this.f8206lh;
        if (ouwVar != null) {
            ouwVar.f8409cf = this.ouw;
        }
        if (view != null) {
            if (view.getId() == rn.f8721lh) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == rn.ra) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.ouw);
            }
        }
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.uq = this.uq;
            lhVar.f8203pd = this.f8203pd;
            lhVar.fvf = this.fvf;
            int i4 = this.fvf;
            lhVar.bs = i4;
            lhVar.fak = i4;
            lhVar.ouw(view, f10, f11, f12, f13, sparseArray, z3);
        }
    }

    public ra(String str, com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar, lh lhVar) {
        this.ouw = str;
        this.f8206lh = ouwVar;
        this.vt = lhVar;
    }
}
