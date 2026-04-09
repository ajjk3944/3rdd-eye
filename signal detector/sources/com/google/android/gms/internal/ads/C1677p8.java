package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import f4.InterfaceFutureC2326a;
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
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.p8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1677p8 implements p2.d, Bt {

    /* renamed from: a, reason: collision with root package name */
    public Object f16137a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16138b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16139c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16140d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16141e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16142f;

    public C1677p8(C0889ae c0889ae, C1338iu c1338iu, C1184g c1184g, String str, C0623Mf c0623Mf) {
        this.f16137a = c0889ae;
        this.f16138b = c1338iu;
        this.f16139c = c1184g;
        this.f16140d = str;
        this.f16142f = c0623Mf;
    }

    public static C1749qQ x(VL vl, LB lb, C1749qQ c1749qQ, I7 i7) {
        AbstractC1353j8 abstractC1353j8Y1 = vl.y1();
        int iA1 = vl.A1();
        Object objF = abstractC1353j8Y1.g() ? null : abstractC1353j8Y1.f(iA1);
        if (!vl.F1() && !abstractC1353j8Y1.g()) {
            I7 i7D = abstractC1353j8Y1.d(iA1, i7, false);
            vl.D1();
            String str = Vt.f12096a;
            i7D.getClass();
        }
        for (int i = 0; i < lb.size(); i++) {
            C1749qQ c1749qQ2 = (C1749qQ) lb.get(i);
            if (z(c1749qQ2, objF, vl.F1(), vl.m(), vl.G1())) {
                return c1749qQ2;
            }
        }
        if (lb.isEmpty() && c1749qQ != null && z(c1749qQ, objF, vl.F1(), vl.m(), vl.G1())) {
            return c1749qQ;
        }
        return null;
    }

    public static boolean z(C1749qQ c1749qQ, Object obj, boolean z6, int i, int i3) {
        Object obj2 = c1749qQ.f16374a;
        int i6 = c1749qQ.f16375b;
        if (obj2.equals(obj)) {
            return z6 ? i6 == i && c1749qQ.f16376c == i3 : i6 == -1 && c1749qQ.f16378e == -1;
        }
        return false;
    }

    public String a() {
        String str = (String) C2841s.f23267e.f23270c.a(H9.jb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) this.f16137a);
            jSONObject.put("eventCategory", (String) this.f16138b);
            jSONObject.putOpt("event", (String) this.f16139c);
            jSONObject.putOpt("errorCode", (Integer) this.f16140d);
            jSONObject.putOpt("rewardType", (String) this.f16141e);
            jSONObject.putOpt("rewardAmount", (Integer) this.f16142f);
        } catch (JSONException unused) {
            u2.k.h("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        int length = String.valueOf(str).length();
        return AbstractC1135f5.o(new StringBuilder(String.valueOf(string).length() + length + 14 + 2), str, "(\"h5adsEvent\",", string, ");");
    }

    public void b(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f16137a = Integer.valueOf(i);
    }

    @Override // p2.d
    public void c() {
        if (((AtomicBoolean) this.f16142f).get()) {
            ((C1276hk) this.f16137a).onAdClicked();
        }
    }

    public void d(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f16139c) {
            try {
                if (((Context) this.f16141e) != null) {
                    return;
                }
                this.f16141e = context.getApplicationContext();
                E9 e9 = H9.f8692W4;
                C2841s c2841s = C2841s.f23267e;
                if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                    y();
                } else {
                    if (((Boolean) c2841s.f23270c.a(H9.f8687V4)).booleanValue()) {
                        p2.j.f22785C.f22794g.l(new C1623o8(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(q2.a1 a1Var, String str, Cr cr, Dr dr) throws JSONException {
        Xu xu;
        C1338iu c1338iu = (C1338iu) this.f16139c;
        C2090wr c2090wr = (C2090wr) c1338iu.f14823c;
        C0710Rh c0710Rh = (C0710Rh) this.f16138b;
        E9 e9 = H9.f8656Q2;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            q2.r.a();
        }
        p2.j jVar = p2.j.f22785C;
        C2911G c2911g = jVar.f22790c;
        Context context = (Context) this.f16141e;
        final int i = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        final int i3 = 1;
        if (C2911G.i(context) && a1Var.f23156G == null) {
            u2.k.e("Failed to load the ad because app ID is missing.");
            c0710Rh.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Fr

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1677p8 f8208b;

                {
                    this.f8208b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            ((Br) ((C1338iu) this.f8208b.f16139c).f14824d).D(AbstractC1984ut.A(6, null, null));
                            break;
                        default:
                            ((Br) ((C1338iu) this.f8208b.f16139c).f14824d).D(AbstractC1984ut.A(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            u2.k.e("Ad unit ID should not be null for NativeAdLoader.");
            c0710Rh.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Fr

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1677p8 f8208b;

                {
                    this.f8208b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            ((Br) ((C1338iu) this.f8208b.f16139c).f14824d).D(AbstractC1984ut.A(6, null, null));
                            break;
                        default:
                            ((Br) ((C1338iu) this.f8208b.f16139c).f14824d).D(AbstractC1984ut.A(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        boolean z6 = a1Var.f23170f;
        Cr.t(context, z6);
        if (((Boolean) c2841s.f23270c.a(H9.fa)).booleanValue() && z6) {
            ((C0581Jo) c0710Rh.f11031z.c()).b(true);
        }
        int i6 = ((Er) cr).f8014c;
        jVar.f22797k.getClass();
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Bundle bundleC = AbstractC0709Rg.c(new Pair("api-call", lValueOf), new Pair("dynamite-enter", lValueOf));
        C0905au c0905au = (C0905au) this.f16137a;
        c0905au.f13241a = a1Var;
        c0905au.f13259t = bundleC;
        c0905au.f13252m = i6;
        C0960bu c0960buA = c0905au.a();
        Su suZ = AbstractC1135f5.z(context, C1476lN.H(c0960buA), 8, a1Var);
        q2.W w6 = c0960buA.f13492o;
        if (w6 != null) {
            c2090wr.p(w6);
        }
        C0710Rh c0710Rh2 = c0710Rh.f10986b;
        C0895ak c0895ak = new C0895ak();
        c0895ak.f13213a = context;
        c0895ak.f13214b = c0960buA;
        C0895ak c0895ak2 = new C0895ak(c0895ak);
        K4.e eVar = new K4.e();
        eVar.b(c2090wr, c0710Rh.b());
        C0693Qh c0693Qh = new C0693Qh(c0710Rh2, new L6(13, (Object) null), new C0697Ql((C1708pm) c1338iu.f14822b, b7 == true ? 1 : 0, c2090wr.c()), new C1437kl(19), new C1277hl(eVar), c0895ak2, new Nx(23), null, null);
        if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
            xu = (Xu) c0693Qh.f10653e.c();
            xu.i(8);
            xu.c(a1Var.f23153D);
            xu.d(a1Var.f23176m);
        } else {
            xu = null;
        }
        ((C1446ku) c0710Rh.f10969N.c()).a(1);
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c0710Rh.f10989d.c();
        C0440Bj c0440Bj = (C0440Bj) c0693Qh.f10662o.c();
        Ju juC = c0440Bj.c(c0440Bj.b());
        C2136xj c2136xj = new C2136xj(c0623Mf, scheduledExecutorService, juC);
        this.f16142f = c2136xj;
        juC.a(new CD(juC, b5 == true ? 1 : 0, new C0697Ql((Object) c2136xj, (Object) new C1726q3(this, (Rx) dr, xu, suZ, c0693Qh, 5, false), 15, (boolean) (b6 == true ? 1 : 0))), c0623Mf);
        return true;
    }

    @Override // p2.d
    public void f() {
        if (((AtomicBoolean) this.f16142f).get()) {
            ((C1867sk) this.f16138b).a();
            C2138xl c2138xl = (C2138xl) this.f16139c;
            synchronized (c2138xl) {
                c2138xl.C1(C1437kl.f15261k);
            }
        }
    }

    public C1677p8 g(Eu eu) {
        return i(new C0738Tb(14, eu));
    }

    public void h(int i) throws InvalidAlgorithmParameterException {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.f16138b = Integer.valueOf(i);
    }

    public C1677p8 i(InterfaceC1736qD interfaceC1736qD) {
        Mu mu = (Mu) this.f16142f;
        ID id = mu.f9923a;
        return new C1677p8(mu, this.f16139c, (String) this.f16137a, (InterfaceFutureC2326a) this.f16138b, (List) this.f16140d, AbstractC1984ut.F((InterfaceFutureC2326a) this.f16141e, interfaceC1736qD, id));
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public InterfaceFutureC2326a j(C0697Ql c0697Ql, At at) {
        synchronized (this) {
            C0744Th c0744ThS = at.s((InterfaceC2254zt) c0697Ql.f10692c);
            C1822rt c1822rt = new C1822rt((String) this.f16140d);
            switch (c0744ThS.f11421a) {
                case 0:
                    c0744ThS.f11424d = c1822rt;
                    break;
                default:
                    c0744ThS.f11424d = c1822rt;
                    break;
            }
            InterfaceC0848Zj interfaceC0848Zj = (InterfaceC0848Zj) c0744ThS.c();
            interfaceC0848Zj.c();
            interfaceC0848Zj.c();
            q2.a1 a1Var = interfaceC0848Zj.c().f13482d;
            if (a1Var.f23156G != null || a1Var.f23161L != null) {
                this.f16141e = interfaceC0848Zj;
                return ((C0889ae) this.f16137a).n(c0697Ql, at, interfaceC0848Zj);
            }
            C0960bu c0960buC = interfaceC0848Zj.c();
            q2.a1 a1Var2 = c0960buC.f13482d;
            String str = c0960buC.f13485g;
            q2.g1 g1Var = c0960buC.f13488k;
            Executor executor = (Executor) this.f16142f;
            return AbstractC1984ut.F(AbstractC2221zD.r(((C1338iu) this.f16138b).q(interfaceC0848Zj)), new C2089wq(this, c0697Ql, new C1769qt(at, c0697Ql, a1Var2, str, executor, g1Var, null), at, interfaceC0848Zj, 1), executor);
        }
    }

    @Override // p2.d
    public synchronized void k(View view) {
        if (((AtomicBoolean) this.f16142f).compareAndSet(false, true)) {
            ((C0643Ni) this.f16141e).z();
            ((C1976ul) this.f16140d).H1(view);
        }
    }

    public C1731q8 l(C1892t8 c1892t8) {
        synchronized (this.f16139c) {
            if (((C1946u8) this.f16142f) == null) {
                return new C1731q8();
            }
            try {
                if (((C1838s8) this.f16140d).A()) {
                    C1946u8 c1946u8 = (C1946u8) this.f16142f;
                    Parcel parcelH0 = c1946u8.h0();
                    C7.c(parcelH0, c1892t8);
                    Parcel parcelK0 = c1946u8.k0(parcelH0, 2);
                    C1731q8 c1731q8 = (C1731q8) C7.b(parcelK0, C1731q8.CREATOR);
                    parcelK0.recycle();
                    return c1731q8;
                }
                C1946u8 c1946u82 = (C1946u8) this.f16142f;
                Parcel parcelH02 = c1946u82.h0();
                C7.c(parcelH02, c1892t8);
                Parcel parcelK02 = c1946u82.k0(parcelH02, 1);
                C1731q8 c1731q82 = (C1731q8) C7.b(parcelK02, C1731q8.CREATOR);
                parcelK02.recycle();
                return c1731q82;
            } catch (RemoteException e6) {
                u2.k.f("Unable to call into cache service.", e6);
                return new C1731q8();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public Object m() {
        InterfaceC0848Zj interfaceC0848Zj;
        synchronized (this) {
            interfaceC0848Zj = (InterfaceC0848Zj) this.f16141e;
        }
        return interfaceC0848Zj;
    }

    public void n(int i) throws GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.f16139c = Integer.valueOf(i);
    }

    public void o(int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f16140d = Integer.valueOf(i);
    }

    public synchronized C1838s8 p(C1283hr c1283hr, Nx nx) {
        return new C1838s8((Context) this.f16141e, p2.j.f22785C.f22806t.a(), c1283hr, nx, 0);
    }

    public C2060wE q() throws GeneralSecurityException {
        if (((Integer) this.f16137a) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f16138b) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f16139c) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f16140d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((C1952uE) this.f16141e) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int iIntValue = num.intValue();
        C1952uE c1952uE = (C1952uE) this.f16141e;
        if (c1952uE == C1952uE.f17081c) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (c1952uE == C1952uE.f17082d) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (c1952uE == C1952uE.f17083e) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (c1952uE == C1952uE.f17084f) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (c1952uE != C1952uE.f17085g) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new C2060wE(((Integer) this.f16137a).intValue(), ((Integer) this.f16138b).intValue(), ((Integer) this.f16139c).intValue(), ((Integer) this.f16140d).intValue(), (C2006vE) this.f16142f, (C1952uE) this.f16141e);
    }

    public InterfaceFutureC2326a r(C1877su c1877su, C0697Ql c0697Ql) {
        InterfaceC0848Zj interfaceC0848Zj = c1877su.f16818a;
        this.f16141e = interfaceC0848Zj;
        if (c1877su.f16820c != null) {
            if (interfaceC0848Zj.f() != null) {
                c1877su.f16820c.f16604e.p(c1877su.f16818a.f());
            }
            return AbstractC1984ut.e(c1877su.f16820c);
        }
        interfaceC0848Zj.a().f7400g = c1877su.f16819b;
        return ((C0889ae) this.f16137a).n(c0697Ql, null, c1877su.f16818a);
    }

    public /* synthetic */ void s() {
        synchronized (this.f16139c) {
            try {
                C1838s8 c1838s8 = (C1838s8) this.f16140d;
                if (c1838s8 == null) {
                    return;
                }
                if (c1838s8.i() || ((C1838s8) this.f16140d).d()) {
                    ((C1838s8) this.f16140d).h();
                }
                this.f16140d = null;
                this.f16142f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1677p8 t(long j6) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Mu mu = (Mu) this.f16142f;
        ScheduledExecutorService scheduledExecutorService = mu.f9924b;
        return new C1677p8(mu, this.f16139c, (String) this.f16137a, (InterfaceFutureC2326a) this.f16138b, (List) this.f16140d, AbstractC1984ut.E((InterfaceFutureC2326a) this.f16141e, j6, timeUnit, scheduledExecutorService));
    }

    public Ju u() {
        Mu mu = (Mu) this.f16142f;
        Object obj = this.f16139c;
        String str = (String) this.f16137a;
        if (str == null) {
            mu.getClass();
            str = ((Ku) obj).f9578a;
        }
        Ju ju = new Ju(obj, str, (InterfaceFutureC2326a) this.f16141e);
        mu.f9925c.C1(new C1014cu(1, ju));
        InterfaceFutureC2326a interfaceFutureC2326a = (InterfaceFutureC2326a) this.f16138b;
        RunnableC0786Vp runnableC0786Vp = new RunnableC0786Vp(this, 10, ju);
        C0623Mf c0623Mf = AbstractC0640Nf.f10011g;
        interfaceFutureC2326a.a(runnableC0786Vp, c0623Mf);
        ju.a(new CD(ju, 0 == true ? 1 : 0, new C0889ae((Object) this, (Object) ju, 29, false)), c0623Mf);
        return ju;
    }

    public void v(AbstractC1353j8 abstractC1353j8) {
        J4 j42 = new J4(4);
        if (((LB) this.f16138b).isEmpty()) {
            w(j42, (C1749qQ) this.f16141e, abstractC1353j8);
            if (!Objects.equals((C1749qQ) this.f16142f, (C1749qQ) this.f16141e)) {
                w(j42, (C1749qQ) this.f16142f, abstractC1353j8);
            }
            if (!Objects.equals((C1749qQ) this.f16140d, (C1749qQ) this.f16141e) && !Objects.equals((C1749qQ) this.f16140d, (C1749qQ) this.f16142f)) {
                w(j42, (C1749qQ) this.f16140d, abstractC1353j8);
            }
        } else {
            for (int i = 0; i < ((LB) this.f16138b).size(); i++) {
                w(j42, (C1749qQ) ((LB) this.f16138b).get(i), abstractC1353j8);
            }
            if (!((LB) this.f16138b).contains((C1749qQ) this.f16140d)) {
                w(j42, (C1749qQ) this.f16140d, abstractC1353j8);
            }
        }
        this.f16139c = j42.w(true);
    }

    public void w(J4 j42, C1749qQ c1749qQ, AbstractC1353j8 abstractC1353j8) {
        if (c1749qQ == null) {
            return;
        }
        if (abstractC1353j8.e(c1749qQ.f16374a) != -1) {
            j42.k(c1749qQ, abstractC1353j8);
            return;
        }
        AbstractC1353j8 abstractC1353j82 = (AbstractC1353j8) ((C1465lC) this.f16139c).get(c1749qQ);
        if (abstractC1353j82 != null) {
            j42.k(c1749qQ, abstractC1353j82);
        }
    }

    public void y() {
        synchronized (this.f16139c) {
            try {
                if (((Context) this.f16141e) != null && ((C1838s8) this.f16140d) == null) {
                    C1838s8 c1838s8P = p(new C1283hr(7, this), new Nx(6, this));
                    this.f16140d = c1838s8P;
                    c1838s8P.n();
                }
            } finally {
            }
        }
    }

    public /* synthetic */ C1677p8(String str) {
        this.f16138b = str;
    }

    public C1677p8(int i) {
        switch (i) {
            case 6:
                this.f16137a = null;
                this.f16138b = null;
                this.f16139c = null;
                this.f16140d = null;
                this.f16141e = null;
                this.f16142f = C2006vE.f17239e;
                break;
            default:
                this.f16137a = null;
                this.f16138b = new RunnableC1883t(10, this);
                this.f16139c = new Object();
                break;
        }
    }

    public C1677p8(Mu mu, Object obj, String str, InterfaceFutureC2326a interfaceFutureC2326a, List list, InterfaceFutureC2326a interfaceFutureC2326a2) {
        Objects.requireNonNull(mu);
        this.f16142f = mu;
        this.f16139c = obj;
        this.f16137a = str;
        this.f16138b = interfaceFutureC2326a;
        this.f16140d = list;
        this.f16141e = interfaceFutureC2326a2;
    }
}
