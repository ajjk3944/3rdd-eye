package j$.com.android.tools.r8;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j$.time.ZoneOffset;
import j$.time.chrono.b0;
import j$.time.chrono.e;
import j$.time.chrono.h0;
import j$.time.chrono.i;
import j$.time.chrono.j;
import j$.time.chrono.m;
import j$.time.chrono.n;
import j$.time.chrono.p;
import j$.time.chrono.w;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;
import j$.util.concurrent.t;
import j$.util.function.b;
import j$.util.function.f;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.LongConsumer;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ long A(long j, long j8) {
        long j9 = j % j8;
        if (j9 == 0) {
            return 0L;
        }
        return (((j ^ j8) >> 63) | 1) > 0 ? j9 : j9 + j8;
    }

    public static /* synthetic */ long B(long j, long j8) {
        long j9 = j / j8;
        return (j - (j8 * j9) != 0 && (((j ^ j8) >> 63) | 1) < 0) ? j9 - 1 : j9;
    }

    public static /* synthetic */ long C(long j, long j8) {
        long j9 = j - j8;
        if (((j8 ^ j) >= 0) || ((j ^ j9) >= 0)) {
            return j9;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long w(long j, int i4) {
        long j8 = i4;
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j8;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j8 != Long.MIN_VALUE) | (j >= 0)) {
                long j9 = j * j8;
                if (j == 0 || j9 / j == j8) {
                    return j9;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long x(long j, long j8) {
        long j9 = j + j8;
        if (((j8 ^ j) < 0) || ((j ^ j9) >= 0)) {
            return j9;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ Map.Entry y(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(obj), Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ boolean z(Unsafe unsafe, Object obj, long j, l lVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j8 = j;
            l lVar2 = lVar;
            if (unsafe2.compareAndSwapObject(obj2, j8, (Object) null, lVar2)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j8) != null) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j = j8;
            lVar = lVar2;
        }
    }

    public static t d(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new t(3, consumer, consumer2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b e(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.e(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d10) {
                doubleConsumer.accept(d10);
                doubleConsumer2.accept(d10);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static f f(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.f(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                longConsumer.accept(j);
                longConsumer2.accept(j);
            }
        };
    }

    public static t b(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new t(1, biConsumer, biConsumer2);
    }

    public static t c(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new t(biFunction, function);
    }

    public static void j(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static String D(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static boolean o(n nVar, q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.ERA : qVar != null && qVar.i(nVar);
    }

    public static m v(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        Object objRequireNonNull = (m) nVar.l(r.f26223b);
        j$.time.chrono.t tVar = j$.time.chrono.t.f26098c;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(tVar, "defaultObj");
        }
        return (m) objRequireNonNull;
    }

    public static int k(j jVar, q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i4 = i.f26075a[((j$.time.temporal.a) qVar).ordinal()];
            if (i4 == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i4 != 2) {
                return jVar.p().i(qVar);
            }
            return jVar.g().f26051a;
        }
        return r.a(jVar, qVar);
    }

    public static int l(n nVar, q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        return r.a(nVar, qVar);
    }

    public static long m(n nVar, q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return qVar.l(nVar);
    }

    public static m E(String str) {
        ConcurrentHashMap concurrentHashMap = j$.time.chrono.a.f26055a;
        Objects.requireNonNull(str, FacebookMediationAdapter.KEY_ID);
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = j$.time.chrono.a.f26055a;
            m mVar = (m) concurrentHashMap2.get(str);
            if (mVar == null) {
                mVar = (m) j$.time.chrono.a.f26056b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(m.class).iterator();
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    if (str.equals(mVar2.h()) || str.equals(mVar2.n())) {
                        return mVar2;
                    }
                }
                throw new j$.time.a("Unknown chronology: " + str);
            }
            p pVar = p.f26084l;
            pVar.getClass();
            j$.time.chrono.a.i(pVar, "Hijrah-umalqura");
            w wVar = w.f26101c;
            wVar.getClass();
            j$.time.chrono.a.i(wVar, "Japanese");
            b0 b0Var = b0.f26058c;
            b0Var.getClass();
            j$.time.chrono.a.i(b0Var, "Minguo");
            h0 h0Var = h0.f26074c;
            h0Var.getClass();
            j$.time.chrono.a.i(h0Var, "ThaiBuddhist");
            try {
                for (j$.time.chrono.a aVar : Arrays.asList(new j$.time.chrono.a[0])) {
                    if (!aVar.h().equals("ISO")) {
                        j$.time.chrono.a.i(aVar, aVar.h());
                    }
                }
                j$.time.chrono.t tVar = j$.time.chrono.t.f26098c;
                tVar.getClass();
                j$.time.chrono.a.i(tVar, "ISO");
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    public static Object s(n nVar, j$.time.format.a aVar) {
        if (aVar == r.f26224c) {
            return j$.time.temporal.b.ERAS;
        }
        return r.c(nVar, aVar);
    }

    public static Object q(e eVar, j$.time.format.a aVar) {
        if (aVar == r.f26222a || aVar == r.f26226e || aVar == r.f26225d) {
            return null;
        }
        if (aVar == r.g) {
            return eVar.b();
        }
        if (aVar == r.f26223b) {
            return eVar.a();
        }
        if (aVar == r.f26224c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(eVar);
    }

    public static boolean n(j$.time.chrono.b bVar, q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).isDateBased();
        }
        return qVar != null && qVar.i(bVar);
    }

    public static long t(e eVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((eVar.f().x() * 86400) + eVar.b().O()) - zoneOffset.f26051a;
    }

    public static Object r(j jVar, j$.time.format.a aVar) {
        if (aVar == r.f26226e || aVar == r.f26222a) {
            return jVar.v();
        }
        if (aVar == r.f26225d) {
            return jVar.g();
        }
        if (aVar == r.g) {
            return jVar.b();
        }
        if (aVar == r.f26223b) {
            return jVar.a();
        }
        if (aVar == r.f26224c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(jVar);
    }

    public static int h(e eVar, e eVar2) {
        int iA = eVar.f().compareTo(eVar2.f());
        return (iA == 0 && (iA = eVar.b().compareTo(eVar2.b())) == 0) ? ((j$.time.chrono.a) eVar.a()).h().compareTo(eVar2.a().h()) : iA;
    }

    public static Object p(j$.time.chrono.b bVar, j$.time.format.a aVar) {
        if (aVar == r.f26222a || aVar == r.f26226e || aVar == r.f26225d || aVar == r.g) {
            return null;
        }
        if (aVar == r.f26223b) {
            return bVar.a();
        }
        if (aVar == r.f26224c) {
            return j$.time.temporal.b.DAYS;
        }
        return aVar.a(bVar);
    }

    public static j$.time.temporal.m a(j$.time.chrono.b bVar, j$.time.temporal.m mVar) {
        return mVar.c(bVar.x(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long u(j jVar) {
        return ((jVar.f().x() * 86400) + jVar.b().O()) - jVar.g().f26051a;
    }

    public static int i(j jVar, j jVar2) {
        int iCompare = Long.compare(jVar.B(), jVar2.B());
        return (iCompare == 0 && (iCompare = jVar.b().f26178d - jVar2.b().f26178d) == 0 && (iCompare = jVar.p().compareTo(jVar2.p())) == 0 && (iCompare = jVar.v().h().compareTo(jVar2.v().h())) == 0) ? ((j$.time.chrono.a) jVar.a()).h().compareTo(jVar2.a().h()) : iCompare;
    }

    public static int g(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int iCompare = Long.compare(bVar.x(), bVar2.x());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((j$.time.chrono.a) bVar.a()).h().compareTo(bVar2.a().h());
    }
}
