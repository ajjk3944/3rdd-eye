package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static final a f26151f = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public n f26152a;

    /* renamed from: b, reason: collision with root package name */
    public final n f26153b;

    /* renamed from: c, reason: collision with root package name */
    public final List f26154c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26155d;

    /* renamed from: e, reason: collision with root package name */
    public int f26156e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.h hVar = j$.time.temporal.j.f26212a;
        map.put('Q', hVar);
        map.put('q', hVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.f26219a);
    }

    public n() {
        this.f26152a = this;
        this.f26154c = new ArrayList();
        this.f26156e = -1;
        this.f26153b = null;
        this.f26155d = false;
    }

    public n(n nVar) {
        this.f26152a = this;
        this.f26154c = new ArrayList();
        this.f26156e = -1;
        this.f26153b = nVar;
        this.f26155d = true;
    }

    public final void g(j$.time.temporal.q qVar, int i4) {
        Objects.requireNonNull(qVar, "field");
        if (i4 < 1 || i4 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i4);
        }
        f(new i(qVar, i4, i4, u.NOT_NEGATIVE));
    }

    public final void h(j$.time.temporal.q qVar, int i4, int i10, u uVar) {
        if (i4 == i10 && uVar == u.NOT_NEGATIVE) {
            g(qVar, i10);
            return;
        }
        Objects.requireNonNull(qVar, "field");
        Objects.requireNonNull(uVar, "signStyle");
        if (i4 < 1 || i4 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i4);
        }
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i10 < i4) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i10 + " < " + i4);
        }
        f(new i(qVar, i4, i10, uVar));
    }

    public final void f(i iVar) {
        i iVarA;
        n nVar = this.f26152a;
        int i4 = nVar.f26156e;
        if (i4 < 0) {
            nVar.f26156e = b(iVar);
            return;
        }
        i iVar2 = (i) ((ArrayList) nVar.f26154c).get(i4);
        int i10 = iVar.f26136b;
        int i11 = iVar.f26137c;
        if (i10 == i11 && iVar.f26138d == u.NOT_NEGATIVE) {
            iVarA = iVar2.b(i11);
            b(iVar.a());
            this.f26152a.f26156e = i4;
        } else {
            iVarA = iVar2.a();
            this.f26152a.f26156e = b(iVar);
        }
        ((ArrayList) this.f26152a.f26154c).set(i4, iVarA);
    }

    public final void e(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        v vVar = v.FULL;
        b(new m(aVar, vVar, new b(new r(0, Collections.singletonMap(vVar, linkedHashMap)))));
    }

    public final void c(char c9) {
        b(new d(c9));
    }

    public final void d(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new d(str.charAt(0)));
        } else {
            b(new l(str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        e eVar = dateTimeFormatter.f26122a;
        if (eVar.f26132b) {
            eVar = new e(eVar.f26131a, false);
        }
        b(eVar);
    }

    public final void j() {
        n nVar = this.f26152a;
        nVar.f26156e = -1;
        this.f26152a = new n(nVar);
    }

    public final void i() {
        n nVar = this.f26152a;
        if (nVar.f26153b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) nVar.f26154c).size() > 0) {
            n nVar2 = this.f26152a;
            e eVar = new e(nVar2.f26154c, nVar2.f26155d);
            this.f26152a = this.f26152a.f26153b;
            b(eVar);
            return;
        }
        this.f26152a = this.f26152a.f26153b;
    }

    public final int b(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        n nVar = this.f26152a;
        nVar.getClass();
        ((ArrayList) nVar.f26154c).add(fVar);
        this.f26152a.f26156e = -1;
        return ((ArrayList) r2.f26154c).size() - 1;
    }

    public final DateTimeFormatter k(t tVar, j$.time.chrono.m mVar) {
        return l(Locale.getDefault(), tVar, mVar);
    }

    public final DateTimeFormatter l(Locale locale, t tVar, j$.time.chrono.m mVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f26152a.f26153b != null) {
            i();
        }
        e eVar = new e(this.f26154c, false);
        s sVar = s.f26165a;
        return new DateTimeFormatter(eVar, locale, tVar, mVar);
    }
}
