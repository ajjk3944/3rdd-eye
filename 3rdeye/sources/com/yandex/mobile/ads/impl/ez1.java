package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class ez1 {

    /* renamed from: a, reason: collision with root package name */
    private final pm0 f27130a;

    /* renamed from: b, reason: collision with root package name */
    private final nm0 f27131b;

    public ez1(pm0 viewHolderManager) {
        kotlin.jvm.internal.l.f(viewHolderManager, "viewHolderManager");
        this.f27130a = viewHolderManager;
        this.f27131b = new nm0();
    }

    public final void a() {
        bb2 adUiElements;
        bb2 adUiElements2;
        o70 o70VarB;
        o70 o70VarB2;
        om0 om0VarA = this.f27130a.a();
        if (om0VarA == null || (o70VarB2 = om0VarA.b()) == null) {
            adUiElements = null;
        } else {
            this.f27131b.getClass();
            adUiElements = o70VarB2.getAdUiElements();
        }
        TextView textViewM = adUiElements != null ? adUiElements.m() : null;
        if (textViewM != null) {
            textViewM.setVisibility(8);
        }
        om0 om0VarA2 = this.f27130a.a();
        if (om0VarA2 == null || (o70VarB = om0VarA2.b()) == null) {
            adUiElements2 = null;
        } else {
            this.f27131b.getClass();
            adUiElements2 = o70VarB.getAdUiElements();
        }
        View viewN = adUiElements2 != null ? adUiElements2.n() : null;
        if (viewN != null) {
            viewN.setVisibility(0);
            viewN.setEnabled(true);
        }
    }

    public final void a(long j4, long j10) {
        bb2 adUiElements;
        o70 o70VarB;
        om0 om0VarA = this.f27130a.a();
        if (om0VarA == null || (o70VarB = om0VarA.b()) == null) {
            adUiElements = null;
        } else {
            this.f27131b.getClass();
            adUiElements = o70VarB.getAdUiElements();
        }
        TextView textViewM = adUiElements != null ? adUiElements.m() : null;
        int i = ((int) ((j4 - j10) / 1000)) + 1;
        if (textViewM != null) {
            textViewM.setText(String.valueOf(i));
            textViewM.setVisibility(0);
        }
    }
}
