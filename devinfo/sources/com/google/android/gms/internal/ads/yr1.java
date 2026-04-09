package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Log;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yr1 implements hf1 {

    /* renamed from: c, reason: collision with root package name */
    public static int f18841c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f18842d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18843a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18844b;

    public yr1(String str, int i4) {
        this.f18843a = i4;
        switch (i4) {
            case 1:
                this.f18844b = Logger.getLogger(str);
                break;
            default:
                this.f18844b = str;
                break;
        }
    }

    public static void A(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        throw new NumberFormatException(r5.c.m(new StringBuilder(String.valueOf(strSubstring).length() + 28), "Number string too large: ", strSubstring, "..."));
    }

    public static final void B(byte[] bArr, String str, gv0 gv0Var) {
        if (gv0Var == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("os.arch:");
        sb2.append(System.getProperty("os.arch"));
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            sb2.append("dbg:");
            sb2.append(str);
            sb2.append(";");
        }
        gv0Var.d(4007, sb2.toString());
    }

    public static Executor C(final Executor executor, final m81 m81Var) {
        executor.getClass();
        return executor == k81.f13081a ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.z81
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e2) {
                    m81Var.f(e2);
                }
            }
        };
    }

    public static void D(List list, d31 d31Var, int i4, int i10) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i10) {
                break;
            } else if (d31Var.c(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i10--;
            if (i10 < i4) {
                return;
            } else {
                list.remove(i10);
            }
        }
    }

    public static boolean E(Set set, Object obj) {
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

    public static boolean F(f61 f61Var, Collection collection) {
        collection.getClass();
        if (collection instanceof q51) {
            collection = ((q51) collection).b();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= f61Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= f61Var.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = f61Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static int G(hq0 hq0Var) {
        int iD = u6.t.D(hq0Var) - 1;
        return (iD == 0 || iD == 1) ? 7 : 23;
    }

    public static void H(vd.b bVar, bs0 bs0Var, yr0 yr0Var, boolean z3) {
        if (((Boolean) ol.f14724c.u()).booleanValue()) {
            n81 n81VarS = n81.s(bVar);
            com.google.android.gms.internal.measurement.i4 i4Var = new com.google.android.gms.internal.measurement.i4(bs0Var, yr0Var, z3);
            n81VarS.a(new q81(0, n81VarS, i4Var), fx.g);
        }
    }

    public static byte a(long j) {
        mq0.U("out of range: %s", j, (j >> 8) == 0);
        return (byte) j;
    }

    public static int b(int i4) {
        switch (i4) {
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

    public static long c(long j, long j8, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j9 = j / j8;
        long j10 = j - (j8 * j9);
        if (j10 == 0) {
            return j9;
        }
        int i4 = ((int) ((j ^ j8) >> 63)) | 1;
        switch (x61.f18314a[roundingMode.ordinal()]) {
            case 1:
                mq0.z(false);
                return j9;
            case 2:
                return j9;
            case 3:
                if (i4 >= 0) {
                    return j9;
                }
                break;
            case 4:
                break;
            case 5:
                if (i4 <= 0) {
                    return j9;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j10);
                long jAbs2 = jAbs - (Math.abs(j8) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j9) == 0)) {
                        return j9;
                    }
                } else if (jAbs2 <= 0) {
                    return j9;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j9 + i4;
    }

    public static c61 d(Set set, e51 e51Var) {
        mq0.e0(set, "set1");
        mq0.e0(e51Var, "set2");
        return new c61(set, e51Var);
    }

    public static BigDecimal e(String str) {
        A(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static va.c3 f(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xp0 xp0Var = (xp0) it.next();
            if (xp0Var.f18442c) {
                arrayList.add(pa.h.f31528k);
            } else {
                arrayList.add(new pa.h(xp0Var.f18440a, xp0Var.f18441b));
            }
        }
        return new va.c3(context, (pa.h[]) arrayList.toArray(new pa.h[arrayList.size()]));
    }

    public static void h(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        throw new NullPointerException(r5.c.m(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
    }

    public static boolean j(fg fgVar) {
        int iOrdinal = fgVar.ordinal();
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
        int i4 = 0;
        while (i4 < 16) {
            int i10 = i4 + 1;
            byte b10 = bArr[i4];
            byte b11 = (byte) ((b10 + b10) & 254);
            bArr2[i4] = b11;
            if (i4 < 15) {
                bArr2[i4] = (byte) (((bArr[i10] >> 7) & 1) | b11);
            }
            i4 = i10;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static long n(long j, long j8) {
        mq0.j(j, "a");
        mq0.j(j8, "b");
        if (j == 0) {
            return j8;
        }
        if (j8 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j8);
        long j9 = j8 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j9) {
            long j10 = jNumberOfTrailingZeros - j9;
            long j11 = (j10 >> 63) & j10;
            long j12 = (j10 - j11) - j11;
            jNumberOfTrailingZeros = j12 >> Long.numberOfTrailingZeros(j12);
            j9 += j11;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.fg o(android.content.Context r14, com.google.android.gms.internal.ads.gv0 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yr1.o(android.content.Context, com.google.android.gms.internal.ads.gv0):com.google.android.gms.internal.ads.fg");
    }

    public static d61 p(Set set, d31 d31Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof d61)) {
                return new e61(set2, d31Var);
            }
            d61 d61Var = (d61) set2;
            d31 d31Var2 = d61Var.f10346b;
            d31Var2.getClass();
            return new e61((SortedSet) d61Var.f10345a, new e31(Arrays.asList(d31Var2, d31Var)));
        }
        if (!(set instanceof d61)) {
            set.getClass();
            return new d61(set, d31Var);
        }
        d61 d61Var2 = (d61) set;
        d31 d31Var3 = d61Var2.f10346b;
        d31Var3.getClass();
        return new d61(d61Var2.f10345a, new e31(Arrays.asList(d31Var3, d31Var)));
    }

    public static s91 q(byte[] bArr) throws GeneralSecurityException {
        try {
            jn1 jn1Var = jn1.f12801a;
            int i4 = um1.f17262a;
            qh1 qh1VarD = qh1.D(bArr, jn1.f12802b);
            md1 md1Var = md1.f13875b;
            vl1 vl1VarB = je1.b(qh1VarD.A());
            ce1 ce1Var = new ce1(0, qh1VarD, vl1VarB);
            ie1 ie1Var = (ie1) md1Var.f13876a.get();
            ie1Var.getClass();
            return !ie1Var.f12319d.containsKey(new ge1(ce1.class, vl1VarB)) ? new dd1(ce1Var) : md1Var.g(ce1Var);
        } catch (IOException e2) {
            throw new GeneralSecurityException("Failed to parse proto", e2);
        }
    }

    public static hf1 r(ff1 ff1Var) throws GeneralSecurityException {
        kh0 kh0Var = ff1Var.f11152d;
        if1 if1Var = new if1(((vl1) kh0Var.f13160b).b());
        try {
            Provider providerC = a80.c();
            if (providerC == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerC);
            return new rt(28, if1Var, new rt(((vl1) kh0Var.f13160b).b(), providerC));
        } catch (GeneralSecurityException unused) {
            return if1Var;
        }
    }

    public static yr1 s(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new yr1(cls.getSimpleName(), 0) : new yr1(cls.getSimpleName(), 1);
    }

    public static Object t(c61 c61Var, String str) {
        h51 h51Var = new h51(c61Var, c61Var.f10006a, c61Var.f10007b);
        return h51Var.hasNext() ? h51Var.next() : str;
    }

    public static void u(int i4, String str) {
        if (i4 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 29 + String.valueOf(i4).length());
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i4);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static final void v(bn1 bn1Var, ArrayDeque arrayDeque) {
        if (!bn1Var.t()) {
            if (!(bn1Var instanceof wo1)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(bn1Var.getClass())));
            }
            wo1 wo1Var = (wo1) bn1Var;
            v(wo1Var.f18069d, arrayDeque);
            v(wo1Var.f18070e, arrayDeque);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(wo1.f18067h, bn1Var.i());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iZ = wo1.z(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((bn1) arrayDeque.peek()).i() >= iZ) {
            arrayDeque.push(bn1Var);
            return;
        }
        int iZ2 = wo1.z(iBinarySearch);
        bn1 wo1Var2 = (bn1) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((bn1) arrayDeque.peek()).i() < iZ2) {
            wo1Var2 = new wo1((bn1) arrayDeque.pop(), wo1Var2);
        }
        wo1 wo1Var3 = new wo1(wo1Var2, bn1Var);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(wo1.f18067h, wo1Var3.f18068c);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((bn1) arrayDeque.peek()).i() >= wo1.z(iBinarySearch2 + 1)) {
                break;
            } else {
                wo1Var3 = new wo1((bn1) arrayDeque.pop(), wo1Var3);
            }
        }
        arrayDeque.push(wo1Var3);
    }

    public static void w(vd.b bVar, yr0 yr0Var) {
        if (((Boolean) ol.f14724c.u()).booleanValue()) {
            n81 n81VarS = n81.s(bVar);
            kh0 kh0Var = new kh0(8, yr0Var);
            n81VarS.a(new q81(0, n81VarS, kh0Var), fx.g);
        }
    }

    public static byte[] x(BigInteger bigInteger, int i4) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i4) {
            return byteArray;
        }
        int i10 = i4 + 1;
        if (length > i10) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length == i10) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i4];
        System.arraycopy(byteArray, 0, bArr, i4 - length, length);
        return bArr;
    }

    public static int y(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static long z(long j, long j8) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j8;
        }
        long j9 = j ^ j8;
        long j10 = (j9 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j8 == Long.MIN_VALUE) & (j < 0)))) {
            long j11 = j * j8;
            if (j == 0 || j11 / j == j8) {
                return j11;
            }
        }
        return j10;
    }

    public final void i(String str) {
        switch (this.f18843a) {
            case 0:
                String str2 = (String) this.f18844b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
                sb2.append(str2);
                sb2.append(":");
                sb2.append(str);
                Log.d("isoparser", sb2.toString());
                break;
            default:
                ((Logger) this.f18844b).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                break;
        }
    }
}
