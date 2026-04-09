package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f18277b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, int i, int i3) {
        super(i, false);
        this.f18277b = jVar;
        this.f18276a = i3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(d0 d0Var, int[] iArr) {
        int i = this.f18276a;
        j jVar = this.f18277b;
        if (i == 0) {
            iArr[0] = jVar.f18287r0.getWidth();
            iArr[1] = jVar.f18287r0.getWidth();
        } else {
            iArr[0] = jVar.f18287r0.getHeight();
            iArr[1] = jVar.f18287r0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.Q
    public final void smoothScrollToPosition(RecyclerView recyclerView, d0 d0Var, int i) {
        s sVar = new s(recyclerView.getContext());
        sVar.setTargetPosition(i);
        startSmoothScroll(sVar);
    }
}
