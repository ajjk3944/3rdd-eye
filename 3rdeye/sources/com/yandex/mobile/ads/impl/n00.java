package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.yandex.mobile.ads.impl.c70;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.oa;
import com.yandex.mobile.ads.impl.qt0;
import com.yandex.mobile.ads.impl.r52;
import com.yandex.mobile.ads.impl.xj0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class n00 extends qt0 {
    private static final df1<Integer> i = df1.a(new F3(1));

    /* renamed from: j, reason: collision with root package name */
    private static final df1<Integer> f30633j = df1.a(new Q2(2));

    /* renamed from: c, reason: collision with root package name */
    private final Object f30634c;

    /* renamed from: d, reason: collision with root package name */
    private final c70.b f30635d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f30636e;

    /* renamed from: f, reason: collision with root package name */
    private c f30637f;

    /* renamed from: g, reason: collision with root package name */
    private e f30638g;

    /* renamed from: h, reason: collision with root package name */
    private ih f30639h;

    public static final class a extends g<a> implements Comparable<a> {

        /* renamed from: f, reason: collision with root package name */
        private final int f30640f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f30641g;

        /* renamed from: h, reason: collision with root package name */
        private final String f30642h;
        private final c i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f30643j;

        /* renamed from: k, reason: collision with root package name */
        private final int f30644k;

        /* renamed from: l, reason: collision with root package name */
        private final int f30645l;

        /* renamed from: m, reason: collision with root package name */
        private final int f30646m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f30647n;

        /* renamed from: o, reason: collision with root package name */
        private final int f30648o;

        /* renamed from: p, reason: collision with root package name */
        private final int f30649p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f30650q;

        /* renamed from: r, reason: collision with root package name */
        private final int f30651r;

        /* renamed from: s, reason: collision with root package name */
        private final int f30652s;

        /* renamed from: t, reason: collision with root package name */
        private final int f30653t;

        /* renamed from: u, reason: collision with root package name */
        private final int f30654u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f30655v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f30656w;

        public a(int i, l52 l52Var, int i10, c cVar, int i11, boolean z10, qj1<dc0> qj1Var) {
            int i12;
            int iA;
            int iA2;
            super(i, i10, l52Var);
            this.i = cVar;
            this.f30642h = n00.b(this.f30710e.f26075d);
            this.f30643j = n00.a(false, i11);
            int i13 = 0;
            while (true) {
                i12 = Integer.MAX_VALUE;
                if (i13 >= cVar.f32497o.size()) {
                    iA = 0;
                    i13 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA = n00.a(this.f30710e, cVar.f32497o.get(i13), false);
                    if (iA > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f30645l = i13;
            this.f30644k = iA;
            this.f30646m = n00.a(this.f30710e.f26077f, cVar.f32498p);
            dc0 dc0Var = this.f30710e;
            int i14 = dc0Var.f26077f;
            this.f30647n = i14 == 0 || (i14 & 1) != 0;
            this.f30650q = (dc0Var.f26076e & 1) != 0;
            int i15 = dc0Var.f26096z;
            this.f30651r = i15;
            this.f30652s = dc0Var.f26066A;
            int i16 = dc0Var.i;
            this.f30653t = i16;
            this.f30641g = (i16 == -1 || i16 <= cVar.f32500r) && (i15 == -1 || i15 <= cVar.f32499q) && qj1Var.apply(dc0Var);
            String[] strArrD = s82.d();
            int i17 = 0;
            while (true) {
                if (i17 >= strArrD.length) {
                    iA2 = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA2 = n00.a(this.f30710e, strArrD[i17], false);
                    if (iA2 > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f30648o = i17;
            this.f30649p = iA2;
            int i18 = 0;
            while (true) {
                if (i18 < cVar.f32501s.size()) {
                    String str = this.f30710e.f26083m;
                    if (str != null && str.equals(cVar.f32501s.get(i18))) {
                        i12 = i18;
                        break;
                    }
                    i18++;
                } else {
                    break;
                }
            }
            this.f30654u = i12;
            this.f30655v = P3.a(i11) == 128;
            this.f30656w = P3.c(i11) == 64;
            this.f30640f = a(z10, i11);
        }

        public static int a(List<a> list, List<a> list2) {
            return ((a) Collections.max(list)).compareTo((a) Collections.max(list2));
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            df1 df1VarB = (this.f30641g && this.f30643j) ? n00.i : n00.i.b();
            sq sqVarA = sq.b().a(this.f30643j, aVar.f30643j).a(Integer.valueOf(this.f30645l), Integer.valueOf(aVar.f30645l), df1.a().b()).a(this.f30644k, aVar.f30644k).a(this.f30646m, aVar.f30646m).a(this.f30650q, aVar.f30650q).a(this.f30647n, aVar.f30647n).a(Integer.valueOf(this.f30648o), Integer.valueOf(aVar.f30648o), df1.a().b()).a(this.f30649p, aVar.f30649p).a(this.f30641g, aVar.f30641g).a(Integer.valueOf(this.f30654u), Integer.valueOf(aVar.f30654u), df1.a().b()).a(Integer.valueOf(this.f30653t), Integer.valueOf(aVar.f30653t), this.i.f32506x ? n00.i.b() : n00.f30633j).a(this.f30655v, aVar.f30655v).a(this.f30656w, aVar.f30656w).a(Integer.valueOf(this.f30651r), Integer.valueOf(aVar.f30651r), df1VarB).a(Integer.valueOf(this.f30652s), Integer.valueOf(aVar.f30652s), df1VarB);
            Integer numValueOf = Integer.valueOf(this.f30653t);
            Integer numValueOf2 = Integer.valueOf(aVar.f30653t);
            if (!s82.a(this.f30642h, aVar.f30642h)) {
                df1VarB = n00.f30633j;
            }
            return sqVarA.a(numValueOf, numValueOf2, df1VarB).a();
        }

        private int a(boolean z10, int i) {
            if (!n00.a(this.i.f30670M, i)) {
                return 0;
            }
            if (!this.f30641g && !this.i.f30664G) {
                return 0;
            }
            if (!n00.a(false, i) || !this.f30641g || this.f30710e.i == -1) {
                return 1;
            }
            c cVar = this.i;
            if (cVar.f32507y || cVar.f32506x) {
                return 1;
            }
            return (cVar.f30672O || !z10) ? 2 : 1;
        }

        @Override // com.yandex.mobile.ads.impl.n00.g
        public final int a() {
            return this.f30640f;
        }

        @Override // com.yandex.mobile.ads.impl.n00.g
        public final boolean a(g gVar) {
            int i;
            String str;
            int i10;
            a aVar = (a) gVar;
            c cVar = this.i;
            if (!cVar.f30667J && ((i10 = this.f30710e.f26096z) == -1 || i10 != aVar.f30710e.f26096z)) {
                return false;
            }
            if (!cVar.f30665H && ((str = this.f30710e.f26083m) == null || !TextUtils.equals(str, aVar.f30710e.f26083m))) {
                return false;
            }
            c cVar2 = this.i;
            if (!cVar2.f30666I && ((i = this.f30710e.f26066A) == -1 || i != aVar.f30710e.f26066A)) {
                return false;
            }
            if (cVar2.f30668K) {
                return true;
            }
            return this.f30655v == aVar.f30655v && this.f30656w == aVar.f30656w;
        }
    }

    public static final class b implements Comparable<b> {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f30657b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f30658c;

        public b(dc0 dc0Var, int i) {
            this.f30657b = (dc0Var.f26076e & 1) != 0;
            this.f30658c = n00.a(false, i);
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            return sq.b().a(this.f30658c, bVar2.f30658c).a(this.f30657b, bVar2.f30657b).a();
        }
    }

    public static final class c extends r52 {

        /* renamed from: R, reason: collision with root package name */
        public static final c f30659R = new c(new a());

        /* renamed from: C, reason: collision with root package name */
        public final boolean f30660C;

        /* renamed from: D, reason: collision with root package name */
        public final boolean f30661D;

        /* renamed from: E, reason: collision with root package name */
        public final boolean f30662E;

        /* renamed from: F, reason: collision with root package name */
        public final boolean f30663F;

        /* renamed from: G, reason: collision with root package name */
        public final boolean f30664G;

        /* renamed from: H, reason: collision with root package name */
        public final boolean f30665H;

        /* renamed from: I, reason: collision with root package name */
        public final boolean f30666I;

        /* renamed from: J, reason: collision with root package name */
        public final boolean f30667J;

        /* renamed from: K, reason: collision with root package name */
        public final boolean f30668K;

        /* renamed from: L, reason: collision with root package name */
        public final boolean f30669L;

        /* renamed from: M, reason: collision with root package name */
        public final boolean f30670M;

        /* renamed from: N, reason: collision with root package name */
        public final boolean f30671N;

        /* renamed from: O, reason: collision with root package name */
        public final boolean f30672O;

        /* renamed from: P, reason: collision with root package name */
        private final SparseArray<Map<m52, d>> f30673P;

        /* renamed from: Q, reason: collision with root package name */
        private final SparseBooleanArray f30674Q;

        public static final class a extends r52.a {

            /* renamed from: A, reason: collision with root package name */
            private boolean f30675A;

            /* renamed from: B, reason: collision with root package name */
            private boolean f30676B;

            /* renamed from: C, reason: collision with root package name */
            private boolean f30677C;

            /* renamed from: D, reason: collision with root package name */
            private boolean f30678D;

            /* renamed from: E, reason: collision with root package name */
            private boolean f30679E;

            /* renamed from: F, reason: collision with root package name */
            private boolean f30680F;

            /* renamed from: G, reason: collision with root package name */
            private boolean f30681G;

            /* renamed from: H, reason: collision with root package name */
            private boolean f30682H;

            /* renamed from: I, reason: collision with root package name */
            private boolean f30683I;

            /* renamed from: J, reason: collision with root package name */
            private boolean f30684J;

            /* renamed from: K, reason: collision with root package name */
            private boolean f30685K;

            /* renamed from: L, reason: collision with root package name */
            private boolean f30686L;

            /* renamed from: M, reason: collision with root package name */
            private boolean f30687M;

            /* renamed from: N, reason: collision with root package name */
            private final SparseArray<Map<m52, d>> f30688N;

            /* renamed from: O, reason: collision with root package name */
            private final SparseBooleanArray f30689O;

            public /* synthetic */ a(int i, Bundle bundle) {
                this(bundle);
            }

            private void a() {
                this.f30675A = true;
                this.f30676B = false;
                this.f30677C = true;
                this.f30678D = false;
                this.f30679E = true;
                this.f30680F = false;
                this.f30681G = false;
                this.f30682H = false;
                this.f30683I = false;
                this.f30684J = true;
                this.f30685K = true;
                this.f30686L = false;
                this.f30687M = true;
            }

            public final void b(boolean z10) {
                this.f30683I = z10;
            }

            public final void c(boolean z10) {
                this.f30680F = z10;
            }

            public final void d(boolean z10) {
                this.f30681G = z10;
            }

            public final void e(boolean z10) {
                this.f30687M = z10;
            }

            public final void f(boolean z10) {
                this.f30678D = z10;
            }

            public final void g(boolean z10) {
                this.f30676B = z10;
            }

            public final void h(boolean z10) {
                this.f30677C = z10;
            }

            public final void i(boolean z10) {
                this.f30684J = z10;
            }

            public final void j(boolean z10) {
                this.f30679E = z10;
            }

            public final void k(boolean z10) {
                this.f30685K = z10;
            }

            public final void l(boolean z10) {
                this.f30675A = z10;
            }

            public final void m(boolean z10) {
                this.f30686L = z10;
            }

            @Deprecated
            public a() {
                this.f30688N = new SparseArray<>();
                this.f30689O = new SparseBooleanArray();
                a();
            }

            @Override // com.yandex.mobile.ads.impl.r52.a
            public final void b(Context context) {
                Point pointC = s82.c(context);
                super.a(pointC.x, pointC.y);
            }

            public a(Context context) {
                super(context);
                this.f30688N = new SparseArray<>();
                this.f30689O = new SparseBooleanArray();
                a();
            }

            private a(Bundle bundle) {
                super(bundle);
                a();
                c cVar = c.f30659R;
                l(bundle.getBoolean(r52.a(1000), cVar.f30660C));
                g(bundle.getBoolean(r52.a(1001), cVar.f30661D));
                h(bundle.getBoolean(r52.a(1002), cVar.f30662E));
                f(bundle.getBoolean(r52.a(1014), cVar.f30663F));
                j(bundle.getBoolean(r52.a(1003), cVar.f30664G));
                c(bundle.getBoolean(r52.a(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), cVar.f30665H));
                d(bundle.getBoolean(r52.a(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT), cVar.f30666I));
                a(bundle.getBoolean(r52.a(1006), cVar.f30667J));
                b(bundle.getBoolean(r52.a(1015), cVar.f30668K));
                i(bundle.getBoolean(r52.a(1016), cVar.f30669L));
                k(bundle.getBoolean(r52.a(1007), cVar.f30670M));
                m(bundle.getBoolean(r52.a(1008), cVar.f30671N));
                e(bundle.getBoolean(r52.a(1009), cVar.f30672O));
                this.f30688N = new SparseArray<>();
                a(bundle);
                this.f30689O = a(bundle.getIntArray(r52.a(1013)));
            }

            private static SparseBooleanArray a(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }

            public final void a(boolean z10) {
                this.f30682H = z10;
            }

            @Override // com.yandex.mobile.ads.impl.r52.a
            public final void a(Context context) {
                super.a(context);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void a(Bundle bundle) {
                xj0 xj0VarA;
                SparseArray sparseArray;
                int[] intArray = bundle.getIntArray(Integer.toString(1010, 36));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1011, 36));
                if (parcelableArrayList == null) {
                    xj0VarA = xj0.h();
                } else {
                    xj0VarA = fm.a(m52.f30220f, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Integer.toString(1012, 36));
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray();
                } else {
                    em.a<d> aVar = d.f30690e;
                    SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                    for (int i = 0; i < sparseParcelableArray.size(); i++) {
                        sparseArray2.put(sparseParcelableArray.keyAt(i), aVar.fromBundle((Bundle) sparseParcelableArray.valueAt(i)));
                    }
                    sparseArray = sparseArray2;
                }
                if (intArray == null || intArray.length != xj0VarA.size()) {
                    return;
                }
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    int i11 = intArray[i10];
                    m52 m52Var = (m52) xj0VarA.get(i10);
                    d dVar = (d) sparseArray.get(i10);
                    Map<m52, d> map = this.f30688N.get(i11);
                    if (map == null) {
                        map = new HashMap<>();
                        this.f30688N.put(i11, map);
                    }
                    if (!map.containsKey(m52Var) || !s82.a(map.get(m52Var), dVar)) {
                        map.put(m52Var, dVar);
                    }
                }
            }

            @Override // com.yandex.mobile.ads.impl.r52.a
            public final r52.a a(int i, int i10) {
                super.a(i, i10);
                return this;
            }
        }

        private c(a aVar) {
            super(aVar);
            this.f30660C = aVar.f30675A;
            this.f30661D = aVar.f30676B;
            this.f30662E = aVar.f30677C;
            this.f30663F = aVar.f30678D;
            this.f30664G = aVar.f30679E;
            this.f30665H = aVar.f30680F;
            this.f30666I = aVar.f30681G;
            this.f30667J = aVar.f30682H;
            this.f30668K = aVar.f30683I;
            this.f30669L = aVar.f30684J;
            this.f30670M = aVar.f30685K;
            this.f30671N = aVar.f30686L;
            this.f30672O = aVar.f30687M;
            this.f30673P = aVar.f30688N;
            this.f30674Q = aVar.f30689O;
        }

        public static c a(Context context) {
            return new c(new a(context));
        }

        @Override // com.yandex.mobile.ads.impl.r52
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (super.equals(cVar) && this.f30660C == cVar.f30660C && this.f30661D == cVar.f30661D && this.f30662E == cVar.f30662E && this.f30663F == cVar.f30663F && this.f30664G == cVar.f30664G && this.f30665H == cVar.f30665H && this.f30666I == cVar.f30666I && this.f30667J == cVar.f30667J && this.f30668K == cVar.f30668K && this.f30669L == cVar.f30669L && this.f30670M == cVar.f30670M && this.f30671N == cVar.f30671N && this.f30672O == cVar.f30672O) {
                    SparseBooleanArray sparseBooleanArray = this.f30674Q;
                    SparseBooleanArray sparseBooleanArray2 = cVar.f30674Q;
                    int size = sparseBooleanArray.size();
                    if (sparseBooleanArray2.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                SparseArray<Map<m52, d>> sparseArray = this.f30673P;
                                SparseArray<Map<m52, d>> sparseArray2 = cVar.f30673P;
                                int size2 = sparseArray.size();
                                if (sparseArray2.size() == size2) {
                                    for (int i10 = 0; i10 < size2; i10++) {
                                        int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                                        if (iIndexOfKey >= 0) {
                                            Map<m52, d> mapValueAt = sparseArray.valueAt(i10);
                                            Map<m52, d> mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                            if (mapValueAt2.size() == mapValueAt.size()) {
                                                for (Map.Entry<m52, d> entry : mapValueAt.entrySet()) {
                                                    m52 key = entry.getKey();
                                                    if (!mapValueAt2.containsKey(key) || !s82.a(entry.getValue(), mapValueAt2.get(key))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.r52
        public final int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f30660C ? 1 : 0)) * 31) + (this.f30661D ? 1 : 0)) * 31) + (this.f30662E ? 1 : 0)) * 31) + (this.f30663F ? 1 : 0)) * 31) + (this.f30664G ? 1 : 0)) * 31) + (this.f30665H ? 1 : 0)) * 31) + (this.f30666I ? 1 : 0)) * 31) + (this.f30667J ? 1 : 0)) * 31) + (this.f30668K ? 1 : 0)) * 31) + (this.f30669L ? 1 : 0)) * 31) + (this.f30670M ? 1 : 0)) * 31) + (this.f30671N ? 1 : 0)) * 31) + (this.f30672O ? 1 : 0);
        }

        private static c b(Bundle bundle) {
            return new c(new a(0, bundle));
        }
    }

    public static final class d implements em {

        /* renamed from: e, reason: collision with root package name */
        public static final em.a<d> f30690e = new E0(5);

        /* renamed from: b, reason: collision with root package name */
        public final int f30691b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f30692c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30693d;

        public d(int i, int i10, int[] iArr) {
            this.f30691b = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f30692c = iArrCopyOf;
            this.f30693d = i10;
            Arrays.sort(iArrCopyOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static d a(Bundle bundle) {
            int i = bundle.getInt(Integer.toString(0, 36), -1);
            int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
            int i10 = bundle.getInt(Integer.toString(2, 36), -1);
            if (i < 0 || i10 < 0) {
                throw new IllegalArgumentException();
            }
            intArray.getClass();
            return new d(i, i10, intArray);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f30691b == dVar.f30691b && Arrays.equals(this.f30692c, dVar.f30692c) && this.f30693d == dVar.f30693d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f30692c) + (this.f30691b * 31)) * 31) + this.f30693d;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Spatializer f30694a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f30695b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f30696c;

        /* renamed from: d, reason: collision with root package name */
        private Spatializer$OnSpatializerStateChangedListener f30697d;

        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n00 f30698a;

            public a(n00 n00Var) {
                this.f30698a = n00Var;
            }

            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f30698a.e();
            }

            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f30698a.e();
            }
        }

        private e(Spatializer spatializer) {
            this.f30694a = spatializer;
            this.f30695b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public final boolean b() {
            return this.f30694a.isEnabled();
        }

        public final void c() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f30697d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f30696c == null) {
                return;
            }
            this.f30694a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            Handler handler = this.f30696c;
            int i = s82.f32899a;
            handler.removeCallbacksAndMessages(null);
            this.f30696c = null;
            this.f30697d = null;
        }

        public final boolean a(dc0 dc0Var, ih ihVar) throws IllegalArgumentException {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(s82.a(("audio/eac3-joc".equals(dc0Var.f26083m) && dc0Var.f26096z == 16) ? 12 : dc0Var.f26096z));
            int i = dc0Var.f26066A;
            if (i != -1) {
                channelMask.setSampleRate(i);
            }
            return this.f30694a.canBeSpatialized(ihVar.a().f28667a, channelMask.build());
        }

        public final void a(n00 n00Var, Looper looper) {
            if (this.f30697d == null && this.f30696c == null) {
                this.f30697d = new a(n00Var);
                Handler handler = new Handler(looper);
                this.f30696c = handler;
                this.f30694a.addOnSpatializerStateChangedListener(new W(handler), this.f30697d);
            }
        }

        public final boolean a() {
            return this.f30694a.isAvailable();
        }

        public static e a(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new e(audioManager.getSpatializer());
        }
    }

    public static final class f extends g<f> implements Comparable<f> {

        /* renamed from: f, reason: collision with root package name */
        private final int f30699f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f30700g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f30701h;
        private final boolean i;

        /* renamed from: j, reason: collision with root package name */
        private final int f30702j;

        /* renamed from: k, reason: collision with root package name */
        private final int f30703k;

        /* renamed from: l, reason: collision with root package name */
        private final int f30704l;

        /* renamed from: m, reason: collision with root package name */
        private final int f30705m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f30706n;

        public f(int i, l52 l52Var, int i10, c cVar, int i11, String str) {
            int iA;
            super(i, i10, l52Var);
            int i12 = 0;
            this.f30700g = n00.a(false, i11);
            int i13 = this.f30710e.f26076e & (~cVar.f32504v);
            this.f30701h = (i13 & 1) != 0;
            this.i = (i13 & 2) != 0;
            xj0<String> xj0VarA = cVar.f32502t.isEmpty() ? xj0.a("") : cVar.f32502t;
            int i14 = 0;
            while (true) {
                if (i14 >= xj0VarA.size()) {
                    i14 = Integer.MAX_VALUE;
                    iA = 0;
                    break;
                } else {
                    iA = n00.a(this.f30710e, xj0VarA.get(i14), cVar.f32505w);
                    if (iA > 0) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f30702j = i14;
            this.f30703k = iA;
            int iA2 = n00.a(this.f30710e.f26077f, cVar.f32503u);
            this.f30704l = iA2;
            this.f30706n = (this.f30710e.f26077f & 1088) != 0;
            int iA3 = n00.a(this.f30710e, str, n00.b(str) == null);
            this.f30705m = iA3;
            boolean z10 = iA > 0 || (cVar.f32502t.isEmpty() && iA2 > 0) || this.f30701h || (this.i && iA3 > 0);
            if (n00.a(cVar.f30670M, i11) && z10) {
                i12 = 1;
            }
            this.f30699f = i12;
        }

        public static int a(List<f> list, List<f> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(f fVar) {
            sq sqVarA = sq.b().a(this.f30700g, fVar.f30700g).a(Integer.valueOf(this.f30702j), Integer.valueOf(fVar.f30702j), df1.a().b()).a(this.f30703k, fVar.f30703k).a(this.f30704l, fVar.f30704l).a(this.f30701h, fVar.f30701h).a(Boolean.valueOf(this.i), Boolean.valueOf(fVar.i), this.f30703k == 0 ? df1.a() : df1.a().b()).a(this.f30705m, fVar.f30705m);
            if (this.f30704l == 0) {
                sqVarA = sqVarA.b(this.f30706n, fVar.f30706n);
            }
            return sqVarA.a();
        }

        @Override // com.yandex.mobile.ads.impl.n00.g
        public final int a() {
            return this.f30699f;
        }

        @Override // com.yandex.mobile.ads.impl.n00.g
        public final /* bridge */ /* synthetic */ boolean a(g gVar) {
            return false;
        }
    }

    public static abstract class g<T extends g<T>> {

        /* renamed from: b, reason: collision with root package name */
        public final int f30707b;

        /* renamed from: c, reason: collision with root package name */
        public final l52 f30708c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30709d;

        /* renamed from: e, reason: collision with root package name */
        public final dc0 f30710e;

        public interface a<T extends g<T>> {
            List<T> a(int i, l52 l52Var, int[] iArr);
        }

        public g(int i, int i10, l52 l52Var) {
            this.f30707b = i;
            this.f30708c = l52Var;
            this.f30709d = i10;
            this.f30710e = l52Var.a(i10);
        }

        public abstract int a();

        public abstract boolean a(T t10);
    }

    public n00(Context context, c cVar, oa.b bVar) {
        this(cVar, bVar, context);
    }

    public static boolean a(boolean z10, int i10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.s52
    public final void d() {
        e eVar;
        synchronized (this.f30634c) {
            try {
                if (s82.f32899a >= 32 && (eVar = this.f30638g) != null) {
                    eVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.d();
    }

    private n00(c cVar, oa.b bVar, Context context) {
        this.f30634c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f30635d = bVar;
        this.f30637f = cVar;
        this.f30639h = ih.f28660h;
        boolean z10 = context != null && s82.d(context);
        this.f30636e = z10;
        if (!z10 && context != null && s82.f32899a >= 32) {
            this.f30638g = e.a(context);
        }
        if (this.f30637f.f30669L && context == null) {
            rs0.d("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static void a(m52 m52Var, c cVar, HashMap map) {
        q52 q52Var;
        for (int i10 = 0; i10 < m52Var.f30221b; i10++) {
            q52 q52Var2 = cVar.f32508z.get(m52Var.a(i10));
            if (q52Var2 != null && ((q52Var = (q52) map.get(Integer.valueOf(q52Var2.f32075b.f29892d))) == null || (q52Var.f32076c.isEmpty() && !q52Var2.f32076c.isEmpty()))) {
                map.put(Integer.valueOf(q52Var2.f32075b.f29892d), q52Var2);
            }
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        boolean z10;
        e eVar;
        synchronized (this.f30634c) {
            try {
                z10 = this.f30637f.f30669L && !this.f30636e && s82.f32899a >= 32 && (eVar = this.f30638g) != null && eVar.f30695b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            b();
        }
    }

    public static int a(dc0 dc0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(dc0Var.f26075d)) {
            return 4;
        }
        String strB = b(str);
        String strB2 = b(dc0Var.f26075d);
        if (strB2 == null || strB == null) {
            return (z10 && strB2 == null) ? 1 : 0;
        }
        if (strB2.startsWith(strB) || strB.startsWith(strB2)) {
            return 3;
        }
        int i10 = s82.f32899a;
        return strB2.split("-", 2)[0].equals(strB.split("-", 2)[0]) ? 2 : 0;
    }

    public static final class h extends g<h> {

        /* renamed from: f, reason: collision with root package name */
        private final boolean f30711f;

        /* renamed from: g, reason: collision with root package name */
        private final c f30712g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f30713h;
        private final boolean i;

        /* renamed from: j, reason: collision with root package name */
        private final int f30714j;

        /* renamed from: k, reason: collision with root package name */
        private final int f30715k;

        /* renamed from: l, reason: collision with root package name */
        private final int f30716l;

        /* renamed from: m, reason: collision with root package name */
        private final int f30717m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f30718n;

        /* renamed from: o, reason: collision with root package name */
        private final boolean f30719o;

        /* renamed from: p, reason: collision with root package name */
        private final int f30720p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f30721q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f30722r;

        /* renamed from: s, reason: collision with root package name */
        private final int f30723s;

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public h(int r5, com.yandex.mobile.ads.impl.l52 r6, int r7, com.yandex.mobile.ads.impl.n00.c r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.n00.h.<init>(int, com.yandex.mobile.ads.impl.l52, int, com.yandex.mobile.ads.impl.n00$c, int, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int a(h hVar, h hVar2) {
            sq sqVarA = sq.b().a(hVar.i, hVar2.i).a(hVar.f30717m, hVar2.f30717m).a(hVar.f30718n, hVar2.f30718n).a(hVar.f30711f, hVar2.f30711f).a(hVar.f30713h, hVar2.f30713h).a(Integer.valueOf(hVar.f30716l), Integer.valueOf(hVar2.f30716l), df1.a().b()).a(hVar.f30721q, hVar2.f30721q).a(hVar.f30722r, hVar2.f30722r);
            if (hVar.f30721q && hVar.f30722r) {
                sqVarA = sqVarA.a(hVar.f30723s, hVar2.f30723s);
            }
            return sqVarA.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int b(h hVar, h hVar2) {
            df1 df1VarB = (hVar.f30711f && hVar.i) ? n00.i : n00.i.b();
            return sq.b().a(Integer.valueOf(hVar.f30714j), Integer.valueOf(hVar2.f30714j), hVar.f30712g.f32506x ? n00.i.b() : n00.f30633j).a(Integer.valueOf(hVar.f30715k), Integer.valueOf(hVar2.f30715k), df1VarB).a(Integer.valueOf(hVar.f30714j), Integer.valueOf(hVar2.f30714j), df1VarB).a();
        }

        private int a(int i, int i10) {
            if ((this.f30710e.f26077f & 16384) != 0 || !n00.a(this.f30712g.f30670M, i)) {
                return 0;
            }
            if (!this.f30711f && !this.f30712g.f30660C) {
                return 0;
            }
            if (!n00.a(false, i) || !this.f30713h || !this.f30711f || this.f30710e.i == -1) {
                return 1;
            }
            c cVar = this.f30712g;
            return (cVar.f32507y || cVar.f32506x || (i & i10) == 0) ? 1 : 2;
        }

        @Override // com.yandex.mobile.ads.impl.n00.g
        public final int a() {
            return this.f30720p;
        }

        @Override // com.yandex.mobile.ads.impl.n00.g
        public final boolean a(g gVar) {
            h hVar = (h) gVar;
            if (!this.f30719o && !s82.a(this.f30710e.f26083m, hVar.f30710e.f26083m)) {
                return false;
            }
            if (this.f30712g.f30663F) {
                return true;
            }
            return this.f30721q == hVar.f30721q && this.f30722r == hVar.f30722r;
        }

        public static int a(List<h> list, List<h> list2) {
            return sq.b().a((h) Collections.max(list, new Q2(1)), (h) Collections.max(list2, new Q2(1)), new Q2(1)).a(list.size(), list2.size()).a((h) Collections.max(list, new T2()), (h) Collections.max(list2, new T2()), new T2()).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060 A[Catch: all -> 0x0087, FALL_THROUGH, TryCatch #0 {all -> 0x0087, blocks: (B:4:0x0006, B:6:0x000c, B:8:0x0010, B:10:0x0014, B:34:0x0052, B:36:0x0056, B:38:0x005a, B:40:0x0060, B:42:0x0064, B:44:0x0068, B:46:0x006e, B:48:0x0074, B:50:0x007c, B:56:0x008a), top: B:60:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.yandex.mobile.ads.impl.dc0 r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            java.lang.Object r3 = r8.f30634c
            monitor-enter(r3)
            com.yandex.mobile.ads.impl.n00$c r4 = r8.f30637f     // Catch: java.lang.Throwable -> L87
            boolean r4 = r4.f30669L     // Catch: java.lang.Throwable -> L87
            if (r4 == 0) goto L8a
            boolean r4 = r8.f30636e     // Catch: java.lang.Throwable -> L87
            if (r4 != 0) goto L8a
            int r4 = r9.f26096z     // Catch: java.lang.Throwable -> L87
            if (r4 <= r2) goto L8a
            java.lang.String r4 = r9.f26083m     // Catch: java.lang.Throwable -> L87
            r5 = 32
            if (r4 != 0) goto L1b
            goto L60
        L1b:
            r6 = -1
            int r7 = r4.hashCode()
            switch(r7) {
                case -2123537834: goto L44;
                case 187078296: goto L39;
                case 187078297: goto L30;
                case 1504578661: goto L25;
                default: goto L23;
            }
        L23:
            r2 = r6
            goto L4e
        L25:
            java.lang.String r2 = "audio/eac3"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L2e
            goto L23
        L2e:
            r2 = 3
            goto L4e
        L30:
            java.lang.String r7 = "audio/ac4"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L4e
            goto L23
        L39:
            java.lang.String r2 = "audio/ac3"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L42
            goto L23
        L42:
            r2 = r0
            goto L4e
        L44:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L4d
            goto L23
        L4d:
            r2 = r1
        L4e:
            switch(r2) {
                case 0: goto L52;
                case 1: goto L52;
                case 2: goto L52;
                case 3: goto L52;
                default: goto L51;
            }
        L51:
            goto L60
        L52:
            int r2 = com.yandex.mobile.ads.impl.s82.f32899a     // Catch: java.lang.Throwable -> L87
            if (r2 < r5) goto L8a
            com.yandex.mobile.ads.impl.n00$e r2 = r8.f30638g     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L8a
            boolean r2 = com.yandex.mobile.ads.impl.n00.e.a(r2)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L8a
        L60:
            int r2 = com.yandex.mobile.ads.impl.s82.f32899a     // Catch: java.lang.Throwable -> L87
            if (r2 < r5) goto L89
            com.yandex.mobile.ads.impl.n00$e r2 = r8.f30638g     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L89
            boolean r4 = com.yandex.mobile.ads.impl.n00.e.a(r2)     // Catch: java.lang.Throwable -> L87
            if (r4 == 0) goto L89
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L89
            com.yandex.mobile.ads.impl.n00$e r2 = r8.f30638g     // Catch: java.lang.Throwable -> L87
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L89
            com.yandex.mobile.ads.impl.n00$e r2 = r8.f30638g     // Catch: java.lang.Throwable -> L87
            com.yandex.mobile.ads.impl.ih r4 = r8.f30639h     // Catch: java.lang.Throwable -> L87
            boolean r9 = r2.a(r9, r4)     // Catch: java.lang.Throwable -> L87
            if (r9 == 0) goto L89
            goto L8a
        L87:
            r9 = move-exception
            goto L8c
        L89:
            r0 = r1
        L8a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L87
            return r0
        L8c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L87
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.n00.a(com.yandex.mobile.ads.impl.dc0):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(c cVar, boolean z10, int i10, l52 l52Var, int[] iArr) {
        qj1 qj1Var = new qj1() { // from class: com.yandex.mobile.ads.impl.O2
            @Override // com.yandex.mobile.ads.impl.qj1
            public final boolean apply(Object obj) {
                return this.f24211b.a((dc0) obj);
            }
        };
        int i11 = xj0.f35328d;
        xj0.a aVar = new xj0.a();
        for (int i12 = 0; i12 < l52Var.f29890b; i12++) {
            aVar.b(new a(i10, l52Var, i12, cVar, iArr[i12], z10, qj1Var));
        }
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List a(com.yandex.mobile.ads.impl.n00.c r17, int[] r18, int r19, com.yandex.mobile.ads.impl.l52 r20, int[] r21) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.n00.a(com.yandex.mobile.ads.impl.n00$c, int[], int, com.yandex.mobile.ads.impl.l52, int[]):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public final Pair a(qt0.a aVar, int[][][] iArr, c cVar) throws h60 {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.a()) {
                if (2 == aVar.a(i10) && aVar.b(i10).f30221b > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return a(1, aVar, iArr, new R2(z10, this, cVar), new S2(0));
    }

    public static Pair a(qt0.a aVar, int[][][] iArr, c cVar, String str) throws h60 {
        return a(3, aVar, iArr, new C.e0(10, cVar, str), new P2(0));
    }

    @Override // com.yandex.mobile.ads.impl.qt0
    public final Pair<uo1[], c70[]> a(qt0.a aVar, int[][][] iArr, int[] iArr2, jw0.b bVar, v42 v42Var) throws h60 {
        c cVar;
        int i10;
        String str;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        e eVar;
        int[][][] iArr3 = iArr;
        synchronized (this.f30634c) {
            try {
                cVar = this.f30637f;
                i10 = 32;
                if (cVar.f30669L && s82.f32899a >= 32 && (eVar = this.f30638g) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    if (looperMyLooper != null) {
                        eVar.a(this, looperMyLooper);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int iA = aVar.a();
        int iA2 = aVar.a();
        c70.a[] aVarArr = new c70.a[iA2];
        Pair pairA = a(aVar, iArr3, iArr2, cVar);
        if (pairA != null) {
            aVarArr[((Integer) pairA.second).intValue()] = (c70.a) pairA.first;
        }
        Pair pairA2 = a(aVar, iArr3, cVar);
        if (pairA2 != null) {
            aVarArr[((Integer) pairA2.second).intValue()] = (c70.a) pairA2.first;
        }
        int i17 = 0;
        if (pairA2 == null) {
            str = null;
        } else {
            c70.a aVar2 = (c70.a) pairA2.first;
            str = aVar2.f25551a.a(aVar2.f25552b[0]).f26075d;
        }
        Pair pairA3 = a(aVar, iArr3, cVar, str);
        if (pairA3 != null) {
            aVarArr[((Integer) pairA3.second).intValue()] = (c70.a) pairA3.first;
        }
        int i18 = 0;
        while (true) {
            i11 = 2;
            if (i18 >= iA2) {
                break;
            }
            int iA3 = aVar.a(i18);
            if (iA3 == 2 || iA3 == 1 || iA3 == 3) {
                i13 = iA2;
                i14 = i10;
            } else {
                m52 m52VarB = aVar.b(i18);
                int[][] iArr4 = iArr3[i18];
                int i19 = i17;
                int i20 = i19;
                l52 l52Var = null;
                b bVar2 = null;
                while (i19 < m52VarB.f30221b) {
                    l52 l52VarA = m52VarB.a(i19);
                    int[] iArr5 = iArr4[i19];
                    int i21 = i10;
                    int i22 = i17;
                    while (i22 < l52VarA.f29890b) {
                        if (a(cVar.f30670M, iArr5[i22])) {
                            i15 = iA2;
                            b bVar3 = new b(l52VarA.a(i22), iArr5[i22]);
                            if (bVar2 != null) {
                                i16 = i22;
                                if (sq.b().a(bVar3.f30658c, bVar2.f30658c).a(bVar3.f30657b, bVar2.f30657b).a() > 0) {
                                }
                            } else {
                                i16 = i22;
                            }
                            l52Var = l52VarA;
                            bVar2 = bVar3;
                            i20 = i16;
                        } else {
                            i15 = iA2;
                            i16 = i22;
                        }
                        i22 = i16 + 1;
                        iA2 = i15;
                    }
                    i19++;
                    i10 = i21;
                    i17 = 0;
                }
                i13 = iA2;
                i14 = i10;
                aVarArr[i18] = l52Var == null ? null : new c70.a(0, l52Var, new int[]{i20});
            }
            i18++;
            iArr3 = iArr;
            i10 = i14;
            iA2 = i13;
            i17 = 0;
        }
        int i23 = i10;
        int iA4 = aVar.a();
        HashMap map = new HashMap();
        for (int i24 = 0; i24 < iA4; i24++) {
            a(aVar.b(i24), cVar, map);
        }
        a(aVar.b(), cVar, map);
        for (int i25 = 0; i25 < iA4; i25++) {
            q52 q52Var = (q52) map.get(Integer.valueOf(aVar.a(i25)));
            if (q52Var != null) {
                aVarArr[i25] = (q52Var.f32076c.isEmpty() || aVar.b(i25).a(q52Var.f32075b) == -1) ? null : new c70.a(0, q52Var.f32075b, up0.a(q52Var.f32076c));
            }
        }
        int i26 = 0;
        int iA5 = aVar.a();
        for (int i27 = 0; i27 < iA5; i27++) {
            m52 m52VarB2 = aVar.b(i27);
            Map map2 = (Map) cVar.f30673P.get(i27);
            if (map2 != null && map2.containsKey(m52VarB2)) {
                Map map3 = (Map) cVar.f30673P.get(i27);
                d dVar = map3 != null ? (d) map3.get(m52VarB2) : null;
                aVarArr[i27] = (dVar == null || dVar.f30692c.length == 0) ? null : new c70.a(dVar.f30693d, m52VarB2.a(dVar.f30691b), dVar.f30692c);
            }
        }
        for (int i28 = 0; i28 < iA; i28++) {
            int iA6 = aVar.a(i28);
            if (cVar.f30674Q.get(i28) || cVar.f32484A.contains(Integer.valueOf(iA6))) {
                aVarArr[i28] = null;
            }
        }
        c70[] c70VarArrA = ((oa.b) this.f30635d).a(aVarArr, a());
        uo1[] uo1VarArr = new uo1[iA];
        for (int i29 = 0; i29 < iA; i29++) {
            uo1VarArr[i29] = (cVar.f30674Q.get(i29) || cVar.f32484A.contains(Integer.valueOf(aVar.a(i29))) || (aVar.a(i29) != -2 && c70VarArrA[i29] == null)) ? null : uo1.f34170b;
        }
        if (cVar.f30671N) {
            int i30 = -1;
            int i31 = -1;
            int i32 = 0;
            while (i32 < aVar.a()) {
                int iA7 = aVar.a(i32);
                c70 c70Var = c70VarArrA[i32];
                if ((iA7 == 1 || iA7 == i11) && c70Var != null) {
                    int[][] iArr6 = iArr[i32];
                    int iA8 = aVar.b(i32).a(c70Var.a());
                    int i33 = i26;
                    while (true) {
                        if (i33 < c70Var.b()) {
                            i12 = i23;
                            if ((iArr6[iA8][c70Var.b(i33)] & 32) != i12) {
                                break;
                            }
                            i33++;
                            i23 = i12;
                        } else {
                            i12 = i23;
                            if (iA7 == 1) {
                                if (i30 != -1) {
                                    z10 = false;
                                    break;
                                }
                                i30 = i32;
                            } else {
                                if (i31 != -1) {
                                    z10 = false;
                                    break;
                                }
                                i31 = i32;
                            }
                        }
                    }
                } else {
                    i12 = i23;
                }
                i32++;
                i23 = i12;
                i11 = 2;
                i26 = 0;
            }
            z10 = true;
            if (z10 & ((i30 == -1 || i31 == -1) ? false : true)) {
                uo1 uo1Var = new uo1(true);
                uo1VarArr[i30] = uo1Var;
                uo1VarArr[i31] = uo1Var;
            }
        }
        return Pair.create(uo1VarArr, c70VarArrA);
    }

    private static Pair a(int i10, qt0.a aVar, int[][][] iArr, g.a aVar2, Comparator comparator) {
        int i11;
        RandomAccess randomAccessA;
        qt0.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iA = aVar3.a();
        int i12 = 0;
        while (i12 < iA) {
            if (i10 == aVar3.a(i12)) {
                m52 m52VarB = aVar3.b(i12);
                for (int i13 = 0; i13 < m52VarB.f30221b; i13++) {
                    l52 l52VarA = m52VarB.a(i13);
                    List listA = aVar2.a(i12, l52VarA, iArr[i12][i13]);
                    boolean[] zArr = new boolean[l52VarA.f29890b];
                    int i14 = 0;
                    while (i14 < l52VarA.f29890b) {
                        g gVar = (g) listA.get(i14);
                        int iA2 = gVar.a();
                        if (zArr[i14] || iA2 == 0) {
                            i11 = iA;
                        } else {
                            if (iA2 == 1) {
                                randomAccessA = xj0.a(gVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                int i15 = i14 + 1;
                                while (i15 < l52VarA.f29890b) {
                                    g gVar2 = (g) listA.get(i15);
                                    int i16 = iA;
                                    if (gVar2.a() == 2 && gVar.a(gVar2)) {
                                        arrayList2.add(gVar2);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    iA = i16;
                                }
                                randomAccessA = arrayList2;
                            }
                            i11 = iA;
                            arrayList.add(randomAccessA);
                        }
                        i14++;
                        iA = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            iA = iA;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((g) list.get(i17)).f30709d;
        }
        g gVar3 = (g) list.get(0);
        return Pair.create(new c70.a(0, gVar3.f30708c, iArr2), Integer.valueOf(gVar3.f30707b));
    }

    public static Pair a(qt0.a aVar, int[][][] iArr, int[] iArr2, c cVar) throws h60 {
        return a(2, aVar, iArr, new C.f0(8, cVar, iArr2), new Q2(0));
    }

    @Override // com.yandex.mobile.ads.impl.s52
    public final void a(ih ihVar) {
        boolean zEquals;
        synchronized (this.f30634c) {
            zEquals = this.f30639h.equals(ihVar);
            this.f30639h = ihVar;
        }
        if (zEquals) {
            return;
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List a(c cVar, String str, int i10, l52 l52Var, int[] iArr) {
        int i11 = xj0.f35328d;
        xj0.a aVar = new xj0.a();
        for (int i12 = 0; i12 < l52Var.f29890b; i12++) {
            aVar.b(new f(i10, l52Var, i12, cVar, iArr[i12], str));
        }
        return aVar.a();
    }
}
