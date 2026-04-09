package cc;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class v extends yh.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f3675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e eVar, Looper looper) {
        super(looper, 6);
        this.f3675d = eVar;
    }

    @Override // yh.a, android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Boolean bool;
        n nVar;
        e eVar = this.f3675d;
        if (eVar.f3636x.get() != message.arg1) {
            int i10 = message.what;
            if ((i10 == 2 || i10 == 1 || i10 == 7) && (nVar = (n) message.obj) != null) {
                synchronized (nVar) {
                    nVar.f3662a = null;
                }
                e eVar2 = nVar.f3664c;
                synchronized (eVar2.f3624l) {
                    eVar2.f3624l.remove(nVar);
                }
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || i11 == 4 || i11 == 5) && !eVar.r()) {
            n nVar2 = (n) message.obj;
            if (nVar2 != null) {
                synchronized (nVar2) {
                    nVar2.f3662a = null;
                }
                e eVar3 = nVar2.f3664c;
                synchronized (eVar3.f3624l) {
                    eVar3.f3624l.remove(nVar2);
                }
                return;
            }
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            eVar.f3633u = new ConnectionResult(message.arg2, null, null);
            if (!eVar.f3634v && !TextUtils.isEmpty(eVar.n()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(eVar.n());
                    if (!eVar.f3634v) {
                        eVar.u(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = eVar.f3633u;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            eVar.j.a(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i12 == 5) {
            ConnectionResult connectionResult2 = eVar.f3633u;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            eVar.j.a(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            eVar.j.a(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i12 == 6) {
            eVar.u(5, null);
            b bVar = eVar.f3627o;
            if (bVar != null) {
                bVar.d(message.arg2);
            }
            eVar.s();
            eVar.t(5, 1, null);
            return;
        }
        if (i12 == 2 && !eVar.q()) {
            n nVar3 = (n) message.obj;
            if (nVar3 != null) {
                synchronized (nVar3) {
                    nVar3.f3662a = null;
                }
                e eVar4 = nVar3.f3664c;
                synchronized (eVar4.f3624l) {
                    eVar4.f3624l.remove(nVar3);
                }
                return;
            }
            return;
        }
        int i13 = message.what;
        if (i13 != 2 && i13 != 1 && i13 != 7) {
            io.sentry.android.core.e0.r("GmsClient", c7.a.l(i13, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i13).length() + 34)), new Exception());
            return;
        }
        n nVar4 = (n) message.obj;
        synchronized (nVar4) {
            try {
                bool = nVar4.f3662a;
                if (nVar4.f3663b) {
                    String string = nVar4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    io.sentry.android.core.e0.p("GmsClient", sb2.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            e eVar5 = nVar4.f3667f;
            int i14 = nVar4.f3665d;
            if (i14 != 0) {
                eVar5.u(1, null);
                Bundle bundle = nVar4.f3666e;
                nVar4.b(new ConnectionResult(i14, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!nVar4.a()) {
                eVar5.u(1, null);
                nVar4.b(new ConnectionResult(8, null, null));
            }
        }
        synchronized (nVar4) {
            nVar4.f3663b = true;
        }
        synchronized (nVar4) {
            nVar4.f3662a = null;
        }
        e eVar6 = nVar4.f3664c;
        synchronized (eVar6.f3624l) {
            eVar6.f3624l.remove(nVar4);
        }
    }
}
