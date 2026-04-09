package ya;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.kf;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.sk;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public boolean f37499d;

    /* renamed from: e, reason: collision with root package name */
    public Context f37500e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37498c = false;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f37497b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final kf f37496a = new kf(16, this);

    public final synchronized void a(Context context) {
        try {
            if (this.f37498c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f37500e = applicationContext;
            if (applicationContext == null) {
                this.f37500e = context;
            }
            sk.a(this.f37500e);
            pk pkVar = sk.f16431z4;
            va.s sVar = va.s.f36163e;
            this.f37499d = ((Boolean) sVar.f36166c.a(pkVar)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) sVar.f36166c.a(sk.f16230mc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f37500e.registerReceiver(this.f37496a, intentFilter);
            } else {
                this.f37500e.registerReceiver(this.f37496a, intentFilter, 4);
            }
            this.f37498c = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, kf kfVar, IntentFilter intentFilter) {
        if (this.f37499d) {
            this.f37497b.put(kfVar, intentFilter);
            return;
        }
        sk.a(context);
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16230mc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(kfVar, intentFilter);
        } else {
            context.registerReceiver(kfVar, intentFilter, 4);
        }
    }

    public final synchronized void c(Context context, kf kfVar) {
        if (this.f37499d) {
            this.f37497b.remove(kfVar);
        } else {
            context.unregisterReceiver(kfVar);
        }
    }
}
