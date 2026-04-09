package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4410n implements InterfaceC4402m, InterfaceC4449s {

    /* renamed from: a, reason: collision with root package name */
    protected final String f35402a;

    /* renamed from: b, reason: collision with root package name */
    protected final Map f35403b = new HashMap();

    public AbstractC4410n(String str) {
        this.f35402a = str;
    }

    public abstract InterfaceC4449s a(Z2 z22, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC4402m
    public final boolean b(String str) {
        return this.f35403b.containsKey(str);
    }

    public final String c() {
        return this.f35402a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s e(String str, Z2 z22, List list) {
        return "toString".equals(str) ? new C4465u(this.f35402a) : AbstractC4426p.a(this, new C4465u(str), z22, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4410n)) {
            return false;
        }
        AbstractC4410n abstractC4410n = (AbstractC4410n) obj;
        String str = this.f35402a;
        if (str != null) {
            return str.equals(abstractC4410n.f35402a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4402m
    public final void f(String str, InterfaceC4449s interfaceC4449s) {
        if (interfaceC4449s == null) {
            this.f35403b.remove(str);
        } else {
            this.f35403b.put(str, interfaceC4449s);
        }
    }

    public int hashCode() {
        String str = this.f35402a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4402m
    public final InterfaceC4449s zza(String str) {
        return this.f35403b.containsKey(str) ? (InterfaceC4449s) this.f35403b.get(str) : InterfaceC4449s.f35450e0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public InterfaceC4449s zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final String zzf() {
        return this.f35402a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Iterator zzh() {
        return AbstractC4426p.b(this.f35403b);
    }
}
