package zb;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import io.sentry.android.core.e0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j extends yh.a {

    /* renamed from: d, reason: collision with root package name */
    public final Context f26827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f26828e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 4);
        this.f26828e = cVar;
        this.f26827d = context.getApplicationContext();
    }

    @Override // yh.a, android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 39);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            e0.p("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i11 = d.f26816a;
        c cVar = this.f26828e;
        Context context = this.f26827d;
        int iB = cVar.b(context, i11);
        AtomicBoolean atomicBoolean = f.f26819a;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = cVar.a(iB, context, "n");
            cVar.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
