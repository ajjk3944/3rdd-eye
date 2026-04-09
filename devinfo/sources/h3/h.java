package h3;

import com.google.android.gms.internal.play_billing.k1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f24833a;

    /* renamed from: b, reason: collision with root package name */
    public k f24834b;

    /* renamed from: c, reason: collision with root package name */
    public m f24835c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24836d;

    public final void a(Object obj) {
        this.f24836d = true;
        k kVar = this.f24834b;
        if (kVar == null || !kVar.f24839b.k(obj)) {
            return;
        }
        this.f24833a = null;
        this.f24834b = null;
        this.f24835c = null;
    }

    public final void b(Throwable th2) {
        this.f24836d = true;
        k kVar = this.f24834b;
        if (kVar == null || !kVar.f24839b.l(th2)) {
            return;
        }
        this.f24833a = null;
        this.f24834b = null;
        this.f24835c = null;
    }

    public final void finalize() {
        m mVar;
        k kVar = this.f24834b;
        if (kVar != null) {
            j jVar = kVar.f24839b;
            if (!jVar.isDone()) {
                jVar.l(new k1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f24833a, 3));
            }
        }
        if (this.f24836d || (mVar = this.f24835c) == null) {
            return;
        }
        mVar.k(null);
    }
}
