package Z;

import Z.a;

/* compiled from: AutoValue_AudioSettings.java */
/* loaded from: classes.dex */
public final class l extends Z.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f13946b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13947c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13948d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13949e;

    /* compiled from: AutoValue_AudioSettings.java */
    public static final class a extends a.AbstractC0204a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f13950a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f13951b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f13952c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f13953d;
    }

    public l(int i, int i10, int i11, int i12) {
        this.f13946b = i;
        this.f13947c = i10;
        this.f13948d = i11;
        this.f13949e = i12;
    }

    @Override // Z.a
    public final int a() {
        return this.f13949e;
    }

    @Override // Z.a
    public final int b() {
        return this.f13946b;
    }

    @Override // Z.a
    public final int d() {
        return this.f13948d;
    }

    @Override // Z.a
    public final int e() {
        return this.f13947c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z.a)) {
            return false;
        }
        Z.a aVar = (Z.a) obj;
        return this.f13946b == aVar.b() && this.f13947c == aVar.e() && this.f13948d == aVar.d() && this.f13949e == aVar.a();
    }

    public final int hashCode() {
        return ((((((this.f13946b ^ 1000003) * 1000003) ^ this.f13947c) * 1000003) ^ this.f13948d) * 1000003) ^ this.f13949e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSettings{audioSource=");
        sb.append(this.f13946b);
        sb.append(", sampleRate=");
        sb.append(this.f13947c);
        sb.append(", channelCount=");
        sb.append(this.f13948d);
        sb.append(", audioFormat=");
        return B4.i.j(sb, this.f13949e, "}");
    }
}
