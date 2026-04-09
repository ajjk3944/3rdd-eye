package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.xj0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class xv0 implements em {

    /* renamed from: h, reason: collision with root package name */
    public static final em.a<xv0> f35437h;

    /* renamed from: b, reason: collision with root package name */
    public final String f35438b;

    /* renamed from: c, reason: collision with root package name */
    public final g f35439c;

    /* renamed from: d, reason: collision with root package name */
    public final e f35440d;

    /* renamed from: e, reason: collision with root package name */
    public final aw0 f35441e;

    /* renamed from: f, reason: collision with root package name */
    public final c f35442f;

    /* renamed from: g, reason: collision with root package name */
    public final h f35443g;

    public static class b implements em {

        /* renamed from: g, reason: collision with root package name */
        public static final em.a<c> f35452g = new I0(4);

        /* renamed from: b, reason: collision with root package name */
        public final long f35453b;

        /* renamed from: c, reason: collision with root package name */
        public final long f35454c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35455d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f35456e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f35457f;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f35458a;

            /* renamed from: b, reason: collision with root package name */
            private long f35459b = Long.MIN_VALUE;

            /* renamed from: c, reason: collision with root package name */
            private boolean f35460c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f35461d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f35462e;
        }

        public /* synthetic */ b(a aVar, int i) {
            this(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c a(Bundle bundle) {
            a aVar = new a();
            int i = 0;
            long j4 = bundle.getLong(Integer.toString(0, 36), 0L);
            if (j4 < 0) {
                throw new IllegalArgumentException();
            }
            aVar.f35458a = j4;
            long j10 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
            if (j10 != Long.MIN_VALUE && j10 < 0) {
                throw new IllegalArgumentException();
            }
            aVar.f35459b = j10;
            aVar.f35460c = bundle.getBoolean(Integer.toString(2, 36), false);
            aVar.f35461d = bundle.getBoolean(Integer.toString(3, 36), false);
            aVar.f35462e = bundle.getBoolean(Integer.toString(4, 36), false);
            return new c(aVar, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f35453b == bVar.f35453b && this.f35454c == bVar.f35454c && this.f35455d == bVar.f35455d && this.f35456e == bVar.f35456e && this.f35457f == bVar.f35457f;
        }

        public final int hashCode() {
            long j4 = this.f35453b;
            int i = ((int) (j4 ^ (j4 >>> 32))) * 31;
            long j10 = this.f35454c;
            return ((((((i + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f35455d ? 1 : 0)) * 31) + (this.f35456e ? 1 : 0)) * 31) + (this.f35457f ? 1 : 0);
        }

        private b(a aVar) {
            this.f35453b = aVar.f35458a;
            this.f35454c = aVar.f35459b;
            this.f35455d = aVar.f35460c;
            this.f35456e = aVar.f35461d;
            this.f35457f = aVar.f35462e;
        }
    }

    @Deprecated
    public static final class c extends b {

        /* renamed from: h, reason: collision with root package name */
        public static final c f35463h = new c(new b.a());

        public /* synthetic */ c(b.a aVar, int i) {
            this(aVar);
        }

        private c(b.a aVar) {
            super(aVar, 0);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f35464a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f35465b;

        /* renamed from: c, reason: collision with root package name */
        public final yj0<String, String> f35466c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35467d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f35468e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f35469f;

        /* renamed from: g, reason: collision with root package name */
        public final xj0<Integer> f35470g;

        /* renamed from: h, reason: collision with root package name */
        private final byte[] f35471h;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private yj0<String, String> f35472a;

            /* renamed from: b, reason: collision with root package name */
            private xj0<Integer> f35473b;

            public /* synthetic */ a(int i) {
                this();
            }

            @Deprecated
            private a() {
                this.f35472a = yj0.g();
                this.f35473b = xj0.h();
            }
        }

        private d(a aVar) {
            aVar.getClass();
            this.f35464a = (UUID) zf.a((Object) null);
            this.f35465b = null;
            this.f35466c = aVar.f35472a;
            this.f35467d = false;
            this.f35469f = false;
            this.f35468e = false;
            this.f35470g = aVar.f35473b;
            this.f35471h = null;
        }

        public final byte[] a() {
            byte[] bArr = this.f35471h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f35464a.equals(dVar.f35464a) && s82.a(this.f35465b, dVar.f35465b) && s82.a(this.f35466c, dVar.f35466c) && this.f35467d == dVar.f35467d && this.f35469f == dVar.f35469f && this.f35468e == dVar.f35468e && this.f35470g.equals(dVar.f35470g) && Arrays.equals(this.f35471h, dVar.f35471h);
        }

        public final int hashCode() {
            int iHashCode = this.f35464a.hashCode() * 31;
            Uri uri = this.f35465b;
            return Arrays.hashCode(this.f35471h) + ((this.f35470g.hashCode() + ((((((((this.f35466c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f35467d ? 1 : 0)) * 31) + (this.f35469f ? 1 : 0)) * 31) + (this.f35468e ? 1 : 0)) * 31)) * 31);
        }
    }

    public static final class e implements em {

        /* renamed from: g, reason: collision with root package name */
        public static final e f35474g = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

        /* renamed from: h, reason: collision with root package name */
        public static final em.a<e> f35475h = new J0(10);

        /* renamed from: b, reason: collision with root package name */
        public final long f35476b;

        /* renamed from: c, reason: collision with root package name */
        public final long f35477c;

        /* renamed from: d, reason: collision with root package name */
        public final long f35478d;

        /* renamed from: e, reason: collision with root package name */
        public final float f35479e;

        /* renamed from: f, reason: collision with root package name */
        public final float f35480f;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f35481a = -9223372036854775807L;

            /* renamed from: b, reason: collision with root package name */
            private long f35482b = -9223372036854775807L;

            /* renamed from: c, reason: collision with root package name */
            private long f35483c = -9223372036854775807L;

            /* renamed from: d, reason: collision with root package name */
            private float f35484d = -3.4028235E38f;

            /* renamed from: e, reason: collision with root package name */
            private float f35485e = -3.4028235E38f;

            public final e a() {
                return new e(this.f35481a, this.f35482b, this.f35483c, this.f35484d, this.f35485e);
            }
        }

        @Deprecated
        public e(long j4, long j10, long j11, float f10, float f11) {
            this.f35476b = j4;
            this.f35477c = j10;
            this.f35478d = j11;
            this.f35479e = f10;
            this.f35480f = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e a(Bundle bundle) {
            return new e(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f35476b == eVar.f35476b && this.f35477c == eVar.f35477c && this.f35478d == eVar.f35478d && this.f35479e == eVar.f35479e && this.f35480f == eVar.f35480f;
        }

        public final int hashCode() {
            long j4 = this.f35476b;
            long j10 = this.f35477c;
            int i = ((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f35478d;
            int i10 = (i + ((int) ((j11 >>> 32) ^ j11))) * 31;
            float f10 = this.f35479e;
            int iFloatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f35480f;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f35486a;

        /* renamed from: b, reason: collision with root package name */
        public final String f35487b;

        /* renamed from: c, reason: collision with root package name */
        public final d f35488c;

        /* renamed from: d, reason: collision with root package name */
        public final List<k22> f35489d;

        /* renamed from: e, reason: collision with root package name */
        public final String f35490e;

        /* renamed from: f, reason: collision with root package name */
        public final xj0<j> f35491f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f35492g;

        public /* synthetic */ f(Uri uri, String str, d dVar, List list, String str2, xj0 xj0Var, Object obj, int i) {
            this(uri, str, dVar, list, str2, xj0Var, obj);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f35486a.equals(fVar.f35486a) && s82.a(this.f35487b, fVar.f35487b) && s82.a(this.f35488c, fVar.f35488c) && s82.a((Object) null, (Object) null) && this.f35489d.equals(fVar.f35489d) && s82.a(this.f35490e, fVar.f35490e) && this.f35491f.equals(fVar.f35491f) && s82.a(this.f35492g, fVar.f35492g);
        }

        public final int hashCode() {
            int iHashCode = this.f35486a.hashCode() * 31;
            String str = this.f35487b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.f35488c;
            int iHashCode3 = (this.f35489d.hashCode() + ((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 961)) * 31;
            String str2 = this.f35490e;
            int iHashCode4 = (this.f35491f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f35492g;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private f(Uri uri, String str, d dVar, List list, String str2, xj0 xj0Var, Object obj) {
            this.f35486a = uri;
            this.f35487b = str;
            this.f35488c = dVar;
            this.f35489d = list;
            this.f35490e = str2;
            this.f35491f = xj0Var;
            xj0.a aVarG = xj0.g();
            for (int i = 0; i < xj0Var.size(); i++) {
                aVarG.b(((j) xj0Var.get(i)).a().a());
            }
            aVarG.a();
            this.f35492g = obj;
        }
    }

    @Deprecated
    public static final class g extends f {
        public /* synthetic */ g(Uri uri, List list, String str, xj0 xj0Var) {
            this(uri, null, null, list, str, xj0Var, null);
        }

        private g(Uri uri, String str, d dVar, List list, String str2, xj0 xj0Var, Object obj) {
            super(uri, str, dVar, list, str2, xj0Var, obj, 0);
        }
    }

    public static final class h implements em {

        /* renamed from: d, reason: collision with root package name */
        public static final h f35493d = new h(new a());

        /* renamed from: e, reason: collision with root package name */
        public static final em.a<h> f35494e = new S1(9);

        /* renamed from: b, reason: collision with root package name */
        public final Uri f35495b;

        /* renamed from: c, reason: collision with root package name */
        public final String f35496c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f35497a;

            /* renamed from: b, reason: collision with root package name */
            private String f35498b;

            /* renamed from: c, reason: collision with root package name */
            private Bundle f35499c;
        }

        private h(a aVar) {
            this.f35495b = aVar.f35497a;
            this.f35496c = aVar.f35498b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static h a(Bundle bundle) {
            a aVar = new a();
            aVar.f35497a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
            aVar.f35498b = bundle.getString(Integer.toString(1, 36));
            aVar.f35499c = bundle.getBundle(Integer.toString(2, 36));
            return new h(aVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return s82.a(this.f35495b, hVar.f35495b) && s82.a(this.f35496c, hVar.f35496c);
        }

        public final int hashCode() {
            Uri uri = this.f35495b;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f35496c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class i extends j {
        public /* synthetic */ i(j.a aVar, int i) {
            this(aVar);
        }

        private i(j.a aVar) {
            super(aVar, 0);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f35500a;

        /* renamed from: b, reason: collision with root package name */
        public final String f35501b;

        /* renamed from: c, reason: collision with root package name */
        public final String f35502c;

        /* renamed from: d, reason: collision with root package name */
        public final int f35503d;

        /* renamed from: e, reason: collision with root package name */
        public final int f35504e;

        /* renamed from: f, reason: collision with root package name */
        public final String f35505f;

        /* renamed from: g, reason: collision with root package name */
        public final String f35506g;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f35507a;

            /* renamed from: b, reason: collision with root package name */
            private String f35508b;

            /* renamed from: c, reason: collision with root package name */
            private String f35509c;

            /* renamed from: d, reason: collision with root package name */
            private int f35510d;

            /* renamed from: e, reason: collision with root package name */
            private int f35511e;

            /* renamed from: f, reason: collision with root package name */
            private String f35512f;

            /* renamed from: g, reason: collision with root package name */
            private String f35513g;

            public /* synthetic */ a(j jVar, int i) {
                this(jVar);
            }

            private a(j jVar) {
                this.f35507a = jVar.f35500a;
                this.f35508b = jVar.f35501b;
                this.f35509c = jVar.f35502c;
                this.f35510d = jVar.f35503d;
                this.f35511e = jVar.f35504e;
                this.f35512f = jVar.f35505f;
                this.f35513g = jVar.f35506g;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public i a() {
                return new i(this, 0);
            }
        }

        public /* synthetic */ j(a aVar, int i) {
            this(aVar);
        }

        public final a a() {
            return new a(this, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f35500a.equals(jVar.f35500a) && s82.a(this.f35501b, jVar.f35501b) && s82.a(this.f35502c, jVar.f35502c) && this.f35503d == jVar.f35503d && this.f35504e == jVar.f35504e && s82.a(this.f35505f, jVar.f35505f) && s82.a(this.f35506g, jVar.f35506g);
        }

        public final int hashCode() {
            int iHashCode = this.f35500a.hashCode() * 31;
            String str = this.f35501b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f35502c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f35503d) * 31) + this.f35504e) * 31;
            String str3 = this.f35505f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f35506g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private j(a aVar) {
            this.f35500a = aVar.f35507a;
            this.f35501b = aVar.f35508b;
            this.f35502c = aVar.f35509c;
            this.f35503d = aVar.f35510d;
            this.f35504e = aVar.f35511e;
            this.f35505f = aVar.f35512f;
            this.f35506g = aVar.f35513g;
        }
    }

    static {
        new d.a(0);
        xj0.h();
        e.a aVar = new e.a();
        h hVar = h.f35493d;
        aVar.a();
        aw0 aw0Var = aw0.f24943H;
        f35437h = new E0(6);
    }

    public /* synthetic */ xv0(String str, c cVar, g gVar, e eVar, aw0 aw0Var, h hVar, int i10) {
        this(str, cVar, gVar, eVar, aw0Var, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static xv0 a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(0, 36), "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        e eVar = bundle2 == null ? e.f35474g : (e) e.f35475h.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        aw0 aw0Var = bundle3 == null ? aw0.f24943H : (aw0) aw0.f24944I.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        c cVar = bundle4 == null ? c.f35463h : (c) b.f35452g.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        return new xv0(string, cVar, null, eVar, aw0Var, bundle5 == null ? h.f35493d : (h) h.f35494e.fromBundle(bundle5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv0)) {
            return false;
        }
        xv0 xv0Var = (xv0) obj;
        return s82.a(this.f35438b, xv0Var.f35438b) && this.f35442f.equals(xv0Var.f35442f) && s82.a(this.f35439c, xv0Var.f35439c) && s82.a(this.f35440d, xv0Var.f35440d) && s82.a(this.f35441e, xv0Var.f35441e) && s82.a(this.f35443g, xv0Var.f35443g);
    }

    public final int hashCode() {
        int iHashCode = this.f35438b.hashCode() * 31;
        g gVar = this.f35439c;
        return this.f35443g.hashCode() + ((this.f35441e.hashCode() + ((this.f35442f.hashCode() + ((this.f35440d.hashCode() + ((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    private xv0(String str, c cVar, g gVar, e eVar, aw0 aw0Var, h hVar) {
        this.f35438b = str;
        this.f35439c = gVar;
        this.f35440d = eVar;
        this.f35441e = aw0Var;
        this.f35442f = cVar;
        this.f35443g = hVar;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f35444a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f35445b;

        /* renamed from: f, reason: collision with root package name */
        private String f35449f;

        /* renamed from: c, reason: collision with root package name */
        private b.a f35446c = new b.a();

        /* renamed from: d, reason: collision with root package name */
        private d.a f35447d = new d.a(0);

        /* renamed from: e, reason: collision with root package name */
        private List<k22> f35448e = Collections.EMPTY_LIST;

        /* renamed from: g, reason: collision with root package name */
        private xj0<j> f35450g = xj0.h();

        /* renamed from: h, reason: collision with root package name */
        private e.a f35451h = new e.a();
        private h i = h.f35493d;

        public final xv0 a() {
            this.f35447d.getClass();
            Uri uri = this.f35445b;
            g gVar = uri != null ? new g(uri, this.f35448e, this.f35449f, this.f35450g) : null;
            String str = this.f35444a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            b.a aVar = this.f35446c;
            aVar.getClass();
            return new xv0(str2, new c(aVar, 0), gVar, this.f35451h.a(), aw0.f24943H, this.i, 0);
        }

        public final a b(String str) {
            str.getClass();
            this.f35444a = str;
            return this;
        }

        public final a a(String str) {
            this.f35449f = str;
            return this;
        }

        public final a a(List<k22> list) {
            List<k22> listUnmodifiableList;
            if (list != null && !list.isEmpty()) {
                listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                listUnmodifiableList = Collections.EMPTY_LIST;
            }
            this.f35448e = listUnmodifiableList;
            return this;
        }

        public final a a(Uri uri) {
            this.f35445b = uri;
            return this;
        }
    }

    public static xv0 a(String str) {
        b.a aVar = new b.a();
        int i10 = 0;
        new d.a(i10);
        List list = Collections.EMPTY_LIST;
        xj0 xj0VarH = xj0.h();
        h hVar = h.f35493d;
        String str2 = null;
        Uri uri = str == null ? null : Uri.parse(str);
        return new xv0("", new c(aVar, i10), uri != null ? new g(uri, list, str2, xj0VarH) : null, new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), aw0.f24943H, hVar);
    }
}
