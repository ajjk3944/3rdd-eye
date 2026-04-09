package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y70 {
    public static final y70 b = new y70(new z70(x70.a(new Locale[0])));
    public final z70 a;

    public y70(z70 z70Var) {
        this.a = z70Var;
    }

    public static y70 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = w70.a(strArrSplit[i]);
        }
        return new y70(new z70(x70.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y70) {
            return this.a.equals(((y70) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
