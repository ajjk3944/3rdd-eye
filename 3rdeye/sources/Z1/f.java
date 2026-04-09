package Z1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: BroadcastReceiverConstraintTracker.kt */
/* loaded from: classes.dex */
public abstract class f<T> extends h<T> {

    /* renamed from: f, reason: collision with root package name */
    public final e f13993f;

    public f(Context context, e2.c cVar) {
        super(context, cVar);
        this.f13993f = new e(this);
    }

    @Override // Z1.h
    public final void c() {
        androidx.work.m.e().a(g.f13994a, getClass().getSimpleName().concat(": registering receiver"));
        this.f13996b.registerReceiver(this.f13993f, e());
    }

    @Override // Z1.h
    public final void d() {
        androidx.work.m.e().a(g.f13994a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f13996b.unregisterReceiver(this.f13993f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
