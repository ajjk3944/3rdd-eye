package uc;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import bf.n;
import cc.s;
import com.google.android.gms.internal.measurement.i4;
import io.sentry.android.core.e0;
import qc.l;
import qc.o;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f23519a = false;

    /* renamed from: b, reason: collision with root package name */
    public static b f23520b = b.LEGACY;

    public static synchronized int a(Context context) {
        try {
            s.i(context, "Context is null");
            "preferredRenderer: ".concat("null");
            if (!f23519a) {
                try {
                    vc.f fVarE0 = se.b.e0(context);
                    try {
                        vc.b bVarU = fVarE0.U();
                        s.h(bVarU);
                        xu.d.f25543i = bVarU;
                        o oVarX = fVarE0.X();
                        if (i4.f5074b == null) {
                            s.i(oVarX, "delegate must not be null");
                            i4.f5074b = oVarX;
                        }
                        f23519a = true;
                        try {
                            Parcel parcelE = fVarE0.e(fVarE0.R(), 9);
                            int i10 = parcelE.readInt();
                            parcelE.recycle();
                            if (i10 == 2) {
                                f23520b = b.LATEST;
                            }
                            jc.d dVar = new jc.d(context);
                            Parcel parcelR = fVarE0.R();
                            l.d(parcelR, dVar);
                            parcelR.writeInt(0);
                            fVarE0.S(parcelR, 10);
                        } catch (RemoteException e4) {
                            e0.c("c", "Failed to retrieve renderer type or log initialization.", e4);
                        }
                        "loadedRenderer: ".concat(String.valueOf(f23520b));
                    } catch (RemoteException e10) {
                        throw new n(e10);
                    }
                } catch (zb.e e11) {
                    return e11.f26818a;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return 0;
    }
}
