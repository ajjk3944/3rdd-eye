package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
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

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f19676a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f19677b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f19678c = false;

    /* renamed from: d, reason: collision with root package name */
    private static String f19679d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f19680e = null;

    /* renamed from: f, reason: collision with root package name */
    private static String f19681f = null;

    /* renamed from: g, reason: collision with root package name */
    private static int f19682g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static long f19683h = 0;
    private static long i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static volatile long f19684j = -1;

    public static void a(File file, boolean z6) throws Throwable {
        e eVarA;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    if (TextUtils.isEmpty(f19676a) && (eVarA = a(file)) != null) {
                        f19676a = a(eVarA.a());
                        f19679d = eVarA.b();
                        if (z6) {
                            a();
                            try {
                                randomAccessFile2.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                    }
                    if (TextUtils.isEmpty(f19680e)) {
                        f19680e = a(randomAccessFile2);
                    }
                    if (f19683h == 0) {
                        f19683h = randomAccessFile2.length() / 1024;
                    }
                    if (i == 0) {
                        i = b(file);
                    }
                    randomAccessFile2.close();
                } catch (FileNotFoundException unused2) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (IOException unused3) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused5) {
            } catch (IOException unused6) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused7) {
        }
    }

    public static String b() throws Throwable {
        long j6;
        boolean z6;
        String string;
        String string2;
        String string3;
        String string4;
        long j7;
        long j8;
        int i3;
        String str;
        if (TextUtils.isEmpty(f19676a) || TextUtils.isEmpty(f19680e) || f19682g == -1) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            long j9 = -1;
            if (sharedPreferencesA != null) {
                j9 = sharedPreferencesA.getLong("mt", -1L);
                string2 = sharedPreferencesA.getString("sa", null);
                string3 = sharedPreferencesA.getString("sj", null);
                string4 = sharedPreferencesA.getString("md5", null);
                j7 = sharedPreferencesA.getLong("as", 0L);
                j8 = sharedPreferencesA.getLong("ds", 0L);
                z6 = true;
                i3 = sharedPreferencesA.getInt("cpc", -1);
                j6 = 0;
                string = sharedPreferencesA.getString("ap", null);
            } else {
                j6 = 0;
                z6 = true;
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
                j7 = 0;
                j8 = 0;
                i3 = 0;
            }
            String strC = c();
            if (strC == null) {
                return null;
            }
            File file = new File(strC);
            str = null;
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, z.a(), strC);
            Integer num = (Integer) objArr[0];
            String str2 = (String) objArr[z6 ? 1 : 0];
            long jLastModified = file.lastModified();
            if (jLastModified != j9 || string2 == null || i3 == -1) {
                f19684j = jLastModified;
                if (str2 != null) {
                    f19681f = str2;
                }
                if (num != null) {
                    f19682g = num.intValue();
                }
                a(file, false);
                a();
            } else {
                f19676a = string2;
                f19679d = string3;
                f19683h = j7;
                i = j8;
                f19680e = string4;
                f19682g = i3;
                f19681f = string;
            }
        } else {
            j6 = 0;
            str = null;
            z6 = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f19676a)) {
                jSONObject.put("sign", f19676a);
            }
            if (!TextUtils.isEmpty(f19679d)) {
                jSONObject.put("subject", f19679d);
            }
            if (!TextUtils.isEmpty(f19680e)) {
                jSONObject.put("md5", f19680e);
            }
            if (!TextUtils.isEmpty(f19681f)) {
                jSONObject.put("path", f19681f);
            }
            long j10 = f19683h;
            if (j10 != j6) {
                jSONObject.put("apkSize", j10);
            }
            long j11 = i;
            if (j11 != j6) {
                jSONObject.put("dexSize", j11);
            }
            int i6 = f19682g;
            if (i6 != -1) {
                jSONObject.put("code", i6);
            }
            e();
            jSONObject.put("signpm", f19677b);
            if (!TextUtils.isEmpty(f19677b) && !TextUtils.isEmpty(f19676a)) {
                if (!f19677b.equals(f19676a)) {
                    f19678c = z6;
                }
                jSONObject.put("rebud", f19678c);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
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
        if (TextUtils.isEmpty(f19676a)) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            String string = null;
            long j6 = -1;
            if (sharedPreferencesA != null) {
                j6 = sharedPreferencesA.getLong("mt", -1L);
                string = sharedPreferencesA.getString("sa", null);
            }
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            File file = new File(strC);
            long jLastModified = file.lastModified();
            if (jLastModified != j6 || string == null) {
                f19684j = jLastModified;
                a(file, true);
                a();
            } else {
                f19676a = string;
            }
        }
        e();
        if (TextUtils.isEmpty(f19677b) || TextUtils.isEmpty(f19676a) || f19677b.equals(f19676a)) {
            return;
        }
        f19678c = true;
    }

    public static String e() {
        if (!TextUtils.isEmpty(f19677b)) {
            return f19677b;
        }
        try {
            String strA = a(z.a().getPackageManager().getPackageInfo(z.a().getPackageName(), 64).signatures[0].toByteArray());
            f19677b = strA;
            return strA;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean f() throws Throwable {
        d();
        return f19678c;
    }

    public static void a() {
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA != null) {
            if (!TextUtils.isEmpty(f19676a)) {
                sharedPreferencesA.edit().putString("sa", f19676a).apply();
            }
            if (!TextUtils.isEmpty(f19680e)) {
                sharedPreferencesA.edit().putString("md5", f19680e).apply();
            }
            if (!TextUtils.isEmpty(f19679d)) {
                sharedPreferencesA.edit().putString("sj", f19679d).apply();
            }
            if (f19683h != 0) {
                sharedPreferencesA.edit().putLong("as", f19683h).apply();
            }
            if (i != 0) {
                sharedPreferencesA.edit().putLong("ds", i).apply();
            }
            if (f19684j != -1) {
                sharedPreferencesA.edit().putLong("mt", f19684j).apply();
            }
            if (f19682g != -1) {
                sharedPreferencesA.edit().putInt("cpc", f19682g).apply();
            }
            if (TextUtils.isEmpty(f19681f)) {
                return;
            }
            sharedPreferencesA.edit().putString("ap", f19681f).apply();
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b5 : bArrDigest) {
                sb.append(Integer.toHexString((b5 & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.pgl.ssdk.e a(java.io.File r6) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.g.a -> L25
            java.lang.String r2 = "r"
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.g.a -> L25
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            r4 = 0
            com.pgl.ssdk.q r2 = com.pgl.ssdk.r.a(r1, r4, r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            com.pgl.ssdk.c$a r3 = com.pgl.ssdk.c.a(r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            java.util.List r2 = com.pgl.ssdk.l.a(r2, r3)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            r1.close()     // Catch: java.io.IOException -> L2c
            goto L2c
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
            goto L2b
        L25:
            r1 = r0
        L26:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
        L2b:
            r2 = r0
        L2c:
            if (r2 == 0) goto L34
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L38
        L34:
            java.util.List r2 = com.pgl.ssdk.k.a(r6)
        L38:
            if (r2 == 0) goto L48
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L48
            r6 = 0
            java.lang.Object r6 = r2.get(r6)
            com.pgl.ssdk.e r6 = (com.pgl.ssdk.e) r6
            return r6
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.v.a(java.io.File):com.pgl.ssdk.e");
    }

    public static long b(File file) throws Throwable {
        String str;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i3 = 0;
                int size = 0;
                while (true) {
                    if (i3 == 0) {
                        str = "classes.dex";
                    } else {
                        str = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i3));
                    }
                    ZipEntry entry = zipFile2.getEntry(str);
                    if (entry == null) {
                        break;
                    }
                    try {
                        size = (int) (size + entry.getSize());
                        i3++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j6 = size / TTAdConstant.STYLE_SIZE_RADIO_1_1;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j6;
            } catch (ZipException unused5) {
            } catch (IOException unused6) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused7) {
            return 0L;
        }
    }

    public static String a(RandomAccessFile randomAccessFile) throws NoSuchAlgorithmException, IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i3 = randomAccessFile.read(bArr);
                if (i3 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i3);
            }
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = "0".concat(string);
            }
            return string;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
