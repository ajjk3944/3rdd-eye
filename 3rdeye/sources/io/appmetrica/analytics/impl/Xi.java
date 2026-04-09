package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class Xi implements InterfaceC4804mo {

    /* renamed from: a, reason: collision with root package name */
    public final C4778lo f40394a = new C4778lo();

    @Override // io.appmetrica.analytics.impl.InterfaceC4804mo
    public final C4752ko a(Revenue revenue) {
        C4752ko c4752ko;
        C4778lo c4778lo = this.f40394a;
        C4564dg c4564dg = new C4564dg();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            c4752ko = new C4752ko(c4564dg, true, "");
        } else {
            c4752ko = new C4752ko(c4564dg, false, "Invalid quantity value " + num);
        }
        List<C4752ko> listAsList = Arrays.asList(c4752ko);
        c4778lo.getClass();
        return c4778lo.a(listAsList);
    }
}
