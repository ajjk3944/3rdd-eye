package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class m54 {
    public static final gs3 a = new gs3("CONDITION_FALSE", 3);
    public static final bk b = new bk(7);
    public static final so1 c = new so1("gads:pan:experiment_id", "", 4);
    public static final zq2 d = new zq2(7);
    public static final zq2 e = new zq2(22);
    public static final kj1 f = new kj1(5);

    public static int C(byte[] bArr, int i, v44 v44Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return I(b2, bArr, i2, v44Var);
        }
        v44Var.a = b2;
        return i2;
    }

    public static long D(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static String E(String str, Context context, boolean z, HashMap map) {
        String strD;
        iz1 iz1Var = mz1.z0;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (((Boolean) kz1Var.a(iz1Var)).booleanValue() && !z) {
            return str;
        }
        hg4 hg4Var = hg4.C;
        oc2 oc2Var = hg4Var.y;
        lf4 lf4Var = hg4Var.c;
        oc2 oc2Var2 = hg4Var.y;
        if (!oc2Var.a(context) || TextUtils.isEmpty(str) || (strD = oc2Var2.d(context)) == null) {
            return str;
        }
        String str2 = (String) kz1Var2.a(mz1.s0);
        if (((Boolean) kz1Var2.a(mz1.r0)).booleanValue() && str.contains(str2)) {
            if (lf4Var.E(str)) {
                Map map2 = (Map) map.get("_ac");
                oc2Var2.getClass();
                oc2Var2.h(context, "_ac", strD, oc2.f(map2));
                return S(context, str).replace(str2, strD);
            }
            if (!lf4Var.F(str)) {
                return str;
            }
            Map map3 = (Map) map.get("_ai");
            oc2Var2.getClass();
            oc2Var2.h(context, "_ai", strD, oc2.f(map3));
            return S(context, str).replace(str2, strD);
        }
        if (str.contains("fbs_aeid") || ((Boolean) kz1Var2.a(mz1.q0)).booleanValue()) {
            return str;
        }
        if (lf4Var.E(str)) {
            Map map4 = (Map) map.get("_ac");
            oc2Var2.getClass();
            oc2Var2.h(context, "_ac", strD, oc2.f(map4));
            return P(S(context, str), "fbs_aeid", strD).toString();
        }
        if (!lf4Var.F(str)) {
            return str;
        }
        Map map5 = (Map) map.get("_ai");
        oc2Var2.getClass();
        oc2Var2.h(context, "_ai", strD, oc2.f(map5));
        return P(S(context, str), "fbs_aeid", strD).toString();
    }

    public static String F(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        String str = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = ((tj1) obj).a.g.m;
            if (pp1.b(str2)) {
                return "video/mp4";
            }
            if (pp1.a(str2)) {
                z = true;
            } else if (pp1.c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static ao3 G(Set set, dn3 dn3Var) {
        zt0.d0(set, "set1");
        zt0.d0(dn3Var, "set2");
        return new ao3(set, dn3Var);
    }

    public static byte[] H(byte[] bArr, byte[] bArr2) {
        long J = J(0, bArr) & 67108863;
        int i = 3;
        long J2 = (J(3, bArr) >> 2) & 67108611;
        long J3 = (J(6, bArr) >> 4) & 67092735;
        long J4 = (J(9, bArr) >> 6) & 66076671;
        long J5 = (J(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i2 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 >= length) {
                long j6 = j + (j2 >> 26);
                long j7 = j6 & 67108863;
                long j8 = j3 + (j6 >> 26);
                long j9 = j8 & 67108863;
                long j10 = j4 + (j8 >> 26);
                long j11 = j10 & 67108863;
                long j12 = ((j10 >> 26) * 5) + j5;
                long j13 = j12 >> 26;
                long j14 = j12 & 67108863;
                long j15 = j14 + 5;
                long j16 = (j2 & 67108863) + j13;
                long j17 = j16 + (j15 >> 26);
                long j18 = j7 + (j17 >> 26);
                long j19 = j9 + (j18 >> 26);
                long j20 = (j11 + (j19 >> 26)) - 67108864;
                long j21 = j20 >> 63;
                long j22 = ~j21;
                long j23 = (j16 & j21) | (j17 & 67108863 & j22);
                long j24 = (j7 & j21) | (j18 & 67108863 & j22);
                long j25 = (j9 & j21) | (j19 & 67108863 & j22);
                long J6 = J(16, bArr) + (((j15 & 67108863 & j22) | (j14 & j21) | (j23 << 26)) & 4294967295L);
                long J7 = J(20, bArr);
                long J8 = J(24, bArr);
                long J9 = J(28, bArr) + (((j25 >> 18) | (((j11 & j21) | (j20 & j22)) << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                T(bArr4, J6 & 4294967295L, 0);
                long j26 = J7 + (((j23 >> 6) | (j24 << 20)) & 4294967295L) + (J6 >> 32);
                T(bArr4, j26 & 4294967295L, 4);
                long j27 = J8 + (((j25 << 14) | (j24 >> 12)) & 4294967295L) + (j26 >> 32);
                T(bArr4, j27 & 4294967295L, 8);
                T(bArr4, (J9 + (j27 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long j28 = J5 * 5;
            long j29 = J4 * 5;
            long j30 = J3 * 5;
            long J10 = j5 + (J(0, bArr3) & 67108863);
            long J11 = j2 + ((J(i, bArr3) >> 2) & 67108863);
            long J12 = j + ((J(6, bArr3) >> 4) & 67108863);
            long J13 = j3 + ((J(9, bArr3) >> 6) & 67108863);
            long j31 = J2;
            long J14 = j4 + (((J(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j32 = J11 * J;
            long j33 = J11 * j31;
            long j34 = J12 * J;
            long j35 = J11 * J3;
            long j36 = J12 * j31;
            long j37 = J13 * J;
            long j38 = J11 * J4;
            long j39 = J12 * J3;
            long j40 = J13 * j31;
            long j41 = J14 * J;
            long j42 = (J2 * 5 * J14) + (J13 * j30) + (J12 * j29) + (J11 * j28) + (J10 * J);
            long j43 = j42 & 67108863;
            long j44 = J13 * j29;
            long j45 = j30 * J14;
            long j46 = j45 + j44 + (J12 * j28) + (J10 * j31) + j32 + (j42 >> 26);
            long j47 = j29 * J14;
            long j48 = j47 + (J13 * j28) + (J10 * J3) + j33 + j34 + (j46 >> 26);
            long j49 = (J14 * j28) + (J10 * J4) + j35 + j36 + j37 + (j48 >> 26);
            long j50 = (J10 * J5) + j38 + j39 + j40 + j41 + (j49 >> 26);
            long j51 = ((j50 >> 26) * 5) + j43;
            j2 = (j46 & 67108863) + (j51 >> 26);
            i2 += 16;
            j = j48 & 67108863;
            j3 = j49 & 67108863;
            j4 = j50 & 67108863;
            j5 = j51 & 67108863;
            J2 = j31;
            i = 3;
        }
    }

    public static int I(int i, byte[] bArr, int i2, v44 v44Var) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            v44Var.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            v44Var.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            v44Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            v44Var.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                v44Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static long J(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return (((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16)) & 4294967295L;
    }

    public static bo3 K(Set set, cl3 cl3Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof bo3)) {
                return new co3(set2, cl3Var);
            }
            bo3 bo3Var = (bo3) set2;
            cl3 cl3Var2 = bo3Var.g;
            cl3Var2.getClass();
            return new co3((SortedSet) bo3Var.f, new dl3(Arrays.asList(cl3Var2, cl3Var)));
        }
        if (!(set instanceof bo3)) {
            set.getClass();
            return new bo3(set, cl3Var);
        }
        bo3 bo3Var2 = (bo3) set;
        cl3 cl3Var3 = bo3Var2.g;
        cl3Var3.getClass();
        return new bo3(bo3Var2.f, new dl3(Arrays.asList(cl3Var3, cl3Var)));
    }

    public static h54 L() {
        ClassLoader classLoader = m54.class.getClassLoader();
        if (h54.class.equals(h54.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new m54[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e3) {
                    Logger.getLogger(g54.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(h54.class.getSimpleName()), (Throwable) e3);
                }
            }
            if (arrayList.size() == 1) {
                return (h54) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (h54) h54.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static byte[] M(String str, boolean z) {
        ho3 ho3Var;
        if (z) {
            ho3Var = jo3.e;
            if (ho3Var.b != null) {
                ho3Var = new ho3(ho3Var.a, (Character) null);
            }
        } else {
            ho3Var = jo3.d;
        }
        byte[] bArrH = ho3Var.h(str);
        if (bArrH.length != 0 || str.length() <= 0) {
            return bArrH;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    public static int N(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static int O(byte[] bArr, int i, v44 v44Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            v44Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & 127) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        v44Var.b = j2;
        return i3;
    }

    public static Uri P(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        ex0.q(sb, str2, "=", str3, "&");
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }

    public static int Q(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long R(ByteBuffer byteBuffer) {
        long jD = D(byteBuffer) << 32;
        if (jD >= 0) {
            return D(byteBuffer) + jD;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static String S(Context context, String str) {
        hg4 hg4Var = hg4.C;
        String strB = hg4Var.y.b(context);
        String strC = hg4Var.y.c(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strB)) {
            str = P(str, "gmp_app_id", strB).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strC)) ? str : P(str, "fbs_aiid", strC).toString();
    }

    public static void T(byte[] bArr, long j, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }

    public static boolean U(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static double V(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static long W(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static double X(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static int Y(byte[] bArr, int i, v44 v44Var) throws a64 {
        int iC = C(bArr, i, v44Var);
        int i2 = v44Var.a;
        if (i2 < 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            v44Var.c = "";
            return iC;
        }
        i74.a.getClass();
        v44Var.c = y24.f(bArr, iC, i2);
        return iC + i2;
    }

    public static boolean Z(do3 do3Var, Collection collection) {
        collection.getClass();
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= do3Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= do3Var.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = do3Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static void a(Context context, Throwable th) {
        try {
            ou1.j(context);
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
        }
    }

    public static int a0(byte[] bArr, int i, v44 v44Var) throws a64 {
        int iC = C(bArr, i, v44Var);
        int i2 = v44Var.a;
        if (i2 < 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iC) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            v44Var.c = a54.g;
            return iC;
        }
        v44Var.c = a54.n(bArr, iC, i2);
        return iC + i2;
    }

    public static int b0(Object obj, v64 v64Var, byte[] bArr, int i, int i2, v44 v44Var) throws a64 {
        int I = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            I = I(i3, bArr, I, v44Var);
            i3 = v44Var.a;
        }
        int i4 = I;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = v44Var.d + 1;
        v44Var.d = i5;
        if (i5 >= 100) {
            throw new a64("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        v64Var.i(obj, bArr, i4, i6, v44Var);
        v44Var.d--;
        v44Var.c = obj;
        return i6;
    }

    public static int c0(Object obj, v64 v64Var, byte[] bArr, int i, int i2, int i3, v44 v44Var) throws a64 {
        k64 k64Var = (k64) v64Var;
        int i4 = v44Var.d + 1;
        v44Var.d = i4;
        if (i4 >= 100) {
            throw new a64("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iY = k64Var.y(obj, bArr, i, i2, i3, v44Var);
        v44Var.d--;
        v44Var.c = obj;
        return iY;
    }

    public static int d0(int i, byte[] bArr, int i2, int i3, x54 x54Var, v44 v44Var) {
        q54 q54Var = (q54) x54Var;
        int iC = C(bArr, i2, v44Var);
        q54Var.d(v44Var.a);
        while (iC < i3) {
            int iC2 = C(bArr, iC, v44Var);
            if (i != v44Var.a) {
                break;
            }
            iC = C(bArr, iC2, v44Var);
            q54Var.d(v44Var.a);
        }
        return iC;
    }

    public static ib1 e(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j = length - 22;
        if (j < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - 65558;
        long j3 = j2 >= 0 ? j2 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                ib1 ib1Var = new ib1();
                ib1Var.b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                ib1Var.a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return ib1Var;
            }
            j--;
        } while (j >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static int e0(byte[] bArr, int i, x54 x54Var, v44 v44Var) throws a64 {
        q54 q54Var = (q54) x54Var;
        int iC = C(bArr, i, v44Var);
        int i2 = v44Var.a + iC;
        while (iC < i2) {
            iC = C(bArr, iC, v44Var);
            q54Var.d(v44Var.a);
        }
        if (iC == i2) {
            return iC;
        }
        throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(defpackage.yu r4, defpackage.qj r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ev
            if (r0 == 0) goto L13
            r0 = r5
            ev r0 = (defpackage.ev) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ev r0 = new ev
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.k
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            dv r4 = r0.j
            cp0 r0 = r0.i
            defpackage.bd2.x(r5)     // Catch: defpackage.g -> L29
            goto L5a
        L29:
            r5 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.bd2.x(r5)
            cp0 r5 = new cp0
            r5.<init>()
            dv r1 = new dv
            r3 = 0
            r1.<init>(r3, r5)
            r0.i = r5     // Catch: defpackage.g -> L52
            r0.j = r1     // Catch: defpackage.g -> L52
            r0.l = r2     // Catch: defpackage.g -> L52
            java.lang.Object r4 = r4.b(r1, r0)     // Catch: defpackage.g -> L52
            rk r0 = defpackage.rk.f
            if (r4 != r0) goto L50
            return r0
        L50:
            r0 = r5
            goto L5a
        L52:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r1
        L56:
            dv r1 = r5.f
            if (r1 != r4) goto L5d
        L5a:
            java.lang.Object r4 = r0.f
            return r4
        L5d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m54.f(yu, qj):java.lang.Object");
    }

    public static int f0(v64 v64Var, int i, byte[] bArr, int i2, int i3, x54 x54Var, v44 v44Var) throws a64 {
        p54 p54VarA = v64Var.a();
        v64 v64Var2 = v64Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        v44 v44Var2 = v44Var;
        int iB0 = b0(p54VarA, v64Var2, bArr2, i2, i4, v44Var2);
        v64Var2.h(p54VarA);
        v44Var2.c = p54VarA;
        x54Var.add(p54VarA);
        while (iB0 < i4) {
            v44 v44Var3 = v44Var2;
            int i5 = i4;
            int iC = C(bArr2, iB0, v44Var3);
            if (i != v44Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            v64 v64Var3 = v64Var2;
            p54 p54VarA2 = v64Var3.a();
            iB0 = b0(p54VarA2, v64Var3, bArr3, iC, i5, v44Var3);
            v64Var2 = v64Var3;
            bArr2 = bArr3;
            i4 = i5;
            v44Var2 = v44Var3;
            v64Var2.h(p54VarA2);
            v44Var2.c = p54VarA2;
            x54Var.add(p54VarA2);
        }
        return iB0;
    }

    public static int g0(int i, byte[] bArr, int i2, int i3, b74 b74Var, v44 v44Var) throws a64 {
        if ((i >>> 3) == 0) {
            throw new a64("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iO = O(bArr, i2, v44Var);
            b74Var.d(i, Long.valueOf(v44Var.b));
            return iO;
        }
        if (i4 == 1) {
            b74Var.d(i, Long.valueOf(W(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iC = C(bArr, i2, v44Var);
            int i5 = v44Var.a;
            if (i5 < 0) {
                throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iC) {
                throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                b74Var.d(i, a54.g);
            } else {
                b74Var.d(i, a54.n(bArr, iC, i5));
            }
            return iC + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new a64("Protocol message contained an invalid tag (zero).");
            }
            b74Var.d(i, Integer.valueOf(Q(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        b74 b74VarA = b74.a();
        int i7 = v44Var.d + 1;
        v44Var.d = i7;
        if (i7 >= 100) {
            throw new a64("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iC2 = C(bArr, i2, v44Var);
            int i9 = v44Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iC2;
                break;
            }
            i2 = g0(i9, bArr, iC2, i3, b74VarA, v44Var);
            i8 = i9;
        }
        v44Var.d--;
        if (i2 > i3 || i8 != i6) {
            throw new a64("Failed to parse the message.");
        }
        b74Var.d(i, b74VarA);
        return i2;
    }

    public static final Class h(hf hfVar) {
        Class clsA = hfVar.a();
        i30.k(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    public static int h0(int i, byte[] bArr, int i2, int i3, v44 v44Var) throws a64 {
        if ((i >>> 3) == 0) {
            throw new a64("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return O(bArr, i2, v44Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return C(bArr, i2, v44Var) + v44Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new a64("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = C(bArr, i2, v44Var);
            i6 = v44Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = h0(i6, bArr, i2, i3, v44Var);
        }
        if (i2 > i3 || i6 != i5) {
            throw new a64("Failed to parse the message.");
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class i(m40 m40Var) {
        i30.m(m40Var, "<this>");
        Class clsA = ((gf) m40Var).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final kd j(oj ojVar) {
        kd kdVar;
        kd kdVar2;
        if (!(ojVar instanceof cp)) {
            return new kd(1, ojVar);
        }
        cp cpVar = (cp) ojVar;
        gs3 gs3Var = pu1.i;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cp.m;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(cpVar);
            kdVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(cpVar, gs3Var);
                kdVar2 = null;
                break;
            }
            if (obj instanceof kd) {
                while (!atomicReferenceFieldUpdater.compareAndSet(cpVar, obj, gs3Var)) {
                    if (atomicReferenceFieldUpdater.get(cpVar) != obj) {
                        break;
                    }
                }
                kdVar2 = (kd) obj;
                break loop0;
            }
            if (obj != gs3Var && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (kdVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kd.l;
            Object obj2 = atomicReferenceFieldUpdater2.get(kdVar2);
            if (!(obj2 instanceof ng) || ((ng) obj2).d == null) {
                kd.k.set(kdVar2, 536870911);
                atomicReferenceFieldUpdater2.set(kdVar2, d2.a);
                kdVar = kdVar2;
            } else {
                kdVar2.q();
            }
            if (kdVar != null) {
                return kdVar;
            }
        }
        return new kd(2, ojVar);
    }

    public static Intent k(i5 i5Var) {
        Intent parentActivityIntent = i5Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM = m(i5Var, i5Var.getComponentName());
            if (strM == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(i5Var, strM);
            try {
                return m(i5Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent l(i5 i5Var, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM = m(i5Var, componentName);
        if (strM == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM);
        return m(i5Var, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String m(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final Bundle n(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(ex0.h("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static ArrayList o(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static Typeface r(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, bd2.h(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public abstract void A(CharSequence charSequence);

    public c2 B(vq2 vq2Var) {
        return null;
    }

    public boolean b() {
        return false;
    }

    public abstract boolean c();

    public abstract void d(boolean z);

    public abstract int g();

    public abstract Context p();

    public boolean q() {
        return false;
    }

    public abstract void s();

    public abstract boolean u(int i, KeyEvent keyEvent);

    public boolean v(KeyEvent keyEvent) {
        return false;
    }

    public boolean w() {
        return false;
    }

    public abstract void x(boolean z);

    public abstract void y(boolean z);

    public abstract void z(boolean z);

    public void t() {
    }
}
