package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class d6 implements j6 {

    /* renamed from: a, reason: collision with root package name */
    public final s4 f4953a;

    /* renamed from: b, reason: collision with root package name */
    public final f5 f4954b;

    public d6(f5 f5Var, s4 s4Var) {
        f5 f5Var2 = b5.f4919a;
        this.f4954b = f5Var;
        this.f4953a = s4Var;
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final void a(Object obj, Object obj2) {
        k6.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final int b(s4 s4Var) {
        n6 n6Var = ((h5) s4Var).zzc;
        int i10 = n6Var.f5140d;
        if (i10 != -1) {
            return i10;
        }
        int iB = 0;
        for (int i11 = 0; i11 < n6Var.f5137a; i11++) {
            int i12 = n6Var.f5138b[i11] >>> 3;
            y4 y4Var = (y4) n6Var.f5139c[i11];
            int iB0 = z4.B0(8);
            int iB02 = z4.B0(i12) + z4.B0(16);
            int iB03 = z4.B0(24);
            int iC = y4Var.c();
            iB += iB0 + iB0 + iB02 + c7.a.b(iC, iC, iB03);
        }
        n6Var.f5140d = iB;
        return iB;
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final void c(Object obj, w5 w5Var) {
        throw w.g.c(obj);
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final boolean d(Object obj) {
        throw w.g.c(obj);
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final boolean e(h5 h5Var, h5 h5Var2) {
        return h5Var.zzc.equals(h5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final void f(Object obj) {
        this.f4954b.getClass();
        n6 n6Var = ((h5) obj).zzc;
        if (n6Var.f5141e) {
            n6Var.f5141e = false;
        }
        f5 f5Var = b5.f4919a;
        throw w.g.c(obj);
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final void g(Object obj, byte[] bArr, int i10, int i11, v4 v4Var) {
        h5 h5Var = (h5) obj;
        if (h5Var.zzc == n6.f5136f) {
            h5Var.zzc = n6.a();
        }
        throw w.g.c(obj);
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final int h(h5 h5Var) {
        return h5Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.j6
    public final h5 zza() {
        s4 s4Var = this.f4953a;
        return s4Var instanceof h5 ? (h5) ((h5) s4Var).o(4) : ((g5) ((h5) s4Var).o(5)).d();
    }
}
