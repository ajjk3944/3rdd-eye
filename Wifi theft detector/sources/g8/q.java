package g8;

import com.wifihacker.detector.HackerApplication;

/* loaded from: classes3.dex */
public abstract class q {
    public static boolean a(String str, String... strArr) {
        if (str == null) {
            return false;
        }
        if (strArr == null) {
            return true;
        }
        for (String str2 : strArr) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String b(int i10) {
        return HackerApplication.l().getString(i10);
    }
}
