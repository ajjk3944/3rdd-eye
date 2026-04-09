package B;

import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.U;
import o0.b;
import u.C5616a;
import v.C5658m;

/* compiled from: Camera2CameraControl.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public final C5658m f320c;

    /* renamed from: d, reason: collision with root package name */
    public final H.g f321d;

    /* renamed from: g, reason: collision with root package name */
    public b.a<Void> f324g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f318a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f319b = false;

    /* renamed from: e, reason: collision with root package name */
    public final Object f322e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public C5616a.C0536a f323f = new C5616a.C0536a();

    public g(C5658m c5658m, H.g gVar) {
        this.f320c = c5658m;
        this.f321d = gVar;
    }

    public final void a(C5616a.C0536a c0536a) {
        synchronized (this.f322e) {
            C1710q0 c1710q0 = this.f323f.f46482a;
            U.b bVar = U.b.ALWAYS_OVERRIDE;
            for (U.a<?> aVar : c1710q0.l()) {
                c0536a.f46482a.M(aVar, bVar, c1710q0.b(aVar));
            }
        }
    }
}
