package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.RemoteException;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class l90 implements r1, ra, bb.e, p81, m00, eb.c, fp0, rd0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13425a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13426b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13427c;

    public /* synthetic */ l90(int i4, Object obj) {
        this.f13425a = i4;
        this.f13426b = obj;
    }

    public static void q(l90 l90Var, rt rtVar) {
        av0 av0Var = (av0) rtVar.f15753b;
        av0 av0Var2 = (av0) l90Var.f13426b;
        long[] jArr = (long[]) av0Var2.f9422b;
        long[] jArr2 = (long[]) av0Var.f9422b;
        long[] jArr3 = (long[]) rtVar.f15754c;
        ls.E(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) av0Var2.f9423c;
        long[] jArr5 = (long[]) av0Var.f9423c;
        long[] jArr6 = (long[]) av0Var.f9424d;
        ls.E(jArr4, jArr5, jArr6);
        ls.E((long[]) av0Var2.f9424d, jArr6, jArr3);
        ls.E((long[]) l90Var.f13427c, jArr2, jArr5);
    }

    @Override // com.google.android.gms.internal.ads.r1
    public void a() {
        byte[] bArr = bq0.f9769b;
        int length = bArr.length;
        ((sk0) this.f13427c).z(0, bArr);
    }

    @Override // com.google.android.gms.internal.ads.ra
    public File b() {
        if (((File) this.f13426b) == null) {
            this.f13426b = new File(((Context) this.f13427c).getCacheDir(), "volley");
        }
        return (File) this.f13426b;
    }

    @Override // com.google.android.gms.internal.ads.rd0
    /* renamed from: c */
    public /* synthetic */ void mo160c(Object obj) {
        ((ru1) obj).k((qu1) this.f13426b, (a0.c0) this.f13427c);
    }

    @Override // eb.c
    public /* synthetic */ void d(xs xsVar) {
        ((pf0) this.f13426b).i4(xsVar, (String) this.f13427c);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a A[EDGE_INSN: B:67:0x011a->B:51:0x011a BREAK  A[LOOP:1: B:39:0x00e3->B:50:0x0109], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.q1 e(com.google.android.gms.internal.ads.y1 r17, long r18) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l90.e(com.google.android.gms.internal.ads.y1, long):com.google.android.gms.internal.ads.q1");
    }

    @Override // com.google.android.gms.internal.ads.fp0
    public Object f() {
        x50 x50Var;
        synchronized (this) {
            x50Var = (x50) this.f13427c;
        }
        return x50Var;
    }

    public void g(lr0 lr0Var) {
        qe qeVar = new qe(5, (ch0) this.f13426b);
        ex exVar = (ex) ((w81) this.f13427c);
        vd.b bVarE = exVar.e(qeVar);
        bVarE.a(new q81(0, bVarE, new rg0(1, this, lr0Var)), exVar);
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        switch (this.f13425a) {
            case 7:
                ((ix) this.f13426b).c(obj);
                break;
            case 10:
                u40 u40Var = (u40) this.f13427c;
                u40Var.getClass();
                fx.f11279f.execute(new s30(1, u40Var));
                ((r7) this.f13426b).mo163h((o40) obj);
                break;
            case 13:
                ((qz) obj).W0((String) this.f13426b, (oo) this.f13427c);
                break;
        }
    }

    @Override // bb.e
    public void i(pa.a aVar) {
        try {
            ((as) this.f13426b).b(aVar.a());
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
    }

    public void j(vd1 vd1Var) throws GeneralSecurityException {
        if (vd1Var == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        xd1 xd1Var = new xd1(vd1Var.f17603a, vd1Var.f17604b);
        HashMap map = (HashMap) this.f13426b;
        if (!map.containsKey(xd1Var)) {
            map.put(xd1Var, vd1Var);
            return;
        }
        vd1 vd1Var2 = (vd1) map.get(xd1Var);
        if (!vd1Var2.equals(vd1Var) || !vd1Var.equals(vd1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(xd1Var.toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.fp0
    public /* bridge */ /* synthetic */ vd.b k(ce1 ce1Var, ep0 ep0Var) {
        return o(ce1Var, ep0Var, null);
    }

    public void l(js1 js1Var) {
        ((List) this.f13426b).add(js1Var);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        switch (this.f13425a) {
            case 7:
                ((hx) this.f13427c).mo164b();
                break;
            case 10:
                u40 u40Var = (u40) this.f13427c;
                u40Var.getClass();
                fx.f11279f.execute(new s30(1, u40Var));
                ((r7) this.f13426b).n(th2);
                break;
            case 13:
                break;
            default:
                yr0 yr0Var = (yr0) this.f13427c;
                yr0Var.h(th2);
                yr0Var.c(false);
                ((bs0) this.f13426b).a(yr0Var);
                break;
        }
    }

    public synchronized vd.b o(ce1 ce1Var, ep0 ep0Var, x50 x50Var) {
        iu iuVar;
        this.f13427c = x50Var;
        if (x50Var == null || (iuVar = (iu) ce1Var.f10094b) == null) {
            return ((ne0) this.f13426b).t(ce1Var, ep0Var, x50Var);
        }
        y40 y40VarB = x50Var.b();
        return y40VarB.c(y40VarB.a(yo0.e(iuVar)));
    }

    @Override // bb.e
    public Object onSuccess(Object obj) {
        as asVar = (as) this.f13426b;
        bb.k kVar = (bb.k) obj;
        if (kVar != null) {
            try {
                asVar.Z(new vb.b(kVar.getView()));
            } catch (RemoteException e2) {
                za.i.f("", e2);
            }
            return new ns((fr) this.f13427c);
        }
        za.i.h("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            asVar.g("Adapter returned null.");
            return null;
        } catch (RemoteException e10) {
            za.i.f("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.m00
    public /* synthetic */ void p(String str, int i4, String str2, boolean z3) {
        wa0 wa0Var = (wa0) this.f13426b;
        Map map = (Map) this.f13427c;
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        wa0Var.f17950b.d(map2);
    }

    public void r(ae1 ae1Var) throws GeneralSecurityException {
        HashMap map = (HashMap) this.f13427c;
        Class clsB = ae1Var.b();
        if (!map.containsKey(clsB)) {
            map.put(clsB, ae1Var);
            return;
        }
        ae1 ae1Var2 = (ae1) map.get(clsB);
        if (!ae1Var2.equals(ae1Var) || !ae1Var.equals(ae1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsB.toString()));
        }
    }

    public void s(js1 js1Var) {
        ((List) this.f13427c).add(js1Var);
    }

    public void t(boolean z3, boolean z10) {
        synchronized (this) {
            boolean z11 = false;
            if (z3) {
                if (((PowerManager.WakeLock) this.f13427c) == null) {
                    Context context = (Context) this.f13426b;
                    if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        ls.t("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null) {
                        ls.t("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f13427c = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f13427c;
            if (wakeLock == null) {
                return;
            }
            if (z3 && z10) {
                z11 = true;
            }
            if (z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public mj1 v() throws GeneralSecurityException {
        ECPoint eCPoint;
        nj1 nj1Var = (nj1) this.f13426b;
        if (nj1Var == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        ne0 ne0Var = (ne0) this.f13427c;
        if (ne0Var == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigInteger = (BigInteger) ne0Var.f14280b;
        ECPoint eCPoint2 = nj1Var.f14305d;
        kj1 kj1Var = nj1Var.f14304c.f13508b;
        BigInteger order = kj1Var.f13176b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        ECParameterSpec eCParameterSpec = kj1Var.f13176b;
        if (!oc1.b(eCParameterSpec, oc1.f14668a) && !oc1.b(eCParameterSpec, oc1.f14669b) && !oc1.b(eCParameterSpec, oc1.f14670c)) {
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
        oc1.a(generator, curve);
        BigInteger a10 = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerC = oc1.c(curve);
        nc1 nc1VarD = oc1.d(ECPoint.POINT_INFINITY, bigIntegerC);
        nc1 nc1VarD2 = oc1.d(generator, bigIntegerC);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                nc1VarD = oc1.f(nc1VarD, nc1VarD2, a10, bigIntegerC);
                nc1VarD2 = oc1.e(nc1VarD2, a10, bigIntegerC);
            } else {
                nc1VarD2 = oc1.f(nc1VarD, nc1VarD2, a10, bigIntegerC);
                nc1VarD = oc1.e(nc1VarD, a10, bigIntegerC);
            }
        }
        if (nc1VarD.f14248c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = nc1VarD.f14248c.modInverse(bigIntegerC);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerC);
            eCPoint = new ECPoint(nc1VarD.f14246a.multiply(bigIntegerMod).mod(bigIntegerC), nc1VarD.f14247b.multiply(bigIntegerMod).mod(bigIntegerC).multiply(bigIntegerModInverse).mod(bigIntegerC));
        }
        oc1.a(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new mj1((nj1) this.f13426b, (ne0) this.f13427c);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public ks1 w() {
        return new ks1((List) this.f13426b, (List) this.f13427c);
    }

    public Set x(n50 n50Var) {
        return Collections.singleton(new q80(n50Var, fx.g));
    }

    public Set y(n50 n50Var) {
        return Collections.singleton(new q80(n50Var, fx.g));
    }

    public void z(jb0 jb0Var) {
        Iterator it = ((CopyOnWriteArrayList) this.f13427c).iterator();
        while (it.hasNext()) {
            ly1 ly1Var = (ly1) it.next();
            Object obj = ly1Var.f13682b;
            Handler handler = ly1Var.f13681a;
            ny1 ny1Var = new ny1(0, jb0Var, obj);
            String str = bq0.f9768a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    ny1Var.run();
                } else {
                    handler.post(ny1Var);
                }
            }
        }
    }

    public /* synthetic */ l90(int i4, Object obj, Object obj2) {
        this.f13425a = i4;
        this.f13426b = obj;
        this.f13427c = obj2;
    }

    public l90(Context context) {
        this.f13425a = 3;
        this.f13427c = context;
        this.f13426b = null;
    }

    public l90(av0 av0Var) {
        this.f13425a = 19;
        this.f13427c = av0Var;
    }

    public /* synthetic */ l90(Object obj, Object obj2, Object obj3, int i4) {
        this.f13425a = i4;
        this.f13426b = obj2;
        this.f13427c = obj3;
    }

    public l90(CopyOnWriteArrayList copyOnWriteArrayList, jy1 jy1Var) {
        this.f13425a = 27;
        this.f13427c = copyOnWriteArrayList;
        this.f13426b = jy1Var;
    }

    public l90(int i4) {
        this.f13425a = i4;
        switch (i4) {
            case 21:
                break;
            case 22:
                this(22, new av0(6), new long[10]);
                break;
            case 23:
                this.f13426b = new HashMap();
                this.f13427c = new HashMap();
                break;
            case 24:
                this.f13426b = null;
                this.f13427c = null;
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f13426b = byteArrayOutputStream;
                this.f13427c = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public l90(int i4, int i10) {
        List arrayList;
        Object arrayList2;
        this.f13425a = 25;
        if (i4 == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i4);
        }
        this.f13426b = arrayList;
        if (i10 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i10);
        }
        this.f13427c = arrayList2;
    }

    public l90(xm xmVar) {
        this.f13425a = 6;
        this.f13426b = xmVar;
        Drawable drawable = null;
        try {
            vb.a aVarA = xmVar.a();
            if (aVarA != null) {
                drawable = (Drawable) vb.b.U0(aVarA);
            }
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
        this.f13427c = drawable;
        try {
            ((xm) this.f13426b).zzc();
        } catch (RemoteException e10) {
            za.i.f("", e10);
        }
        try {
            ((xm) this.f13426b).f();
        } catch (RemoteException e11) {
            za.i.f("", e11);
        }
        try {
            ((xm) this.f13426b).c();
        } catch (RemoteException e12) {
            za.i.f("", e12);
        }
        try {
            ((xm) this.f13426b).d();
        } catch (RemoteException e13) {
            za.i.f("", e13);
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.F4)).booleanValue()) {
            try {
                ((xm) this.f13426b).e();
            } catch (RemoteException unused) {
            }
        }
    }

    private final void m(Throwable th2) {
    }

    private final void u(Object obj) {
    }

    public l90(k10 k10Var, Context context, String str) {
        this.f13425a = 8;
        gs1 gs1VarB = gs1.b(context);
        es1 es1Var = k10Var.I0;
        gp0 gp0Var = new gp0(gs1VarB, es1Var, k10Var.J0, 1);
        es1 es1VarB = es1.b(new zm0(es1Var, 7));
        es1 es1VarB2 = es1.b(a80.H);
        es1 es1VarB3 = es1.b(new j90(gs1VarB, k10Var.f12926c, k10Var.F, gp0Var, es1VarB, es1VarB2));
        this.f13426b = es1.b(new up0(0, es1VarB3, es1VarB, es1VarB2));
        this.f13427c = es1.b(new qa0(gs1.c(str), es1VarB3, gs1VarB, es1VarB, es1VarB2, k10Var.f12935h, k10Var.G, k10Var.j));
    }

    public l90(u40 u40Var, r7 r7Var) {
        this.f13425a = 10;
        this.f13426b = r7Var;
        Objects.requireNonNull(u40Var);
        this.f13427c = u40Var;
    }

    public l90(hc0 hc0Var, String str, oo ooVar) {
        this.f13425a = 13;
        this.f13426b = str;
        this.f13427c = ooVar;
        Objects.requireNonNull(hc0Var);
    }

    public /* synthetic */ l90(zo0 zo0Var) {
        this.f13425a = 2;
        this.f13426b = zo0Var;
        this.f13427c = new sk0();
    }

    public l90(u51 u51Var, int[] iArr) {
        this.f13425a = 20;
        this.f13426b = x41.q(u51Var);
        this.f13427c = iArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l90(rt rtVar) {
        this(22);
        this.f13425a = 22;
        q(this, rtVar);
    }

    public /* synthetic */ l90(yd1 yd1Var) {
        this.f13425a = 23;
        this.f13426b = new HashMap(yd1Var.f18709a);
        this.f13427c = new HashMap(yd1Var.f18710b);
    }
}
