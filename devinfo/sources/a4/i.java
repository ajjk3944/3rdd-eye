package a4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final Locale[] f194c = new Locale[0];

    /* renamed from: a, reason: collision with root package name */
    public final Locale[] f195a;

    /* renamed from: b, reason: collision with root package name */
    public final String f196b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public i(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f195a = f194c;
            this.f196b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < localeArr.length; i4++) {
            Locale locale = localeArr[i4];
            if (locale == null) {
                throw new NullPointerException(r5.c.h(i4, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb2.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb2.append('-');
                    sb2.append(locale2.getCountry());
                }
                if (i4 < localeArr.length - 1) {
                    sb2.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f195a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f196b = sb2.toString();
    }

    @Override // a4.j
    public final String a() {
        return this.f196b;
    }

    @Override // a4.j
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        Locale[] localeArr = ((i) obj).f195a;
        Locale[] localeArr2 = this.f195a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < localeArr2.length; i4++) {
            if (!localeArr2[i4].equals(localeArr[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // a4.j
    public final Locale get(int i4) {
        if (i4 < 0) {
            return null;
        }
        Locale[] localeArr = this.f195a;
        if (i4 < localeArr.length) {
            return localeArr[i4];
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f195a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // a4.j
    public final boolean isEmpty() {
        return this.f195a.length == 0;
    }

    @Override // a4.j
    public final int size() {
        return this.f195a.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f195a;
            if (i4 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i4]);
            if (i4 < localeArr.length - 1) {
                sb2.append(',');
            }
            i4++;
        }
    }
}
