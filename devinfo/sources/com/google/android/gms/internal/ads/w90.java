package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w90 extends mg implements vm {

    /* renamed from: a, reason: collision with root package name */
    public final ga0 f17946a;

    /* renamed from: b, reason: collision with root package name */
    public vb.a f17947b;

    public w90(ga0 ga0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f17946a = ga0Var;
    }

    public static float h4(vb.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) vb.b.U0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.vm
    public final vb.a e() {
        vb.a aVar = this.f17947b;
        if (aVar != null) {
            return aVar;
        }
        xm xmVarD = this.f17946a.d();
        if (xmVarD == null) {
            return null;
        }
        return xmVarD.a();
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        h0 h0VarR;
        int i10;
        int i11;
        int i12;
        rn rnVar;
        qz qzVar;
        switch (i4) {
            case 2:
                ga0 ga0Var = this.f17946a;
                if (ga0Var.y() != 0.0f) {
                    fF1 = ga0Var.y();
                } else if (ga0Var.X() != null) {
                    try {
                        fF1 = ga0Var.X().F1();
                    } catch (RemoteException e2) {
                        za.i.f("Remote exception getting video controller aspect ratio.", e2);
                    }
                } else {
                    vb.a aVar = this.f17947b;
                    if (aVar != null) {
                        fF1 = h4(aVar);
                    } else if (!((Boolean) va.s.f36163e.f36166c.a(sk.Ed)).booleanValue() || ga0Var.s() == null || (h0VarR = ga0Var.s().R()) == null || (i10 = h0VarR.f11673c) < 0 || (i11 = h0VarR.f11672b) <= 0) {
                        xm xmVarD = ga0Var.d();
                        if (xmVarD != null) {
                            float fC = (xmVarD.c() == -1 || xmVarD.d() == -1) ? 0.0f : xmVarD.c() / xmVarD.d();
                            fF1 = fC == 0.0f ? h4(xmVarD.a()) : fC;
                        }
                    } else {
                        fF1 = i10 / i11;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(fF1);
                return true;
            case 3:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                this.f17947b = aVarR0;
                parcel2.writeNoException();
                return true;
            case 4:
                vb.a aVarE = e();
                parcel2.writeNoException();
                ng.e(parcel2, aVarE);
                return true;
            case 5:
                ga0 ga0Var2 = this.f17946a;
                fF1 = ga0Var2.X() != null ? ga0Var2.X().A1() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(fF1);
                return true;
            case 6:
                ga0 ga0Var3 = this.f17946a;
                fF1 = ga0Var3.X() != null ? ga0Var3.X().D1() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(fF1);
                return true;
            case 7:
                va.a2 a2VarX = this.f17946a.X();
                parcel2.writeNoException();
                ng.e(parcel2, a2VarX);
                return true;
            case 8:
                i12 = this.f17946a.X() != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader = ng.f14287a;
                parcel2.writeInt(i12);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    rnVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    rnVar = iInterfaceQueryLocalInterface instanceof rn ? (rn) iInterfaceQueryLocalInterface : new rn(strongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener", 1);
                }
                ng.f(parcel);
                i4(rnVar);
                parcel2.writeNoException();
                return true;
            case 10:
                ga0 ga0Var4 = this.f17946a;
                synchronized (ga0Var4) {
                    qzVar = ga0Var4.j;
                }
                i12 = qzVar != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader2 = ng.f14287a;
                parcel2.writeInt(i12);
                return true;
            default:
                return false;
        }
    }

    public final void i4(rn rnVar) {
        ga0 ga0Var = this.f17946a;
        if (ga0Var.X() instanceof g00) {
            g00 g00Var = (g00) ga0Var.X();
            synchronized (g00Var.f11330b) {
                g00Var.f11340n = rnVar;
            }
        }
    }
}
