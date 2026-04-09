package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class om {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f31424n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31425a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31426b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31427c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31428d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f31429e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f31430f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f31431g;

    /* renamed from: h, reason: collision with root package name */
    private final int f31432h;
    private final int i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f31433j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f31434k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f31435l;

    /* renamed from: m, reason: collision with root package name */
    private String f31436m;

    public static final class a {
        public final a a() {
            return this;
        }

        public final a a(TimeUnit timeUnit) {
            kotlin.jvm.internal.l.f(timeUnit, "timeUnit");
            timeUnit.toSeconds(Integer.MAX_VALUE);
            return this;
        }

        public final a b() {
            return this;
        }
    }

    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.yandex.mobile.ads.impl.om a(com.yandex.mobile.ads.impl.kf0 r27) {
            /*
                Method dump skipped, instructions count: 485
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.om.b.a(com.yandex.mobile.ads.impl.kf0):com.yandex.mobile.ads.impl.om");
        }
    }

    static {
        new a().a();
        new a().b().a(TimeUnit.SECONDS);
    }

    private om(boolean z10, boolean z11, int i, int i10, boolean z12, boolean z13, boolean z14, int i11, int i12, boolean z15, boolean z16, boolean z17, String str) {
        this.f31425a = z10;
        this.f31426b = z11;
        this.f31427c = i;
        this.f31428d = i10;
        this.f31429e = z12;
        this.f31430f = z13;
        this.f31431g = z14;
        this.f31432h = i11;
        this.i = i12;
        this.f31433j = z15;
        this.f31434k = z16;
        this.f31435l = z17;
        this.f31436m = str;
    }

    public final boolean a() {
        return this.f31433j;
    }

    public final String toString() {
        String str = this.f31436m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f31425a) {
            sb.append("no-cache, ");
        }
        if (this.f31426b) {
            sb.append("no-store, ");
        }
        if (this.f31427c != -1) {
            sb.append("max-age=");
            sb.append(this.f31427c);
            sb.append(", ");
        }
        if (this.f31428d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f31428d);
            sb.append(", ");
        }
        if (this.f31429e) {
            sb.append("private, ");
        }
        if (this.f31430f) {
            sb.append("public, ");
        }
        if (this.f31431g) {
            sb.append("must-revalidate, ");
        }
        if (this.f31432h != -1) {
            sb.append("max-stale=");
            sb.append(this.f31432h);
            sb.append(", ");
        }
        if (this.i != -1) {
            sb.append("min-fresh=");
            sb.append(this.i);
            sb.append(", ");
        }
        if (this.f31433j) {
            sb.append("only-if-cached, ");
        }
        if (this.f31434k) {
            sb.append("no-transform, ");
        }
        if (this.f31435l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        this.f31436m = string;
        return string;
    }

    public /* synthetic */ om(boolean z10, boolean z11, int i, int i10, boolean z12, boolean z13, boolean z14, int i11, int i12, boolean z15, boolean z16, boolean z17, String str, int i13) {
        this(z10, z11, i, i10, z12, z13, z14, i11, i12, z15, z16, z17, str);
    }
}
