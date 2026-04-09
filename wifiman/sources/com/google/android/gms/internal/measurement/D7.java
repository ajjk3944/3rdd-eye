package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class D7 extends AbstractC4410n {

    /* renamed from: c, reason: collision with root package name */
    private boolean f34985c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34986d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ A7 f34987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(A7 a72, boolean z10, boolean z11) {
        super("log");
        this.f34987e = a72;
        this.f34985c = z10;
        this.f34986d = z11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4410n
    public final InterfaceC4449s a(Z2 z22, List list) {
        AbstractC4354g2.k("log", 1, list);
        if (list.size() == 1) {
            this.f34987e.f34934c.a(B7.INFO, z22.b((InterfaceC4449s) list.get(0)).zzf(), Collections.emptyList(), this.f34985c, this.f34986d);
            return InterfaceC4449s.f35450e0;
        }
        B7 b7Zza = B7.zza(AbstractC4354g2.i(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue()));
        String strZzf = z22.b((InterfaceC4449s) list.get(1)).zzf();
        if (list.size() == 2) {
            this.f34987e.f34934c.a(b7Zza, strZzf, Collections.emptyList(), this.f34985c, this.f34986d);
            return InterfaceC4449s.f35450e0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 2; i10 < Math.min(list.size(), 5); i10++) {
            arrayList.add(z22.b((InterfaceC4449s) list.get(i10)).zzf());
        }
        this.f34987e.f34934c.a(b7Zza, strZzf, arrayList, this.f34985c, this.f34986d);
        return InterfaceC4449s.f35450e0;
    }
}
