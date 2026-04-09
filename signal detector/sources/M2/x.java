package M2;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class x extends W2.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0165e f2822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(AbstractC0165e abstractC0165e, Looper looper) {
        super(looper, 1);
        this.f2822b = abstractC0165e;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Boolean bool;
        s sVar;
        AbstractC0165e abstractC0165e = this.f2822b;
        if (abstractC0165e.f2754w.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (sVar = (s) message.obj) != null) {
                sVar.c();
                return;
            }
            return;
        }
        int i3 = message.what;
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !abstractC0165e.d()) {
            s sVar2 = (s) message.obj;
            if (sVar2 != null) {
                sVar2.c();
                return;
            }
            return;
        }
        int i6 = message.what;
        if (i6 == 4) {
            abstractC0165e.f2751t = new J2.b(message.arg2, null, null);
            if (!abstractC0165e.f2752u && !TextUtils.isEmpty(abstractC0165e.u()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC0165e.u());
                    if (!abstractC0165e.f2752u) {
                        abstractC0165e.z(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            J2.b bVar = abstractC0165e.f2751t;
            if (bVar == null) {
                bVar = new J2.b(8, null, null);
            }
            abstractC0165e.f2741j.a(bVar);
            System.currentTimeMillis();
            return;
        }
        if (i6 == 5) {
            J2.b bVar2 = abstractC0165e.f2751t;
            if (bVar2 == null) {
                bVar2 = new J2.b(8, null, null);
            }
            abstractC0165e.f2741j.a(bVar2);
            System.currentTimeMillis();
            return;
        }
        if (i6 == 3) {
            Object obj = message.obj;
            abstractC0165e.f2741j.a(new J2.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i6 == 6) {
            abstractC0165e.z(5, null);
            InterfaceC0162b interfaceC0162b = abstractC0165e.f2746o;
            if (interfaceC0162b != null) {
                interfaceC0162b.g0(message.arg2);
            }
            System.currentTimeMillis();
            abstractC0165e.x(5, 1, null);
            return;
        }
        if (i6 == 2 && !abstractC0165e.i()) {
            s sVar3 = (s) message.obj;
            if (sVar3 != null) {
                sVar3.c();
                return;
            }
            return;
        }
        int i7 = message.what;
        if (i7 != 2 && i7 != 1 && i7 != 7) {
            Log.wtf("GmsClient", A.f.i(i7, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i7).length() + 34)), new Exception());
            return;
        }
        s sVar4 = (s) message.obj;
        synchronized (sVar4) {
            try {
                bool = sVar4.f2810a;
                if (sVar4.f2811b) {
                    String string = sVar4.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC0165e abstractC0165e2 = sVar4.f2815f;
            int i8 = sVar4.f2813d;
            if (i8 != 0) {
                abstractC0165e2.z(1, null);
                Bundle bundle = sVar4.f2814e;
                sVar4.b(new J2.b(i8, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!sVar4.a()) {
                abstractC0165e2.z(1, null);
                sVar4.b(new J2.b(8, null, null));
            }
        }
        synchronized (sVar4) {
            sVar4.f2811b = true;
        }
        sVar4.c();
    }
}
