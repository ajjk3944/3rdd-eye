package n0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final Locale[] f23516c = new Locale[0];

    /* renamed from: d, reason: collision with root package name */
    public static final Locale f23517d = new Locale("en", "XA");

    /* renamed from: e, reason: collision with root package name */
    public static final Locale f23518e = new Locale("ar", "XB");

    /* renamed from: f, reason: collision with root package name */
    public static final Locale f23519f = g.b("en-Latn");

    /* renamed from: a, reason: collision with root package name */
    public final Locale[] f23520a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23521b;

    public h(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f23520a = f23516c;
            this.f23521b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale == null) {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                b(sb, locale2);
                if (i10 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f23520a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f23521b = sb.toString();
    }

    public static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // n0.i
    public String a() {
        return this.f23521b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Locale[] localeArr = ((h) obj).f23520a;
        if (this.f23520a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f23520a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // n0.i
    public Locale get(int i10) {
        if (i10 < 0) {
            return null;
        }
        Locale[] localeArr = this.f23520a;
        if (i10 < localeArr.length) {
            return localeArr[i10];
        }
        return null;
    }

    @Override // n0.i
    public Object getLocaleList() {
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f23520a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // n0.i
    public boolean isEmpty() {
        return this.f23520a.length == 0;
    }

    @Override // n0.i
    public int size() {
        return this.f23520a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f23520a;
            if (i10 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i10]);
            if (i10 < this.f23520a.length - 1) {
                sb.append(',');
            }
            i10++;
        }
    }
}
