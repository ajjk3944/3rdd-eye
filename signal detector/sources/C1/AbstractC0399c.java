package c1;

import A1.t;
import V0.m;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import h1.InterfaceC2361a;

/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0399c extends AbstractC0400d {

    /* renamed from: h, reason: collision with root package name */
    public static final String f5882h = m.h("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final t f5883g;

    public AbstractC0399c(Context context, InterfaceC2361a interfaceC2361a) {
        super(context, interfaceC2361a);
        this.f5883g = new t(6, this);
    }

    @Override // c1.AbstractC0400d
    public final void d() {
        m.f().a(f5882h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f5886b.registerReceiver(this.f5883g, f());
    }

    @Override // c1.AbstractC0400d
    public final void e() {
        m.f().a(f5882h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f5886b.unregisterReceiver(this.f5883g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
