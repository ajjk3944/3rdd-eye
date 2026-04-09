package pa;

import I9.g;
import na.h;
import na.p;
import qa.b;
import qa.d;
import qa.i;
import qa.j;
import qa.k;
import qa.l;

/* compiled from: DefaultInterfaceEra.java */
/* loaded from: classes3.dex */
public abstract class a extends g implements h, d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45301b;

    public d adjustInto(d dVar) {
        return dVar.r0(((p) this).f44477c, qa.a.ERA);
    }

    @Override // I9.g, qa.e
    public int get(qa.h hVar) {
        switch (this.f45301b) {
            case 0:
                return hVar == qa.a.ERA ? ((p) this).f44477c : range(hVar).a(getLong(hVar), hVar);
            default:
                return super.get(hVar);
        }
    }

    public long getLong(qa.h hVar) {
        if (hVar == qa.a.ERA) {
            return ((p) this).f44477c;
        }
        if (hVar instanceof qa.a) {
            throw new l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        return hVar.getFrom(this);
    }

    public boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar == qa.a.ERA : hVar != null && hVar.isSupportedBy(this);
    }

    @Override // I9.g, qa.e
    public Object query(j jVar) {
        switch (this.f45301b) {
            case 0:
                if (jVar == i.f45477c) {
                    return b.ERAS;
                }
                if (jVar == i.f45476b || jVar == i.f45478d || jVar == i.f45475a || jVar == i.f45479e || jVar == i.f45480f || jVar == i.f45481g) {
                    return null;
                }
                return jVar.a(this);
            default:
                return super.query(jVar);
        }
    }

    public d u(long j4, k kVar) {
        return j4 == Long.MIN_VALUE ? q(Long.MAX_VALUE, kVar).q(1L, kVar) : q(-j4, kVar);
    }

    public /* synthetic */ a(boolean z10, int i) {
        this.f45301b = i;
    }
}
