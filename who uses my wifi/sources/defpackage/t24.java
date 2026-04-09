package defpackage;

import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class t24 implements wv3, av3, o34, i64, ll3, ks2, vs2 {
    public static final /* synthetic */ t24 g;
    public static final /* synthetic */ t24 h;
    public static final /* synthetic */ t24 i;
    public static final /* synthetic */ t24 j;
    public static final /* synthetic */ t24 k;
    public static final /* synthetic */ t24 l;
    public static final /* synthetic */ t24 m;
    public static final /* synthetic */ t24 n;
    public static final /* synthetic */ t24 o;
    public final /* synthetic */ int f;

    static {
        byte b = 0;
        g = new t24(0, b);
        h = new t24(1, b);
        i = new t24(2, b);
        j = new t24(3, b);
        k = new t24(4, b);
        l = new t24(5, b);
        m = new t24(6, b);
        n = new t24(13, b);
        o = new t24(14, b);
    }

    @Override // defpackage.ll3
    public /* synthetic */ Object a() {
        return new w54();
    }

    @Override // defpackage.av3
    public fw3 b(gi2 gi2Var) {
        switch (this.f) {
            case 1:
                e24 e24Var = (e24) gi2Var;
                return fw3.v("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", z24.a(e24Var).a(), 4, (i04) z24.g.b(e24Var.j.c), e24Var.m);
            case 2:
                d24 d24Var = (d24) gi2Var;
                vv3 vv3Var = z24.a;
                o04 o04VarJ = p04.J();
                o04VarJ.b();
                ((p04) o04VarJ.g).L();
                r04 r04VarA = z24.a(d24Var.j);
                o04VarJ.b();
                ((p04) o04VarJ.g).M(r04VarA);
                byte[] bArrQ = a30.q((BigInteger) d24Var.k.f);
                y44 y44Var = a54.g;
                y44 y44VarN = a54.n(bArrQ, 0, bArrQ.length);
                o04VarJ.b();
                ((p04) o04VarJ.g).N(y44VarN);
                byte[] bArrQ2 = a30.q((BigInteger) d24Var.l.f);
                y44 y44VarN2 = a54.n(bArrQ2, 0, bArrQ2.length);
                o04VarJ.b();
                ((p04) o04VarJ.g).O(y44VarN2);
                byte[] bArrQ3 = a30.q((BigInteger) d24Var.m.f);
                y44 y44VarN3 = a54.n(bArrQ3, 0, bArrQ3.length);
                o04VarJ.b();
                ((p04) o04VarJ.g).P(y44VarN3);
                byte[] bArrQ4 = a30.q((BigInteger) d24Var.n.f);
                y44 y44VarN4 = a54.n(bArrQ4, 0, bArrQ4.length);
                o04VarJ.b();
                ((p04) o04VarJ.g).Q(y44VarN4);
                byte[] bArrQ5 = a30.q((BigInteger) d24Var.o.f);
                y44 y44VarN5 = a54.n(bArrQ5, 0, bArrQ5.length);
                o04VarJ.b();
                ((p04) o04VarJ.g).R(y44VarN5);
                byte[] bArrQ6 = a30.q((BigInteger) d24Var.p.f);
                y44 y44VarN6 = a54.n(bArrQ6, 0, bArrQ6.length);
                o04VarJ.b();
                ((p04) o04VarJ.g).S(y44VarN6);
                y44 y44VarA = ((p04) o04VarJ.d()).a();
                tb1 tb1Var = z24.g;
                e24 e24Var2 = d24Var.j;
                return fw3.v("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", y44VarA, 3, (i04) tb1Var.b(e24Var2.j.c), e24Var2.m);
            case 3:
            default:
                k24 k24Var = (k24) gi2Var;
                vv3 vv3Var2 = c34.a;
                w04 w04VarJ = x04.J();
                w04VarJ.b();
                ((x04) w04VarJ.g).L();
                z04 z04VarB = c34.b(k24Var.j);
                w04VarJ.b();
                ((x04) w04VarJ.g).M(z04VarB);
                byte[] bArrQ7 = a30.q((BigInteger) k24Var.k.f);
                y44 y44Var2 = a54.g;
                y44 y44VarN7 = a54.n(bArrQ7, 0, bArrQ7.length);
                w04VarJ.b();
                ((x04) w04VarJ.g).N(y44VarN7);
                byte[] bArrQ8 = a30.q((BigInteger) k24Var.l.f);
                y44 y44VarN8 = a54.n(bArrQ8, 0, bArrQ8.length);
                w04VarJ.b();
                ((x04) w04VarJ.g).O(y44VarN8);
                byte[] bArrQ9 = a30.q((BigInteger) k24Var.m.f);
                y44 y44VarN9 = a54.n(bArrQ9, 0, bArrQ9.length);
                w04VarJ.b();
                ((x04) w04VarJ.g).P(y44VarN9);
                byte[] bArrQ10 = a30.q((BigInteger) k24Var.n.f);
                y44 y44VarN10 = a54.n(bArrQ10, 0, bArrQ10.length);
                w04VarJ.b();
                ((x04) w04VarJ.g).Q(y44VarN10);
                byte[] bArrQ11 = a30.q((BigInteger) k24Var.o.f);
                y44 y44VarN11 = a54.n(bArrQ11, 0, bArrQ11.length);
                w04VarJ.b();
                ((x04) w04VarJ.g).R(y44VarN11);
                byte[] bArrQ12 = a30.q((BigInteger) k24Var.p.f);
                y44 y44VarN12 = a54.n(bArrQ12, 0, bArrQ12.length);
                w04VarJ.b();
                ((x04) w04VarJ.g).S(y44VarN12);
                y44 y44VarA2 = ((x04) w04VarJ.d()).a();
                tb1 tb1Var2 = c34.g;
                l24 l24Var = k24Var.j;
                return fw3.v("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", y44VarA2, 3, (i04) tb1Var2.b(l24Var.j.c), l24Var.m);
            case 4:
                l24 l24Var2 = (l24) gi2Var;
                return fw3.v("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", c34.b(l24Var2).a(), 4, (i04) c34.g.b(l24Var2.j.c), l24Var2.m);
        }
    }

    @Override // defpackage.ks2
    /* renamed from: c */
    public /* synthetic */ void mo12c(Object obj) {
        switch (this.f) {
            case 14:
                break;
            case 15:
                ((zt1) obj).e();
                break;
            case 16:
                int i2 = ya4.g0;
                ((zt1) obj).m();
                break;
            case 17:
                int i3 = ya4.g0;
                ((zt1) obj).E();
                break;
            case 18:
            default:
                break;
            case 19:
                break;
            case 20:
                break;
            case zy1.zzm /* 21 */:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
    }

    @Override // defpackage.o34
    public /* bridge */ /* synthetic */ Object d(String str, Provider provider) {
        switch (this.f) {
            case 7:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 8:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // defpackage.vs2
    public /* synthetic */ void e(Object obj, of4 of4Var) {
        ((zt1) obj).a();
    }

    @Override // defpackage.wv3
    public gw3 f(mr3 mr3Var) {
        switch (this.f) {
            case 0:
                vv3 vv3Var = u24.a;
                pz3 pz3VarE = qz3.E();
                pz3VarE.g("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                pz3VarE.h(bz3.C().a());
                pz3VarE.i((i04) u24.g.b(((q14) mr3Var).a));
                return gw3.D((qz3) pz3VarE.d());
            case 3:
                c24 c24Var = (c24) mr3Var;
                vv3 vv3Var2 = z24.a;
                pz3 pz3VarE2 = qz3.E();
                pz3VarE2.g("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                k04 k04VarE = l04.E();
                m04 m04VarB = n04.B();
                gz3 gz3Var = (gz3) z24.h.b(c24Var.d);
                m04VarB.b();
                ((n04) m04VarB.g).D(gz3Var);
                n04 n04Var = (n04) m04VarB.d();
                k04VarE.b();
                ((l04) k04VarE.g).F(n04Var);
                int i2 = c24Var.a;
                k04VarE.b();
                ((l04) k04VarE.g).G(i2);
                byte[] bArrQ = a30.q(c24Var.b);
                y44 y44Var = a54.g;
                y44 y44VarN = a54.n(bArrQ, 0, bArrQ.length);
                k04VarE.b();
                ((l04) k04VarE.g).H(y44VarN);
                pz3VarE2.h(((l04) k04VarE.d()).a());
                pz3VarE2.i((i04) z24.g.b(c24Var.c));
                return gw3.D((qz3) pz3VarE2.d());
            default:
                j24 j24Var = (j24) mr3Var;
                vv3 vv3Var3 = c34.a;
                pz3 pz3VarE3 = qz3.E();
                pz3VarE3.g("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
                s04 s04VarE = t04.E();
                v04 v04VarA = c34.a(j24Var);
                s04VarE.b();
                ((t04) s04VarE.g).F(v04VarA);
                int i3 = j24Var.a;
                s04VarE.b();
                ((t04) s04VarE.g).G(i3);
                byte[] bArrQ2 = a30.q(j24Var.b);
                y44 y44Var2 = a54.g;
                y44 y44VarN2 = a54.n(bArrQ2, 0, bArrQ2.length);
                s04VarE.b();
                ((t04) s04VarE.g).H(y44VarN2);
                pz3VarE3.h(((t04) s04VarE.d()).a());
                pz3VarE3.i((i04) c34.g.b(j24Var.c));
                return gw3.D((qz3) pz3VarE3.d());
        }
    }

    @Override // defpackage.i64
    public boolean g(Class cls) {
        return false;
    }

    @Override // defpackage.i64
    public r64 j(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    public /* synthetic */ t24(int i2) {
        this.f = 16;
    }

    public /* synthetic */ t24(int i2, byte b) {
        this.f = i2;
    }
}
