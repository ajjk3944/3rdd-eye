package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0897am extends B7 implements InterfaceC0601La {

    /* renamed from: a, reason: collision with root package name */
    public final C1492lm f13222a;

    /* renamed from: b, reason: collision with root package name */
    public S2.a f13223b;

    public BinderC0897am(C1492lm c1492lm) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f13222a = c1492lm;
    }

    public static float K3(S2.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) S2.b.n1(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        T2.d dVarD0;
        int i3;
        int i6;
        C1267hb c1267hb;
        switch (i) {
            case 2:
                C1492lm c1492lm = this.f13222a;
                if (c1492lm.y() != 0.0f) {
                    fN = c1492lm.y();
                } else if (c1492lm.X() != null) {
                    try {
                        fN = c1492lm.X().n();
                    } catch (RemoteException e6) {
                        u2.k.f("Remote exception getting video controller aspect ratio.", e6);
                    }
                } else {
                    S2.a aVar = this.f13223b;
                    if (aVar != null) {
                        fN = K3(aVar);
                    } else if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Cd)).booleanValue() || c1492lm.s() == null || (dVarD0 = c1492lm.s().d0()) == null || (i3 = dVarD0.f3571c) < 0 || (i6 = dVarD0.f3570b) <= 0) {
                        InterfaceC0635Na interfaceC0635NaD = c1492lm.d();
                        if (interfaceC0635NaD != null) {
                            float fB = (interfaceC0635NaD.b() == -1 || interfaceC0635NaD.d() == -1) ? 0.0f : interfaceC0635NaD.b() / interfaceC0635NaD.d();
                            fN = fB == 0.0f ? K3(interfaceC0635NaD.c()) : fB;
                        }
                    } else {
                        fN = i3 / i6;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(fN);
                return true;
            case 3:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                this.f13223b = aVarD1;
                parcel2.writeNoException();
                return true;
            case 4:
                S2.a aVarE = e();
                parcel2.writeNoException();
                C7.e(parcel2, aVarE);
                return true;
            case 5:
                C1492lm c1492lm2 = this.f13222a;
                fN = c1492lm2.X() != null ? c1492lm2.X().h() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(fN);
                return true;
            case 6:
                C1492lm c1492lm3 = this.f13222a;
                fN = c1492lm3.X() != null ? c1492lm3.X().k() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(fN);
                return true;
            case 7:
                q2.B0 b0X = this.f13222a.X();
                parcel2.writeNoException();
                C7.e(parcel2, b0X);
                return true;
            case 8:
                int i7 = this.f13222a.X() != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader = C7.f7544a;
                parcel2.writeInt(i7);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c1267hb = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    c1267hb = iInterfaceQueryLocalInterface instanceof C1267hb ? (C1267hb) iInterfaceQueryLocalInterface : new C1267hb(strongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener", 2);
                }
                C7.f(parcel);
                C1492lm c1492lm4 = this.f13222a;
                if (c1492lm4.X() instanceof BinderC1541mh) {
                    BinderC1541mh binderC1541mh = (BinderC1541mh) c1492lm4.X();
                    synchronized (binderC1541mh.f15637b) {
                        binderC1541mh.f15648n = c1267hb;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zI = i();
                parcel2.writeNoException();
                ClassLoader classLoader2 = C7.f7544a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0601La
    public final S2.a e() {
        S2.a aVar = this.f13223b;
        if (aVar != null) {
            return aVar;
        }
        InterfaceC0635Na interfaceC0635NaD = this.f13222a.d();
        if (interfaceC0635NaD == null) {
            return null;
        }
        return interfaceC0635NaD.c();
    }

    public final boolean i() {
        InterfaceC0828Yg interfaceC0828Yg;
        C1492lm c1492lm = this.f13222a;
        synchronized (c1492lm) {
            interfaceC0828Yg = c1492lm.f15443j;
        }
        return interfaceC0828Yg != null;
    }
}
