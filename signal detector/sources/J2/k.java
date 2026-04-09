package J2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class k extends W2.e {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f2070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0, false);
        this.f2070c = eVar;
        this.f2069b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i3 = f.f2058a;
        e eVar = this.f2070c;
        Context context = this.f2069b;
        int iC = eVar.c(context, i3);
        int i6 = h.f2062c;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentB = eVar.b(context, iC, "n");
            eVar.g(context, iC, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, 201326592));
        }
    }
}
