package o8;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.l;

/* compiled from: TestyUtils.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f44891a = new f();

    public static String b(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            l.e(messageDigest, "getInstance(...)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            l.e(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            l.e(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e4) {
            va.a.f47104a.m(e4);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093 A[Catch: Exception -> 0x0091, TRY_LEAVE, TryCatch #4 {Exception -> 0x0091, blocks: (B:15:0x0039, B:17:0x0044, B:18:0x0048, B:22:0x005a, B:24:0x0060, B:26:0x0066, B:29:0x006a, B:44:0x0093, B:52:0x00b0, B:55:0x00b6, B:59:0x00cb, B:60:0x00ce, B:31:0x006f, B:32:0x0073, B:36:0x0085, B:38:0x0089, B:41:0x008d, B:57:0x00c9, B:45:0x009c, B:47:0x00aa), top: B:80:0x0039, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r9, h9.c r10) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.f.a(android.content.Context, h9.c):java.lang.Object");
    }
}
