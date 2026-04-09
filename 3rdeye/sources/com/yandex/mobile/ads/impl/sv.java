package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sv {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f33250a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33251b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33252c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f33253d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f33254e;

    /* renamed from: f, reason: collision with root package name */
    public final long f33255f;

    /* renamed from: g, reason: collision with root package name */
    public final long f33256g;

    /* renamed from: h, reason: collision with root package name */
    public final String f33257h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f33258j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Uri f33259a;

        /* renamed from: b, reason: collision with root package name */
        private long f33260b;

        /* renamed from: c, reason: collision with root package name */
        private int f33261c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f33262d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f33263e;

        /* renamed from: f, reason: collision with root package name */
        private long f33264f;

        /* renamed from: g, reason: collision with root package name */
        private long f33265g;

        /* renamed from: h, reason: collision with root package name */
        private String f33266h;
        private int i;

        /* renamed from: j, reason: collision with root package name */
        private Object f33267j;

        public /* synthetic */ a(sv svVar, int i) {
            this(svVar);
        }

        public final sv a() {
            if (this.f33259a != null) {
                return new sv(this.f33259a, this.f33260b, this.f33261c, this.f33262d, this.f33263e, this.f33264f, this.f33265g, this.f33266h, this.i, this.f33267j, 0);
            }
            throw new IllegalStateException("The uri must be set.");
        }

        public final a b() {
            this.f33261c = 2;
            return this;
        }

        public final a c(long j4) {
            this.f33260b = j4;
            return this;
        }

        public a() {
            this.f33261c = 1;
            this.f33263e = Collections.EMPTY_MAP;
            this.f33265g = -1L;
        }

        public final a b(long j4) {
            this.f33264f = j4;
            return this;
        }

        public final a b(String str) {
            this.f33259a = Uri.parse(str);
            return this;
        }

        public final a a(int i) {
            this.i = i;
            return this;
        }

        public final a a(byte[] bArr) {
            this.f33262d = bArr;
            return this;
        }

        private a(sv svVar) {
            this.f33259a = svVar.f33250a;
            this.f33260b = svVar.f33251b;
            this.f33261c = svVar.f33252c;
            this.f33262d = svVar.f33253d;
            this.f33263e = svVar.f33254e;
            this.f33264f = svVar.f33255f;
            this.f33265g = svVar.f33256g;
            this.f33266h = svVar.f33257h;
            this.i = svVar.i;
            this.f33267j = svVar.f33258j;
        }

        public final a a(Map<String, String> map) {
            this.f33263e = map;
            return this;
        }

        public final a a(String str) {
            this.f33266h = str;
            return this;
        }

        public final a a(long j4) {
            this.f33265g = j4;
            return this;
        }

        public final a a(Uri uri) {
            this.f33259a = uri;
            return this;
        }
    }

    static {
        p60.a("goog.exo.datasource");
    }

    public /* synthetic */ sv(Uri uri, long j4, int i, byte[] bArr, Map map, long j10, long j11, String str, int i10, Object obj, int i11) {
        this(uri, j4, i, bArr, map, j10, j11, str, i10, obj);
    }

    public static String a(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(a(this.f33252c));
        sb.append(" ");
        sb.append(this.f33250a);
        sb.append(", ");
        sb.append(this.f33255f);
        sb.append(", ");
        sb.append(this.f33256g);
        sb.append(", ");
        sb.append(this.f33257h);
        sb.append(", ");
        return B4.i.j(sb, this.i, "]");
    }

    private sv(Uri uri, long j4, int i, byte[] bArr, Map<String, String> map, long j10, long j11, String str, int i10, Object obj) {
        zf.a(j4 + j10 >= 0);
        zf.a(j10 >= 0);
        zf.a(j11 > 0 || j11 == -1);
        this.f33250a = uri;
        this.f33251b = j4;
        this.f33252c = i;
        this.f33253d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f33254e = Collections.unmodifiableMap(new HashMap(map));
        this.f33255f = j10;
        this.f33256g = j11;
        this.f33257h = str;
        this.i = i10;
        this.f33258j = obj;
    }

    public final sv a(long j4) {
        return this.f33256g == j4 ? this : new sv(this.f33250a, this.f33251b, this.f33252c, this.f33253d, this.f33254e, this.f33255f, j4, this.f33257h, this.i, this.f33258j);
    }

    public final a a() {
        return new a(this, 0);
    }
}
