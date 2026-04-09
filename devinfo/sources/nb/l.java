package nb;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends ac.k {

    /* renamed from: b, reason: collision with root package name */
    public final Context f29911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f29912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 3);
        this.f29912c = eVar;
        this.f29911b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws PackageManager.NameNotFoundException {
        int i4 = message.what;
        if (i4 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i4);
            return;
        }
        int i10 = f.f29898a;
        e eVar = this.f29912c;
        Context context = this.f29911b;
        int iC = eVar.c(i10, context);
        AtomicBoolean atomicBoolean = i.f29900a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentB = eVar.b(context, iC, "n");
            eVar.g(context, iC, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, 201326592));
        }
    }
}
