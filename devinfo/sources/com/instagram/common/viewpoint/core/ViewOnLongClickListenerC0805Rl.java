package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnLongClickListenerC0805Rl implements View.OnLongClickListener {
    public final /* synthetic */ C1476hM A00;
    public final /* synthetic */ C1090b6 A01;

    public ViewOnLongClickListenerC0805Rl(C1476hM c1476hM, C1090b6 c1090b6) {
        this.A00 = c1476hM;
        this.A01 = c1090b6;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A00.A00 != null) {
            this.A01.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
            this.A01.A0D(!this.A01.A0E());
        }
        return true;
    }
}
