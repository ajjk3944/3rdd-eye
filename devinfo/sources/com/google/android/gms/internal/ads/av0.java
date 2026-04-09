package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECPoint;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class av0 implements i, a02 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9421a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9422b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9423c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9424d;

    public /* synthetic */ av0(int i4, boolean z3) {
        this.f9421a = i4;
        this.f9422b = null;
        this.f9423c = null;
        this.f9424d = null;
    }

    public static be1 B(uh1 uh1Var) {
        return be1.I(uh1Var.B().A(), uh1Var.B().B(), uh1Var.B().C(), uh1Var.D(), uh1Var.D() == ii1.RAW ? null : Integer.valueOf(uh1Var.C()));
    }

    public static boolean C(int i4) {
        int i10 = i4 - 2;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    public static final av0 a(vh1 vh1Var) throws GeneralSecurityException {
        al0 cd1Var;
        boolean z3;
        if (vh1Var == null || vh1Var.C() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(vh1Var.C());
        for (uh1 uh1Var : vh1Var.B()) {
            int iC = uh1Var.C();
            try {
                be1 be1VarB = B(uh1Var);
                md1 md1Var = md1.f13875b;
                ie1 ie1Var = (ie1) md1Var.f13876a.get();
                ie1Var.getClass();
                cd1Var = !ie1Var.f12317b.containsKey(new ge1(be1.class, (vl1) be1VarB.f9659c)) ? new cd1(be1VarB) : md1Var.e(be1VarB);
                z3 = false;
            } catch (GeneralSecurityException e2) {
                if (ic1.f12211a.f13683a.get()) {
                    throw e2;
                }
                cd1Var = new cd1(B(uh1Var));
                z3 = true;
            }
            if (ic1.f12211a.f13683a.get() && !C(uh1Var.I())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z10 = true;
            int I = uh1Var.I();
            if (iC != vh1Var.A()) {
                z10 = false;
            }
            arrayList.add(new p91(cd1Var, I, iC, z10, z3, tk0.f16851q));
        }
        return new av0(DesugarCollections.unmodifiableList(arrayList), ed1.f10765b);
    }

    public static void d(rt rtVar, av0 av0Var) {
        av0 av0Var2 = (av0) rtVar.f15753b;
        long[] jArr = (long[]) av0Var.f9422b;
        long[] jArr2 = (long[]) av0Var2.f9422b;
        long[] jArr3 = (long[]) rtVar.f15754c;
        ls.E(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) av0Var.f9423c;
        long[] jArr5 = (long[]) av0Var2.f9423c;
        long[] jArr6 = (long[]) av0Var2.f9424d;
        ls.E(jArr4, jArr5, jArr6);
        ls.E((long[]) av0Var.f9424d, jArr6, jArr3);
    }

    public static final av0 z(s91 s91Var) throws GeneralSecurityException {
        int i4;
        int i10;
        m8.s sVar = new m8.s(5);
        ArrayList arrayList = (ArrayList) sVar.f28983b;
        n91 n91Var = new n91(s91Var);
        w5 w5Var = w5.f17895h;
        n91Var.f14188c = w5Var;
        n91Var.f14186a = true;
        int size = arrayList.size();
        int i11 = 0;
        byte b10 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((n91) obj).f14186a = false;
        }
        arrayList.add(n91Var);
        if (sVar.f28982a) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        sVar.f28982a = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i13 = 0;
        while (i13 < arrayList.size() - 1) {
            int i14 = i13 + 1;
            if (((n91) arrayList.get(i13)).f14188c == w5Var && ((n91) arrayList.get(i14)).f14188c != w5Var) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i13 = i14;
        }
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        int i15 = 0;
        Integer num = null;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            n91 n91Var2 = (n91) obj2;
            n91Var2.getClass();
            s91 s91Var2 = n91Var2.f14187b;
            w5 w5Var2 = n91Var2.f14188c;
            if (w5Var2 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (w5Var2 == w5Var) {
                int i16 = 0;
                while (true) {
                    if (i16 != 0 && !hashSet.contains(Integer.valueOf(i16))) {
                        break;
                    }
                    int i17 = je1.f12739a;
                    i16 = 0;
                    while (i16 == 0) {
                        byte[] bArrA = de1.a(4);
                        i16 = ((bArrA[1] & 255) << 16) | ((bArrA[0] & 255) << 24) | ((bArrA[2] & 255) << 8) | (bArrA[3] & 255);
                    }
                }
                i4 = i16;
            } else {
                i4 = 0;
            }
            Integer numValueOf = Integer.valueOf(i4);
            if (hashSet.contains(numValueOf)) {
                int i18 = i4;
                throw new GeneralSecurityException(je.u.v(new StringBuilder(String.valueOf(i18).length() + 31), "Id ", i18, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            al0 al0VarB = fd1.f11109b.b(s91Var2, true != s91Var2.a() ? null : numValueOf);
            Object obj3 = m91.f13807c;
            if (obj3.equals(obj3)) {
                i10 = 3;
            } else if (m91.f13808d.equals(obj3)) {
                i10 = 4;
            } else {
                if (!m91.f13809e.equals(obj3)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i10 = 5;
            }
            boolean z3 = n91Var2.f14186a;
            p91 p91Var = new p91(al0VarB, i10, i4, z3, false, tk0.f16851q);
            if (z3) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
            arrayList2.add(p91Var);
        }
        int i19 = 2;
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        ed1 ed1Var = (ed1) sVar.f28984c;
        av0 av0Var = new av0(arrayList2, ed1Var);
        if (ed1Var.f10766a.isEmpty()) {
            return av0Var;
        }
        tk0 tk0Var = new tk0(b10 == true ? 1 : 0, 22);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        while (i11 < size3) {
            Object obj4 = arrayList2.get(i11);
            i11++;
            p91 p91Var2 = (p91) obj4;
            arrayList3.add(new p91(p91Var2.f14929a, p91Var2.g, p91Var2.f14931c, p91Var2.f14932d, p91Var2.f14933e, tk0Var));
        }
        return new av0(arrayList3, ed1Var, av0Var, i19);
    }

    public Object A(al0 al0Var, Class cls) throws GeneralSecurityException {
        List list = (List) this.f9422b;
        av0 av0Var = (av0) this.f9424d;
        if (al0Var == null) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        vh1 vh1VarI = (av0Var == null ? this : av0Var).i();
        int i4 = v91.f17570a;
        int iA = vh1VarI.A();
        boolean z3 = true;
        int i10 = 0;
        boolean z10 = false;
        for (uh1 uh1Var : vh1VarI.B()) {
            if (uh1Var.I() == 3) {
                if (!uh1Var.A()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(uh1Var.C())));
                }
                if (uh1Var.D() == ii1.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(uh1Var.C())));
                }
                if (uh1Var.I() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(uh1Var.C())));
                }
                if (uh1Var.C() == iA) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z3 &= uh1Var.B().C() == 4;
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z3) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (((p91) list.get(i11)).f14933e || !C(((p91) list.get(i11)).g)) {
                String strA = vh1VarI.D(i11).B().A();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strA).length() + String.valueOf(i11).length() + 44 + 32);
                sb2.append("Key parsing of key with index ");
                sb2.append(i11);
                sb2.append(" and type_url ");
                sb2.append(strA);
                sb2.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        if (av0Var == null) {
            av0Var = this;
        }
        return al0Var.l(av0Var, (ed1) this.f9423c, cls);
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized h b() {
        h hVarB;
        ss1 ss1Var = (ss1) this.f9424d;
        androidx.datastore.preferences.protobuf.k kVar = ss1Var.f16533c;
        HashMap map = (HashMap) this.f9422b;
        hVarB = kVar.b();
        cv1 cv1Var = (cv1) this.f9423c;
        map.put(hVarB, cv1Var);
        rs1 rs1Var = (rs1) ss1Var.f16542n.get(cv1Var);
        if (rs1Var != null) {
            rs1Var.a();
        }
        return hVarB;
    }

    public void c(int i4) throws InvalidAlgorithmParameterException {
        if (i4 != 16 && i4 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i4 * 8)));
        }
        this.f9422b = Integer.valueOf(i4);
    }

    public void e(l91 l91Var, Uri uri, Map map, long j, long j8, bz1 bz1Var) throws pz1 {
        t1 t1Var = new t1(l91Var, j, j8);
        this.f9424d = t1Var;
        if (((x1) this.f9423c) != null) {
            return;
        }
        x1[] x1VarArrA = ((b2) this.f9422b).a(uri, map);
        int length = x1VarArrA.length;
        v41 v41Var = x41.f18307b;
        yr1.u(length, "expectedSize");
        u41 u41Var = new u41(length);
        boolean z3 = true;
        if (length == 1) {
            this.f9423c = x1VarArrA[0];
        } else {
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                x1 x1Var = x1VarArrA[i4];
                try {
                } catch (EOFException unused) {
                    if (((x1) this.f9423c) != null || t1Var.f16636d == j) {
                    }
                } catch (Throwable th2) {
                    if (((x1) this.f9423c) == null && t1Var.f16636d != j) {
                        z3 = false;
                    }
                    mq0.c0(z3);
                    t1Var.f16638f = 0;
                    throw th2;
                }
                if (x1Var.c(t1Var)) {
                    this.f9423c = x1Var;
                    t1Var.f16638f = 0;
                    break;
                } else {
                    u41Var.b(x1Var.a());
                    boolean z10 = ((x1) this.f9423c) != null || t1Var.f16636d == j;
                    mq0.c0(z10);
                    t1Var.f16638f = 0;
                    i4++;
                }
            }
            if (((x1) this.f9423c) == null) {
                Iterator it = mq0.F(x41.r(x1VarArrA), b11.f9547e).iterator();
                StringBuilder sb2 = new StringBuilder();
                yo0.y(sb2, it, ", ");
                String string = sb2.toString();
                throw new pz1(r5.c.m(new StringBuilder(string.length() + 58), "None of the available extractors (", string, ") could read the stream."), u41Var.f());
            }
        }
        ((x1) this.f9423c).e(bz1Var);
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized void f() {
        ((ss1) this.f9424d).f16533c.f();
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized void g(h hVar) {
        ((ss1) this.f9424d).f16533c.g(hVar);
        y(hVar);
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized void h(g5 g5Var) {
        ((ss1) this.f9424d).f16533c.h(g5Var);
        while (g5Var != null) {
            h hVar = (h) g5Var.f11375c;
            hVar.getClass();
            y(hVar);
            g5Var = (g5) g5Var.f11376d;
            if (g5Var == null || ((h) g5Var.f11375c) == null) {
                g5Var = null;
            }
        }
    }

    public vh1 i() throws GeneralSecurityException {
        try {
            sh1 sh1VarG = vh1.G();
            for (p91 p91Var : (List) this.f9422b) {
                al0 al0VarA = p91Var.a();
                int i4 = p91Var.f14931c;
                int i10 = p91Var.g;
                be1 be1Var = (be1) md1.f13875b.f(al0VarA);
                Integer numU = al0VarA.u();
                if (numU != null && numU.intValue() != i4) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                th1 th1VarE = uh1.E();
                nh1 nh1VarD = oh1.D();
                String str = (String) be1Var.f9658b;
                nh1VarD.b();
                ((oh1) nh1VarD.f14755b).F(str);
                bn1 bn1Var = (bn1) be1Var.f9660d;
                nh1VarD.b();
                ((oh1) nh1VarD.f14755b).G(bn1Var);
                int i11 = be1Var.f9657a;
                nh1VarD.b();
                ((oh1) nh1VarD.f14755b).H(i11);
                th1VarE.b();
                ((uh1) th1VarE.f14755b).F((oh1) nh1VarD.e());
                th1VarE.b();
                ((uh1) th1VarE.f14755b).J(i10);
                th1VarE.b();
                ((uh1) th1VarE.f14755b).G(i4);
                ii1 ii1Var = (ii1) be1Var.f9661e;
                th1VarE.b();
                ((uh1) th1VarE.f14755b).H(ii1Var);
                uh1 uh1Var = (uh1) th1VarE.e();
                sh1VarG.b();
                ((vh1) sh1VarG.f14755b).I(uh1Var);
                if (p91Var.f14932d) {
                    sh1VarG.b();
                    ((vh1) sh1VarG.f14755b).H(i4);
                }
            }
            return (vh1) sh1VarG.e();
        } catch (GeneralSecurityException e2) {
            throw new ac.m(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.a02
    public u51 j(int i4, ii iiVar, int[] iArr) {
        v41 v41Var = x41.f18307b;
        yr1.u(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iiVar.f12337a) {
            int i12 = i4;
            ii iiVar2 = iiVar;
            zz1 zz1Var = new zz1(i12, iiVar2, i10, (wz1) this.f9422b, iArr[i10], (String) this.f9423c, (String) this.f9424d);
            int length = objArrCopyOf.length;
            int i13 = i11 + 1;
            int iD = s41.d(length, i13);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i11] = zz1Var;
            i10++;
            i11 = i13;
            i4 = i12;
            iiVar = iiVar2;
        }
        return x41.s(objArrCopyOf, i11);
    }

    public void k(int i4) throws GeneralSecurityException {
        if (i4 < 10 || i4 > 16) {
            throw new GeneralSecurityException(d.h.q(i4, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i4).length() + 40)));
        }
        this.f9423c = Integer.valueOf(i4);
    }

    public byte[] l() {
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
        long[] jArr14 = (long[]) this.f9424d;
        ls.I(jArr4, jArr14);
        ls.I(jArr13, jArr4);
        ls.I(jArr12, jArr13);
        ls.E(jArr5, jArr12, jArr14);
        ls.E(jArr6, jArr5, jArr4);
        ls.I(jArr12, jArr6);
        ls.E(jArr7, jArr12, jArr5);
        ls.I(jArr12, jArr7);
        ls.I(jArr13, jArr12);
        ls.I(jArr12, jArr13);
        ls.I(jArr13, jArr12);
        ls.I(jArr12, jArr13);
        ls.E(jArr8, jArr12, jArr7);
        ls.I(jArr12, jArr8);
        ls.I(jArr13, jArr12);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            ls.I(jArr12, jArr13);
            ls.I(jArr13, jArr12);
        }
        ls.E(jArr9, jArr13, jArr8);
        ls.I(jArr12, jArr9);
        ls.I(jArr13, jArr12);
        for (int i10 = 2; i10 < 20; i10 += 2) {
            ls.I(jArr12, jArr13);
            ls.I(jArr13, jArr12);
        }
        ls.E(jArr12, jArr13, jArr9);
        ls.I(jArr13, jArr12);
        ls.I(jArr12, jArr13);
        for (int i11 = 2; i11 < 10; i11 += 2) {
            ls.I(jArr13, jArr12);
            ls.I(jArr12, jArr13);
        }
        ls.E(jArr10, jArr12, jArr8);
        ls.I(jArr12, jArr10);
        ls.I(jArr13, jArr12);
        for (int i12 = 2; i12 < 50; i12 += 2) {
            ls.I(jArr12, jArr13);
            ls.I(jArr13, jArr12);
        }
        ls.E(jArr11, jArr13, jArr10);
        ls.I(jArr13, jArr11);
        ls.I(jArr12, jArr13);
        for (int i13 = 2; i13 < 100; i13 += 2) {
            ls.I(jArr13, jArr12);
            ls.I(jArr12, jArr13);
        }
        ls.E(jArr13, jArr12, jArr11);
        ls.I(jArr12, jArr13);
        ls.I(jArr13, jArr12);
        for (int i14 = 2; i14 < 50; i14 += 2) {
            ls.I(jArr12, jArr13);
            ls.I(jArr13, jArr12);
        }
        ls.E(jArr12, jArr13, jArr10);
        ls.I(jArr13, jArr12);
        ls.I(jArr12, jArr13);
        ls.I(jArr13, jArr12);
        ls.I(jArr12, jArr13);
        ls.I(jArr13, jArr12);
        ls.E(jArr, jArr13, jArr6);
        ls.E(jArr2, (long[]) this.f9422b, jArr);
        ls.E(jArr3, (long[]) this.f9423c, jArr);
        byte[] bArrO = ls.O(jArr3);
        bArrO[31] = (byte) (((ls.O(jArr2)[0] & 1) << 7) ^ bArrO[31]);
        return bArrO;
    }

    public p91 m() {
        for (p91 p91Var : (List) this.f9422b) {
            if (p91Var != null && p91Var.f14932d) {
                if (p91Var.f14930b == m91.f13807c) {
                    return p91Var;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public long n() {
        t1 t1Var = (t1) this.f9424d;
        if (t1Var != null) {
            return t1Var.f16636d;
        }
        return -1L;
    }

    public ma1 o() throws GeneralSecurityException {
        kh0 kh0Var;
        vl1 vl1VarB;
        pa1 pa1Var = (pa1) this.f9422b;
        if (pa1Var == null || (kh0Var = (kh0) this.f9423c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (pa1Var.f14951a != ((vl1) kh0Var.f13160b).f17649a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (pa1Var.a() && ((Integer) this.f9424d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((pa1) this.f9422b).a() && ((Integer) this.f9424d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        m91 m91Var = ((pa1) this.f9422b).f14953c;
        if (m91Var == m91.f13811h) {
            vl1VarB = nd1.f14254a;
        } else if (m91Var == m91.g) {
            vl1VarB = nd1.a(((Integer) this.f9424d).intValue());
        } else {
            if (m91Var != m91.f13810f) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(((pa1) this.f9422b).f14953c)));
            }
            vl1VarB = nd1.b(((Integer) this.f9424d).intValue());
        }
        return new ma1((pa1) this.f9422b, (kh0) this.f9423c, vl1VarB, (Integer) this.f9424d);
    }

    public qa1 p() throws GeneralSecurityException {
        kh0 kh0Var;
        vl1 vl1VarB;
        sa1 sa1Var = (sa1) this.f9422b;
        if (sa1Var == null || (kh0Var = (kh0) this.f9423c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (sa1Var.f15940a != ((vl1) kh0Var.f13160b).f17649a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (sa1Var.a() && ((Integer) this.f9424d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((sa1) this.f9422b).a() && ((Integer) this.f9424d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ja1 ja1Var = ((sa1) this.f9422b).f15941b;
        if (ja1Var == ja1.j) {
            vl1VarB = nd1.f14254a;
        } else if (ja1Var == ja1.f12698i) {
            vl1VarB = nd1.a(((Integer) this.f9424d).intValue());
        } else {
            if (ja1Var != ja1.f12697h) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(((sa1) this.f9422b).f15941b)));
            }
            vl1VarB = nd1.b(((Integer) this.f9424d).intValue());
        }
        return new qa1((sa1) this.f9422b, (kh0) this.f9423c, vl1VarB, (Integer) this.f9424d);
    }

    public ta1 q() throws GeneralSecurityException {
        kh0 kh0Var;
        vl1 vl1VarB;
        va1 va1Var = (va1) this.f9422b;
        if (va1Var == null || (kh0Var = (kh0) this.f9423c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (va1Var.f17575a != ((vl1) kh0Var.f13160b).f17649a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (va1Var.a() && ((Integer) this.f9424d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((va1) this.f9422b).a() && ((Integer) this.f9424d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ka1 ka1Var = ((va1) this.f9422b).f17576b;
        if (ka1Var == ka1.f13101h) {
            vl1VarB = nd1.f14254a;
        } else if (ka1Var == ka1.g) {
            vl1VarB = nd1.a(((Integer) this.f9424d).intValue());
        } else {
            if (ka1Var != ka1.f13100f) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(((va1) this.f9422b).f17576b)));
            }
            vl1VarB = nd1.b(((Integer) this.f9424d).intValue());
        }
        return new ta1((va1) this.f9422b, (kh0) this.f9423c, vl1VarB, (Integer) this.f9424d);
    }

    public ke1 r() throws GeneralSecurityException {
        kh0 kh0Var;
        vl1 vl1VarA;
        me1 me1Var = (me1) this.f9422b;
        if (me1Var == null || (kh0Var = (kh0) this.f9423c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (me1Var.f13881a != ((vl1) kh0Var.f13160b).f17649a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (me1Var.a() && ((Integer) this.f9424d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((me1) this.f9422b).a() && ((Integer) this.f9424d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        m91 m91Var = ((me1) this.f9422b).f13883c;
        if (m91Var == m91.f13819q) {
            vl1VarA = nd1.f14254a;
        } else if (m91Var == m91.f13818p || m91Var == m91.f13817o) {
            vl1VarA = nd1.a(((Integer) this.f9424d).intValue());
        } else {
            if (m91Var != m91.f13816n) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((me1) this.f9422b).f13883c)));
            }
            vl1VarA = nd1.b(((Integer) this.f9424d).intValue());
        }
        return new ke1((me1) this.f9422b, (kh0) this.f9423c, vl1VarA, (Integer) this.f9424d);
    }

    public me1 s() throws GeneralSecurityException {
        Integer num = (Integer) this.f9422b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f9423c) != null) {
            return new me1(num.intValue(), ((Integer) this.f9423c).intValue(), (m91) this.f9424d);
        }
        throw new GeneralSecurityException("tag size not set");
    }

    public qe1 t() throws GeneralSecurityException {
        kh0 kh0Var;
        vl1 vl1VarA;
        ue1 ue1Var = (ue1) this.f9422b;
        if (ue1Var == null || (kh0Var = (kh0) this.f9423c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ue1Var.f17192a != ((vl1) kh0Var.f13160b).f17649a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ue1Var.a() && ((Integer) this.f9424d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((ue1) this.f9422b).a() && ((Integer) this.f9424d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        te1 te1Var = ((ue1) this.f9422b).f17194c;
        if (te1Var == te1.f16801e) {
            vl1VarA = nd1.f14254a;
        } else if (te1Var == te1.f16800d || te1Var == te1.f16799c) {
            vl1VarA = nd1.a(((Integer) this.f9424d).intValue());
        } else {
            if (te1Var != te1.f16798b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((ue1) this.f9422b).f17194c)));
            }
            vl1VarA = nd1.b(((Integer) this.f9424d).intValue());
        }
        return new qe1((ue1) this.f9422b, (kh0) this.f9423c, vl1VarA, (Integer) this.f9424d);
    }

    public String toString() throws GeneralSecurityException {
        switch (this.f9421a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f9422b);
                sb2.append('{');
                l90 l90Var = (l90) ((l90) this.f9423c).f13427c;
                String str = "";
                while (l90Var != null) {
                    Object obj = l90Var.f13426b;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    l90Var = (l90) l90Var.f13427c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 2:
                vh1 vh1VarI = i();
                int i4 = v91.f17570a;
                wh1 wh1VarA = zh1.A();
                int iA = vh1VarI.A();
                wh1VarA.b();
                ((zh1) wh1VarA.f14755b).B(iA);
                for (uh1 uh1Var : vh1VarI.B()) {
                    xh1 xh1VarA = yh1.A();
                    String strA = uh1Var.B().A();
                    xh1VarA.b();
                    ((yh1) xh1VarA.f14755b).B(strA);
                    int I = uh1Var.I();
                    xh1VarA.b();
                    ((yh1) xh1VarA.f14755b).E(I);
                    ii1 ii1VarD = uh1Var.D();
                    xh1VarA.b();
                    ((yh1) xh1VarA.f14755b).D(ii1VarD);
                    int iC = uh1Var.C();
                    xh1VarA.b();
                    ((yh1) xh1VarA.f14755b).C(iC);
                    yh1 yh1Var = (yh1) xh1VarA.e();
                    wh1VarA.b();
                    ((zh1) wh1VarA.f14755b).C(yh1Var);
                }
                return ((zh1) wh1VarA.e()).toString();
            default:
                return super.toString();
        }
    }

    public nj1 u() throws GeneralSecurityException {
        vl1 vl1VarA;
        lj1 lj1Var = (lj1) this.f9422b;
        if (lj1Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = (ECPoint) this.f9423c;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        oc1.a(eCPoint, lj1Var.f13508b.f13176b.getCurve());
        if (((lj1) this.f9422b).a() && ((Integer) this.f9424d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((lj1) this.f9422b).a() && ((Integer) this.f9424d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        m91 m91Var = ((lj1) this.f9422b).f13510d;
        if (m91Var == m91.f13823u) {
            vl1VarA = nd1.f14254a;
        } else if (m91Var == m91.f13822t || m91Var == m91.f13821s) {
            vl1VarA = nd1.a(((Integer) this.f9424d).intValue());
        } else {
            if (m91Var != m91.f13820r) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(((lj1) this.f9422b).f13510d.f13825b));
            }
            vl1VarA = nd1.b(((Integer) this.f9424d).intValue());
        }
        return new nj1((lj1) this.f9422b, (ECPoint) this.f9423c, vl1VarA, (Integer) this.f9424d);
    }

    public fk1 v() throws GeneralSecurityException {
        vl1 vl1VarA;
        if (((ck1) this.f9422b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f9423c;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        ck1 ck1Var = (ck1) this.f9422b;
        int i4 = ck1Var.f10150a;
        if (iBitLength != i4) {
            throw new GeneralSecurityException(je.u.q(iBitLength, i4, "Got modulus size ", ", but parameters requires modulus size ", new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i4).length())));
        }
        if (ck1Var.a() && ((Integer) this.f9424d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((ck1) this.f9422b).a() && ((Integer) this.f9424d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        bk1 bk1Var = ((ck1) this.f9422b).f10152c;
        if (bk1Var == bk1.f9707e) {
            vl1VarA = nd1.f14254a;
        } else if (bk1Var == bk1.f9706d || bk1Var == bk1.f9705c) {
            vl1VarA = nd1.a(((Integer) this.f9424d).intValue());
        } else {
            if (bk1Var != bk1.f9704b) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(((ck1) this.f9422b).f10152c)));
            }
            vl1VarA = nd1.b(((Integer) this.f9424d).intValue());
        }
        return new fk1((ck1) this.f9422b, (BigInteger) this.f9423c, vl1VarA, (Integer) this.f9424d);
    }

    public mk1 w() throws GeneralSecurityException {
        vl1 vl1VarA;
        if (((kk1) this.f9422b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f9423c;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        kk1 kk1Var = (kk1) this.f9422b;
        int i4 = kk1Var.f13183a;
        if (iBitLength != i4) {
            throw new GeneralSecurityException(je.u.q(iBitLength, i4, "Got modulus size ", ", but parameters requires modulus size ", new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i4).length())));
        }
        if (kk1Var.a() && ((Integer) this.f9424d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((kk1) this.f9422b).a() && ((Integer) this.f9424d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        jk1 jk1Var = ((kk1) this.f9422b).f13185c;
        if (jk1Var == jk1.f12773e) {
            vl1VarA = nd1.f14254a;
        } else if (jk1Var == jk1.f12772d || jk1Var == jk1.f12771c) {
            vl1VarA = nd1.a(((Integer) this.f9424d).intValue());
        } else {
            if (jk1Var != jk1.f12770b) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(((kk1) this.f9422b).f13185c)));
            }
            vl1VarA = nd1.b(((Integer) this.f9424d).intValue());
        }
        return new mk1((kk1) this.f9422b, (BigInteger) this.f9423c, vl1VarA, (Integer) this.f9424d);
    }

    public p91 x(int i4) {
        List list = (List) this.f9422b;
        if (i4 < 0 || i4 >= list.size()) {
            int size = list.size();
            throw new IndexOutOfBoundsException(je.u.q(i4, size, "Invalid index ", " for keyset of size ", new StringBuilder(String.valueOf(i4).length() + 34 + String.valueOf(size).length())));
        }
        p91 p91Var = (p91) list.get(i4);
        if (!C(p91Var.g)) {
            throw new IllegalStateException(je.u.v(new StringBuilder(String.valueOf(i4).length() + 42), "Keyset-Entry at position ", i4, " has wrong status"));
        }
        if (p91Var.f14933e) {
            throw new IllegalStateException(je.u.v(new StringBuilder(String.valueOf(i4).length() + 48), "Keyset-Entry at position ", i4, " didn't parse correctly"));
        }
        return (p91) list.get(i4);
    }

    public void y(h hVar) {
        cv1 cv1Var = (cv1) ((HashMap) this.f9422b).remove(hVar);
        cv1Var.getClass();
        rs1 rs1Var = (rs1) ((ss1) this.f9424d).f16542n.get(cv1Var);
        if (rs1Var != null) {
            synchronized (rs1Var) {
                rs1Var.f15750d--;
            }
        }
    }

    public av0(b2 b2Var) {
        this.f9421a = 17;
        this.f9422b = b2Var;
    }

    public /* synthetic */ av0(Object obj, Object obj2, Object obj3, int i4) {
        this.f9421a = i4;
        this.f9422b = obj;
        this.f9423c = obj2;
        this.f9424d = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public av0(int i4) {
        this(new long[10], new long[10], new long[10], 6);
        this.f9421a = i4;
        switch (i4) {
            case 6:
                break;
            case 7:
            default:
                this.f9423c = new ArrayDeque();
                this.f9424d = null;
                this.f9422b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            case 8:
                this.f9422b = null;
                this.f9423c = null;
                this.f9424d = m91.f13819q;
                break;
        }
    }

    public av0(Context context) {
        this.f9421a = 15;
        this.f9422b = context != null ? context.getApplicationContext() : null;
        if (context == null) {
            this.f9423c = ev1.f10889c;
        }
    }

    public av0(ss1 ss1Var, cv1 cv1Var) {
        this.f9421a = 14;
        this.f9424d = ss1Var;
        this.f9422b = new HashMap();
        this.f9423c = cv1Var;
    }

    public av0(List list, ed1 ed1Var) throws GeneralSecurityException {
        this.f9421a = 2;
        this.f9422b = list;
        this.f9423c = ed1Var;
        if (ic1.f12211a.f13683a.get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                p91 p91Var = (p91) it.next();
                int i4 = p91Var.f14931c;
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    hashSet.add(Integer.valueOf(i4));
                    z3 |= p91Var.f14932d;
                } else {
                    throw new GeneralSecurityException(je.u.v(new StringBuilder(String.valueOf(i4).length() + 121), "KeyID ", i4, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!z3) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.f9424d = null;
    }

    public av0(q10[] q10VarArr) {
        this.f9421a = 16;
        nw1 nw1Var = new nw1();
        nw1Var.f14455m = 0;
        nw1Var.f14457o = 0;
        nw1Var.f14458p = 0;
        byte[] bArr = bq0.f9769b;
        nw1Var.f14456n = bArr;
        nw1Var.f14459q = bArr;
        t30 t30Var = new t30();
        t30Var.f16683c = 1.0f;
        t30Var.f16684d = 1.0f;
        j00 j00Var = j00.f12557e;
        t30Var.f16685e = j00Var;
        t30Var.f16686f = j00Var;
        t30Var.g = j00Var;
        t30Var.f16687h = j00Var;
        ByteBuffer byteBuffer = q10.f15188a;
        t30Var.f16689k = byteBuffer;
        t30Var.f16690l = byteBuffer;
        t30Var.f16682b = -1;
        q10[] q10VarArr2 = {nw1Var, t30Var};
        this.f9422b = q10VarArr2;
        System.arraycopy(q10VarArr, 0, q10VarArr2, 0, 0);
        this.f9423c = nw1Var;
        this.f9424d = t30Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public av0(rt rtVar) {
        this(6);
        this.f9421a = 6;
        d(rtVar, this);
    }

    public av0(String str) {
        this.f9421a = 1;
        l90 l90Var = new l90(21);
        this.f9423c = l90Var;
        this.f9424d = l90Var;
        this.f9422b = str;
    }

    public av0(av0 av0Var) {
        this.f9421a = 6;
        this.f9422b = Arrays.copyOf((long[]) av0Var.f9422b, 10);
        this.f9423c = Arrays.copyOf((long[]) av0Var.f9423c, 10);
        this.f9424d = Arrays.copyOf((long[]) av0Var.f9424d, 10);
    }
}
