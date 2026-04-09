package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.j;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class o implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f22833b;

    public o(j jVar) {
        this.f22833b = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.f22833b;
        j.d dVar = jVar.f22815h;
        j.d dVar2 = j.d.YEAR;
        if (dVar == dVar2) {
            jVar.e(j.d.DAY);
        } else if (dVar == j.d.DAY) {
            jVar.e(dVar2);
        }
    }
}
