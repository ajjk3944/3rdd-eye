package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.u4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4470u4 extends AbstractC4410n {

    /* renamed from: c, reason: collision with root package name */
    private final C4324d f35491c;

    public C4470u4(C4324d c4324d) {
        super("internal.eventLogger");
        this.f35491c = c4324d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4410n
    public final InterfaceC4449s a(Z2 z22, List list) {
        AbstractC4354g2.g(this.f35402a, 3, list);
        String strZzf = z22.b((InterfaceC4449s) list.get(0)).zzf();
        long jA = (long) AbstractC4354g2.a(z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue());
        InterfaceC4449s interfaceC4449sB = z22.b((InterfaceC4449s) list.get(2));
        this.f35491c.c(strZzf, jA, interfaceC4449sB instanceof r ? AbstractC4354g2.e((r) interfaceC4449sB) : new HashMap());
        return InterfaceC4449s.f35450e0;
    }
}
