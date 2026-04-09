package yb;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import com.squareup.picasso.s;
import dd.r;
import io.sentry.android.core.e0;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import pb.l0;
import u.i0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static int f26203h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f26204i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f26206b;

    /* renamed from: c, reason: collision with root package name */
    public final s f26207c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f26208d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f26210f;

    /* renamed from: g, reason: collision with root package name */
    public zzd f26211g;

    /* renamed from: a, reason: collision with root package name */
    public final i0 f26205a = new i0(0);

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f26209e = new Messenger(new d(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f26206b = context;
        this.f26207c = new s(context, 7);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f26208d = scheduledThreadPoolExecutor;
    }

    public final r a(Bundle bundle) throws RemoteException {
        String string;
        synchronized (a.class) {
            int i10 = f26203h;
            f26203h = i10 + 1;
            string = Integer.toString(i10);
        }
        dd.h hVar = new dd.h();
        synchronized (this.f26205a) {
            this.f26205a.put(string, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f26207c.t() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f26206b;
        synchronized (a.class) {
            try {
                if (f26204i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f26204i = PendingIntent.getBroadcast(context, 0, intent2, nc.a.f17493a);
                }
                intent.putExtra("app", f26204i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f26209e);
        if (this.f26210f != null || this.f26211g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f26210f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f26211g.f4804a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
        } else if (this.f26207c.t() == 2) {
            this.f26206b.sendBroadcast(intent);
        } else {
            this.f26206b.startService(intent);
        }
        hVar.f7294a.b(f.f26219g, new qm.c(this, string, this.f26208d.schedule(new l0(10, hVar), 30L, TimeUnit.SECONDS), 24));
        return hVar.f7294a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f26205a) {
            try {
                dd.h hVar = (dd.h) this.f26205a.remove(str);
                if (hVar != null) {
                    hVar.a(bundle);
                    return;
                }
                e0.p("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
