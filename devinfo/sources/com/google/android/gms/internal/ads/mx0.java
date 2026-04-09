package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import j$.util.Objects;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mx0 implements h1, q21, q9, qv0, ix, db.b, y81, p81, c80, n00, ua.g, qg0 {

    /* renamed from: c, reason: collision with root package name */
    public static mx0 f14039c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14040a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14041b;

    public mx0(int i4) {
        this.f14040a = i4;
        switch (i4) {
            case 9:
                this.f14041b = new HashMap();
                break;
            default:
                this.f14041b = new ArrayDeque();
                break;
        }
    }

    public static final mx0 g(Context context) {
        mx0 mx0Var;
        synchronized (mx0.class) {
            try {
                if (f14039c == null) {
                    f14039c = new mx0(context);
                }
                mx0Var = f14039c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mx0Var;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public void a() {
        switch (this.f14040a) {
            case 0:
                synchronized (mx0.class) {
                    ce1 ce1Var = (ce1) this.f14041b;
                    ce1Var.m("vendor_scoped_gpid_v2_id");
                    ce1Var.m("vendor_scoped_gpid_v2_creation_time");
                }
                return;
            default:
                i0 i0Var = (i0) this.f14041b;
                Surface surface = i0Var.Q0;
                if (surface != null) {
                    g1 g1Var = i0Var.D0;
                    Handler handler = g1Var.f11341a;
                    if (handler != null) {
                        handler.post(new f1(g1Var, surface, SystemClock.elapsedRealtime()));
                    }
                    i0Var.T0 = true;
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.q9
    public long b() {
        return ((ByteBuffer) this.f14041b).capacity();
    }

    @Override // com.google.android.gms.internal.ads.ix
    public void c(Object obj) {
        switch (this.f14040a) {
            case 11:
                y50 y50Var = (y50) this.f14041b;
                y50Var.getClass();
                qz qzVar = ((zp) obj).f19142a;
                if (qzVar == null || qzVar.g0()) {
                    y50Var.g = 1;
                    break;
                }
                break;
            case 12:
                zp zpVar = (zp) obj;
                ya.a0.m("Getting a new session for JS Engine.");
                zpVar.getClass();
                ((gx) ((hq) this.f14041b).f1325a).b(new kq(zpVar));
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                ((y70) obj).u((pj) this.f14041b);
                break;
            case 18:
                ((i60) obj).o((va.w1) this.f14041b);
                break;
            case 19:
                ((j60) obj).K((e90) this.f14041b);
                break;
            case 20:
                ((e70) obj).a((va.d3) this.f14041b);
                break;
            case 21:
                ((n70) obj).t((iu) this.f14041b);
                break;
        }
    }

    @Override // ua.g
    public void d() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        k70 k70Var = ((wc0) this.f14041b).g;
        synchronized (k70Var) {
            try {
                if (k70Var.j) {
                    if (k70Var.f13072h > 0 && (scheduledFuture2 = k70Var.f13074k) != null && scheduledFuture2.isCancelled()) {
                        k70Var.x1(k70Var.f13072h);
                    }
                    if (k70Var.f13073i > 0 && (scheduledFuture = k70Var.f13075l) != null && scheduledFuture.isCancelled()) {
                        k70Var.y1(k70Var.f13073i);
                    }
                    k70Var.j = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.q9
    public void e(MessageDigest[] messageDigestArr, long j, int i4) {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = (ByteBuffer) this.f14041b;
        synchronized (byteBuffer) {
            int i10 = (int) j;
            byteBuffer.position(i10);
            byteBuffer.limit(i10 + i4);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public void f(int i4, long j, String str) {
        ((gv0) this.f14041b).e(i4, System.currentTimeMillis() - j, null, null, str);
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        switch (this.f14040a) {
            case 16:
                b30 b30Var = (b30) this.f14041b;
                bt0 bt0Var = b30Var.g;
                dq0 dq0Var = b30Var.f9571e;
                wp0 wp0Var = b30Var.f9572f;
                b30Var.f9573h.b(true == ua.j.C.f35265h.k(b30Var.f9567a) ? 2 : 1, bt0Var.b(dq0Var, wp0Var, false, "", (String) obj, wp0Var.f18076c, null, null));
                break;
            case 17:
                ((y40) this.f14041b).f18632f.p(true);
                break;
            case 27:
                ((we0) obj).f18004n = true;
                ((pf0) this.f14041b).f14998d.b();
                break;
            default:
                dq0 dq0Var2 = (dq0) obj;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.G2)).booleanValue()) {
                    ((cg0) this.f14041b).f10113k.l(dq0Var2);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public vd.b j(iu iuVar) {
        jg0 jg0Var = (jg0) this.f14041b;
        synchronized (jg0Var.f11859b) {
            try {
                int i4 = jg0Var.f12744h;
                if (i4 != 1 && i4 != 2) {
                    return yo0.w(new og0(2));
                }
                if (jg0Var.f11860c) {
                    return jg0Var.f11858a;
                }
                jg0Var.f12744h = 2;
                jg0Var.f11860c = true;
                jg0Var.f11862e = iuVar;
                jg0Var.f11863f.n();
                gx gxVar = jg0Var.f11858a;
                gxVar.f11625a.a(new ig0(jg0Var, 1), fx.g);
                return gxVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public void k(int i4, long j) {
        ((gv0) this.f14041b).b(i4, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.q21
    public /* synthetic */ void l(long j, sk0 sk0Var) {
        a80.f(j, sk0Var, ((e9) this.f14041b).f10745c);
    }

    @Override // ua.g
    public void m() {
        k70 k70Var = ((wc0) this.f14041b).g;
        synchronized (k70Var) {
            try {
                if (k70Var.j) {
                    return;
                }
                ScheduledFuture scheduledFuture = k70Var.f13074k;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    k70Var.f13072h = -1L;
                } else {
                    k70Var.f13074k.cancel(false);
                    long j = k70Var.f13071f;
                    k70Var.f13069d.getClass();
                    k70Var.f13072h = j - SystemClock.elapsedRealtime();
                }
                ScheduledFuture scheduledFuture2 = k70Var.f13075l;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    k70Var.f13073i = -1L;
                } else {
                    k70Var.f13075l.cancel(false);
                    long j8 = k70Var.g;
                    k70Var.f13069d.getClass();
                    k70Var.f13073i = j8 - SystemClock.elapsedRealtime();
                }
                k70Var.j = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        switch (this.f14040a) {
            case 16:
                break;
            case 17:
                ((y40) this.f14041b).f18632f.p(false);
                break;
        }
    }

    public AtomicReference o(String str) {
        synchronized (this) {
            try {
                HashMap map = (HashMap) this.f14041b;
                if (!map.containsKey(str)) {
                    map.put(str, new AtomicReference());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (AtomicReference) ((HashMap) this.f14041b).get(str);
    }

    public void p(long j, long j8, long j9) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        yb ybVar = new yb(j, j8, j9);
        ArrayDeque arrayDeque = (ArrayDeque) this.f14041b;
        if (arrayDeque.size() >= (d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15) ^ (i16 % 452867621))) {
            throw new zb();
        }
        arrayDeque.push(ybVar);
    }

    public yb u() {
        return (yb) Optional.ofNullable((yb) ((ArrayDeque) this.f14041b).peek()).orElseThrow(xb.f18340b);
    }

    public void v(long j) {
        ai aiVar = new ai("creation");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "nativeObjectNotCreated";
        w(aiVar);
    }

    public void w(ai aiVar) {
        String strB = aiVar.b();
        za.i.g("Dispatching AFMA event on publisher webview: ".concat(strB));
        zo zoVar = (zo) this.f14041b;
        Parcel parcelT = zoVar.T();
        parcelT.writeString(strB);
        zoVar.g1(parcelT, 1);
    }

    @Override // com.google.android.gms.internal.ads.h1
    /* renamed from: zzc */
    public void mo174zzc() {
        i0 i0Var = (i0) this.f14041b;
        if (i0Var.Q0 != null) {
            i0Var.r0(0, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.y81
    /* renamed from: b, reason: collision with other method in class */
    public /* synthetic */ l91 mo168b() {
        AtomicInteger atomicInteger = fz.f11292u;
        return new t51((byte[]) this.f14041b);
    }

    public /* synthetic */ mx0(int i4, Object obj) {
        this.f14040a = i4;
        this.f14041b = obj;
    }

    @Override // com.google.android.gms.internal.ads.h1, com.google.android.gms.internal.ads.n00, com.google.android.gms.internal.ads.pm
    /* renamed from: b, reason: collision with other method in class */
    public void mo169b() {
        switch (this.f14040a) {
            case 1:
                jt1 jt1Var = ((i0) this.f14041b).H;
                if (jt1Var != null) {
                    jt1Var.a();
                    break;
                }
                break;
            default:
                ((gi) this.f14041b).e();
                break;
        }
    }

    public mx0(Context context) {
        this.f14040a = 0;
        if (ce1.f10092d == null) {
            ce1.f10092d = new ce1(context, 20);
        }
        this.f14041b = ce1.f10092d;
        ix0.d(context);
    }

    public mx0(tm tmVar) {
        xm wmVar;
        this.f14040a = 10;
        this.f14041b = new ArrayList();
        try {
            tmVar.a();
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
        try {
            ArrayList arrayListZzc = tmVar.zzc();
            int size = arrayListZzc.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListZzc.get(i4);
                i4++;
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    wmVar = iInterfaceQueryLocalInterface instanceof xm ? (xm) iInterfaceQueryLocalInterface : new wm(iBinder);
                } else {
                    wmVar = null;
                }
                if (wmVar != null) {
                    ((ArrayList) this.f14041b).add(new ym(wmVar));
                }
            }
        } catch (RemoteException e10) {
            za.i.f("", e10);
        }
    }

    public mx0(iq iqVar, hq hqVar) {
        this.f14040a = 12;
        this.f14041b = hqVar;
        Objects.requireNonNull(iqVar);
    }

    public mx0(ms msVar, ks ksVar) {
        this.f14040a = 13;
        this.f14041b = ksVar;
    }

    public mx0(ByteBuffer byteBuffer) {
        this.f14040a = 6;
        this.f14041b = byteBuffer.slice();
    }

    private final void q(Throwable th2) {
    }

    private final void r(Throwable th2) {
    }

    private final void t(Throwable th2) {
    }
}
