package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.lc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4766lc implements InterfaceC4689ic, ToggleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f41183a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f41184b = Ga.j().w().c();

    /* renamed from: c, reason: collision with root package name */
    public En f41185c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41186d;

    public final void a(Toggle toggle) {
        En en = new En(toggle);
        this.f41185c = en;
        en.f39388c.registerObserver(this, true);
    }

    public final void b(Object obj) {
        En en = this.f41185c;
        if (en != null) {
            en.f39387b.b(obj);
        } else {
            kotlin.jvm.internal.l.l("togglesHolder");
            throw null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(boolean z10) {
        this.f41184b.execute(new B.e(this, z10, 2));
    }

    public final void a(LocationControllerObserver locationControllerObserver, boolean z10) {
        this.f41184b.execute(new com.applovin.impl.Q(this, locationControllerObserver, z10));
    }

    public static final void a(C4766lc c4766lc, LocationControllerObserver locationControllerObserver, boolean z10) {
        c4766lc.f41183a.add(locationControllerObserver);
        if (z10) {
            if (c4766lc.f41186d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(C4766lc c4766lc, boolean z10) {
        if (c4766lc.f41186d != z10) {
            c4766lc.f41186d = z10;
            p9.l lVar = z10 ? C4714jc.f41113a : C4740kc.f41139a;
            Iterator it = c4766lc.f41183a.iterator();
            while (it.hasNext()) {
                lVar.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(Object obj) {
        En en = this.f41185c;
        if (en != null) {
            en.f39387b.a(obj);
        } else {
            kotlin.jvm.internal.l.l("togglesHolder");
            throw null;
        }
    }

    public final void a(boolean z10) {
        En en = this.f41185c;
        if (en != null) {
            en.f39386a.a(z10);
        } else {
            kotlin.jvm.internal.l.l("togglesHolder");
            throw null;
        }
    }
}
