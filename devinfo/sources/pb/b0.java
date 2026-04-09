package pb;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 extends ac.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f31561b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e eVar, Looper looper) {
        super(looper, 0);
        this.f31561b = eVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Boolean bool;
        t tVar;
        e eVar = this.f31561b;
        if (eVar.f31587w.get() != message.arg1) {
            int i4 = message.what;
            if ((i4 == 2 || i4 == 1 || i4 == 7) && (tVar = (t) message.obj) != null) {
                tVar.c();
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || i10 == 4 || i10 == 5) && !eVar.c()) {
            t tVar2 = (t) message.obj;
            if (tVar2 != null) {
                tVar2.c();
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            eVar.f31584t = new nb.b(message.arg2, null, null);
            if (!eVar.f31585u && !TextUtils.isEmpty(eVar.u()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(eVar.u());
                    if (!eVar.f31585u) {
                        eVar.z(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            nb.b bVar = eVar.f31584t;
            if (bVar == null) {
                bVar = new nb.b(8, null, null);
            }
            eVar.j.a(bVar);
            System.currentTimeMillis();
            return;
        }
        if (i11 == 5) {
            nb.b bVar2 = eVar.f31584t;
            if (bVar2 == null) {
                bVar2 = new nb.b(8, null, null);
            }
            eVar.j.a(bVar2);
            System.currentTimeMillis();
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            eVar.j.a(new nb.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i11 == 6) {
            eVar.z(5, null);
            b bVar3 = eVar.f31579o;
            if (bVar3 != null) {
                bVar3.S(message.arg2);
            }
            System.currentTimeMillis();
            eVar.x(5, 1, null);
            return;
        }
        if (i11 == 2 && !eVar.g()) {
            t tVar3 = (t) message.obj;
            if (tVar3 != null) {
                tVar3.c();
                return;
            }
            return;
        }
        int i12 = message.what;
        if (i12 != 2 && i12 != 1 && i12 != 7) {
            Log.wtf("GmsClient", d.h.q(i12, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i12).length() + 34)), new Exception());
            return;
        }
        t tVar4 = (t) message.obj;
        synchronized (tVar4) {
            try {
                bool = tVar4.f31668a;
                if (tVar4.f31669b) {
                    String string = tVar4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            e eVar2 = tVar4.f31673f;
            int i13 = tVar4.f31671d;
            if (i13 != 0) {
                eVar2.z(1, null);
                Bundle bundle = tVar4.f31672e;
                tVar4.b(new nb.b(i13, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!tVar4.a()) {
                eVar2.z(1, null);
                tVar4.b(new nb.b(8, null, null));
            }
        }
        synchronized (tVar4) {
            tVar4.f31669b = true;
        }
        tVar4.c();
    }
}
