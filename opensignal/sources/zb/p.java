package zb;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import cc.s;
import com.google.android.gms.common.zzt;
import io.sentry.android.core.e0;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final k f26841a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f26842b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile cc.r f26843c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f26844d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f26845e;

    static {
        new k(0, l.V("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new k(1, l.V("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new k(2, l.V("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new k(3, l.V("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f26841a = new k(4, l.V("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f26842b = new k(5, l.V("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f26844d = new Object();
    }

    public static void a() {
        cc.r pVar;
        if (f26843c != null) {
            return;
        }
        s.h(f26845e);
        synchronized (f26844d) {
            try {
                if (f26843c == null) {
                    IBinder iBinderB = kc.e.c(f26845e, kc.e.f14275e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i10 = cc.q.f3669e;
                    if (iBinderB == null) {
                        pVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        pVar = iInterfaceQueryLocalInterface instanceof cc.r ? (cc.r) iInterfaceQueryLocalInterface : new cc.p(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);
                    }
                    f26843c = pVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static r b(String str, m mVar, boolean z10, boolean z11) {
        try {
            a();
            s.h(f26845e);
            zzt zztVar = new zzt(str, mVar, z10, z11);
            try {
                cc.r rVar = f26843c;
                jc.d dVar = new jc.d(f26845e.getPackageManager());
                cc.p pVar = (cc.p) rVar;
                Parcel parcelR = pVar.R();
                int i10 = oc.h.f19287a;
                boolean z12 = true;
                parcelR.writeInt(1);
                zztVar.writeToParcel(parcelR, 0);
                oc.h.b(parcelR, dVar);
                Parcel parcelD = pVar.d(parcelR, 5);
                if (parcelD.readInt() == 0) {
                    z12 = false;
                }
                parcelD.recycle();
                return z12 ? r.f26847c : new q(new n(z10, str, mVar));
            } catch (RemoteException e4) {
                e0.c("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                return r.c(e4, "module call");
            }
        } catch (kc.a e10) {
            e0.c("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return r.c(e10, "module init: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
