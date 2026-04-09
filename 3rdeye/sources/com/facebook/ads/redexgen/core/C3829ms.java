package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.ms, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3829ms implements C9U {
    @Override // com.facebook.ads.redexgen.core.C9U
    public final /* synthetic */ C9T AGJ(C9P c9p, C3949or c3949or) {
        return C9R.A00(this, c9p, c3949or);
    }

    @Override // com.facebook.ads.redexgen.core.C9U
    public final /* synthetic */ void AGK() {
    }

    @Override // com.facebook.ads.redexgen.core.C9U
    public final C9G A34(C9P c9p, C3949or c3949or) {
        if (c3949or.A0O == null) {
            return null;
        }
        final int i = 1;
        return new C3827mq(new C9E(new Exception(i) { // from class: com.facebook.ads.redexgen.X.9z
            public final int A00;

            {
                this.A00 = i;
            }
        }, AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.facebook.ads.redexgen.core.C9U
    public final int A7O(C3949or c3949or) {
        return c3949or.A0O != null ? 1 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.C9U
    public final void AIu(Looper looper, C23517m c23517m) {
    }
}
