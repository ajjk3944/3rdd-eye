package oa;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import oa.b;

/* compiled from: DateTimeFormatter.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f44892f;

    /* renamed from: a, reason: collision with root package name */
    public final b.d f44893a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f44894b;

    /* renamed from: c, reason: collision with root package name */
    public final i f44895c;

    /* renamed from: d, reason: collision with root package name */
    public final j f44896d;

    /* renamed from: e, reason: collision with root package name */
    public final na.l f44897e;

    static {
        b bVar = new b();
        qa.a aVar = qa.a.YEAR;
        k kVar = k.EXCEEDS_PAD;
        bVar.i(aVar, 4, 10, kVar);
        bVar.c('-');
        qa.a aVar2 = qa.a.MONTH_OF_YEAR;
        bVar.h(aVar2, 2);
        bVar.c('-');
        qa.a aVar3 = qa.a.DAY_OF_MONTH;
        bVar.h(aVar3, 2);
        j jVar = j.STRICT;
        a aVarM = bVar.m(jVar);
        na.l lVar = na.l.f44466d;
        a aVarB = aVarM.b(lVar);
        b bVar2 = new b();
        b.j jVar2 = b.j.INSENSITIVE;
        bVar2.b(jVar2);
        bVar2.a(aVarB);
        b.i iVar = b.i.f44918e;
        bVar2.b(iVar);
        bVar2.m(jVar).b(lVar);
        b bVar3 = new b();
        bVar3.b(jVar2);
        bVar3.a(aVarB);
        bVar3.k();
        bVar3.b(iVar);
        bVar3.m(jVar).b(lVar);
        b bVar4 = new b();
        qa.a aVar4 = qa.a.HOUR_OF_DAY;
        bVar4.h(aVar4, 2);
        bVar4.c(':');
        qa.a aVar5 = qa.a.MINUTE_OF_HOUR;
        bVar4.h(aVar5, 2);
        bVar4.k();
        bVar4.c(':');
        qa.a aVar6 = qa.a.SECOND_OF_MINUTE;
        bVar4.h(aVar6, 2);
        bVar4.k();
        bVar4.b(new b.f(qa.a.NANO_OF_SECOND));
        a aVarM2 = bVar4.m(jVar);
        b bVar5 = new b();
        bVar5.b(jVar2);
        bVar5.a(aVarM2);
        bVar5.b(iVar);
        bVar5.m(jVar);
        b bVar6 = new b();
        bVar6.b(jVar2);
        bVar6.a(aVarM2);
        bVar6.k();
        bVar6.b(iVar);
        bVar6.m(jVar);
        b bVar7 = new b();
        bVar7.b(jVar2);
        bVar7.a(aVarB);
        bVar7.c('T');
        bVar7.a(aVarM2);
        a aVarB2 = bVar7.m(jVar).b(lVar);
        b bVar8 = new b();
        bVar8.b(jVar2);
        bVar8.a(aVarB2);
        bVar8.b(iVar);
        a aVarB3 = bVar8.m(jVar).b(lVar);
        b bVar9 = new b();
        bVar9.a(aVarB3);
        bVar9.k();
        bVar9.c('[');
        b.j jVar3 = b.j.SENSITIVE;
        bVar9.b(jVar3);
        bVar9.b(new b.m());
        bVar9.c(']');
        bVar9.m(jVar).b(lVar);
        b bVar10 = new b();
        bVar10.a(aVarB2);
        bVar10.k();
        bVar10.b(iVar);
        bVar10.k();
        bVar10.c('[');
        bVar10.b(jVar3);
        bVar10.b(new b.m());
        bVar10.c(']');
        bVar10.m(jVar).b(lVar);
        b bVar11 = new b();
        bVar11.b(jVar2);
        bVar11.i(aVar, 4, 10, kVar);
        bVar11.c('-');
        bVar11.h(qa.a.DAY_OF_YEAR, 3);
        bVar11.k();
        bVar11.b(iVar);
        bVar11.m(jVar).b(lVar);
        b bVar12 = new b();
        bVar12.b(jVar2);
        bVar12.i(qa.c.f45469c, 4, 10, kVar);
        bVar12.d("-W");
        bVar12.h(qa.c.f45468b, 2);
        bVar12.c('-');
        qa.a aVar7 = qa.a.DAY_OF_WEEK;
        bVar12.h(aVar7, 1);
        bVar12.k();
        bVar12.b(iVar);
        bVar12.m(jVar).b(lVar);
        b bVar13 = new b();
        bVar13.b(jVar2);
        bVar13.b(new b.g());
        f44892f = bVar13.m(jVar);
        b bVar14 = new b();
        bVar14.b(jVar2);
        bVar14.h(aVar, 4);
        bVar14.h(aVar2, 2);
        bVar14.h(aVar3, 2);
        bVar14.k();
        bVar14.b(new b.i("Z", "+HHMMss"));
        bVar14.m(jVar).b(lVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        b bVar15 = new b();
        bVar15.b(jVar2);
        bVar15.b(b.j.LENIENT);
        bVar15.k();
        bVar15.e(aVar7, map);
        bVar15.d(", ");
        bVar15.j();
        bVar15.i(aVar3, 1, 2, k.NOT_NEGATIVE);
        bVar15.c(' ');
        bVar15.e(aVar2, map2);
        bVar15.c(' ');
        bVar15.h(aVar, 4);
        bVar15.c(' ');
        bVar15.h(aVar4, 2);
        bVar15.c(':');
        bVar15.h(aVar5, 2);
        bVar15.k();
        bVar15.c(':');
        bVar15.h(aVar6, 2);
        bVar15.j();
        bVar15.c(' ');
        bVar15.b(new b.i("GMT", "+HHMM"));
        bVar15.m(j.SMART).b(lVar);
    }

    public a(b.d dVar, Locale locale, i iVar, j jVar, na.l lVar) {
        com.google.gson.internal.c.v(dVar, "printerParser");
        this.f44893a = dVar;
        com.google.gson.internal.c.v(locale, CommonUrlParts.LOCALE);
        this.f44894b = locale;
        com.google.gson.internal.c.v(iVar, "decimalStyle");
        this.f44895c = iVar;
        com.google.gson.internal.c.v(jVar, "resolverStyle");
        this.f44896d = jVar;
        this.f44897e = lVar;
    }

    public final String a(qa.e eVar) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.f44893a.print(new g(eVar, this), sb);
            return sb.toString();
        } catch (IOException e4) {
            throw new ma.a(e4.getMessage(), e4);
        }
    }

    public final a b(na.l lVar) {
        na.l lVar2 = this.f44897e;
        boolean zEquals = false;
        if (lVar2 == null) {
            if (lVar == null) {
                zEquals = true;
            }
        } else if (lVar != null) {
            zEquals = lVar2.equals(lVar);
        }
        if (zEquals) {
            return this;
        }
        return new a(this.f44893a, this.f44894b, this.f44895c, this.f44896d, lVar);
    }

    public final String toString() {
        String string = this.f44893a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
