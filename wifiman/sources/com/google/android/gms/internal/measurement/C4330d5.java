package com.google.android.gms.internal.measurement;

import f.AbstractC5487d;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4330d5 implements InterfaceC4303a5 {
    C4330d5() {
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4303a5
    public final Map a(Object obj) {
        return (C4312b5) obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4303a5
    public final Map b(Object obj) {
        return (C4312b5) obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4303a5
    public final Object c(Object obj, Object obj2) {
        C4312b5 c4312b5N = (C4312b5) obj;
        C4312b5 c4312b5 = (C4312b5) obj2;
        if (!c4312b5.isEmpty()) {
            if (!c4312b5N.r()) {
                c4312b5N = c4312b5N.n();
            }
            c4312b5N.l(c4312b5);
        }
        return c4312b5N;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4303a5
    public final Object d(Object obj) {
        ((C4312b5) obj).p();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4303a5
    public final int e(int i10, Object obj, Object obj2) {
        C4312b5 c4312b5 = (C4312b5) obj;
        AbstractC5487d.a(obj2);
        if (c4312b5.isEmpty()) {
            return 0;
        }
        Iterator it = c4312b5.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4303a5
    public final Y4 zza(Object obj) {
        AbstractC5487d.a(obj);
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4303a5
    public final Object zzb(Object obj) {
        return C4312b5.h().n();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4303a5
    public final boolean zzf(Object obj) {
        return !((C4312b5) obj).r();
    }
}
