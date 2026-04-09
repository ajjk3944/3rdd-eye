package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.aF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3081aF implements View.OnClickListener {
    public final /* synthetic */ C3084aI A00;

    public ViewOnClickListenerC3081aF(C3084aI c3084aI) {
        this.A00 = c3084aI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05.AE7();
            if (this.A00.A00 != null) {
                XP.A0J(this.A00.A00);
            }
            Iterator it = this.A00.A07.iterator();
            while (it.hasNext()) {
                XP.A0L((View) it.next(), 0);
            }
            XP.A0H(this.A00);
            if (this.A00.A06 == null) {
                return;
            }
            XP.A0L(this.A00.A06, 0);
            this.A00.A06.A0h(EnumC3288db.A02, 14);
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
