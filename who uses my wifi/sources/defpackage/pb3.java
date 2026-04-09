package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pb3 implements rj4, ws2, np2, gj4 {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;

    public /* synthetic */ pb3(int i) {
        this.f = i;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.eu2
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo18a() {
        return new va4((mo1) ((ls2) this.g).mo18a(), ((uk1) this.h).mo18a(), (z42) ((ls2) this.i).mo18a());
    }

    @Override // defpackage.rj4
    public synchronized void b(cj1 cj1Var) {
        ((w54) this.i).c.b(cj1Var);
        while (cj1Var != null) {
            qj4 qj4Var = (qj4) cj1Var.h;
            qj4Var.getClass();
            k(qj4Var);
            cj1Var = (cj1) cj1Var.i;
            if (cj1Var == null || ((qj4) cj1Var.h) == null) {
                cj1Var = null;
            }
        }
    }

    @Override // defpackage.np2
    /* renamed from: c */
    public /* synthetic */ void mo6c(Object obj) {
        ((rh4) obj).r(0, (kh4) ((wt2) this.g).g, (ch4) this.h, (hh4) this.i);
    }

    @Override // defpackage.rj4
    public synchronized void d(qj4 qj4Var) {
        ((w54) this.i).c.d(qj4Var);
        k(qj4Var);
    }

    @Override // defpackage.gj4
    public sn3 e(int i, d02 d02Var, int[] iArr) {
        vm3 vm3Var = xm3.g;
        ob1.z("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < d02Var.a) {
            int i4 = i;
            d02 d02Var2 = d02Var;
            fj4 fj4Var = new fj4(i4, d02Var2, i2, (dj4) this.i, iArr[i2], (String) this.g, (String) this.h);
            int length = objArrCopyOf.length;
            int i5 = i3 + 1;
            int iD = rm3.d(length, i5);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i3] = fj4Var;
            i2++;
            i3 = i5;
            i = i4;
            d02Var = d02Var2;
        }
        return xm3.o(objArrCopyOf, i3);
    }

    public es3 f() throws GeneralSecurityException {
        yf3 yf3Var;
        v34 v34VarB;
        hs3 hs3Var = (hs3) this.g;
        if (hs3Var == null || (yf3Var = (yf3) this.h) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (hs3Var.a != ((v34) yf3Var.f).a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (hs3Var.a() && ((Integer) this.i) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((hs3) this.g).a() && ((Integer) this.i) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        gs3 gs3Var = ((hs3) this.g).c;
        if (gs3Var == gs3.j) {
            v34VarB = sv3.a;
        } else if (gs3Var == gs3.i) {
            v34VarB = sv3.a(((Integer) this.i).intValue());
        } else {
            if (gs3Var != gs3.h) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(((hs3) this.g).c)));
            }
            v34VarB = sv3.b(((Integer) this.i).intValue());
        }
        return new es3((hs3) this.g, (yf3) this.h, v34VarB, (Integer) this.i);
    }

    public ns3 g() throws GeneralSecurityException {
        yf3 yf3Var;
        v34 v34VarB;
        qs3 qs3Var = (qs3) this.g;
        if (qs3Var == null || (yf3Var = (yf3) this.h) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (qs3Var.a != ((v34) yf3Var.f).a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (qs3Var.a() && ((Integer) this.i) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((qs3) this.g).a() && ((Integer) this.i) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ps3 ps3Var = ((qs3) this.g).b;
        if (ps3Var == ps3.j) {
            v34VarB = sv3.a;
        } else if (ps3Var == ps3.i) {
            v34VarB = sv3.a(((Integer) this.i).intValue());
        } else {
            if (ps3Var != ps3.h) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(((qs3) this.g).b)));
            }
            v34VarB = sv3.b(((Integer) this.i).intValue());
        }
        return new ns3((qs3) this.g, (yf3) this.h, v34VarB, (Integer) this.i);
    }

    public pw3 h() throws GeneralSecurityException {
        yf3 yf3Var;
        v34 v34VarA;
        rw3 rw3Var = (rw3) this.g;
        if (rw3Var == null || (yf3Var = (yf3) this.h) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (rw3Var.a != ((v34) yf3Var.f).a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (rw3Var.a() && ((Integer) this.i) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((rw3) this.g).a() && ((Integer) this.i) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        gs3 gs3Var = ((rw3) this.g).c;
        if (gs3Var == gs3.n) {
            v34VarA = sv3.a;
        } else if (gs3Var == gs3.m || gs3Var == gs3.l) {
            v34VarA = sv3.a(((Integer) this.i).intValue());
        } else {
            if (gs3Var != gs3.k) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((rw3) this.g).c)));
            }
            v34VarA = sv3.b(((Integer) this.i).intValue());
        }
        return new pw3((rw3) this.g, (yf3) this.h, v34VarA, (Integer) this.i);
    }

    public uw3 i() throws GeneralSecurityException {
        yf3 yf3Var;
        v34 v34VarA;
        zw3 zw3Var = (zw3) this.g;
        if (zw3Var == null || (yf3Var = (yf3) this.h) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zw3Var.a != ((v34) yf3Var.f).a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zw3Var.a() && ((Integer) this.i) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((zw3) this.g).a() && ((Integer) this.i) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        yw3 yw3Var = ((zw3) this.g).c;
        if (yw3Var == yw3.e) {
            v34VarA = sv3.a;
        } else if (yw3Var == yw3.d || yw3Var == yw3.c) {
            v34VarA = sv3.a(((Integer) this.i).intValue());
        } else {
            if (yw3Var != yw3.b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((zw3) this.g).c)));
            }
            v34VarA = sv3.b(((Integer) this.i).intValue());
        }
        return new uw3((zw3) this.g, (yf3) this.h, v34VarA, (Integer) this.i);
    }

    public e24 j() {
        v34 v34VarA;
        if (((c24) this.g) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.h;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        c24 c24Var = (c24) this.g;
        int i = c24Var.a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(ga1.l(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length()), "Got modulus size ", iBitLength, ", but parameters requires modulus size ", i));
        }
        if (c24Var.a() && ((Integer) this.i) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((c24) this.g).a() && ((Integer) this.i) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        b24 b24Var = ((c24) this.g).c;
        if (b24Var == b24.e) {
            v34VarA = sv3.a;
        } else if (b24Var == b24.d || b24Var == b24.c) {
            v34VarA = sv3.a(((Integer) this.i).intValue());
        } else {
            if (b24Var != b24.b) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(((c24) this.g).c)));
            }
            v34VarA = sv3.b(((Integer) this.i).intValue());
        }
        return new e24((c24) this.g, (BigInteger) this.h, v34VarA, (Integer) this.i);
    }

    public void k(qj4 qj4Var) {
        xd4 xd4Var = (xd4) ((HashMap) this.g).remove(qj4Var);
        xd4Var.getClass();
        i54 i54Var = (i54) ((w54) this.i).n.get(xd4Var);
        if (i54Var != null) {
            synchronized (i54Var) {
                i54Var.d--;
            }
        }
    }

    @Override // defpackage.rj4
    public synchronized void l() {
        ((w54) this.i).c.l();
    }

    public String toString() {
        switch (this.f) {
            case 1:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.g);
                sb.append('{');
                wt2 wt2Var = (wt2) ((wt2) this.h).h;
                String str = "";
                while (wt2Var != null) {
                    Object obj = wt2Var.g;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    wt2Var = (wt2) wt2Var.h;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pb3(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public pb3(String str, s2 s2Var) {
        this.f = 0;
        this.g = str;
        this.i = s2Var;
    }

    public /* synthetic */ pb3(dj4 dj4Var, String str, String str2) {
        this.f = 11;
        this.i = dj4Var;
        this.g = str;
        this.h = str2;
    }

    public pb3(w54 w54Var, xd4 xd4Var) {
        this.f = 7;
        this.i = w54Var;
        this.g = new HashMap();
        this.h = xd4Var;
    }

    @Override // defpackage.rj4, defpackage.eu2
    /* renamed from: a */
    public synchronized qj4 mo18a() {
        qj4 qj4VarMo18a;
        w54 w54Var = (w54) this.i;
        vj4 vj4Var = w54Var.c;
        HashMap map = (HashMap) this.g;
        qj4VarMo18a = vj4Var.mo18a();
        xd4 xd4Var = (xd4) this.h;
        map.put(qj4VarMo18a, xd4Var);
        i54 i54Var = (i54) w54Var.n.get(xd4Var);
        if (i54Var != null) {
            synchronized (i54Var) {
                i54Var.d++;
            }
        }
        return qj4VarMo18a;
    }

    public pb3(df4 df4Var) {
        this.f = 9;
        this.i = df4Var;
        this.g = new Handler(Looper.myLooper());
        this.h = new cf4(this);
    }

    public pb3(String str) {
        this.f = 1;
        wt2 wt2Var = new wt2(5);
        this.h = wt2Var;
        this.i = wt2Var;
        this.g = str;
    }
}
