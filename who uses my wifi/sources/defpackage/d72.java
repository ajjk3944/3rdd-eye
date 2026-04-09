package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d72 extends sb1 implements e72 {
    public d72(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper", 2);
    }

    @Override // defpackage.e72
    public final float C() {
        Parcel parcelY = Y(U(), 25);
        float f = parcelY.readFloat();
        parcelY.recycle();
        return f;
    }

    @Override // defpackage.e72
    public final u10 E() {
        return ga1.j(Y(U(), 15));
    }

    @Override // defpackage.e72
    public final void F() {
        M0(U(), 26);
    }

    @Override // defpackage.e72
    public final float L() {
        Parcel parcelY = Y(U(), 24);
        float f = parcelY.readFloat();
        parcelY.recycle();
        return f;
    }

    @Override // defpackage.e72
    public final boolean N() {
        Parcel parcelY = Y(U(), 17);
        ClassLoader classLoader = iv1.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.e72
    public final void W0(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 22);
    }

    @Override // defpackage.e72
    public final float X() {
        Parcel parcelY = Y(U(), 23);
        float f = parcelY.readFloat();
        parcelY.recycle();
        return f;
    }

    @Override // defpackage.e72
    public final String b() {
        Parcel parcelY = Y(U(), 2);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.e72
    public final List c() {
        Parcel parcelY = Y(U(), 3);
        ArrayList arrayList = parcelY.readArrayList(iv1.a);
        parcelY.recycle();
        return arrayList;
    }

    @Override // defpackage.e72
    public final String e() {
        Parcel parcelY = Y(U(), 4);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.e72
    public final b22 f() {
        Parcel parcelY = Y(U(), 5);
        b22 b22VarB3 = p12.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return b22VarB3;
    }

    @Override // defpackage.e72
    public final String g() {
        Parcel parcelY = Y(U(), 7);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.e72
    public final boolean h0() {
        Parcel parcelY = Y(U(), 18);
        ClassLoader classLoader = iv1.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.e72
    public final String i() {
        Parcel parcelY = Y(U(), 9);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.e72
    public final String j() {
        Parcel parcelY = Y(U(), 6);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.e72
    public final double k() {
        Parcel parcelY = Y(U(), 8);
        double d = parcelY.readDouble();
        parcelY.recycle();
        return d;
    }

    @Override // defpackage.e72
    public final void l0(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 20);
    }

    @Override // defpackage.e72
    public final u10 m() {
        return ga1.j(Y(U(), 14));
    }

    @Override // defpackage.e72
    public final String n() {
        Parcel parcelY = Y(U(), 10);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.e72
    public final void n1(u10 u10Var, u10 u10Var2, u10 u10Var3) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, u10Var2);
        iv1.e(parcelU, u10Var3);
        M0(parcelU, 21);
    }

    @Override // defpackage.e72
    public final py2 o() {
        Parcel parcelY = Y(U(), 11);
        py2 py2VarB3 = hy2.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return py2VarB3;
    }

    @Override // defpackage.e72
    public final x12 p() {
        Parcel parcelY = Y(U(), 12);
        x12 x12VarB3 = w12.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return x12VarB3;
    }

    @Override // defpackage.e72
    public final u10 q() {
        return ga1.j(Y(U(), 13));
    }

    @Override // defpackage.e72
    public final void s() {
        M0(U(), 19);
    }

    @Override // defpackage.e72
    public final Bundle u2() {
        Parcel parcelY = Y(U(), 16);
        Bundle bundle = (Bundle) iv1.b(parcelY, Bundle.CREATOR);
        parcelY.recycle();
        return bundle;
    }
}
