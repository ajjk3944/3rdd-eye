package S;

/* compiled from: AutoValue_Version.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    public final int f11828e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11829f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11830g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11831h;

    public a(int i, int i10, int i11, String str) {
        this.f11828e = i;
        this.f11829f = i10;
        this.f11830g = i11;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.f11831h = str;
    }

    @Override // S.e
    public final String b() {
        return this.f11831h;
    }

    @Override // S.e
    public final int c() {
        return this.f11828e;
    }

    @Override // S.e
    public final int d() {
        return this.f11829f;
    }

    @Override // S.e
    public final int e() {
        return this.f11830g;
    }
}
