package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class Q4 implements R4 {
    Q4() {
    }

    private static L4 c(Object obj, long j10) {
        return (L4) N5.B(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.R4
    public final void a(Object obj, long j10) {
        c(obj, j10).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.R4
    public final void b(Object obj, Object obj2, long j10) {
        L4 l4C = c(obj, j10);
        L4 l4C2 = c(obj2, j10);
        int size = l4C.size();
        int size2 = l4C2.size();
        if (size > 0 && size2 > 0) {
            if (!l4C.zzc()) {
                l4C = l4C.zza(size2 + size);
            }
            l4C.addAll(l4C2);
        }
        if (size > 0) {
            l4C2 = l4C;
        }
        N5.j(obj, j10, l4C2);
    }
}
