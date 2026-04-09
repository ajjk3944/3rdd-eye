package com.yandex.mobile.ads.impl;

import c9.C2099t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class nu implements wf2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<sv0> f31000a;

    /* renamed from: b, reason: collision with root package name */
    private final List<xh0> f31001b;

    /* renamed from: c, reason: collision with root package name */
    private final List<y52> f31002c;

    /* renamed from: d, reason: collision with root package name */
    private final qu f31003d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31004e;

    /* renamed from: f, reason: collision with root package name */
    private final hz1 f31005f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31006g;

    /* renamed from: h, reason: collision with root package name */
    private final int f31007h;
    private final String i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f31008a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f31009b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f31010c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private qu f31011d;

        /* renamed from: e, reason: collision with root package name */
        private String f31012e;

        /* renamed from: f, reason: collision with root package name */
        private hz1 f31013f;

        /* renamed from: g, reason: collision with root package name */
        private String f31014g;

        /* renamed from: h, reason: collision with root package name */
        private int f31015h;
        private String i;

        public final a a(List list) {
            ArrayList arrayList = this.f31009b;
            if (list == null) {
                list = C2099t.f18581b;
            }
            arrayList.addAll(list);
            return this;
        }

        public final a b(List list) {
            ArrayList arrayList = this.f31008a;
            if (list == null) {
                list = C2099t.f18581b;
            }
            arrayList.addAll(list);
            return this;
        }

        public final a c(List<y52> list) {
            ArrayList arrayList = this.f31010c;
            if (list == null) {
                list = C2099t.f18581b;
            }
            arrayList.addAll(list);
            return this;
        }

        public final void a(y52 trackingEvent) {
            kotlin.jvm.internal.l.f(trackingEvent, "trackingEvent");
            this.f31010c.add(trackingEvent);
        }

        public final a b(String str) {
            this.f31012e = str;
            return this;
        }

        public final a c(String str) {
            this.f31014g = str;
            return this;
        }

        public final a a(String str) {
            this.i = str;
            return this;
        }

        public final void a(qu creativeExtensions) {
            kotlin.jvm.internal.l.f(creativeExtensions, "creativeExtensions");
            this.f31011d = creativeExtensions;
        }

        public final a a(int i) {
            this.f31015h = i;
            return this;
        }

        public final a a(hz1 hz1Var) {
            this.f31013f = hz1Var;
            return this;
        }

        public final nu a() {
            return new nu(this.f31008a, this.f31009b, this.f31010c, this.f31011d, this.f31012e, this.f31013f, this.f31014g, this.f31015h, this.i);
        }
    }

    public nu(ArrayList mediaFiles, ArrayList icons, ArrayList trackingEventsList, qu quVar, String str, hz1 hz1Var, String str2, int i, String str3) {
        kotlin.jvm.internal.l.f(mediaFiles, "mediaFiles");
        kotlin.jvm.internal.l.f(icons, "icons");
        kotlin.jvm.internal.l.f(trackingEventsList, "trackingEventsList");
        this.f31000a = mediaFiles;
        this.f31001b = icons;
        this.f31002c = trackingEventsList;
        this.f31003d = quVar;
        this.f31004e = str;
        this.f31005f = hz1Var;
        this.f31006g = str2;
        this.f31007h = i;
        this.i = str3;
    }

    @Override // com.yandex.mobile.ads.impl.wf2
    public final Map<String, List<String>> a() {
        List<y52> list = this.f31002c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (y52 y52Var : list) {
            String strA = y52Var.a();
            Object arrayList = linkedHashMap.get(strA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strA, arrayList);
            }
            ((List) arrayList).add(y52Var.c());
        }
        return linkedHashMap;
    }

    public final String b() {
        return this.i;
    }

    public final String c() {
        return this.f31004e;
    }

    public final qu d() {
        return this.f31003d;
    }

    public final int e() {
        return this.f31007h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu)) {
            return false;
        }
        nu nuVar = (nu) obj;
        return kotlin.jvm.internal.l.b(this.f31000a, nuVar.f31000a) && kotlin.jvm.internal.l.b(this.f31001b, nuVar.f31001b) && kotlin.jvm.internal.l.b(this.f31002c, nuVar.f31002c) && kotlin.jvm.internal.l.b(this.f31003d, nuVar.f31003d) && kotlin.jvm.internal.l.b(this.f31004e, nuVar.f31004e) && kotlin.jvm.internal.l.b(this.f31005f, nuVar.f31005f) && kotlin.jvm.internal.l.b(this.f31006g, nuVar.f31006g) && this.f31007h == nuVar.f31007h && kotlin.jvm.internal.l.b(this.i, nuVar.i);
    }

    public final List<xh0> f() {
        return this.f31001b;
    }

    public final String g() {
        return this.f31006g;
    }

    public final List<sv0> h() {
        return this.f31000a;
    }

    public final int hashCode() {
        int iA = m9.a(this.f31002c, m9.a(this.f31001b, this.f31000a.hashCode() * 31, 31), 31);
        qu quVar = this.f31003d;
        int iHashCode = (iA + (quVar == null ? 0 : quVar.hashCode())) * 31;
        String str = this.f31004e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        hz1 hz1Var = this.f31005f;
        int iHashCode3 = (iHashCode2 + (hz1Var == null ? 0 : hz1Var.hashCode())) * 31;
        String str2 = this.f31006g;
        int iA2 = sx1.a(this.f31007h, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.i;
        return iA2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final hz1 i() {
        return this.f31005f;
    }

    public final List<y52> j() {
        return this.f31002c;
    }

    public final String toString() {
        List<sv0> list = this.f31000a;
        List<xh0> list2 = this.f31001b;
        List<y52> list3 = this.f31002c;
        qu quVar = this.f31003d;
        String str = this.f31004e;
        hz1 hz1Var = this.f31005f;
        String str2 = this.f31006g;
        int i = this.f31007h;
        String str3 = this.i;
        StringBuilder sb = new StringBuilder("Creative(mediaFiles=");
        sb.append(list);
        sb.append(", icons=");
        sb.append(list2);
        sb.append(", trackingEventsList=");
        sb.append(list3);
        sb.append(", creativeExtensions=");
        sb.append(quVar);
        sb.append(", clickThroughUrl=");
        sb.append(str);
        sb.append(", skipOffset=");
        sb.append(hz1Var);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", durationMillis=");
        sb.append(i);
        sb.append(", adParameters=");
        return B4.f.c(sb, str3, ")");
    }
}
