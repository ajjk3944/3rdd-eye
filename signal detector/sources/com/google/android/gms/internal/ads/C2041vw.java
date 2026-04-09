package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import j$.util.function.IntConsumer$CC;
import java.io.EOFException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECPoint;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.IntConsumer;

/* renamed from: com.google.android.gms.internal.ads.vw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2041vw implements InterfaceC1292i, InterfaceC1048dR {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17368a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17369b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17370c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17371d;

    public /* synthetic */ C2041vw(int i, boolean z6) {
        this.f17368a = i;
        this.f17369b = null;
        this.f17370c = null;
        this.f17371d = null;
    }

    public static C1631oG B(C1203gI c1203gI) {
        return C1631oG.a(c1203gI.B().A(), c1203gI.B().B(), c1203gI.B().C(), c1203gI.D(), c1203gI.D() == EnumC1956uI.RAW ? null : Integer.valueOf(c1203gI.C()));
    }

    public static boolean C(int i) {
        int i3 = i - 2;
        return i3 == 1 || i3 == 2 || i3 == 3;
    }

    public static final C2041vw b(C1257hI c1257hI) throws GeneralSecurityException {
        Cr pf;
        boolean z6;
        if (c1257hI == null || c1257hI.C() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(c1257hI.C());
        for (C1203gI c1203gI : c1257hI.B()) {
            int iC = c1203gI.C();
            try {
                C1631oG c1631oGB = B(c1203gI);
                ZF zf = ZF.f12810b;
                C2008vG c2008vG = (C2008vG) zf.f12811a.get();
                c2008vG.getClass();
                pf = !c2008vG.f17250b.containsKey(new C1900tG(C1631oG.class, c1631oGB.f15923b)) ? new PF(c1631oGB) : zf.e(c1631oGB);
                z6 = false;
            } catch (GeneralSecurityException e6) {
                if (AbstractC2007vF.f17248a.f11420a.get()) {
                    throw e6;
                }
                pf = new PF(B(c1203gI));
                z6 = true;
            }
            if (AbstractC2007vF.f17248a.f11420a.get() && !C(c1203gI.I())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z7 = true;
            int I6 = c1203gI.I();
            if (iC != c1257hI.A()) {
                z7 = false;
            }
            arrayList.add(new C0926bE(pf, I6, iC, z7, z6, C1285ht.f14611j));
        }
        return new C2041vw(Collections.unmodifiableList(arrayList), RF.f10876b);
    }

    public static void e(C1879sw c1879sw, C2041vw c2041vw) {
        C2041vw c2041vw2 = (C2041vw) c1879sw.f16823b;
        long[] jArr = (long[]) c2041vw.f17369b;
        long[] jArr2 = (long[]) c2041vw2.f17369b;
        long[] jArr3 = (long[]) c1879sw.f16824c;
        AbstractC2022vd.G(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) c2041vw.f17370c;
        long[] jArr5 = (long[]) c2041vw2.f17370c;
        long[] jArr6 = (long[]) c2041vw2.f17371d;
        AbstractC2022vd.G(jArr4, jArr5, jArr6);
        AbstractC2022vd.G((long[]) c2041vw.f17371d, jArr6, jArr3);
    }

    public static final C2041vw z(AbstractC1089eE abstractC1089eE) throws GeneralSecurityException {
        int i;
        int i3;
        A1.w wVar = new A1.w(10);
        ArrayList arrayList = (ArrayList) wVar.f141d;
        ZD zd = new ZD(abstractC1089eE);
        C1994v2 c1994v2 = C1994v2.f17211h;
        zd.f12805c = c1994v2;
        zd.f12803a = true;
        int size = arrayList.size();
        int i6 = 0;
        byte b5 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((ZD) obj).f12803a = false;
        }
        arrayList.add(zd);
        if (wVar.f140c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        wVar.f140c = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i8 = 0;
        while (i8 < arrayList.size() - 1) {
            int i9 = i8 + 1;
            if (((ZD) arrayList.get(i8)).f12805c == c1994v2 && ((ZD) arrayList.get(i9)).f12805c != c1994v2) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i8 = i9;
        }
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        int i10 = 0;
        Integer num = null;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ZD zd2 = (ZD) obj2;
            zd2.getClass();
            AbstractC1089eE abstractC1089eE2 = zd2.f12804b;
            C1994v2 c1994v22 = zd2.f12805c;
            if (c1994v22 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (c1994v22 == c1994v2) {
                int i11 = 0;
                while (true) {
                    if (i11 != 0 && !hashSet.contains(Integer.valueOf(i11))) {
                        break;
                    }
                    int i12 = AbstractC2062wG.f17417a;
                    i11 = 0;
                    while (i11 == 0) {
                        byte[] bArrA = AbstractC1739qG.a(4);
                        i11 = ((bArrA[2] & 255) << 8) | ((bArrA[0] & 255) << 24) | ((bArrA[1] & 255) << 16) | (bArrA[3] & 255);
                    }
                }
                i = i11;
            } else {
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                int i13 = i;
                throw new GeneralSecurityException(A.f.n(new StringBuilder(String.valueOf(i13).length() + 31), "Id ", i13, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            Cr crB = SF.f11162b.b(abstractC1089eE2, true != abstractC1089eE2.a() ? null : numValueOf);
            Object obj3 = YD.f12606c;
            if (obj3.equals(obj3)) {
                i3 = 3;
            } else if (YD.f12607d.equals(obj3)) {
                i3 = 4;
            } else {
                if (!YD.f12608e.equals(obj3)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i3 = 5;
            }
            boolean z6 = zd2.f12803a;
            C0926bE c0926bE = new C0926bE(crB, i3, i, z6, false, C1285ht.f14611j);
            if (z6) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
            arrayList2.add(c0926bE);
        }
        int i14 = 2;
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        RF rf = (RF) wVar.f139b;
        C2041vw c2041vw = new C2041vw(arrayList2, rf);
        if (rf.f10877a.isEmpty()) {
            return c2041vw;
        }
        C1285ht c1285ht = new C1285ht(15, b5 == true ? 1 : 0);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        while (i6 < size3) {
            Object obj4 = arrayList2.get(i6);
            i6++;
            C0926bE c0926bE2 = (C0926bE) obj4;
            arrayList3.add(new C0926bE(c0926bE2.f13329a, c0926bE2.f13335g, c0926bE2.f13331c, c0926bE2.f13332d, c0926bE2.f13333e, c1285ht));
        }
        return new C2041vw(arrayList3, rf, c2041vw, i14);
    }

    public Object A(Cr cr, Class cls) throws GeneralSecurityException {
        List list = (List) this.f17369b;
        C2041vw c2041vw = (C2041vw) this.f17371d;
        if (cr == null) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        C1257hI c1257hIG = (c2041vw == null ? this : c2041vw).g();
        int i = AbstractC1253hE.f14465a;
        int iA = c1257hIG.A();
        boolean z6 = true;
        int i3 = 0;
        boolean z7 = false;
        for (C1203gI c1203gI : c1257hIG.B()) {
            if (c1203gI.I() == 3) {
                if (!c1203gI.A()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c1203gI.C())));
                }
                if (c1203gI.D() == EnumC1956uI.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c1203gI.C())));
                }
                if (c1203gI.I() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c1203gI.C())));
                }
                if (c1203gI.C() == iA) {
                    if (z7) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z7 = true;
                }
                z6 &= c1203gI.B().C() == 4;
                i3++;
            }
        }
        if (i3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z7 && !z6) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (((C0926bE) list.get(i6)).f13333e || !C(((C0926bE) list.get(i6)).f13335g)) {
                String strA = c1257hIG.D(i6).B().A();
                StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + String.valueOf(i6).length() + 44 + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i6);
                sb.append(" and type_url ");
                sb.append(strA);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        if (c2041vw == null) {
            c2041vw = this;
        }
        return cr.h(c2041vw, (RF) this.f17370c, cls);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1292i
    public synchronized C1238h a() {
        C1238h c1238hA;
        FN fn = (FN) this.f17371d;
        C1506m c1506m = fn.f8100c;
        HashMap map = (HashMap) this.f17369b;
        c1238hA = c1506m.a();
        MO mo = (MO) this.f17370c;
        map.put(c1238hA, mo);
        EN en = (EN) fn.f8110n.get(mo);
        if (en != null) {
            en.a();
        }
        return c1238hA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1048dR
    public C1197gC c(int i, C2108x8 c2108x8, int[] iArr) {
        JB jb = LB.f9635b;
        C1476lN.v(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = 0;
        int i6 = 0;
        while (i3 < c2108x8.f17546a) {
            int i7 = i;
            C2108x8 c2108x82 = c2108x8;
            C0993cR c0993cR = new C0993cR(i7, c2108x82, i3, (C0884aR) this.f17369b, iArr[i3], (String) this.f17370c, (String) this.f17371d);
            int length = objArrCopyOf.length;
            int i8 = i6 + 1;
            int iD = GB.d(length, i8);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i6] = c0993cR;
            i3++;
            i6 = i8;
            i = i7;
            c2108x8 = c2108x82;
        }
        return LB.o(i6, objArrCopyOf);
    }

    public void d(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f17369b = Integer.valueOf(i);
    }

    public void f(XD xd, Uri uri, Map map, long j6, long j7, HQ hq) throws TQ {
        C1776r0 c1776r0 = new C1776r0(xd, j6, j7);
        this.f17371d = c1776r0;
        if (((InterfaceC1992v0) this.f17370c) != null) {
            return;
        }
        InterfaceC1992v0[] interfaceC1992v0ArrC = ((InterfaceC2208z0) this.f17369b).c(uri, map);
        int length = interfaceC1992v0ArrC.length;
        JB jb = LB.f9635b;
        C1476lN.v(length, "expectedSize");
        IB ib = new IB(length);
        boolean z6 = true;
        if (length == 1) {
            this.f17370c = interfaceC1992v0ArrC[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                InterfaceC1992v0 interfaceC1992v0 = interfaceC1992v0ArrC[i];
                try {
                } catch (EOFException unused) {
                    if (((InterfaceC1992v0) this.f17370c) != null || c1776r0.f16445d == j6) {
                    }
                } catch (Throwable th) {
                    if (((InterfaceC1992v0) this.f17370c) == null && c1776r0.f16445d != j6) {
                        z6 = false;
                    }
                    AbstractC0582Jp.h0(z6);
                    c1776r0.f16447f = 0;
                    throw th;
                }
                if (interfaceC1992v0.b(c1776r0)) {
                    this.f17370c = interfaceC1992v0;
                    c1776r0.f16447f = 0;
                    break;
                } else {
                    ib.b(interfaceC1992v0.c());
                    boolean z7 = ((InterfaceC1992v0) this.f17370c) != null || c1776r0.f16445d == j6;
                    AbstractC0582Jp.h0(z7);
                    c1776r0.f16447f = 0;
                    i++;
                }
            }
            if (((InterfaceC1992v0) this.f17370c) == null) {
                Iterator it = AbstractC0582Jp.G(LB.n(interfaceC1992v0ArrC), Oz.f10290e).iterator();
                StringBuilder sb = new StringBuilder();
                AbstractC1984ut.y(sb, it, ", ");
                String string = sb.toString();
                throw new TQ(AbstractC1135f5.n(new StringBuilder(string.length() + 58), "None of the available extractors (", string, ") could read the stream."), ib.f());
            }
        }
        ((InterfaceC1992v0) this.f17370c).e(hq);
    }

    public C1257hI g() throws GeneralSecurityException {
        try {
            C1093eI c1093eIG = C1257hI.G();
            for (C0926bE c0926bE : (List) this.f17369b) {
                Cr crA = c0926bE.a();
                int i = c0926bE.f13331c;
                int i3 = c0926bE.f13335g;
                C1631oG c1631oG = (C1631oG) ZF.f12810b.f(crA);
                Integer numQ = crA.q();
                if (numQ != null && numQ.intValue() != i) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                C1148fI c1148fIE = C1203gI.E();
                ZH zhD = C0875aI.D();
                String str = c1631oG.f15922a;
                zhD.b();
                ((C0875aI) zhD.f13551b).F(str);
                QK qk = c1631oG.f15924c;
                zhD.b();
                ((C0875aI) zhD.f13551b).G(qk);
                int i6 = c1631oG.f15925d;
                zhD.b();
                ((C0875aI) zhD.f13551b).H(i6);
                c1148fIE.b();
                ((C1203gI) c1148fIE.f13551b).F((C0875aI) zhD.d());
                c1148fIE.b();
                ((C1203gI) c1148fIE.f13551b).J(i3);
                c1148fIE.b();
                ((C1203gI) c1148fIE.f13551b).G(i);
                EnumC1956uI enumC1956uI = c1631oG.f15926e;
                c1148fIE.b();
                ((C1203gI) c1148fIE.f13551b).H(enumC1956uI);
                C1203gI c1203gI = (C1203gI) c1148fIE.d();
                c1093eIG.b();
                ((C1257hI) c1093eIG.f13551b).I(c1203gI);
                if (c0926bE.f13332d) {
                    c1093eIG.b();
                    ((C1257hI) c1093eIG.f13551b).H(i);
                }
            }
            return (C1257hI) c1093eIG.d();
        } catch (GeneralSecurityException e6) {
            throw new J0.c(e6);
        }
    }

    public void h(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(A.f.i(i, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i).length() + 40)));
        }
        this.f17370c = Integer.valueOf(i);
    }

    public byte[] i() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.f17371d;
        AbstractC2022vd.L(jArr4, jArr14);
        AbstractC2022vd.L(jArr13, jArr4);
        AbstractC2022vd.L(jArr12, jArr13);
        AbstractC2022vd.G(jArr5, jArr12, jArr14);
        AbstractC2022vd.G(jArr6, jArr5, jArr4);
        AbstractC2022vd.L(jArr12, jArr6);
        AbstractC2022vd.G(jArr7, jArr12, jArr5);
        AbstractC2022vd.L(jArr12, jArr7);
        AbstractC2022vd.L(jArr13, jArr12);
        AbstractC2022vd.L(jArr12, jArr13);
        AbstractC2022vd.L(jArr13, jArr12);
        AbstractC2022vd.L(jArr12, jArr13);
        AbstractC2022vd.G(jArr8, jArr12, jArr7);
        AbstractC2022vd.L(jArr12, jArr8);
        AbstractC2022vd.L(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            AbstractC2022vd.L(jArr12, jArr13);
            AbstractC2022vd.L(jArr13, jArr12);
        }
        AbstractC2022vd.G(jArr9, jArr13, jArr8);
        AbstractC2022vd.L(jArr12, jArr9);
        AbstractC2022vd.L(jArr13, jArr12);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            AbstractC2022vd.L(jArr12, jArr13);
            AbstractC2022vd.L(jArr13, jArr12);
        }
        AbstractC2022vd.G(jArr12, jArr13, jArr9);
        AbstractC2022vd.L(jArr13, jArr12);
        AbstractC2022vd.L(jArr12, jArr13);
        for (int i6 = 2; i6 < 10; i6 += 2) {
            AbstractC2022vd.L(jArr13, jArr12);
            AbstractC2022vd.L(jArr12, jArr13);
        }
        AbstractC2022vd.G(jArr10, jArr12, jArr8);
        AbstractC2022vd.L(jArr12, jArr10);
        AbstractC2022vd.L(jArr13, jArr12);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            AbstractC2022vd.L(jArr12, jArr13);
            AbstractC2022vd.L(jArr13, jArr12);
        }
        AbstractC2022vd.G(jArr11, jArr13, jArr10);
        AbstractC2022vd.L(jArr13, jArr11);
        AbstractC2022vd.L(jArr12, jArr13);
        for (int i8 = 2; i8 < 100; i8 += 2) {
            AbstractC2022vd.L(jArr13, jArr12);
            AbstractC2022vd.L(jArr12, jArr13);
        }
        AbstractC2022vd.G(jArr13, jArr12, jArr11);
        AbstractC2022vd.L(jArr12, jArr13);
        AbstractC2022vd.L(jArr13, jArr12);
        for (int i9 = 2; i9 < 50; i9 += 2) {
            AbstractC2022vd.L(jArr12, jArr13);
            AbstractC2022vd.L(jArr13, jArr12);
        }
        AbstractC2022vd.G(jArr12, jArr13, jArr10);
        AbstractC2022vd.L(jArr13, jArr12);
        AbstractC2022vd.L(jArr12, jArr13);
        AbstractC2022vd.L(jArr13, jArr12);
        AbstractC2022vd.L(jArr12, jArr13);
        AbstractC2022vd.L(jArr13, jArr12);
        AbstractC2022vd.G(jArr, jArr13, jArr6);
        AbstractC2022vd.G(jArr2, (long[]) this.f17369b, jArr);
        AbstractC2022vd.G(jArr3, (long[]) this.f17370c, jArr);
        byte[] bArrP = AbstractC2022vd.P(jArr3);
        bArrP[31] = (byte) (((AbstractC2022vd.P(jArr2)[0] & 1) << 7) ^ bArrP[31]);
        return bArrP;
    }

    public C0926bE j() {
        for (C0926bE c0926bE : (List) this.f17369b) {
            if (c0926bE != null && c0926bE.f13332d) {
                if (c0926bE.f13330b == YD.f12606c) {
                    return c0926bE;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public long k() {
        C1776r0 c1776r0 = (C1776r0) this.f17371d;
        if (c1776r0 != null) {
            return c1776r0.f16445d;
        }
        return -1L;
    }

    public C2114xE l() throws GeneralSecurityException {
        C1448kw c1448kw;
        C1313iK c1313iKB;
        BE be = (BE) this.f17369b;
        if (be == null || (c1448kw = (C1448kw) this.f17370c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (be.f7319a != ((C1313iK) c1448kw.f15314b).f14720a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (be.a() && ((Integer) this.f17371d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((BE) this.f17369b).a() && ((Integer) this.f17371d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        AE ae = ((BE) this.f17369b).f7321c;
        if (ae == AE.f6958e) {
            c1313iKB = AbstractC0873aG.f13089a;
        } else if (ae == AE.f6957d) {
            c1313iKB = AbstractC0873aG.a(((Integer) this.f17371d).intValue());
        } else {
            if (ae != AE.f6956c) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(((BE) this.f17369b).f7321c)));
            }
            c1313iKB = AbstractC0873aG.b(((Integer) this.f17371d).intValue());
        }
        return new C2114xE((BE) this.f17369b, (C1448kw) this.f17370c, c1313iKB, (Integer) this.f17371d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1292i
    public synchronized void m() {
        ((FN) this.f17371d).f8100c.m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1292i
    public synchronized void n(C1238h c1238h) {
        ((FN) this.f17371d).f8100c.n(c1238h);
        y(c1238h);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1292i
    public synchronized void o(C1187g2 c1187g2) {
        ((FN) this.f17371d).f8100c.o(c1187g2);
        while (c1187g2 != null) {
            C1238h c1238h = (C1238h) c1187g2.f14188c;
            c1238h.getClass();
            y(c1238h);
            c1187g2 = (C1187g2) c1187g2.f14189d;
            if (c1187g2 == null || ((C1238h) c1187g2.f14188c) == null) {
                c1187g2 = null;
            }
        }
    }

    public CE p() throws GeneralSecurityException {
        C1448kw c1448kw;
        C1313iK c1313iKB;
        EE ee = (EE) this.f17369b;
        if (ee == null || (c1448kw = (C1448kw) this.f17370c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ee.f7931a != ((C1313iK) c1448kw.f15314b).f14720a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ee.a() && ((Integer) this.f17371d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((EE) this.f17369b).a() && ((Integer) this.f17371d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        YD yd = ((EE) this.f17369b).f7932b;
        if (yd == YD.f12611h) {
            c1313iKB = AbstractC0873aG.f13089a;
        } else if (yd == YD.f12610g) {
            c1313iKB = AbstractC0873aG.a(((Integer) this.f17371d).intValue());
        } else {
            if (yd != YD.f12609f) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(((EE) this.f17369b).f7932b)));
            }
            c1313iKB = AbstractC0873aG.b(((Integer) this.f17371d).intValue());
        }
        return new CE((EE) this.f17369b, (C1448kw) this.f17370c, c1313iKB, (Integer) this.f17371d);
    }

    public FE q() throws GeneralSecurityException {
        C1448kw c1448kw;
        C1313iK c1313iKB;
        HE he = (HE) this.f17369b;
        if (he == null || (c1448kw = (C1448kw) this.f17370c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (he.f8878a != ((C1313iK) c1448kw.f15314b).f14720a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (he.a() && ((Integer) this.f17371d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((HE) this.f17369b).a() && ((Integer) this.f17371d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C1952uE c1952uE = ((HE) this.f17369b).f8879b;
        if (c1952uE == C1952uE.f17087j) {
            c1313iKB = AbstractC0873aG.f13089a;
        } else if (c1952uE == C1952uE.i) {
            c1313iKB = AbstractC0873aG.a(((Integer) this.f17371d).intValue());
        } else {
            if (c1952uE != C1952uE.f17086h) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(((HE) this.f17369b).f8879b)));
            }
            c1313iKB = AbstractC0873aG.b(((Integer) this.f17371d).intValue());
        }
        return new FE((HE) this.f17369b, (C1448kw) this.f17370c, c1313iKB, (Integer) this.f17371d);
    }

    public C2116xG r() throws GeneralSecurityException {
        C1448kw c1448kw;
        C1313iK c1313iKA;
        C2224zG c2224zG = (C2224zG) this.f17369b;
        if (c2224zG == null || (c1448kw = (C1448kw) this.f17370c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c2224zG.f17850a != ((C1313iK) c1448kw.f15314b).f14720a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c2224zG.a() && ((Integer) this.f17371d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C2224zG) this.f17369b).a() && ((Integer) this.f17371d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        YD yd = ((C2224zG) this.f17369b).f17852c;
        if (yd == YD.f12605F) {
            c1313iKA = AbstractC0873aG.f13089a;
        } else if (yd == YD.f12604E || yd == YD.f12603D) {
            c1313iKA = AbstractC0873aG.a(((Integer) this.f17371d).intValue());
        } else {
            if (yd != YD.f12602C) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((C2224zG) this.f17369b).f17852c)));
            }
            c1313iKA = AbstractC0873aG.b(((Integer) this.f17371d).intValue());
        }
        return new C2116xG((C2224zG) this.f17369b, (C1448kw) this.f17370c, c1313iKA, (Integer) this.f17371d);
    }

    public C2224zG s() throws GeneralSecurityException {
        Integer num = (Integer) this.f17369b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f17370c) != null) {
            return new C2224zG(num.intValue(), ((Integer) this.f17370c).intValue(), (YD) this.f17371d);
        }
        throw new GeneralSecurityException("tag size not set");
    }

    public DG t() throws GeneralSecurityException {
        C1448kw c1448kw;
        C1313iK c1313iKA;
        HG hg = (HG) this.f17369b;
        if (hg == null || (c1448kw = (C1448kw) this.f17370c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (hg.f8882a != ((C1313iK) c1448kw.f15314b).f14720a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (hg.a() && ((Integer) this.f17371d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((HG) this.f17369b).a() && ((Integer) this.f17371d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        GG gg = ((HG) this.f17369b).f8884c;
        if (gg == GG.f8346e) {
            c1313iKA = AbstractC0873aG.f13089a;
        } else if (gg == GG.f8345d || gg == GG.f8344c) {
            c1313iKA = AbstractC0873aG.a(((Integer) this.f17371d).intValue());
        } else {
            if (gg != GG.f8343b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((HG) this.f17369b).f8884c)));
            }
            c1313iKA = AbstractC0873aG.b(((Integer) this.f17371d).intValue());
        }
        return new DG((HG) this.f17369b, (C1448kw) this.f17370c, c1313iKA, (Integer) this.f17371d);
    }

    public String toString() throws GeneralSecurityException {
        switch (this.f17368a) {
            case 1:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f17369b);
                sb.append('{');
                C1879sw c1879sw = (C1879sw) ((C1879sw) this.f17370c).f16824c;
                String str = "";
                while (c1879sw != null) {
                    Object obj = c1879sw.f16823b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    c1879sw = (C1879sw) c1879sw.f16824c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 2:
                C1257hI c1257hIG = g();
                int i = AbstractC1253hE.f14465a;
                C1311iI c1311iIA = C1471lI.A();
                int iA = c1257hIG.A();
                c1311iIA.b();
                ((C1471lI) c1311iIA.f13551b).B(iA);
                for (C1203gI c1203gI : c1257hIG.B()) {
                    C1363jI c1363jIA = C1417kI.A();
                    String strA = c1203gI.B().A();
                    c1363jIA.b();
                    ((C1417kI) c1363jIA.f13551b).B(strA);
                    int I6 = c1203gI.I();
                    c1363jIA.b();
                    ((C1417kI) c1363jIA.f13551b).E(I6);
                    EnumC1956uI enumC1956uID = c1203gI.D();
                    c1363jIA.b();
                    ((C1417kI) c1363jIA.f13551b).D(enumC1956uID);
                    int iC = c1203gI.C();
                    c1363jIA.b();
                    ((C1417kI) c1363jIA.f13551b).C(iC);
                    C1417kI c1417kI = (C1417kI) c1363jIA.d();
                    c1311iIA.b();
                    ((C1471lI) c1311iIA.f13551b).C(c1417kI);
                }
                return ((C1471lI) c1311iIA.d()).toString();
            default:
                return super.toString();
        }
    }

    public ZI u() throws GeneralSecurityException {
        C1313iK c1313iKA;
        XI xi = (XI) this.f17369b;
        if (xi == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = (ECPoint) this.f17370c;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        BF.a(eCPoint, xi.f12409b.f12200b.getCurve());
        if (((XI) this.f17369b).a() && ((Integer) this.f17371d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((XI) this.f17369b).a() && ((Integer) this.f17371d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        AE ae = ((XI) this.f17369b).f12411d;
        if (ae == AE.f6966n) {
            c1313iKA = AbstractC0873aG.f13089a;
        } else if (ae == AE.f6965m || ae == AE.f6964l) {
            c1313iKA = AbstractC0873aG.a(((Integer) this.f17371d).intValue());
        } else {
            if (ae != AE.f6963k) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(((XI) this.f17369b).f12411d.f6968b));
            }
            c1313iKA = AbstractC0873aG.b(((Integer) this.f17371d).intValue());
        }
        return new ZI((XI) this.f17369b, (ECPoint) this.f17370c, c1313iKA, (Integer) this.f17371d);
    }

    public C1849sJ v() throws GeneralSecurityException {
        C1313iK c1313iKA;
        if (((C1688pJ) this.f17369b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f17370c;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        C1688pJ c1688pJ = (C1688pJ) this.f17369b;
        int i = c1688pJ.f16157a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(A.f.o(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length()), "Got modulus size ", iBitLength, ", but parameters requires modulus size ", i));
        }
        if (c1688pJ.a() && ((Integer) this.f17371d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C1688pJ) this.f17369b).a() && ((Integer) this.f17371d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C1634oJ c1634oJ = ((C1688pJ) this.f17369b).f16159c;
        if (c1634oJ == C1634oJ.f15931e) {
            c1313iKA = AbstractC0873aG.f13089a;
        } else if (c1634oJ == C1634oJ.f15930d || c1634oJ == C1634oJ.f15929c) {
            c1313iKA = AbstractC0873aG.a(((Integer) this.f17371d).intValue());
        } else {
            if (c1634oJ != C1634oJ.f15928b) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(((C1688pJ) this.f17369b).f16159c)));
            }
            c1313iKA = AbstractC0873aG.b(((Integer) this.f17371d).intValue());
        }
        return new C1849sJ((C1688pJ) this.f17369b, (BigInteger) this.f17370c, c1313iKA, (Integer) this.f17371d);
    }

    public C2227zJ w() throws GeneralSecurityException {
        C1313iK c1313iKA;
        if (((C2119xJ) this.f17369b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f17370c;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        C2119xJ c2119xJ = (C2119xJ) this.f17369b;
        int i = c2119xJ.f17570a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(A.f.o(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length()), "Got modulus size ", iBitLength, ", but parameters requires modulus size ", i));
        }
        if (c2119xJ.a() && ((Integer) this.f17371d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C2119xJ) this.f17369b).a() && ((Integer) this.f17371d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C2065wJ c2065wJ = ((C2119xJ) this.f17369b).f17572c;
        if (c2065wJ == C2065wJ.f17421e) {
            c1313iKA = AbstractC0873aG.f13089a;
        } else if (c2065wJ == C2065wJ.f17420d || c2065wJ == C2065wJ.f17419c) {
            c1313iKA = AbstractC0873aG.a(((Integer) this.f17371d).intValue());
        } else {
            if (c2065wJ != C2065wJ.f17418b) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(((C2119xJ) this.f17369b).f17572c)));
            }
            c1313iKA = AbstractC0873aG.b(((Integer) this.f17371d).intValue());
        }
        return new C2227zJ((C2119xJ) this.f17369b, (BigInteger) this.f17370c, c1313iKA, (Integer) this.f17371d);
    }

    public C0926bE x(int i) {
        List list = (List) this.f17369b;
        if (i < 0 || i >= list.size()) {
            int size = list.size();
            throw new IndexOutOfBoundsException(A.f.o(new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(size).length()), "Invalid index ", i, " for keyset of size ", size));
        }
        C0926bE c0926bE = (C0926bE) list.get(i);
        if (!C(c0926bE.f13335g)) {
            throw new IllegalStateException(A.f.n(new StringBuilder(String.valueOf(i).length() + 42), "Keyset-Entry at position ", i, " has wrong status"));
        }
        if (c0926bE.f13333e) {
            throw new IllegalStateException(A.f.n(new StringBuilder(String.valueOf(i).length() + 48), "Keyset-Entry at position ", i, " didn't parse correctly"));
        }
        return (C0926bE) list.get(i);
    }

    public void y(C1238h c1238h) {
        MO mo = (MO) ((HashMap) this.f17369b).remove(c1238h);
        mo.getClass();
        EN en = (EN) ((FN) this.f17371d).f8110n.get(mo);
        if (en != null) {
            synchronized (en) {
                en.f7948d--;
            }
        }
    }

    public C2041vw(InterfaceC2208z0 interfaceC2208z0) {
        this.f17368a = 19;
        this.f17369b = interfaceC2208z0;
    }

    public /* synthetic */ C2041vw(Object obj, Object obj2, Object obj3, int i) {
        this.f17368a = i;
        this.f17369b = obj;
        this.f17370c = obj2;
        this.f17371d = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2041vw(int i) {
        this(new long[10], new long[10], new long[10], 6);
        this.f17368a = i;
        switch (i) {
            case 6:
                break;
            case 7:
            default:
                this.f17370c = new ArrayDeque();
                this.f17371d = null;
                this.f17369b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            case 8:
                this.f17369b = null;
                this.f17370c = null;
                this.f17371d = YD.f12605F;
                break;
        }
    }

    public C2041vw(Context context) {
        this.f17368a = 17;
        this.f17369b = context != null ? context.getApplicationContext() : null;
        if (context == null) {
            this.f17370c = OO.f10188c;
        }
    }

    public C2041vw(FN fn, MO mo) {
        this.f17368a = 14;
        this.f17371d = fn;
        this.f17369b = new HashMap();
        this.f17370c = mo;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.TN, java.lang.Object] */
    public /* synthetic */ C2041vw(UN un, Context context) {
        this.f17368a = 15;
        this.f17371d = un;
        this.f17369b = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: com.google.android.gms.internal.ads.TN
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                UN un2 = (UN) this.f11370a.f17371d;
                if (un2.f11687l0) {
                    return;
                }
                un2.Z1(1, 19, Integer.valueOf(i));
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f17370c = r02;
        context.registerDeviceIdChangeListener(new ExecutorC2099x(2, un.f11652J.B(un.f11650H, null)), r02);
    }

    public /* synthetic */ C2041vw(C1424kP c1424kP) {
        this.f17368a = 16;
        this.f17371d = c1424kP;
        Handler handlerN = Vt.n();
        this.f17369b = handlerN;
        C1318iP c1318iP = new C1318iP(this);
        this.f17370c = c1318iP;
        c1424kP.f15149a.registerStreamEventCallback(new ExecutorC1996v4(handlerN, 1), c1318iP);
    }

    public C2041vw(List list, RF rf) throws GeneralSecurityException {
        this.f17368a = 2;
        this.f17369b = list;
        this.f17370c = rf;
        if (AbstractC2007vF.f17248a.f11420a.get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                C0926bE c0926bE = (C0926bE) it.next();
                int i = c0926bE.f13331c;
                if (!hashSet.contains(Integer.valueOf(i))) {
                    hashSet.add(Integer.valueOf(i));
                    z6 |= c0926bE.f13332d;
                } else {
                    throw new GeneralSecurityException(A.f.n(new StringBuilder(String.valueOf(i).length() + 121), "KeyID ", i, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!z6) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.f17371d = null;
    }

    public C2041vw(InterfaceC0812Xh[] interfaceC0812XhArr) {
        this.f17368a = 18;
        C1963uP c1963uP = new C1963uP();
        c1963uP.f17121m = 0;
        c1963uP.f17123o = 0;
        c1963uP.f17124p = 0;
        byte[] bArr = Vt.f12097b;
        c1963uP.f17122n = bArr;
        c1963uP.f17125q = bArr;
        C0813Xi c0813Xi = new C0813Xi();
        c0813Xi.f12438c = 1.0f;
        c0813Xi.f12439d = 1.0f;
        C1703ph c1703ph = C1703ph.f16196e;
        c0813Xi.f12440e = c1703ph;
        c0813Xi.f12441f = c1703ph;
        c0813Xi.f12442g = c1703ph;
        c0813Xi.f12443h = c1703ph;
        ByteBuffer byteBuffer = InterfaceC0812Xh.f12436a;
        c0813Xi.f12445k = byteBuffer;
        c0813Xi.f12446l = byteBuffer;
        c0813Xi.f12437b = -1;
        InterfaceC0812Xh[] interfaceC0812XhArr2 = {c1963uP, c0813Xi};
        this.f17369b = interfaceC0812XhArr2;
        System.arraycopy(interfaceC0812XhArr, 0, interfaceC0812XhArr2, 0, 0);
        this.f17370c = c1963uP;
        this.f17371d = c0813Xi;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2041vw(C1879sw c1879sw) {
        this(6);
        this.f17368a = 6;
        e(c1879sw, this);
    }

    public C2041vw(String str) {
        this.f17368a = 1;
        C1879sw c1879sw = new C1879sw(1, false);
        this.f17370c = c1879sw;
        this.f17371d = c1879sw;
        this.f17369b = str;
    }

    public C2041vw(C2041vw c2041vw) {
        this.f17368a = 6;
        this.f17369b = Arrays.copyOf((long[]) c2041vw.f17369b, 10);
        this.f17370c = Arrays.copyOf((long[]) c2041vw.f17370c, 10);
        this.f17371d = Arrays.copyOf((long[]) c2041vw.f17371d, 10);
    }
}
