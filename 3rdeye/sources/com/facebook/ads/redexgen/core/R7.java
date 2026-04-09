package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class R7 implements View.OnLongClickListener {
    public final /* synthetic */ C3425fq A00;
    public final /* synthetic */ C3054Zm A01;

    public R7(C3425fq c3425fq, C3054Zm c3054Zm) {
        this.A00 = c3425fq;
        this.A01 = c3054Zm;
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
