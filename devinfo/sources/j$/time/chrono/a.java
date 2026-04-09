package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f26055a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f26056b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return h().compareTo(((m) obj).h());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static m i(m mVar, String str) {
        String strN;
        m mVar2 = (m) f26055a.putIfAbsent(str, mVar);
        if (mVar2 == null && (strN = mVar.n()) != null) {
            f26056b.putIfAbsent(strN, mVar);
        }
        return mVar2;
    }

    @Override // j$.time.chrono.m
    public e u(LocalDateTime localDateTime) {
        try {
            return t(localDateTime).y(j$.time.i.E(localDateTime));
        } catch (j$.time.a e2) {
            throw new j$.time.a("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e2);
        }
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && h().compareTo(((a) obj).h()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ h().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return h();
    }
}
