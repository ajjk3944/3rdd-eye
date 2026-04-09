package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class pu1 implements of1, kx3 {
    public static volatile kh2 g;
    public static final gs3 h;
    public static final gs3 i;
    public static boolean l;
    public static int m;
    public static final /* synthetic */ int u = 0;
    public final /* synthetic */ int f = 21;
    public static final int[] j = {R.attr.state_enabled, R.attr.state_pressed};
    public static final Object k = new Object();
    public static final rv1 n = new rv1(27);
    public static final zq2 o = new zq2(18);
    public static final p63 p = new p63(8);
    public static final int[] q = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] r = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] s = {67108863, 33554431};
    public static final int[] t = {26, 25};

    static {
        int i2 = 3;
        h = new gs3("UNDEFINED", i2);
        i = new gs3("REUSABLE_CLAIMED", i2);
    }

    public static wn1 A(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            String str2 = v23.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                a30.x("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(nh1.b(new kz2(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    a30.z("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new ii1(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new wn1(arrayList);
    }

    public static kq3 B(Throwable th) {
        th.getClass();
        kq3 kq3Var = new kq3();
        kq3Var.e(th);
        return kq3Var;
    }

    public static void C(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j2 = jArr[8];
        long j3 = jArr[18];
        long j4 = j2 + (j3 << 4);
        jArr[8] = j4;
        long j5 = j3 + j3 + j4;
        jArr[8] = j5;
        jArr[8] = j5 + j3;
        long j6 = jArr[7];
        long j7 = jArr[17];
        long j8 = j6 + (j7 << 4);
        jArr[7] = j8;
        long j9 = j7 + j7 + j8;
        jArr[7] = j9;
        jArr[7] = j9 + j7;
        long j10 = jArr[6];
        long j11 = jArr[16];
        long j12 = j10 + (j11 << 4);
        jArr[6] = j12;
        long j13 = j11 + j11 + j12;
        jArr[6] = j13;
        jArr[6] = j13 + j11;
        long j14 = jArr[5];
        long j15 = jArr[15];
        long j16 = j14 + (j15 << 4);
        jArr[5] = j16;
        long j17 = j15 + j15 + j16;
        jArr[5] = j17;
        jArr[5] = j17 + j15;
        long j18 = jArr[4];
        long j19 = jArr[14];
        long j20 = j18 + (j19 << 4);
        jArr[4] = j20;
        long j21 = j19 + j19 + j20;
        jArr[4] = j21;
        jArr[4] = j21 + j19;
        long j22 = jArr[3];
        long j23 = jArr[13];
        long j24 = j22 + (j23 << 4);
        jArr[3] = j24;
        long j25 = j23 + j23 + j24;
        jArr[3] = j25;
        jArr[3] = j25 + j23;
        long j26 = jArr[2];
        long j27 = jArr[12];
        long j28 = j26 + (j27 << 4);
        jArr[2] = j28;
        long j29 = j27 + j27 + j28;
        jArr[2] = j29;
        jArr[2] = j29 + j27;
        long j30 = jArr[1];
        long j31 = jArr[11];
        long j32 = j30 + (j31 << 4);
        jArr[1] = j32;
        long j33 = j31 + j31 + j32;
        jArr[1] = j33;
        jArr[1] = j33 + j31;
        long j34 = jArr[0];
        long j35 = jArr[10];
        long j36 = j34 + (j35 << 4);
        jArr[0] = j36;
        long j37 = j35 + j35 + j36;
        jArr[0] = j37;
        jArr[0] = j37 + j35;
        E(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static ar3 D(Callable callable, Executor executor) {
        ar3 ar3Var = new ar3(callable);
        executor.execute(ar3Var);
        return ar3Var;
    }

    public static void E(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j2 = jArr[i2];
            long j3 = j2 / 67108864;
            jArr[i2] = j2 - (j3 << 26);
            int i3 = i2 + 1;
            long j4 = jArr[i3] + j3;
            jArr[i3] = j4;
            long j5 = j4 / 33554432;
            jArr[i3] = j4 - (j5 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j5;
        }
        long j6 = jArr[0];
        long j7 = jArr[10];
        long j8 = j6 + (j7 << 4);
        jArr[0] = j8;
        long j9 = j7 + j7 + j8;
        jArr[0] = j9;
        long j10 = j9 + j7;
        jArr[0] = j10;
        jArr[10] = 0;
        long j11 = j10 / 67108864;
        jArr[0] = j10 - (j11 << 26);
        jArr[1] = jArr[1] + j11;
    }

    public static boolean F(int i2, kz2 kz2Var, boolean z) throws lq1 {
        if (kz2Var.B() < 7) {
            if (z) {
                return false;
            }
            int iB = kz2Var.B();
            StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 18);
            sb.append("too short header: ");
            sb.append(iB);
            throw lq1.a(null, sb.toString());
        }
        if (kz2Var.K() != i2) {
            if (z) {
                return false;
            }
            throw lq1.a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i2))));
        }
        if (kz2Var.K() == 118 && kz2Var.K() == 111 && kz2Var.K() == 114 && kz2Var.K() == 98 && kz2Var.K() == 105 && kz2Var.K() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw lq1.a(null, "expected characters 'vorbis'");
    }

    public static void G(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr2[0];
        long j3 = jArr3[0];
        long j4 = j2 * j3;
        long j5 = jArr3[1];
        long j6 = jArr2[1];
        long j7 = (j6 * j3) + (j2 * j5);
        long j8 = jArr3[2];
        long j9 = jArr2[2];
        long j10 = ((j6 + j6) * j5) + (j2 * j8) + (j9 * j3);
        long j11 = jArr3[3];
        long j12 = jArr2[3];
        long j13 = (j6 * j8) + (j9 * j5) + (j2 * j11) + (j12 * j3);
        long j14 = jArr3[4];
        long j15 = jArr2[4];
        long j16 = (j6 * j11) + (j12 * j5);
        long j17 = j16 + j16 + (j9 * j8) + (j2 * j14) + (j15 * j3);
        long j18 = jArr3[5];
        long j19 = jArr2[5];
        long j20 = (j9 * j11) + (j12 * j8) + (j6 * j14) + (j15 * j5) + (j2 * j18) + (j19 * j3);
        long j21 = jArr3[6];
        long j22 = jArr2[6];
        long j23 = (j12 * j11) + (j6 * j18) + (j19 * j5);
        long j24 = j23 + j23 + (j9 * j14) + (j15 * j8) + (j2 * j21) + (j22 * j3);
        long j25 = jArr3[7];
        long j26 = jArr2[7];
        long j27 = (j12 * j14) + (j15 * j11) + (j9 * j18) + (j19 * j8) + (j6 * j21) + (j22 * j5) + (j2 * j25) + (j26 * j3);
        long j28 = jArr3[8];
        long j29 = jArr2[8];
        long j30 = (j12 * j18) + (j19 * j11) + (j6 * j25) + (j26 * j5);
        long j31 = j30 + j30 + (j15 * j14) + (j9 * j21) + (j22 * j8) + (j2 * j28) + (j29 * j3);
        long j32 = jArr3[9];
        long j33 = jArr2[9];
        long j34 = (j15 * j18) + (j19 * j14) + (j12 * j21) + (j22 * j11) + (j9 * j25) + (j26 * j8) + (j6 * j28) + (j29 * j5) + (j2 * j32) + (j3 * j33);
        long j35 = (j19 * j18) + (j12 * j25) + (j26 * j11) + (j6 * j32) + (j5 * j33);
        long j36 = (j19 * j25) + (j26 * j18) + (j12 * j32) + (j11 * j33);
        long j37 = (j26 * j25) + (j19 * j32) + (j18 * j33);
        long j38 = (j26 * j28) + (j29 * j25) + (j22 * j32) + (j21 * j33);
        long j39 = (j25 * j33) + (j26 * j32);
        C(new long[]{j4, j7, j10, j13, j17, j20, j24, j27, j31, j34, j35 + j35 + (j15 * j21) + (j22 * j14) + (j9 * j28) + (j29 * j8), (j19 * j21) + (j22 * j18) + (j15 * j25) + (j26 * j14) + (j12 * j28) + (j29 * j11) + (j9 * j32) + (j8 * j33), j36 + j36 + (j22 * j21) + (j15 * j28) + (j29 * j14), (j22 * j25) + (j26 * j21) + (j19 * j28) + (j29 * j18) + (j15 * j32) + (j14 * j33), j37 + j37 + (j22 * j28) + (j29 * j21), j38, j39 + j39 + (j29 * j28), (j28 * j33) + (j29 * j32), (j33 + j33) * j32}, jArr);
    }

    public static ar3 H(xp3 xp3Var, Executor executor) {
        ar3 ar3Var = new ar3();
        ar3Var.m = new zq3(ar3Var, xp3Var);
        executor.execute(ar3Var);
        return ar3Var;
    }

    public static void I(long[] jArr, long[] jArr2) {
        long j2 = jArr2[0];
        long j3 = j2 * j2;
        long j4 = jArr2[1];
        long j5 = (j2 + j2) * j4;
        long j6 = jArr2[2];
        long j7 = (j2 * j6) + (j4 * j4);
        long j8 = jArr2[3];
        long j9 = (j2 * j8) + (j4 * j6);
        long j10 = jArr2[4];
        long j11 = (j6 * j6) + (j4 * 4 * j8) + ((j2 + j2) * j10);
        long j12 = jArr2[5];
        long j13 = (j6 * j8) + (j4 * j10) + (j2 * j12);
        long j14 = jArr2[6];
        long j15 = (j8 * j8) + (j6 * j10) + (j2 * j14) + ((j4 + j4) * j12);
        long j16 = jArr2[7];
        long j17 = (j8 * j10) + (j6 * j12) + (j4 * j14) + (j2 * j16);
        long j18 = jArr2[8];
        long j19 = (j8 * j12) + (j4 * j16);
        long j20 = j19 + j19 + (j6 * j14) + (j2 * j18);
        long j21 = j20 + j20 + (j10 * j10);
        long j22 = jArr2[9];
        long j23 = (j10 * j12) + (j8 * j14) + (j6 * j16) + (j4 * j18) + (j2 * j22);
        long j24 = (j4 * j22) + (j8 * j16);
        long j25 = j24 + j24 + (j12 * j12) + (j10 * j14) + (j6 * j18);
        long j26 = (j12 * j14) + (j10 * j16) + (j8 * j18) + (j6 * j22);
        long j27 = (j8 * j22) + (j12 * j16);
        long j28 = j27 + j27 + (j10 * j18);
        long j29 = j28 + j28 + (j14 * j14);
        long j30 = (j14 * j16) + (j12 * j18) + (j10 * j22);
        long j31 = (j16 * j16) + (j14 * j18) + ((j12 + j12) * j22);
        long j32 = (j14 * j22) + (j16 * j18);
        C(new long[]{j3, j5, j7 + j7, j9 + j9, j11, j13 + j13, j15 + j15, j17 + j17, j21, j23 + j23, j25 + j25, j26 + j26, j29, j30 + j30, j31 + j31, j32 + j32, (j16 * 4 * j22) + (j18 * j18), (j18 + j18) * j22, (j22 + j22) * j22}, jArr);
    }

    public static xo3 J(n70 n70Var, Class cls, zk3 zk3Var, Executor executor) {
        int i2 = yo3.p;
        xo3 xo3Var = new xo3(n70Var, cls, zk3Var);
        n70Var.c(xo3Var, g82.F(executor, xo3Var));
        return xo3Var;
    }

    public static long[] K(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = q[i2];
            jArr[i2] = (((((bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8)) | ((bArr[i3 + 2] & 255) << 16)) | ((bArr[i3 + 3] & 255) << 24)) >> r[i2]) & s[i2 & 1];
        }
        return jArr;
    }

    public static wo3 L(n70 n70Var, Class cls, yp3 yp3Var, Executor executor) {
        int i2 = yo3.p;
        wo3 wo3Var = new wo3(n70Var, cls, yp3Var);
        n70Var.c(wo3Var, g82.F(executor, wo3Var));
        return wo3Var;
    }

    public static byte[] M(long[] jArr) {
        long j2;
        int[] iArr;
        int i2;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j2 = 19;
            iArr = t;
            if (i4 >= 2) {
                break;
            }
            int i5 = 0;
            while (i5 < 9) {
                long j3 = jArrCopyOf[i5];
                int i6 = -((int) (((j3 >> 31) & j3) >> iArr[i5 & 1]));
                jArrCopyOf[i5] = j3 + (i6 << r15);
                i5++;
                jArrCopyOf[i5] = jArrCopyOf[i5] - i6;
            }
            long j4 = jArrCopyOf[9];
            jArrCopyOf[9] = j4 + (r6 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - ((-((int) (((j4 >> 31) & j4) >> 25))) * 19);
            i4++;
        }
        long j5 = jArrCopyOf[0];
        jArrCopyOf[0] = j5 + (r3 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j5 >> 31) & j5) >> 26)));
        int i7 = 0;
        while (true) {
            iArr2 = s;
            if (i7 >= 2) {
                break;
            }
            int i8 = i3;
            while (i8 < 9) {
                long j6 = jArrCopyOf[i8];
                int i9 = i3;
                long j7 = j6 >> iArr[i8 & 1];
                jArrCopyOf[i8] = iArr2[r16] & j6;
                i8++;
                jArrCopyOf[i8] = jArrCopyOf[i8] + ((int) j7);
                i3 = i9;
                i7 = i7;
                j2 = j2;
            }
            i7++;
        }
        int i10 = i3;
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        jArrCopyOf[i10] = (((int) (r2 >> 25)) * j2) + jArrCopyOf[i10];
        int i11 = ~((((int) r4) - 67108845) >> 31);
        for (int i12 = 1; i12 < 10; i12++) {
            int i13 = ~(((int) jArrCopyOf[i12]) ^ iArr2[i12 & 1]);
            int i14 = i13 & (i13 << 16);
            int i15 = i14 & (i14 << 8);
            int i16 = i15 & (i15 << 4);
            int i17 = i16 & (i16 << 2);
            i11 &= (i17 & (i17 + i17)) >> 31;
        }
        jArrCopyOf[i10] = jArrCopyOf[i10] - (67108845 & i11);
        long j8 = 33554431 & i11;
        jArrCopyOf[1] = jArrCopyOf[1] - j8;
        for (i2 = 2; i2 < 10; i2 += 2) {
            jArrCopyOf[i2] = jArrCopyOf[i2] - (67108863 & i11);
            int i18 = i2 + 1;
            jArrCopyOf[i18] = jArrCopyOf[i18] - j8;
        }
        for (int i19 = i10; i19 < 10; i19++) {
            jArrCopyOf[i19] = jArrCopyOf[i19] << r[i19];
        }
        byte[] bArr = new byte[32];
        for (int i20 = i10; i20 < 10; i20++) {
            int i21 = q[i20];
            long j9 = bArr[i21];
            long j10 = jArrCopyOf[i20];
            bArr[i21] = (byte) (j9 | (j10 & 255));
            bArr[i21 + 1] = (byte) (bArr[r5] | ((j10 >> 8) & 255));
            bArr[i21 + 2] = (byte) (bArr[r5] | ((j10 >> 16) & 255));
            bArr[i21 + 3] = (byte) (bArr[r4] | ((j10 >> 24) & 255));
        }
        return bArr;
    }

    public static n70 N(n70 n70Var, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (n70Var.isDone()) {
            return n70Var;
        }
        yq3 yq3Var = new yq3();
        yq3Var.m = n70Var;
        bh3 bh3Var = new bh3();
        bh3Var.g = yq3Var;
        yq3Var.n = scheduledExecutorService.schedule(bh3Var, j2, timeUnit);
        n70Var.c(bh3Var, dq3.f);
        return yq3Var;
    }

    public static qp3 O(n70 n70Var, yp3 yp3Var, Executor executor) {
        int i2 = sp3.o;
        qp3 qp3Var = new qp3(n70Var, yp3Var);
        n70Var.c(qp3Var, g82.F(executor, qp3Var));
        return qp3Var;
    }

    public static rp3 P(n70 n70Var, zk3 zk3Var, Executor executor) {
        int i2 = sp3.o;
        rp3 rp3Var = new rp3(n70Var, zk3Var);
        n70Var.c(rp3Var, g82.F(executor, rp3Var));
        return rp3Var;
    }

    public static void Q(n70 n70Var, iq3 iq3Var, Executor executor) {
        n70Var.c(new jq3(n70Var, iq3Var, 0), executor);
    }

    public static Object R(Future future) {
        if (future.isDone()) {
            return bd2.E(future);
        }
        throw new IllegalStateException(qb1.J("Future was expected to be done: %s", future));
    }

    public static Object S(pd2 pd2Var) {
        try {
            return bd2.E(pd2Var);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new uk((Error) e.getCause());
            }
            throw new rg(e.getCause());
        }
    }

    public static void e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static bd f(yn ynVar) {
        return wl2.h(new dk(ynVar));
    }

    public static void g(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void h(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static Set j() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[Catch: all -> 0x0079, DONT_GENERATE, TryCatch #2 {all -> 0x0079, blocks: (B:19:0x0054, B:21:0x0062, B:23:0x0068, B:36:0x009d, B:26:0x007b, B:28:0x0089, B:33:0x0094, B:35:0x009a, B:41:0x00aa, B:44:0x00b3, B:43:0x00b0, B:31:0x008f), top: B:57:0x0054, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(defpackage.oj r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof defpackage.cp
            if (r0 == 0) goto Lbe
            cp r9 = (defpackage.cp) r9
            lk r0 = r9.i
            qj r1 = r9.j
            java.lang.Throwable r2 = defpackage.jq0.a(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            pg r3 = new pg
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            r1.getContext()
            boolean r2 = r0.l()
            r4 = 1
            if (r2 == 0) goto L2e
            r9.k = r3
            r9.h = r4
            hk r10 = r1.getContext()
            r0.k(r10, r9)
            return
        L2e:
            ft r0 = defpackage.p11.a()
            long r5 = r0.h
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L50
            r9.k = r3
            r9.h = r4
            l8 r10 = r0.j
            if (r10 != 0) goto L4c
            l8 r10 = new l8
            r10.<init>()
            r0.j = r10
        L4c:
            r10.addLast(r9)
            goto Lb8
        L50:
            r0.o(r4)
            r2 = 0
            hk r4 = r1.getContext()     // Catch: java.lang.Throwable -> L79
            fr r5 = defpackage.fr.j     // Catch: java.lang.Throwable -> L79
            fk r4 = r4.h(r5)     // Catch: java.lang.Throwable -> L79
            w30 r4 = (defpackage.w30) r4     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L7b
            boolean r5 = r4.a()     // Catch: java.lang.Throwable -> L79
            if (r5 != 0) goto L7b
            g40 r4 = (defpackage.g40) r4     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.CancellationException r10 = r4.v()     // Catch: java.lang.Throwable -> L79
            r9.b(r3, r10)     // Catch: java.lang.Throwable -> L79
            iq0 r10 = defpackage.bd2.k(r10)     // Catch: java.lang.Throwable -> L79
            r9.e(r10)     // Catch: java.lang.Throwable -> L79
            goto L9d
        L79:
            r10 = move-exception
            goto Lb4
        L7b:
            java.lang.Object r3 = r9.l     // Catch: java.lang.Throwable -> L79
            hk r4 = r1.getContext()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r3 = defpackage.wl2.y(r4, r3)     // Catch: java.lang.Throwable -> L79
            gs3 r5 = defpackage.wl2.i     // Catch: java.lang.Throwable -> L79
            if (r3 == r5) goto L8e
            x31 r5 = defpackage.bd2.y(r1, r4, r3)     // Catch: java.lang.Throwable -> L79
            goto L8f
        L8e:
            r5 = r2
        L8f:
            r1.e(r10)     // Catch: java.lang.Throwable -> La7
            if (r5 == 0) goto L9a
            boolean r10 = r5.R()     // Catch: java.lang.Throwable -> L79
            if (r10 == 0) goto L9d
        L9a:
            defpackage.wl2.v(r4, r3)     // Catch: java.lang.Throwable -> L79
        L9d:
            boolean r10 = r0.p()     // Catch: java.lang.Throwable -> L79
            if (r10 != 0) goto L9d
        La3:
            r0.m()
            goto Lb8
        La7:
            r10 = move-exception
            if (r5 == 0) goto Lb0
            boolean r1 = r5.R()     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto Lb3
        Lb0:
            defpackage.wl2.v(r4, r3)     // Catch: java.lang.Throwable -> L79
        Lb3:
            throw r10     // Catch: java.lang.Throwable -> L79
        Lb4:
            r9.h(r10, r2)     // Catch: java.lang.Throwable -> Lb9
            goto La3
        Lb8:
            return
        Lb9:
            r9 = move-exception
            r0.m()
            throw r9
        Lbe:
            r9.e(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu1.k(oj, java.lang.Object):void");
    }

    public static int l(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static ColorStateList m(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(j, 0));
        }
        return colorStateList;
    }

    public static void n(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            q81.a(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static final Object o(u11 u11Var, hy hyVar) throws Throwable {
        Object pgVar;
        Object objG;
        fk fkVarH = u11Var.i.getContext().h(pz.h);
        zn znVar = fkVarH instanceof zn ? (zn) fkVarH : null;
        if (znVar == null) {
            znVar = bn.a;
        }
        wl2.o(u11Var, false, new lp(0, znVar.c(u11Var.j, u11Var, u11Var.h)), 3);
        try {
            if (hyVar instanceof s9) {
                qb1.b(2, hyVar);
                pgVar = hyVar.f(u11Var, u11Var);
            } else {
                pgVar = uk2.y(hyVar, u11Var, u11Var);
            }
        } catch (Throwable th) {
            pgVar = new pg(th, false);
        }
        rk rkVar = rk.f;
        if (pgVar == rkVar || (objG = u11Var.G(pgVar)) == wl2.c) {
            return rkVar;
        }
        if (objG instanceof pg) {
            Throwable th2 = ((pg) objG).a;
            if (!(th2 instanceof t11) || ((t11) th2).f != u11Var) {
                throw th2;
            }
            if (pgVar instanceof pg) {
                throw ((pg) pgVar).a;
            }
        } else {
            pgVar = wl2.x(objG);
        }
        return pgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p(long r5, defpackage.va0 r7, defpackage.qj r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.v11
            if (r0 == 0) goto L13
            r0 = r8
            v11 r0 = (defpackage.v11) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            v11 r0 = new v11
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            cp0 r5 = r0.i
            defpackage.bd2.x(r8)     // Catch: defpackage.t11 -> L27
            return r8
        L27:
            r6 = move-exception
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.bd2.x(r8)
            r3 = 0
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L3b
            goto L5d
        L3b:
            cp0 r8 = new cp0
            r8.<init>()
            r0.i = r8     // Catch: defpackage.t11 -> L55
            r0.k = r2     // Catch: defpackage.t11 -> L55
            u11 r1 = new u11     // Catch: defpackage.t11 -> L55
            r1.<init>(r5, r0)     // Catch: defpackage.t11 -> L55
            r8.f = r1     // Catch: defpackage.t11 -> L55
            java.lang.Object r5 = o(r1, r7)     // Catch: defpackage.t11 -> L55
            rk r6 = defpackage.rk.f
            if (r5 != r6) goto L54
            return r6
        L54:
            return r5
        L55:
            r6 = move-exception
            r5 = r8
        L57:
            w30 r7 = r6.f
            java.lang.Object r5 = r5.f
            if (r7 != r5) goto L5f
        L5d:
            r5 = 0
            return r5
        L5f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu1.p(long, va0, qj):java.lang.Object");
    }

    public static String q(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static lq3 r(Object obj) {
        return obj == null ? lq3.g : new lq3(obj);
    }

    public static void s(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void t(tz1 tz1Var, rz1 rz1Var, String... strArr) {
        if (rz1Var == null) {
            return;
        }
        hg4.C.k.getClass();
        tz1Var.a(rz1Var, SystemClock.elapsedRealtime(), strArr);
    }

    public static void u(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    public static ug0 v(kz2 kz2Var, boolean z, boolean z2) throws lq1 {
        if (z) {
            F(3, kz2Var, false);
        }
        kz2Var.k((int) kz2Var.a(), StandardCharsets.UTF_8);
        long jA = kz2Var.a();
        String[] strArr = new String[(int) jA];
        for (int i2 = 0; i2 < jA; i2++) {
            strArr[i2] = kz2Var.k((int) kz2Var.a(), StandardCharsets.UTF_8);
        }
        if (z2 && (kz2Var.K() & 1) == 0) {
            throw lq1.a(null, "framing bit expected to be set");
        }
        return new ug0(9, strArr);
    }

    public static kx3 x(ix3 ix3Var) throws GeneralSecurityException {
        yf3 yf3Var = ix3Var.k;
        lx3 lx3Var = new lx3(((v34) yf3Var.f).b());
        try {
            Provider providerT = ob1.t();
            if (providerT == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerT);
            return new lv2(lx3Var, new wt2(((v34) yf3Var.f).b(), providerT), 13);
        } catch (GeneralSecurityException unused) {
            return lx3Var;
        }
    }

    public static void y(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    public static ar z(Context context) throws ze4 {
        try {
            return ar.c(context, ar.b);
        } catch (Exception e) {
            throw new ze4(e);
        }
    }

    public String toString() {
        switch (this.f) {
            case zy1.zzm /* 21 */:
                return w().toString();
            default:
                return super.toString();
        }
    }

    public abstract Object w();
}
