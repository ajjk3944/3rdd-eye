package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.tasks.Task;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class al0 {

    /* renamed from: b, reason: collision with root package name */
    public static UiModeManager f9348b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9349a;

    public /* synthetic */ al0(int i4) {
        this.f9349a = i4;
    }

    public static boolean A(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    public static boolean B(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static int C(byte[] bArr, int i4, vm1 vm1Var) {
        long j = bArr[i4];
        int i10 = i4 + 1;
        if (j >= 0) {
            vm1Var.f17657b = j;
            return i10;
        }
        int i11 = i4 + 2;
        byte b10 = bArr[i10];
        long j8 = (j & 127) | ((b10 & 127) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j8 |= (r10 & 127) << i12;
            b10 = bArr[i11];
            i11 = i13;
        }
        vm1Var.f17657b = j8;
        return i11;
    }

    public static void D(int i4) throws GeneralSecurityException {
        if (i4 < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i4)));
        }
        if (jc1.a() && i4 != 2048 && i4 != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i4)));
        }
    }

    public static void E(Class cls, Object obj) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static byte[] F(byte[] bArr) {
        int length;
        int i4 = 0;
        while (true) {
            length = bArr.length;
            if (i4 >= length || bArr[i4] != 0) {
                break;
            }
            i4++;
        }
        if (i4 == length) {
            i4 = length - 1;
        }
        int i10 = (bArr[i4] & 128) == 128 ? 1 : 0;
        int i11 = length - i4;
        byte[] bArr2 = new byte[i11 + i10];
        System.arraycopy(bArr, i4, bArr2, i10, i11);
        return bArr2;
    }

    public static int G(int i4, byte[] bArr) {
        int i10 = bArr[i4] & 255;
        int i11 = bArr[i4 + 1] & 255;
        int i12 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static String H(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i4 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i4 >= length || (iIndexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, iIndexOf);
            sb2.append(L(objArr[i4]));
            i10 = iIndexOf + 2;
            i4++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i4 < length) {
            String str2 = " [";
            while (i4 < objArr.length) {
                sb2.append(str2);
                sb2.append(L(objArr[i4]));
                i4++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void I(BigInteger bigInteger) throws GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(BigInteger.valueOf(65536L)) <= 0) {
            throw new GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }

    public static int J(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static long K(int i4, byte[] bArr) {
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((bArr[i4 + 7] & 255) << 56);
    }

    public static String L(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strM = r5.c.m(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strM.length() + 8 + name2.length() + 1);
            je.u.B(sb2, "<", strM, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static boolean M(byte b10) {
        return b10 > -65;
    }

    public static int N(byte[] bArr, int i4, vm1 vm1Var) throws ao1 {
        int iF = f(bArr, i4, vm1Var);
        int i10 = vm1Var.f17656a;
        if (i10 < 0) {
            throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 == 0) {
            vm1Var.f17658c = "";
            return iF;
        }
        vm1Var.f17658c = kp1.d(iF, i10, bArr);
        return iF + i10;
    }

    public static int[] O(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof z61) {
            z61 z61Var = (z61) abstractCollection;
            return Arrays.copyOfRange(z61Var.f19028a, z61Var.f19029b, z61Var.f19030c);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = array[i4];
            obj.getClass();
            iArr[i4] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int P(byte[] bArr, int i4, vm1 vm1Var) throws ao1 {
        int iF = f(bArr, i4, vm1Var);
        int i10 = vm1Var.f17656a;
        if (i10 < 0) {
            throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iF) {
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            vm1Var.f17658c = bn1.f9729b;
            return iF;
        }
        vm1Var.f17658c = bn1.v(iF, i10, bArr);
        return iF + i10;
    }

    public static List Q(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new z61(iArr, 0, length);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer R(java.lang.String r14) {
        /*
            r14.getClass()
            boolean r0 = r14.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
        La:
            r14 = r1
            goto L7e
        Ld:
            r0 = 0
            char r2 = r14.charAt(r0)
            r3 = 45
            if (r2 != r3) goto L17
            r0 = 1
        L17:
            int r4 = r14.length()
            if (r0 != r4) goto L1e
            goto La
        L1e:
            int r4 = r0 + 1
            char r0 = r14.charAt(r0)
            r5 = -1
            r6 = 128(0x80, float:1.8E-43)
            if (r0 >= r6) goto L2e
            byte[] r7 = com.google.android.gms.internal.ads.b71.f9611a
            r0 = r7[r0]
            goto L31
        L2e:
            byte[] r0 = com.google.android.gms.internal.ads.b71.f9611a
            r0 = r5
        L31:
            if (r0 < 0) goto La
            r7 = 10
            if (r0 < r7) goto L38
            goto La
        L38:
            int r0 = -r0
            long r8 = (long) r0
        L3a:
            int r0 = r14.length()
            r10 = -9223372036854775808
            if (r4 >= r0) goto L6d
            int r0 = r4 + 1
            char r4 = r14.charAt(r4)
            if (r4 >= r6) goto L4f
            byte[] r12 = com.google.android.gms.internal.ads.b71.f9611a
            r4 = r12[r4]
            goto L52
        L4f:
            byte[] r4 = com.google.android.gms.internal.ads.b71.f9611a
            r4 = r5
        L52:
            if (r4 < 0) goto La
            if (r4 >= r7) goto La
            r12 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 >= 0) goto L60
            goto La
        L60:
            r12 = 10
            long r8 = r8 * r12
            long r12 = (long) r4
            long r10 = r10 + r12
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 >= 0) goto L6a
            goto La
        L6a:
            long r8 = r8 - r12
            r4 = r0
            goto L3a
        L6d:
            if (r2 != r3) goto L74
            java.lang.Long r14 = java.lang.Long.valueOf(r8)
            goto L7e
        L74:
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 != 0) goto L79
            goto La
        L79:
            long r2 = -r8
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
        L7e:
            if (r14 == 0) goto L97
            long r2 = r14.longValue()
            int r0 = r14.intValue()
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L8e
            goto L97
        L8e:
            int r14 = r14.intValue()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            return r14
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.al0.R(java.lang.String):java.lang.Integer");
    }

    public static int S(Object obj, xo1 xo1Var, byte[] bArr, int i4, int i10, vm1 vm1Var) throws ao1 {
        int iR = i4 + 1;
        int i11 = bArr[i4];
        if (i11 < 0) {
            iR = r(i11, bArr, iR, vm1Var);
            i11 = vm1Var.f17656a;
        }
        int i12 = iR;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = vm1Var.f17659d + 1;
        vm1Var.f17659d = i13;
        if (i13 >= 100) {
            throw new ao1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i14 = i12 + i11;
        xo1Var.j(obj, bArr, i12, i14, vm1Var);
        vm1Var.f17659d--;
        vm1Var.f17658c = obj;
        return i14;
    }

    public static int T(Object obj, xo1 xo1Var, byte[] bArr, int i4, int i10, int i11, vm1 vm1Var) throws ao1 {
        mo1 mo1Var = (mo1) xo1Var;
        int i12 = vm1Var.f17659d + 1;
        vm1Var.f17659d = i12;
        if (i12 >= 100) {
            throw new ao1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iY = mo1Var.y(obj, bArr, i4, i10, i11, vm1Var);
        vm1Var.f17659d--;
        vm1Var.f17658c = obj;
        return iY;
    }

    public static int U(int i4, byte[] bArr, int i10, int i11, xn1 xn1Var, vm1 vm1Var) {
        rn1 rn1Var = (rn1) xn1Var;
        int iF = f(bArr, i10, vm1Var);
        rn1Var.f(vm1Var.f17656a);
        while (iF < i11) {
            int iF2 = f(bArr, iF, vm1Var);
            if (i4 != vm1Var.f17656a) {
                break;
            }
            iF = f(bArr, iF2, vm1Var);
            rn1Var.f(vm1Var.f17656a);
        }
        return iF;
    }

    public static int V(byte[] bArr, int i4, xn1 xn1Var, vm1 vm1Var) throws ao1 {
        rn1 rn1Var = (rn1) xn1Var;
        int iF = f(bArr, i4, vm1Var);
        int i10 = vm1Var.f17656a + iF;
        while (iF < i10) {
            iF = f(bArr, iF, vm1Var);
            rn1Var.f(vm1Var.f17656a);
        }
        if (iF == i10) {
            return iF;
        }
        throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int W(xo1 xo1Var, int i4, byte[] bArr, int i10, int i11, xn1 xn1Var, vm1 vm1Var) throws ao1 {
        qn1 qn1VarB = xo1Var.b();
        xo1 xo1Var2 = xo1Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        vm1 vm1Var2 = vm1Var;
        int iS = S(qn1VarB, xo1Var2, bArr2, i10, i12, vm1Var2);
        xo1Var2.a(qn1VarB);
        vm1Var2.f17658c = qn1VarB;
        xn1Var.add(qn1VarB);
        while (iS < i12) {
            vm1 vm1Var3 = vm1Var2;
            int i13 = i12;
            int iF = f(bArr2, iS, vm1Var3);
            if (i4 != vm1Var3.f17656a) {
                break;
            }
            byte[] bArr3 = bArr2;
            xo1 xo1Var3 = xo1Var2;
            qn1 qn1VarB2 = xo1Var3.b();
            iS = S(qn1VarB2, xo1Var3, bArr3, iF, i13, vm1Var3);
            xo1Var2 = xo1Var3;
            bArr2 = bArr3;
            i12 = i13;
            vm1Var2 = vm1Var3;
            xo1Var2.a(qn1VarB2);
            vm1Var2.f17658c = qn1VarB2;
            xn1Var.add(qn1VarB2);
        }
        return iS;
    }

    public static int X(int i4, byte[] bArr, int i10, int i11, dp1 dp1Var, vm1 vm1Var) throws ao1 {
        if ((i4 >>> 3) == 0) {
            throw new ao1("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i4 & 7;
        if (i12 == 0) {
            int iC = C(bArr, i10, vm1Var);
            dp1Var.d(i4, Long.valueOf(vm1Var.f17657b));
            return iC;
        }
        if (i12 == 1) {
            dp1Var.d(i4, Long.valueOf(K(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iF = f(bArr, i10, vm1Var);
            int i13 = vm1Var.f17656a;
            if (i13 < 0) {
                throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iF) {
                throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                dp1Var.d(i4, bn1.f9729b);
            } else {
                dp1Var.d(i4, bn1.v(iF, i13, bArr));
            }
            return iF + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new ao1("Protocol message contained an invalid tag (zero).");
            }
            dp1Var.d(i4, Integer.valueOf(G(i10, bArr)));
            return i10 + 4;
        }
        int i14 = (i4 & (-8)) | 4;
        dp1 dp1VarA = dp1.a();
        int i15 = vm1Var.f17659d + 1;
        vm1Var.f17659d = i15;
        if (i15 >= 100) {
            throw new ao1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iF2 = f(bArr, i10, vm1Var);
            int i17 = vm1Var.f17656a;
            if (i17 == i14) {
                i16 = i17;
                i10 = iF2;
                break;
            }
            i10 = X(i17, bArr, iF2, i11, dp1VarA, vm1Var);
            i16 = i17;
        }
        vm1Var.f17659d--;
        if (i10 > i11 || i16 != i14) {
            throw new ao1("Failed to parse the message.");
        }
        dp1Var.d(i4, dp1VarA);
        return i10;
    }

    public static int Y(int i4, byte[] bArr, int i10, int i11, vm1 vm1Var) throws ao1 {
        if ((i4 >>> 3) == 0) {
            throw new ao1("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i4 & 7;
        if (i12 == 0) {
            return C(bArr, i10, vm1Var);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return f(bArr, i10, vm1Var) + vm1Var.f17656a;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new ao1("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i4 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = f(bArr, i10, vm1Var);
            i14 = vm1Var.f17656a;
            if (i14 == i13) {
                break;
            }
            i10 = Y(i14, bArr, i10, i11, vm1Var);
        }
        if (i10 > i11 || i14 != i13) {
            throw new ao1("Failed to parse the message.");
        }
        return i10;
    }

    public static int d(long j) {
        int i4 = (int) j;
        mq0.U("Out of range: %s", j, ((long) i4) == j);
        return i4;
    }

    public static int f(byte[] bArr, int i4, vm1 vm1Var) {
        int i10 = i4 + 1;
        byte b10 = bArr[i4];
        if (b10 < 0) {
            return r(b10, bArr, i10, vm1Var);
        }
        vm1Var.f17656a = b10;
        return i10;
    }

    public static long g(double d10) {
        mq0.y("not a normal value", A(d10));
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static md i(Context context, String str, String str2) {
        md mdVar;
        try {
            mdVar = (md) ((LinkedBlockingQueue) new r7(context, str, str2).f15560e).poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            mdVar = null;
        }
        return mdVar == null ? r7.l() : mdVar;
    }

    public static ox0 j(Task task) {
        ox0 ox0Var = new ox0();
        ox0Var.f14810h = task;
        task.addOnCompleteListener(k81.f13081a, new rg0(14, ox0Var));
        return ox0Var;
    }

    public static void m(int i4) throws InvalidAlgorithmParameterException {
        if (i4 != 16 && i4 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i4 * 8)));
        }
    }

    public static void o(int i4, String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 20);
        sb2.append("Ad failed to load : ");
        sb2.append(i4);
        za.i.g(sb2.toString());
        ya.a0.n(str, th2);
        if (i4 == 3) {
            return;
        }
        ua.j.C.f35265h.g(str, th2);
    }

    public static boolean q(int i4) {
        Boolean bool;
        if (i4 - 1 == 0) {
            return !jc1.a();
        }
        if (!jc1.a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            jc1.f12714a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public static int r(int i4, byte[] bArr, int i10, vm1 vm1Var) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i4 & 127;
        if (b10 >= 0) {
            vm1Var.f17656a = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            vm1Var.f17656a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            vm1Var.f17656a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            vm1Var.f17656a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                vm1Var.f17656a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int s(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? LinearLayoutManager.INVALID_OFFSET : (int) j;
    }

    public static ECParameterSpec w(il1 il1Var) throws NoSuchAlgorithmException {
        int iOrdinal = il1Var.ordinal();
        if (iOrdinal == 0) {
            return oc1.f14668a;
        }
        if (iOrdinal == 1) {
            return oc1.f14669b;
        }
        if (iOrdinal == 2) {
            return oc1.f14670c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(il1Var.toString()));
    }

    public static void x(Context context, boolean z3) {
        if (z3) {
            za.i.g("This request is sent from a test device.");
            return;
        }
        za.d dVar = va.r.g.f36157a;
        String strC = za.d.c(context);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strC).length() + FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH);
        sb2.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb2.append(strC);
        sb2.append("\")) to get test ads on this device.");
        za.i.g(sb2.toString());
    }

    public static void y(ol1 ol1Var) throws GeneralSecurityException {
        int iOrdinal = ol1Var.ordinal();
        if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(ol1Var.name())));
        }
    }

    public static void z(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public abstract s91 k();

    public abstract Object l(av0 av0Var, ed1 ed1Var, Class cls);

    public abstract void p(z71 z71Var, Set set);

    public abstract int t(z71 z71Var);

    public String toString() {
        switch (this.f9349a) {
            case 7:
                return v().toString();
            default:
                return super.toString();
        }
    }

    public abstract Integer u();

    public abstract Object v();
}
