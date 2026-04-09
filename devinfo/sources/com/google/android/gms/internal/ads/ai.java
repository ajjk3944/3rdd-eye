package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ai implements ua.d, fp0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f9330a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9331b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9332c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9333d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9334e;

    /* renamed from: f, reason: collision with root package name */
    public Object f9335f;

    public ai(l90 l90Var, pq0 pq0Var, g gVar, String str, ex exVar) {
        this.f9330a = l90Var;
        this.f9331b = pq0Var;
        this.f9332c = gVar;
        this.f9333d = str;
        this.f9335f = exVar;
    }

    public static jy1 w(hp1 hp1Var, x41 x41Var, jy1 jy1Var, tg tgVar) {
        uh uhVarL1 = hp1Var.l1();
        int iN1 = hp1Var.n1();
        Object objF = uhVarL1.g() ? null : uhVarL1.f(iN1);
        if (!hp1Var.s1() && !uhVarL1.g()) {
            tg tgVarD = uhVarL1.d(iN1, tgVar, false);
            hp1Var.q1();
            String str = bq0.f9768a;
            tgVarD.getClass();
        }
        for (int i4 = 0; i4 < x41Var.size(); i4++) {
            jy1 jy1Var2 = (jy1) x41Var.get(i4);
            if (y(jy1Var2, objF, hp1Var.s1(), hp1Var.z(), hp1Var.t1())) {
                return jy1Var2;
            }
        }
        if (x41Var.isEmpty() && jy1Var != null && y(jy1Var, objF, hp1Var.s1(), hp1Var.z(), hp1Var.t1())) {
            return jy1Var;
        }
        return null;
    }

    public static boolean y(jy1 jy1Var, Object obj, boolean z3, int i4, int i10) {
        Object obj2 = jy1Var.f12875a;
        int i11 = jy1Var.f12876b;
        if (obj2.equals(obj)) {
            return z3 ? i11 == i4 && jy1Var.f12877c == i10 : i11 == -1 && jy1Var.f12879e == -1;
        }
        return false;
    }

    @Override // ua.d
    public void a() {
        if (((AtomicBoolean) this.f9335f).get()) {
            ((e60) this.f9330a).onAdClicked();
        }
    }

    public String b() {
        String str = (String) va.s.f36163e.f36166c.a(sk.lb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) this.f9330a);
            jSONObject.put("eventCategory", (String) this.f9331b);
            jSONObject.putOpt("event", (String) this.f9332c);
            jSONObject.putOpt("errorCode", (Integer) this.f9333d);
            jSONObject.putOpt("rewardType", (String) this.f9334e);
            jSONObject.putOpt("rewardAmount", (Integer) this.f9335f);
        } catch (JSONException unused) {
            za.i.h("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        int length = String.valueOf(str).length();
        return a0.g.p(new StringBuilder(String.valueOf(string).length() + length + 14 + 2), str, "(\"h5adsEvent\",", string, ");");
    }

    public void c(int i4) throws InvalidAlgorithmParameterException {
        if (i4 != 16 && i4 != 24 && i4 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i4)));
        }
        this.f9330a = Integer.valueOf(i4);
    }

    public void d(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f9332c) {
            try {
                if (((Context) this.f9334e) != null) {
                    return;
                }
                this.f9334e = context.getApplicationContext();
                pk pkVar = sk.W4;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    x();
                } else {
                    if (((Boolean) sVar.f36166c.a(sk.V4)).booleanValue()) {
                        ua.j.C.g.f(new zh(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(va.z2 z2Var, String str, al0 al0Var, bl0 bl0Var) throws JSONException {
        bs0 bs0Var;
        pq0 pq0Var = (pq0) this.f9332c;
        uk0 uk0Var = (uk0) pq0Var.f15074c;
        k10 k10Var = (k10) this.f9331b;
        pk pkVar = sk.Q2;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            va.r.a();
        }
        ua.j jVar = ua.j.C;
        ya.f0 f0Var = jVar.f35261c;
        Context context = (Context) this.f9334e;
        final int i4 = 0;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        final int i10 = 1;
        if (ya.f0.i(context) && z2Var.f36204s == null) {
            za.i.e("Failed to load the ad because app ID is missing.");
            k10Var.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.dl0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ai f10508b;

                {
                    this.f10508b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            ((zk0) ((pq0) this.f10508b.f9332c).f15075d).o(yo0.A(6, null, null));
                            break;
                        default:
                            ((zk0) ((pq0) this.f10508b.f9332c).f15075d).o(yo0.A(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            za.i.e("Ad unit ID should not be null for NativeAdLoader.");
            k10Var.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.dl0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ai f10508b;

                {
                    this.f10508b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            ((zk0) ((pq0) this.f10508b.f9332c).f15075d).o(yo0.A(6, null, null));
                            break;
                        default:
                            ((zk0) ((pq0) this.f10508b.f9332c).f15075d).o(yo0.A(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        boolean z3 = z2Var.f36193f;
        al0.x(context, z3);
        if (((Boolean) sVar.f36166c.a(sk.f16155ha)).booleanValue() && z3) {
            ((ff0) k10Var.f12970z.a()).b(true);
        }
        int i11 = ((cl0) al0Var).f10157c;
        jVar.f35267k.getClass();
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Bundle bundleC = ls.c(new Pair("api-call", lValueOf), new Pair("dynamite-enter", lValueOf));
        gq0 gq0Var = (gq0) this.f9330a;
        gq0Var.f11576a = z2Var;
        gq0Var.f11593t = bundleC;
        gq0Var.f11586m = i11;
        hq0 hq0VarA = gq0Var.a();
        yr0 yr0VarD = d7.D(context, yr1.G(hq0VarA), 8, z2Var);
        va.v0 v0Var = hq0VarA.f11953o;
        if (v0Var != null) {
            uk0Var.h(v0Var);
        }
        k10 k10Var2 = k10Var.f12924b;
        y50 y50Var = new y50();
        y50Var.f18642a = context;
        y50Var.f18643b = hq0VarA;
        y50 y50Var2 = new y50(y50Var);
        d80 d80Var = new d80();
        d80Var.b(uk0Var, k10Var.b());
        e80 e80Var = new e80(d80Var);
        l90 l90Var = new l90(b12 == true ? 1 : 0, (ka0) pq0Var.f15073b, uk0Var.f());
        int i12 = 18;
        j10 j10Var = new j10(k10Var2, new fk0(i12, (Object) null), l90Var, new h80(i12), e80Var, y50Var2, new ne0(7), null, null);
        if (((Boolean) ol.f14724c.u()).booleanValue()) {
            bs0Var = (bs0) j10Var.f12570e.a();
            bs0Var.i(8);
            bs0Var.c(z2Var.f36201p);
            bs0Var.d(z2Var.f36198m);
        } else {
            bs0Var = null;
        }
        ((rq0) k10Var.N.a()).a(1);
        ex exVar = fx.f11274a;
        al0.z(exVar);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) k10Var.f12928d.a();
        y40 y40Var = (y40) j10Var.f12578o.a();
        pr0 pr0VarC = y40Var.c(y40Var.b());
        u40 u40Var = new u40(exVar, scheduledExecutorService, pr0VarC);
        this.f9335f = u40Var;
        pr0VarC.a(new q81(b10 == true ? 1 : 0, pr0VarC, new rt((Object) u40Var, (boolean) (b11 == true ? 1 : 0), (Object) new r7(this, (ne0) bl0Var, bs0Var, yr0VarD, j10Var, 5, false), 11)), exVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fp0
    public Object f() {
        x50 x50Var;
        synchronized (this) {
            x50Var = (x50) this.f9334e;
        }
        return x50Var;
    }

    public ai g(lr0 lr0Var) {
        return i(new fp(14, lr0Var));
    }

    public void h(int i4) throws InvalidAlgorithmParameterException {
        if (i4 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i4)));
        }
        this.f9331b = Integer.valueOf(i4);
    }

    public ai i(e81 e81Var) {
        sr0 sr0Var = (sr0) this.f9335f;
        w81 w81Var = sr0Var.f16525a;
        return new ai(sr0Var, this.f9332c, (String) this.f9330a, (vd.b) this.f9331b, (List) this.f9333d, yo0.F((vd.b) this.f9334e, e81Var, w81Var));
    }

    public bi j(ei eiVar) {
        synchronized (this.f9332c) {
            if (((fi) this.f9335f) == null) {
                return new bi();
            }
            try {
                if (((di) this.f9333d).A()) {
                    fi fiVar = (fi) this.f9335f;
                    Parcel parcelT = fiVar.T();
                    ng.c(parcelT, eiVar);
                    Parcel parcelR0 = fiVar.r0(parcelT, 2);
                    bi biVar = (bi) ng.b(parcelR0, bi.CREATOR);
                    parcelR0.recycle();
                    return biVar;
                }
                fi fiVar2 = (fi) this.f9335f;
                Parcel parcelT2 = fiVar2.T();
                ng.c(parcelT2, eiVar);
                Parcel parcelR02 = fiVar2.r0(parcelT2, 1);
                bi biVar2 = (bi) ng.b(parcelR02, bi.CREATOR);
                parcelR02.recycle();
                return biVar2;
            } catch (RemoteException e2) {
                za.i.f("Unable to call into cache service.", e2);
                return new bi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fp0
    public vd.b k(ce1 ce1Var, ep0 ep0Var) {
        synchronized (this) {
            m10 m10VarD = ep0Var.d((dp0) ce1Var.f10095c);
            vo0 vo0Var = new vo0((String) this.f9333d);
            switch (m10VarD.f13716a) {
                case 0:
                    m10VarD.f13719d = vo0Var;
                    break;
                default:
                    m10VarD.f13719d = vo0Var;
                    break;
            }
            x50 x50Var = (x50) m10VarD.c();
            x50Var.a();
            x50Var.a();
            va.z2 z2Var = x50Var.a().f11944d;
            if (z2Var.f36204s != null || z2Var.f36209x != null) {
                this.f9334e = x50Var;
                return ((l90) this.f9330a).o(ce1Var, ep0Var, x50Var);
            }
            hq0 hq0VarA = x50Var.a();
            va.z2 z2Var2 = hq0VarA.f11944d;
            String str = hq0VarA.g;
            va.f3 f3Var = hq0VarA.f11949k;
            Executor executor = (Executor) this.f9335f;
            return yo0.F(n81.s(((pq0) this.f9331b).p(x50Var)), new ti0(this, ce1Var, new uo0(ep0Var, ce1Var, z2Var2, str, executor, f3Var, null), ep0Var, x50Var, 1), executor);
        }
    }

    public void l(int i4) throws GeneralSecurityException {
        if (i4 < 12 || i4 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i4)));
        }
        this.f9332c = Integer.valueOf(i4);
    }

    public void m(int i4) throws GeneralSecurityException {
        if (i4 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i4)));
        }
        this.f9333d = Integer.valueOf(i4);
    }

    public synchronized di n(fk0 fk0Var, ix0 ix0Var) {
        return new di((Context) this.f9334e, ua.j.C.f35276t.f(), fk0Var, ix0Var, 0);
    }

    @Override // ua.d
    public synchronized void o(View view) {
        if (((AtomicBoolean) this.f9335f).compareAndSet(false, true)) {
            ((j30) this.f9334e).n();
            ((r80) this.f9333d).v1(view);
        }
    }

    public la1 p() throws GeneralSecurityException {
        if (((Integer) this.f9330a) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f9331b) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f9332c) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f9333d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((ja1) this.f9334e) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int iIntValue = num.intValue();
        ja1 ja1Var = (ja1) this.f9334e;
        if (ja1Var == ja1.f12693c) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (ja1Var == ja1.f12694d) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (ja1Var == ja1.f12695e) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (ja1Var == ja1.f12696f) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (ja1Var != ja1.g) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new la1(((Integer) this.f9330a).intValue(), ((Integer) this.f9331b).intValue(), ((Integer) this.f9332c).intValue(), ((Integer) this.f9333d).intValue(), (ka1) this.f9335f, (ja1) this.f9334e);
    }

    public vd.b q(ar0 ar0Var, ce1 ce1Var) {
        x50 x50Var = ar0Var.f9390a;
        this.f9334e = x50Var;
        if (ar0Var.f9392c != null) {
            if (x50Var.zzc() != null) {
                ar0Var.f9392c.f14536e.g(ar0Var.f9390a.zzc());
            }
            return yo0.e(ar0Var.f9392c);
        }
        x50Var.b().g = ar0Var.f9391b;
        return ((l90) this.f9330a).o(ce1Var, null, ar0Var.f9390a);
    }

    public /* synthetic */ void r() {
        synchronized (this.f9332c) {
            try {
                di diVar = (di) this.f9333d;
                if (diVar == null) {
                    return;
                }
                if (diVar.g() || ((di) this.f9333d).c()) {
                    ((di) this.f9333d).f();
                }
                this.f9333d = null;
                this.f9335f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ai s(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        sr0 sr0Var = (sr0) this.f9335f;
        ScheduledExecutorService scheduledExecutorService = sr0Var.f16526b;
        return new ai(sr0Var, this.f9332c, (String) this.f9330a, (vd.b) this.f9331b, (List) this.f9333d, yo0.E((vd.b) this.f9334e, j, timeUnit, scheduledExecutorService));
    }

    public pr0 t() {
        sr0 sr0Var = (sr0) this.f9335f;
        Object obj = this.f9332c;
        String str = (String) this.f9330a;
        if (str == null) {
            sr0Var.getClass();
            str = ((qr0) obj).f15425a;
        }
        pr0 pr0Var = new pr0(obj, str, (vd.b) this.f9334e);
        sr0Var.f16527c.p1(new ne0(15, pr0Var));
        vd.b bVar = (vd.b) this.f9331b;
        uh0 uh0Var = new uh0(9, this, pr0Var);
        ex exVar = fx.g;
        bVar.a(uh0Var, exVar);
        pr0Var.a(new q81(0, pr0Var, new ce1(19, this, pr0Var)), exVar);
        return pr0Var;
    }

    public void u(uh uhVar) {
        oa oaVar = new oa(4);
        if (((x41) this.f9331b).isEmpty()) {
            v(oaVar, (jy1) this.f9334e, uhVar);
            if (!Objects.equals((jy1) this.f9335f, (jy1) this.f9334e)) {
                v(oaVar, (jy1) this.f9335f, uhVar);
            }
            if (!Objects.equals((jy1) this.f9333d, (jy1) this.f9334e) && !Objects.equals((jy1) this.f9333d, (jy1) this.f9335f)) {
                v(oaVar, (jy1) this.f9333d, uhVar);
            }
        } else {
            for (int i4 = 0; i4 < ((x41) this.f9331b).size(); i4++) {
                v(oaVar, (jy1) ((x41) this.f9331b).get(i4), uhVar);
            }
            if (!((x41) this.f9331b).contains((jy1) this.f9333d)) {
                v(oaVar, (jy1) this.f9333d, uhVar);
            }
        }
        this.f9332c = oaVar.v(true);
    }

    public void v(oa oaVar, jy1 jy1Var, uh uhVar) {
        if (jy1Var == null) {
            return;
        }
        if (uhVar.e(jy1Var.f12875a) != -1) {
            oaVar.i(jy1Var, uhVar);
            return;
        }
        uh uhVar2 = (uh) ((z51) this.f9332c).get(jy1Var);
        if (uhVar2 != null) {
            oaVar.i(jy1Var, uhVar2);
        }
    }

    public void x() {
        synchronized (this.f9332c) {
            try {
                if (((Context) this.f9334e) != null && ((di) this.f9333d) == null) {
                    di diVarN = n(new fk0(10, this), new ix0(8, this));
                    this.f9333d = diVarN;
                    diVarN.n();
                }
            } finally {
            }
        }
    }

    @Override // ua.d
    /* renamed from: zzc */
    public void mo171zzc() {
        if (((AtomicBoolean) this.f9335f).get()) {
            ((o60) this.f9331b).a();
            u80 u80Var = (u80) this.f9332c;
            synchronized (u80Var) {
                u80Var.p1(h80.j);
            }
        }
    }

    public /* synthetic */ ai(String str) {
        this.f9331b = str;
    }

    public ai(int i4) {
        switch (i4) {
            case 6:
                this.f9330a = null;
                this.f9331b = null;
                this.f9332c = null;
                this.f9333d = null;
                this.f9334e = null;
                this.f9335f = ka1.f13099e;
                break;
            default:
                this.f9330a = null;
                this.f9331b = new s(9, this);
                this.f9332c = new Object();
                break;
        }
    }

    public ai(sr0 sr0Var, Object obj, String str, vd.b bVar, List list, vd.b bVar2) {
        Objects.requireNonNull(sr0Var);
        this.f9335f = sr0Var;
        this.f9332c = obj;
        this.f9330a = str;
        this.f9331b = bVar;
        this.f9333d = list;
        this.f9334e = bVar2;
    }
}
