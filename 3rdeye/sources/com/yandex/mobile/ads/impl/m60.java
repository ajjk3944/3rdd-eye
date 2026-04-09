package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.e12;
import com.yandex.mobile.ads.impl.hi1;
import com.yandex.mobile.ads.impl.i60;
import com.yandex.mobile.ads.impl.jh;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.mh;
import com.yandex.mobile.ads.impl.mw0;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.o22;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.v42;
import com.yandex.mobile.ads.impl.xx1;
import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class m60 extends lk implements i60 {

    /* renamed from: A, reason: collision with root package name */
    private int f30224A;

    /* renamed from: B, reason: collision with root package name */
    private int f30225B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f30226C;

    /* renamed from: D, reason: collision with root package name */
    private int f30227D;

    /* renamed from: E, reason: collision with root package name */
    private xx1 f30228E;

    /* renamed from: F, reason: collision with root package name */
    private bi1.a f30229F;

    /* renamed from: G, reason: collision with root package name */
    private aw0 f30230G;

    /* renamed from: H, reason: collision with root package name */
    private AudioTrack f30231H;

    /* renamed from: I, reason: collision with root package name */
    private Object f30232I;

    /* renamed from: J, reason: collision with root package name */
    private Surface f30233J;

    /* renamed from: K, reason: collision with root package name */
    private TextureView f30234K;

    /* renamed from: L, reason: collision with root package name */
    private int f30235L;

    /* renamed from: M, reason: collision with root package name */
    private int f30236M;

    /* renamed from: N, reason: collision with root package name */
    private int f30237N;

    /* renamed from: O, reason: collision with root package name */
    private int f30238O;

    /* renamed from: P, reason: collision with root package name */
    private ih f30239P;

    /* renamed from: Q, reason: collision with root package name */
    private float f30240Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f30241R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f30242S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f30243T;

    /* renamed from: U, reason: collision with root package name */
    private d10 f30244U;

    /* renamed from: V, reason: collision with root package name */
    private aw0 f30245V;

    /* renamed from: W, reason: collision with root package name */
    private th1 f30246W;

    /* renamed from: X, reason: collision with root package name */
    private int f30247X;

    /* renamed from: Y, reason: collision with root package name */
    private long f30248Y;

    /* renamed from: b, reason: collision with root package name */
    final t52 f30249b;

    /* renamed from: c, reason: collision with root package name */
    final bi1.a f30250c;

    /* renamed from: d, reason: collision with root package name */
    private final cr f30251d;

    /* renamed from: e, reason: collision with root package name */
    private final bi1 f30252e;

    /* renamed from: f, reason: collision with root package name */
    private final so1[] f30253f;

    /* renamed from: g, reason: collision with root package name */
    private final s52 f30254g;

    /* renamed from: h, reason: collision with root package name */
    private final bf0 f30255h;
    private final o60 i;

    /* renamed from: j, reason: collision with root package name */
    private final nr0<bi1.b> f30256j;

    /* renamed from: k, reason: collision with root package name */
    private final CopyOnWriteArraySet<i60.a> f30257k;

    /* renamed from: l, reason: collision with root package name */
    private final v42.b f30258l;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList f30259m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f30260n;

    /* renamed from: o, reason: collision with root package name */
    private final jw0.a f30261o;

    /* renamed from: p, reason: collision with root package name */
    private final xc f30262p;

    /* renamed from: q, reason: collision with root package name */
    private final Looper f30263q;

    /* renamed from: r, reason: collision with root package name */
    private final pi f30264r;

    /* renamed from: s, reason: collision with root package name */
    private final m32 f30265s;

    /* renamed from: t, reason: collision with root package name */
    private final b f30266t;

    /* renamed from: u, reason: collision with root package name */
    private final jh f30267u;

    /* renamed from: v, reason: collision with root package name */
    private final mh f30268v;

    /* renamed from: w, reason: collision with root package name */
    private final o22 f30269w;

    /* renamed from: x, reason: collision with root package name */
    private final vi2 f30270x;

    /* renamed from: y, reason: collision with root package name */
    private final uj2 f30271y;

    /* renamed from: z, reason: collision with root package name */
    private final long f30272z;

    public static final class a {
        public static gi1 a(Context context, m60 m60Var, boolean z10) {
            bw0 bw0VarA = bw0.a(context);
            if (bw0VarA == null) {
                rs0.d("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new gi1(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z10) {
                m60Var.getClass();
                m60Var.f30262p.a(bw0VarA);
            }
            return new gi1(bw0VarA.b());
        }
    }

    public final class b implements if2, oh, h42, c01, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, e12.b, mh.b, jh.b, o22.a, i60.a {
        public /* synthetic */ b(m60 m60Var, int i) {
            this();
        }

        public final void a(int i) {
            m60 m60Var = m60.this;
            m60Var.j();
            boolean z10 = m60Var.f30246W.f33604l;
            m60 m60Var2 = m60.this;
            int i10 = 1;
            if (z10 && i != 1) {
                i10 = 2;
            }
            m60Var2.a(i, i10, z10);
        }

        @Override // com.yandex.mobile.ads.impl.h42
        public final void onCues(List<av> list) {
            nr0 nr0Var = m60.this.f30256j;
            nr0Var.a(27, new X1(list, 1));
            nr0Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.oh
        public final void onSkipSilenceEnabledChanged(final boolean z10) {
            m60 m60Var = m60.this;
            if (m60Var.f30241R == z10) {
                return;
            }
            m60Var.f30241R = z10;
            nr0 nr0Var = m60Var.f30256j;
            nr0Var.a(23, new nr0.a() { // from class: com.yandex.mobile.ads.impl.Y1
                @Override // com.yandex.mobile.ads.impl.nr0.a
                public final void invoke(Object obj) {
                    ((bi1.b) obj).onSkipSilenceEnabledChanged(z10);
                }
            });
            nr0Var.a();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
            m60.this.a(surfaceTexture);
            m60.this.a(i, i10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            m60.this.a((Surface) null);
            m60.this.a(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
            m60.this.a(i, i10);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i10, int i11) {
            m60.this.a(i10, i11);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            m60.this.getClass();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            m60.this.getClass();
            m60.this.a(0, 0);
        }

        private b() {
        }

        @Override // com.yandex.mobile.ads.impl.oh
        public final void b(Exception exc) {
            m60.this.f30262p.b(exc);
        }

        public final void c() {
            m60.this.a(-1, 3, false);
        }

        public final void d() {
            d10 d10VarA = m60.a(m60.this.f30269w);
            if (d10VarA.equals(m60.this.f30244U)) {
                return;
            }
            m60 m60Var = m60.this;
            m60Var.f30244U = d10VarA;
            nr0 nr0Var = m60Var.f30256j;
            nr0Var.a(29, new Q1(d10VarA, 2));
            nr0Var.a();
        }

        public final void e() {
            m60 m60Var = m60.this;
            m60Var.a(1, 2, Float.valueOf(m60Var.f30240Q * m60Var.f30268v.b()));
        }

        @Override // com.yandex.mobile.ads.impl.oh
        public final void b(String str, long j4, long j10) {
            m60.this.f30262p.b(str, j4, j10);
        }

        @Override // com.yandex.mobile.ads.impl.if2
        public final void c(Exception exc) {
            m60.this.f30262p.c(exc);
        }

        @Override // com.yandex.mobile.ads.impl.oh
        public final void b(String str) {
            m60.this.f30262p.b(str);
        }

        @Override // com.yandex.mobile.ads.impl.if2
        public final void c(ky kyVar) {
            m60.this.f30262p.c(kyVar);
            m60.this.getClass();
            m60.this.getClass();
        }

        @Override // com.yandex.mobile.ads.impl.oh
        public final void b(ky kyVar) {
            m60.this.getClass();
            m60.this.f30262p.b(kyVar);
        }

        @Override // com.yandex.mobile.ads.impl.if2
        public final void b(int i, long j4) {
            m60.this.f30262p.b(i, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(bi1.b bVar) {
            bVar.a(m60.this.f30230G);
        }

        @Override // com.yandex.mobile.ads.impl.if2
        public final void b(dc0 dc0Var, oy oyVar) {
            m60.this.getClass();
            m60.this.f30262p.b(dc0Var, oyVar);
        }

        @Override // com.yandex.mobile.ads.impl.if2
        public final void d(ky kyVar) {
            m60.this.getClass();
            m60.this.f30262p.d(kyVar);
        }

        @Override // com.yandex.mobile.ads.impl.e12.b
        public final void b() {
            m60.this.a((Surface) null);
        }

        @Override // com.yandex.mobile.ads.impl.oh
        public final void a(ky kyVar) {
            m60.this.f30262p.a(kyVar);
            m60.this.getClass();
            m60.this.getClass();
        }

        @Override // com.yandex.mobile.ads.impl.oh
        public final void a(dc0 dc0Var, oy oyVar) {
            m60.this.getClass();
            m60.this.f30262p.a(dc0Var, oyVar);
        }

        @Override // com.yandex.mobile.ads.impl.oh
        public final void a(long j4) {
            m60.this.f30262p.a(j4);
        }

        @Override // com.yandex.mobile.ads.impl.oh
        public final void a(Exception exc) {
            m60.this.f30262p.a(exc);
        }

        @Override // com.yandex.mobile.ads.impl.oh
        public final void a(int i, long j4, long j10) {
            m60.this.f30262p.a(i, j4, j10);
        }

        @Override // com.yandex.mobile.ads.impl.h42
        public final void a(cv cvVar) {
            m60.this.getClass();
            nr0 nr0Var = m60.this.f30256j;
            nr0Var.a(27, new U1(cvVar, 1));
            nr0Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.i60.a
        public final void a() {
            m60.this.i();
        }

        @Override // com.yandex.mobile.ads.impl.c01
        public final void a(yz0 yz0Var) {
            m60 m60Var = m60.this;
            aw0.a aVarA = m60Var.f30245V.a();
            for (int i = 0; i < yz0Var.c(); i++) {
                yz0Var.a(i).a(aVarA);
            }
            m60Var.f30245V = aVarA.a();
            m60 m60Var2 = m60.this;
            m60Var2.j();
            v42 v42Var = m60Var2.f30246W.f33594a;
            aw0 aw0VarA = v42Var.c() ? m60Var2.f30245V : m60Var2.f30245V.a().a(v42Var.a(m60Var2.getCurrentMediaItemIndex(), m60Var2.f30018a, 0L).f34360d.f35441e).a();
            if (!aw0VarA.equals(m60.this.f30230G)) {
                m60 m60Var3 = m60.this;
                m60Var3.f30230G = aw0VarA;
                m60Var3.f30256j.a(14, new R1(this, 1));
            }
            m60.this.f30256j.a(28, new K0(yz0Var, 2));
            m60.this.f30256j.a();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.yandex.mobile.ads.impl.if2
        public final void a(Object obj, long j4) {
            m60.this.f30262p.a(obj, j4);
            m60 m60Var = m60.this;
            if (m60Var.f30232I == obj) {
                nr0 nr0Var = m60Var.f30256j;
                nr0Var.a(26, new L2(4));
                nr0Var.a();
            }
        }

        public final void a(final boolean z10, final int i) {
            nr0 nr0Var = m60.this.f30256j;
            nr0Var.a(30, new nr0.a() { // from class: com.yandex.mobile.ads.impl.Z1
                @Override // com.yandex.mobile.ads.impl.nr0.a
                public final void invoke(Object obj) {
                    ((bi1.b) obj).a(z10, i);
                }
            });
            nr0Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.if2
        public final void a(String str, long j4, long j10) {
            m60.this.f30262p.a(str, j4, j10);
        }

        @Override // com.yandex.mobile.ads.impl.if2
        public final void a(String str) {
            m60.this.f30262p.a(str);
        }

        @Override // com.yandex.mobile.ads.impl.if2
        public final void a(int i, long j4) {
            m60.this.f30262p.a(i, j4);
        }

        @Override // com.yandex.mobile.ads.impl.if2
        public final void a(pf2 pf2Var) {
            m60.this.getClass();
            nr0 nr0Var = m60.this.f30256j;
            nr0Var.a(25, new X1(pf2Var, 0));
            nr0Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.e12.b
        public final void a(Surface surface) {
            m60.this.a(surface);
        }
    }

    public static final class c implements fe2, qn, hi1.b {

        /* renamed from: b, reason: collision with root package name */
        private fe2 f30274b;

        /* renamed from: c, reason: collision with root package name */
        private qn f30275c;

        /* renamed from: d, reason: collision with root package name */
        private fe2 f30276d;

        /* renamed from: e, reason: collision with root package name */
        private qn f30277e;

        public /* synthetic */ c(int i) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.hi1.b
        public final void a(int i, Object obj) {
            if (i == 7) {
                this.f30274b = (fe2) obj;
                return;
            }
            if (i == 8) {
                this.f30275c = (qn) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            e12 e12Var = (e12) obj;
            if (e12Var == null) {
                this.f30276d = null;
                this.f30277e = null;
            } else {
                this.f30276d = e12Var.b();
                this.f30277e = e12Var.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.qn
        public final void f() {
            qn qnVar = this.f30277e;
            if (qnVar != null) {
                qnVar.f();
            }
            qn qnVar2 = this.f30275c;
            if (qnVar2 != null) {
                qnVar2.f();
            }
        }

        private c() {
        }

        @Override // com.yandex.mobile.ads.impl.qn
        public final void a(long j4, float[] fArr) {
            qn qnVar = this.f30277e;
            if (qnVar != null) {
                qnVar.a(j4, fArr);
            }
            qn qnVar2 = this.f30275c;
            if (qnVar2 != null) {
                qnVar2.a(j4, fArr);
            }
        }

        @Override // com.yandex.mobile.ads.impl.fe2
        public final void a(long j4, long j10, dc0 dc0Var, MediaFormat mediaFormat) {
            long j11;
            long j12;
            dc0 dc0Var2;
            MediaFormat mediaFormat2;
            fe2 fe2Var = this.f30276d;
            if (fe2Var != null) {
                fe2Var.a(j4, j10, dc0Var, mediaFormat);
                mediaFormat2 = mediaFormat;
                dc0Var2 = dc0Var;
                j12 = j10;
                j11 = j4;
            } else {
                j11 = j4;
                j12 = j10;
                dc0Var2 = dc0Var;
                mediaFormat2 = mediaFormat;
            }
            fe2 fe2Var2 = this.f30274b;
            if (fe2Var2 != null) {
                fe2Var2.a(j11, j12, dc0Var2, mediaFormat2);
            }
        }
    }

    public static final class d implements lw0 {

        /* renamed from: a, reason: collision with root package name */
        private final Object f30278a;

        /* renamed from: b, reason: collision with root package name */
        private v42 f30279b;

        public d(v42 v42Var, Object obj) {
            this.f30278a = obj;
            this.f30279b = v42Var;
        }

        @Override // com.yandex.mobile.ads.impl.lw0
        public final v42 b() {
            return this.f30279b;
        }

        @Override // com.yandex.mobile.ads.impl.lw0
        public final Object a() {
            return this.f30278a;
        }
    }

    static {
        p60.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public m60(i60.b bVar) {
        int i = 0;
        int i10 = 1;
        cr crVar = new cr();
        this.f30251d = crVar;
        try {
            rs0.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + s82.f32903e + "]");
            Context applicationContext = bVar.f28509a.getApplicationContext();
            xc xcVarApply = bVar.f28516h.apply(bVar.f28510b);
            this.f30262p = xcVarApply;
            ih ihVar = bVar.f28517j;
            this.f30239P = ihVar;
            this.f30235L = bVar.f28518k;
            this.f30241R = false;
            this.f30272z = bVar.f28523p;
            b bVar2 = new b(this, i);
            this.f30266t = bVar2;
            Object cVar = new c(i);
            Handler handler = new Handler(bVar.i);
            so1[] so1VarArrA = bVar.f28511c.get().a(handler, bVar2, bVar2, bVar2, bVar2);
            this.f30253f = so1VarArrA;
            zf.b(so1VarArrA.length > 0);
            s52 s52Var = bVar.f28513e.get();
            this.f30254g = s52Var;
            this.f30261o = bVar.f28512d.get();
            pi piVar = bVar.f28515g.get();
            this.f30264r = piVar;
            this.f30260n = bVar.f28519l;
            uw1 uw1Var = bVar.f28520m;
            Looper looper = bVar.i;
            this.f30263q = looper;
            m32 m32Var = bVar.f28510b;
            this.f30265s = m32Var;
            this.f30252e = this;
            this.f30256j = new nr0<>(looper, m32Var, new Q1(this, i10));
            this.f30257k = new CopyOnWriteArraySet<>();
            this.f30259m = new ArrayList();
            this.f30228E = new xx1.a();
            t52 t52Var = new t52(new uo1[so1VarArrA.length], new c70[so1VarArrA.length], o62.f31268c, null);
            this.f30249b = t52Var;
            this.f30258l = new v42.b();
            bi1.a aVarA = new bi1.a.C0400a().a(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).a(s52Var.c(), 29).a();
            this.f30250c = aVarA;
            this.f30229F = new bi1.a.C0400a().a(aVarA).a(4).a(10).a();
            this.f30255h = m32Var.a(looper, null);
            U1 u12 = new U1(this, 0);
            this.f30246W = th1.a(t52Var);
            xcVarApply.a(this, looper);
            int i11 = s82.f32899a;
            this.i = new o60(so1VarArrA, s52Var, t52Var, bVar.f28514f.get(), piVar, 0, xcVarApply, uw1Var, bVar.f28521n, bVar.f28522o, looper, m32Var, u12, i11 < 31 ? new gi1() : a.a(applicationContext, this, bVar.f28524q));
            this.f30240Q = 1.0f;
            aw0 aw0Var = aw0.f24943H;
            this.f30230G = aw0Var;
            this.f30245V = aw0Var;
            this.f30247X = -1;
            if (i11 < 21) {
                this.f30238O = f();
            } else {
                this.f30238O = s82.a(applicationContext);
            }
            int i12 = cv.f25773b;
            this.f30242S = true;
            b(xcVarApply);
            piVar.a(new Handler(looper), xcVarApply);
            a(bVar2);
            jh jhVar = new jh(bVar.f28509a, handler, bVar2);
            this.f30267u = jhVar;
            jhVar.a();
            mh mhVar = new mh(bVar.f28509a, handler, bVar2);
            this.f30268v = mhVar;
            mhVar.d();
            o22 o22Var = new o22(bVar.f28509a, handler, bVar2);
            this.f30269w = o22Var;
            o22Var.a(s82.c(ihVar.f28663d));
            vi2 vi2Var = new vi2(bVar.f28509a);
            this.f30270x = vi2Var;
            vi2Var.a();
            uj2 uj2Var = new uj2(bVar.f28509a);
            this.f30271y = uj2Var;
            uj2Var.a();
            this.f30244U = a(o22Var);
            s52Var.a(this.f30239P);
            a(1, 10, Integer.valueOf(this.f30238O));
            a(2, 10, Integer.valueOf(this.f30238O));
            a(1, 3, this.f30239P);
            a(2, 4, Integer.valueOf(this.f30235L));
            a(2, 5, (Object) 0);
            a(1, 9, Boolean.valueOf(this.f30241R));
            a(2, 7, cVar);
            a(6, 8, cVar);
            crVar.e();
        } catch (Throwable th) {
            this.f30251d.e();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(th1 th1Var, bi1.b bVar) {
        bVar.a(th1Var.f33606n);
    }

    public final void a(i60.a aVar) {
        this.f30257k.add(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final void b(bi1.b bVar) {
        bVar.getClass();
        this.f30256j.a((nr0<bi1.b>) bVar);
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final long getContentPosition() {
        j();
        j();
        if (!this.f30246W.f33595b.a()) {
            j();
            return s82.b(a(this.f30246W));
        }
        th1 th1Var = this.f30246W;
        th1Var.f33594a.a(th1Var.f33595b.f27470a, this.f30258l);
        th1 th1Var2 = this.f30246W;
        if (th1Var2.f33596c == -9223372036854775807L) {
            return s82.b(th1Var2.f33594a.a(getCurrentMediaItemIndex(), this.f30018a, 0L).f34369n);
        }
        return s82.b(this.f30246W.f33596c) + s82.b(this.f30258l.f34347f);
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final int getCurrentAdGroupIndex() {
        j();
        j();
        if (this.f30246W.f33595b.a()) {
            return this.f30246W.f33595b.f27471b;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final int getCurrentAdIndexInAdGroup() {
        j();
        j();
        if (this.f30246W.f33595b.a()) {
            return this.f30246W.f33595b.f27472c;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final int getCurrentMediaItemIndex() {
        j();
        int iC = c();
        if (iC == -1) {
            return 0;
        }
        return iC;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final int getCurrentPeriodIndex() {
        j();
        if (this.f30246W.f33594a.c()) {
            return 0;
        }
        th1 th1Var = this.f30246W;
        return th1Var.f33594a.a(th1Var.f33595b.f27470a);
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final long getCurrentPosition() {
        j();
        return s82.b(a(this.f30246W));
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final v42 getCurrentTimeline() {
        j();
        return this.f30246W.f33594a;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final o62 getCurrentTracks() {
        j();
        return this.f30246W.i.f33453d;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final long getDuration() {
        j();
        j();
        if (this.f30246W.f33595b.a()) {
            th1 th1Var = this.f30246W;
            jw0.b bVar = th1Var.f33595b;
            th1Var.f33594a.a(bVar.f27470a, this.f30258l);
            return s82.b(this.f30258l.a(bVar.f27471b, bVar.f27472c));
        }
        j();
        v42 v42Var = this.f30246W.f33594a;
        if (v42Var.c()) {
            return -9223372036854775807L;
        }
        return s82.b(v42Var.a(getCurrentMediaItemIndex(), this.f30018a, 0L).f34370o);
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final boolean getPlayWhenReady() {
        j();
        return this.f30246W.f33604l;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final int getPlaybackState() {
        j();
        return this.f30246W.f33598e;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final int getPlaybackSuppressionReason() {
        j();
        return this.f30246W.f33605m;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final long getTotalBufferedDuration() {
        j();
        return s82.b(this.f30246W.f33609q);
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final float getVolume() {
        j();
        return this.f30240Q;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final boolean isPlayingAd() {
        j();
        return this.f30246W.f33595b.a();
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final void prepare() {
        j();
        j();
        boolean z10 = this.f30246W.f33604l;
        int iA = this.f30268v.a(z10, 2);
        a(iA, (!z10 || iA == 1) ? 1 : 2, z10);
        th1 th1Var = this.f30246W;
        if (th1Var.f33598e != 1) {
            return;
        }
        th1 th1VarA = th1Var.a((h60) null);
        th1 th1VarA2 = th1VarA.a(th1VarA.f33594a.c() ? 4 : 2);
        this.f30224A++;
        this.i.i();
        a(th1VarA2, 1, 1, false, 5, -9223372036854775807L);
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final void release() {
        AudioTrack audioTrack;
        int i = 0;
        rs0.c("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + s82.f32903e + "] [" + p60.a() + "]");
        j();
        if (s82.f32899a < 21 && (audioTrack = this.f30231H) != null) {
            audioTrack.release();
            this.f30231H = null;
        }
        this.f30267u.a();
        this.f30269w.c();
        this.f30270x.a(false);
        this.f30271y.a(false);
        this.f30268v.c();
        if (!this.i.k()) {
            nr0<bi1.b> nr0Var = this.f30256j;
            nr0Var.a(10, new S1(i));
            nr0Var.a();
        }
        this.f30256j.b();
        this.f30255h.a();
        this.f30264r.a(this.f30262p);
        th1 th1VarA = this.f30246W.a(1);
        this.f30246W = th1VarA;
        th1 th1VarA2 = th1VarA.a(th1VarA.f33595b);
        this.f30246W = th1VarA2;
        th1VarA2.f33608p = th1VarA2.f33610r;
        this.f30246W.f33609q = 0L;
        this.f30262p.release();
        this.f30254g.d();
        g();
        Surface surface = this.f30233J;
        if (surface != null) {
            surface.release();
            this.f30233J = null;
        }
        int i10 = cv.f25773b;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final void setPlayWhenReady(boolean z10) {
        j();
        mh mhVar = this.f30268v;
        j();
        int iA = mhVar.a(z10, this.f30246W.f33598e);
        int i = 1;
        if (z10 && iA != 1) {
            i = 2;
        }
        a(iA, i, z10);
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final void setVideoTextureView(TextureView textureView) {
        j();
        if (textureView == null) {
            j();
            g();
            a((Surface) null);
            a(0, 0);
            return;
        }
        g();
        this.f30234K = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            rs0.d("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f30266t);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Surface) null);
            a(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            a(surface);
            this.f30233J = surface;
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final void setVolume(float f10) {
        j();
        int i = s82.f32899a;
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.f30240Q == fMax) {
            return;
        }
        this.f30240Q = fMax;
        a(1, 2, Float.valueOf(this.f30268v.b() * fMax));
        nr0<bi1.b> nr0Var = this.f30256j;
        nr0Var.a(22, new nr0.a() { // from class: com.yandex.mobile.ads.impl.T1
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ((bi1.b) obj).onVolumeChanged(fMax);
            }
        });
        nr0Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final void stop() {
        j();
        j();
        mh mhVar = this.f30268v;
        j();
        mhVar.a(this.f30246W.f33604l, 1);
        a((h60) null);
        int i = cv.f25773b;
    }

    private long a(th1 th1Var) {
        if (th1Var.f33594a.c()) {
            return s82.a(this.f30248Y);
        }
        if (th1Var.f33595b.a()) {
            return th1Var.f33610r;
        }
        v42 v42Var = th1Var.f33594a;
        jw0.b bVar = th1Var.f33595b;
        long j4 = th1Var.f33610r;
        v42Var.a(bVar.f27470a, this.f30258l);
        return j4 + this.f30258l.f34347f;
    }

    private int c() {
        if (this.f30246W.f33594a.c()) {
            return this.f30247X;
        }
        th1 th1Var = this.f30246W;
        return th1Var.f33594a.a(th1Var.f33595b.f27470a, this.f30258l).f34345d;
    }

    private int f() {
        AudioTrack audioTrack = this.f30231H;
        if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
            this.f30231H.release();
            this.f30231H = null;
        }
        if (this.f30231H == null) {
            this.f30231H = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
        }
        return this.f30231H.getAudioSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(th1 th1Var, bi1.b bVar) {
        bVar.onPlaybackSuppressionReasonChanged(th1Var.f33605m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(th1 th1Var, bi1.b bVar) {
        bVar.onIsPlayingChanged(th1Var.f33598e == 3 && th1Var.f33604l && th1Var.f33605m == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        j();
        int i = this.f30246W.f33598e;
        if (i != 1) {
            if (i == 2 || i == 3) {
                j();
                boolean z10 = this.f30246W.f33607o;
                vi2 vi2Var = this.f30270x;
                j();
                vi2Var.a(this.f30246W.f33604l && !z10);
                uj2 uj2Var = this.f30271y;
                j();
                uj2Var.a(this.f30246W.f33604l);
                return;
            }
            if (i != 4) {
                throw new IllegalStateException();
            }
        }
        this.f30270x.a(false);
        this.f30271y.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f30251d.b();
        if (Thread.currentThread() != this.f30263q.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f30263q.getThread().getName();
            int i = s82.f32899a;
            Locale locale = Locale.US;
            String strH = Oo.h("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.f30242S) {
                throw new IllegalStateException(strH);
            }
            rs0.b("ExoPlayerImpl", strH, this.f30243T ? null : new IllegalStateException());
            this.f30243T = true;
        }
    }

    public final void d() {
        j();
    }

    public final void e() {
        j();
    }

    private static long b(th1 th1Var) {
        v42.d dVar = new v42.d();
        v42.b bVar = new v42.b();
        th1Var.f33594a.a(th1Var.f33595b.f27470a, bVar);
        long j4 = th1Var.f33596c;
        if (j4 == -9223372036854775807L) {
            return th1Var.f33594a.a(bVar.f34345d, dVar, 0L).f34369n;
        }
        return bVar.f34347f + j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(bi1.b bVar) {
        bVar.a(this.f30229F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(th1 th1Var, bi1.b bVar) {
        bVar.onPlayerStateChanged(th1Var.f33604l, th1Var.f33598e);
    }

    private void g() {
        TextureView textureView = this.f30234K;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f30266t) {
                rs0.d("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f30234K.setSurfaceTextureListener(null);
            }
            this.f30234K = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(th1 th1Var, bi1.b bVar) {
        boolean z10 = th1Var.f33600g;
        bVar.getClass();
        bVar.onIsLoadingChanged(th1Var.f33600g);
    }

    private void h() {
        bi1.a aVar = this.f30229F;
        bi1 bi1Var = this.f30252e;
        bi1.a aVar2 = this.f30250c;
        int i = s82.f32899a;
        boolean zIsPlayingAd = bi1Var.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = bi1Var.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = bi1Var.hasPreviousMediaItem();
        boolean zHasNextMediaItem = bi1Var.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = bi1Var.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = bi1Var.isCurrentMediaItemDynamic();
        boolean zC = bi1Var.getCurrentTimeline().c();
        boolean z10 = !zIsPlayingAd;
        int i10 = 0;
        bi1.a aVarA = new bi1.a.C0400a().a(aVar2).a(z10, 4).a(zIsCurrentMediaItemSeekable && !zIsPlayingAd, 5).a(zHasPreviousMediaItem && !zIsPlayingAd, 6).a(!zC && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd, 7).a(zHasNextMediaItem && !zIsPlayingAd, 8).a(!zC && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd, 9).a(z10, 10).a(zIsCurrentMediaItemSeekable && !zIsPlayingAd, 11).a(zIsCurrentMediaItemSeekable && !zIsPlayingAd, 12).a();
        this.f30229F = aVarA;
        if (aVarA.equals(aVar)) {
            return;
        }
        this.f30256j.a(13, new R1(this, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(bi1.b bVar) {
        bVar.b(h60.a(new b70(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(th1 th1Var, bi1.b bVar) {
        bVar.a(th1Var.i.f33453d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(th1 th1Var, bi1.b bVar) {
        bVar.onPlaybackStateChanged(th1Var.f33598e);
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final h60 a() {
        j();
        return this.f30246W.f33599f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(o60.d dVar) {
        this.f30255h.a(new V1(0, this, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(th1 th1Var, bi1.b bVar) {
        bVar.b(th1Var.f33599f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(bi1.b bVar, vb0 vb0Var) {
        bVar.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(th1 th1Var, int i, bi1.b bVar) {
        bVar.onPlayWhenReadyChanged(th1Var.f33604l, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(o60.d dVar) {
        boolean z10;
        long j4;
        int i = this.f30224A - dVar.f31253c;
        this.f30224A = i;
        boolean z11 = true;
        if (dVar.f31254d) {
            this.f30225B = dVar.f31255e;
            this.f30226C = true;
        }
        if (dVar.f31256f) {
            this.f30227D = dVar.f31257g;
        }
        if (i == 0) {
            v42 v42Var = dVar.f31252b.f33594a;
            if (!this.f30246W.f33594a.c() && v42Var.c()) {
                this.f30247X = -1;
                this.f30248Y = 0L;
            }
            if (!v42Var.c()) {
                List<v42> listD = ((cj1) v42Var).d();
                if (listD.size() == this.f30259m.size()) {
                    for (int i10 = 0; i10 < listD.size(); i10++) {
                        ((d) this.f30259m.get(i10)).f30279b = listD.get(i10);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            long j10 = -9223372036854775807L;
            if (this.f30226C) {
                if (dVar.f31252b.f33595b.equals(this.f30246W.f33595b) && dVar.f31252b.f33597d == this.f30246W.f33610r) {
                    z11 = false;
                }
                if (z11) {
                    if (!v42Var.c() && !dVar.f31252b.f33595b.a()) {
                        th1 th1Var = dVar.f31252b;
                        jw0.b bVar = th1Var.f33595b;
                        long j11 = th1Var.f33597d;
                        v42Var.a(bVar.f27470a, this.f30258l);
                        j4 = this.f30258l.f34347f + j11;
                        z10 = z11;
                        this.f30226C = false;
                        a(dVar.f31252b, 1, this.f30227D, z10, this.f30225B, j4);
                    }
                    j10 = dVar.f31252b.f33597d;
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            j4 = j10;
            this.f30226C = false;
            a(dVar.f31252b, 1, this.f30227D, z10, this.f30225B, j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(th1 th1Var, int i, bi1.b bVar) {
        v42 v42Var = th1Var.f33594a;
        bVar.a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int i, bi1.c cVar, bi1.c cVar2, bi1.b bVar) {
        bVar.getClass();
        bVar.a(cVar, cVar2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(th1 th1Var, bi1.b bVar) {
        bVar.a(th1Var.f33599f);
    }

    private th1 a(th1 th1Var, v42 v42Var, Pair<Object, Long> pair) {
        long jA;
        if (!v42Var.c() && pair == null) {
            throw new IllegalArgumentException();
        }
        v42 v42Var2 = th1Var.f33594a;
        th1 th1VarA = th1Var.a(v42Var);
        if (v42Var.c()) {
            jw0.b bVarA = th1.a();
            long jA2 = s82.a(this.f30248Y);
            th1 th1VarA2 = th1VarA.a(bVarA, jA2, jA2, jA2, 0L, m52.f30219e, this.f30249b, xj0.h()).a(bVarA);
            th1VarA2.f33608p = th1VarA2.f33610r;
            return th1VarA2;
        }
        Object obj = th1VarA.f33595b.f27470a;
        int i = s82.f32899a;
        boolean zEquals = obj.equals(pair.first);
        jw0.b bVar = !zEquals ? new jw0.b(pair.first) : th1VarA.f33595b;
        long jLongValue = ((Long) pair.second).longValue();
        long jA3 = s82.a(getContentPosition());
        if (!v42Var2.c()) {
            jA3 -= v42Var2.a(obj, this.f30258l).f34347f;
        }
        if (!zEquals || jLongValue < jA3) {
            jw0.b bVar2 = bVar;
            if (!bVar2.a()) {
                th1 th1VarA3 = th1VarA.a(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? m52.f30219e : th1VarA.f33601h, !zEquals ? this.f30249b : th1VarA.i, !zEquals ? xj0.h() : th1VarA.f33602j).a(bVar2);
                th1VarA3.f33608p = jLongValue;
                return th1VarA3;
            }
            throw new IllegalStateException();
        }
        if (jLongValue == jA3) {
            int iA = v42Var.a(th1VarA.f33603k.f27470a);
            if (iA != -1 && v42Var.a(iA, this.f30258l, false).f34345d == v42Var.a(bVar.f27470a, this.f30258l).f34345d) {
                return th1VarA;
            }
            v42Var.a(bVar.f27470a, this.f30258l);
            if (bVar.a()) {
                jA = this.f30258l.a(bVar.f27471b, bVar.f27472c);
            } else {
                jA = this.f30258l.f34346e;
            }
            jw0.b bVar3 = bVar;
            th1 th1VarA4 = th1VarA.a(bVar3, th1VarA.f33610r, th1VarA.f33610r, th1VarA.f33597d, jA - th1VarA.f33610r, th1VarA.f33601h, th1VarA.i, th1VarA.f33602j).a(bVar3);
            th1VarA4.f33608p = jA;
            return th1VarA4;
        }
        jw0.b bVar4 = bVar;
        if (!bVar4.a()) {
            long jMax = Math.max(0L, th1VarA.f33609q - (jLongValue - jA3));
            long j4 = th1VarA.f33608p;
            if (th1VarA.f33603k.equals(th1VarA.f33595b)) {
                j4 = jLongValue + jMax;
            }
            th1 th1VarA5 = th1VarA.a(bVar4, jLongValue, jLongValue, jLongValue, jMax, th1VarA.f33601h, th1VarA.i, th1VarA.f33602j);
            th1VarA5.f33608p = j4;
            return th1VarA5;
        }
        throw new IllegalStateException();
    }

    private Pair<Object, Long> a(v42 v42Var, int i, long j4) {
        if (v42Var.c()) {
            this.f30247X = i;
            if (j4 == -9223372036854775807L) {
                j4 = 0;
            }
            this.f30248Y = j4;
            return null;
        }
        if (i == -1 || i >= v42Var.b()) {
            i = v42Var.a(false);
            j4 = s82.b(v42Var.a(i, this.f30018a, 0L).f34369n);
        }
        return v42Var.a(this.f30018a, this.f30258l, i, s82.a(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final int i10) {
        if (i == this.f30236M && i10 == this.f30237N) {
            return;
        }
        this.f30236M = i;
        this.f30237N = i10;
        nr0<bi1.b> nr0Var = this.f30256j;
        nr0Var.a(24, new nr0.a() { // from class: com.yandex.mobile.ads.impl.L1
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ((bi1.b) obj).onSurfaceSizeChanged(i, i10);
            }
        });
        nr0Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final void a(bi1.b bVar) {
        bVar.getClass();
        this.f30256j.b(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i10, Object obj) {
        for (so1 so1Var : this.f30253f) {
            if (so1Var.m() == i) {
                int iC = c();
                o60 o60Var = this.i;
                v42 v42Var = this.f30246W.f33594a;
                if (iC == -1) {
                    iC = 0;
                }
                new hi1(o60Var, so1Var, v42Var, iC, this.f30265s, o60Var.d()).a(i10).a(obj).e();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.i60
    public final void a(am1 am1Var) {
        j();
        List listSingletonList = Collections.singletonList(am1Var);
        j();
        j();
        c();
        j();
        a(this.f30246W);
        int i = s82.f32899a;
        this.f30224A++;
        if (!this.f30259m.isEmpty()) {
            int size = this.f30259m.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.f30259m.remove(i10);
            }
            this.f30228E = this.f30228E.c(size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listSingletonList.size(); i11++) {
            mw0.c cVar = new mw0.c((jw0) listSingletonList.get(i11), this.f30260n);
            arrayList.add(cVar);
            this.f30259m.add(i11, new d(cVar.f30556a.f(), cVar.f30557b));
        }
        this.f30228E = this.f30228E.b(arrayList.size());
        cj1 cj1Var = new cj1(this.f30259m, this.f30228E);
        if (!cj1Var.c() && -1 >= cj1Var.b()) {
            throw new oi0();
        }
        int iA = cj1Var.a(false);
        th1 th1VarA = a(this.f30246W, cj1Var, a(cj1Var, iA, -9223372036854775807L));
        int i12 = th1VarA.f33598e;
        if (iA != -1 && i12 != 1) {
            i12 = (cj1Var.c() || iA >= cj1Var.b()) ? 4 : 2;
        }
        th1 th1VarA2 = th1VarA.a(i12);
        this.i.a(iA, s82.a(-9223372036854775807L), this.f30228E, arrayList);
        a(th1VarA2, 0, 1, (this.f30246W.f33595b.f27470a.equals(th1VarA2.f33595b.f27470a) || this.f30246W.f33594a.c()) ? false : true, 4, a(th1VarA2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.f30233J = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (so1 so1Var : this.f30253f) {
            if (so1Var.m() == 2) {
                int iC = c();
                o60 o60Var = this.i;
                v42 v42Var = this.f30246W.f33594a;
                if (iC == -1) {
                    iC = 0;
                }
                arrayList.add(new hi1(o60Var, so1Var, v42Var, iC, this.f30265s, o60Var.d()).a(1).a(surface).e());
            }
        }
        Object obj = this.f30232I;
        if (obj != null && obj != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((hi1) it.next()).a(this.f30272z);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj2 = this.f30232I;
            Surface surface2 = this.f30233J;
            if (obj2 == surface2) {
                surface2.release();
                this.f30233J = null;
            }
        }
        this.f30232I = surface;
        if (z10) {
            a(h60.a(new b70(3), 1003));
        }
    }

    private void a(h60 h60Var) {
        th1 th1Var = this.f30246W;
        th1 th1VarA = th1Var.a(th1Var.f33595b);
        th1VarA.f33608p = th1VarA.f33610r;
        th1VarA.f33609q = 0L;
        th1 th1VarA2 = th1VarA.a(1);
        if (h60Var != null) {
            th1VarA2 = th1VarA2.a(h60Var);
        }
        th1 th1Var2 = th1VarA2;
        this.f30224A++;
        this.i.p();
        a(th1Var2, 0, 1, th1Var2.f33594a.c() && !this.f30246W.f33594a.c(), 4, a(th1Var2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i10, boolean z10) {
        int i11 = 0;
        boolean z11 = z10 && i != -1;
        if (z11 && i != 1) {
            i11 = 1;
        }
        th1 th1Var = this.f30246W;
        if (th1Var.f33604l == z11 && th1Var.f33605m == i11) {
            return;
        }
        this.f30224A++;
        int i12 = i11;
        boolean z12 = z11;
        th1 th1Var2 = new th1(th1Var.f33594a, th1Var.f33595b, th1Var.f33596c, th1Var.f33597d, th1Var.f33598e, th1Var.f33599f, th1Var.f33600g, th1Var.f33601h, th1Var.i, th1Var.f33602j, th1Var.f33603k, z12, i12, th1Var.f33606n, th1Var.f33608p, th1Var.f33609q, th1Var.f33610r, th1Var.f33607o);
        this.i.a(z12, i12);
        a(th1Var2, 0, i10, false, 5, -9223372036854775807L);
    }

    private void a(final th1 th1Var, int i, final int i10, boolean z10, final int i11, long j4) {
        int i12;
        Pair pair;
        int i13;
        final xv0 xv0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Object obj;
        int i14;
        xv0 xv0Var2;
        Object obj2;
        int i15;
        long j10;
        long j11;
        long jB;
        long jB2;
        Object obj3;
        xv0 xv0Var3;
        Object obj4;
        int iA;
        th1 th1Var2 = this.f30246W;
        this.f30246W = th1Var;
        boolean zEquals = th1Var2.f33594a.equals(th1Var.f33594a);
        v42 v42Var = th1Var2.f33594a;
        v42 v42Var2 = th1Var.f33594a;
        if (v42Var2.c() && v42Var.c()) {
            pair = new Pair(Boolean.FALSE, -1);
            i12 = 3;
        } else {
            i12 = 3;
            if (v42Var2.c() != v42Var.c()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (!v42Var.a(v42Var.a(th1Var2.f33595b.f27470a, this.f30258l).f34345d, this.f30018a, 0L).f34358b.equals(v42Var2.a(v42Var2.a(th1Var.f33595b.f27470a, this.f30258l).f34345d, this.f30018a, 0L).f34358b)) {
                if (z10 && i11 == 0) {
                    i13 = 1;
                } else if (z10 && i11 == 1) {
                    i13 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i13 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
            } else if (z10 && i11 == 0 && th1Var2.f33595b.f27473d < th1Var.f33595b.f27473d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        aw0 aw0VarA = this.f30230G;
        if (zBooleanValue) {
            xv0Var = !th1Var.f33594a.c() ? th1Var.f33594a.a(th1Var.f33594a.a(th1Var.f33595b.f27470a, this.f30258l).f34345d, this.f30018a, 0L).f34360d : null;
            this.f30245V = aw0.f24943H;
        } else {
            xv0Var = null;
        }
        if (zBooleanValue || !th1Var2.f33602j.equals(th1Var.f33602j)) {
            aw0.a aVarA = this.f30245V.a();
            List<yz0> list = th1Var.f33602j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                yz0 yz0Var = list.get(i16);
                for (int i17 = 0; i17 < yz0Var.c(); i17++) {
                    yz0Var.a(i17).a(aVarA);
                }
            }
            this.f30245V = aVarA.a();
            j();
            v42 v42Var3 = this.f30246W.f33594a;
            if (v42Var3.c()) {
                aw0VarA = this.f30245V;
            } else {
                aw0VarA = this.f30245V.a().a(v42Var3.a(getCurrentMediaItemIndex(), this.f30018a, 0L).f34360d.f35441e).a();
            }
        }
        boolean zEquals2 = aw0VarA.equals(this.f30230G);
        this.f30230G = aw0VarA;
        boolean z15 = th1Var2.f33604l != th1Var.f33604l;
        boolean z16 = th1Var2.f33598e != th1Var.f33598e;
        if (z16 || z15) {
            i();
        }
        boolean z17 = th1Var2.f33600g != th1Var.f33600g;
        if (!th1Var2.f33594a.equals(th1Var.f33594a)) {
            this.f30256j.a(0, new Y4(i, 2, th1Var));
        }
        if (z10) {
            v42.b bVar = new v42.b();
            if (th1Var2.f33594a.c()) {
                z11 = zBooleanValue;
                z12 = zEquals2;
                z13 = z16;
                obj = null;
                i14 = -1;
                xv0Var2 = null;
                obj2 = null;
                i15 = -1;
            } else {
                Object obj5 = th1Var2.f33595b.f27470a;
                th1Var2.f33594a.a(obj5, bVar);
                int i18 = bVar.f34345d;
                int iA2 = th1Var2.f33594a.a(obj5);
                z11 = zBooleanValue;
                z12 = zEquals2;
                z13 = z16;
                obj = th1Var2.f33594a.a(i18, this.f30018a, 0L).f34358b;
                xv0Var2 = this.f30018a.f34360d;
                obj2 = obj5;
                i14 = i18;
                i15 = iA2;
            }
            if (i11 == 0) {
                if (th1Var2.f33595b.a()) {
                    jw0.b bVar2 = th1Var2.f33595b;
                    jB = bVar.a(bVar2.f27471b, bVar2.f27472c);
                    jB2 = b(th1Var2);
                } else if (th1Var2.f33595b.f27474e != -1) {
                    jB = b(this.f30246W);
                    jB2 = jB;
                } else {
                    j10 = bVar.f34347f;
                    j11 = bVar.f34346e;
                    jB = j10 + j11;
                    jB2 = jB;
                }
            } else if (th1Var2.f33595b.a()) {
                jB = th1Var2.f33610r;
                jB2 = b(th1Var2);
            } else {
                j10 = bVar.f34347f;
                j11 = th1Var2.f33610r;
                jB = j10 + j11;
                jB2 = jB;
            }
            long jB3 = s82.b(jB);
            long jB4 = s82.b(jB2);
            jw0.b bVar3 = th1Var2.f33595b;
            final bi1.c cVar = new bi1.c(obj, i14, xv0Var2, obj2, i15, jB3, jB4, bVar3.f27471b, bVar3.f27472c);
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            if (this.f30246W.f33594a.c()) {
                obj3 = null;
                xv0Var3 = null;
                obj4 = null;
                iA = -1;
            } else {
                th1 th1Var3 = this.f30246W;
                Object obj6 = th1Var3.f33595b.f27470a;
                th1Var3.f33594a.a(obj6, this.f30258l);
                iA = this.f30246W.f33594a.a(obj6);
                obj4 = obj6;
                obj3 = this.f30246W.f33594a.a(currentMediaItemIndex, this.f30018a, 0L).f34358b;
                xv0Var3 = this.f30018a.f34360d;
            }
            long jB5 = s82.b(j4);
            long jB6 = this.f30246W.f33595b.a() ? s82.b(b(this.f30246W)) : jB5;
            jw0.b bVar4 = this.f30246W.f33595b;
            final bi1.c cVar2 = new bi1.c(obj3, currentMediaItemIndex, xv0Var3, obj4, iA, jB5, jB6, bVar4.f27471b, bVar4.f27472c);
            this.f30256j.a(11, new nr0.a() { // from class: com.yandex.mobile.ads.impl.W1
                @Override // com.yandex.mobile.ads.impl.nr0.a
                public final void invoke(Object obj7) {
                    bi1.c cVar3 = cVar;
                    m60.a(i11, cVar3, cVar2, (bi1.b) obj7);
                }
            });
        } else {
            z11 = zBooleanValue;
            z12 = zEquals2;
            z13 = z16;
        }
        if (z11) {
            nr0<bi1.b> nr0Var = this.f30256j;
            final int i19 = 0;
            nr0.a<bi1.b> aVar = new nr0.a() { // from class: com.yandex.mobile.ads.impl.M1
                @Override // com.yandex.mobile.ads.impl.nr0.a
                public final void invoke(Object obj7) {
                    bi1.b bVar5 = (bi1.b) obj7;
                    switch (i19) {
                        case 0:
                            bVar5.a((xv0) xv0Var, iIntValue);
                            break;
                        default:
                            m60.b((th1) xv0Var, iIntValue, bVar5);
                            break;
                    }
                }
            };
            z14 = true;
            nr0Var.a(1, aVar);
        } else {
            z14 = true;
        }
        if (th1Var2.f33599f != th1Var.f33599f) {
            final int i20 = 0;
            this.f30256j.a(10, new nr0.a() { // from class: com.yandex.mobile.ads.impl.N1
                @Override // com.yandex.mobile.ads.impl.nr0.a
                public final void invoke(Object obj7) {
                    switch (i20) {
                        case 0:
                            m60.a(th1Var, (bi1.b) obj7);
                            break;
                        case 1:
                            m60.e(th1Var, (bi1.b) obj7);
                            break;
                        default:
                            m60.g(th1Var, (bi1.b) obj7);
                            break;
                    }
                }
            });
            if (th1Var.f33599f != null) {
                final int i21 = 0;
                this.f30256j.a(10, new nr0.a() { // from class: com.yandex.mobile.ads.impl.O1
                    @Override // com.yandex.mobile.ads.impl.nr0.a
                    public final void invoke(Object obj7) {
                        switch (i21) {
                            case 0:
                                m60.b(th1Var, (bi1.b) obj7);
                                break;
                            case 1:
                                m60.f(th1Var, (bi1.b) obj7);
                                break;
                            default:
                                m60.h(th1Var, (bi1.b) obj7);
                                break;
                        }
                    }
                });
            }
        }
        t52 t52Var = th1Var2.i;
        t52 t52Var2 = th1Var.i;
        if (t52Var != t52Var2) {
            this.f30254g.a(t52Var2.f33454e);
            final int i22 = 0;
            this.f30256j.a(2, new nr0.a() { // from class: com.yandex.mobile.ads.impl.P1
                @Override // com.yandex.mobile.ads.impl.nr0.a
                public final void invoke(Object obj7) {
                    switch (i22) {
                        case 0:
                            m60.c(th1Var, (bi1.b) obj7);
                            break;
                        default:
                            m60.i(th1Var, (bi1.b) obj7);
                            break;
                    }
                }
            });
        }
        if (!z12) {
            this.f30256j.a(14, new K0(this.f30230G, 1));
        }
        if (z17) {
            this.f30256j.a(i12, new Q1(th1Var, 0));
        }
        if (z13 || z15) {
            final int i23 = 1;
            this.f30256j.a(-1, new nr0.a() { // from class: com.yandex.mobile.ads.impl.N1
                @Override // com.yandex.mobile.ads.impl.nr0.a
                public final void invoke(Object obj7) {
                    switch (i23) {
                        case 0:
                            m60.a(th1Var, (bi1.b) obj7);
                            break;
                        case 1:
                            m60.e(th1Var, (bi1.b) obj7);
                            break;
                        default:
                            m60.g(th1Var, (bi1.b) obj7);
                            break;
                    }
                }
            });
        }
        if (z13) {
            final int i24 = 1;
            this.f30256j.a(4, new nr0.a() { // from class: com.yandex.mobile.ads.impl.O1
                @Override // com.yandex.mobile.ads.impl.nr0.a
                public final void invoke(Object obj7) {
                    switch (i24) {
                        case 0:
                            m60.b(th1Var, (bi1.b) obj7);
                            break;
                        case 1:
                            m60.f(th1Var, (bi1.b) obj7);
                            break;
                        default:
                            m60.h(th1Var, (bi1.b) obj7);
                            break;
                    }
                }
            });
        }
        if (z15) {
            final int i25 = 1;
            this.f30256j.a(5, new nr0.a() { // from class: com.yandex.mobile.ads.impl.M1
                @Override // com.yandex.mobile.ads.impl.nr0.a
                public final void invoke(Object obj7) {
                    bi1.b bVar5 = (bi1.b) obj7;
                    switch (i25) {
                        case 0:
                            bVar5.a((xv0) th1Var, i10);
                            break;
                        default:
                            m60.b((th1) th1Var, i10, bVar5);
                            break;
                    }
                }
            });
        }
        if (th1Var2.f33605m != th1Var.f33605m) {
            final int i26 = 2;
            this.f30256j.a(6, new nr0.a() { // from class: com.yandex.mobile.ads.impl.N1
                @Override // com.yandex.mobile.ads.impl.nr0.a
                public final void invoke(Object obj7) {
                    switch (i26) {
                        case 0:
                            m60.a(th1Var, (bi1.b) obj7);
                            break;
                        case 1:
                            m60.e(th1Var, (bi1.b) obj7);
                            break;
                        default:
                            m60.g(th1Var, (bi1.b) obj7);
                            break;
                    }
                }
            });
        }
        if (((th1Var2.f33598e == 3 && th1Var2.f33604l && th1Var2.f33605m == 0) ? z14 : false) != ((th1Var.f33598e == 3 && th1Var.f33604l && th1Var.f33605m == 0) ? z14 : false)) {
            final int i27 = 2;
            this.f30256j.a(7, new nr0.a() { // from class: com.yandex.mobile.ads.impl.O1
                @Override // com.yandex.mobile.ads.impl.nr0.a
                public final void invoke(Object obj7) {
                    switch (i27) {
                        case 0:
                            m60.b(th1Var, (bi1.b) obj7);
                            break;
                        case 1:
                            m60.f(th1Var, (bi1.b) obj7);
                            break;
                        default:
                            m60.h(th1Var, (bi1.b) obj7);
                            break;
                    }
                }
            });
        }
        if (!th1Var2.f33606n.equals(th1Var.f33606n)) {
            final int i28 = 1;
            this.f30256j.a(12, new nr0.a() { // from class: com.yandex.mobile.ads.impl.P1
                @Override // com.yandex.mobile.ads.impl.nr0.a
                public final void invoke(Object obj7) {
                    switch (i28) {
                        case 0:
                            m60.c(th1Var, (bi1.b) obj7);
                            break;
                        default:
                            m60.i(th1Var, (bi1.b) obj7);
                            break;
                    }
                }
            });
        }
        h();
        this.f30256j.a();
        if (th1Var2.f33607o != th1Var.f33607o) {
            Iterator<i60.a> it = this.f30257k.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d10 a(o22 o22Var) {
        return new d10(0, o22Var.b(), o22Var.a());
    }
}
