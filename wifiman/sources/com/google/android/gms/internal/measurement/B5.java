package com.google.android.gms.internal.measurement;

import f.AbstractC5487d;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class B5 extends AbstractC4503y5 {
    B5() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4503y5
    public final void p() {
        if (!r()) {
            if (b() > 0) {
                AbstractC5487d.a(h(0).getKey());
                throw null;
            }
            Iterator it = i().iterator();
            if (it.hasNext()) {
                AbstractC5487d.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.p();
    }
}
