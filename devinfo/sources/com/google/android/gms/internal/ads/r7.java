package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r7 implements p6, ua.d, p81, pb.b, pb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15556a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15557b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15558c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15559d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15560e;

    /* renamed from: f, reason: collision with root package name */
    public Object f15561f;

    public /* synthetic */ r7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.f15556a = i4;
        this.f15557b = obj;
        this.f15558c = obj2;
        this.f15559d = obj3;
        this.f15560e = obj4;
        this.f15561f = obj5;
    }

    private final void d(Throwable th2) {
        bs0 bs0Var;
        pk pkVar = sk.B6;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            ya.a0.n("App open ad failed to load", th2);
        }
        po0 po0Var = (po0) this.f15561f;
        n10 n10Var = (n10) po0Var.f15062e.f();
        va.w1 w1VarT = n10Var == null ? yo0.t(th2, null) : yo0.t(th2, n10Var.b().f18636l);
        synchronized (po0Var) {
            try {
                po0Var.j = null;
                if (n10Var != null) {
                    ((h60) n10Var.f14112l.a()).o(w1VarT);
                    if (((Boolean) sVar.f36166c.a(sk.f16259o9)).booleanValue()) {
                        po0Var.f15059b.execute(new uh0(5, this, w1VarT));
                    }
                } else {
                    po0Var.f15061d.o(w1VarT);
                    po0Var.b((mo0) this.f15560e).a().b().f18632f.H1();
                }
                al0.o(w1VarT.f36177a, "AppOpenAdLoader.onFailure", th2);
                ((bl0) this.f15557b).mo167b();
                if (!((Boolean) ol.f14724c.u()).booleanValue() || (bs0Var = (bs0) this.f15558c) == null) {
                    cs0 cs0Var = po0Var.f15064h;
                    yr0 yr0Var = (yr0) this.f15559d;
                    yr0Var.i(w1VarT);
                    yr0Var.h(th2);
                    yr0Var.c(false);
                    cs0Var.b(yr0Var.F1());
                } else {
                    bs0Var.f(w1VarT);
                    yr0 yr0Var2 = (yr0) this.f15559d;
                    yr0Var2.h(th2);
                    yr0Var2.c(false);
                    bs0Var.a(yr0Var2);
                    bs0Var.h();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private final void e(Throwable th2) {
        bs0 bs0Var;
        pk pkVar = sk.B6;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            ya.a0.n("Interstitial ad failed to load", th2);
        }
        t10 t10Var = (t10) this.f15560e;
        final va.w1 w1VarT = yo0.t(th2, ((y40) t10Var.f16650n.a()).f18636l);
        lp0 lp0Var = (lp0) this.f15561f;
        synchronized (lp0Var) {
            try {
                lp0Var.f13573i = null;
                ((h60) t10Var.j.a()).o(w1VarT);
                if (((Boolean) sVar.f36166c.a(sk.f16275p9)).booleanValue()) {
                    final int i4 = 0;
                    lp0Var.f13567b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.kp0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ r7 f13226b;

                        {
                            this.f13226b = this;
                        }

                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            switch (i4) {
                                case 0:
                                    ((lp0) this.f13226b.f15561f).f13569d.o(w1VarT);
                                    break;
                                default:
                                    ((lp0) this.f13226b.f15561f).f13570e.o(w1VarT);
                                    break;
                            }
                        }
                    });
                    final int i10 = 1;
                    lp0Var.f13567b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.kp0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ r7 f13226b;

                        {
                            this.f13226b = this;
                        }

                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            switch (i10) {
                                case 0:
                                    ((lp0) this.f13226b.f15561f).f13569d.o(w1VarT);
                                    break;
                                default:
                                    ((lp0) this.f13226b.f15561f).f13570e.o(w1VarT);
                                    break;
                            }
                        }
                    });
                }
                al0.o(w1VarT.f36177a, "InterstitialAdLoader.onFailure", th2);
                ((bl0) this.f15557b).mo167b();
                if (!((Boolean) ol.f14724c.u()).booleanValue() || (bs0Var = (bs0) this.f15558c) == null) {
                    cs0 cs0Var = lp0Var.g;
                    yr0 yr0Var = (yr0) this.f15559d;
                    yr0Var.i(w1VarT);
                    yr0Var.h(th2);
                    yr0Var.c(false);
                    cs0Var.b(yr0Var.F1());
                } else {
                    bs0Var.f(w1VarT);
                    yr0 yr0Var2 = (yr0) this.f15559d;
                    yr0Var2.h(th2);
                    yr0Var2.c(false);
                    bs0Var.a(yr0Var2);
                    bs0Var.h();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private final void i(Object obj) {
        bs0 bs0Var;
        ai aiVar = (ai) this.f15561f;
        o40 o40Var = (o40) obj;
        synchronized (aiVar) {
            if (o40Var != null) {
                try {
                    o40Var.b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ((p70) o40Var.g.f14913a.f11194b).f14914b = (uk0) ((pq0) aiVar.f9332c).f15074c;
            ((ne0) this.f15557b).i(o40Var);
            ((k10) aiVar.f9331b).b().execute(new t40(this, 1));
            if (!((Boolean) ol.f14724c.u()).booleanValue() || (bs0Var = (bs0) this.f15558c) == null) {
                cs0 cs0Var = (cs0) aiVar.f9333d;
                yr0 yr0Var = (yr0) this.f15559d;
                yr0Var.j(o40Var.f14532a.f10544b);
                yr0Var.c0(o40Var.f14537f.f9997a);
                yr0Var.c(true);
                cs0Var.b(yr0Var.F1());
            } else {
                bs0Var.e(o40Var.f14532a.f10544b);
                bs0Var.g(o40Var.f14537f.f9997a);
                yr0 yr0Var2 = (yr0) this.f15559d;
                yr0Var2.c(true);
                bs0Var.a(yr0Var2);
                bs0Var.h();
            }
        }
    }

    private final void j(Object obj) {
        bs0 bs0Var;
        po0 po0Var = (po0) this.f15561f;
        o40 o40Var = (o40) obj;
        synchronized (po0Var) {
            if (o40Var != null) {
                try {
                    o40Var.b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            po0Var.j = null;
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16259o9)).booleanValue()) {
                ((p70) o40Var.g.f14913a.f11194b).f14916d = po0Var.f15061d;
            }
            ((bl0) this.f15557b).i(o40Var);
            if (!((Boolean) ol.f14724c.u()).booleanValue() || (bs0Var = (bs0) this.f15558c) == null) {
                cs0 cs0Var = po0Var.f15064h;
                yr0 yr0Var = (yr0) this.f15559d;
                yr0Var.j(o40Var.f14532a.f10544b);
                yr0Var.c0(o40Var.f14537f.f9997a);
                yr0Var.c(true);
                cs0Var.b(yr0Var.F1());
            } else {
                bs0Var.e(o40Var.f14532a.f10544b);
                bs0Var.g(o40Var.f14537f.f9997a);
                yr0 yr0Var2 = (yr0) this.f15559d;
                yr0Var2.c(true);
                bs0Var.a(yr0Var2);
                bs0Var.h();
            }
        }
    }

    private final void k(Object obj) {
        bs0 bs0Var;
        lp0 lp0Var = (lp0) this.f15561f;
        b90 b90Var = (b90) obj;
        synchronized (lp0Var) {
            if (b90Var != null) {
                try {
                    b90Var.b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            lp0Var.f13573i = null;
            pk pkVar = sk.f16275p9;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                fk0 fk0Var = b90Var.g.f14913a;
                uk0 uk0Var = lp0Var.f13569d;
                p70 p70Var = (p70) fk0Var.f11194b;
                p70Var.f14914b = uk0Var;
                p70Var.f14917e = lp0Var.f13570e;
            }
            ((bl0) this.f15557b).i(b90Var);
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                final int i4 = 1;
                lp0Var.f13567b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jp0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r7 f12809b;

                    {
                        this.f12809b = this;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        switch (i4) {
                            case 0:
                                ((lp0) this.f12809b.f15561f).f13570e.e();
                                break;
                            default:
                                ((lp0) this.f12809b.f15561f).f13569d.e();
                                break;
                        }
                    }
                });
                final int i10 = 0;
                lp0Var.f13567b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jp0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r7 f12809b;

                    {
                        this.f12809b = this;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        switch (i10) {
                            case 0:
                                ((lp0) this.f12809b.f15561f).f13570e.e();
                                break;
                            default:
                                ((lp0) this.f12809b.f15561f).f13569d.e();
                                break;
                        }
                    }
                });
            }
            if (!((Boolean) ol.f14724c.u()).booleanValue() || (bs0Var = (bs0) this.f15558c) == null) {
                cs0 cs0Var = lp0Var.g;
                yr0 yr0Var = (yr0) this.f15559d;
                yr0Var.j(b90Var.f14532a.f10544b);
                yr0Var.c0(b90Var.f14537f.f9997a);
                yr0Var.c(true);
                cs0Var.b(yr0Var.F1());
            } else {
                bs0Var.e(b90Var.f14532a.f10544b);
                bs0Var.g(b90Var.f14537f.f9997a);
                yr0 yr0Var2 = (yr0) this.f15559d;
                yr0Var2.c(true);
                bs0Var.a(yr0Var2);
                bs0Var.h();
            }
        }
    }

    public static md l() {
        zc zcVarC0 = md.C0();
        zcVarC0.i(32768L);
        return (md) zcVarC0.e();
    }

    @Override // com.google.android.gms.internal.ads.p6
    public long L1(int i4) {
        return ((long[]) this.f15558c)[i4];
    }

    @Override // pb.c
    public void O(nb.b bVar) throws InterruptedException {
        try {
            ((LinkedBlockingQueue) this.f15560e).put(l());
        } catch (InterruptedException unused) {
        }
    }

    @Override // pb.b
    public void S(int i4) throws InterruptedException {
        try {
            ((LinkedBlockingQueue) this.f15560e).put(l());
        } catch (InterruptedException unused) {
        }
    }

    @Override // pb.b
    public void T() {
        wv0 wv0Var;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.f15560e;
        HandlerThread handlerThread = (HandlerThread) this.f15561f;
        try {
            wv0Var = (wv0) ((tv0) this.f15557b).t();
        } catch (DeadObjectException | IllegalStateException unused) {
            wv0Var = null;
        }
        if (wv0Var != null) {
            try {
                try {
                    uv0 uv0Var = new uv0(1, (String) this.f15558c, (String) this.f15559d);
                    Parcel parcelT = wv0Var.T();
                    ng.c(parcelT, uv0Var);
                    Parcel parcelR0 = wv0Var.r0(parcelT, 1);
                    vv0 vv0Var = (vv0) ng.b(parcelR0, vv0.CREATOR);
                    parcelR0.recycle();
                    if (vv0Var.f17732b == null) {
                        try {
                            byte[] bArr = vv0Var.f17733c;
                            jn1 jn1Var = jn1.f12801a;
                            int i4 = um1.f17262a;
                            vv0Var.f17732b = md.B0(bArr, jn1.f12802b);
                            vv0Var.f17733c = null;
                        } catch (ao1 | NullPointerException e2) {
                            throw new IllegalStateException(e2);
                        }
                    }
                    vv0Var.a();
                    linkedBlockingQueue.put(vv0Var.f17732b);
                } catch (InterruptedException unused2) {
                } catch (Throwable th2) {
                    a();
                    handlerThread.quit();
                    throw th2;
                }
            } catch (Throwable unused3) {
                linkedBlockingQueue.put(l());
            }
            a();
            handlerThread.quit();
        }
    }

    @Override // ua.d
    public void a() {
        switch (this.f15556a) {
            case 4:
                break;
            default:
                tv0 tv0Var = (tv0) this.f15557b;
                if (tv0Var != null) {
                    if (tv0Var.g() || tv0Var.c()) {
                        tv0Var.f();
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p6
    public int b() {
        return ((long[]) this.f15558c).length;
    }

    public vd.b c(String str) {
        za.k kVar = za.k.f38157b;
        if (str != null) {
            if (!((Boolean) va.s.f36163e.f36166c.a(sk.g)).booleanValue() || !str.isEmpty()) {
                try {
                    return m(1, 0L, str);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return yo0.e(kVar);
                }
            }
        }
        return yo0.e(kVar);
    }

    @Override // com.google.android.gms.internal.ads.p6
    public ArrayList g(long j) {
        Map map = (Map) this.f15559d;
        HashMap map2 = (HashMap) this.f15560e;
        HashMap map3 = (HashMap) this.f15561f;
        m7 m7Var = (m7) this.f15557b;
        ArrayList arrayList = new ArrayList();
        String str = m7Var.f13789h;
        m7Var.g(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        m7Var.h(j, false, str, treeMap);
        m7Var.j(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Pair pair = (Pair) arrayList.get(i4);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                p7 p7Var = (p7) map2.get(pair.first);
                p7Var.getClass();
                arrayList2.add(new w40(null, null, null, bitmapDecodeByteArray, p7Var.f14907c, 0, p7Var.f14909e, p7Var.f14906b, 0, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, p7Var.f14910f, p7Var.g, p7Var.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            p7 p7Var2 = (p7) map2.get(entry.getKey());
            p7Var2.getClass();
            k40 k40Var = (k40) entry.getValue();
            CharSequence charSequence = k40Var.f13013a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (k7 k7Var : (k7[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), k7.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(k7Var), spannableStringBuilder.getSpanEnd(k7Var), (CharSequence) "");
            }
            int i10 = 0;
            while (i10 < spannableStringBuilder.length()) {
                int i11 = i10 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
                i10 = i11;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i14 = 0;
            while (i14 < spannableStringBuilder.length() - 1) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i14) == '\n' && spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
                i14 = i15;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i16 = 0;
            while (i16 < spannableStringBuilder.length() - 1) {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i16) == ' ' && spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
                i16 = i17;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = p7Var2.f14907c;
            int i18 = p7Var2.f14908d;
            k40Var.f13017e = f10;
            k40Var.f13018f = i18;
            k40Var.g = p7Var2.f14909e;
            k40Var.f13019h = p7Var2.f14906b;
            k40Var.f13022l = p7Var2.f14910f;
            float f11 = p7Var2.f14912i;
            int i19 = p7Var2.f14911h;
            k40Var.f13021k = f11;
            k40Var.j = i19;
            k40Var.f13024n = p7Var2.j;
            arrayList2.add(k40Var.a());
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        bs0 bs0Var;
        switch (this.f15556a) {
            case 5:
                i(obj);
                return;
            case 6:
                j(obj);
                return;
            case 7:
                k(obj);
                return;
            default:
                qp0 qp0Var = (qp0) this.f15561f;
                oc0 oc0Var = (oc0) obj;
                synchronized (qp0Var) {
                    if (oc0Var != null) {
                        try {
                            oc0Var.b();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    ((p70) oc0Var.g.f14913a.f11194b).f14917e = qp0Var.f15389d;
                    ((bl0) this.f15557b).i(oc0Var);
                    Executor executor = qp0Var.f15387b;
                    np0 np0Var = qp0Var.f15389d;
                    Objects.requireNonNull(np0Var);
                    executor.execute(new s30(25, np0Var));
                    qp0Var.f15389d.f();
                    if (!((Boolean) ol.f14724c.u()).booleanValue() || (bs0Var = (bs0) this.f15558c) == null) {
                        cs0 cs0Var = qp0Var.g;
                        yr0 yr0Var = (yr0) this.f15559d;
                        yr0Var.j(oc0Var.f14532a.f10544b);
                        yr0Var.c0(oc0Var.f14537f.f9997a);
                        yr0Var.c(true);
                        cs0Var.b(yr0Var.F1());
                    } else {
                        bs0Var.e(oc0Var.f14532a.f10544b);
                        bs0Var.g(oc0Var.f14537f.f9997a);
                        yr0 yr0Var2 = (yr0) this.f15559d;
                        yr0Var2.c(true);
                        bs0Var.a(yr0Var2);
                        bs0Var.h();
                    }
                }
                return;
        }
    }

    public vd.b m(final int i4, final long j, final String str) {
        final String strM;
        w81 w81Var = (x81) this.f15559d;
        za.h hVar = (za.h) this.f15557b;
        if (i4 > hVar.f38151a) {
            at0 at0Var = (at0) this.f15560e;
            if (at0Var == null || !hVar.f38154d) {
                return yo0.e(za.k.f38158c);
            }
            ua.j.C.f35267k.getClass();
            sa saVar = new sa("", str, 2, System.currentTimeMillis());
            lh0 lh0Var = at0Var.f9410a;
            lh0Var.getClass();
            lh0Var.c(new ce1(lh0Var, false, saVar, 15));
            return yo0.e(za.k.f38159d);
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.J9)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i4));
            String strValueOf = String.valueOf(builderClearQuery.build());
            strM = r5.c.m(new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length()), strValueOf, "&", encodedQuery);
        } else {
            strM = str;
        }
        e81 e81Var = new e81() { // from class: com.google.android.gms.internal.ads.zs0
            @Override // com.google.android.gms.internal.ads.e81
            public final vd.b c(Object obj) {
                za.k kVar = (za.k) obj;
                if (kVar != za.k.f38158c) {
                    return yo0.e(kVar);
                }
                r7 r7Var = this.f19169a;
                za.h hVar2 = (za.h) r7Var.f15557b;
                long j8 = hVar2.f38152b;
                int i10 = i4;
                if (i10 != 1) {
                    j8 = (long) (hVar2.f38153c * j);
                }
                return r7Var.m(i10 + 1, j8, str);
            }
        };
        if (j == 0) {
            final int i10 = 1;
            return yo0.F(((ex) w81Var).e(new Callable(this) { // from class: com.google.android.gms.internal.ads.ys0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r7 f18846b;

                {
                    this.f18846b = this;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    switch (i10) {
                    }
                    return this.f18846b.p(strM);
                }
            }), e81Var, w81Var);
        }
        final int i11 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.ys0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r7 f18846b;

            {
                this.f18846b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i11) {
                }
                return this.f18846b.p(strM);
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c91 c91Var = (c91) w81Var;
        c91Var.getClass();
        h91 h91Var = new h91(callable);
        return yo0.F(new a91(h91Var, c91Var.f10021c.schedule(h91Var, j, timeUnit)), e81Var, c91Var);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        bs0 bs0Var;
        bs0 bs0Var2;
        switch (this.f15556a) {
            case 5:
                yr0 yr0Var = (yr0) this.f15559d;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.B6)).booleanValue()) {
                    ya.a0.n("Native ad failed to load", th2);
                }
                j10 j10Var = (j10) this.f15560e;
                va.w1 w1VarT = yo0.t(th2, ((y40) j10Var.f12578o.a()).f18636l);
                ((h60) j10Var.f12574k.a()).o(w1VarT);
                ai aiVar = (ai) this.f15561f;
                ((k10) aiVar.f9331b).b().execute(new uh0(4, this, w1VarT));
                al0.o(w1VarT.f36177a, "NativeAdLoader.onFailure", th2);
                ((ne0) this.f15557b).mo167b();
                if (!((Boolean) ol.f14724c.u()).booleanValue() || (bs0Var = (bs0) this.f15558c) == null) {
                    cs0 cs0Var = (cs0) aiVar.f9333d;
                    yr0Var.i(w1VarT);
                    yr0Var.h(th2);
                    yr0Var.c(false);
                    cs0Var.b(yr0Var.F1());
                    return;
                }
                bs0Var.f(w1VarT);
                yr0Var.h(th2);
                yr0Var.c(false);
                bs0Var.a(yr0Var);
                bs0Var.h();
                return;
            case 6:
                d(th2);
                return;
            case 7:
                e(th2);
                return;
            default:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.B6)).booleanValue()) {
                    ya.a0.n("Rewarded ad failed to load", th2);
                }
                qp0 qp0Var = (qp0) this.f15561f;
                w10 w10Var = (w10) qp0Var.f15390e.f();
                va.w1 w1VarT2 = w10Var == null ? yo0.t(th2, null) : yo0.t(th2, w10Var.b().f18636l);
                synchronized (qp0Var) {
                    try {
                        if (w10Var != null) {
                            ((h60) w10Var.f17831n.a()).o(w1VarT2);
                            qp0Var.f15387b.execute(new uh0(7, this, w1VarT2));
                        } else {
                            qp0Var.f15389d.o(w1VarT2);
                            qp0Var.b((pp0) this.f15560e).b().b().f18632f.H1();
                        }
                        al0.o(w1VarT2.f36177a, "RewardedAdLoader.onFailure", th2);
                        ((bl0) this.f15557b).mo167b();
                        if (!((Boolean) ol.f14724c.u()).booleanValue() || (bs0Var2 = (bs0) this.f15558c) == null) {
                            cs0 cs0Var2 = qp0Var.g;
                            yr0 yr0Var2 = (yr0) this.f15559d;
                            yr0Var2.i(w1VarT2);
                            yr0Var2.h(th2);
                            yr0Var2.c(false);
                            cs0Var2.b(yr0Var2.F1());
                        } else {
                            bs0Var2.f(w1VarT2);
                            yr0 yr0Var3 = (yr0) this.f15559d;
                            yr0Var3.h(th2);
                            yr0Var3.c(false);
                            bs0Var2.a(yr0Var3);
                            bs0Var2.h();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }

    @Override // ua.d
    public void o(View view) {
        ne0 ne0Var = (ne0) this.f15560e;
        ne0 ne0Var2 = (ne0) ((ck0) this.f15561f).f10148e;
        dq0 dq0Var = (dq0) this.f15558c;
        wp0 wp0Var = (wp0) this.f15559d;
        gx gxVar = (gx) this.f15557b;
        qc0 qc0Var = new qc0(new kh0(2, ne0Var2, wp0Var), null, 1);
        pq0 pq0Var = new pq0(dq0Var, wp0Var, (String) null);
        t10 t10Var = (t10) ne0Var2.f14280b;
        s10 s10Var = new s10(t10Var.f16640b, t10Var.f16641c, pq0Var, qc0Var);
        rg0 rg0Var = new rg0(4, ne0Var2, s10Var);
        synchronized (ne0Var) {
            ne0Var.f14280b = rg0Var;
        }
        gxVar.b(s10Var.Z());
    }

    public za.k p(String str) {
        t00 t00Var;
        za.l lVar = (za.l) this.f15558c;
        pk pkVar = sk.f16061ba;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && (t00Var = (t00) this.f15561f) != null) {
            ua.j jVar = ua.j.C;
            if (jVar.f35261c.G(str) || jVar.f35261c.H(str)) {
                qr1 qr1Var = t00Var.f16623c;
                String strEncodeToString = qr1Var != null ? Base64.encodeToString(qr1Var.b(), 10) : null;
                HashMap map = new HashMap();
                if (strEncodeToString != null) {
                    map.put((String) sVar.f36166c.a(sk.f16077ca), strEncodeToString);
                }
                return lVar.a(map, str);
            }
        }
        return lVar.a(null, str);
    }

    public /* synthetic */ r7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4, boolean z3) {
        this.f15556a = i4;
        this.f15557b = obj2;
        this.f15558c = obj3;
        this.f15559d = obj4;
        this.f15560e = obj5;
        this.f15561f = obj;
    }

    public r7(Context context, b00 b00Var, b00 b00Var2, qd0 qd0Var) {
        this.f15556a = 2;
        this.f15557b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f15559d = b00Var;
        this.f15558c = b00Var2;
        this.f15561f = null;
        this.f15560e = qd0Var;
    }

    public r7(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
        this.f15556a = 10;
        this.f15558c = str;
        this.f15559d = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f15561f = handlerThread;
        handlerThread.start();
        tv0 tv0Var = new tv0(context, handlerThread.getLooper(), this, this, 9200000);
        this.f15557b = tv0Var;
        this.f15560e = new LinkedBlockingQueue();
        tv0Var.n();
    }

    public r7(m7 m7Var, HashMap map, HashMap map2, HashMap map3) {
        this.f15556a = 0;
        this.f15557b = m7Var;
        this.f15560e = map2;
        this.f15561f = map3;
        this.f15559d = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i4 = 0;
        m7Var.f(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i4] = ((Long) it.next()).longValue();
            i4++;
        }
        this.f15558c = jArr;
    }

    public r7(xn xnVar) {
        xm wmVar;
        this.f15556a = 1;
        this.f15558c = new ArrayList();
        this.f15560e = new pa.s();
        this.f15561f = new ArrayList();
        this.f15557b = xnVar;
        ym ymVar = null;
        try {
            List listD = xnVar.d();
            if (listD != null) {
                for (Object obj : listD) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        wmVar = iInterfaceQueryLocalInterface instanceof xm ? (xm) iInterfaceQueryLocalInterface : new wm(iBinder);
                    } else {
                        wmVar = null;
                    }
                    if (wmVar != null) {
                        ((ArrayList) this.f15558c).add(new ym(wmVar));
                    }
                }
            }
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
        try {
            List listZ = ((xn) this.f15557b).z();
            if (listZ != null) {
                for (Object obj2 : listZ) {
                    va.l1 l1VarH4 = obj2 instanceof IBinder ? va.j2.h4((IBinder) obj2) : null;
                    if (l1VarH4 != null) {
                        ((ArrayList) this.f15561f).add(new gb.a(l1VarH4));
                    }
                }
            }
        } catch (RemoteException e10) {
            za.i.f("", e10);
        }
        try {
            xm xmVarZ1 = ((xn) this.f15557b).z1();
            if (xmVarZ1 != null) {
                ymVar = new ym(xmVarZ1);
            }
        } catch (RemoteException e11) {
            za.i.f("", e11);
        }
        this.f15559d = ymVar;
        try {
            if (((xn) this.f15557b).E1() != null) {
                new mx0(((xn) this.f15557b).E1());
            }
        } catch (RemoteException e12) {
            za.i.f("", e12);
        }
    }

    private final void f() {
    }

    @Override // ua.d
    /* renamed from: zzc */
    public void mo171zzc() {
    }
}
