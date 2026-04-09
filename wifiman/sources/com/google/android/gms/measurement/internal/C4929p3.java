package com.google.android.gms.measurement.internal;

import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4929p3 implements com.google.android.gms.internal.measurement.E7 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4873i3 f36643a;

    C4929p3(C4873i3 c4873i3) {
        this.f36643a = c4873i3;
    }

    @Override // com.google.android.gms.internal.measurement.E7
    public final void a(com.google.android.gms.internal.measurement.B7 b72, String str, List list, boolean z10, boolean z11) {
        int i10 = AbstractC4944r3.f36685a[b72.ordinal()];
        N2 n2F = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? this.f36643a.zzj().F() : this.f36643a.zzj().G() : z10 ? this.f36643a.zzj().J() : !z11 ? this.f36643a.zzj().I() : this.f36643a.zzj().H() : z10 ? this.f36643a.zzj().E() : !z11 ? this.f36643a.zzj().D() : this.f36643a.zzj().C() : this.f36643a.zzj().B();
        int size = list.size();
        if (size == 1) {
            n2F.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            n2F.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            n2F.a(str);
        } else {
            n2F.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
