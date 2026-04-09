package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class o implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f18331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f18332b;

    public o(q qVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f18332b = qVar;
        this.f18331a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        MaterialCalendarGridView materialCalendarGridView = this.f18331a;
        n nVarA = materialCalendarGridView.a();
        if (i < nVarA.a() || i > nVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((j) this.f18332b.f18336b.f73b).f18282m0.f18261c.f18268a) {
            throw null;
        }
    }
}
