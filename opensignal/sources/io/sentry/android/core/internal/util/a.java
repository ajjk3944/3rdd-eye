package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import io.sentry.android.core.d0;
import io.sentry.n0;
import io.sentry.o0;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11636a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f11637d;

    public /* synthetic */ a(c cVar, int i10) {
        this.f11636a = i10;
        this.f11637d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.sentry.q qVarA;
        io.sentry.q qVarA2;
        switch (this.f11636a) {
            case 0:
                c cVar = this.f11637d;
                cVar.R(true);
                qVarA = c.J.a();
                try {
                    c.K.clear();
                    qVarA.close();
                    qVarA2 = c.H.a();
                    try {
                        c.I = null;
                        qVarA2.close();
                        d0.f11554x.i(cVar);
                        return;
                    } finally {
                        try {
                            qVarA2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } finally {
                    try {
                        qVarA.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            case 1:
                this.f11637d.i();
                return;
            case 2:
                this.f11637d.R(false);
                return;
            default:
                c cVar2 = this.f11637d;
                cVar2.V(null);
                n0 n0VarQ = cVar2.q();
                if (n0VarQ == n0.DISCONNECTED) {
                    cVar2.G.set(false);
                    qVarA = c.J.a();
                    try {
                        Iterator it = c.K.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                        }
                        qVarA.close();
                    } finally {
                    }
                }
                qVarA2 = cVar2.f11645y.a();
                try {
                    Iterator it2 = cVar2.f11644x.iterator();
                    while (it2.hasNext()) {
                        ((o0) it2.next()).f(n0VarQ);
                    }
                    qVarA2.close();
                    cVar2.i();
                    return;
                } finally {
                }
        }
    }
}
