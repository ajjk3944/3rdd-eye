package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f20457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, int i4, int i10) {
        super(i4);
        this.f20457b = lVar;
        this.f20456a = i10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(t1 t1Var, int[] iArr) {
        int i4 = this.f20456a;
        l lVar = this.f20457b;
        if (i4 == 0) {
            iArr[0] = lVar.f20470g0.getWidth();
            iArr[1] = lVar.f20470g0.getWidth();
        } else {
            iArr[0] = lVar.f20470g0.getHeight();
            iArr[1] = lVar.f20470g0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f1
    public final void smoothScrollToPosition(RecyclerView recyclerView, t1 t1Var, int i4) {
        u uVar = new u(recyclerView.getContext());
        uVar.setTargetPosition(i4);
        startSmoothScroll(uVar);
    }
}
