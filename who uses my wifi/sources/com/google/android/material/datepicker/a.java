package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.cc0;
import defpackage.xe0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView f;
    public final /* synthetic */ c g;

    public a(c cVar, MaterialCalendarGridView materialCalendarGridView) {
        this.g = cVar;
        this.f = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f;
        xe0 xe0VarA = materialCalendarGridView.a();
        if (i < xe0VarA.a() || i > xe0VarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((cc0) this.g.j.g).b0.h.f) {
            throw null;
        }
    }
}
