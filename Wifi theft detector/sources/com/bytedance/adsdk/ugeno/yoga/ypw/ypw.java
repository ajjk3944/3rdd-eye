package com.bytedance.adsdk.ugeno.yoga.ypw;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.gbl;
import com.bytedance.adsdk.ugeno.yoga.ru;
import com.bytedance.adsdk.ugeno.yoga.uym;
import com.bytedance.adsdk.ugeno.yoga.ypw.xq;

/* loaded from: classes.dex */
public class ypw extends ViewGroup {
    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof ypw) {
            throw null;
        }
        ru ruVarEmc = gbl.emc();
        xq.emc(new xq.emc(layoutParams), ruVarEmc, view);
        ruVarEmc.emc(view);
        ruVarEmc.emc((uym) new xq.ypw());
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof xq.emc;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new xq.emc(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new xq.emc(layoutParams);
    }

    public ru getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
