package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class D extends A {
    public D() {
        this.f34919a.add(Z.EQUALS);
        this.f34919a.add(Z.GREATER_THAN);
        this.f34919a.add(Z.GREATER_THAN_EQUALS);
        this.f34919a.add(Z.IDENTITY_EQUALS);
        this.f34919a.add(Z.IDENTITY_NOT_EQUALS);
        this.f34919a.add(Z.LESS_THAN);
        this.f34919a.add(Z.LESS_THAN_EQUALS);
        this.f34919a.add(Z.NOT_EQUALS);
    }

    private static boolean c(InterfaceC4449s interfaceC4449s, InterfaceC4449s interfaceC4449s2) {
        InterfaceC4449s c4386k;
        InterfaceC4449s c4386k2;
        while (!interfaceC4449s.getClass().equals(interfaceC4449s2.getClass())) {
            if (((interfaceC4449s instanceof C4505z) || (interfaceC4449s instanceof C4434q)) && ((interfaceC4449s2 instanceof C4505z) || (interfaceC4449s2 instanceof C4434q))) {
                return true;
            }
            boolean z10 = interfaceC4449s instanceof C4386k;
            if (z10 && (interfaceC4449s2 instanceof C4465u)) {
                c4386k2 = new C4386k(interfaceC4449s2.zze());
            } else {
                boolean z11 = interfaceC4449s instanceof C4465u;
                if (z11 && (interfaceC4449s2 instanceof C4386k)) {
                    c4386k = new C4386k(interfaceC4449s.zze());
                } else if (interfaceC4449s instanceof C4360h) {
                    c4386k = new C4386k(interfaceC4449s.zze());
                } else if (interfaceC4449s2 instanceof C4360h) {
                    c4386k2 = new C4386k(interfaceC4449s2.zze());
                } else if ((z11 || z10) && (interfaceC4449s2 instanceof InterfaceC4402m)) {
                    c4386k2 = new C4465u(interfaceC4449s2.zzf());
                } else {
                    if (!(interfaceC4449s instanceof InterfaceC4402m) || (!(interfaceC4449s2 instanceof C4465u) && !(interfaceC4449s2 instanceof C4386k))) {
                        return false;
                    }
                    c4386k = new C4465u(interfaceC4449s.zzf());
                }
                interfaceC4449s = c4386k;
            }
            interfaceC4449s2 = c4386k2;
        }
        if ((interfaceC4449s instanceof C4505z) || (interfaceC4449s instanceof C4434q)) {
            return true;
        }
        return interfaceC4449s instanceof C4386k ? (Double.isNaN(interfaceC4449s.zze().doubleValue()) || Double.isNaN(interfaceC4449s2.zze().doubleValue()) || interfaceC4449s.zze().doubleValue() != interfaceC4449s2.zze().doubleValue()) ? false : true : interfaceC4449s instanceof C4465u ? interfaceC4449s.zzf().equals(interfaceC4449s2.zzf()) : interfaceC4449s instanceof C4360h ? interfaceC4449s.zzd().equals(interfaceC4449s2.zzd()) : interfaceC4449s == interfaceC4449s2;
    }

    private static boolean d(InterfaceC4449s interfaceC4449s, InterfaceC4449s interfaceC4449s2) {
        if (interfaceC4449s instanceof InterfaceC4402m) {
            interfaceC4449s = new C4465u(interfaceC4449s.zzf());
        }
        if (interfaceC4449s2 instanceof InterfaceC4402m) {
            interfaceC4449s2 = new C4465u(interfaceC4449s2.zzf());
        }
        if ((interfaceC4449s instanceof C4465u) && (interfaceC4449s2 instanceof C4465u)) {
            return interfaceC4449s.zzf().compareTo(interfaceC4449s2.zzf()) < 0;
        }
        double dDoubleValue = interfaceC4449s.zze().doubleValue();
        double dDoubleValue2 = interfaceC4449s2.zze().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(InterfaceC4449s interfaceC4449s, InterfaceC4449s interfaceC4449s2) {
        if (interfaceC4449s instanceof InterfaceC4402m) {
            interfaceC4449s = new C4465u(interfaceC4449s.zzf());
        }
        if (interfaceC4449s2 instanceof InterfaceC4402m) {
            interfaceC4449s2 = new C4465u(interfaceC4449s2.zzf());
        }
        return (((interfaceC4449s instanceof C4465u) && (interfaceC4449s2 instanceof C4465u)) || !(Double.isNaN(interfaceC4449s.zze().doubleValue()) || Double.isNaN(interfaceC4449s2.zze().doubleValue()))) && !d(interfaceC4449s2, interfaceC4449s);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // com.google.android.gms.internal.measurement.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC4449s b(java.lang.String r4, com.google.android.gms.internal.measurement.Z2 r5, java.util.List r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.measurement.Z r0 = com.google.android.gms.internal.measurement.AbstractC4354g2.c(r4)
            r1 = 2
            com.google.android.gms.internal.measurement.AbstractC4354g2.f(r0, r1, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.s r0 = (com.google.android.gms.internal.measurement.InterfaceC4449s) r0
            com.google.android.gms.internal.measurement.s r0 = r5.b(r0)
            r1 = 1
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.measurement.s r6 = (com.google.android.gms.internal.measurement.InterfaceC4449s) r6
            com.google.android.gms.internal.measurement.s r5 = r5.b(r6)
            int[] r6 = com.google.android.gms.internal.measurement.G.f35007a
            com.google.android.gms.internal.measurement.Z r2 = com.google.android.gms.internal.measurement.AbstractC4354g2.c(r4)
            int r2 = r2.ordinal()
            r6 = r6[r2]
            switch(r6) {
                case 1: goto L56;
                case 2: goto L51;
                case 3: goto L4c;
                case 4: goto L47;
                case 5: goto L42;
                case 6: goto L3d;
                case 7: goto L38;
                case 8: goto L32;
                default: goto L2d;
            }
        L2d:
            com.google.android.gms.internal.measurement.s r4 = super.a(r4)
            return r4
        L32:
            boolean r4 = c(r0, r5)
        L36:
            r4 = r4 ^ r1
            goto L5a
        L38:
            boolean r4 = e(r0, r5)
            goto L5a
        L3d:
            boolean r4 = d(r0, r5)
            goto L5a
        L42:
            boolean r4 = com.google.android.gms.internal.measurement.AbstractC4354g2.h(r0, r5)
            goto L36
        L47:
            boolean r4 = com.google.android.gms.internal.measurement.AbstractC4354g2.h(r0, r5)
            goto L5a
        L4c:
            boolean r4 = e(r5, r0)
            goto L5a
        L51:
            boolean r4 = d(r5, r0)
            goto L5a
        L56:
            boolean r4 = c(r0, r5)
        L5a:
            if (r4 == 0) goto L5f
            com.google.android.gms.internal.measurement.s r4 = com.google.android.gms.internal.measurement.InterfaceC4449s.f35455j0
            return r4
        L5f:
            com.google.android.gms.internal.measurement.s r4 = com.google.android.gms.internal.measurement.InterfaceC4449s.f35456k0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D.b(java.lang.String, com.google.android.gms.internal.measurement.Z2, java.util.List):com.google.android.gms.internal.measurement.s");
    }
}
