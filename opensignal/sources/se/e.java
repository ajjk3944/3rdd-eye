package se;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f22004b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f22005a;

    public e(Context context) {
        this.f22005a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (f.k) {
            try {
                Iterator it = ((u.d) f.f22006l.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f22005a.unregisterReceiver(this);
    }
}
