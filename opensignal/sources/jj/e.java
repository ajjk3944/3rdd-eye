package jj;

import com.google.android.gms.internal.measurement.e5;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public final xi.a f13731g;

    /* renamed from: r, reason: collision with root package name */
    public final m0 f13732r;

    /* renamed from: x, reason: collision with root package name */
    public final List f13733x;

    /* renamed from: y, reason: collision with root package name */
    public hk.k f13734y;

    public e(xi.a aVar) {
        super(10, false);
        this.f13731g = aVar;
        this.f13732r = m0.APP_LIFECYCLE_TRIGGER;
        this.f13733x = e5.I(o0.APP_LIFECYCLE, o0.APP_BACKGROUND, o0.APP_FOREGROUND);
    }

    @Override // androidx.lifecycle.o
    public final hk.k g1() {
        return this.f13734y;
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        return this.f13732r;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        return this.f13733x;
    }

    @Override // androidx.lifecycle.o
    public final void r1(hk.k kVar) {
        this.f13734y = kVar;
        if (kVar == null) {
            xi.a aVar = this.f13731g;
            aVar.getClass();
            ch.n.b("AppVisibilityRepository", "Remove Listener");
            synchronized (aVar.f25311a) {
                if (aVar.f25311a.contains(this)) {
                    aVar.f25311a.remove(this);
                }
            }
            return;
        }
        xi.a aVar2 = this.f13731g;
        aVar2.getClass();
        ch.n.b("AppVisibilityRepository", "Add Listener");
        synchronized (aVar2.f25311a) {
            if (!aVar2.f25311a.contains(this)) {
                aVar2.f25311a.add(this);
            }
        }
    }
}
