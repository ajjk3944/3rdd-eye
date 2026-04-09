package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jr3 implements np2 {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;

    public /* synthetic */ jr3(int i, boolean z) {
        this.f = i;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public static final jr3 a(vz3 vz3Var) throws GeneralSecurityException {
        gi2 fv3Var;
        boolean z;
        if (vz3Var == null || vz3Var.C() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(vz3Var.C());
        for (uz3 uz3Var : vz3Var.B()) {
            int iC = uz3Var.C();
            try {
                fw3 fw3VarS = s(uz3Var);
                rv3 rv3Var = rv3.b;
                nw3 nw3Var = (nw3) rv3Var.a.get();
                nw3Var.getClass();
                fv3Var = !nw3Var.b.containsKey(new lw3(fw3.class, (v34) fw3VarS.h)) ? new fv3(fw3VarS) : rv3Var.e(fw3VarS);
                z = false;
            } catch (GeneralSecurityException e) {
                if (((AtomicBoolean) lu3.a.g).get()) {
                    throw e;
                }
                fv3Var = new fv3(s(uz3Var));
                z = true;
            }
            if (((AtomicBoolean) lu3.a.g).get() && !t(uz3Var.I())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z2 = true;
            int I = uz3Var.I();
            if (iC != vz3Var.A()) {
                z2 = false;
            }
            arrayList.add(new ir3(fv3Var, I, iC, z2, z, tv2.n));
        }
        return new jr3(vz3Var, Collections.unmodifiableList(arrayList), hv3.b);
    }

    public static void d(wt2 wt2Var, jr3 jr3Var) {
        jr3 jr3Var2 = (jr3) wt2Var.g;
        long[] jArr = (long[]) jr3Var.g;
        long[] jArr2 = (long[]) jr3Var2.g;
        long[] jArr3 = (long[]) wt2Var.h;
        pu1.G(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) jr3Var.h;
        long[] jArr5 = (long[]) jr3Var2.h;
        long[] jArr6 = (long[]) jr3Var2.i;
        pu1.G(jArr4, jArr5, jArr6);
        pu1.G((long[]) jr3Var.i, jArr6, jArr3);
    }

    public static final jr3 p(mr3 mr3Var) throws GeneralSecurityException {
        int i;
        wy0 wy0Var = new wy0(7);
        ArrayList arrayList = (ArrayList) wy0Var.g;
        fr3 fr3Var = new fr3(mr3Var);
        pz pzVar = pz.p;
        fr3Var.c = pzVar;
        fr3Var.a = true;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((fr3) obj).a = false;
        }
        arrayList.add(fr3Var);
        if (wy0Var.f) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        wy0Var.f = true;
        sz3 sz3VarG = vz3.G();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i4 = 0;
        while (i4 < arrayList.size() - 1) {
            int i5 = i4 + 1;
            if (((fr3) arrayList.get(i4)).c == pzVar && ((fr3) arrayList.get(i5)).c != pzVar) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i4 = i5;
        }
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        int i6 = 0;
        Integer num = null;
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            fr3 fr3Var2 = (fr3) obj2;
            fr3Var2.getClass();
            mr3 mr3Var2 = fr3Var2.b;
            pz pzVar2 = fr3Var2.c;
            if (pzVar2 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (pzVar2 == pzVar) {
                int i7 = i2;
                while (true) {
                    if (i7 != 0 && !hashSet.contains(Integer.valueOf(i7))) {
                        break;
                    }
                    int i8 = ow3.a;
                    i7 = i2;
                    while (i7 == 0) {
                        byte[] bArrA = hw3.a(4);
                        int i9 = bArrA[i2] & 255;
                        i7 = (bArrA[3] & 255) | ((bArrA[2] & 255) << 8) | ((bArrA[1] & 255) << 16) | (i9 << 24);
                        i2 = 0;
                    }
                }
                i = i7;
            } else {
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                int i10 = i;
                throw new GeneralSecurityException(ga1.k(new StringBuilder(String.valueOf(i10).length() + 31), "Id ", i10, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            gi2 gi2VarB = jv3.b.b(mr3Var2, true != mr3Var2.a() ? null : numValueOf);
            ir3 ir3Var = new ir3(gi2VarB, r(), i, fr3Var2.a, false, tv2.n);
            uz3 uz3VarU = u(gi2VarB, r(), i);
            sz3VarG.b();
            ((vz3) sz3VarG.g).I(uz3VarU);
            if (fr3Var2.a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
            arrayList2.add(ir3Var);
            i2 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        int iIntValue = num.intValue();
        sz3VarG.b();
        ((vz3) sz3VarG.g).H(iIntValue);
        vz3 vz3Var = (vz3) sz3VarG.d();
        if (vz3Var.C() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        hv3 hv3Var = (hv3) wy0Var.h;
        jr3 jr3Var = new jr3(vz3Var, arrayList2, hv3Var);
        if (hv3Var.a.isEmpty()) {
            return jr3Var;
        }
        su2 su2Var = new su2(14);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            ir3 ir3Var2 = (ir3) obj3;
            arrayList3.add(new ir3(ir3Var2.a, ir3Var2.g, ir3Var2.c, ir3Var2.d, ir3Var2.e, su2Var));
        }
        return new jr3(arrayList3, hv3Var, jr3Var, 0);
    }

    public static /* synthetic */ int r() {
        Object obj = er3.h;
        if (obj.equals(obj)) {
            return 3;
        }
        if (er3.i.equals(obj)) {
            return 4;
        }
        if (er3.j.equals(obj)) {
            return 5;
        }
        throw new IllegalStateException("Unknown key status");
    }

    public static fw3 s(uz3 uz3Var) {
        return fw3.v(uz3Var.B().A(), uz3Var.B().B(), uz3Var.B().C(), uz3Var.D(), uz3Var.D() == i04.RAW ? null : Integer.valueOf(uz3Var.C()));
    }

    public static boolean t(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public static uz3 u(gi2 gi2Var, int i, int i2) throws GeneralSecurityException {
        fw3 fw3Var = (fw3) rv3.b.f(gi2Var);
        Integer num = (Integer) fw3Var.k;
        if (num != null && num.intValue() != i2) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        tz3 tz3VarE = uz3.E();
        nz3 nz3VarD = oz3.D();
        String str = (String) fw3Var.g;
        nz3VarD.b();
        ((oz3) nz3VarD.g).F(str);
        a54 a54Var = (a54) fw3Var.i;
        nz3VarD.b();
        ((oz3) nz3VarD.g).G(a54Var);
        int i3 = fw3Var.f;
        nz3VarD.b();
        ((oz3) nz3VarD.g).H(i3);
        tz3VarE.b();
        ((uz3) tz3VarE.g).F((oz3) nz3VarD.d());
        tz3VarE.b();
        ((uz3) tz3VarE.g).J(i);
        tz3VarE.b();
        ((uz3) tz3VarE.g).G(i2);
        i04 i04Var = (i04) fw3Var.j;
        tz3VarE.b();
        ((uz3) tz3VarE.g).H(i04Var);
        return (uz3) tz3VarE.d();
    }

    public void b(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.np2
    /* renamed from: c */
    public /* synthetic */ void mo6c(Object obj) {
        ((rh4) obj).j(0, (kh4) ((wt2) this.g).g, (ch4) this.h, (hh4) this.i);
    }

    public void e(th3 th3Var, Uri uri, Map map, long j, long j2, bi4 bi4Var) throws si4 {
        df1 df1Var = new df1(th3Var, j, j2);
        this.i = df1Var;
        if (((lf1) this.h) != null) {
            return;
        }
        lf1[] lf1VarArrD = ((of1) this.g).d(uri, map);
        int length = lf1VarArrD.length;
        vm3 vm3Var = xm3.g;
        ob1.z("expectedSize", length);
        um3 um3Var = new um3(length);
        boolean z = true;
        if (length == 1) {
            this.h = lf1VarArrD[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                lf1 lf1Var = lf1VarArrD[i];
                try {
                } catch (EOFException unused) {
                    if (((lf1) this.h) != null || df1Var.i == j) {
                    }
                } catch (Throwable th) {
                    if (((lf1) this.h) == null && df1Var.i != j) {
                        z = false;
                    }
                    zt0.b0(z);
                    df1Var.k = 0;
                    throw th;
                }
                if (lf1Var.b(df1Var)) {
                    this.h = lf1Var;
                    df1Var.k = 0;
                    break;
                } else {
                    um3Var.b(lf1Var.d());
                    boolean z2 = ((lf1) this.h) != null || df1Var.i == j;
                    zt0.b0(z2);
                    df1Var.k = 0;
                    i++;
                }
            }
            if (((lf1) this.h) == null) {
                Iterator it = gi2.O(xm3.n(lf1VarArrD), dj3.f).iterator();
                StringBuilder sb = new StringBuilder();
                i30.k0(sb, it, ", ");
                String string = sb.toString();
                throw new si4(ex0.l(new StringBuilder(string.length() + 58), "None of the available extractors (", string, ") could read the stream."), um3Var.f());
            }
        }
        ((lf1) this.h).f(bi4Var);
    }

    public vz3 f() {
        try {
            sz3 sz3VarG = vz3.G();
            for (ir3 ir3Var : (List) this.g) {
                gi2 gi2VarA = ir3Var.a();
                int i = ir3Var.c;
                uz3 uz3VarU = u(gi2VarA, ir3Var.g, i);
                sz3VarG.b();
                ((vz3) sz3VarG.g).I(uz3VarU);
                if (ir3Var.d) {
                    sz3VarG.b();
                    ((vz3) sz3VarG.g).H(i);
                }
            }
            return (vz3) sz3VarG.d();
        } catch (GeneralSecurityException e) {
            throw new rg(e);
        }
    }

    public void g(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(i).length() + 40), "Invalid tag size for AesCmacParameters: ", i));
        }
        this.h = Integer.valueOf(i);
    }

    public byte[] h() {
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
        long[] jArr14 = (long[]) this.i;
        pu1.I(jArr4, jArr14);
        pu1.I(jArr13, jArr4);
        pu1.I(jArr12, jArr13);
        pu1.G(jArr5, jArr12, jArr14);
        pu1.G(jArr6, jArr5, jArr4);
        pu1.I(jArr12, jArr6);
        pu1.G(jArr7, jArr12, jArr5);
        pu1.I(jArr12, jArr7);
        pu1.I(jArr13, jArr12);
        pu1.I(jArr12, jArr13);
        pu1.I(jArr13, jArr12);
        pu1.I(jArr12, jArr13);
        pu1.G(jArr8, jArr12, jArr7);
        pu1.I(jArr12, jArr8);
        pu1.I(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            pu1.I(jArr12, jArr13);
            pu1.I(jArr13, jArr12);
        }
        pu1.G(jArr9, jArr13, jArr8);
        pu1.I(jArr12, jArr9);
        pu1.I(jArr13, jArr12);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            pu1.I(jArr12, jArr13);
            pu1.I(jArr13, jArr12);
        }
        pu1.G(jArr12, jArr13, jArr9);
        pu1.I(jArr13, jArr12);
        pu1.I(jArr12, jArr13);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            pu1.I(jArr13, jArr12);
            pu1.I(jArr12, jArr13);
        }
        pu1.G(jArr10, jArr12, jArr8);
        pu1.I(jArr12, jArr10);
        pu1.I(jArr13, jArr12);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            pu1.I(jArr12, jArr13);
            pu1.I(jArr13, jArr12);
        }
        pu1.G(jArr11, jArr13, jArr10);
        pu1.I(jArr13, jArr11);
        pu1.I(jArr12, jArr13);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            pu1.I(jArr13, jArr12);
            pu1.I(jArr12, jArr13);
        }
        pu1.G(jArr13, jArr12, jArr11);
        pu1.I(jArr12, jArr13);
        pu1.I(jArr13, jArr12);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            pu1.I(jArr12, jArr13);
            pu1.I(jArr13, jArr12);
        }
        pu1.G(jArr12, jArr13, jArr10);
        pu1.I(jArr13, jArr12);
        pu1.I(jArr12, jArr13);
        pu1.I(jArr13, jArr12);
        pu1.I(jArr12, jArr13);
        pu1.I(jArr13, jArr12);
        pu1.G(jArr, jArr13, jArr6);
        pu1.G(jArr2, (long[]) this.g, jArr);
        pu1.G(jArr3, (long[]) this.h, jArr);
        byte[] bArrM = pu1.M(jArr3);
        bArrM[31] = (byte) (((pu1.M(jArr2)[0] & 1) << 7) ^ bArrM[31]);
        return bArrM;
    }

    public ir3 i() {
        for (ir3 ir3Var : (List) this.g) {
            if (ir3Var != null && ir3Var.d) {
                if (ir3Var.b == er3.h) {
                    return ir3Var;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public long j() {
        df1 df1Var = (df1) this.i;
        if (df1Var != null) {
            return df1Var.i;
        }
        return -1L;
    }

    public is3 k() throws GeneralSecurityException {
        yf3 yf3Var;
        v34 v34VarB;
        ms3 ms3Var = (ms3) this.g;
        if (ms3Var == null || (yf3Var = (yf3) this.h) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ms3Var.a != ((v34) yf3Var.f).a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ms3Var.a() && ((Integer) this.i) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((ms3) this.g).a() && ((Integer) this.i) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ls3 ls3Var = ((ms3) this.g).b;
        if (ls3Var == ls3.e) {
            v34VarB = sv3.a;
        } else if (ls3Var == ls3.d) {
            v34VarB = sv3.a(((Integer) this.i).intValue());
        } else {
            if (ls3Var != ls3.c) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(((ms3) this.g).b)));
            }
            v34VarB = sv3.b(((Integer) this.i).intValue());
        }
        return new is3((ms3) this.g, (yf3) this.h, v34VarB, (Integer) this.i);
    }

    public rw3 l() throws GeneralSecurityException {
        Integer num = (Integer) this.g;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.h) != null) {
            return new rw3(num.intValue(), ((Integer) this.h).intValue(), (gs3) this.i);
        }
        throw new GeneralSecurityException("tag size not set");
    }

    public n14 m() throws GeneralSecurityException {
        v34 v34VarA;
        l14 l14Var = (l14) this.g;
        if (l14Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = (ECPoint) this.h;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        ru3.a(eCPoint, l14Var.b.b.getCurve());
        if (((l14) this.g).a() && ((Integer) this.i) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((l14) this.g).a() && ((Integer) this.i) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ts3 ts3Var = ((l14) this.g).d;
        if (ts3Var == ts3.n) {
            v34VarA = sv3.a;
        } else if (ts3Var == ts3.m || ts3Var == ts3.l) {
            v34VarA = sv3.a(((Integer) this.i).intValue());
        } else {
            if (ts3Var != ts3.k) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(((l14) this.g).d.g));
            }
            v34VarA = sv3.b(((Integer) this.i).intValue());
        }
        return new n14((l14) this.g, (ECPoint) this.h, v34VarA, (Integer) this.i);
    }

    public l24 n() throws GeneralSecurityException {
        v34 v34VarA;
        if (((j24) this.g) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.h;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        j24 j24Var = (j24) this.g;
        int i = j24Var.a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(ga1.l(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length()), "Got modulus size ", iBitLength, ", but parameters requires modulus size ", i));
        }
        if (j24Var.a() && ((Integer) this.i) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((j24) this.g).a() && ((Integer) this.i) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        i24 i24Var = ((j24) this.g).c;
        if (i24Var == i24.e) {
            v34VarA = sv3.a;
        } else if (i24Var == i24.d || i24Var == i24.c) {
            v34VarA = sv3.a(((Integer) this.i).intValue());
        } else {
            if (i24Var != i24.b) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(((j24) this.g).c)));
            }
            v34VarA = sv3.b(((Integer) this.i).intValue());
        }
        return new l24((j24) this.g, (BigInteger) this.h, v34VarA, (Integer) this.i);
    }

    public ir3 o(int i) {
        List list = (List) this.g;
        if (i < 0 || i >= list.size()) {
            int size = list.size();
            throw new IndexOutOfBoundsException(ga1.l(new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(size).length()), "Invalid index ", i, " for keyset of size ", size));
        }
        ir3 ir3Var = (ir3) list.get(i);
        if (!t(ir3Var.g)) {
            throw new IllegalStateException(ga1.k(new StringBuilder(String.valueOf(i).length() + 42), "Keyset-Entry at position ", i, " has wrong status"));
        }
        if (ir3Var.e) {
            throw new IllegalStateException(ga1.k(new StringBuilder(String.valueOf(i).length() + 48), "Keyset-Entry at position ", i, " didn't parse correctly"));
        }
        return (ir3) list.get(i);
    }

    public Object q(yc0 yc0Var, Class cls) throws GeneralSecurityException {
        List list = (List) this.g;
        jr3 jr3Var = (jr3) this.i;
        if (yc0Var == null) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        vz3 vz3VarF = (jr3Var == null ? this : jr3Var).f();
        int i = pr3.a;
        int iA = vz3VarF.A();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (uz3 uz3Var : vz3VarF.B()) {
            if (uz3Var.I() == 3) {
                if (!uz3Var.A()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(uz3Var.C())));
                }
                if (uz3Var.D() == i04.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(uz3Var.C())));
                }
                if (uz3Var.I() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(uz3Var.C())));
                }
                if (uz3Var.C() == iA) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                z &= uz3Var.B().C() == 4;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((ir3) list.get(i3)).e || !t(((ir3) list.get(i3)).g)) {
                String strA = vz3VarF.D(i3).B().A();
                StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + String.valueOf(i3).length() + 44 + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i3);
                sb.append(" and type_url ");
                sb.append(strA);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        if (jr3Var == null) {
            jr3Var = this;
        }
        return yc0Var.n(jr3Var, (hv3) this.h, cls);
    }

    public String toString() {
        switch (this.f) {
            case 0:
                vz3 vz3VarF = f();
                int i = pr3.a;
                wz3 wz3VarA = zz3.A();
                int iA = vz3VarF.A();
                wz3VarA.b();
                ((zz3) wz3VarA.g).B(iA);
                for (uz3 uz3Var : vz3VarF.B()) {
                    xz3 xz3VarA = yz3.A();
                    String strA = uz3Var.B().A();
                    xz3VarA.b();
                    ((yz3) xz3VarA.g).B(strA);
                    int I = uz3Var.I();
                    xz3VarA.b();
                    ((yz3) xz3VarA.g).E(I);
                    i04 i04VarD = uz3Var.D();
                    xz3VarA.b();
                    ((yz3) xz3VarA.g).D(i04VarD);
                    int iC = uz3Var.C();
                    xz3VarA.b();
                    ((yz3) xz3VarA.g).C(iC);
                    yz3 yz3Var = (yz3) xz3VarA.d();
                    wz3VarA.b();
                    ((zz3) wz3VarA.g).C(yz3Var);
                }
                return ((zz3) wz3VarA.d()).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jr3(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public jr3(of1 of1Var) {
        this.f = 8;
        this.g = of1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jr3(int i) {
        this(new long[10], new long[10], new long[10], 2);
        this.f = i;
        switch (i) {
            case 3:
                this.g = null;
                this.h = null;
                this.i = gs3.n;
                break;
            default:
                break;
        }
    }

    public jr3(vz3 vz3Var, List list, hv3 hv3Var) throws GeneralSecurityException {
        this.f = 0;
        this.g = list;
        this.h = hv3Var;
        if (((AtomicBoolean) lu3.a.g).get()) {
            HashSet hashSet = new HashSet();
            for (uz3 uz3Var : vz3Var.B()) {
                if (!hashSet.contains(Integer.valueOf(uz3Var.C()))) {
                    hashSet.add(Integer.valueOf(uz3Var.C()));
                } else {
                    int iC = uz3Var.C();
                    throw new GeneralSecurityException(ga1.k(new StringBuilder(String.valueOf(iC).length() + 121), "KeyID ", iC, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!hashSet.contains(Integer.valueOf(vz3Var.A()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.i = null;
    }

    public jr3(qf2[] qf2VarArr) {
        this.f = 7;
        ff4 ff4Var = new ff4();
        ff4Var.m = 0;
        ff4Var.o = 0;
        ff4Var.p = 0;
        byte[] bArr = v23.b;
        ff4Var.n = bArr;
        ff4Var.q = bArr;
        xg2 xg2Var = new xg2();
        xg2Var.c = 1.0f;
        xg2Var.d = 1.0f;
        ce2 ce2Var = ce2.e;
        xg2Var.e = ce2Var;
        xg2Var.f = ce2Var;
        xg2Var.g = ce2Var;
        xg2Var.h = ce2Var;
        ByteBuffer byteBuffer = qf2.a;
        xg2Var.k = byteBuffer;
        xg2Var.l = byteBuffer.asShortBuffer();
        xg2Var.m = byteBuffer;
        xg2Var.b = -1;
        qf2[] qf2VarArr2 = {ff4Var, xg2Var};
        this.g = qf2VarArr2;
        System.arraycopy(qf2VarArr, 0, qf2VarArr2, 0, 0);
        this.h = ff4Var;
        this.i = xg2Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jr3(wt2 wt2Var) {
        this(2);
        this.f = 2;
        d(wt2Var, this);
    }

    public jr3(jr3 jr3Var) {
        this.f = 2;
        this.g = Arrays.copyOf((long[]) jr3Var.g, 10);
        this.h = Arrays.copyOf((long[]) jr3Var.h, 10);
        this.i = Arrays.copyOf((long[]) jr3Var.i, 10);
    }
}
