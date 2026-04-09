package A1;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    private static final j f225b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final k f226a;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Locale[] f227a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    private j(k kVar) {
        this.f226a = kVar;
    }

    public static j a(Locale... localeArr) {
        return h(b.a(localeArr));
    }

    public static j b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public static j d() {
        return f225b;
    }

    public static j h(LocaleList localeList) {
        return new j(new l(localeList));
    }

    public Locale c(int i10) {
        return this.f226a.get(i10);
    }

    public boolean e() {
        return this.f226a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && this.f226a.equals(((j) obj).f226a);
    }

    public int f() {
        return this.f226a.size();
    }

    public String g() {
        return this.f226a.a();
    }

    public int hashCode() {
        return this.f226a.hashCode();
    }

    public String toString() {
        return this.f226a.toString();
    }
}
