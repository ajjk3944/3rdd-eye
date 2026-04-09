package r3;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class l extends A3.h {

    /* renamed from: b, reason: collision with root package name */
    private final Context f60100b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7567e f60101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C7567e c7567e, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f60101c = c7567e;
        this.f60100b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        C7567e c7567e = this.f60101c;
        int iG = c7567e.g(this.f60100b);
        if (c7567e.j(iG)) {
            this.f60101c.p(this.f60100b, iG);
        }
    }
}
