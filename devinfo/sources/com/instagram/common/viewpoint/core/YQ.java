package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;

/* loaded from: assets/audience_network/classes2.dex */
public class YQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C0759Pp A00;

    public YQ(C0759Pp c0759Pp) {
        this.A00 = c0759Pp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        dialogInterface.cancel();
    }
}
