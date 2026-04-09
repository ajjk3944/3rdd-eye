package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h7.j1;

/* loaded from: classes.dex */
public final class h extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ m F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, int i10, int i11) {
        super(i10, false);
        this.F = mVar;
        this.E = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h7.y0
    public final void A0(RecyclerView recyclerView, int i10) {
        w wVar = new w(recyclerView.getContext(), 0);
        wVar.f10038a = i10;
        B0(wVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(j1 j1Var, int[] iArr) {
        int i10 = this.E;
        m mVar = this.F;
        if (i10 == 0) {
            iArr[0] = mVar.D0.getWidth();
            iArr[1] = mVar.D0.getWidth();
        } else {
            iArr[0] = mVar.D0.getHeight();
            iArr[1] = mVar.D0.getHeight();
        }
    }
}
