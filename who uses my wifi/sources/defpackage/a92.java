package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a92 extends sb1 implements c92 {
    public a92(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay", 2);
    }

    @Override // defpackage.c92
    public final void D(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 13);
    }

    @Override // defpackage.c92
    public final void O1(int i, String[] strArr, int[] iArr) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        parcelU.writeStringArray(strArr);
        parcelU.writeIntArray(iArr);
        M0(parcelU, 15);
    }

    @Override // defpackage.c92
    public final void S() {
        M0(U(), 7);
    }

    @Override // defpackage.c92
    public final void V1(int i, int i2, Intent intent) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        parcelU.writeInt(i2);
        iv1.c(parcelU, intent);
        M0(parcelU, 12);
    }

    @Override // defpackage.c92
    public final void X2(Bundle bundle) {
        Parcel parcelU = U();
        iv1.c(parcelU, bundle);
        M0(parcelU, 1);
    }

    @Override // defpackage.c92
    public final void b() {
        M0(U(), 10);
    }

    @Override // defpackage.c92
    public final void c() {
        M0(U(), 14);
    }

    @Override // defpackage.c92
    public final void c0(Bundle bundle) {
        Parcel parcelU = U();
        iv1.c(parcelU, bundle);
        Parcel parcelY = Y(parcelU, 6);
        if (parcelY.readInt() != 0) {
            bundle.readFromParcel(parcelY);
        }
        parcelY.recycle();
    }

    @Override // defpackage.c92
    public final boolean e() {
        Parcel parcelY = Y(U(), 11);
        ClassLoader classLoader = iv1.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.c92
    public final void g() {
        M0(U(), 3);
    }

    @Override // defpackage.c92
    public final void i() {
        M0(U(), 5);
    }

    @Override // defpackage.c92
    public final void j() {
        M0(U(), 2);
    }

    @Override // defpackage.c92
    public final void k() {
        M0(U(), 4);
    }

    @Override // defpackage.c92
    public final void u() {
        M0(U(), 9);
    }

    @Override // defpackage.c92
    public final void x() {
        M0(U(), 8);
    }
}
