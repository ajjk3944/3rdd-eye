package ol;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f30583a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f30584b = new byte[WebSocketProtocol.PAYLOAD_SHORT];

    static {
        for (int i4 = 0; i4 < 32; i4++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        byte[] bArr = f30584b;
        for (int i10 = 0; i10 < 33; i10++) {
            bArr[i10] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    public static void a(char c9, int i4) {
        if (c9 != 'u') {
            f30583a[c9] = (char) i4;
        }
    }
}
