package z6;

import a0.x0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.ads.kf;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d extends f {

    /* renamed from: f, reason: collision with root package name */
    public final kf f37958f;

    public d(Context context, x0 x0Var) {
        super(context, x0Var);
        this.f37958f = new kf(18, this);
    }

    @Override // z6.f
    public final void c() {
        v.e().a(e.f37959a, getClass().getSimpleName().concat(": registering receiver"));
        this.f37961b.registerReceiver(this.f37958f, e());
    }

    @Override // z6.f
    public final void d() {
        v.e().a(e.f37959a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f37961b.unregisterReceiver(this.f37958f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
