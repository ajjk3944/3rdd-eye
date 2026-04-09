package com.mbridge.msdk.thrid.okhttp;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.xbill.DNS.TTL;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final c f17504n = new a().b().a();

    /* renamed from: o, reason: collision with root package name */
    public static final c f17505o = new a().c().a(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17506a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17507b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17508c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17509d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17510e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f17511f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f17512g;

    /* renamed from: h, reason: collision with root package name */
    private final int f17513h;

    /* renamed from: i, reason: collision with root package name */
    private final int f17514i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f17515j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f17516k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f17517l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    String f17518m;

    private c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, @Nullable String str) {
        this.f17506a = z10;
        this.f17507b = z11;
        this.f17508c = i10;
        this.f17509d = i11;
        this.f17510e = z12;
        this.f17511f = z13;
        this.f17512g = z14;
        this.f17513h = i12;
        this.f17514i = i13;
        this.f17515j = z15;
        this.f17516k = z16;
        this.f17517l = z17;
        this.f17518m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.thrid.okhttp.c a(com.mbridge.msdk.thrid.okhttp.r r23) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.c.a(com.mbridge.msdk.thrid.okhttp.r):com.mbridge.msdk.thrid.okhttp.c");
    }

    public boolean b() {
        return this.f17510e;
    }

    public boolean c() {
        return this.f17511f;
    }

    public int d() {
        return this.f17508c;
    }

    public int e() {
        return this.f17513h;
    }

    public int f() {
        return this.f17514i;
    }

    public boolean g() {
        return this.f17512g;
    }

    public boolean h() {
        return this.f17506a;
    }

    public boolean i() {
        return this.f17507b;
    }

    public boolean j() {
        return this.f17515j;
    }

    public String toString() {
        String str = this.f17518m;
        if (str != null) {
            return str;
        }
        String strA = a();
        this.f17518m = strA;
        return strA;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f17519a;

        /* renamed from: b, reason: collision with root package name */
        boolean f17520b;

        /* renamed from: c, reason: collision with root package name */
        int f17521c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f17522d = -1;

        /* renamed from: e, reason: collision with root package name */
        int f17523e = -1;

        /* renamed from: f, reason: collision with root package name */
        boolean f17524f;

        /* renamed from: g, reason: collision with root package name */
        boolean f17525g;

        /* renamed from: h, reason: collision with root package name */
        boolean f17526h;

        public a a(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds(i10);
                this.f17522d = seconds > TTL.MAX_VALUE ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i10);
        }

        public a b() {
            this.f17519a = true;
            return this;
        }

        public a c() {
            this.f17524f = true;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    public c(a aVar) {
        this.f17506a = aVar.f17519a;
        this.f17507b = aVar.f17520b;
        this.f17508c = aVar.f17521c;
        this.f17509d = -1;
        this.f17510e = false;
        this.f17511f = false;
        this.f17512g = false;
        this.f17513h = aVar.f17522d;
        this.f17514i = aVar.f17523e;
        this.f17515j = aVar.f17524f;
        this.f17516k = aVar.f17525g;
        this.f17517l = aVar.f17526h;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (this.f17506a) {
            sb.append("no-cache, ");
        }
        if (this.f17507b) {
            sb.append("no-store, ");
        }
        if (this.f17508c != -1) {
            sb.append("max-age=");
            sb.append(this.f17508c);
            sb.append(", ");
        }
        if (this.f17509d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f17509d);
            sb.append(", ");
        }
        if (this.f17510e) {
            sb.append("private, ");
        }
        if (this.f17511f) {
            sb.append("public, ");
        }
        if (this.f17512g) {
            sb.append("must-revalidate, ");
        }
        if (this.f17513h != -1) {
            sb.append("max-stale=");
            sb.append(this.f17513h);
            sb.append(", ");
        }
        if (this.f17514i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f17514i);
            sb.append(", ");
        }
        if (this.f17515j) {
            sb.append("only-if-cached, ");
        }
        if (this.f17516k) {
            sb.append("no-transform, ");
        }
        if (this.f17517l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }
}
