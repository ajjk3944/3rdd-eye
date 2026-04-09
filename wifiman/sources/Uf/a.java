package Uf;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static a f22434b = new a("none");

    /* renamed from: c, reason: collision with root package name */
    public static a f22435c = new a("2d");

    /* renamed from: d, reason: collision with root package name */
    public static a f22436d = new a("3d");

    /* renamed from: e, reason: collision with root package name */
    public static a f22437e = new a("dgps");

    /* renamed from: f, reason: collision with root package name */
    public static a f22438f = new a("pps");

    /* renamed from: a, reason: collision with root package name */
    private String f22439a;

    private a(String str) {
        this.f22439a = str;
    }

    public static a b(String str) {
        if (f22434b.a().equals(str)) {
            return f22434b;
        }
        if (f22435c.a().equals(str)) {
            return f22435c;
        }
        if (f22436d.a().equals(str)) {
            return f22436d;
        }
        if (f22437e.a().equals(str)) {
            return f22437e;
        }
        if (f22438f.a().equals(str)) {
            return f22438f;
        }
        return null;
    }

    public String a() {
        return this.f22439a;
    }

    public String toString() {
        return this.f22439a;
    }
}
