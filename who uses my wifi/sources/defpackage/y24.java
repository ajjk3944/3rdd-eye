package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class y24 implements uv3, xu3, o34, ks2, gp0 {
    public static final /* synthetic */ y24 g = new y24(0);
    public static final /* synthetic */ y24 h = new y24(1);
    public static final /* synthetic */ y24 i = new y24(2);
    public static final /* synthetic */ y24 j = new y24(3);
    public static final /* synthetic */ y24 k = new y24(4);
    public static final /* synthetic */ y24 l = new y24(5);
    public static final /* synthetic */ y24 m = new y24(16);
    public final /* synthetic */ int f;

    public /* synthetic */ y24(int i2) {
        this.f = i2;
    }

    public static final x54 a(long j2, Object obj) {
        x54 x54Var = (x54) g74.k(j2, obj);
        if (((t44) x54Var).f) {
            return x54Var;
        }
        int size = x54Var.size();
        x54 x54VarZ = x54Var.z(size == 0 ? 10 : size + size);
        g74.l(obj, j2, x54VarZ);
        return x54VarZ;
    }

    public static final void b(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z, mv2 mv2Var) {
        if (adOverlayInfoParcel.p == 4 && adOverlayInfoParcel.h == null) {
            fd1 fd1Var = adOverlayInfoParcel.g;
            if (fd1Var != null) {
                fd1Var.C();
            }
            xp2 xp2Var = adOverlayInfoParcel.z;
            if (xp2Var != null) {
                xp2Var.s0();
            }
            Activity activityG = adOverlayInfoParcel.i.g();
            fc2 fc2Var = adOverlayInfoParcel.f;
            Context context2 = (fc2Var == null || !fc2Var.o || activityG == null) ? context : activityG;
            us0 us0Var = hg4.C.a;
            us0.t(context2, fc2Var, adOverlayInfoParcel.n, fc2Var != null ? fc2Var.n : null, mv2Var, adOverlayInfoParcel.v);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.r.i);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) tw1.e.c.a(mz1.Td)).booleanValue()) {
            lf4 lf4Var = hg4.C.c;
            lf4.v(context, intent, mv2Var, adOverlayInfoParcel.v);
        } else {
            lf4 lf4Var2 = hg4.C.c;
            lf4.s(context, intent);
        }
    }

    public static String f(byte[] bArr, int i2, int i3) {
        int i4;
        int length = bArr.length;
        if ((((length - i2) - i3) | i2 | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i5 = i2 + i3;
        char[] cArr = new char[i3];
        int i6 = 0;
        while (i2 < i5) {
            byte b = bArr[i2];
            if (b < 0) {
                break;
            }
            i2++;
            cArr[i6] = (char) b;
            i6++;
        }
        int i7 = i6;
        while (i2 < i5) {
            int i8 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                cArr[i7] = (char) b2;
                i7++;
                i2 = i8;
                while (i2 < i5) {
                    byte b3 = bArr[i2];
                    if (b3 >= 0) {
                        i2++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                }
            } else {
                if (b2 < -32) {
                    if (i8 >= i5) {
                        throw new a64("Protocol message had invalid UTF-8.");
                    }
                    i4 = i7 + 1;
                    i2 += 2;
                    i30.m0(b2, bArr[i8], cArr, i7);
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        throw new a64("Protocol message had invalid UTF-8.");
                    }
                    i4 = i7 + 1;
                    int i9 = i2 + 2;
                    i2 += 3;
                    i30.o0(b2, bArr[i8], bArr[i9], cArr, i7);
                } else {
                    if (i8 >= i5 - 2) {
                        throw new a64("Protocol message had invalid UTF-8.");
                    }
                    byte b4 = bArr[i8];
                    int i10 = i2 + 3;
                    byte b5 = bArr[i2 + 2];
                    i2 += 4;
                    i30.q0(b2, b4, b5, bArr[i10], cArr, i7);
                    i7 += 2;
                }
                i7 = i4;
            }
        }
        return new String(cArr, 0, i7);
    }

    public static final g64 h(Object obj, Object obj2) {
        g64 g64VarA = (g64) obj;
        g64 g64Var = (g64) obj2;
        if (!g64Var.isEmpty()) {
            if (!g64VarA.f) {
                g64VarA = g64VarA.a();
            }
            g64VarA.c();
            if (!g64Var.isEmpty()) {
                g64VarA.putAll(g64Var);
            }
        }
        return g64VarA;
    }

    public static final String i(ByteBuffer byteBuffer, int i2, int i3) throws a64 {
        int i4;
        if ((((byteBuffer.limit() - i2) - i3) | i2 | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i5 = i2 + i3;
        char[] cArr = new char[i3];
        int i6 = 0;
        while (i2 < i5) {
            byte b = byteBuffer.get(i2);
            if (b < 0) {
                break;
            }
            i2++;
            cArr[i6] = (char) b;
            i6++;
        }
        int i7 = i6;
        while (i2 < i5) {
            int i8 = i2 + 1;
            byte b2 = byteBuffer.get(i2);
            if (b2 >= 0) {
                cArr[i7] = (char) b2;
                i7++;
                i2 = i8;
                while (i2 < i5) {
                    byte b3 = byteBuffer.get(i2);
                    if (b3 >= 0) {
                        i2++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                }
            } else {
                if (b2 < -32) {
                    if (i8 >= i5) {
                        throw new a64("Protocol message had invalid UTF-8.");
                    }
                    i4 = i7 + 1;
                    i2 += 2;
                    i30.m0(b2, byteBuffer.get(i8), cArr, i7);
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        throw new a64("Protocol message had invalid UTF-8.");
                    }
                    i4 = i7 + 1;
                    int i9 = i2 + 2;
                    i2 += 3;
                    i30.o0(b2, byteBuffer.get(i8), byteBuffer.get(i9), cArr, i7);
                } else {
                    if (i8 >= i5 - 2) {
                        throw new a64("Protocol message had invalid UTF-8.");
                    }
                    byte b4 = byteBuffer.get(i8);
                    int i10 = i2 + 3;
                    byte b5 = byteBuffer.get(i2 + 2);
                    i2 += 4;
                    i30.q0(b2, b4, b5, byteBuffer.get(i10), cArr, i7);
                    i7 += 2;
                }
                i7 = i4;
            }
        }
        return new String(cArr, 0, i7);
    }

    @Override // defpackage.gp0
    public void accept(Object obj, Object obj2) {
        gh3 gh3Var = (gh3) ((kn2) obj).t();
        hf0 hf0Var = new hf0((k01) obj2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i2 = bc2.a;
        parcelObtain.writeInt(1);
        uk2.O(parcelObtain, uk2.I(parcelObtain, 20293));
        parcelObtain.writeStrongBinder(hf0Var);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            gh3Var.f.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // defpackage.ks2
    /* renamed from: c */
    public void mo12c(Object obj) {
        switch (this.f) {
            case 13:
                ((zt1) obj).u();
                break;
            case 14:
                int i2 = ya4.g0;
                ((zt1) obj).b();
                break;
            case 15:
                int i3 = ya4.g0;
                ((zt1) obj).v();
                break;
            case 16:
                int i4 = ya4.g0;
                ((zt1) obj).G(new b84(2, new rg("Player release timed out."), 1003));
                break;
            case 17:
                int i5 = ya4.g0;
                ((zt1) obj).h();
                break;
            case 18:
            case 23:
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
            case 6:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 7:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 8:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // defpackage.uv3
    public mr3 e(gw3 gw3Var) throws GeneralSecurityException {
        switch (this.f) {
            case 0:
                vv3 vv3Var = z24.a;
                qz3 qz3Var = (qz3) gw3Var.h;
                if (!qz3Var.A().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var.A())));
                }
                try {
                    a54 a54VarB = qz3Var.B();
                    h54 h54Var = h54.a;
                    int i2 = u44.a;
                    l04 l04VarD = l04.D(a54VarB, h54.b);
                    BigInteger bigInteger = c24.e;
                    z14 z14Var = new z14();
                    z14Var.c = (a24) z24.h.c(l04VarD.A().A());
                    z14Var.b = new BigInteger(1, l04VarD.C().p());
                    z14Var.a(l04VarD.B());
                    z14Var.d = (b24) z24.g.c(qz3Var.C());
                    return z14Var.b();
                } catch (a64 e) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e);
                }
            default:
                vv3 vv3Var2 = c34.a;
                qz3 qz3Var2 = (qz3) gw3Var.h;
                if (!qz3Var2.A().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var2.A())));
                }
                try {
                    a54 a54VarB2 = qz3Var2.B();
                    h54 h54Var2 = h54.a;
                    int i3 = u44.a;
                    t04 t04VarD = t04.D(a54VarB2, h54.b);
                    BigInteger bigInteger2 = j24.g;
                    g24 g24Var = new g24();
                    tb1 tb1Var = c34.h;
                    g24Var.c = (h24) tb1Var.c(t04VarD.A().A());
                    g24Var.d = (h24) tb1Var.c(t04VarD.A().B());
                    g24Var.b = new BigInteger(1, t04VarD.C().p());
                    g24Var.a(t04VarD.B());
                    g24Var.b(t04VarD.A().C());
                    g24Var.f = (i24) c34.g.c(qz3Var2.C());
                    return g24Var.c();
                } catch (a64 e2) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e2);
                }
        }
    }

    @Override // defpackage.xu3
    public gi2 g(fw3 fw3Var) throws GeneralSecurityException {
        int i2 = 6;
        int i3 = 5;
        boolean z = false;
        switch (this.f) {
            case 1:
                vv3 vv3Var = z24.a;
                String str = (String) fw3Var.g;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    a54 a54Var = (a54) fw3Var.i;
                    h54 h54Var = h54.a;
                    int i4 = u44.a;
                    r04 r04VarE = r04.E(a54Var, h54.b);
                    if (r04VarE.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, r04VarE.C().p());
                    int iBitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = c24.e;
                    z14 z14Var = new z14();
                    z14Var.c = (a24) z24.h.c(r04VarE.B().A());
                    z14Var.b = new BigInteger(1, r04VarE.D().p());
                    z14Var.a(iBitLength);
                    z14Var.d = (b24) z24.g.c((i04) fw3Var.j);
                    c24 c24VarB = z14Var.b();
                    pb3 pb3Var = new pb3(i2);
                    pb3Var.g = c24VarB;
                    pb3Var.h = bigInteger;
                    pb3Var.i = (Integer) fw3Var.k;
                    return pb3Var.j();
                } catch (a64 | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            case 2:
                vv3 vv3Var2 = z24.a;
                String str2 = (String) fw3Var.g;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                }
                try {
                    a54 a54Var2 = (a54) fw3Var.i;
                    h54 h54Var2 = h54.a;
                    int i5 = u44.a;
                    p04 p04VarI = p04.I(a54Var2, h54.b);
                    if (p04VarI.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    r04 r04VarB = p04VarI.B();
                    if (r04VarB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger3 = new BigInteger(1, r04VarB.C().p());
                    int iBitLength2 = bigInteger3.bitLength();
                    BigInteger bigInteger4 = new BigInteger(1, r04VarB.D().p());
                    BigInteger bigInteger5 = c24.e;
                    z14 z14Var2 = new z14();
                    z14Var2.c = (a24) z24.h.c(r04VarB.B().A());
                    z14Var2.b = bigInteger4;
                    z14Var2.a(iBitLength2);
                    z14Var2.d = (b24) z24.g.c((i04) fw3Var.j);
                    c24 c24VarB2 = z14Var2.b();
                    pb3 pb3Var2 = new pb3(i2);
                    pb3Var2.g = c24VarB2;
                    pb3Var2.h = bigInteger3;
                    pb3Var2.i = (Integer) fw3Var.k;
                    e24 e24VarJ = pb3Var2.j();
                    uk1 uk1Var = new uk1(z);
                    uk1Var.f = e24VarJ;
                    x34 x34VarB = z24.b(p04VarI.D());
                    x34 x34VarB2 = z24.b(p04VarI.E());
                    uk1Var.h = x34VarB;
                    uk1Var.i = x34VarB2;
                    uk1Var.g = z24.b(p04VarI.C());
                    x34 x34VarB3 = z24.b(p04VarI.F());
                    x34 x34VarB4 = z24.b(p04VarI.G());
                    uk1Var.j = x34VarB3;
                    uk1Var.k = x34VarB4;
                    uk1Var.l = z24.b(p04VarI.H());
                    return uk1Var.n();
                } catch (a64 | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
                }
            case 3:
            default:
                vv3 vv3Var3 = c34.a;
                String str3 = (String) fw3Var.g;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str3)));
                }
                try {
                    a54 a54Var3 = (a54) fw3Var.i;
                    h54 h54Var3 = h54.a;
                    int i6 = u44.a;
                    x04 x04VarI = x04.I(a54Var3, h54.b);
                    if (x04VarI.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    z04 z04VarB = x04VarI.B();
                    if (z04VarB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger6 = new BigInteger(1, z04VarB.C().p());
                    int iBitLength3 = bigInteger6.bitLength();
                    BigInteger bigInteger7 = new BigInteger(1, z04VarB.D().p());
                    BigInteger bigInteger8 = j24.g;
                    g24 g24Var = new g24();
                    tb1 tb1Var = c34.h;
                    g24Var.c = (h24) tb1Var.c(z04VarB.B().A());
                    g24Var.d = (h24) tb1Var.c(z04VarB.B().B());
                    g24Var.b = bigInteger7;
                    g24Var.a(iBitLength3);
                    g24Var.b(z04VarB.B().C());
                    g24Var.f = (i24) c34.g.c((i04) fw3Var.j);
                    j24 j24VarC = g24Var.c();
                    jr3 jr3Var = new jr3(i3, z);
                    jr3Var.g = j24VarC;
                    jr3Var.h = bigInteger6;
                    jr3Var.i = (Integer) fw3Var.k;
                    l24 l24VarN = jr3Var.n();
                    uk1 uk1Var2 = new uk1(z);
                    uk1Var2.f = l24VarN;
                    x34 x34VarC = c34.c(x04VarI.D());
                    x34 x34VarC2 = c34.c(x04VarI.E());
                    uk1Var2.h = x34VarC;
                    uk1Var2.i = x34VarC2;
                    uk1Var2.g = c34.c(x04VarI.C());
                    x34 x34VarC3 = c34.c(x04VarI.F());
                    x34 x34VarC4 = c34.c(x04VarI.G());
                    uk1Var2.j = x34VarC3;
                    uk1Var2.k = x34VarC4;
                    uk1Var2.l = c34.c(x04VarI.H());
                    return uk1Var2.o();
                } catch (a64 | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
            case 4:
                vv3 vv3Var4 = c34.a;
                String str4 = (String) fw3Var.g;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str4)));
                }
                try {
                    a54 a54Var4 = (a54) fw3Var.i;
                    h54 h54Var4 = h54.a;
                    int i7 = u44.a;
                    z04 z04VarE = z04.E(a54Var4, h54.b);
                    if (z04VarE.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger9 = new BigInteger(1, z04VarE.C().p());
                    int iBitLength4 = bigInteger9.bitLength();
                    BigInteger bigInteger10 = j24.g;
                    g24 g24Var2 = new g24();
                    tb1 tb1Var2 = c34.h;
                    g24Var2.c = (h24) tb1Var2.c(z04VarE.B().A());
                    g24Var2.d = (h24) tb1Var2.c(z04VarE.B().B());
                    g24Var2.b = new BigInteger(1, z04VarE.D().p());
                    g24Var2.a(iBitLength4);
                    g24Var2.b(z04VarE.B().C());
                    g24Var2.f = (i24) c34.g.c((i04) fw3Var.j);
                    j24 j24VarC2 = g24Var2.c();
                    jr3 jr3Var2 = new jr3(i3, z);
                    jr3Var2.g = j24VarC2;
                    jr3Var2.h = bigInteger9;
                    jr3Var2.i = (Integer) fw3Var.k;
                    return jr3Var2.n();
                } catch (a64 | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
                }
        }
    }

    public /* synthetic */ y24(int i2, int i3) {
        this.f = 15;
    }

    public /* synthetic */ y24(int i2, Object obj) {
        this.f = i2;
    }

    public /* synthetic */ y24(fk1 fk1Var, int i2) {
        this.f = 17;
    }

    public /* synthetic */ y24(boolean z) {
        this.f = 13;
    }
}
