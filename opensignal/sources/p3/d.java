package p3;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f20244b = new d(new e(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final e f20245a;

    public d(e eVar) {
        this.f20245a = eVar;
    }

    public static d a(String str) {
        if (str == null || str.isEmpty()) {
            return f20244b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArrSplit[i10];
            int i11 = c.f20243a;
            localeArr[i10] = Locale.forLanguageTag(str2);
        }
        return new d(new e(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f20245a.equals(((d) obj).f20245a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20245a.f20246a.hashCode();
    }

    public final String toString() {
        return this.f20245a.f20246a.toString();
    }
}
