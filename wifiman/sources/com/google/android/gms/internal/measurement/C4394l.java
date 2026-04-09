package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4394l implements InterfaceC4449s {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4449s f35372a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35373b;

    public C4394l(String str) {
        this.f35372a = InterfaceC4449s.f35450e0;
        this.f35373b = str;
    }

    public final InterfaceC4449s a() {
        return this.f35372a;
    }

    public final String b() {
        return this.f35373b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s e(String str, Z2 z22, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4394l)) {
            return false;
        }
        C4394l c4394l = (C4394l) obj;
        return this.f35373b.equals(c4394l.f35373b) && this.f35372a.equals(c4394l.f35372a);
    }

    public final int hashCode() {
        return (this.f35373b.hashCode() * 31) + this.f35372a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s zzc() {
        return new C4394l(this.f35373b, this.f35372a.zzc());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Boolean zzd() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Double zze() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final String zzf() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Iterator zzh() {
        return null;
    }

    public C4394l(String str, InterfaceC4449s interfaceC4449s) {
        this.f35372a = interfaceC4449s;
        this.f35373b = str;
    }
}
