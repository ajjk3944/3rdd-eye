package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f3 extends h5 {
    private static final f3 zzh;
    private int zzb;
    private n5 zzd = h6.f5059x;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        f3 f3Var = new f3();
        zzh = f3Var;
        h5.m(f3.class, f3Var);
    }

    public static e3 w() {
        return (e3) zzh.h();
    }

    public static e3 x(f3 f3Var) {
        g5 g5VarH = zzh.h();
        g5VarH.f(f3Var);
        return (e3) g5VarH;
    }

    public final /* synthetic */ void A(ArrayList arrayList) {
        E();
        s4.c(arrayList, this.zzd);
    }

    public final void B() {
        this.zzd = h6.f5059x;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void E() {
        n5 n5Var = this.zzd;
        if (((t4) n5Var).f5208a) {
            return;
        }
        int size = n5Var.size();
        this.zzd = n5Var.V(size + size);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", h3.class, "zze", "zzf", "zzg", q1.j});
        }
        if (i11 == 3) {
            return new f3();
        }
        if (i11 == 4) {
            return new e3(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final h3 r(int i10) {
        return (h3) this.zzd.get(i10);
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i10, h3 h3Var) {
        E();
        this.zzd.set(i10, h3Var);
    }

    public final /* synthetic */ void z(h3 h3Var) {
        E();
        this.zzd.add(h3Var);
    }
}
