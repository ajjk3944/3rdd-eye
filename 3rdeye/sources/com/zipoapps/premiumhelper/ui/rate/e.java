package com.zipoapps.premiumhelper.ui.rate;

import B2.r;
import B2.s;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.rate.f;
import h.m;
import i8.C4461a;
import kotlin.jvm.internal.l;
import va.a;
import w9.i;

/* compiled from: RateDialog.kt */
/* loaded from: classes3.dex */
public final class e extends m {

    /* renamed from: b, reason: collision with root package name */
    public f.a f37111b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37112c;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getInt("theme", -1) : -1) != -1) {
            setStyle(1, getTheme());
        }
    }

    @Override // h.m, androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k
    public final Dialog onCreateDialog(Bundle bundle) {
        a.b bVar = va.a.f47104a;
        bVar.o("PremiumHelper");
        bVar.g("Using layout R.layout.ph_default_dialog_rate for the rate dialog layout.Please set R.attr.rate_dialog_layout for styling the rate dialog or override the whole layout.", new Object[0]);
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.ph_default_dialog_rate, (ViewGroup) null);
        l.e(viewInflate, "inflate(...)");
        viewInflate.findViewById(R.id.rate_dialog_positive_button).setOnClickListener(new D8.e(this, 9));
        viewInflate.findViewById(R.id.rate_dialog_negative_button).setOnClickListener(new r(this, 8));
        View viewFindViewById = viewInflate.findViewById(R.id.rate_dialog_dismiss_button);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new s(this, 5));
        }
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        i<Object>[] iVarArr = C4461a.f38482n;
        C4461a.b type = C4461a.b.DIALOG;
        C4461a c4461a = eVarA.f37021k;
        c4461a.getClass();
        l.f(type, "type");
        c4461a.s("Rate_us_shown", G0.d.a(new b9.l("type", type.getValue())));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getActivity()).setView(viewInflate).create();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return alertDialogCreate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        l.f(dialog, "dialog");
        super.onDismiss(dialog);
        f.c cVar = this.f37112c ? f.c.DIALOG : f.c.NONE;
        f.a aVar = this.f37111b;
        if (aVar != null) {
            aVar.a(cVar);
        }
    }
}
