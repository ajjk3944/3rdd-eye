package P;

import P.e;

/* compiled from: AutoValue_GraphicDeviceInfo.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f10527a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10528b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10529c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10530d;

    /* compiled from: AutoValue_GraphicDeviceInfo.java */
    /* renamed from: P.a$a, reason: collision with other inner class name */
    public static final class C0118a extends e.a {

        /* renamed from: a, reason: collision with root package name */
        public String f10531a;

        /* renamed from: b, reason: collision with root package name */
        public String f10532b;

        /* renamed from: c, reason: collision with root package name */
        public String f10533c;

        /* renamed from: d, reason: collision with root package name */
        public String f10534d;
    }

    public a(String str, String str2, String str3, String str4) {
        this.f10527a = str;
        this.f10528b = str2;
        this.f10529c = str3;
        this.f10530d = str4;
    }

    @Override // P.e
    public final String a() {
        return this.f10530d;
    }

    @Override // P.e
    public final String b() {
        return this.f10528b;
    }

    @Override // P.e
    public final String c() {
        return this.f10529c;
    }

    @Override // P.e
    public final String d() {
        return this.f10527a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f10527a.equals(eVar.d()) && this.f10528b.equals(eVar.b()) && this.f10529c.equals(eVar.c()) && this.f10530d.equals(eVar.a());
    }

    public final int hashCode() {
        return ((((((this.f10527a.hashCode() ^ 1000003) * 1000003) ^ this.f10528b.hashCode()) * 1000003) ^ this.f10529c.hashCode()) * 1000003) ^ this.f10530d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.f10527a);
        sb.append(", eglVersion=");
        sb.append(this.f10528b);
        sb.append(", glExtensions=");
        sb.append(this.f10529c);
        sb.append(", eglExtensions=");
        return B4.f.c(sb, this.f10530d, "}");
    }
}
