package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mu1 extends wc1 {
    public final /* synthetic */ w9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu1(w9 w9Var, Looper looper) {
        super(looper, 3);
        this.b = w9Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Boolean bool;
        if (this.b.w.get() != message.arg1) {
            int i = message.what;
            if (i == 2 || i == 1 || i == 7) {
                ad1 ad1Var = (ad1) message.obj;
                ad1Var.getClass();
                ad1Var.c();
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) && !this.b.f()) {
            ad1 ad1Var2 = (ad1) message.obj;
            ad1Var2.getClass();
            ad1Var2.c();
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            w9 w9Var = this.b;
            w9Var.t = new rh(message.arg2);
            if (!w9Var.u && !TextUtils.isEmpty(w9Var.u()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(w9Var.u());
                    w9 w9Var2 = this.b;
                    if (!w9Var2.u) {
                        w9Var2.y(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            w9 w9Var3 = this.b;
            rh rhVar = w9Var3.t;
            if (rhVar == null) {
                rhVar = new rh(8);
            }
            w9Var3.j.e(rhVar);
            System.currentTimeMillis();
            return;
        }
        if (i3 == 5) {
            w9 w9Var4 = this.b;
            rh rhVar2 = w9Var4.t;
            if (rhVar2 == null) {
                rhVar2 = new rh(8);
            }
            w9Var4.j.e(rhVar2);
            System.currentTimeMillis();
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            this.b.j.e(new rh(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i3 == 6) {
            this.b.y(5, null);
            t9 t9Var = this.b.o;
            if (t9Var != null) {
                t9Var.T(message.arg2);
            }
            System.currentTimeMillis();
            w9.x(this.b, 5, 1, null);
            return;
        }
        if (i3 == 2 && !this.b.a()) {
            ad1 ad1Var3 = (ad1) message.obj;
            ad1Var3.getClass();
            ad1Var3.c();
            return;
        }
        int i4 = message.what;
        if (i4 != 2 && i4 != 1 && i4 != 7) {
            Log.wtf("GmsClient", ex0.f("Don't know how to handle message: ", i4), new Exception());
            return;
        }
        ad1 ad1Var4 = (ad1) message.obj;
        synchronized (ad1Var4) {
            try {
                bool = ad1Var4.a;
                if (ad1Var4.b) {
                    ad1Var4.toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            w9 w9Var5 = ad1Var4.f;
            int i5 = ad1Var4.d;
            if (i5 != 0) {
                w9Var5.y(1, null);
                Bundle bundle = ad1Var4.e;
                ad1Var4.a(new rh(i5, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!ad1Var4.b()) {
                w9Var5.y(1, null);
                ad1Var4.a(new rh(8, null));
            }
        }
        synchronized (ad1Var4) {
            ad1Var4.b = true;
        }
        ad1Var4.c();
    }
}
