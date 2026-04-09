package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4360h implements InterfaceC4449s {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35233a;

    public C4360h(Boolean bool) {
        if (bool == null) {
            this.f35233a = false;
        } else {
            this.f35233a = bool.booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s e(String str, Z2 z22, List list) {
        if ("toString".equals(str)) {
            return new C4465u(Boolean.toString(this.f35233a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f35233a), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4360h) && this.f35233a == ((C4360h) obj).f35233a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f35233a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f35233a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s zzc() {
        return new C4360h(Boolean.valueOf(this.f35233a));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Boolean zzd() {
        return Boolean.valueOf(this.f35233a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Double zze() {
        return Double.valueOf(this.f35233a ? 1.0d : 0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final String zzf() {
        return Boolean.toString(this.f35233a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Iterator zzh() {
        return null;
    }
}
