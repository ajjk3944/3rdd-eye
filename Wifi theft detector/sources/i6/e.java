package i6;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f21616a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21617b;

    public e(String str, String str2) {
        this.f21616a = str;
        this.f21617b = str2;
    }

    public static e a(String str, String str2) {
        n6.g.f(str, "Name is null or empty");
        n6.g.f(str2, "Version is null or empty");
        return new e(str, str2);
    }

    public String b() {
        return this.f21616a;
    }

    public String c() {
        return this.f21617b;
    }
}
