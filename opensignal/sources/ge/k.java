package ge;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import io.sentry.android.core.e0;
import kg.r;

/* loaded from: classes.dex */
public final class k implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9556a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9557d;

    public /* synthetic */ k(int i10, Object obj) {
        this.f9556a = i10;
        this.f9557d = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f9556a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                r rVar = (r) this.f9557d;
                l lVar = (l) message.obj;
                synchronized (rVar.f14395a) {
                    if (((l) rVar.f14397g) == lVar || ((l) rVar.f14398r) == lVar) {
                        rVar.b(lVar, 2);
                    }
                }
                return true;
            default:
                int i10 = message.arg1;
                Log.isLoggable("MessengerIpcClient", 3);
                yb.i iVar = (yb.i) this.f9557d;
                synchronized (iVar) {
                    try {
                        yb.j jVar = (yb.j) iVar.f26232e.get(i10);
                        if (jVar == null) {
                            e0.p("MessengerIpcClient", "Received response for unknown request: " + i10);
                            return true;
                        }
                        iVar.f26232e.remove(i10);
                        iVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            jVar.b(new ba.l("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (jVar.f26238e) {
                            case 0:
                                if (!data.getBoolean("ack", false)) {
                                    jVar.b(new ba.l("Invalid response to one way request", null));
                                    return true;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    jVar.toString();
                                }
                                jVar.f26235b.a(null);
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    jVar.toString();
                                    String.valueOf(bundle);
                                }
                                jVar.f26235b.a(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
        }
    }
}
