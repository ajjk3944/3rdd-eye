package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import h7.n1;
import h7.q0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a0 extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final m f5586d;

    public a0(m mVar) {
        this.f5586d = mVar;
    }

    @Override // h7.q0
    public final int b() {
        return this.f5586d.f5605y0.f5577y;
    }

    @Override // h7.q0
    public final void j(n1 n1Var, int i10) {
        m mVar = this.f5586d;
        int i11 = mVar.f5605y0.f5572a.f5582g + i10;
        TextView textView = ((z) n1Var).f5641u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        Context context = textView.getContext();
        textView.setContentDescription(y.b().get(1) == i11 ? String.format(context.getString(ed.j.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11)) : String.format(context.getString(ed.j.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11)));
        d dVar = mVar.B0;
        if (y.b().get(1) == i11) {
            c cVar = dVar.f5590b;
        } else {
            c cVar2 = dVar.f5589a;
        }
        throw null;
    }

    @Override // h7.q0
    public final n1 k(ViewGroup viewGroup, int i10) {
        return new z((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ed.h.mtrl_calendar_year, viewGroup, false));
    }
}
