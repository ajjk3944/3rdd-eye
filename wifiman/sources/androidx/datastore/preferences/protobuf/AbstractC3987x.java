package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3987x {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f30964a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f30965b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f30966c;

    /* renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f30967d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC3972h f30968e;

    /* renamed from: androidx.datastore.preferences.protobuf.x$a */
    public interface a {
        boolean a(int i10);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$b */
    public interface b extends List, RandomAccess {
        boolean E();

        void n();

        b p(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f30966c = bArr;
        f30967d = ByteBuffer.wrap(bArr);
        f30968e = AbstractC3972h.h(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return n0.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((M) obj).l().J((M) obj2).y();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f30964a);
    }
}
