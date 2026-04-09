package Aj;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;
import org.ocpsoft.prettytime.units.Century;
import org.ocpsoft.prettytime.units.Day;
import org.ocpsoft.prettytime.units.Decade;
import org.ocpsoft.prettytime.units.Hour;
import org.ocpsoft.prettytime.units.JustNow;
import org.ocpsoft.prettytime.units.Millennium;
import org.ocpsoft.prettytime.units.Millisecond;
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Second;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private volatile Instant f858a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Locale f859b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f860c;

    /* renamed from: d, reason: collision with root package name */
    private volatile List f861d;

    /* renamed from: e, reason: collision with root package name */
    private String f862e;

    public e() {
        this(null);
    }

    private void b(ResourcesTimeUnit resourcesTimeUnit) {
        m(resourcesTimeUnit, new org.ocpsoft.prettytime.impl.a(resourcesTimeUnit, this.f862e));
    }

    private a d(long j10) {
        long jAbs = Math.abs(j10);
        List listI = i();
        Cj.a aVar = new Cj.a();
        int i10 = 0;
        while (i10 < listI.size()) {
            g gVar = (g) listI.get(i10);
            long jAbs2 = Math.abs(gVar.b());
            long jAbs3 = Math.abs(gVar.a());
            boolean z10 = i10 == listI.size() - 1;
            if (0 == jAbs3 && !z10) {
                jAbs3 = ((g) listI.get(i10 + 1)).b() / gVar.b();
            }
            if (jAbs3 * jAbs2 > jAbs || z10) {
                aVar.i(gVar);
                if (jAbs2 > jAbs) {
                    aVar.h(h(j10));
                    aVar.g(0L);
                } else {
                    aVar.h(j10 / jAbs2);
                    aVar.g(j10 - (aVar.c() * jAbs2));
                }
                return aVar;
            }
            i10++;
        }
        return aVar;
    }

    private long h(long j10) {
        return 0 > j10 ? -1L : 1L;
    }

    private void j() {
        b(new JustNow());
        b(new Millisecond());
        b(new Second());
        b(new Minute());
        b(new Hour());
        b(new Day());
        b(new Week());
        b(new Month());
        b(new Year());
        b(new Decade());
        b(new Century());
        b(new Millennium());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Map map, g gVar) {
        map.put(gVar.toString(), (f) this.f860c.get(gVar));
    }

    private Date l() {
        return new Date();
    }

    public a c(Date date) {
        if (date == null) {
            date = l();
        }
        long time = date.getTime() - (this.f858a != null ? this.f858a : Instant.now()).toEpochMilli();
        if (time == 0) {
            time = 1;
        }
        return d(time);
    }

    public String e(a aVar) {
        if (aVar == null) {
            return f(l());
        }
        f fVarG = g(aVar.a());
        return fVarG.a(aVar, fVarG.b(aVar));
    }

    public String f(Date date) {
        if (date == null) {
            date = l();
        }
        return e(c(date));
    }

    public f g(g gVar) {
        if (gVar == null) {
            return null;
        }
        if (this.f860c.get(gVar) != null) {
            return (f) this.f860c.get(gVar);
        }
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f860c.keySet().forEach(new Consumer() { // from class: Aj.c
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f856a.k(concurrentHashMap, (g) obj);
            }
        });
        return (f) concurrentHashMap.get(gVar.toString());
    }

    public List i() {
        if (this.f861d == null) {
            ArrayList arrayList = new ArrayList(this.f860c.keySet());
            Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: Aj.d
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((g) obj).b());
                }
            }));
            this.f861d = Collections.unmodifiableList(arrayList);
        }
        return this.f861d;
    }

    public e m(g gVar, f fVar) {
        this.f861d = null;
        Map map = this.f860c;
        Objects.requireNonNull(gVar, "TimeUnit to register must not be null.");
        Objects.requireNonNull(fVar, "TimeFormat to register must not be null.");
        map.put(gVar, fVar);
        if (gVar instanceof b) {
            ((b) gVar).c(this.f859b);
        }
        if (fVar instanceof b) {
            ((b) fVar).c(this.f859b);
        }
        return this;
    }

    public String toString() {
        return "PrettyTime [reference=" + this.f858a + ", locale=" + this.f859b + "]";
    }

    public e(String str) {
        this.f859b = Locale.getDefault();
        this.f860c = new ConcurrentHashMap();
        this.f862e = str;
        j();
    }
}
