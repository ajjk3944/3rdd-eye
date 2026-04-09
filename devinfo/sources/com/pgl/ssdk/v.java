package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f21547a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f21548b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f21549c = false;

    /* renamed from: d, reason: collision with root package name */
    private static String f21550d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f21551e = null;

    /* renamed from: f, reason: collision with root package name */
    private static String f21552f = null;
    private static int g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static long f21553h = 0;

    /* renamed from: i, reason: collision with root package name */
    private static long f21554i = 0;
    private static volatile long j = -1;

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0087 -> B:58:0x008a). Please report as a decompilation issue!!! */
    public static void a(File file, boolean z3) throws Throwable {
        e eVarA;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                    try {
                        if (TextUtils.isEmpty(f21547a) && (eVarA = a(file)) != null) {
                            f21547a = a(eVarA.a());
                            f21550d = eVarA.b();
                            if (z3) {
                                a();
                                try {
                                    randomAccessFile2.close();
                                    return;
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                            }
                        }
                        if (TextUtils.isEmpty(f21551e)) {
                            f21551e = a(randomAccessFile2);
                        }
                        if (f21553h == 0) {
                            f21553h = randomAccessFile2.length() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                        }
                        if (f21554i == 0) {
                            f21554i = b(file);
                        }
                        randomAccessFile2.close();
                    } catch (FileNotFoundException e10) {
                        e = e10;
                        randomAccessFile = randomAccessFile2;
                        e.printStackTrace();
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                    } catch (IOException e11) {
                        e = e11;
                        randomAccessFile = randomAccessFile2;
                        e.printStackTrace();
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile = randomAccessFile2;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e13) {
                    e = e13;
                } catch (IOException e14) {
                    e = e14;
                }
            } catch (IOException e15) {
                e15.printStackTrace();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String b() throws Throwable {
        long j8;
        boolean z3;
        String string;
        String string2;
        String string3;
        String string4;
        long j9;
        long j10;
        int i4;
        String str;
        if (TextUtils.isEmpty(f21547a) || TextUtils.isEmpty(f21551e) || g == -1) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            long j11 = -1;
            if (sharedPreferencesA != null) {
                j11 = sharedPreferencesA.getLong("mt", -1L);
                string2 = sharedPreferencesA.getString("sa", null);
                string3 = sharedPreferencesA.getString("sj", null);
                string4 = sharedPreferencesA.getString("md5", null);
                j9 = sharedPreferencesA.getLong("as", 0L);
                j10 = sharedPreferencesA.getLong("ds", 0L);
                z3 = true;
                i4 = sharedPreferencesA.getInt("cpc", -1);
                j8 = 0;
                string = sharedPreferencesA.getString("ap", null);
            } else {
                j8 = 0;
                z3 = true;
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
                j9 = 0;
                j10 = 0;
                i4 = 0;
            }
            String strC = c();
            if (strC == null) {
                return null;
            }
            File file = new File(strC);
            str = null;
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, z.a(), strC);
            Integer num = (Integer) objArr[0];
            String str2 = (String) objArr[z3 ? 1 : 0];
            long jLastModified = file.lastModified();
            if (jLastModified != j11 || string2 == null || i4 == -1) {
                j = jLastModified;
                if (str2 != null) {
                    f21552f = str2;
                }
                if (num != null) {
                    g = num.intValue();
                }
                a(file, false);
                a();
            } else {
                f21547a = string2;
                f21550d = string3;
                f21553h = j9;
                f21554i = j10;
                f21551e = string4;
                g = i4;
                f21552f = string;
            }
        } else {
            j8 = 0;
            str = null;
            z3 = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f21547a)) {
                jSONObject.put("sign", f21547a);
            }
            if (!TextUtils.isEmpty(f21550d)) {
                jSONObject.put("subject", f21550d);
            }
            if (!TextUtils.isEmpty(f21551e)) {
                jSONObject.put("md5", f21551e);
            }
            if (!TextUtils.isEmpty(f21552f)) {
                jSONObject.put("path", f21552f);
            }
            long j12 = f21553h;
            if (j12 != j8) {
                jSONObject.put("apkSize", j12);
            }
            long j13 = f21554i;
            if (j13 != j8) {
                jSONObject.put("dexSize", j13);
            }
            int i10 = g;
            if (i10 != -1) {
                jSONObject.put("code", i10);
            }
            e();
            jSONObject.put("signpm", f21548b);
            if (!TextUtils.isEmpty(f21548b) && !TextUtils.isEmpty(f21547a)) {
                if (!f21548b.equals(f21547a)) {
                    f21549c = z3;
                }
                jSONObject.put("rebud", f21549c);
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static String c() {
        if (z.a() == null) {
            return null;
        }
        String packageCodePath = z.a().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static void d() throws Throwable {
        if (TextUtils.isEmpty(f21547a)) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            String string = null;
            long j8 = -1;
            if (sharedPreferencesA != null) {
                j8 = sharedPreferencesA.getLong("mt", -1L);
                string = sharedPreferencesA.getString("sa", null);
            }
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            File file = new File(strC);
            long jLastModified = file.lastModified();
            if (jLastModified != j8 || string == null) {
                j = jLastModified;
                a(file, true);
                a();
            } else {
                f21547a = string;
            }
        }
        e();
        if (TextUtils.isEmpty(f21548b) || TextUtils.isEmpty(f21547a) || f21548b.equals(f21547a)) {
            return;
        }
        f21549c = true;
    }

    public static String e() {
        if (!TextUtils.isEmpty(f21548b)) {
            return f21548b;
        }
        try {
            String strA = a(z.a().getPackageManager().getPackageInfo(z.a().getPackageName(), 64).signatures[0].toByteArray());
            f21548b = strA;
            return strA;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static boolean f() throws Throwable {
        d();
        return f21549c;
    }

    public static void a() {
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA != null) {
            if (!TextUtils.isEmpty(f21547a)) {
                sharedPreferencesA.edit().putString("sa", f21547a).apply();
            }
            if (!TextUtils.isEmpty(f21551e)) {
                sharedPreferencesA.edit().putString("md5", f21551e).apply();
            }
            if (!TextUtils.isEmpty(f21550d)) {
                sharedPreferencesA.edit().putString("sj", f21550d).apply();
            }
            if (f21553h != 0) {
                sharedPreferencesA.edit().putLong("as", f21553h).apply();
            }
            if (f21554i != 0) {
                sharedPreferencesA.edit().putLong("ds", f21554i).apply();
            }
            if (j != -1) {
                sharedPreferencesA.edit().putLong("mt", j).apply();
            }
            if (g != -1) {
                sharedPreferencesA.edit().putInt("cpc", g).apply();
            }
            if (TextUtils.isEmpty(f21552f)) {
                return;
            }
            sharedPreferencesA.edit().putString("ap", f21552f).apply();
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                sb2.append(":");
            }
            return sb2.substring(0, sb2.length() - 1);
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.pgl.ssdk.e a(java.io.File r6) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L22 com.pgl.ssdk.g.a -> L3d
            java.lang.String r2 = "r"
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L22 com.pgl.ssdk.g.a -> L3d
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L20 com.pgl.ssdk.g.a -> L3e
            r4 = 0
            com.pgl.ssdk.q r2 = com.pgl.ssdk.r.a(r1, r4, r2)     // Catch: java.lang.Throwable -> L20 com.pgl.ssdk.g.a -> L3e
            com.pgl.ssdk.c$a r3 = com.pgl.ssdk.c.a(r2)     // Catch: java.lang.Throwable -> L20 com.pgl.ssdk.g.a -> L3e
            java.util.List r2 = com.pgl.ssdk.l.a(r2, r3)     // Catch: java.lang.Throwable -> L20 com.pgl.ssdk.g.a -> L3e
            r1.close()     // Catch: java.io.IOException -> L1e
            goto L49
        L1e:
            r1 = move-exception
            goto L44
        L20:
            r2 = move-exception
            goto L25
        L22:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L25:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.io.IOException -> L2e
            goto L48
        L2e:
            r1 = move-exception
            r2 = r0
            goto L44
        L31:
            r6 = move-exception
            if (r1 == 0) goto L3c
            r1.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r0 = move-exception
            r0.printStackTrace()
        L3c:
            throw r6
        L3d:
            r1 = r0
        L3e:
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.io.IOException -> L2e
            goto L48
        L44:
            r1.printStackTrace()
            goto L49
        L48:
            r2 = r0
        L49:
            if (r2 == 0) goto L51
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L55
        L51:
            java.util.List r2 = com.pgl.ssdk.k.a(r6)
        L55:
            if (r2 == 0) goto L65
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L65
            r6 = 0
            java.lang.Object r6 = r2.get(r6)
            com.pgl.ssdk.e r6 = (com.pgl.ssdk.e) r6
            return r6
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.v.a(java.io.File):com.pgl.ssdk.e");
    }

    public static long b(File file) throws Throwable {
        String str;
        ZipFile zipFile = null;
        try {
            try {
                try {
                    ZipFile zipFile2 = new ZipFile(file);
                    int i4 = 0;
                    int size = 0;
                    while (true) {
                        if (i4 == 0) {
                            str = "classes.dex";
                        } else {
                            str = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i4));
                        }
                        ZipEntry entry = zipFile2.getEntry(str);
                        if (entry != null) {
                            try {
                                size = (int) (size + entry.getSize());
                                i4++;
                            } catch (ZipException e2) {
                                e = e2;
                                zipFile = zipFile2;
                                e.printStackTrace();
                                if (zipFile == null) {
                                    return 0L;
                                }
                                zipFile.close();
                                return 0L;
                            } catch (IOException e10) {
                                e = e10;
                                zipFile = zipFile2;
                                e.printStackTrace();
                                if (zipFile == null) {
                                    return 0L;
                                }
                                zipFile.close();
                                return 0L;
                            } catch (Throwable th2) {
                                th = th2;
                                zipFile = zipFile2;
                                if (zipFile != null) {
                                    try {
                                        zipFile.close();
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } else {
                            long j8 = size / 1000;
                            try {
                                zipFile2.close();
                                return j8;
                            } catch (IOException e12) {
                                e12.printStackTrace();
                                return j8;
                            }
                        }
                    }
                } catch (ZipException e13) {
                    e = e13;
                } catch (IOException e14) {
                    e = e14;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e15) {
            e15.printStackTrace();
            return 0L;
        }
    }

    public static String a(RandomAccessFile randomAccessFile) throws NoSuchAlgorithmException, IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i4 = randomAccessFile.read(bArr);
                if (i4 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i4);
            }
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = "0".concat(string);
            }
            return string;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return "";
        } catch (IOException e10) {
            e10.printStackTrace();
            return "";
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return "";
        }
    }
}
