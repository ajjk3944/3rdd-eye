package na;

import g0.C4356c;
import java.util.Locale;

/* compiled from: IsoEra.java */
/* loaded from: classes3.dex */
public enum m implements h {
    BCE,
    CE;

    public static m of(int i) {
        if (i == 0) {
            return BCE;
        }
        if (i == 1) {
            return CE;
        }
        throw new ma.a(C4356c.h(i, "Invalid era: "));
    }

    @Override // qa.f
    public qa.d adjustInto(qa.d dVar) {
        return dVar.r0(getValue(), qa.a.ERA);
    }

    @Override // qa.e
    public int get(qa.h hVar) {
        return hVar == qa.a.ERA ? getValue() : range(hVar).a(getLong(hVar), hVar);
    }

    public String getDisplayName(oa.m mVar, Locale locale) {
        oa.b bVar = new oa.b();
        bVar.f(qa.a.ERA, mVar);
        return bVar.l(locale).a(this);
    }

    @Override // qa.e
    public long getLong(qa.h hVar) {
        if (hVar == qa.a.ERA) {
            return getValue();
        }
        if (hVar instanceof qa.a) {
            throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        return hVar.getFrom(this);
    }

    public int getValue() {
        return ordinal();
    }

    @Override // qa.e
    public boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar == qa.a.ERA : hVar != null && hVar.isSupportedBy(this);
    }

    @Override // qa.e
    public <R> R query(qa.j<R> jVar) {
        if (jVar == qa.i.f45477c) {
            return (R) qa.b.ERAS;
        }
        if (jVar == qa.i.f45476b || jVar == qa.i.f45478d || jVar == qa.i.f45475a || jVar == qa.i.f45479e || jVar == qa.i.f45480f || jVar == qa.i.f45481g) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // qa.e
    public qa.m range(qa.h hVar) {
        if (hVar == qa.a.ERA) {
            return hVar.range();
        }
        if (hVar instanceof qa.a) {
            throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        return hVar.rangeRefinedBy(this);
    }
}
