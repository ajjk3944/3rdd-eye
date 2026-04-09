package sb;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6510d;

/* renamed from: sb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7932b {
    public static final String a(String value) {
        AbstractC6492s.i(value, "value");
        byte[] bytes = value.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
        AbstractC6492s.f(bArrDigest);
        return d(bArrDigest);
    }

    public static final byte[] b(String key, String data) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(data, "data");
        Charset charsetForName = Charset.forName("utf-8");
        AbstractC6492s.h(charsetForName, "forName(...)");
        byte[] bytes = key.getBytes(charsetForName);
        AbstractC6492s.h(bytes, "getBytes(...)");
        return c(bytes, data);
    }

    public static final byte[] c(byte[] key, String data) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(data, "data");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(key, "HmacSHA256"));
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC6492s.h(charsetForName, "forName(...)");
        byte[] bytes = data.getBytes(charsetForName);
        AbstractC6492s.h(bytes, "getBytes(...)");
        byte[] bArrDoFinal = mac.doFinal(bytes);
        AbstractC6492s.h(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public static final String d(byte[] bArr) {
        AbstractC6492s.i(bArr, "<this>");
        String str = "";
        for (byte b10 : bArr) {
            String str2 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            AbstractC6492s.h(str2, "format(...)");
            str = str + str2;
        }
        return str;
    }
}
