package Y2;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f4253a;

    public static C0219v a(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            String strValueOf = String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(strConcat) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new C0219v(strConcat, str2);
    }

    public static void b(int i, int i3) {
        String strB;
        if (i < 0 || i >= i3) {
            if (i < 0) {
                strB = AbstractC0218u.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(AbstractC1135f5.l(i3, "negative size: "));
                }
                strB = AbstractC0218u.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void d(int i, int i3, int i6) {
        if (i < 0 || i3 < i || i3 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? e(i, i6, "start index") : (i3 < 0 || i3 > i6) ? e(i3, i6, "end index") : AbstractC0218u.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i)));
        }
    }

    public static String e(int i, int i3, String str) {
        if (i < 0) {
            return AbstractC0218u.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i3 >= 0) {
            return AbstractC0218u.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(AbstractC1135f5.l(i3, "negative size: "));
    }
}
