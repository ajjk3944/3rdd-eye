package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Log;
import f4.InterfaceFutureC2326a;
import j2.C2552h;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.lN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476lN implements TG {

    /* renamed from: c, reason: collision with root package name */
    public static int f15381c = 2;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15382a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15383b;

    public C1476lN(String str, int i) {
        this.f15382a = i;
        switch (i) {
            case 1:
                this.f15383b = Logger.getLogger(str);
                break;
            default:
                this.f15383b = str;
                break;
        }
    }

    public static long A(long j6, long j7) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j7) + Long.numberOfLeadingZeros(j7) + Long.numberOfLeadingZeros(~j6) + Long.numberOfLeadingZeros(j6);
        if (iNumberOfLeadingZeros > 65) {
            return j6 * j7;
        }
        long j8 = j6 ^ j7;
        long j9 = (j8 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j7 == Long.MIN_VALUE) & (j6 < 0)))) {
            long j10 = j6 * j7;
            if (j6 == 0 || j10 / j6 == j7) {
                return j10;
            }
        }
        return j9;
    }

    public static void B(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        throw new NumberFormatException(AbstractC1135f5.n(new StringBuilder(String.valueOf(strSubstring).length() + 28), "Number string too large: ", strSubstring, "..."));
    }

    public static final void C(byte[] bArr, String str, Cw cw) {
        if (cw == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        cw.d(4007, sb.toString());
    }

    public static Executor D(final Executor executor, final AbstractC2167yD abstractC2167yD) {
        executor.getClass();
        return executor == EnumC2059wD.f17407a ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.LD
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e6) {
                    abstractC2167yD.e(e6);
                }
            }
        };
    }

    public static void E(List list, RA ra, int i, int i3) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i3) {
                break;
            } else if (ra.b(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i3--;
            if (i3 < i) {
                return;
            } else {
                list.remove(i3);
            }
        }
    }

    public static boolean F(Set set, Object obj) {
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

    public static boolean G(AbstractC1788rC abstractC1788rC, Collection collection) {
        collection.getClass();
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= abstractC1788rC.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= abstractC1788rC.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = abstractC1788rC.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static int H(C0960bu c0960bu) {
        int iE = I5.b.E(c0960bu) - 1;
        return (iE == 0 || iE == 1) ? 7 : 23;
    }

    public static void I(InterfaceFutureC2326a interfaceFutureC2326a, Xu xu, Su su, boolean z6) {
        if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
            AbstractC2221zD abstractC2221zDR = AbstractC2221zD.r(interfaceFutureC2326a);
            A1.w wVar = new A1.w(xu, su, z6);
            abstractC2221zDR.a(new CD(abstractC2221zDR, 0, wVar), AbstractC0640Nf.f10011g);
        }
    }

    public static byte a(long j6) {
        AbstractC0582Jp.W("out of range: %s", j6, (j6 >> 8) == 0);
        return (byte) j6;
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static long c(long j6, long j7, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j8 = j6 / j7;
        long j9 = j6 - (j7 * j8);
        if (j9 == 0) {
            return j8;
        }
        int i = ((int) ((j6 ^ j7) >> 63)) | 1;
        switch (JC.f9266a[roundingMode.ordinal()]) {
            case 1:
                AbstractC0582Jp.z(false);
                return j8;
            case 2:
                return j8;
            case 3:
                if (i >= 0) {
                    return j8;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j8;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j9);
                long jAbs2 = jAbs - (Math.abs(j7) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j8) == 0)) {
                        return j8;
                    }
                } else if (jAbs2 <= 0) {
                    return j8;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j8 + i;
    }

    public static C1627oC d(Set set, RB rb) {
        AbstractC0582Jp.j0(set, "set1");
        AbstractC0582Jp.j0(rb, "set2");
        return new C1627oC(set, rb);
    }

    public static BigDecimal e(String str) {
        B(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static q2.d1 f(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rt rt = (Rt) it.next();
            if (rt.f11077c) {
                arrayList.add(C2552h.f21338j);
            } else {
                arrayList.add(new C2552h(rt.f11075a, rt.f11076b));
            }
        }
        return new q2.d1(context, (C2552h[]) arrayList.toArray(new C2552h[arrayList.size()]));
    }

    public static void g(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        throw new NullPointerException(AbstractC1135f5.n(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
    }

    public static boolean i(EnumC1945u7 enumC1945u7) {
        int iOrdinal = enumC1945u7.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static boolean k(String str) {
        return str == null || str.isEmpty();
    }

    public static byte[] l(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static byte[] m(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 16) {
            int i3 = i + 1;
            byte b5 = bArr[i];
            byte b6 = (byte) ((b5 + b5) & 254);
            bArr2[i] = b6;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i3] >> 7) & 1) | b6);
            }
            i = i3;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static int n(boolean z6) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            C1855sP c1855sP = new C1855sP();
            c1855sP.e("video/avc");
            TP tp = new TP(c1855sP);
            if (tp.f11397m != null) {
                C1197gC c1197gCB = WP.b(EO.f7955h, tp, z6, false);
                for (int i = 0; i < c1197gCB.f14229d; i++) {
                    if (((LP) c1197gCB.get(i)).f9693d != null && (videoCapabilities = ((LP) c1197gCB.get(i)).f9693d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        AbstractC1370jP.l();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointF = AbstractC1370jP.f();
                        for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                            if (AbstractC1370jP.h(supportedPerformancePoints.get(i3)).covers(performancePointF)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (RP unused) {
        }
        return 0;
    }

    public static long o(long j6, long j7) {
        AbstractC0582Jp.j(j6, "a");
        AbstractC0582Jp.j(j7, "b");
        if (j6 == 0) {
            return j7;
        }
        if (j7 == 0) {
            return j6;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
        long jNumberOfTrailingZeros = j6 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j7);
        long j8 = j7 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j8) {
            long j9 = jNumberOfTrailingZeros - j8;
            long j10 = (j9 >> 63) & j9;
            long j11 = (j9 - j10) - j10;
            jNumberOfTrailingZeros = j11 >> Long.numberOfTrailingZeros(j11);
            j8 += j10;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.EnumC1945u7 p(android.content.Context r14, com.google.android.gms.internal.ads.Cw r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1476lN.p(android.content.Context, com.google.android.gms.internal.ads.Cw):com.google.android.gms.internal.ads.u7");
    }

    public static C1681pC q(Set set, RA ra) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C1681pC)) {
                set.getClass();
                return new C1681pC(set, ra);
            }
            C1681pC c1681pC = (C1681pC) set;
            RA ra2 = c1681pC.f16148b;
            ra2.getClass();
            return new C1681pC(c1681pC.f16147a, new SA(Arrays.asList(ra2, ra)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof C1681pC)) {
            set2.getClass();
            return new C1735qC(set2, ra);
        }
        C1681pC c1681pC2 = (C1681pC) set2;
        RA ra3 = c1681pC2.f16148b;
        ra3.getClass();
        return new C1735qC((SortedSet) c1681pC2.f16147a, new SA(Arrays.asList(ra3, ra)));
    }

    public static AbstractC1089eE r(byte[] bArr) throws GeneralSecurityException {
        try {
            XK xk = XK.f12412a;
            int i = JK.f9277a;
            C0984cI c0984cID = C0984cI.D(bArr, XK.f12413b);
            ZF zf = ZF.f12810b;
            C1313iK c1313iKB = AbstractC2062wG.b(c0984cID.A());
            C1685pG c1685pG = new C1685pG(c0984cID, c1313iKB);
            C2008vG c2008vG = (C2008vG) zf.f12811a.get();
            c2008vG.getClass();
            return !c2008vG.f17252d.containsKey(new C1900tG(C1685pG.class, c1313iKB)) ? new QF(c1685pG) : zf.g(c1685pG);
        } catch (IOException e6) {
            throw new GeneralSecurityException("Failed to parse proto", e6);
        }
    }

    public static TG s(RG rg) throws GeneralSecurityException {
        C1448kw c1448kw = rg.f10879d;
        UG ug = new UG(((C1313iK) c1448kw.f15314b).b());
        try {
            Provider providerD = AbstractC1114el.d();
            if (providerD == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerD);
            return new Vu(ug, new C1879sw(((C1313iK) c1448kw.f15314b).b(), providerD));
        } catch (GeneralSecurityException unused) {
            return ug;
        }
    }

    public static C1476lN t(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new C1476lN(cls.getSimpleName(), 0) : new C1476lN(cls.getSimpleName(), 1);
    }

    public static Object u(C1627oC c1627oC, String str) {
        UB ub = new UB(c1627oC, c1627oC.f15915a, c1627oC.f15916b);
        return ub.hasNext() ? ub.next() : str;
    }

    public static void v(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final void w(QK qk, ArrayDeque arrayDeque) {
        if (!qk.p()) {
            if (!(qk instanceof IL)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(qk.getClass())));
            }
            IL il = (IL) qk;
            w(il.f9089d, arrayDeque);
            w(il.f9090e, arrayDeque);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(IL.f9087h, qk.f());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iV = IL.v(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((QK) arrayDeque.peek()).f() >= iV) {
            arrayDeque.push(qk);
            return;
        }
        int iV2 = IL.v(iBinarySearch);
        QK il2 = (QK) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((QK) arrayDeque.peek()).f() < iV2) {
            il2 = new IL((QK) arrayDeque.pop(), il2);
        }
        IL il3 = new IL(il2, qk);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(IL.f9087h, il3.f9088c);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((QK) arrayDeque.peek()).f() >= IL.v(iBinarySearch2 + 1)) {
                break;
            } else {
                il3 = new IL((QK) arrayDeque.pop(), il3);
            }
        }
        arrayDeque.push(il3);
    }

    public static void x(InterfaceFutureC2326a interfaceFutureC2326a, Su su) {
        if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
            AbstractC2221zD abstractC2221zDR = AbstractC2221zD.r(interfaceFutureC2326a);
            C2255zu c2255zu = new C2255zu(1, su);
            abstractC2221zDR.a(new CD(abstractC2221zDR, 0, c2255zu), AbstractC0640Nf.f10011g);
        }
    }

    public static byte[] y(BigInteger bigInteger, int i) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i3 = i + 1;
        if (length > i3) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length == i3) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, 0, bArr, i - length, length);
        return bArr;
    }

    public static int z(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public final void h(String str) {
        switch (this.f15382a) {
            case 0:
                String str2 = (String) this.f15383b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
                sb.append(str2);
                sb.append(":");
                sb.append(str);
                Log.d("isoparser", sb.toString());
                break;
            default:
                ((Logger) this.f15383b).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                break;
        }
    }
}
