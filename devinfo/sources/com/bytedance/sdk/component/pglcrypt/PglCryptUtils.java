package com.bytedance.sdk.component.pglcrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class PglCryptUtils {
    public static final int BASE64_FAILED = 504;
    public static final int COMPRESS_FAILED = 503;
    public static final int CRYPT_OK = 0;
    public static final int CYPHER_VERSION = 4;
    public static final int DECRYPT_FAILED = 506;
    public static final int ENCRYPT_FAILED = 505;
    public static final int INPUT_INVALID = 502;
    public static final String KEY_CYPHER = "cypher";
    public static final String KEY_MESSAGE = "message";
    public static final int LOAD_SO_FAILED = 501;
    public static final int UNKNOWN_ERR = 507;
    private static volatile PglCryptUtils ouw = null;
    private static volatile boolean vt = true;

    private PglCryptUtils() {
    }

    public static native byte[] bc(int i4, byte[] bArr);

    public static PglCryptUtils getInstance() {
        if (ouw == null) {
            synchronized (PglCryptUtils.class) {
                try {
                    if (ouw == null) {
                        try {
                            System.loadLibrary("pglarmor");
                        } catch (Throwable unused) {
                            vt = false;
                        }
                        ouw = new PglCryptUtils();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    private static byte[] ouw(String str) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        byte[] byteArray = null;
        gZIPOutputStream = null;
        byteArray = null;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str != null) {
            ?? length = str.length();
            try {
                try {
                    if (length != 0) {
                        try {
                            length = new ByteArrayOutputStream();
                        } catch (Exception e2) {
                            e = e2;
                            length = 0;
                            gZIPOutputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            length = 0;
                        }
                        try {
                            gZIPOutputStream = new GZIPOutputStream(length);
                        } catch (Exception e10) {
                            e = e10;
                            gZIPOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            if (gZIPOutputStream2 != null) {
                                try {
                                    gZIPOutputStream2.close();
                                } catch (Exception e11) {
                                    Log.e("ARMOR", e11.toString());
                                    throw th;
                                }
                            }
                            if (length != 0) {
                                length.toByteArray();
                                length.close();
                            }
                            throw th;
                        }
                        try {
                            gZIPOutputStream.write(str.getBytes("utf-8"));
                            gZIPOutputStream.close();
                            byte[] byteArray2 = length.toByteArray();
                            length.close();
                            return byteArray2;
                        } catch (Exception e12) {
                            e = e12;
                            Log.e("ARMOR", e.toString());
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (length != 0) {
                                byteArray = length.toByteArray();
                                length.close();
                            }
                            return byteArray;
                        }
                    }
                } catch (Exception e13) {
                    Log.e("ARMOR", e13.toString());
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream2 = gZIPOutputStream;
            }
        }
        return null;
    }

    public Pair<Integer, String> cypher4Decrypt(String str) throws Throwable {
        byte[] bArrBc;
        if (!vt) {
            return new Pair<>(Integer.valueOf(LOAD_SO_FAILED), null);
        }
        if (str == null || str.length() == 0) {
            return new Pair<>(Integer.valueOf(INPUT_INVALID), null);
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        if (bArrDecode == null || bArrDecode.length == 0) {
            return new Pair<>(Integer.valueOf(BASE64_FAILED), null);
        }
        try {
            bArrBc = bc(TTAdConstant.IMAGE_MODE_1011, bArrDecode);
        } catch (Throwable th2) {
            Log.e("ARMOR", th2.toString());
            bArrBc = null;
        }
        if (bArrBc == null || bArrBc.length == 0) {
            return new Pair<>(Integer.valueOf(DECRYPT_FAILED), null);
        }
        String strOuw = ouw(bArrBc);
        return TextUtils.isEmpty(strOuw) ? new Pair<>(Integer.valueOf(COMPRESS_FAILED), null) : new Pair<>(0, strOuw);
    }

    public Pair<Integer, JSONObject> cypher4Encrypt(JSONObject jSONObject) throws Throwable {
        Pair<Integer, String> pairCypher4EncryptWithNoWrapBase64 = cypher4EncryptWithNoWrapBase64(jSONObject.toString());
        if (pairCypher4EncryptWithNoWrapBase64 == null) {
            return new Pair<>(Integer.valueOf(UNKNOWN_ERR), null);
        }
        if (((Integer) pairCypher4EncryptWithNoWrapBase64.first).intValue() != 0) {
            return new Pair<>(pairCypher4EncryptWithNoWrapBase64.first, null);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = (String) pairCypher4EncryptWithNoWrapBase64.second;
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(Integer.valueOf(BASE64_FAILED), null);
        }
        jSONObject2.put(KEY_MESSAGE, str);
        jSONObject2.put("cypher", 4);
        return new Pair<>(0, jSONObject2);
    }

    public Pair<Integer, String> cypher4EncryptWithNoWrapBase64(String str) throws Throwable {
        if (!vt) {
            return new Pair<>(Integer.valueOf(LOAD_SO_FAILED), null);
        }
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(Integer.valueOf(INPUT_INVALID), null);
        }
        byte[] bArrOuw = ouw(str);
        if (bArrOuw == null || bArrOuw.length == 0) {
            return new Pair<>(Integer.valueOf(COMPRESS_FAILED), null);
        }
        Pair<Integer, byte[]> pairCypher4Encrypt = cypher4Encrypt(bArrOuw);
        if (pairCypher4Encrypt == null) {
            return new Pair<>(Integer.valueOf(UNKNOWN_ERR), null);
        }
        if (((Integer) pairCypher4Encrypt.first).intValue() != 0) {
            return new Pair<>(pairCypher4Encrypt.first, null);
        }
        String strEncodeToString = Base64.encodeToString((byte[]) pairCypher4Encrypt.second, 2);
        return TextUtils.isEmpty(strEncodeToString) ? new Pair<>(Integer.valueOf(BASE64_FAILED), null) : new Pair<>(0, strEncodeToString);
    }

    public Pair<Integer, byte[]> cypher4Encrypt(byte[] bArr) {
        byte[] bArrBc;
        if (!vt) {
            return new Pair<>(Integer.valueOf(LOAD_SO_FAILED), null);
        }
        if (bArr != null && bArr.length != 0) {
            try {
                bArrBc = bc(TTAdConstant.IMAGE_MODE_1010, bArr);
            } catch (Throwable th2) {
                Log.e("ARMOR", th2.toString());
                bArrBc = null;
            }
            if (bArrBc != null && bArrBc.length != 0) {
                return new Pair<>(0, bArrBc);
            }
            return new Pair<>(Integer.valueOf(ENCRYPT_FAILED), null);
        }
        return new Pair<>(Integer.valueOf(INPUT_INVALID), null);
    }

    private static String ouw(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream;
        Exception exc;
        String str;
        GZIPInputStream gZIPInputStream2 = null;
        String string = null;
        gZIPInputStream2 = null;
        gZIPInputStream2 = null;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    try {
                        byte[] bArr2 = new byte[Segment.SHARE_MINIMUM];
                        while (true) {
                            int i4 = gZIPInputStream.read(bArr2);
                            if (i4 != -1) {
                                byteArrayOutputStream.write(bArr2, 0, i4);
                            } else {
                                string = byteArrayOutputStream.toString("utf-8");
                                byteArrayInputStream.close();
                                try {
                                    gZIPInputStream.close();
                                    byteArrayOutputStream.close();
                                    return string;
                                } catch (Exception e2) {
                                    Log.e("ARMOR", e2.toString());
                                    return string;
                                }
                            }
                        }
                    } catch (Exception e10) {
                        str = string;
                        gZIPInputStream2 = gZIPInputStream;
                        exc = e10;
                        Log.e("ARMOR", exc.toString());
                        if (gZIPInputStream2 != null) {
                            try {
                                gZIPInputStream2.close();
                            } catch (Exception e11) {
                                Log.e("ARMOR", e11.toString());
                                return str;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return str;
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (Exception e12) {
                                Log.e("ARMOR", e12.toString());
                                throw th2;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    gZIPInputStream = gZIPInputStream2;
                    th2 = th4;
                }
            } catch (Exception e13) {
                exc = e13;
                str = null;
            }
        } catch (Exception e14) {
            byteArrayOutputStream = null;
            exc = e14;
            str = null;
        } catch (Throwable th5) {
            gZIPInputStream = null;
            th2 = th5;
            byteArrayOutputStream = null;
        }
    }
}
