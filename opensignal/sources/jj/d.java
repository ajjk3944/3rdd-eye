package jj;

import com.google.android.gms.internal.measurement.e5;
import h9.r2;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13727g = 3;

    /* renamed from: r, reason: collision with root package name */
    public final m0 f13728r;

    /* renamed from: x, reason: collision with root package name */
    public final List f13729x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f13730y;

    public d(al.b bVar, bk.f fVar) {
        super(10, false);
        this.f13730y = bVar;
        this.f13728r = m0.WIFI_ON_OFF_TRIGGER;
        this.f13729x = e5.I(o0.WIFI_ON, o0.WIFI_OFF);
        fVar.f2806d = this;
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        switch (this.f13727g) {
        }
        return this.f13728r;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        switch (this.f13727g) {
        }
        return this.f13729x;
    }

    public d(fj.g gVar) {
        super(10, false);
        this.f13730y = gVar;
        this.f13728r = m0.CELL_TRIGGER;
        this.f13729x = e5.I(o0.GSM_CELL, o0.LTE_CELL, o0.NR_CELL, o0.CDMA_CELL, o0.WCDMA_CELL);
        xi.f fVar = new xi.f(this);
        fj.n nVar = gVar.f8917f;
        if (nVar != null) {
            synchronized (nVar.K) {
                try {
                    if (!nVar.K.contains(fVar)) {
                        ch.n.b("TelephonyPhoneStateRepo", "addListener() adding CellsInfoChangedListener = " + fVar);
                        nVar.K.add(fVar);
                    } else {
                        ch.n.g("TelephonyPhoneStateRepo", "addListener() CellsInfoChangedListener already added = " + fVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public d(r2 r2Var) {
        super(10, false);
        this.f13730y = r2Var;
        this.f13728r = m0.APP_BUCKET_TRIGGER;
        this.f13729x = e5.I(o0.APP_BUCKET_ACTIVE, o0.APP_BUCKET_FREQUENT, o0.APP_BUCKET_RARE, o0.APP_BUCKET_RESTRICTED, o0.APP_BUCKET_WORKING_SET);
    }

    public d(io.sentry.internal.debugmeta.c cVar) {
        super(10, false);
        this.f13730y = cVar;
        this.f13728r = m0.SCREEN_STATE_TRIGGER;
        this.f13729x = e5.I(o0.SCREEN_ON, o0.SCREEN_OFF);
    }
}
