package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gk2 extends hv1 implements kw1 {
    public final fk2 f;
    public final ba2 g;
    public final s63 h;
    public boolean i;
    public final mv2 j;

    public gk2(fk2 fk2Var, ba2 ba2Var, s63 s63Var, mv2 mv2Var) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.i = ((Boolean) tw1.e.c.a(mz1.P0)).booleanValue();
        this.f = fk2Var;
        this.g = ba2Var;
        this.h = s63Var;
        this.j = mv2Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        gm2 gm2Var;
        gm2 gm2Var2;
        pw1 ow1Var = null;
        String strV = null;
        ba2 ba2Var = this.g;
        fk2 fk2Var = this.f;
        switch (i) {
            case 2:
                parcel2.writeNoException();
                iv1.e(parcel2, ba2Var);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                iv1.f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    ow1Var = iInterfaceQueryLocalInterface instanceof pw1 ? (pw1) iInterfaceQueryLocalInterface : new ow1(strongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback", 2);
                }
                iv1.f(parcel);
                H1(u10VarX0, ow1Var);
                parcel2.writeNoException();
                return true;
            case 5:
                tx2 tx2VarE = e();
                parcel2.writeNoException();
                iv1.e(parcel2, tx2VarE);
                return true;
            case 6:
                boolean zA = iv1.a(parcel);
                iv1.f(parcel);
                this.i = zA;
                parcel2.writeNoException();
                return true;
            case 7:
                zu2 zu2VarB3 = kd3.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                ou1.h("setOnPaidEventListener must be called on the main UI thread.");
                s63 s63Var = this.h;
                if (s63Var != null) {
                    try {
                        if (!zu2VarB3.c()) {
                            this.j.b();
                        }
                    } catch (RemoteException unused) {
                        gi2.q0(3);
                    }
                    s63Var.l.set(zu2VarB3);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                try {
                    strV = ba2Var.v();
                } catch (RemoteException e) {
                    gi2.p0("#007 Could not call remote method.", e);
                }
                parcel2.writeNoException();
                parcel2.writeString(strV);
                return true;
            case 9:
                long j = (fk2Var == null || (gm2Var = fk2Var.j) == null) ? 0L : gm2Var.a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j);
                return true;
            case 10:
                long j2 = parcel.readLong();
                iv1.f(parcel);
                if (fk2Var != null && (gm2Var2 = fk2Var.j) != null) {
                    gm2Var2.a(j2);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.kw1
    public final void H1(u10 u10Var, pw1 pw1Var) {
        try {
            this.h.i.set(pw1Var);
            this.f.c((Activity) oi0.l1(u10Var), this.i);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.kw1
    public final tx2 e() {
        if (((Boolean) tw1.e.c.a(mz1.d7)).booleanValue()) {
            return this.f.f;
        }
        return null;
    }
}
