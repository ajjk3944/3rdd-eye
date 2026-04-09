package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ke3 extends hv1 implements je3 {
    public ke3() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                oi0.X0(parcel.readStrongBinder());
                parcel.readString();
                iv1.f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                iv1.f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                iv1.f(parcel);
                break;
            case 6:
                parcel.readInt();
                iv1.f(parcel);
                break;
            case 7:
                parcel.readInt();
                iv1.f(parcel);
                break;
            case 8:
                oi0.X0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                iv1.f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.je3
    public final void G2() {
    }

    @Override // defpackage.je3
    public final void b() {
    }

    @Override // defpackage.je3
    public final void B(int i) {
    }

    @Override // defpackage.je3
    public final void t0(byte[] bArr) {
    }

    @Override // defpackage.je3
    public final void z(int i) {
    }

    @Override // defpackage.je3
    public final void J1(oi0 oi0Var, String str) {
    }
}
