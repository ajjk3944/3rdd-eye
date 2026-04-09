package ca;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ca.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4234a {

    /* renamed from: a, reason: collision with root package name */
    private final String f33898a;

    private /* synthetic */ C4234a(String str) {
        this.f33898a = str;
    }

    public static final /* synthetic */ C4234a a(String str) {
        return new C4234a(str);
    }

    public static String b(String siteKey) {
        AbstractC6492s.i(siteKey, "siteKey");
        return siteKey;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof C4234a) && AbstractC6492s.d(str, ((C4234a) obj).g());
    }

    public static final boolean d(String str, String str2) {
        return AbstractC6492s.d(str, str2);
    }

    public static int e(String str) {
        return str.hashCode();
    }

    public static String f(String str) {
        return "RecaptchaSiteKey(siteKey=" + str + ")";
    }

    public boolean equals(Object obj) {
        return c(this.f33898a, obj);
    }

    public final /* synthetic */ String g() {
        return this.f33898a;
    }

    public int hashCode() {
        return e(this.f33898a);
    }

    public String toString() {
        return f(this.f33898a);
    }
}
