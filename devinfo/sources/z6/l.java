package z6;

import a0.x0;
import android.content.Context;
import android.os.Build;
import yl.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f37969a;

    /* renamed from: b, reason: collision with root package name */
    public Object f37970b;

    /* renamed from: c, reason: collision with root package name */
    public Object f37971c;

    /* renamed from: d, reason: collision with root package name */
    public Object f37972d;

    /* renamed from: e, reason: collision with root package name */
    public Object f37973e;

    public l(Context context, x0 x0Var) {
        Context applicationContext = context.getApplicationContext();
        nk.k.d(applicationContext, "getApplicationContext(...)");
        a aVar = new a(applicationContext, x0Var, 0);
        Context applicationContext2 = context.getApplicationContext();
        nk.k.d(applicationContext2, "getApplicationContext(...)");
        a aVar2 = new a(applicationContext2, x0Var, 1);
        Context applicationContext3 = context.getApplicationContext();
        nk.k.d(applicationContext3, "getApplicationContext(...)");
        String str = i.f37967a;
        Object hVar = Build.VERSION.SDK_INT >= 24 ? new h(applicationContext3, x0Var) : new j(applicationContext3, x0Var);
        Context applicationContext4 = context.getApplicationContext();
        nk.k.d(applicationContext4, "getApplicationContext(...)");
        a aVar3 = new a(applicationContext4, x0Var, 2);
        this.f37969a = context;
        this.f37970b = aVar;
        this.f37973e = aVar2;
        this.f37971c = hVar;
        this.f37972d = aVar3;
    }

    public l(ul.d dVar) {
        nk.k.e(dVar, "taskRunner");
        this.f37969a = dVar;
        this.f37972d = n.f37716a;
        this.f37973e = yl.c.f37672a;
    }
}
