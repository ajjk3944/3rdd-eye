package Q4;

import N7.G8;
import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* loaded from: classes2.dex */
public final class Z extends f0.e.AbstractC0146e {

    /* renamed from: a, reason: collision with root package name */
    public final int f11138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11139b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11140c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11141d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    public static final class a extends f0.e.AbstractC0146e.a {

        /* renamed from: a, reason: collision with root package name */
        public int f11142a;

        /* renamed from: b, reason: collision with root package name */
        public String f11143b;

        /* renamed from: c, reason: collision with root package name */
        public String f11144c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f11145d;

        /* renamed from: e, reason: collision with root package name */
        public byte f11146e;

        public final Z a() {
            String str;
            String str2;
            if (this.f11146e == 3 && (str = this.f11143b) != null && (str2 = this.f11144c) != null) {
                return new Z(this.f11142a, str, str2, this.f11145d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f11146e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f11143b == null) {
                sb.append(" version");
            }
            if (this.f11144c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f11146e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
        }
    }

    public Z(int i, String str, String str2, boolean z10) {
        this.f11138a = i;
        this.f11139b = str;
        this.f11140c = str2;
        this.f11141d = z10;
    }

    @Override // Q4.f0.e.AbstractC0146e
    public final String a() {
        return this.f11140c;
    }

    @Override // Q4.f0.e.AbstractC0146e
    public final int b() {
        return this.f11138a;
    }

    @Override // Q4.f0.e.AbstractC0146e
    public final String c() {
        return this.f11139b;
    }

    @Override // Q4.f0.e.AbstractC0146e
    public final boolean d() {
        return this.f11141d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.AbstractC0146e)) {
            return false;
        }
        f0.e.AbstractC0146e abstractC0146e = (f0.e.AbstractC0146e) obj;
        return this.f11138a == abstractC0146e.b() && this.f11139b.equals(abstractC0146e.c()) && this.f11140c.equals(abstractC0146e.a()) && this.f11141d == abstractC0146e.d();
    }

    public final int hashCode() {
        return ((((((this.f11138a ^ 1000003) * 1000003) ^ this.f11139b.hashCode()) * 1000003) ^ this.f11140c.hashCode()) * 1000003) ^ (this.f11141d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.f11138a);
        sb.append(", version=");
        sb.append(this.f11139b);
        sb.append(", buildVersion=");
        sb.append(this.f11140c);
        sb.append(", jailbroken=");
        return androidx.work.s.h(sb, this.f11141d, "}");
    }
}
