package N1;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final MessageDigest f2982a;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f2983b;

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        f2982a = messageDigest;
        f2983b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static String a(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = f2982a;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (a.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        if (bArrDigest == null || bArrDigest.length == 0) {
            return null;
        }
        char[] cArr = new char[bArrDigest.length << 1];
        int i = 0;
        for (byte b5 : bArrDigest) {
            int i3 = i + 1;
            char[] cArr2 = f2983b;
            cArr[i] = cArr2[(b5 & 240) >> 4];
            i += 2;
            cArr[i3] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }
}
