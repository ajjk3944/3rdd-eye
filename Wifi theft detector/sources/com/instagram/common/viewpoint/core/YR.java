package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;
import android.widget.EditText;

/* loaded from: assets/audience_network/classes2.dex */
public class YR implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C1137Pp A01;

    public YR(C1137Pp c1137Pp, EditText editText) {
        this.A01 = c1137Pp;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.A01.A03.execute(new Q1(this, dialogInterface));
    }
}
