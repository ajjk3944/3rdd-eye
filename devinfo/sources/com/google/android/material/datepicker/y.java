package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y extends t0 {

    /* renamed from: i, reason: collision with root package name */
    public final l f20510i;

    public y(l lVar) {
        this.f20510i = lVar;
    }

    @Override // androidx.recyclerview.widget.t0
    public final int getItemCount() {
        return this.f20510i.f20465b0.f20444f;
    }

    @Override // androidx.recyclerview.widget.t0
    public final void onBindViewHolder(x1 x1Var, int i4) {
        x xVar = (x) x1Var;
        l lVar = this.f20510i;
        int i10 = lVar.f20465b0.f20439a.f20492c + i4;
        xVar.f20509c.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i10)));
        TextView textView = xVar.f20509c;
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i10 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10)));
        c cVar = lVar.f20468e0;
        if (w.b().get(1) == i10) {
            b7.h hVar = cVar.f20446b;
        } else {
            b7.h hVar2 = cVar.f20445a;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.t0
    public final x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
