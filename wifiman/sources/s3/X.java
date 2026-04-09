package s3;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import r3.C7564b;

/* loaded from: classes.dex */
final class X extends B3.e {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7888c f61200b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(AbstractC7888c abstractC7888c, Looper looper) {
        super(looper);
        this.f61200b = abstractC7888c;
    }

    private static final void a(Message message) {
        Y y10 = (Y) message.obj;
        y10.b();
        y10.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f61200b.f61214C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f61200b.r()) || message.what == 5)) && !this.f61200b.c()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f61200b.f61240z = new C7564b(message.arg2);
            if (AbstractC7888c.f0(this.f61200b)) {
                AbstractC7888c abstractC7888c = this.f61200b;
                if (!abstractC7888c.f61212A) {
                    abstractC7888c.g0(3, null);
                    return;
                }
            }
            AbstractC7888c abstractC7888c2 = this.f61200b;
            C7564b c7564b = abstractC7888c2.f61240z != null ? abstractC7888c2.f61240z : new C7564b(8);
            this.f61200b.f61230p.c(c7564b);
            this.f61200b.J(c7564b);
            return;
        }
        if (i11 == 5) {
            AbstractC7888c abstractC7888c3 = this.f61200b;
            C7564b c7564b2 = abstractC7888c3.f61240z != null ? abstractC7888c3.f61240z : new C7564b(8);
            this.f61200b.f61230p.c(c7564b2);
            this.f61200b.J(c7564b2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            C7564b c7564b3 = new C7564b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f61200b.f61230p.c(c7564b3);
            this.f61200b.J(c7564b3);
            return;
        }
        if (i11 == 6) {
            this.f61200b.g0(5, null);
            AbstractC7888c abstractC7888c4 = this.f61200b;
            if (abstractC7888c4.f61235u != null) {
                abstractC7888c4.f61235u.c(message.arg2);
            }
            this.f61200b.K(message.arg2);
            AbstractC7888c.e0(this.f61200b, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f61200b.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((Y) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
