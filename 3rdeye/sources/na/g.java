package na;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Chronology.java */
/* loaded from: classes3.dex */
public abstract class g implements Comparable<g> {

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap<String, g> f44433b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap<String, g> f44434c = new ConcurrentHashMap<>();

    static {
        try {
            Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
        }
    }

    public static g f(qa.e eVar) {
        com.google.gson.internal.c.v(eVar, "temporal");
        g gVar = (g) eVar.query(qa.i.f45476b);
        return gVar != null ? gVar : l.f44466d;
    }

    public static void j(g gVar) {
        f44433b.putIfAbsent(gVar.h(), gVar);
        f44434c.putIfAbsent(gVar.g(), gVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 11, this);
    }

    public abstract b a(qa.e eVar);

    public final <D extends b> D b(qa.d dVar) {
        D d10 = (D) dVar;
        if (equals(d10.k0())) {
            return d10;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + h() + ", actual: " + d10.k0().h());
    }

    public final <D extends b> d<D> c(qa.d dVar) {
        d<D> dVar2 = (d) dVar;
        if (equals(dVar2.f44425c.k0())) {
            return dVar2;
        }
        throw new ClassCastException("Chrono mismatch, required: " + h() + ", supplied: " + dVar2.f44425c.k0().h());
    }

    @Override // java.lang.Comparable
    public final int compareTo(g gVar) {
        return h().compareTo(gVar.h());
    }

    public final <D extends b> f<D> d(qa.d dVar) {
        f<D> fVar = (f) dVar;
        if (equals(fVar.o0().k0())) {
            return fVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + h() + ", supplied: " + fVar.o0().k0().h());
    }

    public abstract h e(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && h().compareTo(((g) obj).h()) == 0;
    }

    public abstract String g();

    public abstract String h();

    public final int hashCode() {
        return getClass().hashCode() ^ h().hashCode();
    }

    public c i(qa.d dVar) {
        try {
            return a(dVar).i0(ma.g.k0(dVar));
        } catch (ma.a e4) {
            throw new ma.a("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + dVar.getClass(), e4);
        }
    }

    public e<?> k(ma.d dVar, ma.p pVar) {
        return f.w0(this, dVar, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [na.e] */
    public e l(qa.d dVar) {
        try {
            ma.p pVarA = ma.p.a(dVar);
            try {
                dVar = k(ma.d.k0(dVar), pVarA);
                return dVar;
            } catch (ma.a unused) {
                return f.v0(pVarA, null, c(i(dVar)));
            }
        } catch (ma.a e4) {
            throw new ma.a("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + dVar.getClass(), e4);
        }
    }

    public final String toString() {
        return h();
    }
}
