package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2097r;
import c9.C2099t;
import c9.C2100u;
import com.facebook.ads.AdSDKNotificationListener;
import com.yandex.mobile.ads.impl.hb2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class za2 implements wf2 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36363a;

    /* renamed from: b, reason: collision with root package name */
    private final List<nu> f36364b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<String>> f36365c;

    /* renamed from: d, reason: collision with root package name */
    private final hb2 f36366d;

    /* renamed from: e, reason: collision with root package name */
    private final String f36367e;

    /* renamed from: f, reason: collision with root package name */
    private final String f36368f;

    /* renamed from: g, reason: collision with root package name */
    private final String f36369g;

    /* renamed from: h, reason: collision with root package name */
    private final String f36370h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private final mh2 f36371j;

    /* renamed from: k, reason: collision with root package name */
    private final Integer f36372k;

    /* renamed from: l, reason: collision with root package name */
    private final String f36373l;

    /* renamed from: m, reason: collision with root package name */
    private final hk2 f36374m;

    /* renamed from: n, reason: collision with root package name */
    private final List<ja2> f36375n;

    /* renamed from: o, reason: collision with root package name */
    private final Map<String, List<String>> f36376o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f36377a;

        /* renamed from: b, reason: collision with root package name */
        private final ed2 f36378b;

        /* renamed from: c, reason: collision with root package name */
        private hk2 f36379c;

        /* renamed from: d, reason: collision with root package name */
        private String f36380d;

        /* renamed from: e, reason: collision with root package name */
        private String f36381e;

        /* renamed from: f, reason: collision with root package name */
        private String f36382f;

        /* renamed from: g, reason: collision with root package name */
        private String f36383g;

        /* renamed from: h, reason: collision with root package name */
        private String f36384h;
        private mh2 i;

        /* renamed from: j, reason: collision with root package name */
        private Integer f36385j;

        /* renamed from: k, reason: collision with root package name */
        private String f36386k;

        /* renamed from: l, reason: collision with root package name */
        private final ArrayList f36387l;

        /* renamed from: m, reason: collision with root package name */
        private final ArrayList f36388m;

        /* renamed from: n, reason: collision with root package name */
        private final LinkedHashMap f36389n;

        /* renamed from: o, reason: collision with root package name */
        private hb2 f36390o;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Context context, boolean z10) {
            this(z10, new ed2(context));
            kotlin.jvm.internal.l.f(context, "context");
        }

        public final a a(List list) {
            ArrayList arrayList = this.f36388m;
            if (list == null) {
                list = C2099t.f18581b;
            }
            arrayList.addAll(list);
            return this;
        }

        public final void b(String impression) {
            kotlin.jvm.internal.l.f(impression, "impression");
            LinkedHashMap linkedHashMap = this.f36389n;
            Object arrayList = linkedHashMap.get(AdSDKNotificationListener.IMPRESSION_EVENT);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(AdSDKNotificationListener.IMPRESSION_EVENT, arrayList);
            }
            ((List) arrayList).add(impression);
        }

        public final a c(String str) {
            this.f36380d = str;
            return this;
        }

        public final a d(String str) {
            this.f36381e = str;
            return this;
        }

        public final a e(String str) {
            this.f36382f = str;
            return this;
        }

        public final a f(String str) {
            this.f36386k = str;
            return this;
        }

        public final a g(String str) {
            this.f36383g = str;
            return this;
        }

        public final a h(String str) {
            this.f36384h = str;
            return this;
        }

        public final a a(ArrayList arrayList) {
            this.f36387l.addAll(arrayList);
            return this;
        }

        private a(boolean z10, ed2 ed2Var) {
            this.f36377a = z10;
            this.f36378b = ed2Var;
            this.f36387l = new ArrayList();
            this.f36388m = new ArrayList();
            this.f36389n = new LinkedHashMap();
            this.f36390o = new hb2.a().a();
        }

        public final void a(String error) {
            kotlin.jvm.internal.l.f(error, "error");
            LinkedHashMap linkedHashMap = this.f36389n;
            Object arrayList = linkedHashMap.get(com.vungle.ads.internal.presenter.g.ERROR);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(com.vungle.ads.internal.presenter.g.ERROR, arrayList);
            }
            ((List) arrayList).add(error);
        }

        public final a a(Map<String, ? extends List<String>> map) {
            if (map == null) {
                map = C2100u.f18582b;
            }
            for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (value == null) {
                    value = C2099t.f18581b;
                }
                Iterator it = C2097r.n0(value).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    LinkedHashMap linkedHashMap = this.f36389n;
                    Object arrayList = linkedHashMap.get(key);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(key, arrayList);
                    }
                    ((List) arrayList).add(str);
                }
            }
            return this;
        }

        public final za2 a() {
            return new za2(this.f36377a, this.f36387l, this.f36389n, this.f36390o, this.f36380d, this.f36381e, this.f36382f, this.f36383g, this.f36384h, this.i, this.f36385j, this.f36386k, this.f36379c, this.f36388m, this.f36378b.a(this.f36389n, this.i));
        }

        public final void a(Integer num) {
            this.f36385j = num;
        }

        public final a a(hb2 videoAdExtensions) {
            kotlin.jvm.internal.l.f(videoAdExtensions, "videoAdExtensions");
            this.f36390o = videoAdExtensions;
            return this;
        }

        public final a a(mh2 viewableImpression) {
            kotlin.jvm.internal.l.f(viewableImpression, "viewableImpression");
            this.i = viewableImpression;
            return this;
        }

        public final a a(hk2 hk2Var) {
            this.f36379c = hk2Var;
            return this;
        }
    }

    public za2(boolean z10, ArrayList creatives, LinkedHashMap rawTrackingEvents, hb2 videoAdExtensions, String str, String str2, String str3, String str4, String str5, mh2 mh2Var, Integer num, String str6, hk2 hk2Var, ArrayList adVerifications, Map trackingEvents) {
        kotlin.jvm.internal.l.f(creatives, "creatives");
        kotlin.jvm.internal.l.f(rawTrackingEvents, "rawTrackingEvents");
        kotlin.jvm.internal.l.f(videoAdExtensions, "videoAdExtensions");
        kotlin.jvm.internal.l.f(adVerifications, "adVerifications");
        kotlin.jvm.internal.l.f(trackingEvents, "trackingEvents");
        this.f36363a = z10;
        this.f36364b = creatives;
        this.f36365c = rawTrackingEvents;
        this.f36366d = videoAdExtensions;
        this.f36367e = str;
        this.f36368f = str2;
        this.f36369g = str3;
        this.f36370h = str4;
        this.i = str5;
        this.f36371j = mh2Var;
        this.f36372k = num;
        this.f36373l = str6;
        this.f36374m = hk2Var;
        this.f36375n = adVerifications;
        this.f36376o = trackingEvents;
    }

    @Override // com.yandex.mobile.ads.impl.wf2
    public final Map<String, List<String>> a() {
        return this.f36376o;
    }

    public final String b() {
        return this.f36367e;
    }

    public final String c() {
        return this.f36368f;
    }

    public final List<ja2> d() {
        return this.f36375n;
    }

    public final List<nu> e() {
        return this.f36364b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za2)) {
            return false;
        }
        za2 za2Var = (za2) obj;
        return this.f36363a == za2Var.f36363a && kotlin.jvm.internal.l.b(this.f36364b, za2Var.f36364b) && kotlin.jvm.internal.l.b(this.f36365c, za2Var.f36365c) && kotlin.jvm.internal.l.b(this.f36366d, za2Var.f36366d) && kotlin.jvm.internal.l.b(this.f36367e, za2Var.f36367e) && kotlin.jvm.internal.l.b(this.f36368f, za2Var.f36368f) && kotlin.jvm.internal.l.b(this.f36369g, za2Var.f36369g) && kotlin.jvm.internal.l.b(this.f36370h, za2Var.f36370h) && kotlin.jvm.internal.l.b(this.i, za2Var.i) && kotlin.jvm.internal.l.b(this.f36371j, za2Var.f36371j) && kotlin.jvm.internal.l.b(this.f36372k, za2Var.f36372k) && kotlin.jvm.internal.l.b(this.f36373l, za2Var.f36373l) && kotlin.jvm.internal.l.b(this.f36374m, za2Var.f36374m) && kotlin.jvm.internal.l.b(this.f36375n, za2Var.f36375n) && kotlin.jvm.internal.l.b(this.f36376o, za2Var.f36376o);
    }

    public final String f() {
        return this.f36369g;
    }

    public final String g() {
        return this.f36373l;
    }

    public final Map<String, List<String>> h() {
        return this.f36365c;
    }

    public final int hashCode() {
        int iHashCode = (this.f36366d.hashCode() + ((this.f36365c.hashCode() + m9.a(this.f36364b, (this.f36363a ? 1231 : 1237) * 31, 31)) * 31)) * 31;
        String str = this.f36367e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f36368f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f36369g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f36370h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        mh2 mh2Var = this.f36371j;
        int iHashCode7 = (iHashCode6 + (mh2Var == null ? 0 : mh2Var.hashCode())) * 31;
        Integer num = this.f36372k;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f36373l;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        hk2 hk2Var = this.f36374m;
        return this.f36376o.hashCode() + m9.a(this.f36375n, (iHashCode9 + (hk2Var != null ? hk2Var.hashCode() : 0)) * 31, 31);
    }

    public final Integer i() {
        return this.f36372k;
    }

    public final String j() {
        return this.f36370h;
    }

    public final String k() {
        return this.i;
    }

    public final hb2 l() {
        return this.f36366d;
    }

    public final mh2 m() {
        return this.f36371j;
    }

    public final hk2 n() {
        return this.f36374m;
    }

    public final boolean o() {
        return this.f36363a;
    }

    public final String toString() {
        boolean z10 = this.f36363a;
        List<nu> list = this.f36364b;
        Map<String, List<String>> map = this.f36365c;
        hb2 hb2Var = this.f36366d;
        String str = this.f36367e;
        String str2 = this.f36368f;
        String str3 = this.f36369g;
        String str4 = this.f36370h;
        String str5 = this.i;
        mh2 mh2Var = this.f36371j;
        Integer num = this.f36372k;
        String str6 = this.f36373l;
        hk2 hk2Var = this.f36374m;
        List<ja2> list2 = this.f36375n;
        Map<String, List<String>> map2 = this.f36376o;
        StringBuilder sb = new StringBuilder("VideoAd(isWrapper=");
        sb.append(z10);
        sb.append(", creatives=");
        sb.append(list);
        sb.append(", rawTrackingEvents=");
        sb.append(map);
        sb.append(", videoAdExtensions=");
        sb.append(hb2Var);
        sb.append(", adSystem=");
        com.google.android.gms.measurement.internal.a.l(sb, str, ", adTitle=", str2, ", description=");
        com.google.android.gms.measurement.internal.a.l(sb, str3, ", survey=", str4, ", vastAdTagUri=");
        sb.append(str5);
        sb.append(", viewableImpression=");
        sb.append(mh2Var);
        sb.append(", sequence=");
        sb.append(num);
        sb.append(", id=");
        sb.append(str6);
        sb.append(", wrapperConfiguration=");
        sb.append(hk2Var);
        sb.append(", adVerifications=");
        sb.append(list2);
        sb.append(", trackingEvents=");
        sb.append(map2);
        sb.append(")");
        return sb.toString();
    }
}
