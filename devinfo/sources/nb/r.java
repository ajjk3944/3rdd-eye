package nb;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import pb.v;
import pb.w;
import pb.x;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final m f29924a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f29925b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile x f29926c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f29927d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f29928e;

    static {
        new m(n.U0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new m(n.U0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new m(n.U0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new m(n.U0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        f29924a = new m(n.U0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        f29925b = new m(n.U0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        f29927d = new Object();
    }

    public static synchronized void a(Context context) {
        if (f29928e != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f29928e = context.getApplicationContext();
        }
    }

    public static void b() {
        x vVar;
        if (f29926c != null) {
            return;
        }
        y.h(f29928e);
        synchronized (f29927d) {
            try {
                if (f29926c == null) {
                    IBinder iBinderB = wb.d.c(f29928e, wb.d.f36582e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i4 = w.f31675b;
                    if (iBinderB == null) {
                        vVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        vVar = iInterfaceQueryLocalInterface instanceof x ? (x) iInterfaceQueryLocalInterface : new v(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 0);
                    }
                    f29926c = vVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static u c(String str, o oVar, boolean z3, boolean z10) {
        try {
            b();
            y.h(f29928e);
            try {
                x xVar = f29926c;
                vb.b bVar = new vb.b(f29928e.getPackageManager());
                v vVar = (v) xVar;
                Parcel parcelT = vVar.T();
                int i4 = ac.j.f319a;
                boolean z11 = true;
                parcelT.writeInt(1);
                int iO = com.bumptech.glide.f.O(parcelT, 20293);
                com.bumptech.glide.f.I(parcelT, 1, str);
                com.bumptech.glide.f.F(parcelT, 2, oVar);
                com.bumptech.glide.f.N(parcelT, 3, 4);
                parcelT.writeInt(z3 ? 1 : 0);
                com.bumptech.glide.f.N(parcelT, 4, 4);
                parcelT.writeInt(z10 ? 1 : 0);
                com.bumptech.glide.f.P(parcelT, iO);
                ac.j.b(parcelT, bVar);
                Parcel parcelO = vVar.O(parcelT, 5);
                if (parcelO.readInt() == 0) {
                    z11 = false;
                }
                parcelO.recycle();
                return z11 ? u.f29935d : new t(new p(z3, str, oVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return u.c("module call", e2);
            }
        } catch (wb.a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return u.c("module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }
}
