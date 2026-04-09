package t7;

import com.google.android.gms.internal.play_billing.a3;
import com.google.android.gms.internal.play_billing.b3;
import com.google.android.gms.internal.play_billing.c3;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.x2;
import com.google.android.gms.internal.play_billing.y2;
import com.google.android.gms.internal.play_billing.z2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract /* synthetic */ class p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34476a = 0;

    static {
        int i4 = q.Z8;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i4 = u.f20232a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static y2 b(int i4, int i10, c cVar, String str, e3 e3Var) {
        try {
            b3 b3VarS = c3.s();
            int i11 = cVar.f34435a;
            b3VarS.d();
            c3.r((c3) b3VarS.f20201b, i11);
            String str2 = cVar.f34437c;
            b3VarS.d();
            c3.o((c3) b3VarS.f20201b, str2);
            int i12 = cVar.f34436b;
            if (i12 != 0) {
                b3VarS.d();
                c3.p((c3) b3VarS.f20201b, i12);
            }
            if (i4 != 0) {
                b3VarS.d();
                c3.q((c3) b3VarS.f20201b, i4);
            }
            if (str != null) {
                b3VarS.d();
                c3.n((c3) b3VarS.f20201b, str);
            }
            x2 x2VarU = y2.u();
            x2VarU.e(b3VarS);
            x2VarU.d();
            y2.t((y2) x2VarU.f20201b, i10);
            if (!e3Var.equals(e3.BROADCAST_ACTION_UNSPECIFIED)) {
                x2VarU.d();
                y2.p((y2) x2VarU.f20201b, e3Var);
            }
            return (y2) x2VarU.a();
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static a3 c(int i4, e3 e3Var) {
        try {
            z2 z2VarS = a3.s();
            z2VarS.d();
            a3.r((a3) z2VarS.f20201b, i4);
            if (!e3Var.equals(e3.BROADCAST_ACTION_UNSPECIFIED)) {
                z2VarS.d();
                a3.o((a3) z2VarS.f20201b, e3Var);
            }
            return (a3) z2VarS.a();
        } catch (Exception e2) {
            u.i("BillingLogger", "Unable to create logging payload", e2);
            return null;
        }
    }
}
