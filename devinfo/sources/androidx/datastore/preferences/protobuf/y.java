package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1081a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1082b;

    static {
        Charset.forName("US-ASCII");
        f1081a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f1082b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new h(bArr, 0, 0, false).i(0);
        } catch (a0 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
