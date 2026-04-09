package a4;

import android.os.Build;
import com.google.android.gms.internal.measurement.j4;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f192b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final j f193a;

    public h(j jVar) {
        this.f193a = jVar;
    }

    public static h a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new h(new k(j4.d(localeArr))) : new h(new i(localeArr));
    }

    public static h b(String str) {
        if (str == null || str.isEmpty()) {
            return f192b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i4 = 0; i4 < length; i4++) {
            String str2 = strArrSplit[i4];
            int i10 = g.f191a;
            localeArr[i4] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f193a.equals(((h) obj).f193a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f193a.hashCode();
    }

    public final String toString() {
        return this.f193a.toString();
    }
}
