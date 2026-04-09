package z6;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public e f25366a;

    /* renamed from: b, reason: collision with root package name */
    public String f25367b;

    /* renamed from: c, reason: collision with root package name */
    public a7.a f25368c;

    public c(String str) {
        this.f25367b = str;
    }

    public e a() {
        return this.f25366a;
    }

    public a7.a b() {
        return this.f25368c;
    }

    public String c() {
        return this.f25367b;
    }

    public void d() {
        try {
            f fVar = new f();
            fVar.f(this);
            fVar.c();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public c e(e eVar) {
        this.f25366a = eVar;
        return this;
    }

    public c f(a7.a aVar) {
        this.f25368c = aVar;
        return this;
    }
}
