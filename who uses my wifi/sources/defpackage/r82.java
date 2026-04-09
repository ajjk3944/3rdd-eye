package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r82 extends NativeAd {
    public final f32 a;
    public final l92 c;
    public final ArrayList b = new ArrayList();
    public final ArrayList d = new ArrayList();

    public r82(f32 f32Var) {
        new AtomicLong();
        this.a = f32Var;
        l92 l92Var = null;
        try {
            List listC = f32Var.c();
            if (listC != null) {
                for (Object obj : listC) {
                    b22 b22VarB3 = obj instanceof IBinder ? p12.B3((IBinder) obj) : null;
                    if (b22VarB3 != null) {
                        this.b.add(new l92(b22VarB3));
                    }
                }
            }
        } catch (RemoteException e) {
            gi2.c0("", e);
        }
        try {
            List listX = this.a.X();
            if (listX != null) {
                for (Object obj2 : listX) {
                    nq2 nq2VarB3 = obj2 instanceof IBinder ? c63.B3((IBinder) obj2) : null;
                    if (nq2VarB3 != null) {
                        this.d.add(new zs3(nq2VarB3));
                    }
                }
            }
        } catch (RemoteException e2) {
            gi2.c0("", e2);
        }
        try {
            b22 b22VarF = this.a.f();
            if (b22VarF != null) {
                l92Var = new l92(b22VarF);
            }
        } catch (RemoteException e3) {
            gi2.c0("", e3);
        }
        this.c = l92Var;
        try {
            if (this.a.m() != null) {
                new sq0(this.a.m());
            }
        } catch (RemoteException e4) {
            gi2.c0("", e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String a() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            gi2.c0("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.a.b();
        } catch (RemoteException e) {
            gi2.c0("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final hq0 c() {
        tx2 tx2VarH;
        try {
            tx2VarH = this.a.H();
        } catch (RemoteException e) {
            gi2.c0("", e);
            tx2VarH = null;
        }
        if (tx2VarH != null) {
            return new hq0(tx2VarH);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ u10 d() {
        try {
            return this.a.v();
        } catch (RemoteException e) {
            gi2.c0("", e);
            return null;
        }
    }

    public final String e() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            gi2.c0("", e);
            return null;
        }
    }

    public final String f() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            gi2.c0("", e);
            return null;
        }
    }

    public final String g() {
        try {
            return this.a.n();
        } catch (RemoteException e) {
            gi2.c0("", e);
            return null;
        }
    }

    public final Double h() {
        try {
            double dK = this.a.k();
            if (dK == -1.0d) {
                return null;
            }
            return Double.valueOf(dK);
        } catch (RemoteException e) {
            gi2.c0("", e);
            return null;
        }
    }

    public final String i() {
        try {
            return this.a.i();
        } catch (RemoteException e) {
            gi2.c0("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.a.O0(bundle);
        } catch (RemoteException e) {
            gi2.c0("Failed to record native event", e);
        }
    }
}
