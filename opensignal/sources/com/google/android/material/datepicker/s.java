package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class s implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f5631a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f5632d;

    public s(u uVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f5632d = uVar;
        this.f5631a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f5631a;
        r rVarA = materialCalendarGridView.a();
        if (i10 < rVarA.a() || i10 > rVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i10).longValue() >= ((DateValidatorPointForward) this.f5632d.f5636e.f5599a.f5605y0.f5574g).f5578a) {
            throw null;
        }
    }
}
