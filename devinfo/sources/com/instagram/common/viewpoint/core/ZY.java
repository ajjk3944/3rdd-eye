package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZY implements View.OnClickListener {
    public final /* synthetic */ C0997Zb A00;

    public ZY(C0997Zb c0997Zb) {
        this.A00 = c0997Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A05) {
                this.A00.A04.A53();
            } else {
                this.A00.A04.A54();
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
