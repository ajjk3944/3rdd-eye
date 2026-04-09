package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.singular.sdk.internal.SingularParamsBase;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzex {
    private static HashMap zzd;
    public static final String zza = Build.DEVICE + ", " + Build.MODEL + ", " + Build.MANUFACTURER + ", " + Build.VERSION.SDK_INT;
    public static final byte[] zzb = new byte[0];
    private static final Pattern zzc = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
    private static final String[] zze = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", FacebookMediationAdapter.KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
    private static final String[] zzf = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
    private static final int[] zzg = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    private static final int[] zzh = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
    private static final int[] zzi = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, Sdk$SDKError.b.CONFIG_REFRESH_FAILED_VALUE, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    public static zzz zzA(int i, int i10, int i11) {
        zzx zzxVar = new zzx();
        zzxVar.zzah("audio/raw");
        zzxVar.zzD(i10);
        zzxVar.zzai(i11);
        zzxVar.zzab(i);
        return zzxVar.zzan();
    }

    public static String zzB(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String zzC(byte[] bArr, int i, int i10) {
        return new String(bArr, i, i10, StandardCharsets.UTF_8);
    }

    public static String zzD(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String zzE(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strZza = zzfuk.zza(str);
        int i = 0;
        String str2 = strZza.split("-", 2)[0];
        if (zzd == null) {
            zzd = zzU();
        }
        String str3 = (String) zzd.get(str2);
        if (str3 != null) {
            strZza = str3.concat(String.valueOf(strZza.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || SingularParamsBase.Constants.PACKAGE_NAME_KEY.equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = zzf;
                int length = strArr.length;
                if (i >= 18) {
                    break;
                }
                if (strZza.startsWith(strArr[i])) {
                    return String.valueOf(strArr[i + 1]).concat(String.valueOf(strZza.substring(strArr[i].length())));
                }
                i += 2;
            }
        }
        return strZza;
    }

    public static ExecutorService zzF(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzev
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                String str2 = zzex.zza;
                return new Thread(runnable, str);
            }
        });
    }

    public static void zzG(long[] jArr, long j4, long j10) {
        long j11;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long jZzb = zzgbd.zzb(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = zzgbd.zzb(jArr[i], jZzb, roundingMode);
                i++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long jZzb2 = zzgbd.zzb(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = zzgbd.zzd(jArr[i], jZzb2);
                i++;
            }
            return;
        }
        int i10 = 0;
        while (i10 < jArr.length) {
            long j12 = jArr[i10];
            if (j12 != 0) {
                if (j10 >= j12 && j10 % j12 == 0) {
                    jArr[i10] = zzgbd.zzb(1000000L, zzgbd.zzb(j10, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j10 >= j12 || j12 % j10 != 0) {
                    j11 = j10;
                    jArr[i10] = zzS(j12, 1000000L, j11, roundingMode);
                } else {
                    jArr[i10] = zzgbd.zzd(1000000L, zzgbd.zzb(j12, j10, RoundingMode.UNNECESSARY));
                }
                j11 = j10;
            } else {
                j11 = j10;
            }
            i10++;
            j10 = j11;
        }
    }

    public static boolean zzH(SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r4.zzK(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzI(com.google.android.gms.internal.ads.zzen r3, com.google.android.gms.internal.ads.zzen r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.zza()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r4.zzb()
            int r2 = r3.zza()
            if (r0 >= r2) goto L1a
            int r0 = r3.zza()
            int r0 = r0 + r0
            r4.zzF(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.zzN()
            int r2 = r3.zzc()
            int r3 = r3.zza()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.zzN()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r4.zzb()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L4c
            r4.zzK(r3)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            r1 = 1
            goto L6c
        L4a:
            r3 = move-exception
            goto L68
        L4c:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 != 0) goto L6c
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L59
            goto L6c
        L59:
            int r0 = r4.zzb()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r3 != r0) goto L31
            int r0 = r4.zzb()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r0 = r0 + r0
            r4.zzF(r0)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            goto L31
        L68:
            r5.reset()
            throw r3
        L6c:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzex.zzI(com.google.android.gms.internal.ads.zzen, com.google.android.gms.internal.ads.zzen, java.util.zip.Inflater):boolean");
    }

    public static boolean zzJ(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean zzK(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static boolean zzL(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i == 30) {
            String str = Build.MODEL;
            if (zzfuk.zzc(str, "moto g(20)") || zzfuk.zzc(str, "rmx3231")) {
                return true;
            }
        }
        return i == 34 && zzfuk.zzc(Build.MODEL, "sm-x200");
    }

    public static boolean zzM(int i) {
        return i == 10 || i == 13;
    }

    public static boolean zzN(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzO(zzen zzenVar, zzen zzenVar2, Inflater inflater) {
        return zzenVar.zza() > 0 && zzenVar.zzf() == 120 && zzI(zzenVar, zzenVar2, inflater);
    }

    public static boolean zzP(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Object[] zzQ(Object[] objArr, int i) {
        zzdd.zzd(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    private static int zzR(int i, int i10) {
        return (char) (zzh[i ^ (i10 >> 12)] ^ ((char) (i10 << 4)));
    }

    private static long zzS(long j4, long j10, long j11, RoundingMode roundingMode) {
        long jZzd = zzgbd.zzd(j4, j10);
        if (jZzd != Long.MAX_VALUE && jZzd != Long.MIN_VALUE) {
            return zzgbd.zzb(jZzd, j11, roundingMode);
        }
        long jZzc = zzgbd.zzc(Math.abs(j10), Math.abs(j11));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jZzb = zzgbd.zzb(j10, jZzc, roundingMode2);
        long jZzb2 = zzgbd.zzb(j11, jZzc, roundingMode2);
        long jZzc2 = zzgbd.zzc(Math.abs(j4), Math.abs(jZzb2));
        long jZzb3 = zzgbd.zzb(j4, jZzc2, roundingMode2);
        long jZzb4 = zzgbd.zzb(jZzb2, jZzc2, roundingMode2);
        long jZzd2 = zzgbd.zzd(jZzb3, jZzb);
        if (jZzd2 != Long.MAX_VALUE && jZzd2 != Long.MIN_VALUE) {
            return zzgbd.zzb(jZzd2, jZzb4, roundingMode);
        }
        double d10 = (jZzb / jZzb4) * jZzb3;
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgay.zzb(d10, roundingMode);
    }

    private static String zzT(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e4) {
            zzea.zzd("Util", "Failed to read system property ".concat(str), e4);
            return null;
        }
    }

    private static HashMap zzU() throws MissingResourceException {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zze.length;
        HashMap map = new HashMap(length + 88);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zze;
            int length3 = strArr.length;
            if (i >= 88) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static int zza(long[] jArr, long j4, boolean z10, boolean z11) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j4);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i = iBinarySearch + 1;
            if (i >= jArr.length || jArr[i] != j4) {
                break;
            }
            iBinarySearch = i;
        }
        return !z10 ? i : iBinarySearch;
    }

    public static int zzb(zzeb zzebVar, long j4, boolean z10, boolean z11) {
        int iZza = zzebVar.zza() - 1;
        int i = 0;
        while (i <= iZza) {
            int i10 = (i + iZza) >>> 1;
            if (zzebVar.zzb(i10) < j4) {
                i = i10 + 1;
            } else {
                iZza = i10 - 1;
            }
        }
        int i11 = iZza + 1;
        if (i11 < zzebVar.zza() && zzebVar.zzb(i11) == j4) {
            return i11;
        }
        if (iZza == -1) {
            return 0;
        }
        return iZza;
    }

    public static int zzc(int[] iArr, int i, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || iArr[i10] != i) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static int zzd(long[] jArr, long j4, boolean z10, boolean z11) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j4);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i10 = iBinarySearch - 1;
                if (i10 < 0 || jArr[i10] != j4) {
                    break;
                }
                iBinarySearch = i10;
            }
            i = iBinarySearch;
        }
        return z11 ? Math.max(0, i) : i;
    }

    public static int zze(byte[] bArr, int i, int i10, int i11) {
        int iZzR = 65535;
        for (int i12 = 0; i12 < i10; i12++) {
            byte b10 = bArr[i12];
            iZzR = zzR(b10 & 15, zzR((b10 & 255) >> 4, iZzR));
        }
        return iZzR;
    }

    public static int zzf(byte[] bArr, int i, int i10, int i11) {
        while (i < i10) {
            i11 = zzg[(i11 >>> 24) ^ (bArr[i] & KotlinVersion.MAX_COMPONENT_VALUE)] ^ (i11 << 8);
            i++;
        }
        return i11;
    }

    public static int zzg(byte[] bArr, int i, int i10, int i11) {
        int i12 = 0;
        while (i < i10) {
            i12 = zzi[i12 ^ (bArr[i] & 255)];
            i++;
        }
        return i12;
    }

    public static int zzh(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int zzi(int i) {
        int i10;
        int i11 = 6396;
        if (i == 10) {
            i10 = 737532;
        } else {
            if (i == 12) {
                return 743676;
            }
            if (i != 24) {
                switch (i) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        return 0;
                }
            }
            i10 = 67108860;
            i11 = 0;
        }
        return Build.VERSION.SDK_INT >= 32 ? i10 : i11;
    }

    public static int zzj(ByteBuffer byteBuffer, int i) {
        int i10 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i10 : Integer.reverseBytes(i10);
    }

    public static int zzk(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int zzl(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static int zzm(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i = Integer.parseInt(str2);
            return z10 ? -i : i;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int zzn(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzo(android.net.Uri r7) {
        /*
            java.lang.String r0 = r7.getScheme()
            r1 = 3
            if (r0 == 0) goto L19
            java.lang.String r2 = "rtsp"
            boolean r2 = com.google.android.gms.internal.ads.zzfuk.zzc(r2, r0)
            if (r2 != 0) goto L18
            java.lang.String r2 = "rtspt"
            boolean r0 = com.google.android.gms.internal.ads.zzfuk.zzc(r2, r0)
            if (r0 != 0) goto L18
            goto L19
        L18:
            return r1
        L19:
            java.lang.String r0 = r7.getLastPathSegment()
            r2 = 4
            if (r0 != 0) goto L21
            return r2
        L21:
            r3 = 46
            int r3 = r0.lastIndexOf(r3)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 < 0) goto L79
            int r3 = r3 + r6
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfuk.zza(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 104579: goto L5b;
                case 108321: goto L51;
                case 3242057: goto L47;
                case 3299913: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L65
        L3d:
            java.lang.String r3 = "m3u8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L65
            r0 = r6
            goto L66
        L47:
            java.lang.String r3 = "isml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L65
            r0 = r1
            goto L66
        L51:
            java.lang.String r3 = "mpd"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L65
            r0 = r4
            goto L66
        L5b:
            java.lang.String r3 = "ism"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L65
            r0 = r5
            goto L66
        L65:
            r0 = -1
        L66:
            if (r0 == 0) goto L74
            if (r0 == r6) goto L72
            if (r0 == r5) goto L70
            if (r0 == r1) goto L70
            r0 = r2
            goto L75
        L70:
            r0 = r6
            goto L75
        L72:
            r0 = r5
            goto L75
        L74:
            r0 = r4
        L75:
            if (r0 != r2) goto L78
            goto L79
        L78:
            return r0
        L79:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzex.zzc
            java.lang.String r7 = r7.getPath()
            r7.getClass()
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.matches()
            if (r0 == 0) goto La5
            java.lang.String r7 = r7.group(r5)
            if (r7 == 0) goto La4
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L9b
            return r4
        L9b:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto La4
            return r5
        La4:
            return r6
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzex.zzo(android.net.Uri):int");
    }

    public static long zzp(long j4, int i) {
        return zzu(j4, i, 1000000L, RoundingMode.UP);
    }

    public static long zzq(long j4, float f10) {
        return f10 == 1.0f ? j4 : Math.round(j4 * f10);
    }

    public static long zzr(long j4, float f10) {
        return f10 == 1.0f ? j4 : Math.round(j4 / f10);
    }

    public static long zzs(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 * 1000;
    }

    public static long zzt(long j4, int i) {
        return zzu(j4, 1000000L, i, RoundingMode.DOWN);
    }

    public static long zzu(long j4, long j10, long j11, RoundingMode roundingMode) {
        if (j4 == 0 || j10 == 0) {
            return 0L;
        }
        return (j11 < j10 || j11 % j10 != 0) ? (j11 >= j10 || j10 % j11 != 0) ? (j11 < j4 || j11 % j4 != 0) ? (j11 >= j4 || j4 % j11 != 0) ? zzS(j4, j10, j11, roundingMode) : zzgbd.zzd(j10, zzgbd.zzb(j4, j11, RoundingMode.UNNECESSARY)) : zzgbd.zzb(j10, zzgbd.zzb(j11, j4, RoundingMode.UNNECESSARY), roundingMode) : zzgbd.zzd(j4, zzgbd.zzb(j10, j11, RoundingMode.UNNECESSARY)) : zzgbd.zzb(j4, zzgbd.zzb(j11, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long zzv(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 / 1000;
    }

    public static Point zzw(Context context) throws NumberFormatException {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzN(context)) {
            String strZzT = Build.VERSION.SDK_INT < 28 ? zzT("sys.display-size") : zzT("vendor.display-size");
            if (!TextUtils.isEmpty(strZzT)) {
                try {
                    String[] strArrSplit = strZzT.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i = Integer.parseInt(strArrSplit[0]);
                        int i10 = Integer.parseInt(strArrSplit[1]);
                        if (i > 0 && i10 > 0) {
                            return new Point(i, i10);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzea.zzc("Util", "Invalid display size: ".concat(String.valueOf(strZzT)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static AudioFormat zzx(int i, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i10).setEncoding(i11).build();
    }

    public static Handler zzy(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        zzdd.zzb(looperMyLooper);
        return new Handler(looperMyLooper, null);
    }

    public static Looper zzz() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }
}
