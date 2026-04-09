package f1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8397a;

    /* renamed from: b, reason: collision with root package name */
    public float f8398b;

    /* renamed from: c, reason: collision with root package name */
    public float f8399c;

    /* renamed from: d, reason: collision with root package name */
    public float f8400d;

    /* renamed from: e, reason: collision with root package name */
    public float f8401e;

    public a() {
        this.f8397a = 0;
        this.f8398b = 0.0f;
        this.f8399c = 0.0f;
        this.f8400d = 0.0f;
        this.f8401e = 0.0f;
    }

    public void a(float f10, float f11, float f12, float f13) {
        this.f8398b = Math.max(f10, this.f8398b);
        this.f8399c = Math.max(f11, this.f8399c);
        this.f8400d = Math.min(f12, this.f8400d);
        this.f8401e = Math.min(f13, this.f8401e);
    }

    public boolean b() {
        return (this.f8398b >= this.f8400d) | (this.f8399c >= this.f8401e);
    }

    public float c() {
        return this.f8398b + this.f8400d;
    }

    public float d() {
        return this.f8399c + this.f8401e;
    }

    public final String toString() {
        switch (this.f8397a) {
            case 0:
                return "MutableRect(" + ic.a.P(this.f8398b) + ", " + ic.a.P(this.f8399c) + ", " + ic.a.P(this.f8400d) + ", " + ic.a.P(this.f8401e) + ')';
            default:
                return "[" + this.f8398b + " " + this.f8399c + " " + this.f8400d + " " + this.f8401e + "]";
        }
    }

    public a(float f10, float f11, float f12, float f13) {
        this.f8397a = 1;
        this.f8398b = f10;
        this.f8399c = f11;
        this.f8400d = f12;
        this.f8401e = f13;
    }

    public a(a aVar) {
        this.f8397a = 1;
        this.f8398b = aVar.f8398b;
        this.f8399c = aVar.f8399c;
        this.f8400d = aVar.f8400d;
        this.f8401e = aVar.f8401e;
    }
}
