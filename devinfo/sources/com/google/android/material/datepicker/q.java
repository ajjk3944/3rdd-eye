package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f20501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f20502b;

    public q(s sVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f20502b = sVar;
        this.f20501a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f20501a;
        p pVarA = materialCalendarGridView.a();
        if (i4 < pVarA.a() || i4 > pVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i4).longValue() >= ((l) this.f20502b.j.f31385a).f20465b0.f20441c.f20447a) {
            throw null;
        }
    }
}
