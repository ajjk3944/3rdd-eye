package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x62 extends sb1 implements z62 {
    public x62(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener", 2);
    }

    @Override // defpackage.z62
    public final void F1(nx2 nx2Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, nx2Var);
        M0(parcelU, 24);
    }

    @Override // defpackage.z62
    public final void G0() {
        M0(U(), 18);
    }

    @Override // defpackage.z62
    public final void K0(nx2 nx2Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, nx2Var);
        M0(parcelU, 23);
    }

    @Override // defpackage.z62
    public final void b() {
        M0(U(), 1);
    }

    @Override // defpackage.z62
    public final void b0() {
        M0(U(), 25);
    }

    @Override // defpackage.z62
    public final void c() {
        M0(U(), 2);
    }

    @Override // defpackage.z62
    public final void c3(p22 p22Var, String str) {
        Parcel parcelU = U();
        iv1.e(parcelU, p22Var);
        parcelU.writeString(str);
        M0(parcelU, 10);
    }

    @Override // defpackage.z62
    public final void f() {
        M0(U(), 4);
    }

    @Override // defpackage.z62
    public final void f0(int i) {
        throw null;
    }

    @Override // defpackage.z62
    public final void g() {
        M0(U(), 6);
    }

    @Override // defpackage.z62
    public final void h0() {
        M0(U(), 20);
    }

    @Override // defpackage.z62
    public final void i0(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        M0(parcelU, 21);
    }

    @Override // defpackage.z62
    public final void j() {
        M0(U(), 5);
    }

    @Override // defpackage.z62
    public final void j0() {
        M0(U(), 11);
    }

    @Override // defpackage.z62
    public final void k() {
        M0(U(), 8);
    }

    @Override // defpackage.z62
    public final void l2(va2 va2Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, va2Var);
        M0(parcelU, 16);
    }

    @Override // defpackage.z62
    public final void m0(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        M0(parcelU, 3);
    }

    @Override // defpackage.z62
    public final void p() {
        M0(U(), 13);
    }

    @Override // defpackage.z62
    public final void r3(ta2 ta2Var) {
        throw null;
    }

    @Override // defpackage.z62
    public final void v2(String str, String str2) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        M0(parcelU, 9);
    }

    @Override // defpackage.z62
    public final void w0(String str, int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        parcelU.writeString(str);
        M0(parcelU, 22);
    }

    @Override // defpackage.z62
    public final void x() {
        M0(U(), 15);
    }
}
