package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e32 extends sb1 implements f32 {
    @Override // defpackage.f32
    public final z12 A() {
        z12 y12Var;
        Parcel parcelY = Y(U(), 29);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            y12Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            y12Var = iInterfaceQueryLocalInterface instanceof z12 ? (z12) iInterfaceQueryLocalInterface : new y12(strongBinder);
        }
        parcelY.recycle();
        return y12Var;
    }

    @Override // defpackage.f32
    public final tx2 H() {
        Parcel parcelY = Y(U(), 31);
        tx2 tx2VarB3 = rm2.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return tx2VarB3;
    }

    @Override // defpackage.f32
    public final void O0(Bundle bundle) {
        Parcel parcelU = U();
        iv1.c(parcelU, bundle);
        M0(parcelU, 33);
    }

    @Override // defpackage.f32
    public final List X() {
        Parcel parcelY = Y(U(), 23);
        ArrayList arrayList = parcelY.readArrayList(iv1.a);
        parcelY.recycle();
        return arrayList;
    }

    @Override // defpackage.f32
    public final String b() {
        Parcel parcelY = Y(U(), 2);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.f32
    public final List c() {
        Parcel parcelY = Y(U(), 3);
        ArrayList arrayList = parcelY.readArrayList(iv1.a);
        parcelY.recycle();
        return arrayList;
    }

    @Override // defpackage.f32
    public final String e() {
        Parcel parcelY = Y(U(), 4);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.f32
    public final b22 f() {
        b22 a22Var;
        Parcel parcelY = Y(U(), 5);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            a22Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            a22Var = iInterfaceQueryLocalInterface instanceof b22 ? (b22) iInterfaceQueryLocalInterface : new a22(strongBinder);
        }
        parcelY.recycle();
        return a22Var;
    }

    @Override // defpackage.f32
    public final String g() {
        Parcel parcelY = Y(U(), 7);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.f32
    public final String i() {
        Parcel parcelY = Y(U(), 9);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.f32
    public final String j() {
        Parcel parcelY = Y(U(), 6);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.f32
    public final double k() {
        Parcel parcelY = Y(U(), 8);
        double d = parcelY.readDouble();
        parcelY.recycle();
        return d;
    }

    @Override // defpackage.f32
    public final x12 m() {
        x12 s12Var;
        Parcel parcelY = Y(U(), 14);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            s12Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            s12Var = iInterfaceQueryLocalInterface instanceof x12 ? (x12) iInterfaceQueryLocalInterface : new s12(strongBinder);
        }
        parcelY.recycle();
        return s12Var;
    }

    @Override // defpackage.f32
    public final String n() {
        Parcel parcelY = Y(U(), 10);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // defpackage.f32
    public final py2 o() {
        Parcel parcelY = Y(U(), 11);
        py2 py2VarB3 = hy2.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return py2VarB3;
    }

    @Override // defpackage.f32
    public final u10 s() {
        return ga1.j(Y(U(), 19));
    }

    @Override // defpackage.f32
    public final u10 v() {
        return ga1.j(Y(U(), 18));
    }
}
