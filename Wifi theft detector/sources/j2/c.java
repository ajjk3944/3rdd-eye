package j2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.k;

/* loaded from: classes.dex */
public abstract class c extends d {

    /* renamed from: h, reason: collision with root package name */
    public static final String f21718h = k.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final BroadcastReceiver f21719g;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, o2.a aVar) {
        super(context, aVar);
        this.f21719g = new a();
    }

    @Override // j2.d
    public void e() {
        k.c().a(f21718h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f21723b.registerReceiver(this.f21719g, g());
    }

    @Override // j2.d
    public void f() {
        k.c().a(f21718h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f21723b.unregisterReceiver(this.f21719g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
