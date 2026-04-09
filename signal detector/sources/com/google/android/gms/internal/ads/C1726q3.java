package com.google.android.gms.internal.ads;

import M2.InterfaceC0162b;
import M2.InterfaceC0163c;
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
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
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
import q2.C2841s;
import q2.C2852x0;
import q2.InterfaceC2831m0;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.q3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1726q3 implements P2, p2.d, BD, InterfaceC0162b, InterfaceC0163c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16311a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16312b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16313c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16314d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16315e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16316f;

    public /* synthetic */ C1726q3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f16311a = i;
        this.f16312b = obj;
        this.f16313c = obj2;
        this.f16314d = obj3;
        this.f16315e = obj4;
        this.f16316f = obj5;
    }

    private final void e(Throwable th) {
        Xu xu;
        E9 e9 = H9.B6;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            AbstractC2907C.n("App open ad failed to load", th);
        }
        C1445kt c1445kt = (C1445kt) this.f16316f;
        C0761Uh c0761Uh = (C0761Uh) c1445kt.f15305e.m();
        C2852x0 c2852x0T = c0761Uh == null ? AbstractC1984ut.t(th, null) : AbstractC1984ut.t(th, c0761Uh.a().f7404l);
        synchronized (c1445kt) {
            try {
                c1445kt.f15309j = null;
                if (c0761Uh != null) {
                    ((C1490lk) c0761Uh.f11743l.c()).D(c2852x0T);
                    if (((Boolean) c2841s.f23270c.a(H9.m9)).booleanValue()) {
                        c1445kt.f15302b.execute(new RunnableC0786Vp(this, 6, c2852x0T));
                    }
                } else {
                    c1445kt.f15304d.D(c2852x0T);
                    c1445kt.b((C1177ft) this.f16315e).a().a().f7399f.p();
                }
                Cr.j(c2852x0T.f23273a, "AppOpenAdLoader.onFailure", th);
                ((Dr) this.f16312b).mo6a();
                if (!((Boolean) AbstractC1049da.f13768c.v()).booleanValue() || (xu = (Xu) this.f16313c) == null) {
                    Yu yu = c1445kt.f15308h;
                    Su su = (Su) this.f16314d;
                    su.e(c2852x0T);
                    su.d(th);
                    su.b(false);
                    yu.b(su.n());
                } else {
                    xu.f(c2852x0T);
                    Su su2 = (Su) this.f16314d;
                    su2.d(th);
                    su2.b(false);
                    xu.a(su2);
                    xu.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void g(Throwable th) {
        Xu xu;
        E9 e9 = H9.B6;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            AbstractC2907C.n("Interstitial ad failed to load", th);
        }
        C0893ai c0893ai = (C0893ai) this.f16315e;
        final C2852x0 c2852x0T = AbstractC1984ut.t(th, ((C0440Bj) c0893ai.f13198n.c()).f7404l);
        Gt gt = (Gt) this.f16316f;
        synchronized (gt) {
            try {
                gt.i = null;
                ((C1490lk) c0893ai.f13194j.c()).D(c2852x0T);
                if (((Boolean) c2841s.f23270c.a(H9.n9)).booleanValue()) {
                    final int i = 0;
                    gt.f8467b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Ft

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ C1726q3 f8216b;

                        {
                            this.f8216b = this;
                        }

                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            switch (i) {
                                case 0:
                                    ((Gt) this.f8216b.f16316f).f8469d.D(c2852x0T);
                                    break;
                                default:
                                    ((Gt) this.f8216b.f16316f).f8470e.D(c2852x0T);
                                    break;
                            }
                        }
                    });
                    final int i3 = 1;
                    gt.f8467b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Ft

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ C1726q3 f8216b;

                        {
                            this.f8216b = this;
                        }

                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            switch (i3) {
                                case 0:
                                    ((Gt) this.f8216b.f16316f).f8469d.D(c2852x0T);
                                    break;
                                default:
                                    ((Gt) this.f8216b.f16316f).f8470e.D(c2852x0T);
                                    break;
                            }
                        }
                    });
                }
                Cr.j(c2852x0T.f23273a, "InterstitialAdLoader.onFailure", th);
                ((Dr) this.f16312b).mo6a();
                if (!((Boolean) AbstractC1049da.f13768c.v()).booleanValue() || (xu = (Xu) this.f16313c) == null) {
                    Yu yu = gt.f8472g;
                    Su su = (Su) this.f16314d;
                    su.e(c2852x0T);
                    su.d(th);
                    su.b(false);
                    yu.b(su.n());
                } else {
                    xu.f(c2852x0T);
                    Su su2 = (Su) this.f16314d;
                    su2.d(th);
                    su2.b(false);
                    xu.a(su2);
                    xu.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void l(Object obj) {
        Xu xu;
        C1677p8 c1677p8 = (C1677p8) this.f16316f;
        AbstractC1812rj abstractC1812rj = (AbstractC1812rj) obj;
        synchronized (c1677p8) {
            if (abstractC1812rj != null) {
                try {
                    abstractC1812rj.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((C0764Uk) abstractC1812rj.f16606g.f11770a.f10110b).f11771b = (C2090wr) ((C1338iu) c1677p8.f16139c).f14823c;
            ((Rx) this.f16312b).v(abstractC1812rj);
            ((C0710Rh) c1677p8.f16138b).b().execute(new RunnableC2082wj(this, 1));
            if (!((Boolean) AbstractC1049da.f13768c.v()).booleanValue() || (xu = (Xu) this.f16313c) == null) {
                Yu yu = (Yu) c1677p8.f16140d;
                Su su = (Su) this.f16314d;
                su.h(abstractC1812rj.f16600a.f12510b);
                su.s0(abstractC1812rj.f16605f.f14124a);
                su.b(true);
                yu.b(su.n());
            } else {
                xu.e(abstractC1812rj.f16600a.f12510b);
                xu.g(abstractC1812rj.f16605f.f14124a);
                Su su2 = (Su) this.f16314d;
                su2.b(true);
                xu.a(su2);
                xu.h();
            }
        }
    }

    private final void m(Object obj) {
        Xu xu;
        C1445kt c1445kt = (C1445kt) this.f16316f;
        AbstractC1812rj abstractC1812rj = (AbstractC1812rj) obj;
        synchronized (c1445kt) {
            if (abstractC1812rj != null) {
                try {
                    abstractC1812rj.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            c1445kt.f15309j = null;
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.m9)).booleanValue()) {
                ((C0764Uk) abstractC1812rj.f16606g.f11770a.f10110b).f11773d = c1445kt.f15304d;
            }
            ((Dr) this.f16312b).v(abstractC1812rj);
            if (!((Boolean) AbstractC1049da.f13768c.v()).booleanValue() || (xu = (Xu) this.f16313c) == null) {
                Yu yu = c1445kt.f15308h;
                Su su = (Su) this.f16314d;
                su.h(abstractC1812rj.f16600a.f12510b);
                su.s0(abstractC1812rj.f16605f.f14124a);
                su.b(true);
                yu.b(su.n());
            } else {
                xu.e(abstractC1812rj.f16600a.f12510b);
                xu.g(abstractC1812rj.f16605f.f14124a);
                Su su2 = (Su) this.f16314d;
                su2.b(true);
                xu.a(su2);
                xu.h();
            }
        }
    }

    private final void n(Object obj) {
        Xu xu;
        Gt gt = (Gt) this.f16316f;
        C0493El c0493El = (C0493El) obj;
        synchronized (gt) {
            if (c0493El != null) {
                try {
                    c0493El.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            gt.i = null;
            E9 e9 = H9.n9;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                Nx nx = c0493El.f16606g.f11770a;
                C2090wr c2090wr = gt.f8469d;
                C0764Uk c0764Uk = (C0764Uk) nx.f10110b;
                c0764Uk.f11771b = c2090wr;
                c0764Uk.f11774e = gt.f8470e;
            }
            ((Dr) this.f16312b).v(c0493El);
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                final int i = 1;
                gt.f8467b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Et

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C1726q3 f8022b;

                    {
                        this.f8022b = this;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        switch (i) {
                            case 0:
                                ((Gt) this.f8022b.f16316f).f8470e.e();
                                break;
                            default:
                                ((Gt) this.f8022b.f16316f).f8469d.e();
                                break;
                        }
                    }
                });
                final int i3 = 0;
                gt.f8467b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Et

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C1726q3 f8022b;

                    {
                        this.f8022b = this;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        switch (i3) {
                            case 0:
                                ((Gt) this.f8022b.f16316f).f8470e.e();
                                break;
                            default:
                                ((Gt) this.f8022b.f16316f).f8469d.e();
                                break;
                        }
                    }
                });
            }
            if (!((Boolean) AbstractC1049da.f13768c.v()).booleanValue() || (xu = (Xu) this.f16313c) == null) {
                Yu yu = gt.f8472g;
                Su su = (Su) this.f16314d;
                su.h(c0493El.f16600a.f12510b);
                su.s0(c0493El.f16605f.f14124a);
                su.b(true);
                yu.b(su.n());
            } else {
                xu.e(c0493El.f16600a.f12510b);
                xu.g(c0493El.f16605f.f14124a);
                Su su2 = (Su) this.f16314d;
                su2.b(true);
                xu.a(su2);
                xu.h();
            }
        }
    }

    public static C1136f6 o() {
        S5 s5C0 = C1136f6.C0();
        s5C0.h(32768L);
        return (C1136f6) s5C0.d();
    }

    @Override // com.google.android.gms.internal.ads.P2
    public int a() {
        return ((long[]) this.f16313c).length;
    }

    public InterfaceFutureC2326a b(String str) {
        u2.m mVar = u2.m.f23817b;
        if (str != null) {
            if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8745g)).booleanValue() || !str.isEmpty()) {
                try {
                    return p(1, 0L, str);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return AbstractC1984ut.e(mVar);
                }
            }
        }
        return AbstractC1984ut.e(mVar);
    }

    @Override // p2.d
    public void c() {
        switch (this.f16311a) {
            case 4:
                break;
            default:
                Pw pw = (Pw) this.f16312b;
                if (pw != null) {
                    if (pw.i() || pw.d()) {
                        pw.h();
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
        Xu xu;
        switch (this.f16311a) {
            case 5:
                l(obj);
                return;
            case 6:
                m(obj);
                return;
            case 7:
                n(obj);
                return;
            default:
                Lt lt = (Lt) this.f16316f;
                C1870sn c1870sn = (C1870sn) obj;
                synchronized (lt) {
                    if (c1870sn != null) {
                        try {
                            c1870sn.b();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ((C0764Uk) c1870sn.f16606g.f11770a.f10110b).f11774e = lt.f9777d;
                    ((Dr) this.f16312b).v(c1870sn);
                    Executor executor = lt.f9775b;
                    It it = lt.f9777d;
                    Objects.requireNonNull(it);
                    executor.execute(new RunnableC0558Ii(26, it));
                    lt.f9777d.c();
                    if (!((Boolean) AbstractC1049da.f13768c.v()).booleanValue() || (xu = (Xu) this.f16313c) == null) {
                        Yu yu = lt.f9780g;
                        Su su = (Su) this.f16314d;
                        su.h(c1870sn.f16600a.f12510b);
                        su.s0(c1870sn.f16605f.f14124a);
                        su.b(true);
                        yu.b(su.n());
                    } else {
                        xu.e(c1870sn.f16600a.f12510b);
                        xu.g(c1870sn.f16605f.f14124a);
                        Su su2 = (Su) this.f16314d;
                        su2.b(true);
                        xu.a(su2);
                        xu.h();
                    }
                }
                return;
        }
    }

    @Override // M2.InterfaceC0162b
    public void g0(int i) throws InterruptedException {
        try {
            ((LinkedBlockingQueue) this.f16315e).put(o());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.P2
    public long h(int i) {
        return ((long[]) this.f16313c)[i];
    }

    @Override // M2.InterfaceC0162b
    public void h0() {
        Sw sw;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.f16315e;
        HandlerThread handlerThread = (HandlerThread) this.f16316f;
        try {
            sw = (Sw) ((Pw) this.f16312b).t();
        } catch (DeadObjectException | IllegalStateException unused) {
            sw = null;
        }
        if (sw != null) {
            try {
                try {
                    Qw qw = new Qw(1, (String) this.f16313c, (String) this.f16314d);
                    Parcel parcelH0 = sw.h0();
                    C7.c(parcelH0, qw);
                    Parcel parcelK0 = sw.k0(parcelH0, 1);
                    Rw rw = (Rw) C7.b(parcelK0, Rw.CREATOR);
                    parcelK0.recycle();
                    if (rw.f11086b == null) {
                        try {
                            byte[] bArr = rw.f11087c;
                            XK xk = XK.f12412a;
                            int i = JK.f9277a;
                            rw.f11086b = C1136f6.B0(bArr, XK.f12413b);
                            rw.f11087c = null;
                        } catch (C1636oL | NullPointerException e6) {
                            throw new IllegalStateException(e6);
                        }
                    }
                    rw.a();
                    linkedBlockingQueue.put(rw.f11086b);
                } catch (InterruptedException unused2) {
                } catch (Throwable th) {
                    c();
                    handlerThread.quit();
                    throw th;
                }
            } catch (Throwable unused3) {
                linkedBlockingQueue.put(o());
            }
            c();
            handlerThread.quit();
        }
    }

    @Override // com.google.android.gms.internal.ads.P2
    public ArrayList i(long j6) {
        Map map = (Map) this.f16314d;
        HashMap map2 = (HashMap) this.f16315e;
        HashMap map3 = (HashMap) this.f16316f;
        C1510m3 c1510m3 = (C1510m3) this.f16312b;
        ArrayList arrayList = new ArrayList();
        String str = c1510m3.f15517h;
        c1510m3.g(j6, str, arrayList);
        TreeMap treeMap = new TreeMap();
        c1510m3.h(j6, false, str, treeMap);
        c1510m3.j(j6, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C1618o3 c1618o3 = (C1618o3) map2.get(pair.first);
                c1618o3.getClass();
                arrayList2.add(new C2244zj(null, null, null, bitmapDecodeByteArray, c1618o3.f15890c, 0, c1618o3.f15892e, c1618o3.f15889b, 0, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, c1618o3.f15893f, c1618o3.f15894g, c1618o3.f15896j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C1618o3 c1618o32 = (C1618o3) map2.get(entry.getKey());
            c1618o32.getClass();
            C1597nj c1597nj = (C1597nj) entry.getValue();
            CharSequence charSequence = c1597nj.f15799a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C1402k3 c1402k3 : (C1402k3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1402k3.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c1402k3), spannableStringBuilder.getSpanEnd(c1402k3), (CharSequence) "");
            }
            int i3 = 0;
            while (i3 < spannableStringBuilder.length()) {
                int i6 = i3 + 1;
                if (spannableStringBuilder.charAt(i3) == ' ') {
                    int i7 = i6;
                    while (i7 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i7) == ' ') {
                        i7++;
                    }
                    int i8 = i7 - i6;
                    if (i8 > 0) {
                        spannableStringBuilder.delete(i3, i8 + i3);
                    }
                }
                i3 = i6;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i9 = 0;
            while (i9 < spannableStringBuilder.length() - 1) {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i9) == '\n' && spannableStringBuilder.charAt(i10) == ' ') {
                    spannableStringBuilder.delete(i10, i9 + 2);
                }
                i9 = i10;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length() - 1) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ' && spannableStringBuilder.charAt(i12) == '\n') {
                    spannableStringBuilder.delete(i11, i12);
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f2 = c1618o32.f15890c;
            int i13 = c1618o32.f15891d;
            c1597nj.f15803e = f2;
            c1597nj.f15804f = i13;
            c1597nj.f15805g = c1618o32.f15892e;
            c1597nj.f15806h = c1618o32.f15889b;
            c1597nj.f15809l = c1618o32.f15893f;
            float f5 = c1618o32.i;
            int i14 = c1618o32.f15895h;
            c1597nj.f15808k = f5;
            c1597nj.f15807j = i14;
            c1597nj.f15811n = c1618o32.f15896j;
            arrayList2.add(c1597nj.a());
        }
        return arrayList2;
    }

    @Override // p2.d
    public void k(View view) {
        C1389jr c1389jr = (C1389jr) this.f16315e;
        L6 l6 = (L6) ((C1120er) this.f16316f).f13993e;
        Xt xt = (Xt) this.f16313c;
        Qt qt = (Qt) this.f16314d;
        C0657Of c0657Of = (C0657Of) this.f16312b;
        C1978un c1978un = new C1978un(new Nx(l6, 24, qt), null, 1);
        C1338iu c1338iu = new C1338iu(xt, qt, (String) null);
        C0893ai c0893ai = (C0893ai) l6.f9620b;
        C0846Zh c0846Zh = new C0846Zh(c0893ai.f13187b, c0893ai.f13188c, c1338iu, c1978un);
        Rx rx = new Rx(l6, 26, c0846Zh);
        synchronized (c1389jr) {
            c1389jr.f15005a = rx;
        }
        c0657Of.b(c0846Zh.B());
    }

    @Override // M2.InterfaceC0163c
    public void k0(J2.b bVar) throws InterruptedException {
        try {
            ((LinkedBlockingQueue) this.f16315e).put(o());
        } catch (InterruptedException unused) {
        }
    }

    public InterfaceFutureC2326a p(final int i, final long j6, final String str) {
        final String strN;
        Executor executor = (JD) this.f16314d;
        u2.j jVar = (u2.j) this.f16312b;
        if (i > jVar.f23811a) {
            C2094wv c2094wv = (C2094wv) this.f16315e;
            if (c2094wv == null || !jVar.f23814d) {
                return AbstractC1984ut.e(u2.m.f23818c);
            }
            p2.j.f22785C.f22797k.getClass();
            N4 n42 = new N4(System.currentTimeMillis(), "", str, 2);
            C0633Mp c0633Mp = c2094wv.f17517a;
            c0633Mp.getClass();
            c0633Mp.a(new C0889ae(c0633Mp, 25, n42));
            return AbstractC1984ut.e(u2.m.f23819d);
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.H9)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i));
            String strValueOf = String.valueOf(builderClearQuery.build());
            strN = AbstractC1135f5.n(new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length()), strValueOf, "&", encodedQuery);
        } else {
            strN = str;
        }
        InterfaceC1736qD interfaceC1736qD = new InterfaceC1736qD() { // from class: com.google.android.gms.internal.ads.vv
            @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
            public final InterfaceFutureC2326a b(Object obj) {
                u2.m mVar = (u2.m) obj;
                if (mVar != u2.m.f23818c) {
                    return AbstractC1984ut.e(mVar);
                }
                C1726q3 c1726q3 = this.f17364a;
                u2.j jVar2 = (u2.j) c1726q3.f16312b;
                long j7 = jVar2.f23812b;
                int i3 = i;
                if (i3 != 1) {
                    j7 = (long) (jVar2.f23813c * j6);
                }
                return c1726q3.p(i3 + 1, j7, str);
            }
        };
        if (j6 == 0) {
            final int i3 = 1;
            return AbstractC1984ut.F(((C0623Mf) executor).b(new Callable(this) { // from class: com.google.android.gms.internal.ads.uv

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1726q3 f17189b;

                {
                    this.f17189b = this;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    switch (i3) {
                    }
                    return this.f17189b.q(strN);
                }
            }), interfaceC1736qD, executor);
        }
        final int i6 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.uv

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1726q3 f17189b;

            {
                this.f17189b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i6) {
                }
                return this.f17189b.q(strN);
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OD od = (OD) executor;
        od.getClass();
        TD td = new TD(callable);
        return AbstractC1984ut.F(new MD(td, od.f10170c.schedule(td, j6, timeUnit)), interfaceC1736qD, od);
    }

    public u2.m q(String str) {
        C0421Ah c0421Ah;
        u2.n nVar = (u2.n) this.f16313c;
        E9 e9 = H9.Z9;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && (c0421Ah = (C0421Ah) this.f16316f) != null) {
            p2.j jVar = p2.j.f22785C;
            if (jVar.f22790c.G(str) || jVar.f22790c.H(str)) {
                C1044dN c1044dN = c0421Ah.f7024c;
                String strEncodeToString = c1044dN != null ? Base64.encodeToString(c1044dN.b(), 10) : null;
                HashMap map = new HashMap();
                if (strEncodeToString != null) {
                    map.put((String) c2841s.f23270c.a(H9.aa), strEncodeToString);
                }
                return nVar.a(map, str);
            }
        }
        return nVar.a(null, str);
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        Xu xu;
        Xu xu2;
        switch (this.f16311a) {
            case 5:
                Su su = (Su) this.f16314d;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.B6)).booleanValue()) {
                    AbstractC2907C.n("Native ad failed to load", th);
                }
                C0693Qh c0693Qh = (C0693Qh) this.f16315e;
                C2852x0 c2852x0T = AbstractC1984ut.t(th, ((C0440Bj) c0693Qh.f10662o.c()).f7404l);
                ((C1490lk) c0693Qh.f10658k.c()).D(c2852x0T);
                C1677p8 c1677p8 = (C1677p8) this.f16316f;
                ((C0710Rh) c1677p8.f16138b).b().execute(new RunnableC0786Vp(this, 5, c2852x0T));
                Cr.j(c2852x0T.f23273a, "NativeAdLoader.onFailure", th);
                ((Rx) this.f16312b).mo6a();
                if (!((Boolean) AbstractC1049da.f13768c.v()).booleanValue() || (xu = (Xu) this.f16313c) == null) {
                    Yu yu = (Yu) c1677p8.f16140d;
                    su.e(c2852x0T);
                    su.d(th);
                    su.b(false);
                    yu.b(su.n());
                    return;
                }
                xu.f(c2852x0T);
                su.d(th);
                su.b(false);
                xu.a(su);
                xu.h();
                return;
            case 6:
                e(th);
                return;
            case 7:
                g(th);
                return;
            default:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.B6)).booleanValue()) {
                    AbstractC2907C.n("Rewarded ad failed to load", th);
                }
                Lt lt = (Lt) this.f16316f;
                C1002ci c1002ci = (C1002ci) lt.f9778e.m();
                C2852x0 c2852x0T2 = c1002ci == null ? AbstractC1984ut.t(th, null) : AbstractC1984ut.t(th, c1002ci.a().f7404l);
                synchronized (lt) {
                    try {
                        if (c1002ci != null) {
                            ((C1490lk) c1002ci.f13649n.c()).D(c2852x0T2);
                            lt.f9775b.execute(new RunnableC0786Vp(this, 8, c2852x0T2));
                        } else {
                            lt.f9777d.D(c2852x0T2);
                            lt.b((Kt) this.f16315e).b().a().f7399f.p();
                        }
                        Cr.j(c2852x0T2.f23273a, "RewardedAdLoader.onFailure", th);
                        ((Dr) this.f16312b).mo6a();
                        if (!((Boolean) AbstractC1049da.f13768c.v()).booleanValue() || (xu2 = (Xu) this.f16313c) == null) {
                            Yu yu2 = lt.f9780g;
                            Su su2 = (Su) this.f16314d;
                            su2.e(c2852x0T2);
                            su2.d(th);
                            su2.b(false);
                            yu2.b(su2.n());
                        } else {
                            xu2.f(c2852x0T2);
                            Su su3 = (Su) this.f16314d;
                            su3.d(th);
                            su3.b(false);
                            xu2.a(su3);
                            xu2.h();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public /* synthetic */ C1726q3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z6) {
        this.f16311a = i;
        this.f16312b = obj2;
        this.f16313c = obj3;
        this.f16314d = obj4;
        this.f16315e = obj5;
        this.f16316f = obj;
    }

    public C1726q3(Context context, C1273hh c1273hh, C1273hh c1273hh2, C0784Vn c0784Vn) {
        this.f16311a = 2;
        this.f16312b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f16314d = c1273hh;
        this.f16313c = c1273hh2;
        this.f16316f = null;
        this.f16315e = c0784Vn;
    }

    public C1726q3(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
        this.f16311a = 10;
        this.f16313c = str;
        this.f16314d = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f16316f = handlerThread;
        handlerThread.start();
        Pw pw = new Pw(context, handlerThread.getLooper(), this, this, 9200000);
        this.f16312b = pw;
        this.f16315e = new LinkedBlockingQueue();
        pw.n();
    }

    public C1726q3(C1510m3 c1510m3, HashMap map, HashMap map2, HashMap map3) {
        this.f16311a = 0;
        this.f16312b = c1510m3;
        this.f16315e = map2;
        this.f16316f = map3;
        this.f16314d = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        c1510m3.f(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f16313c = jArr;
    }

    public C1726q3(InterfaceC1589nb interfaceC1589nb) {
        InterfaceC0635Na c0618Ma;
        IBinder iBinder;
        this.f16311a = 1;
        this.f16313c = new ArrayList();
        this.f16315e = new j2.s();
        this.f16316f = new ArrayList();
        this.f16312b = interfaceC1589nb;
        C0652Oa c0652Oa = null;
        try {
            List listD = interfaceC1589nb.d();
            if (listD != null) {
                for (Object obj : listD) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        c0618Ma = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        c0618Ma = iInterfaceQueryLocalInterface instanceof InterfaceC0635Na ? (InterfaceC0635Na) iInterfaceQueryLocalInterface : new C0618Ma(iBinder);
                    }
                    if (c0618Ma != null) {
                        ((ArrayList) this.f16313c).add(new C0652Oa(c0618Ma));
                    }
                }
            }
        } catch (RemoteException e6) {
            u2.k.f("", e6);
        }
        try {
            List listS = ((InterfaceC1589nb) this.f16312b).S();
            if (listS != null) {
                for (Object obj2 : listS) {
                    InterfaceC2831m0 interfaceC2831m0K3 = obj2 instanceof IBinder ? q2.K0.K3((IBinder) obj2) : null;
                    if (interfaceC2831m0K3 != null) {
                        ((ArrayList) this.f16316f).add(new X3.e(interfaceC2831m0K3));
                    }
                }
            }
        } catch (RemoteException e7) {
            u2.k.f("", e7);
        }
        try {
            InterfaceC0635Na interfaceC0635NaG = ((InterfaceC1589nb) this.f16312b).g();
            if (interfaceC0635NaG != null) {
                c0652Oa = new C0652Oa(interfaceC0635NaG);
            }
        } catch (RemoteException e8) {
            u2.k.f("", e8);
        }
        this.f16314d = c0652Oa;
        try {
            if (((InterfaceC1589nb) this.f16312b).l() != null) {
                new C0567Ja(((InterfaceC1589nb) this.f16312b).l(), 0);
            }
        } catch (RemoteException e9) {
            u2.k.f("", e9);
        }
    }

    private final void j() {
    }

    @Override // p2.d
    public void f() {
    }
}
