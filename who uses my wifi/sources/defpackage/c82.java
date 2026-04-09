package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c82 extends sb1 implements d82 {
    @Override // defpackage.d82
    public final void B0(String str, String str2, pc4 pc4Var, u10 u10Var, v72 v72Var, z62 z62Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.c(parcelU, pc4Var);
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, v72Var);
        iv1.e(parcelU, z62Var);
        M0(parcelU, 14);
    }

    @Override // defpackage.d82
    public final void F2(String str, String str2, pc4 pc4Var, u10 u10Var, b82 b82Var, z62 z62Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.c(parcelU, pc4Var);
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, b82Var);
        iv1.e(parcelU, z62Var);
        M0(parcelU, 20);
    }

    @Override // defpackage.d82
    public final boolean H0(oi0 oi0Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, oi0Var);
        Parcel parcelY = Y(parcelU, 17);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.d82
    public final void L1(String str, String str2, pc4 pc4Var, u10 u10Var, z72 z72Var, z62 z62Var, r12 r12Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.c(parcelU, pc4Var);
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, z72Var);
        iv1.e(parcelU, z62Var);
        iv1.c(parcelU, r12Var);
        M0(parcelU, 22);
    }

    @Override // defpackage.d82
    public final void P1(String str, String str2, pc4 pc4Var, u10 u10Var, t72 t72Var, z62 z62Var, xe4 xe4Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.c(parcelU, pc4Var);
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, t72Var);
        iv1.e(parcelU, z62Var);
        iv1.c(parcelU, xe4Var);
        M0(parcelU, 21);
    }

    @Override // defpackage.d82
    public final i82 c() {
        Parcel parcelY = Y(U(), 2);
        i82 i82Var = (i82) iv1.b(parcelY, i82.CREATOR);
        parcelY.recycle();
        return i82Var;
    }

    @Override // defpackage.d82
    public final i82 e() {
        Parcel parcelY = Y(U(), 3);
        i82 i82Var = (i82) iv1.b(parcelY, i82.CREATOR);
        parcelY.recycle();
        return i82Var;
    }

    @Override // defpackage.d82
    public final py2 f() {
        Parcel parcelY = Y(U(), 5);
        py2 py2VarB3 = hy2.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return py2VarB3;
    }

    @Override // defpackage.d82
    public final void f2(String str, String str2, pc4 pc4Var, u10 u10Var, r72 r72Var, z62 z62Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.c(parcelU, pc4Var);
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, r72Var);
        iv1.e(parcelU, z62Var);
        M0(parcelU, 23);
    }

    @Override // defpackage.d82
    public final void g2(String str, String str2, pc4 pc4Var, u10 u10Var, b82 b82Var, z62 z62Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.c(parcelU, pc4Var);
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, b82Var);
        iv1.e(parcelU, z62Var);
        M0(parcelU, 16);
    }

    @Override // defpackage.d82
    public final boolean h2(oi0 oi0Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, oi0Var);
        Parcel parcelY = Y(parcelU, 15);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.d82
    public final void j1(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        M0(parcelU, 19);
    }

    @Override // defpackage.d82
    public final boolean j3(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        Parcel parcelY = Y(parcelU, 24);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.d82
    public final void p3(String str, String str2, pc4 pc4Var, oi0 oi0Var, f13 f13Var, z62 z62Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.c(parcelU, pc4Var);
        iv1.e(parcelU, oi0Var);
        iv1.e(parcelU, f13Var);
        iv1.e(parcelU, z62Var);
        M0(parcelU, 18);
    }

    @Override // defpackage.d82
    public final void q3(u10 u10Var, String str, Bundle bundle, Bundle bundle2, xe4 xe4Var, f82 f82Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        parcelU.writeString(str);
        iv1.c(parcelU, bundle);
        iv1.c(parcelU, bundle2);
        iv1.c(parcelU, xe4Var);
        iv1.e(parcelU, f82Var);
        M0(parcelU, 1);
    }

    @Override // defpackage.d82
    public final void y1(String str, String str2, pc4 pc4Var, u10 u10Var, t72 t72Var, z62 z62Var, xe4 xe4Var) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.c(parcelU, pc4Var);
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, t72Var);
        iv1.e(parcelU, z62Var);
        iv1.c(parcelU, xe4Var);
        M0(parcelU, 13);
    }
}
