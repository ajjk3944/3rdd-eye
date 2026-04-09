package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mr2 implements iq3, ug2, o93, p93, k73, dp2, hh3, ks2, g8, zf4 {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public mr2(int i) {
        this.f = i;
        switch (i) {
            case 12:
                this.g = new HashMap();
                break;
            case 13:
                this(new jr3(2), new long[10], 13, false);
                break;
            case 14:
                this.g = new HashMap();
                this.h = new HashMap();
                break;
            case 15:
                this.g = null;
                this.h = null;
                break;
            case 16:
                break;
            default:
                rc3 rc3Var = new rc3();
                this.g = rc3Var;
                this.h = new vg0(26, rc3Var);
                break;
        }
    }

    public static void x(mr2 mr2Var, wt2 wt2Var) {
        jr3 jr3Var = (jr3) wt2Var.g;
        jr3 jr3Var2 = (jr3) mr2Var.g;
        long[] jArr = (long[]) jr3Var2.g;
        long[] jArr2 = (long[]) jr3Var.g;
        long[] jArr3 = (long[]) wt2Var.h;
        pu1.G(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) jr3Var2.h;
        long[] jArr5 = (long[]) jr3Var.h;
        long[] jArr6 = (long[]) jr3Var.i;
        pu1.G(jArr4, jArr5, jArr6);
        pu1.G((long[]) jr3Var2.i, jArr6, jArr3);
        pu1.G((long[]) mr2Var.h, jArr2, jArr5);
    }

    public boolean A(int i) {
        return ((of4) this.g).a.get(i);
    }

    @Override // defpackage.zf4
    public ByteBuffer B(int i) {
        return ((MediaCodec) this.g).getOutputBuffer(i);
    }

    public m14 C() throws GeneralSecurityException {
        ECPoint eCPoint;
        n14 n14Var = (n14) this.g;
        if (n14Var == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        x34 x34Var = (x34) this.h;
        if (x34Var == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigInteger = (BigInteger) x34Var.f;
        ECPoint eCPoint2 = n14Var.k;
        j14 j14Var = n14Var.j.b;
        BigInteger order = j14Var.b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        ECParameterSpec eCParameterSpec = j14Var.b;
        if (!ru3.b(eCParameterSpec, ru3.a) && !ru3.b(eCParameterSpec, ru3.b) && !ru3.b(eCParameterSpec, ru3.c)) {
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
        ru3.a(generator, curve);
        BigInteger a = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerC = ru3.c(curve);
        qu3 qu3VarD = ru3.d(ECPoint.POINT_INFINITY, bigIntegerC);
        qu3 qu3VarD2 = ru3.d(generator, bigIntegerC);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                qu3VarD = ru3.f(qu3VarD, qu3VarD2, a, bigIntegerC);
                qu3VarD2 = ru3.e(qu3VarD2, a, bigIntegerC);
            } else {
                qu3VarD2 = ru3.f(qu3VarD, qu3VarD2, a, bigIntegerC);
                qu3VarD = ru3.e(qu3VarD, a, bigIntegerC);
            }
        }
        if (qu3VarD.c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = qu3VarD.c.modInverse(bigIntegerC);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerC);
            eCPoint = new ECPoint(qu3VarD.a.multiply(bigIntegerMod).mod(bigIntegerC), qu3VarD.b.multiply(bigIntegerMod).mod(bigIntegerC).multiply(bigIntegerModInverse).mod(bigIntegerC));
        }
        ru3.a(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new m14((n14) this.g, (x34) this.h);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    @Override // defpackage.zf4
    public void I(int i) {
        ((MediaCodec) this.g).releaseOutputBuffer(i, false);
    }

    @Override // defpackage.hh3
    /* renamed from: a */
    public th3 mo10a() {
        pi1 pi1Var = (pi1) this.h;
        return new tj3((Context) this.g, new bl3(null, pi1Var.f, pi1Var.g, false, (mr2) pi1Var.h));
    }

    @Override // defpackage.zf4
    public int b() {
        return ((MediaCodec) this.g).dequeueInputBuffer(0L);
    }

    @Override // defpackage.o93
    public Object c(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        jz2 jz2Var = (jz2) this.g;
        wo1 wo1Var = (wo1) this.h;
        jz2Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(wo1Var.a));
        contentValues.put("gws_query_id", (String) wo1Var.c);
        contentValues.put("url", (String) wo1Var.d);
        contentValues.put("event_state", Integer.valueOf(wo1Var.b - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        lf4 lf4Var = hg4.C.c;
        Context context = jz2Var.f;
        y42 y42VarB = lf4.b(context);
        if (y42VarB != null) {
            try {
                y42VarB.zzf(new oi0(context));
            } catch (RemoteException unused) {
                gi2.R();
            }
        }
        return null;
    }

    @Override // defpackage.zf4
    public void c0(Bundle bundle) {
        ((MediaCodec) this.g).setParameters(bundle);
    }

    @Override // defpackage.zf4
    public void d(int i, int i2, long j, int i3) throws MediaCodec.CryptoException {
        ((MediaCodec) this.g).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.zf4
    public MediaFormat e() {
        return ((MediaCodec) this.g).getOutputFormat();
    }

    @Override // defpackage.zf4
    public void f(int i) {
        ((MediaCodec) this.g).setVideoScalingMode(i);
    }

    @Override // defpackage.zf4
    public void g() {
        ((MediaCodec) this.g).flush();
    }

    @Override // defpackage.g8
    public gi4 h() {
        gi4 gi4VarH = ((wd4) this.g).h();
        yf3 yf3Var = new yf3(this);
        gi4VarH.getClass();
        ia1 ia1Var = m01.a;
        gi4 gi4Var = new gi4();
        gi4VarH.b.c(new mn2(ia1Var, yf3Var, gi4Var, 1));
        gi4VarH.h();
        return gi4Var;
    }

    @Override // defpackage.k73
    public /* bridge */ /* synthetic */ n70 i(lv2 lv2Var, j73 j73Var) {
        return w(lv2Var, j73Var, null);
    }

    @Override // defpackage.zf4
    public void k() {
        wt2 wt2Var = (wt2) this.h;
        MediaCodec mediaCodec = (MediaCodec) this.g;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && wt2Var != null) {
                wt2Var.l(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && wt2Var != null) {
                wt2Var.l(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // defpackage.k73
    public Object l() {
        lm2 lm2Var;
        synchronized (this) {
            lm2Var = (lm2) this.h;
        }
        return lm2Var;
    }

    @Override // defpackage.zf4
    public void m(int i, long j) {
        ((MediaCodec) this.g).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.zf4
    public void n(int i, yu3 yu3Var, long j, int i2) throws MediaCodec.CryptoException {
        ((MediaCodec) this.g).queueSecureInputBuffer(i, 0, yu3Var.i, j, i2);
    }

    @Override // defpackage.zf4
    public void o() {
        ((MediaCodec) this.g).detachOutputSurface();
    }

    @Override // defpackage.iq3
    public void p(Object obj) {
        switch (this.f) {
            case 0:
                ((pr2) this.h).m((View) this.g, (xz2) obj);
                return;
            case 3:
                String str = (String) obj;
                try {
                    ea2 ea2Var = (ea2) this.h;
                    w92 w92Var = (w92) this.g;
                    Parcel parcelU = ea2Var.U();
                    parcelU.writeString(str);
                    iv1.c(parcelU, w92Var);
                    ea2Var.M0(parcelU, 1);
                    return;
                } catch (RemoteException unused) {
                    gi2.R();
                    return;
                }
            default:
                h2 h2Var = (h2) this.h;
                p13 p13Var = (p13) obj;
                synchronized (h2Var) {
                    try {
                        ((h13) h2Var.h).b(p13Var, (a83) this.g);
                        a83 a83VarA = ((h13) h2Var.h).a();
                        if (a83VarA != null) {
                            h2Var.q(a83VarA);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // defpackage.zf4
    public void q(Surface surface) {
        ((MediaCodec) this.g).setOutputSurface(surface);
    }

    @Override // defpackage.zf4
    public int r(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.g).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        switch (this.f) {
            case 0:
                if (((Boolean) tw1.e.c.a(mz1.O5)).booleanValue()) {
                    hg4.C.h.e("omid native display exp", th);
                    return;
                }
                return;
            case 3:
                try {
                    ea2 ea2Var = (ea2) this.h;
                    nx2 nx2VarA = zt0.A(th);
                    wu1 wu1Var = new wu1(yc0.s(th.getMessage()) ? nx2VarA.g : th.getMessage(), nx2VarA.f);
                    Parcel parcelU = ea2Var.U();
                    iv1.c(parcelU, wu1Var);
                    ea2Var.M0(parcelU, 2);
                    return;
                } catch (RemoteException unused) {
                    gi2.R();
                    return;
                }
            default:
                h2 h2Var = (h2) this.h;
                synchronized (h2Var) {
                    try {
                        h13 h13Var = (h13) h2Var.h;
                        a83 a83Var = (a83) this.g;
                        h13Var.c(a83Var);
                        a83 a83VarA = ((h13) h2Var.h).a();
                        if (a83Var.v0) {
                            while (a83VarA != null) {
                                h2Var.q(a83VarA);
                                a83VarA = ((h13) h2Var.h).a();
                            }
                        } else if (a83VarA != null) {
                            h2Var.q(a83VarA);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public synchronized Map t() {
        try {
            if (((Map) this.h) == null) {
                this.h = Collections.unmodifiableMap(new HashMap((HashMap) this.g));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.h;
    }

    public void u(aw3 aw3Var) throws GeneralSecurityException {
        if (aw3Var == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        cw3 cw3Var = new cw3(aw3Var.a, aw3Var.b);
        HashMap map = (HashMap) this.g;
        if (!map.containsKey(cw3Var)) {
            map.put(cw3Var, aw3Var);
            return;
        }
        aw3 aw3Var2 = (aw3) map.get(cw3Var);
        if (!aw3Var2.equals(aw3Var) || !aw3Var.equals(aw3Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(cw3Var.toString()));
        }
    }

    @Override // defpackage.ug2
    public void v(String str, int i, String str2, boolean z) {
        switch (this.f) {
            case 1:
                qs2 qs2Var = (qs2) this.g;
                Map map = (Map) this.h;
                HashMap map2 = new HashMap();
                map2.put("messageType", "validatorHtmlLoaded");
                map2.put("id", (String) map.get("id"));
                qs2Var.b.d(map2);
                break;
            default:
                pd2 pd2Var = (pd2) this.h;
                if (!z) {
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb.append("Ad Web View failed to load. Error code: ");
                    sb.append(i);
                    sb.append(", Description: ");
                    sb.append(str);
                    pd2Var.b(new Exception(ex0.k(sb, ", Failing URL: ", str2)));
                    break;
                } else {
                    if (((Boolean) tw1.e.c.a(mz1.p2)).booleanValue()) {
                        ga1.n(hg4.C.k, (Bundle) this.g, "rendering-webview-load-html-end");
                    }
                    pd2Var.a(null);
                    break;
                }
        }
    }

    public synchronized n70 w(lv2 lv2Var, j73 j73Var, lm2 lm2Var) {
        fa2 fa2Var;
        this.h = lm2Var;
        if (lm2Var == null || (fa2Var = (fa2) lv2Var.g) == null) {
            return ((zs1) this.g).E(lv2Var, j73Var, lm2Var);
        }
        nl2 nl2VarA = lm2Var.a();
        return nl2VarA.c(nl2VarA.a(pu1.r(fa2Var)));
    }

    public void y(ew3 ew3Var) throws GeneralSecurityException {
        HashMap map = (HashMap) this.h;
        Class clsA = ew3Var.a();
        if (!map.containsKey(clsA)) {
            map.put(clsA, ew3Var);
            return;
        }
        ew3 ew3Var2 = (ew3) map.get(clsA);
        if (!ew3Var2.equals(ew3Var) || !ew3Var.equals(ew3Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsA.toString()));
        }
    }

    @Override // defpackage.zf4
    public ByteBuffer z(int i) {
        return ((MediaCodec) this.g).getInputBuffer(i);
    }

    @Override // defpackage.p93
    /* renamed from: a */
    public void mo13a() {
        t03 t03Var = (t03) this.g;
        uz1 uz1Var = (uz1) this.h;
        vz1 vz1Var = (vz1) t03Var.d;
        Parcel parcelU = vz1Var.U();
        iv1.e(parcelU, uz1Var);
        vz1Var.M0(parcelU, 1);
    }

    public /* synthetic */ mr2(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj2;
        this.h = obj;
    }

    public /* synthetic */ mr2(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public mr2(zs1 zs1Var) {
        this.f = 7;
        this.g = zs1Var;
    }

    public mr2(Context context, int i) {
        xb4 xb4Var;
        this.f = i;
        switch (i) {
            case 19:
                this.g = new wd4(context, gz.b);
                synchronized (xb4.class) {
                    try {
                        if (xb4.j == null) {
                            xb4.j = new xb4(context.getApplicationContext());
                        }
                        xb4Var = xb4.j;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.h = xb4Var;
                return;
            default:
                pi1 pi1Var = new pi1(7);
                this.g = context.getApplicationContext();
                this.h = pi1Var;
                return;
        }
    }

    @Override // defpackage.dp2
    /* renamed from: c, reason: collision with other method in class */
    public void mo14c(Object obj) {
        switch (this.f) {
            case 9:
                q93 q93Var = (q93) this.g;
                ((v93) obj).H((s93) q93Var.f, q93Var.g, (Throwable) this.h);
                break;
            default:
                ((bd4) obj).n((ad4) this.g, (hh4) this.h);
                break;
        }
    }

    public mr2(MediaCodec mediaCodec, wt2 wt2Var) {
        this.f = 20;
        this.g = mediaCodec;
        this.h = wt2Var;
        if (Build.VERSION.SDK_INT < 35 || wt2Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) wt2Var.h;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            zt0.b0(((HashSet) wt2Var.g).add(mediaCodec));
        }
    }

    public mr2(xy2 xy2Var, ea2 ea2Var, w92 w92Var) {
        this.f = 3;
        this.h = ea2Var;
        this.g = w92Var;
    }

    public mr2(sn3 sn3Var, int[] iArr) {
        this.f = 8;
        this.g = xm3.m(sn3Var);
        this.h = iArr;
    }

    public mr2(of4 of4Var, SparseArray sparseArray) {
        this.f = 17;
        this.g = of4Var;
        SparseBooleanArray sparseBooleanArray = of4Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iA = of4Var.a(i);
            ad4 ad4Var = (ad4) sparseArray.get(iA);
            ad4Var.getClass();
            sparseArray2.append(iA, ad4Var);
        }
        this.h = sparseArray2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mr2(wt2 wt2Var) {
        this(13);
        this.f = 13;
        x(this, wt2Var);
    }

    public /* synthetic */ mr2(dw3 dw3Var) {
        this.f = 14;
        this.g = new HashMap(dw3Var.a);
        this.h = new HashMap(dw3Var.b);
    }
}
