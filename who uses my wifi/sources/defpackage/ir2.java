package defpackage;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ir2 extends hv1 implements z12 {
    public final tr2 f;
    public u10 g;

    public ir2(tr2 tr2Var) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f = tr2Var;
    }

    public static float B3(u10 u10Var) {
        Drawable drawable;
        if (u10Var == null || (drawable = (Drawable) oi0.l1(u10Var)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        float f;
        zq zqVarX;
        int i2;
        int i3;
        int i4;
        w22 w22Var;
        ag2 ag2Var;
        switch (i) {
            case 2:
                tr2 tr2Var = this.f;
                synchronized (tr2Var) {
                    f = tr2Var.x;
                }
                if (f != 0.0f) {
                    synchronized (tr2Var) {
                        fN = tr2Var.x;
                    }
                } else if (tr2Var.r() != null) {
                    try {
                        fN = tr2Var.r().n();
                    } catch (RemoteException e) {
                        gi2.c0("Remote exception getting video controller aspect ratio.", e);
                    }
                } else {
                    u10 u10Var = this.g;
                    if (u10Var != null) {
                        fN = B3(u10Var);
                    } else if (!((Boolean) tw1.e.c.a(mz1.fd)).booleanValue() || tr2Var.i() == null || (zqVarX = tr2Var.i().x()) == null || (i2 = zqVarX.c) < 0 || (i3 = zqVarX.b) <= 0) {
                        b22 b22VarB = tr2Var.b();
                        if (b22VarB != null) {
                            float fB = (b22VarB.b() == -1 || b22VarB.c() == -1) ? 0.0f : b22VarB.b() / b22VarB.c();
                            fN = fB == 0.0f ? B3(b22VarB.d()) : fB;
                        }
                    } else {
                        fN = i2 / i3;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(fN);
                return true;
            case 3:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                this.g = u10VarX0;
                parcel2.writeNoException();
                return true;
            case 4:
                u10 u10VarE = e();
                parcel2.writeNoException();
                iv1.e(parcel2, u10VarE);
                return true;
            case 5:
                tr2 tr2Var2 = this.f;
                fN = tr2Var2.r() != null ? tr2Var2.r().g() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(fN);
                return true;
            case 6:
                tr2 tr2Var3 = this.f;
                fN = tr2Var3.r() != null ? tr2Var3.r().k() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(fN);
                return true;
            case 7:
                py2 py2VarR = this.f.r();
                parcel2.writeNoException();
                iv1.e(parcel2, py2VarR);
                return true;
            case 8:
                i4 = this.f.r() != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader = iv1.a;
                parcel2.writeInt(i4);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    w22Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    w22Var = iInterfaceQueryLocalInterface instanceof w22 ? (w22) iInterfaceQueryLocalInterface : new w22(strongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener", 2);
                }
                iv1.f(parcel);
                tr2 tr2Var4 = this.f;
                if (tr2Var4.r() instanceof qg2) {
                    qg2 qg2Var = (qg2) tr2Var4.r();
                    synchronized (qg2Var.g) {
                        qg2Var.s = w22Var;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                tr2 tr2Var5 = this.f;
                synchronized (tr2Var5) {
                    ag2Var = tr2Var5.j;
                }
                i4 = ag2Var != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader2 = iv1.a;
                parcel2.writeInt(i4);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.z12
    public final u10 e() {
        u10 u10Var = this.g;
        if (u10Var != null) {
            return u10Var;
        }
        b22 b22VarB = this.f.b();
        if (b22VarB == null) {
            return null;
        }
        return b22VarB.d();
    }
}
