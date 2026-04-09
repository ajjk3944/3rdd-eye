package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4473v implements InterfaceC4449s {

    /* renamed from: a, reason: collision with root package name */
    private final String f35498a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f35499b;

    public C4473v(String str, List list) {
        this.f35498a = str;
        ArrayList arrayList = new ArrayList();
        this.f35499b = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f35498a;
    }

    public final ArrayList b() {
        return this.f35499b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s e(String str, Z2 z22, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4473v)) {
            return false;
        }
        C4473v c4473v = (C4473v) obj;
        String str = this.f35498a;
        if (str == null ? c4473v.f35498a != null : !str.equals(c4473v.f35498a)) {
            return false;
        }
        ArrayList arrayList = this.f35499b;
        ArrayList arrayList2 = c4473v.f35499b;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    public final int hashCode() {
        String str = this.f35498a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.f35499b;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Boolean zzd() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Double zze() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final String zzf() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Iterator zzh() {
        return null;
    }
}
