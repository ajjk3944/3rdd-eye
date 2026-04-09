package com.yandex.mobile.ads.impl;

import N7.C1094a9;

/* loaded from: classes3.dex */
public final class sv0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f33268a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33269b;

    /* renamed from: c, reason: collision with root package name */
    private final b f33270c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33271d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33272e;

    /* renamed from: f, reason: collision with root package name */
    private final Float f33273f;

    /* renamed from: g, reason: collision with root package name */
    private final int f33274g;

    /* renamed from: h, reason: collision with root package name */
    private final int f33275h;
    private final int i;

    /* renamed from: j, reason: collision with root package name */
    private final String f33276j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f33277a;

        /* renamed from: b, reason: collision with root package name */
        private String f33278b;

        /* renamed from: c, reason: collision with root package name */
        private b f33279c;

        /* renamed from: d, reason: collision with root package name */
        private String f33280d;

        /* renamed from: e, reason: collision with root package name */
        private String f33281e;

        /* renamed from: f, reason: collision with root package name */
        private Float f33282f;

        /* renamed from: g, reason: collision with root package name */
        private int f33283g;

        /* renamed from: h, reason: collision with root package name */
        private int f33284h;
        private int i;

        /* renamed from: j, reason: collision with root package name */
        private String f33285j;

        public a(String uri) {
            kotlin.jvm.internal.l.f(uri, "uri");
            this.f33277a = uri;
        }

        public final a a(String str) {
            this.f33285j = str;
            return this;
        }

        public final a b(String str) {
            Integer numQ;
            if (str != null && (numQ = y9.m.Q(str)) != null) {
                this.i = numQ.intValue();
            }
            return this;
        }

        public final a c(String str) {
            this.f33281e = str;
            return this;
        }

        public final a d(String str) {
            b bVar;
            b[] bVarArrValues = b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i];
                if (kotlin.jvm.internal.l.b(bVar.a(), str)) {
                    break;
                }
                i++;
            }
            this.f33279c = bVar;
            return this;
        }

        public final a e(String str) {
            Integer numQ;
            if (str != null && (numQ = y9.m.Q(str)) != null) {
                this.f33283g = numQ.intValue();
            }
            return this;
        }

        public final a f(String str) {
            this.f33278b = str;
            return this;
        }

        public final a g(String str) {
            this.f33280d = str;
            return this;
        }

        public final a h(String str) {
            this.f33282f = str != null ? y9.m.P(str) : null;
            return this;
        }

        public final a i(String str) {
            Integer numQ;
            if (str != null && (numQ = y9.m.Q(str)) != null) {
                this.f33284h = numQ.intValue();
            }
            return this;
        }

        public final sv0 a() {
            return new sv0(this.f33277a, this.f33278b, this.f33279c, this.f33280d, this.f33281e, this.f33282f, this.f33283g, this.f33284h, this.i, this.f33285j);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f33286c;

        /* renamed from: b, reason: collision with root package name */
        private final String f33287b;

        static {
            b[] bVarArr = {new b(0, "STREAMING", "streaming"), new b(1, "PROGRESSIVE", "progressive")};
            f33286c = bVarArr;
            com.google.gson.internal.c.l(bVarArr);
        }

        private b(int i, String str, String str2) {
            this.f33287b = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f33286c.clone();
        }

        public final String a() {
            return this.f33287b;
        }
    }

    public sv0(String uri, String str, b bVar, String str2, String str3, Float f10, int i, int i10, int i11, String str4) {
        kotlin.jvm.internal.l.f(uri, "uri");
        this.f33268a = uri;
        this.f33269b = str;
        this.f33270c = bVar;
        this.f33271d = str2;
        this.f33272e = str3;
        this.f33273f = f10;
        this.f33274g = i;
        this.f33275h = i10;
        this.i = i11;
        this.f33276j = str4;
    }

    public final String a() {
        return this.f33276j;
    }

    public final int b() {
        return this.i;
    }

    public final String c() {
        return this.f33272e;
    }

    public final int d() {
        return this.f33274g;
    }

    public final String e() {
        return this.f33271d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv0)) {
            return false;
        }
        sv0 sv0Var = (sv0) obj;
        return kotlin.jvm.internal.l.b(this.f33268a, sv0Var.f33268a) && kotlin.jvm.internal.l.b(this.f33269b, sv0Var.f33269b) && this.f33270c == sv0Var.f33270c && kotlin.jvm.internal.l.b(this.f33271d, sv0Var.f33271d) && kotlin.jvm.internal.l.b(this.f33272e, sv0Var.f33272e) && kotlin.jvm.internal.l.b(this.f33273f, sv0Var.f33273f) && this.f33274g == sv0Var.f33274g && this.f33275h == sv0Var.f33275h && this.i == sv0Var.i && kotlin.jvm.internal.l.b(this.f33276j, sv0Var.f33276j);
    }

    public final String f() {
        return this.f33268a;
    }

    public final Float g() {
        return this.f33273f;
    }

    public final int h() {
        return this.f33275h;
    }

    public final int hashCode() {
        int iHashCode = this.f33268a.hashCode() * 31;
        String str = this.f33269b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f33270c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.f33271d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f33272e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.f33273f;
        int iA = sx1.a(this.i, sx1.a(this.f33275h, sx1.a(this.f33274g, (iHashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31, 31), 31), 31);
        String str4 = this.f33276j;
        return iA + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f33268a;
        String str2 = this.f33269b;
        b bVar = this.f33270c;
        String str3 = this.f33271d;
        String str4 = this.f33272e;
        Float f10 = this.f33273f;
        int i = this.f33274g;
        int i10 = this.f33275h;
        int i11 = this.i;
        String str5 = this.f33276j;
        StringBuilder sbD = j6.l.d("MediaFile(uri=", str, ", id=", str2, ", deliveryMethod=");
        sbD.append(bVar);
        sbD.append(", mimeType=");
        sbD.append(str3);
        sbD.append(", codec=");
        sbD.append(str4);
        sbD.append(", vmafMetric=");
        sbD.append(f10);
        sbD.append(", height=");
        C1094a9.k(sbD, i, ", width=", i10, ", bitrate=");
        sbD.append(i11);
        sbD.append(", apiFramework=");
        sbD.append(str5);
        sbD.append(")");
        return sbD.toString();
    }
}
