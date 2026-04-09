package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
final class K implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AbstractC4410n f35050a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Z2 f35051b;

    K(AbstractC4410n abstractC4410n, Z2 z22) {
        this.f35050a = abstractC4410n;
        this.f35051b = z22;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC4449s interfaceC4449s = (InterfaceC4449s) obj;
        InterfaceC4449s interfaceC4449s2 = (InterfaceC4449s) obj2;
        AbstractC4410n abstractC4410n = this.f35050a;
        Z2 z22 = this.f35051b;
        if (interfaceC4449s instanceof C4505z) {
            return !(interfaceC4449s2 instanceof C4505z) ? 1 : 0;
        }
        if (interfaceC4449s2 instanceof C4505z) {
            return -1;
        }
        return abstractC4410n == null ? interfaceC4449s.zzf().compareTo(interfaceC4449s2.zzf()) : (int) AbstractC4354g2.a(abstractC4410n.a(z22, Arrays.asList(interfaceC4449s, interfaceC4449s2)).zze().doubleValue());
    }
}
