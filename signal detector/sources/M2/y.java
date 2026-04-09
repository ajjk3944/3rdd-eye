package M2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class y extends S3.d {

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0165e f2823b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2824c;

    public y(AbstractC0165e abstractC0165e, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f2823b = abstractC0165e;
        this.f2824c = i;
    }

    @Override // S3.d
    public final boolean I0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) X2.g.a(parcel, Bundle.CREATOR);
            X2.g.c(parcel);
            u.f(this.f2823b, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0165e abstractC0165e = this.f2823b;
            int i6 = this.f2824c;
            abstractC0165e.getClass();
            A a6 = new A(abstractC0165e, i3, strongBinder, bundle);
            x xVar = abstractC0165e.f2738f;
            xVar.sendMessage(xVar.obtainMessage(1, i6, -1, a6));
            this.f2823b = null;
        } else if (i == 2) {
            parcel.readInt();
            X2.g.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i7 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            C c6 = (C) X2.g.a(parcel, C.CREATOR);
            X2.g.c(parcel);
            AbstractC0165e abstractC0165e2 = this.f2823b;
            u.f(abstractC0165e2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            u.e(c6);
            abstractC0165e2.f2753v = c6;
            if (abstractC0165e2 instanceof V2.b) {
                C0166f c0166f = c6.f2711d;
                k kVarB = k.b();
                l lVar = c0166f == null ? null : c0166f.f2755a;
                synchronized (kVarB) {
                    if (lVar == null) {
                        lVar = k.f2786c;
                    } else {
                        l lVar2 = (l) kVarB.f2787a;
                        if (lVar2 == null || lVar2.f2788a < lVar.f2788a) {
                        }
                    }
                    kVarB.f2787a = lVar;
                }
            }
            Bundle bundle2 = c6.f2708a;
            u.f(this.f2823b, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0165e abstractC0165e3 = this.f2823b;
            int i8 = this.f2824c;
            abstractC0165e3.getClass();
            A a7 = new A(abstractC0165e3, i7, strongBinder2, bundle2);
            x xVar2 = abstractC0165e3.f2738f;
            xVar2.sendMessage(xVar2.obtainMessage(1, i8, -1, a7));
            this.f2823b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
