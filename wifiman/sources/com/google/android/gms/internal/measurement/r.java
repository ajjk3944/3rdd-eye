package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class r implements InterfaceC4402m, InterfaceC4449s {

    /* renamed from: a, reason: collision with root package name */
    private final Map f35441a = new HashMap();

    public final List a() {
        return new ArrayList(this.f35441a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4402m
    public final boolean b(String str) {
        return this.f35441a.containsKey(str);
    }

    public InterfaceC4449s e(String str, Z2 z22, List list) {
        return "toString".equals(str) ? new C4465u(toString()) : AbstractC4426p.a(this, new C4465u(str), z22, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f35441a.equals(((r) obj).f35441a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4402m
    public final void f(String str, InterfaceC4449s interfaceC4449s) {
        if (interfaceC4449s == null) {
            this.f35441a.remove(str);
        } else {
            this.f35441a.put(str, interfaceC4449s);
        }
    }

    public int hashCode() {
        return this.f35441a.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.f35441a.isEmpty()) {
            for (String str : this.f35441a.keySet()) {
                sb2.append(String.format("%s: %s,", str, this.f35441a.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4402m
    public final InterfaceC4449s zza(String str) {
        return this.f35441a.containsKey(str) ? (InterfaceC4449s) this.f35441a.get(str) : InterfaceC4449s.f35450e0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s zzc() {
        r rVar = new r();
        for (Map.Entry entry : this.f35441a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC4402m) {
                rVar.f35441a.put((String) entry.getKey(), (InterfaceC4449s) entry.getValue());
            } else {
                rVar.f35441a.put((String) entry.getKey(), ((InterfaceC4449s) entry.getValue()).zzc());
            }
        }
        return rVar;
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
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Iterator zzh() {
        return AbstractC4426p.b(this.f35441a);
    }
}
