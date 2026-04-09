package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5097y {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f38597a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f38598b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f38599c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f38600d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f38601e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC5082i f38602f;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$a */
    public interface a {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$b */
    public interface b {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$c */
    public interface c {
        boolean a(int i10);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$d */
    public interface d extends List, RandomAccess {
        boolean E();

        void n();

        d p(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f38600d = bArr;
        f38601e = ByteBuffer.wrap(bArr);
        f38602f = AbstractC5082i.h(bArr);
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
        int iH = h(i11, bArr, i10, i11);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return m0.m(bArr);
    }

    static int h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f38598b);
    }
}
