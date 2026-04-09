package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class U extends A {
    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC4449s b(String str, Z2 z22, List list) {
        if (str == null || str.isEmpty() || !z22.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC4449s interfaceC4449sC = z22.c(str);
        if (interfaceC4449sC instanceof AbstractC4410n) {
            return ((AbstractC4410n) interfaceC4449sC).a(z22, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
