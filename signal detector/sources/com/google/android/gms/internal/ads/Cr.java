package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import t2.AbstractC2907C;

/* loaded from: classes.dex */
public abstract class Cr {

    /* renamed from: b, reason: collision with root package name */
    public static UiModeManager f7677b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7678a;

    public /* synthetic */ Cr(int i) {
        this.f7678a = i;
    }

    public static void A(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static byte[] C(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i3 = (bArr[i] & 128) == 128 ? 1 : 0;
        int i6 = length - i;
        byte[] bArr2 = new byte[i6 + i3];
        System.arraycopy(bArr, i, bArr2, i3, i6);
        return bArr2;
    }

    public static int D(int i, byte[] bArr) {
        int i3 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i7 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i3 | (i7 << 16);
    }

    public static String E(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(I(objArr[i]));
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(I(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void F(BigInteger bigInteger) throws GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(BigInteger.valueOf(65536L)) <= 0) {
            throw new GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }

    public static int G(byte b5, byte b6, byte b7, byte b8) {
        return (b5 << 24) | ((b6 & 255) << 16) | ((b7 & 255) << 8) | (b8 & 255);
    }

    public static long H(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static String I(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e6) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strN = AbstractC1135f5.n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strN), (Throwable) e6);
            String name2 = e6.getClass().getName();
            StringBuilder sb = new StringBuilder(strN.length() + 8 + name2.length() + 1);
            A.f.w(sb, "<", strN, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static boolean J(byte b5) {
        return b5 > -65;
    }

    public static int K(byte[] bArr, int i, KK kk) throws C1636oL {
        int iC = c(bArr, i, kk);
        int i3 = kk.f9479a;
        if (i3 < 0) {
            throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            kk.f9481c = "";
            return iC;
        }
        kk.f9481c = YL.d(iC, i3, bArr);
        return iC + i3;
    }

    public static int[] L(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof LC) {
            LC lc = (LC) abstractCollection;
            return Arrays.copyOfRange(lc.f9636a, lc.f9637b, lc.f9638c);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int M(byte[] bArr, int i, KK kk) throws C1636oL {
        int iC = c(bArr, i, kk);
        int i3 = kk.f9479a;
        if (i3 < 0) {
            throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iC) {
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i3 == 0) {
            kk.f9481c = QK.f10609b;
            return iC;
        }
        kk.f9481c = QK.r(iC, i3, bArr);
        return iC + i3;
    }

    public static List N(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new LC(iArr, 0, length);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer O(java.lang.String r14) {
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
            byte[] r7 = com.google.android.gms.internal.ads.NC.f9976a
            r0 = r7[r0]
            goto L31
        L2e:
            byte[] r0 = com.google.android.gms.internal.ads.NC.f9976a
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
            byte[] r12 = com.google.android.gms.internal.ads.NC.f9976a
            r4 = r12[r4]
            goto L52
        L4f:
            byte[] r4 = com.google.android.gms.internal.ads.NC.f9976a
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Cr.O(java.lang.String):java.lang.Integer");
    }

    public static int P(Object obj, JL jl, byte[] bArr, int i, int i3, KK kk) throws C1636oL {
        int iN = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iN = n(i6, bArr, iN, kk);
            i6 = kk.f9479a;
        }
        int i7 = iN;
        if (i6 < 0 || i6 > i3 - i7) {
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i8 = kk.f9482d + 1;
        kk.f9482d = i8;
        if (i8 >= 100) {
            throw new C1636oL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = i7 + i6;
        jl.j(obj, bArr, i7, i9, kk);
        kk.f9482d--;
        kk.f9481c = obj;
        return i9;
    }

    public static int Q(Object obj, JL jl, byte[] bArr, int i, int i3, int i6, KK kk) throws C1636oL {
        C2229zL c2229zL = (C2229zL) jl;
        int i7 = kk.f9482d + 1;
        kk.f9482d = i7;
        if (i7 >= 100) {
            throw new C1636oL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iY = c2229zL.y(obj, bArr, i, i3, i6, kk);
        kk.f9482d--;
        kk.f9481c = obj;
        return iY;
    }

    public static int R(int i, byte[] bArr, int i3, int i6, InterfaceC1474lL interfaceC1474lL, KK kk) {
        C1151fL c1151fL = (C1151fL) interfaceC1474lL;
        int iC = c(bArr, i3, kk);
        c1151fL.d(kk.f9479a);
        while (iC < i6) {
            int iC2 = c(bArr, iC, kk);
            if (i != kk.f9479a) {
                break;
            }
            iC = c(bArr, iC2, kk);
            c1151fL.d(kk.f9479a);
        }
        return iC;
    }

    public static int S(byte[] bArr, int i, InterfaceC1474lL interfaceC1474lL, KK kk) throws C1636oL {
        C1151fL c1151fL = (C1151fL) interfaceC1474lL;
        int iC = c(bArr, i, kk);
        int i3 = kk.f9479a + iC;
        while (iC < i3) {
            iC = c(bArr, iC, kk);
            c1151fL.d(kk.f9479a);
        }
        if (iC == i3) {
            return iC;
        }
        throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int T(JL jl, int i, byte[] bArr, int i3, int i6, InterfaceC1474lL interfaceC1474lL, KK kk) throws C1636oL {
        AbstractC1096eL abstractC1096eLA = jl.a();
        JL jl2 = jl;
        byte[] bArr2 = bArr;
        int i7 = i6;
        KK kk2 = kk;
        int iP = P(abstractC1096eLA, jl2, bArr2, i3, i7, kk2);
        jl2.e(abstractC1096eLA);
        kk2.f9481c = abstractC1096eLA;
        interfaceC1474lL.add(abstractC1096eLA);
        while (iP < i7) {
            KK kk3 = kk2;
            int i8 = i7;
            int iC = c(bArr2, iP, kk3);
            if (i != kk3.f9479a) {
                break;
            }
            byte[] bArr3 = bArr2;
            JL jl3 = jl2;
            AbstractC1096eL abstractC1096eLA2 = jl3.a();
            iP = P(abstractC1096eLA2, jl3, bArr3, iC, i8, kk3);
            jl2 = jl3;
            bArr2 = bArr3;
            i7 = i8;
            kk2 = kk3;
            jl2.e(abstractC1096eLA2);
            kk2.f9481c = abstractC1096eLA2;
            interfaceC1474lL.add(abstractC1096eLA2);
        }
        return iP;
    }

    public static int U(int i, byte[] bArr, int i3, int i6, RL rl, KK kk) throws C1636oL {
        if ((i >>> 3) == 0) {
            throw new C1636oL("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i & 7;
        if (i7 == 0) {
            int iY = y(bArr, i3, kk);
            rl.d(i, Long.valueOf(kk.f9480b));
            return iY;
        }
        if (i7 == 1) {
            rl.d(i, Long.valueOf(H(i3, bArr)));
            return i3 + 8;
        }
        if (i7 == 2) {
            int iC = c(bArr, i3, kk);
            int i8 = kk.f9479a;
            if (i8 < 0) {
                throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - iC) {
                throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                rl.d(i, QK.f10609b);
            } else {
                rl.d(i, QK.r(iC, i8, bArr));
            }
            return iC + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new C1636oL("Protocol message contained an invalid tag (zero).");
            }
            rl.d(i, Integer.valueOf(D(i3, bArr)));
            return i3 + 4;
        }
        int i9 = (i & (-8)) | 4;
        RL rlA = RL.a();
        int i10 = kk.f9482d + 1;
        kk.f9482d = i10;
        if (i10 >= 100) {
            throw new C1636oL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i11 = 0;
        while (true) {
            if (i3 >= i6) {
                break;
            }
            int iC2 = c(bArr, i3, kk);
            int i12 = kk.f9479a;
            if (i12 == i9) {
                i11 = i12;
                i3 = iC2;
                break;
            }
            i3 = U(i12, bArr, iC2, i6, rlA, kk);
            i11 = i12;
        }
        kk.f9482d--;
        if (i3 > i6 || i11 != i9) {
            throw new C1636oL("Failed to parse the message.");
        }
        rl.d(i, rlA);
        return i3;
    }

    public static int V(int i, byte[] bArr, int i3, int i6, KK kk) throws C1636oL {
        if ((i >>> 3) == 0) {
            throw new C1636oL("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return y(bArr, i3, kk);
        }
        if (i7 == 1) {
            return i3 + 8;
        }
        if (i7 == 2) {
            return c(bArr, i3, kk) + kk.f9479a;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i3 + 4;
            }
            throw new C1636oL("Protocol message contained an invalid tag (zero).");
        }
        int i8 = (i & (-8)) | 4;
        int i9 = 0;
        while (i3 < i6) {
            i3 = c(bArr, i3, kk);
            i9 = kk.f9479a;
            if (i9 == i8) {
                break;
            }
            i3 = V(i9, bArr, i3, i6, kk);
        }
        if (i3 > i6 || i9 != i8) {
            throw new C1636oL("Failed to parse the message.");
        }
        return i3;
    }

    public static int b(long j6) {
        int i = (int) j6;
        AbstractC0582Jp.W("Out of range: %s", j6, ((long) i) == j6);
        return i;
    }

    public static int c(byte[] bArr, int i, KK kk) {
        int i3 = i + 1;
        byte b5 = bArr[i];
        if (b5 < 0) {
            return n(b5, bArr, i3, kk);
        }
        kk.f9479a = b5;
        return i3;
    }

    public static long d(double d6) {
        AbstractC0582Jp.y("not a normal value", w(d6));
        int exponent = Math.getExponent(d6);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d6) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static C1136f6 e(Context context, String str, String str2) {
        C1136f6 c1136f6;
        try {
            c1136f6 = (C1136f6) ((LinkedBlockingQueue) new C1726q3(context, str, str2).f16315e).poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            c1136f6 = null;
        }
        return c1136f6 == null ? C1726q3.o() : c1136f6;
    }

    public static Tx f(c3.j jVar) {
        Tx tx = new Tx();
        tx.f11514h = jVar;
        C1448kw c1448kw = new C1448kw(1, tx);
        jVar.getClass();
        jVar.f5912b.i(new c3.h(EnumC2059wD.f17407a, c1448kw));
        jVar.j();
        return tx;
    }

    public static void i(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    public static void j(int i, String str, Throwable th) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
        sb.append("Ad failed to load : ");
        sb.append(i);
        u2.k.g(sb.toString());
        AbstractC2907C.n(str, th);
        if (i == 3) {
            return;
        }
        p2.j.f22785C.f22795h.g(str, th);
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean m(int i) {
        Boolean bool;
        if (i - 1 == 0) {
            return !AbstractC2061wF.a();
        }
        if (!AbstractC2061wF.a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            AbstractC2061wF.f17415a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public static int n(int i, byte[] bArr, int i3, KK kk) {
        byte b5 = bArr[i3];
        int i6 = i3 + 1;
        int i7 = i & 127;
        if (b5 >= 0) {
            kk.f9479a = i7 | (b5 << 7);
            return i6;
        }
        int i8 = i7 | ((b5 & 127) << 7);
        int i9 = i3 + 2;
        byte b6 = bArr[i6];
        if (b6 >= 0) {
            kk.f9479a = i8 | (b6 << 14);
            return i9;
        }
        int i10 = i8 | ((b6 & 127) << 14);
        int i11 = i3 + 3;
        byte b7 = bArr[i9];
        if (b7 >= 0) {
            kk.f9479a = i10 | (b7 << 21);
            return i11;
        }
        int i12 = i10 | ((b7 & 127) << 21);
        int i13 = i3 + 4;
        byte b8 = bArr[i11];
        if (b8 >= 0) {
            kk.f9479a = i12 | (b8 << 28);
            return i13;
        }
        int i14 = i12 | ((b8 & 127) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                kk.f9479a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int o(long j6) {
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j6 < -2147483648L ? LinearLayoutManager.INVALID_OFFSET : (int) j6;
    }

    public static ECParameterSpec s(UJ uj) throws NoSuchAlgorithmException {
        int iOrdinal = uj.ordinal();
        if (iOrdinal == 0) {
            return BF.f7322a;
        }
        if (iOrdinal == 1) {
            return BF.f7323b;
        }
        if (iOrdinal == 2) {
            return BF.f7324c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(uj.toString()));
    }

    public static void t(Context context, boolean z6) {
        if (z6) {
            u2.k.g("This request is sent from a test device.");
            return;
        }
        u2.f fVar = q2.r.f23260g.f23261a;
        String strC = u2.f.c(context);
        StringBuilder sb = new StringBuilder(String.valueOf(strC).length() + 102);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(strC);
        sb.append("\")) to get test ads on this device.");
        u2.k.g(sb.toString());
    }

    public static void u(EnumC0932bK enumC0932bK) throws GeneralSecurityException {
        int iOrdinal = enumC0932bK.ordinal();
        if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(enumC0932bK.name())));
        }
    }

    public static void v(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static boolean w(double d6) {
        return Math.getExponent(d6) <= 1023;
    }

    public static boolean x(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static int y(byte[] bArr, int i, KK kk) {
        long j6 = bArr[i];
        int i3 = i + 1;
        if (j6 >= 0) {
            kk.f9480b = j6;
            return i3;
        }
        int i6 = i + 2;
        byte b5 = bArr[i3];
        long j7 = (j6 & 127) | ((b5 & 127) << 7);
        int i7 = 7;
        while (b5 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j7 |= (r10 & 127) << i7;
            b5 = bArr[i6];
            i6 = i8;
        }
        kk.f9480b = j7;
        return i6;
    }

    public static void z(int i) throws GeneralSecurityException {
        if (i < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i)));
        }
        if (AbstractC2061wF.a() && i != 2048 && i != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i)));
        }
    }

    public abstract AbstractC1089eE g();

    public abstract Object h(C2041vw c2041vw, RF rf, Class cls);

    public abstract void k(AbstractC1466lD abstractC1466lD, Set set);

    public abstract int p(AbstractC1466lD abstractC1466lD);

    public abstract Integer q();

    public abstract Object r();

    public String toString() {
        switch (this.f7678a) {
            case 7:
                return r().toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ Cr(boolean z6) {
        this.f7678a = 5;
    }
}
