package wd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f36610b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f36611a;

    public e(Context context) {
        this.f36611a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (f.f36612k) {
            try {
                Iterator it = ((x.d) f.f36613l.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f36611a.unregisterReceiver(this);
    }
}
