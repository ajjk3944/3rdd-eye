package Pg;

import Ej.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static Ej.b f18670a = c.i(a.class);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f18671b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f18672c = {0};

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f18673d = Charset.forName("UTF-8");

    public static byte[] a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
        f(byteArrayOutputStream2, str);
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        if (byteArray.length > 255) {
            f18670a.a("Cannot have individual values larger that 255 chars. Offending value: {}", str);
            return f18672c;
        }
        byteArrayOutputStream.write((byte) byteArray.length);
        byteArrayOutputStream.write(byteArray, 0, byteArray.length);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        return byteArray2.length > 0 ? byteArray2 : f18672c;
    }

    public static void b(Map map, byte[] bArr) {
        int i10;
        if (bArr != null) {
            int i11 = 0;
            while (i11 < bArr.length) {
                int i12 = i11 + 1;
                int i13 = bArr[i11] & 255;
                if (i13 == 0 || (i10 = i12 + i13) > bArr.length) {
                    map.clear();
                    return;
                }
                int i14 = 0;
                while (i14 < i13 && bArr[i12 + i14] != 61) {
                    i14++;
                }
                String strD = d(bArr, i12, i14);
                if (strD == null) {
                    map.clear();
                    return;
                }
                if (i14 == i13) {
                    map.put(strD, f18671b);
                } else {
                    int i15 = i14 + 1;
                    int i16 = i13 - i15;
                    byte[] bArr2 = new byte[i16];
                    System.arraycopy(bArr, i12 + i15, bArr2, 0, i16);
                    map.put(strD, bArr2);
                }
                i11 = i10;
            }
        }
    }

    public static String c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static String d(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, f18673d);
    }

    public static byte[] e(Map map) {
        byte[] byteArray = null;
        if (map != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
                    f(byteArrayOutputStream2, str);
                    if (value != null) {
                        if (value instanceof String) {
                            byteArrayOutputStream2.write(61);
                            f(byteArrayOutputStream2, (String) value);
                        } else {
                            if (!(value instanceof byte[])) {
                                throw new IllegalArgumentException("Invalid property value: " + value);
                            }
                            byte[] bArr = (byte[]) value;
                            if (bArr.length > 0) {
                                byteArrayOutputStream2.write(61);
                                byteArrayOutputStream2.write(bArr, 0, bArr.length);
                            } else {
                                value = null;
                            }
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    if (byteArray2.length > 255) {
                        Ej.b bVar = f18670a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(value == null ? "" : "=" + value);
                        bVar.a("Cannot have individual values larger that 255 chars. Offending value: {}", sb2.toString());
                        return f18672c;
                    }
                    byteArrayOutputStream.write((byte) byteArray2.length);
                    byteArrayOutputStream.write(byteArray2, 0, byteArray2.length);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException e10) {
                throw new RuntimeException("unexpected exception: " + e10);
            }
        }
        return (byteArray == null || byteArray.length <= 0) ? f18672c : byteArray;
    }

    public static void f(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(f18673d));
    }
}
