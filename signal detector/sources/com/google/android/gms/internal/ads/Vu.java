package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Vu implements BD, w.i, KD, TG, InterfaceC1172fo, JP {

    /* renamed from: c, reason: collision with root package name */
    public static Vu f12104c;

    /* renamed from: a, reason: collision with root package name */
    public Object f12105a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12106b;

    public Vu(int i) {
        switch (i) {
            case 6:
                this(new C2041vw(6), new long[10]);
                break;
            case 9:
                this.f12105a = null;
                this.f12106b = null;
                break;
            default:
                C1014cu c1014cu = new C1014cu(3);
                this.f12105a = c1014cu;
                this.f12106b = new C1448kw(0, c1014cu);
                break;
        }
    }

    public static void z(Vu vu, C1879sw c1879sw) {
        C2041vw c2041vw = (C2041vw) c1879sw.f16823b;
        C2041vw c2041vw2 = (C2041vw) vu.f12105a;
        long[] jArr = (long[]) c2041vw2.f17369b;
        long[] jArr2 = (long[]) c2041vw.f17369b;
        long[] jArr3 = (long[]) c1879sw.f16824c;
        AbstractC2022vd.G(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) c2041vw2.f17370c;
        long[] jArr5 = (long[]) c2041vw.f17370c;
        long[] jArr6 = (long[]) c2041vw.f17371d;
        AbstractC2022vd.G(jArr4, jArr5, jArr6);
        AbstractC2022vd.G((long[]) c2041vw2.f17371d, jArr6, jArr3);
        AbstractC2022vd.G((long[]) vu.f12106b, jArr2, jArr5);
    }

    public void A(InterfaceC2069wN interfaceC2069wN) {
        ((List) this.f12106b).add(interfaceC2069wN);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public ByteBuffer B(int i) {
        return ((MediaCodec) this.f12105a).getInputBuffer(i);
    }

    public void C(Object obj, String str) throws IOException {
        boolean zCommit;
        String str2 = (String) this.f12105a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f12106b;
        if (obj instanceof String) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                String strValueOf = String.valueOf(obj.getClass());
                Log.e("GpidLifecycleSPHandler", AbstractC1135f5.o(new StringBuilder(strValueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", strValueOf, " for app ", str2));
                throw new IOException(AbstractC1135f5.o(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException(AbstractC1135f5.o(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    public boolean D(int i) {
        return ((C1264hP) this.f12105a).f14493a.get(i);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public void E(int i) {
        ((MediaCodec) this.f12105a).releaseOutputBuffer(i, false);
    }

    public YI F() throws GeneralSecurityException {
        ECPoint eCPoint;
        ZI zi = (ZI) this.f12105a;
        if (zi == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        Wu wu = (Wu) this.f12106b;
        if (wu == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigInteger = (BigInteger) wu.f12337b;
        ECPoint eCPoint2 = zi.f12813d;
        WI wi = zi.f12812c.f12409b;
        BigInteger order = wi.f12200b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        ECParameterSpec eCParameterSpec = wi.f12200b;
        if (!BF.b(eCParameterSpec, BF.f7322a) && !BF.b(eCParameterSpec, BF.f7323b) && !BF.b(eCParameterSpec, BF.f7324c)) {
            throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
        }
        if (bigInteger.signum() != 1) {
            throw new GeneralSecurityException("k must be positive");
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            throw new GeneralSecurityException("k must be smaller than the order of the generator");
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        BF.a(generator, curve);
        BigInteger a6 = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerC = BF.c(curve);
        AF afD = BF.d(ECPoint.POINT_INFINITY, bigIntegerC);
        AF afD2 = BF.d(generator, bigIntegerC);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                afD = BF.f(afD, afD2, a6, bigIntegerC);
                afD2 = BF.e(afD2, a6, bigIntegerC);
            } else {
                afD2 = BF.f(afD, afD2, a6, bigIntegerC);
                afD = BF.e(afD, a6, bigIntegerC);
            }
        }
        if (afD.f6972c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = afD.f6972c.modInverse(bigIntegerC);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerC);
            eCPoint = new ECPoint(afD.f6970a.multiply(bigIntegerMod).mod(bigIntegerC), afD.f6971b.multiply(bigIntegerMod).mod(bigIntegerC).multiply(bigIntegerModInverse).mod(bigIntegerC));
        }
        BF.a(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new YI((ZI) this.f12105a, (Wu) this.f12106b);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public C2123xN G() {
        return new C2123xN((List) this.f12105a, (List) this.f12106b);
    }

    public Object H(Enum r32) throws GeneralSecurityException {
        Object obj = ((Map) this.f12105a).get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }

    public void I(String str) throws IOException {
        if (((SharedPreferences) this.f12106b).edit().remove(str).commit()) {
            return;
        }
        String str2 = (String) this.f12105a;
        throw new IOException(AbstractC1135f5.o(new StringBuilder(str.length() + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    public void J(BN bn) {
        synchronized (bn) {
        }
        Handler handler = (Handler) this.f12105a;
        if (handler != null) {
            handler.post(new RunnableC0786Vp(this, 26, bn));
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: a */
    public XD mo10a() {
        W1 w12 = (W1) this.f12106b;
        return new C1360jF((Context) this.f12105a, new CG(null, w12.f12141a, w12.f12142b, false, (C1879sw) w12.f12143c));
    }

    @Override // com.google.android.gms.internal.ads.JP
    public int b() {
        return ((MediaCodec) this.f12105a).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public ByteBuffer c(int i) {
        return ((MediaCodec) this.f12105a).getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.JP
    public MediaFormat e() {
        return ((MediaCodec) this.f12105a).getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.JP
    public void f(ArrayList arrayList) {
        ((MediaCodec) this.f12105a).subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public void g(Bundle bundle) {
        ((MediaCodec) this.f12105a).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public void h(Surface surface) {
        ((MediaCodec) this.f12105a).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public void i() {
        C1879sw c1879sw = (C1879sw) this.f12106b;
        MediaCodec mediaCodec = (MediaCodec) this.f12105a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && c1879sw != null) {
                c1879sw.f(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && c1879sw != null) {
                c1879sw.f(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.TG
    public byte[] j(int i, byte[] bArr) {
        return bArr.length <= 64 ? ((UG) this.f12105a).j(i, bArr) : ((C1879sw) this.f12106b).j(i, bArr);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public void k() {
        ((MediaCodec) this.f12105a).flush();
    }

    @Override // com.google.android.gms.internal.ads.JP
    public int l(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f12105a).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.JP
    public void m(int i) {
        ((MediaCodec) this.f12105a).setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public void n(int i, OL ol, long j6, int i3) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f12105a).queueSecureInputBuffer(i, 0, ol.i, j6, i3);
    }

    @Override // w.i
    public Object o(w.h hVar) throws PackageManager.NameNotFoundException, CertificateException {
        String str;
        String str2;
        Context context = (Context) this.f12105a;
        Xx xx = (Xx) this.f12106b;
        if (Build.VERSION.SDK_INT < 31) {
            hVar.a("");
            return "";
        }
        try {
            String packageName = context.getPackageName();
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            String[] strArr = {xx.Q(), "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"};
            int i = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= 2) {
                    str = "";
                    break;
                }
                str = strArr[i3];
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
                i3++;
            }
            C2004vC c2004vC = C2166yC.f17693f;
            byte[] bArrH = c2004vC.f().h(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrH)));
            if (!Build.TYPE.equals("user")) {
                String[] strArr2 = {xx.R(), "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"};
                while (true) {
                    if (i >= 2) {
                        str2 = "";
                        break;
                    }
                    str2 = strArr2[i];
                    if (!TextUtils.isEmpty(str2)) {
                        break;
                    }
                    i++;
                }
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(c2004vC.f().h(str2))));
            }
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManagerOnChecksumsReadyListenerC1836s6(2, hVar));
            return "";
        } catch (PackageManager.NameNotFoundException | NoClassDefFoundError | CertificateException unused) {
            hVar.a("");
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.JP
    public void p() {
        ((MediaCodec) this.f12105a).detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1172fo
    public void q(Object obj, C1264hP c1264hP) {
        GO go = (GO) this.f12105a;
        VL vl = (VL) this.f12106b;
        CO co = (CO) obj;
        SparseArray sparseArray = go.f8368e;
        Vu vu = new Vu();
        vu.f12105a = c1264hP;
        SparseBooleanArray sparseBooleanArray = c1264hP.f14493a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iA = c1264hP.a(i);
            BO bo = (BO) sparseArray.get(iA);
            bo.getClass();
            sparseArray2.append(iA, bo);
        }
        vu.f12106b = sparseArray2;
        co.i(vl, vu);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public void r(NP np) {
        np.run();
    }

    @Override // com.google.android.gms.internal.ads.JP
    public void s(int i, int i3, long j6, int i6) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f12105a).queueInputBuffer(i, 0, i3, j6, i6);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public /* synthetic */ boolean t(C1448kw c1448kw) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        Su su = (Su) this.f12106b;
        su.d(th);
        su.b(false);
        ((Xu) this.f12105a).a(su);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public void v(int i, long j6) {
        ((MediaCodec) this.f12105a).releaseOutputBuffer(i, j6);
    }

    public Object w(C0926bE c0926bE) {
        return ((C1469lG) this.f12105a).a(c0926bE.a(), ((InterfaceC1577nG) this.f12106b).c());
    }

    public void x(InterfaceC2069wN interfaceC2069wN) {
        ((List) this.f12105a).add(interfaceC2069wN);
    }

    public Enum y(Object obj) throws GeneralSecurityException {
        Enum r02 = (Enum) ((Map) this.f12106b).get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public /* synthetic */ Vu(Object obj, Object obj2) {
        this.f12105a = obj;
        this.f12106b = obj2;
    }

    public Vu(int i, int i3) {
        List arrayList;
        Object arrayList2;
        if (i == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i);
        }
        this.f12105a = arrayList;
        if (i3 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i3);
        }
        this.f12106b = arrayList2;
    }

    public Vu(Context context, int i) {
        switch (i) {
            case 5:
                W1 w12 = new W1(5);
                this.f12105a = context.getApplicationContext();
                this.f12106b = w12;
                break;
            default:
                this.f12105a = context.getPackageName();
                this.f12106b = context.getSharedPreferences("paid_storage_sp", 0);
                break;
        }
    }

    public Vu(MediaCodec mediaCodec, C1879sw c1879sw) {
        this.f12105a = mediaCodec;
        this.f12106b = c1879sw;
        if (Build.VERSION.SDK_INT < 35 || c1879sw == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c1879sw.f16824c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC0582Jp.h0(((HashSet) c1879sw.f16823b).add(mediaCodec));
        }
    }

    public Vu(C1879sw c1879sw) {
        this(6);
        z(this, c1879sw);
    }
}
