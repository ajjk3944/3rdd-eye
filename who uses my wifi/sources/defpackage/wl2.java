package defpackage;

import android.animation.TimeInterpolator;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Path;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class wl2 {
    public static final so1 A;
    public static final so1 B;
    public static final so1 C;
    public static final so1 D;
    public static ExecutorService a;
    public static final so1 j;
    public static final so1 k;
    public static final so1 l;
    public static final so1 m;
    public static final so1 n;
    public static final so1 o;
    public static final so1 p;
    public static final so1 q;
    public static final so1 r;
    public static final so1 s;
    public static final so1 t;
    public static final so1 u;
    public static final so1 v;
    public static final so1 w;
    public static final so1 x;
    public static final so1 y;
    public static final so1 z;
    public static final gs3 b = new gs3("COMPLETING_ALREADY", 3);
    public static final gs3 c = new gs3("COMPLETING_WAITING_CHILDREN", 3);
    public static final gs3 d = new gs3("COMPLETING_RETRY", 3);
    public static final gs3 e = new gs3("TOO_LATE_TO_CANCEL", 3);
    public static final gs3 f = new gs3("SEALED", 3);
    public static final js g = new js(false);
    public static final js h = new js(true);
    public static final gs3 i = new gs3("NO_THREAD_ELEMENTS", 3);
    public static final zq2 E = new zq2(3);
    public static final zq2 F = new zq2(21);
    public static final byte[] G = {0, 0, 0, 1};
    public static final float[] H = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object I = new Object();
    public static int[] J = new int[10];

    static {
        String str = "";
        int i2 = 4;
        j = new so1("gads:afs:csa:experiment_id", str, i2);
        k = new so1("gads:app_index:experiment_id", str, i2);
        l = new so1("gads:block_autoclicks_experiment_id", str, i2);
        m = new so1("gads:sdk_core_experiment_id", str, i2);
        n = new so1("gads:spam_app_context:experiment_id", str, i2);
        o = new so1("gads:temporary_experiment_id:1", str, i2);
        p = new so1("gads:temporary_experiment_id:10", str, i2);
        q = new so1("gads:temporary_experiment_id:11", str, i2);
        r = new so1("gads:temporary_experiment_id:12", str, i2);
        s = new so1("gads:temporary_experiment_id:13", str, i2);
        t = new so1("gads:temporary_experiment_id:14", str, i2);
        u = new so1("gads:temporary_experiment_id:15", str, i2);
        v = new so1("gads:temporary_experiment_id:2", str, i2);
        w = new so1("gads:temporary_experiment_id:3", str, i2);
        x = new so1("gads:temporary_experiment_id:4", str, i2);
        y = new so1("gads:temporary_experiment_id:5", str, i2);
        z = new so1("gads:temporary_experiment_id:6", str, i2);
        A = new so1("gads:temporary_experiment_id:7", str, i2);
        B = new so1("gads:temporary_experiment_id:8", str, i2);
        C = new so1("gads:temporary_experiment_id:9", str, i2);
        D = new so1("gads:corewebview:experiment_id", str, i2);
    }

    public static /* synthetic */ String A(int i2) {
        switch (i2) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static synchronized Executor B() {
        try {
            if (a == null) {
                String str = v23.a;
                a = Executors.newSingleThreadExecutor(new uj2(1, "ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static ao1 C(ho1 ho1Var) throws NumberFormatException {
        long j2;
        boolean z2;
        long j3;
        long j4;
        long j5;
        long jI;
        long j6;
        long j7;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = ho1Var.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jI2 = str != null ? I(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i2 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z2 = false;
            j3 = 0;
            j4 = 0;
            while (i2 < strArrSplit.length) {
                String strTrim = strArrSplit[i2].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j4 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z2 = true;
                }
                i2++;
            }
            j2 = 0;
            i2 = 1;
        } else {
            j2 = 0;
            z2 = false;
            j3 = 0;
            j4 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jI3 = str3 != null ? I(str3) : j2;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j5 = jCurrentTimeMillis;
            jI = I(str4);
        } else {
            j5 = jCurrentTimeMillis;
            jI = j2;
        }
        String str5 = (String) map.get("ETag");
        if (i2 != 0) {
            long j8 = (j4 * 1000) + j5;
            j7 = z2 ? j8 : (j3 * 1000) + j8;
            j6 = j8;
        } else {
            j6 = (jI2 <= j2 || jI3 < jI2) ? j2 : (jI3 - jI2) + j5;
            j7 = j6;
        }
        ao1 ao1Var = new ao1();
        ao1Var.a = ho1Var.b;
        ao1Var.b = str5;
        ao1Var.f = j6;
        ao1Var.e = j7;
        ao1Var.c = jI2;
        ao1Var.d = jI;
        ao1Var.g = map;
        ao1Var.h = ho1Var.d;
        return ao1Var;
    }

    public static sf3 D(gi4 gi4Var) {
        sf3 sf3Var = new sf3();
        sf3Var.m = gi4Var;
        of3 of3Var = new of3(26, sf3Var);
        gi4Var.getClass();
        gi4Var.b.c(new mn2(dq3.f, of3Var));
        gi4Var.h();
        return sf3Var;
    }

    public static void E(int i2, wn1 wn1Var, gg4 gg4Var, wn1 wn1Var2, wn1... wn1VarArr) {
        if (wn1Var2 == null) {
            wn1Var2 = new wn1(new en1[0]);
        }
        if (wn1Var != null) {
            vm3 vm3Var = xm3.g;
            ob1.z("initialCapacity", 4);
            Object[] objArrCopyOf = new Object[4];
            int i3 = 0;
            for (en1 en1Var : wn1Var.a) {
                if (z33.class.isAssignableFrom(en1Var.getClass())) {
                    en1 en1Var2 = (en1) z33.class.cast(en1Var);
                    en1Var2.getClass();
                    int length = objArrCopyOf.length;
                    int i4 = i3 + 1;
                    int iD = rm3.d(length, i4);
                    if (iD > length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                    }
                    objArrCopyOf[i3] = en1Var2;
                    i3 = i4;
                }
            }
            sn3 sn3VarO = xm3.o(objArrCopyOf, i3);
            int i5 = sn3VarO.i;
            for (int i6 = 0; i6 < i5; i6++) {
                z33 z33Var = (z33) sn3VarO.get(i6);
                if (!z33Var.a.equals("com.android.capture.fps") || i2 == 2) {
                    wn1Var2 = wn1Var2.c(z33Var);
                }
            }
        }
        for (wn1 wn1Var3 : wn1VarArr) {
            wn1Var2 = wn1Var2.b(wn1Var3);
        }
        if (wn1Var2.a.length > 0) {
            gg4Var.j = wn1Var2;
        }
    }

    public static void F(String str) {
        if (((Boolean) e12.a.w()).booleanValue()) {
            gi2.U(str);
        }
    }

    public static void G(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            K(i3, objArr[i3]);
        }
    }

    public static int H(ph4 ph4Var) {
        String str = ph4Var.m;
        if (Objects.equals(str, "video/avc")) {
            return 1;
        }
        return (Objects.equals(str, "video/hevc") || pp1.e(ph4Var.j, "video/hevc")) ? 2 : 0;
    }

    public static long I(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e2) {
            if ("0".equals(str) || "-1".equals(str)) {
                ro1.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", ro1.c("Unable to parse dateStr: %s, falling back to 0", str), e2);
            return 0L;
        }
    }

    public static mr3 J(byte[] bArr) throws GeneralSecurityException {
        try {
            h54 h54Var = h54.a;
            int i2 = u44.a;
            qz3 qz3VarD = qz3.D(bArr, h54.b);
            rv3 rv3Var = rv3.b;
            v34 v34VarB = ow3.b(qz3VarD.A());
            gw3 gw3Var = new gw3(qz3VarD, v34VarB, 0);
            nw3 nw3Var = (nw3) rv3Var.a.get();
            nw3Var.getClass();
            return !nw3Var.d.containsKey(new lw3(gw3.class, v34VarB)) ? new gv3(gw3Var) : rv3Var.g(gw3Var);
        } catch (IOException e2) {
            throw new GeneralSecurityException("Failed to parse proto", e2);
        }
    }

    public static void K(int i2, Object obj) {
        if (obj == null) {
            throw new NullPointerException(ex0.j(new StringBuilder(String.valueOf(i2).length() + 9), "at index ", i2));
        }
    }

    public static int L(SQLiteDatabase sQLiteDatabase, int i2) {
        int i3 = 0;
        if (i2 == 2) {
            return 0;
        }
        Cursor cursorU = U(sQLiteDatabase, i2);
        if (cursorU.getCount() > 0) {
            cursorU.moveToNext();
            i3 = cursorU.getInt(cursorU.getColumnIndexOrThrow("value"));
        }
        cursorU.close();
        return i3;
    }

    public static boolean M(byte[] bArr, int i2, ph4 ph4Var) {
        int i3;
        String str = ph4Var.m;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            zq zqVarB0 = b0(new lg1(bArr, 4, i2 + 4));
            int i4 = zqVarB0.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && zqVarB0.c == ph4Var.D - 1) {
                return false;
            }
        }
        return true;
    }

    public static bi1 N(int i2, String str, kz2 kz2Var) {
        int iB = kz2Var.b();
        if (kz2Var.b() == 1684108385) {
            kz2Var.G(8);
            return new bi1(str, null, xm3.i(kz2Var.l(iB - 16)));
        }
        a30.x("Failed to parse text attribute: ".concat(td.g(i2)));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.x93 O(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl2.O(byte[], int, int):x93");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.p21 P(byte[] r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 2173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl2.P(byte[], int, int):p21");
    }

    public static wh1 Q(int i2, String str, kz2 kz2Var, boolean z2, boolean z3) {
        int iS = S(kz2Var);
        if (z3) {
            iS = Math.min(1, iS);
        }
        if (iS >= 0) {
            return z2 ? new bi1(str, null, xm3.i(Integer.toString(iS))) : new th1("und", str, Integer.toString(iS));
        }
        a30.x("Failed to parse uint8 attribute: ".concat(td.g(i2)));
        return null;
    }

    public static void R(SQLiteDatabase sQLiteDatabase, long j2, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j2));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j2)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static int S(kz2 kz2Var) {
        int iB = kz2Var.b();
        if (kz2Var.b() == 1684108385) {
            kz2Var.G(8);
            int i2 = iB - 16;
            if (i2 == 1) {
                return kz2Var.K();
            }
            if (i2 == 2) {
                return kz2Var.L();
            }
            if (i2 == 3) {
                return kz2Var.O();
            }
            if (i2 == 4 && (kz2Var.I() & 128) == 0) {
                return kz2Var.h();
            }
        }
        a30.x("Failed to parse data atom to int");
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.f83 T(byte[] r32, int r33, int r34, defpackage.p21 r35) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl2.T(byte[], int, int, p21):f83");
    }

    public static Cursor U(SQLiteDatabase sQLiteDatabase, int i2) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i2 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i2 == 1) {
            strArr2[0] = "total_requests";
        } else if (i2 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static bi1 V(int i2, String str, kz2 kz2Var) {
        int iB = kz2Var.b();
        if (kz2Var.b() == 1684108385 && iB >= 22) {
            kz2Var.G(10);
            int iL = kz2Var.L();
            if (iL > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iL).length());
                sb.append(iL);
                String string = sb.toString();
                int iL2 = kz2Var.L();
                if (iL2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(iL2).length());
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(iL2);
                    string = sb2.toString();
                }
                return new bi1(str, null, xm3.i(string));
            }
        }
        a30.x("Failed to parse index/count attribute: ".concat(td.g(i2)));
        return null;
    }

    public static int W(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        zt0.b0(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            Z(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            Z(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            Z(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    Z(zArr);
                    return i7;
                }
                i6 = i7;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static void X(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static void Y(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void Z(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static final mj a(hk hkVar) {
        if (hkVar.h(fr.j) == null) {
            hkVar = hkVar.g(new z30());
        }
        return new mj(hkVar);
    }

    public static String a0(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                vm3 vm3Var = xm3.g;
                ob1.z("initialCapacity", 4);
                Object[] objArrCopyOf = new Object[4];
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i3 >= length2) {
                        break;
                    }
                    int iW = W(bArr, i3, length2, zArr);
                    if (iW != length2) {
                        Integer numValueOf = Integer.valueOf(iW);
                        int length3 = objArrCopyOf.length;
                        int i5 = i4 + 1;
                        int iD = rm3.d(length3, i5);
                        if (iD > length3) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                        }
                        objArrCopyOf[i4] = numValueOf;
                        i4 = i5;
                    }
                    i3 = iW + 3;
                }
                sn3 sn3VarO = xm3.o(objArrCopyOf, i4);
                for (int i6 = 0; i6 < sn3VarO.i; i6++) {
                    if (((Integer) sn3VarO.get(i6)).intValue() + 3 < length) {
                        lg1 lg1Var = new lg1(bArr, ((Integer) sn3VarO.get(i6)).intValue() + 3, length);
                        zq zqVarB0 = b0(lg1Var);
                        if (zqVarB0.a == 33 && zqVarB0.b == 0) {
                            lg1Var.e(4);
                            int iK = lg1Var.k(3);
                            lg1Var.a();
                            q63 q63VarC0 = c0(lg1Var, true, iK, null);
                            return mo2.a(q63VarC0.a, q63VarC0.b, q63VarC0.c, q63VarC0.d, q63VarC0.e, q63VarC0.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:43|6|(3:46|7|(2:9|10))|(2:41|15)|48|19) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r7.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.hj b(byte[] r7) throws java.lang.Throwable {
        /*
            hj r0 = new hj
            r0.<init>()
            if (r7 != 0) goto L8
            goto L55
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            gj r5 = new gj     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L56
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L55
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L55
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L56
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3e
            goto L36
        L55:
            return r0
        L56:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r0.printStackTrace()
        L60:
            r1.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r0 = move-exception
            r0.printStackTrace()
        L68:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl2.b(byte[]):hj");
    }

    public static zq b0(lg1 lg1Var) {
        lg1Var.a();
        return new zq(lg1Var.k(6), lg1Var.k(6), lg1Var.k(3) - 1, false);
    }

    public static void c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.q63 c0(defpackage.lg1 r18, boolean r19, int r20, defpackage.q63 r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.k(r2)
            boolean r7 = r0.j()
            r8 = 5
            int r8 = r0.k(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.j()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.k(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.a
            boolean r7 = r2.b
            int r8 = r2.c
            int r10 = r2.d
            int[] r4 = r2.e
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.k(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.j()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.j()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.e(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.e(r5)
        L79:
            q63 r11 = new q63
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl2.c0(lg1, boolean, int, q63):q63");
    }

    public static boolean d(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
        } catch (Throwable th) {
            th = th;
            inputStreamOpenRawResource = null;
        }
        try {
            boolean zE = e(file, inputStreamOpenRawResource);
            c(inputStreamOpenRawResource);
            return zE;
        } catch (Throwable th2) {
            th = th2;
            c(inputStreamOpenRawResource);
            throw th;
        }
    }

    public static void d0(lg1 lg1Var) {
        int iP = lg1Var.p() + 1;
        lg1Var.e(8);
        for (int i2 = 0; i2 < iP; i2++) {
            lg1Var.p();
            lg1Var.p();
            lg1Var.a();
        }
        lg1Var.e(20);
    }

    public static boolean e(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            c(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static qs0 f(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            qs0 qs0Var = new qs0();
            new LinkedHashMap();
            qs0Var.a = new g4(os.f);
            return qs0Var;
        }
        ClassLoader classLoader = qs0.class.getClassLoader();
        i30.j(classLoader);
        bundle.setClassLoader(classLoader);
        db0 db0Var = new db0(bundle.size());
        for (String str : bundle.keySet()) {
            i30.j(str);
            db0Var.put(str, bundle.get(str));
        }
        db0Var.b();
        db0Var.r = true;
        if (db0Var.n <= 0) {
            db0Var = db0.s;
            i30.k(db0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        qs0 qs0Var2 = new qs0();
        new LinkedHashMap();
        qs0Var2.a = new g4(db0Var);
        return qs0Var2;
    }

    public static final void g(hk hkVar) {
        w30 w30Var = (w30) hkVar.h(fr.j);
        if (w30Var != null && !w30Var.a()) {
            throw ((g40) w30Var).v();
        }
    }

    public static bd h(zc zcVar) {
        yc ycVar = new yc();
        ycVar.c = new up0();
        bd bdVar = new bd(ycVar);
        ycVar.b = bdVar;
        ycVar.a = zcVar.getClass();
        try {
            Object objF = zcVar.f(ycVar);
            if (objF == null) {
                return bdVar;
            }
            ycVar.a = objF;
            return bdVar;
        } catch (Exception e2) {
            bdVar.g.i(e2);
            return bdVar;
        }
    }

    public static float i(int i2, String[] strArr) throws NumberFormatException {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static File j(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static int k(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to BackoffPolicy");
    }

    public static int l(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to NetworkType");
    }

    public static int m(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to OutOfQuotaPolicy");
    }

    public static int n(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 == 4) {
            return 5;
        }
        if (i2 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to State");
    }

    public static jp o(w30 w30Var, boolean z2, b40 b40Var, int i2) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        boolean z3 = (i2 & 2) != 0;
        if (w30Var instanceof g40) {
            return ((g40) w30Var).E(z2, z3, b40Var);
        }
        a40 a40Var = new a40(1, b40Var, f30.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0);
        g40 g40Var = (g40) w30Var;
        g40Var.getClass();
        return g40Var.E(z2, z3, new e30(a40Var));
    }

    public static boolean p(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static MappedByteBuffer q(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static int t(Context context, int i2, int i3) {
        TypedValue typedValueN = qb1.n(context, i2);
        return (typedValueN == null || typedValueN.type != 16) ? i3 : typedValueN.data;
    }

    public static TimeInterpolator u(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!p(strValueOf, "cubic-bezier") && !p(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (p(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(i(0, strArrSplit), i(1, strArrSplit), i(2, strArrSplit), i(3, strArrSplit));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!p(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            zt0.p(zt0.k(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e2);
        }
    }

    public static final void v(hk hkVar, Object obj) {
        if (obj == i) {
            return;
        }
        if (!(obj instanceof r11)) {
            Object objF = hkVar.f(null, ik.l);
            i30.k(objF, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ga1.o(objF);
            throw null;
        }
        r11 r11Var = (r11) obj;
        o11[] o11VarArr = r11Var.b;
        int length = o11VarArr.length - 1;
        if (length < 0) {
            return;
        }
        o11 o11Var = o11VarArr[length];
        i30.j(null);
        Object obj2 = r11Var.a[length];
        throw null;
    }

    public static int w(int i2) {
        String str;
        int iS = ex0.s(i2);
        if (iS == 0) {
            return 0;
        }
        int i3 = 1;
        if (iS != 1) {
            i3 = 2;
            if (iS != 2) {
                i3 = 3;
                if (iS != 3) {
                    i3 = 4;
                    if (iS != 4) {
                        if (iS == 5) {
                            return 5;
                        }
                        StringBuilder sb = new StringBuilder("Could not convert ");
                        switch (i2) {
                            case 1:
                                str = "ENQUEUED";
                                break;
                            case 2:
                                str = "RUNNING";
                                break;
                            case 3:
                                str = "SUCCEEDED";
                                break;
                            case 4:
                                str = "FAILED";
                                break;
                            case 5:
                                str = "BLOCKED";
                                break;
                            case 6:
                                str = "CANCELLED";
                                break;
                            default:
                                str = "null";
                                break;
                        }
                        sb.append(str);
                        sb.append(" to int");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return i3;
    }

    public static final Object x(Object obj) {
        l20 l20Var;
        m20 m20Var = obj instanceof m20 ? (m20) obj : null;
        return (m20Var == null || (l20Var = m20Var.a) == null) ? obj : l20Var;
    }

    public static final Object y(hk hkVar, Object obj) {
        if (obj == null) {
            obj = hkVar.f(0, ik.k);
            i30.j(obj);
        }
        if (obj == 0) {
            return i;
        }
        if (obj instanceof Integer) {
            return hkVar.f(new r11(((Number) obj).intValue(), hkVar), ik.m);
        }
        ga1.o(obj);
        throw null;
    }

    public static int z(int i2, byte[] bArr) {
        int i3;
        synchronized (I) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    try {
                        if (i4 >= i2 - 2) {
                            i4 = i2;
                            break;
                        }
                        int i6 = i4 + 1;
                        if (bArr[i4] == 0 && bArr[i6] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4 = i6;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = J;
                    int length = iArr.length;
                    if (length <= i5) {
                        J = Arrays.copyOf(iArr, length + length);
                    }
                    J[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = J[i9] - i7;
                System.arraycopy(bArr, i7, bArr, i8, i10);
                int i11 = i8 + i10;
                int i12 = i11 + 1;
                bArr[i11] = 0;
                i8 = i11 + 2;
                bArr[i12] = 0;
                i7 += i10 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i8, i3 - i8);
        }
        return i3;
    }

    public void s() {
    }

    public void r(FloatingActionButton floatingActionButton) {
    }
}
