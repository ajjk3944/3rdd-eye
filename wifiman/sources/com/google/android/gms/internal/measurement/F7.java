package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class F7 extends AbstractC4410n {

    /* renamed from: c, reason: collision with root package name */
    private C4306b f35006c;

    public F7(C4306b c4306b) {
        super("internal.registerCallback");
        this.f35006c = c4306b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4410n
    public final InterfaceC4449s a(Z2 z22, List list) {
        AbstractC4354g2.g(this.f35402a, 3, list);
        String strZzf = z22.b((InterfaceC4449s) list.get(0)).zzf();
        InterfaceC4449s interfaceC4449sB = z22.b((InterfaceC4449s) list.get(1));
        if (!(interfaceC4449sB instanceof C4457t)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC4449s interfaceC4449sB2 = z22.b((InterfaceC4449s) list.get(2));
        if (!(interfaceC4449sB2 instanceof r)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        r rVar = (r) interfaceC4449sB2;
        if (!rVar.b("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f35006c.c(strZzf, rVar.b("priority") ? AbstractC4354g2.i(rVar.zza("priority").zze().doubleValue()) : 1000, (C4457t) interfaceC4449sB, rVar.zza("type").zzf());
        return InterfaceC4449s.f35450e0;
    }
}
