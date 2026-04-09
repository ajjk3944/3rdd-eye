package N2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4655a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f4656b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((u) message.obj).a();
            return true;
        }
    }

    public final synchronized void a(u<?> uVar, boolean z10) {
        try {
            if (this.f4655a || z10) {
                this.f4656b.obtainMessage(1, uVar).sendToTarget();
            } else {
                this.f4655a = true;
                uVar.a();
                this.f4655a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
