package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
final class O6 extends AbstractC4410n {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ InterfaceC4417n6 f35090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O6(C4424o5 c4424o5, String str, InterfaceC4417n6 interfaceC4417n6) {
        super(str);
        this.f35090c = interfaceC4417n6;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4410n
    public final InterfaceC4449s a(Z2 z22, List list) {
        AbstractC4354g2.g("getValue", 2, list);
        InterfaceC4449s interfaceC4449sB = z22.b((InterfaceC4449s) list.get(0));
        InterfaceC4449s interfaceC4449sB2 = z22.b((InterfaceC4449s) list.get(1));
        String strZza = this.f35090c.zza(interfaceC4449sB.zzf());
        return strZza != null ? new C4465u(strZza) : interfaceC4449sB2;
    }
}
