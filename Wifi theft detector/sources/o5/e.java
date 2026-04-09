package o5;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f23661a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23662b;

    public e(String str, String str2) {
        this.f23661a = str;
        this.f23662b = str2;
    }

    public static e a(String str, String str2) {
        t5.g.e(str, "Name is null or empty");
        t5.g.e(str2, "Version is null or empty");
        return new e(str, str2);
    }

    public String b() {
        return this.f23661a;
    }

    public String c() {
        return this.f23662b;
    }
}
