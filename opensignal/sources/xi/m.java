package xi;

import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.List;
import jj.m0;
import jj.o0;

/* loaded from: classes.dex */
public final class m extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public final qm.c f25350g;

    /* renamed from: r, reason: collision with root package name */
    public final m0 f25351r;

    /* renamed from: x, reason: collision with root package name */
    public final List f25352x;

    /* renamed from: y, reason: collision with root package name */
    public hk.k f25353y;

    public m(qm.c cVar) {
        super(10, false);
        this.f25350g = cVar;
        this.f25351r = m0.LOCATION_SETTINGS_UPDATED_TRIGGER;
        this.f25352x = e5.I(o0.LOCATION_ENABLED_MANDATORY, o0.LOCATION_DISABLED_MANDATORY, o0.LOCATION_ENABLED_OPTIONAL, o0.LOCATION_DISABLED_OPTIONAL);
    }

    @Override // androidx.lifecycle.o
    public final hk.k g1() {
        return this.f25353y;
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        return this.f25351r;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        return this.f25352x;
    }

    @Override // androidx.lifecycle.o
    public final void r1(hk.k kVar) {
        this.f25353y = kVar;
        if (kVar == null) {
            qm.c cVar = this.f25350g;
            cVar.getClass();
            synchronized (((ArrayList) cVar.f20920r)) {
                ((ArrayList) cVar.f20920r).remove(this);
            }
            return;
        }
        qm.c cVar2 = this.f25350g;
        cVar2.getClass();
        synchronized (((ArrayList) cVar2.f20920r)) {
            if (!((ArrayList) cVar2.f20920r).contains(this)) {
                ((ArrayList) cVar2.f20920r).add(this);
            }
        }
    }
}
