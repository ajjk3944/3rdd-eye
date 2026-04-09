package bc;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final class s extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2644a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Context f2645b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2646c;

    public /* synthetic */ s() {
    }

    public void a() {
        Log.isLoggable("FirebaseMessaging", 3);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        kg.t tVar = (kg.t) this.f2646c;
        if (tVar != null) {
            Context context = ((FirebaseMessaging) tVar.f14406r).f5823b;
            this.f2645b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f2644a) {
            case 0:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) this.f2646c;
                    k kVar = (k) ((re.a) cVar.f12354g).f21531g;
                    kVar.f2615g.set(null);
                    yh.a aVar = kVar.B.J;
                    aVar.sendMessage(aVar.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) cVar.f12353d;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context2 = this.f2645b;
                            if (context2 != null) {
                                context2.unregisterReceiver(this);
                            }
                            this.f2645b = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            default:
                kg.t tVar = (kg.t) this.f2646c;
                if (tVar != null && tVar.a()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    kg.t tVar2 = (kg.t) this.f2646c;
                    ((FirebaseMessaging) tVar2.f14406r).getClass();
                    FirebaseMessaging.b(tVar2, 0L);
                    Context context3 = this.f2645b;
                    if (context3 != null) {
                        context3.unregisterReceiver(this);
                    }
                    this.f2646c = null;
                    return;
                }
                return;
        }
    }

    public s(io.sentry.internal.debugmeta.c cVar) {
        this.f2646c = cVar;
    }
}
