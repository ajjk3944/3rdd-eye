package ca;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f33899a;

    private /* synthetic */ b(String str) {
        this.f33899a = str;
    }

    public static final /* synthetic */ b a(String str) {
        return new b(str);
    }

    public static String b(String token) {
        AbstractC6492s.i(token, "token");
        return token;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof b) && AbstractC6492s.d(str, ((b) obj).g());
    }

    public static final boolean d(String str, String str2) {
        return AbstractC6492s.d(str, str2);
    }

    public static int e(String str) {
        return str.hashCode();
    }

    public static String f(String str) {
        return "RecaptchaToken(token=" + str + ")";
    }

    public boolean equals(Object obj) {
        return c(this.f33899a, obj);
    }

    public final /* synthetic */ String g() {
        return this.f33899a;
    }

    public int hashCode() {
        return e(this.f33899a);
    }

    public String toString() {
        return f(this.f33899a);
    }
}
