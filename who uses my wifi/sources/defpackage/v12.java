package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v12 extends sb1 implements d32 {
    public v12(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 2);
    }

    @Override // defpackage.d32
    public final void I(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        M0(parcelU, 2);
    }

    @Override // defpackage.d32
    public final void W(nx2 nx2Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, nx2Var);
        M0(parcelU, 8);
    }

    @Override // defpackage.d32
    public final void b() {
        M0(U(), 3);
    }

    @Override // defpackage.d32
    public final void c() {
        M0(U(), 4);
    }

    @Override // defpackage.d32
    public final void e() {
        M0(U(), 5);
    }

    @Override // defpackage.d32
    public final void f() {
        M0(U(), 6);
    }

    @Override // defpackage.d32
    public final void g() {
        M0(U(), 7);
    }

    @Override // defpackage.d32
    public final void j() {
        M0(U(), 9);
    }

    @Override // defpackage.d32
    public final void y() {
        M0(U(), 1);
    }
}
