package f1;

import android.content.Context;
import androidx.work.ListenableWorker;
import h1.InterfaceC2361a;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final String f20063g = V0.m.h("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final g1.k f20064a = new g1.k();

    /* renamed from: b, reason: collision with root package name */
    public final Context f20065b;

    /* renamed from: c, reason: collision with root package name */
    public final e1.h f20066c;

    /* renamed from: d, reason: collision with root package name */
    public final ListenableWorker f20067d;

    /* renamed from: e, reason: collision with root package name */
    public final o f20068e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2361a f20069f;

    public n(Context context, e1.h hVar, ListenableWorker listenableWorker, o oVar, V2.e eVar) {
        this.f20065b = context;
        this.f20066c = hVar;
        this.f20067d = listenableWorker;
        this.f20068e = oVar;
        this.f20069f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f20066c.f19923q || N.a.b()) {
            this.f20064a.i(null);
            return;
        }
        g1.k kVar = new g1.k();
        V2.e eVar = (V2.e) this.f20069f;
        ((c3.i) eVar.f3870d).execute(new m(this, kVar, 0));
        kVar.a(new m(this, kVar, 1), (c3.i) eVar.f3870d);
    }
}
