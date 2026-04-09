package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4426p {
    public static InterfaceC4449s a(InterfaceC4402m interfaceC4402m, InterfaceC4449s interfaceC4449s, Z2 z22, List list) {
        if (interfaceC4402m.b(interfaceC4449s.zzf())) {
            InterfaceC4449s interfaceC4449sZza = interfaceC4402m.zza(interfaceC4449s.zzf());
            if (interfaceC4449sZza instanceof AbstractC4410n) {
                return ((AbstractC4410n) interfaceC4449sZza).a(z22, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC4449s.zzf()));
        }
        if (!"hasOwnProperty".equals(interfaceC4449s.zzf())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC4449s.zzf()));
        }
        AbstractC4354g2.g("hasOwnProperty", 1, list);
        return interfaceC4402m.b(z22.b((InterfaceC4449s) list.get(0)).zzf()) ? InterfaceC4449s.f35455j0 : InterfaceC4449s.f35456k0;
    }

    public static Iterator b(Map map) {
        return new C4418o(map.keySet().iterator());
    }
}
