package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes3.dex */
public final class Fc extends AbstractC4598f {
    public Fc(Context context, Mg mg) {
        super(context, mg);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4598f
    public final void b(C4683i6 c4683i6, K4 k42) {
        boolean zBooleanValue = ((Boolean) WrapUtils.getOrDefault(k42.f39709b.f39670b, Boolean.FALSE)).booleanValue();
        InterfaceC4560dc interfaceC4560dcL = Ga.f39501F.l();
        interfaceC4560dcL.a(zBooleanValue);
        interfaceC4560dcL.a(k42.f39709b.f39671c);
        Boolean bool = k42.f39709b.f39681n;
        if (bool != null) {
            Ga.f39501F.b().b(bool.booleanValue());
        }
        this.f40831b.a(c4683i6, k42);
    }
}
