package com.google.android.material.datepicker;

import L0.InterfaceC0788t;
import L0.X;
import android.view.View;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes2.dex */
public final class s implements InterfaceC0788t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f22869c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22870d;

    public s(View view, int i, int i10) {
        this.f22868b = i;
        this.f22869c = view;
        this.f22870d = i10;
    }

    @Override // L0.InterfaceC0788t
    public final X d(View view, X x10) {
        int i = x10.f3850a.f(7).f802b;
        View view2 = this.f22869c;
        int i10 = this.f22868b;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f22870d + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return x10;
    }
}
