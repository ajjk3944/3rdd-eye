package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: com.facebook.ads.redexgen.X.Xc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC2992Xc implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C2773Om A01;

    public DialogInterfaceOnClickListenerC2992Xc(C2773Om c2773Om, EditText editText) {
        this.A01 = c2773Om;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A01.A03.execute(new C2776Op(this, dialogInterface));
    }
}
