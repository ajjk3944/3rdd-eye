package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class p2 {

    /* renamed from: a, reason: collision with root package name */
    private String f5041a;

    /* renamed from: b, reason: collision with root package name */
    private String f5042b;

    /* renamed from: c, reason: collision with root package name */
    private int f5043c;

    /* renamed from: d, reason: collision with root package name */
    private int f5044d;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f5045a;

        /* renamed from: b, reason: collision with root package name */
        private String f5046b;

        /* renamed from: c, reason: collision with root package name */
        private int f5047c;

        /* renamed from: d, reason: collision with root package name */
        private int f5048d;

        public p2 a() {
            return new p2(this.f5045a, this.f5046b, this.f5047c, this.f5048d);
        }

        public a b(int i4) {
            this.f5047c = i4;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=");
            sb2.append(this.f5045a);
            sb2.append(", signature=");
            sb2.append(this.f5046b);
            sb2.append(", responseCode=");
            sb2.append(this.f5047c);
            sb2.append(", nonce=");
            return r5.c.j(this.f5048d, ")", sb2);
        }

        public a a(int i4) {
            this.f5048d = i4;
            return this;
        }

        public a b(String str) {
            this.f5045a = str;
            return this;
        }

        public a a(String str) {
            this.f5046b = str;
            return this;
        }
    }

    public p2(String str, String str2, int i4, int i10) {
        this.f5041a = str;
        this.f5042b = str2;
        this.f5043c = i4;
        this.f5044d = i10;
    }

    public boolean a(Object obj) {
        return obj instanceof p2;
    }

    public int b() {
        return this.f5044d;
    }

    public int c() {
        return this.f5043c;
    }

    public String d() {
        return this.f5042b;
    }

    public String e() {
        return this.f5041a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (!p2Var.a(this) || c() != p2Var.c() || b() != p2Var.b()) {
            return false;
        }
        String strE = e();
        String strE2 = p2Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = p2Var.d();
        return strD != null ? strD.equals(strD2) : strD2 == null;
    }

    public int hashCode() {
        int iB = b() + ((c() + 59) * 59);
        String strE = e();
        int iHashCode = (iB * 59) + (strE == null ? 43 : strE.hashCode());
        String strD = d();
        return (iHashCode * 59) + (strD != null ? strD.hashCode() : 43);
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + ")";
    }

    public static a a() {
        return new a();
    }
}
