package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.g0;
import b4.C0344i;
import com.apm.insight.R;
import java.util.Locale;

/* loaded from: classes.dex */
public final class w extends G {

    /* renamed from: a, reason: collision with root package name */
    public final j f18342a;

    public w(j jVar) {
        this.f18342a = jVar;
    }

    @Override // androidx.recyclerview.widget.G
    public final int getItemCount() {
        return this.f18342a.f18282m0.f18264f;
    }

    @Override // androidx.recyclerview.widget.G
    public final void onBindViewHolder(g0 g0Var, int i) {
        v vVar = (v) g0Var;
        j jVar = this.f18342a;
        int i3 = jVar.f18282m0.f18259a.f18321c + i;
        vVar.f18341b.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i3)));
        TextView textView = vVar.f18341b;
        Context context = textView.getContext();
        textView.setContentDescription(u.b().get(1) == i3 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i3)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i3)));
        c cVar = jVar.f18285p0;
        if (u.b().get(1) == i3) {
            C0344i c0344i = cVar.f18267b;
        } else {
            C0344i c0344i2 = cVar.f18266a;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.G
    public final g0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new v((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
