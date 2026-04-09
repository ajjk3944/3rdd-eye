package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f51995a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f51996b;

    public interface a {
        int getNumber();
    }

    public interface b {
        a a(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f51995a = bArr;
        f51996b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return u.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }
}
