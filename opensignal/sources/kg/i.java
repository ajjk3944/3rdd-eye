package kg;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.measurement.e5;
import io.sentry.android.core.u0;
import io.sentry.n4;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14368c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static d0 f14369d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14370a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14371b;

    public i(ExecutorService executorService) {
        this.f14371b = new u.e(0);
        this.f14370a = executorService;
    }

    public static dd.r a(Context context, Intent intent, boolean z10) {
        d0 d0Var;
        Log.isLoggable("FirebaseMessaging", 3);
        synchronized (f14368c) {
            try {
                if (f14369d == null) {
                    f14369d = new d0(context);
                }
                d0Var = f14369d;
            } finally {
            }
        }
        if (!z10) {
            return d0Var.b(intent).e(new e7.d(0), new u0(12));
        }
        if (r.h().n(context)) {
            synchronized (a0.f14345b) {
                try {
                    a0.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        a0.f14346c.a(a0.f14344a);
                    }
                    dd.r rVarB = d0Var.b(intent);
                    io.sentry.android.replay.capture.e eVar = new io.sentry.android.replay.capture.e(11, intent);
                    rVarB.getClass();
                    rVarB.f7319b.o(new dd.m((Executor) dd.i.f7295a, (dd.c) eVar));
                    rVarB.q();
                } finally {
                }
            }
        } else {
            d0Var.b(intent);
        }
        return e5.u(-1);
    }

    public dd.r b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f14370a;
        e7.d dVar = (e7.d) this.f14371b;
        boolean z10 = gc.b.e() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? e5.n(dVar, new n4(context, 6, intent)).f(dVar, new androidx.media3.exoplayer.trackselection.g(context, intent, z11)) : a(context, intent, z11);
    }

    public i(Context context) {
        this.f14370a = context;
        this.f14371b = new e7.d(0);
    }
}
