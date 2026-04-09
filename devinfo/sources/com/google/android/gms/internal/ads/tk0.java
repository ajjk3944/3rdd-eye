package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class tk0 implements xo0, p81, Continuation, l31, k31, o91, wd1 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16838b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16839c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16840d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16841e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16842f;
    public static final /* synthetic */ tk0 g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16843h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16844i;
    public static final /* synthetic */ tk0 j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16845k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16846l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16847m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16848n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16849o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16850p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16851q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16852r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16853s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16854t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16855u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16856v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16857w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ tk0 f16858x;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16859a;

    static {
        byte b10 = 0;
        f16838b = new tk0(b10, 0);
        f16839c = new tk0(b10, 1);
        f16840d = new tk0(b10, 2);
        f16841e = new tk0(b10, 3);
        f16842f = new tk0(b10, 4);
        g = new tk0(b10, 5);
        f16843h = new tk0(b10, 6);
        f16844i = new tk0(b10, 7);
        j = new tk0(b10, 8);
        f16845k = new tk0(b10, 9);
        f16846l = new tk0(b10, 11);
        f16847m = new tk0(b10, 12);
        f16848n = new tk0(b10, 13);
        f16849o = new tk0(b10, 14);
        f16850p = new tk0(b10, 20);
        f16851q = new tk0(b10, 21);
        f16852r = new tk0(b10, 23);
        f16853s = new tk0(b10, 24);
        f16854t = new tk0(b10, 25);
        f16855u = new tk0(b10, 26);
        f16856v = new tk0(b10, 27);
        f16857w = new tk0(b10, 28);
        f16858x = new tk0(b10, 29);
    }

    public /* synthetic */ tk0(byte b10, int i4) {
        this.f16859a = i4;
    }

    @Override // com.google.android.gms.internal.ads.wd1, com.google.android.gms.internal.ads.xc1
    public Object a(al0 al0Var) {
        switch (this.f16859a) {
            case 23:
                mb1 mb1Var = (mb1) al0Var;
                pc1 pc1Var = y91.f18685a;
                try {
                    wb1.b();
                    return new fc1(((vl1) mb1Var.f13860d.f13160b).b(), mb1Var.f13861e.b(), wb1.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new cc1(((vl1) mb1Var.f13860d.f13160b).b(), 3, mb1Var.f13861e.b());
                }
            case 24:
                wa1 wa1Var = (wa1) al0Var;
                pc1 pc1Var2 = y91.f18685a;
                try {
                    wb1.b();
                    return new wb1(((vl1) wa1Var.f17954d.f13160b).b(), wa1Var.f17955e.b(), wb1.b().getProvider());
                } catch (GeneralSecurityException unused2) {
                    return new cc1(((vl1) wa1Var.f17954d.f13160b).b(), 2, wa1Var.f17955e.b());
                }
            case 25:
                return gl1.b((ma1) al0Var);
            case 26:
                qa1 qa1Var = (qa1) al0Var;
                qa1Var.getClass();
                return new cc1(((vl1) qa1Var.f15280d.f13160b).b(), qa1Var.f15281e);
            case 27:
                return hc1.b((ta1) al0Var);
            case 28:
                return kl1.b((fa1) al0Var);
            default:
                jb1 jb1Var = (jb1) al0Var;
                jb1Var.getClass();
                return new dc1(((vl1) jb1Var.f12710d.f13160b).b(), jb1Var.f12711e, jb1Var.f12709c.f13451b);
        }
    }

    @Override // com.google.android.gms.internal.ads.o91
    /* renamed from: b, reason: collision with other method in class */
    public void mo172b() {
        switch (this.f16859a) {
            case 21:
                break;
            default:
                jd1.f12719b.a().getClass();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.xo0
    public /* synthetic */ void c(Object obj) {
        switch (this.f16859a) {
            case 0:
                ((va.a1) obj).h();
                break;
            case 1:
                ((va.a1) obj).c();
                break;
            case 2:
                ((va.a1) obj).f();
                break;
            case 3:
                ((b70) obj).B1();
                break;
            case 4:
                ((xa.l) obj).D2();
                break;
            case 5:
                ((xa.l) obj).h3();
                break;
            case 6:
                ((xa.l) obj).z1();
                break;
            case 7:
                ((yh) obj).h();
                break;
            case 8:
                ((yh) obj).d();
                break;
            case 9:
                ((yh) obj).e();
                break;
            case 10:
            default:
                ((jb.a) obj).f();
                break;
            case 11:
                ((fv) obj).D1();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public /* synthetic */ void mo163h(Object obj) {
        ya.a0.m("Notification of cache hit successful.");
    }

    @Override // com.google.android.gms.internal.ads.k31
    public Iterator m(rg0 rg0Var, CharSequence charSequence) {
        return new i31(charSequence);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        ya.a0.m("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        return new Boolean(task.isSuccessful());
    }

    public tk0(int i4) {
        this.f16859a = 17;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public /* synthetic */ Object b() {
        switch (this.f16859a) {
            case 14:
                return -1;
            case 15:
                return -1;
            case 16:
            case 17:
            default:
                throw new IllegalStateException();
            case 18:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
        }
    }

    private final /* synthetic */ void d() {
    }
}
