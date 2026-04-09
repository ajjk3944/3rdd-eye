package com.google.android.recaptcha.internal;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzhy {
    private List zza = AbstractC3689v.l();

    public final long zza(long[] jArr) {
        Iterator it = AbstractC3689v.M0(this.zza, AbstractC3682n.c1(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = AbstractC3682n.c1(jArr);
    }
}
