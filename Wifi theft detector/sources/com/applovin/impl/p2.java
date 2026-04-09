package com.applovin.impl;

/* loaded from: classes.dex */
public class p2 {

    /* renamed from: a, reason: collision with root package name */
    private String f7219a;

    /* renamed from: b, reason: collision with root package name */
    private String f7220b;

    /* renamed from: c, reason: collision with root package name */
    private int f7221c;

    /* renamed from: d, reason: collision with root package name */
    private int f7222d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f7223a;

        /* renamed from: b, reason: collision with root package name */
        private String f7224b;

        /* renamed from: c, reason: collision with root package name */
        private int f7225c;

        /* renamed from: d, reason: collision with root package name */
        private int f7226d;

        public p2 a() {
            return new p2(this.f7223a, this.f7224b, this.f7225c, this.f7226d);
        }

        public a b(int i10) {
            this.f7225c = i10;
            return this;
        }

        public String toString() {
            return "LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=" + this.f7223a + ", signature=" + this.f7224b + ", responseCode=" + this.f7225c + ", nonce=" + this.f7226d + ")";
        }

        public a a(int i10) {
            this.f7226d = i10;
            return this;
        }

        public a b(String str) {
            this.f7223a = str;
            return this;
        }

        public a a(String str) {
            this.f7224b = str;
            return this;
        }
    }

    public p2(String str, String str2, int i10, int i11) {
        this.f7219a = str;
        this.f7220b = str2;
        this.f7221c = i10;
        this.f7222d = i11;
    }

    public boolean a(Object obj) {
        return obj instanceof p2;
    }

    public int b() {
        return this.f7222d;
    }

    public int c() {
        return this.f7221c;
    }

    public String d() {
        return this.f7220b;
    }

    public String e() {
        return this.f7219a;
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
        int iC = ((c() + 59) * 59) + b();
        String strE = e();
        int iHashCode = (iC * 59) + (strE == null ? 43 : strE.hashCode());
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
