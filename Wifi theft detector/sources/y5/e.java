package y5;

import d6.g;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f25142a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25143b;

    public e(String str, String str2) {
        this.f25142a = str;
        this.f25143b = str2;
    }

    public static e a(String str, String str2) {
        g.e(str, "Name is null or empty");
        g.e(str2, "Version is null or empty");
        return new e(str, str2);
    }

    public String b() {
        return this.f25142a;
    }

    public String c() {
        return this.f25143b;
    }
}
