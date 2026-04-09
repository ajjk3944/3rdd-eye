package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4505z implements InterfaceC4449s {
    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s e(String str, Z2 z22, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C4505z;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s zzc() {
        return InterfaceC4449s.f35450e0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Boolean zzd() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final String zzf() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Iterator zzh() {
        return null;
    }
}
