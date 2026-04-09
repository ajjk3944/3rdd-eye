package pb;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f31668a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f31670c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31671d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f31672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f31673f;

    public t(e eVar, int i4, Bundle bundle) {
        this.f31673f = eVar;
        Boolean bool = Boolean.TRUE;
        this.f31670c = eVar;
        this.f31668a = bool;
        this.f31669b = false;
        this.f31671d = i4;
        this.f31672e = bundle;
    }

    public abstract boolean a();

    public abstract void b(nb.b bVar);

    public final void c() {
        d();
        e eVar = this.f31670c;
        synchronized (eVar.f31576l) {
            eVar.f31576l.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f31668a = null;
        }
    }
}
