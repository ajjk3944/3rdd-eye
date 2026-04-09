package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import f.AbstractC5487d;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class M2 extends T2 {
    M2() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.T2
    public final void b() {
        if (!l()) {
            if (e() > 0) {
                AbstractC5487d.a(((N2) i(0)).a());
                throw null;
            }
            Iterator it = f().iterator();
            if (it.hasNext()) {
                AbstractC5487d.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.b();
    }
}
