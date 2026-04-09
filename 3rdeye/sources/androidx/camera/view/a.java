package androidx.camera.view;

import C.S;
import C.r;
import D7.c;
import E.u;
import I.d;
import I.j;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.camera.core.impl.J;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.E;
import com.applovin.impl.A0;
import com.applovin.impl.sdk.ad.g;
import g0.AbstractC4357d;
import java.util.ArrayList;

/* compiled from: PreviewStreamStateObserver.java */
/* loaded from: classes.dex */
public final class a implements InterfaceC1715t0.a<J.a> {

    /* renamed from: a, reason: collision with root package name */
    public final I f15171a;

    /* renamed from: b, reason: collision with root package name */
    public final E<PreviewView.e> f15172b;

    /* renamed from: c, reason: collision with root package name */
    public PreviewView.e f15173c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4357d f15174d;

    /* renamed from: e, reason: collision with root package name */
    public d f15175e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15176f = false;

    public a(I i, E<PreviewView.e> e4, AbstractC4357d abstractC4357d) {
        this.f15171a = i;
        this.f15172b = e4;
        this.f15174d = abstractC4357d;
        synchronized (this) {
            this.f15173c = e4.d();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0.a
    public final void a(J.a aVar) {
        J.a aVar2 = aVar;
        if (aVar2 == J.a.CLOSING || aVar2 == J.a.CLOSED || aVar2 == J.a.RELEASING || aVar2 == J.a.RELEASED) {
            b(PreviewView.e.IDLE);
            if (this.f15176f) {
                this.f15176f = false;
                d dVar = this.f15175e;
                if (dVar != null) {
                    dVar.cancel(false);
                    this.f15175e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((aVar2 == J.a.OPENING || aVar2 == J.a.OPEN || aVar2 == J.a.PENDING_OPEN) && !this.f15176f) {
            b(PreviewView.e.IDLE);
            ArrayList arrayList = new ArrayList();
            I i = this.f15171a;
            d dVarA = d.a(o0.b.a(new A0(this, i, arrayList)));
            c cVar = new c(this, 14);
            H.b bVarY = u.y();
            dVarA.getClass();
            I.b bVarJ = j.j(dVarA, cVar, bVarY);
            g gVar = new g(this, 2);
            I.b bVarJ2 = j.j(bVarJ, new H6.I(gVar, 2), u.y());
            this.f15175e = bVarJ2;
            j.a(bVarJ2, new N2.g(this, arrayList, (r) i), u.y());
            this.f15176f = true;
        }
    }

    public final void b(PreviewView.e eVar) {
        synchronized (this) {
            try {
                if (this.f15173c.equals(eVar)) {
                    return;
                }
                this.f15173c = eVar;
                S.a("StreamStateObserver", "Update Preview stream state to " + eVar);
                this.f15172b.k(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0.a
    public final void onError(Throwable th) {
        d dVar = this.f15175e;
        if (dVar != null) {
            dVar.cancel(false);
            this.f15175e = null;
        }
        b(PreviewView.e.IDLE);
    }
}
