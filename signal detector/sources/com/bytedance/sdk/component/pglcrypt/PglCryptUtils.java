package com.bytedance.sdk.component.pglcrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

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
    private static volatile PglCryptUtils emc = null;
    private static volatile boolean ypw = true;

    private PglCryptUtils() {
    }

    public static native byte[] bc(int i, byte[] bArr);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    private static byte[] emc(String str) throws Throwable {
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
                        } catch (Exception e6) {
                            e = e6;
                            length = 0;
                            gZIPOutputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            length = 0;
                        }
                        try {
                            gZIPOutputStream = new GZIPOutputStream(length);
                        } catch (Exception e7) {
                            e = e7;
                            gZIPOutputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (gZIPOutputStream2 != null) {
                                try {
                                    gZIPOutputStream2.close();
                                } catch (Exception e8) {
                                    Log.e("ARMOR", e8.toString());
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
                        } catch (Exception e9) {
                            e = e9;
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
                } catch (Exception e10) {
                    Log.e("ARMOR", e10.toString());
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream2 = gZIPOutputStream;
            }
        }
        return null;
    }

    public static PglCryptUtils getInstance() {
        if (emc == null) {
            synchronized (PglCryptUtils.class) {
                try {
                    if (emc == null) {
                        try {
                            System.loadLibrary("pglarmor");
                        } catch (Throwable unused) {
                            ypw = false;
                        }
                        emc = new PglCryptUtils();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public Pair<Integer, String> cypher4Decrypt(String str) throws Throwable {
        byte[] bArrBc;
        if (!ypw) {
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
        } catch (Throwable th) {
            Log.e("ARMOR", th.toString());
            bArrBc = null;
        }
        if (bArrBc == null || bArrBc.length == 0) {
            return new Pair<>(Integer.valueOf(DECRYPT_FAILED), null);
        }
        String strEmc = emc(bArrBc);
        return TextUtils.isEmpty(strEmc) ? new Pair<>(Integer.valueOf(COMPRESS_FAILED), null) : new Pair<>(0, strEmc);
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
        if (!ypw) {
            return new Pair<>(Integer.valueOf(LOAD_SO_FAILED), null);
        }
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(Integer.valueOf(INPUT_INVALID), null);
        }
        byte[] bArrEmc = emc(str);
        if (bArrEmc == null || bArrEmc.length == 0) {
            return new Pair<>(Integer.valueOf(COMPRESS_FAILED), null);
        }
        Pair<Integer, byte[]> pairCypher4Encrypt = cypher4Encrypt(bArrEmc);
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
        if (!ypw) {
            return new Pair<>(Integer.valueOf(LOAD_SO_FAILED), null);
        }
        if (bArr != null && bArr.length != 0) {
            try {
                bArrBc = bc(TTAdConstant.IMAGE_MODE_1010, bArr);
            } catch (Throwable th) {
                Log.e("ARMOR", th.toString());
                bArrBc = null;
            }
            if (bArrBc != null && bArrBc.length != 0) {
                return new Pair<>(0, bArrBc);
            }
            return new Pair<>(Integer.valueOf(ENCRYPT_FAILED), null);
        }
        return new Pair<>(Integer.valueOf(INPUT_INVALID), null);
    }

    private static String emc(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        Throwable th;
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
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i = gZIPInputStream.read(bArr2);
                            if (i != -1) {
                                byteArrayOutputStream.write(bArr2, 0, i);
                            } else {
                                string = byteArrayOutputStream.toString("utf-8");
                                byteArrayInputStream.close();
                                try {
                                    gZIPInputStream.close();
                                    byteArrayOutputStream.close();
                                    return string;
                                } catch (Exception e6) {
                                    Log.e("ARMOR", e6.toString());
                                    return string;
                                }
                            }
                        }
                    } catch (Exception e7) {
                        str = string;
                        gZIPInputStream2 = gZIPInputStream;
                        exc = e7;
                        Log.e("ARMOR", exc.toString());
                        if (gZIPInputStream2 != null) {
                            try {
                                gZIPInputStream2.close();
                            } catch (Exception e8) {
                                Log.e("ARMOR", e8.toString());
                                return str;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return str;
                    } catch (Throwable th2) {
                        th = th2;
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (Exception e9) {
                                Log.e("ARMOR", e9.toString());
                                throw th;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    gZIPInputStream = gZIPInputStream2;
                    th = th3;
                }
            } catch (Exception e10) {
                exc = e10;
                str = null;
            }
        } catch (Exception e11) {
            byteArrayOutputStream = null;
            exc = e11;
            str = null;
        } catch (Throwable th4) {
            gZIPInputStream = null;
            th = th4;
            byteArrayOutputStream = null;
        }
    }
}
