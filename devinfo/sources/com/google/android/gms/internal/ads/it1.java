package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class it1 extends hp1 {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f12446e0 = 0;
    public final long A;
    public final be1 B;
    public final com.google.android.gms.internal.consent_sdk.d C;
    public final ht1 D;
    public final HashMap E;
    public int F;
    public int G;
    public boolean H;
    public final mu1 I;
    public final nu1 J;
    public final xs1 K;
    public gd L;
    public j7 M;
    public Object N;
    public Surface O;
    public final int P;
    public yk0 Q;
    public final p50 R;
    public float S;
    public boolean T;
    public final boolean U;
    public boolean V;
    public final int W;
    public boolean X;
    public ns1 Y;
    public j7 Z;

    /* renamed from: a0, reason: collision with root package name */
    public eu1 f12447a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f12448b0;

    /* renamed from: c, reason: collision with root package name */
    public final g f12449c;

    /* renamed from: c0, reason: collision with root package name */
    public long f12450c0;

    /* renamed from: d, reason: collision with root package name */
    public final gd f12451d;

    /* renamed from: d0, reason: collision with root package name */
    public kz1 f12452d0;

    /* renamed from: e, reason: collision with root package name */
    public final za0 f12453e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f12454f;
    public final ou1 g;

    /* renamed from: h, reason: collision with root package name */
    public final pr1[] f12455h;

    /* renamed from: i, reason: collision with root package name */
    public final pr1[] f12456i;
    public final b j;

    /* renamed from: k, reason: collision with root package name */
    public final no0 f12457k;

    /* renamed from: l, reason: collision with root package name */
    public final ne0 f12458l;

    /* renamed from: m, reason: collision with root package name */
    public final nt1 f12459m;

    /* renamed from: n, reason: collision with root package name */
    public final yf0 f12460n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArraySet f12461o;

    /* renamed from: p, reason: collision with root package name */
    public final tg f12462p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f12463q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f12464r;

    /* renamed from: s, reason: collision with root package name */
    public final wu1 f12465s;

    /* renamed from: t, reason: collision with root package name */
    public final Looper f12466t;

    /* renamed from: u, reason: collision with root package name */
    public final l f12467u;

    /* renamed from: v, reason: collision with root package name */
    public final w5 f12468v;

    /* renamed from: w, reason: collision with root package name */
    public final bt1 f12469w;

    /* renamed from: x, reason: collision with root package name */
    public final x f12470x;

    /* renamed from: y, reason: collision with root package name */
    public final ur0 f12471y;

    /* renamed from: z, reason: collision with root package name */
    public final s5 f12472z;

    static {
        y5.a("media3.exoplayer");
    }

    public it1(ws1 ws1Var, ou1 ou1Var) {
        super(5);
        this.f12453e = new za0();
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = bq0.f9768a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(str).length() + 1);
            sb2.append("Init ");
            sb2.append(hexString);
            sb2.append(" [AndroidXMedia3/1.9.0-beta01] [");
            sb2.append(str);
            sb2.append("]");
            ls.n("ExoPlayerImpl", sb2.toString());
            Context context = ws1Var.f18167a;
            w5 w5Var = ws1Var.f18168b;
            Looper looper = ws1Var.f18173h;
            this.f12454f = context.getApplicationContext();
            this.f12465s = new wu1(w5Var);
            this.W = ws1Var.f18174i;
            this.R = ws1Var.j;
            this.P = ws1Var.f18175k;
            this.T = false;
            this.A = ws1Var.f18180p;
            bt1 bt1Var = new bt1(this);
            this.f12469w = bt1Var;
            this.f12470x = new x(1);
            this.f12455h = ((fk0) ws1Var.f18169c.f13160b).k(new Handler(looper), bt1Var, bt1Var);
            this.f12456i = new pr1[2];
            int i4 = 0;
            while (true) {
                pr1[] pr1VarArr = this.f12456i;
                int length = pr1VarArr.length;
                if (i4 >= 2) {
                    break;
                }
                pr1 pr1Var = this.f12455h[i4];
                pr1VarArr[i4] = null;
                i4++;
            }
            this.j = (b) ws1Var.f18171e.b();
            ws1Var.f18170d.b();
            this.f12467u = (l) ws1Var.g.b();
            this.f12464r = ws1Var.f18176l;
            this.J = ws1Var.f18177m;
            this.I = ws1Var.f18178n;
            this.f12466t = looper;
            this.f12468v = w5Var;
            this.g = ou1Var;
            this.f12460n = new yf0(new CopyOnWriteArraySet(), looper, looper.getThread(), w5Var, new cl1(29, this), true);
            this.f12461o = new CopyOnWriteArraySet();
            this.f12463q = new ArrayList();
            this.f12452d0 = new kz1();
            this.K = xs1.f18460a;
            int length2 = this.f12455h.length;
            this.f12449c = new g(new ku1[2], new d[2], go.f11565b, null);
            this.f12462p = new tg();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i10 = 0; i10 < 20; i10++) {
                int i11 = iArr[i10];
                mq0.c0(!false);
                sparseBooleanArray.append(i11, true);
            }
            this.j.getClass();
            mq0.c0(!false);
            sparseBooleanArray.append(29, true);
            mq0.c0(!false);
            yv1 yv1Var = new yv1(sparseBooleanArray);
            this.f12451d = new gd(yv1Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < yv1Var.f18891a.size(); i12++) {
                int iA = yv1Var.a(i12);
                mq0.c0(!false);
                sparseBooleanArray2.append(iA, true);
            }
            mq0.c0(!false);
            sparseBooleanArray2.append(4, true);
            mq0.c0(!false);
            sparseBooleanArray2.append(10, true);
            mq0.c0(!false);
            this.L = new gd(new yv1(sparseBooleanArray2));
            this.f12457k = this.f12468v.A(this.f12466t, null);
            ne0 ne0Var = new ne0(27, this);
            this.f12458l = ne0Var;
            this.f12447a0 = eu1.a(this.f12449c);
            this.f12465s.r(this.g, this.f12466t);
            cv1 cv1Var = new cv1(ws1Var.f18187w);
            nt1 nt1Var = new nt1(this.f12454f, this.f12455h, this.f12456i, this.j, this.f12449c, (pt1) ws1Var.f18172f.b(), this.f12467u, this.f12465s, this.J, ws1Var.f18188x, ws1Var.f18179o, this.f12466t, this.f12468v, ne0Var, cv1Var, this.K);
            Looper looper2 = nt1Var.j;
            no0 no0Var = nt1Var.f14419h;
            this.f12459m = nt1Var;
            this.S = 1.0f;
            j7 j7Var = j7.B;
            this.M = j7Var;
            this.Z = j7Var;
            this.f12448b0 = -1;
            i41 i41Var = i50.f12141a;
            this.U = true;
            wu1 wu1Var = this.f12465s;
            wu1Var.getClass();
            this.f12460n.a(wu1Var);
            l lVar = this.f12467u;
            Handler handler = new Handler(this.f12466t);
            wu1 wu1Var2 = this.f12465s;
            n nVar = (n) lVar;
            nVar.getClass();
            wu1Var2.getClass();
            ix0 ix0Var = nVar.f14087c;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ix0Var.f12502b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                if (kVar.f12907b == wu1Var2) {
                    kVar.f12908c = true;
                    copyOnWriteArrayList.remove(kVar);
                }
            }
            ((CopyOnWriteArrayList) ix0Var.f12502b).add(new k(handler, wu1Var2));
            this.f12461o.add(this.f12469w);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 31) {
                this.f12468v.A(looper2, null).e(new ys1(this.f12454f, ws1Var.f18185u, this, cv1Var));
            }
            Looper looper3 = this.f12466t;
            w5 w5Var2 = this.f12468v;
            kh0 kh0Var = new kh0(19, this);
            be1 be1Var = new be1();
            be1Var.f9658b = w5Var2.A(looper2, null);
            be1Var.f9659c = w5Var2.A(looper3, null);
            be1Var.f9661e = 0;
            be1Var.f9662f = 0;
            be1Var.f9660d = kh0Var;
            this.B = be1Var;
            du0 du0Var = new du0(13, this);
            no0 no0Var2 = (no0) be1Var.f9658b;
            if (no0Var2.f14385a.getLooper().getThread().isAlive()) {
                no0Var2.e(du0Var);
            }
            w5 w5Var3 = this.f12468v;
            hl hlVar = new hl(14);
            context.getApplicationContext();
            w5Var3.A(looper2, null);
            new kf(hlVar, w5Var3.A(looper, null));
            boolean z3 = (ws1Var.f18182r == Integer.MAX_VALUE || ws1Var.f18183s == Integer.MAX_VALUE) ? false : true;
            ur0 ur0Var = new ur0(context, looper2, this.f12468v);
            this.f12471y = ur0Var;
            if (ur0Var.f17302b != z3) {
                ur0Var.f17302b = z3;
                ur0Var.h(z3, ur0Var.f17303c);
            }
            w5 w5Var4 = this.f12468v;
            s5 s5Var = new s5(4);
            context.getApplicationContext();
            w5Var4.A(looper2, null);
            w5Var4.A(Looper.getMainLooper(), null);
            this.f12472z = s5Var;
            int i14 = cu1.f10222a;
            vr vrVar = vr.f17692d;
            this.Q = yk0.f18785c;
            this.D = i13 >= 34 ? new ht1(this, context) : null;
            this.E = new HashMap();
            this.Y = ns1.f14404b;
            this.C = new com.google.android.gms.internal.consent_sdk.d(this, this.f12469w, this.f12468v, ws1Var.f18181q, ws1Var.f18182r, ws1Var.f18183s, ws1Var.f18184t);
            no0Var.b(38, this.I).a();
            p50 p50Var = this.R;
            Handler handler2 = no0Var.f14385a;
            io0 io0VarG = no0.g();
            io0VarG.f12403a = handler2.obtainMessage(31, 0, 0, p50Var);
            io0VarG.a();
            X1(1, 3, this.R);
            X1(2, 4, Integer.valueOf(this.P));
            X1(2, 5, 0);
            X1(1, 9, Boolean.valueOf(this.T));
            X1(6, 8, this.f12470x);
            X1(-1, 16, Integer.valueOf(this.W));
            this.f12453e.a();
        } catch (Throwable th2) {
            this.f12453e.a();
            throw th2;
        }
    }

    public static ns1 K1(ns1 ns1Var, List list) {
        HashMap map = new HashMap(ns1Var.f14405a);
        HashSet hashSet = new HashSet(list);
        for (String str : ns1Var.f14405a.keySet()) {
            if (!hashSet.contains(str)) {
                map.remove(str);
            }
        }
        return new ns1(map);
    }

    public static long R1(eu1 eu1Var) {
        fh fhVar = new fh();
        tg tgVar = new tg();
        uh uhVar = eu1Var.f10872a;
        uhVar.o(eu1Var.f10873b.f12875a, tgVar);
        long j = eu1Var.f10874c;
        if (j != -9223372036854775807L) {
            return j;
        }
        uhVar.b(tgVar.f16811c, fhVar, 0L).getClass();
        return 0L;
    }

    public static eu1 T1(eu1 eu1Var, int i4) {
        eu1 eu1VarD = eu1Var.d(i4);
        return (i4 == 1 || i4 == 4) ? eu1VarD.f(false) : eu1VarD;
    }

    @Override // com.google.android.gms.internal.ads.hp1, com.google.android.gms.internal.ads.b70
    public final void B1() {
        o0();
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final long F() {
        o0();
        return N1(this.f12447a0);
    }

    public final void H1() {
        o0();
        L1(null);
        u51 u51Var = u51.f17096e;
        long j = this.f12447a0.f10887r;
        new i50(u51Var);
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final void L(int i4, long j) {
        o0();
        if (i4 == -1) {
            return;
        }
        mq0.m(i4 >= 0);
        uh uhVar = this.f12447a0.f10872a;
        if (uhVar.g() || i4 < uhVar.a()) {
            wu1 wu1Var = this.f12465s;
            if (!wu1Var.f18204i) {
                qu1 qu1VarM = wu1Var.m();
                wu1Var.f18204i = true;
                wu1Var.l(qu1VarM, -1, new su1(8));
            }
            this.F++;
            if (s1()) {
                ls.t("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                x8 x8Var = new x8(this.f12447a0);
                x8Var.b(1);
                it1 it1Var = (it1) this.f12458l.f14280b;
                it1Var.f12457k.e(new uh0(18, it1Var, x8Var));
                return;
            }
            eu1 eu1VarD = this.f12447a0;
            int i10 = eu1VarD.f10876e;
            if (i10 == 3 || (i10 == 4 && !uhVar.g())) {
                eu1VarD = this.f12447a0.d(2);
            }
            int iO1 = o1();
            eu1 eu1VarS1 = S1(eu1VarD, uhVar, U1(uhVar, i4, j));
            long jS = bq0.s(j);
            nt1 nt1Var = this.f12459m;
            nt1Var.getClass();
            nt1Var.f14419h.b(3, new mt1(uhVar, i4, jS)).a();
            Q1(eu1VarS1, 0, true, 1, P1(eu1VarS1), iO1);
        }
    }

    public final void L1(us1 us1Var) {
        eu1 eu1Var = this.f12447a0;
        eu1 eu1VarG = eu1Var.g(eu1Var.f10873b);
        eu1VarG.f10885p = eu1VarG.f10887r;
        eu1VarG.f10886q = 0L;
        eu1 eu1VarT1 = T1(eu1VarG, 1);
        if (us1Var != null) {
            eu1VarT1 = eu1VarT1.e(us1Var);
        }
        eu1 eu1Var2 = eu1VarT1;
        this.F++;
        Handler handler = this.f12459m.f14419h.f14385a;
        io0 io0VarG = no0.g();
        io0VarG.f12403a = handler.obtainMessage(6);
        io0VarG.a();
        Q1(eu1Var2, 0, false, 5, -9223372036854775807L, -1);
    }

    public final int M1(eu1 eu1Var) {
        uh uhVar = eu1Var.f10872a;
        return uhVar.g() ? this.f12448b0 : uhVar.o(eu1Var.f10873b.f12875a, this.f12462p).f16811c;
    }

    public final long N1(eu1 eu1Var) {
        long jR = bq0.r(0L);
        jy1 jy1Var = eu1Var.f10873b;
        if (!jy1Var.b()) {
            return bq0.r(P1(eu1Var));
        }
        uh uhVar = eu1Var.f10872a;
        uhVar.o(jy1Var.f12875a, this.f12462p);
        long j = eu1Var.f10874c;
        if (j != -9223372036854775807L) {
            return bq0.r(j) + jR;
        }
        uhVar.b(M1(eu1Var), (fh) this.f11937a, 0L).getClass();
        return jR;
    }

    public final long P1(eu1 eu1Var) {
        uh uhVar = eu1Var.f10872a;
        if (uhVar.g()) {
            return bq0.s(this.f12450c0);
        }
        long j = eu1Var.f10887r;
        jy1 jy1Var = eu1Var.f10873b;
        if (jy1Var.b()) {
            return j;
        }
        uhVar.o(jy1Var.f12875a, this.f12462p);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0572 A[LOOP:0: B:273:0x056a->B:275:0x0572, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0583 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x058f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x059c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q1(final com.google.android.gms.internal.ads.eu1 r33, int r34, boolean r35, int r36, long r37, int r39) {
        /*
            Method dump skipped, instructions count: 1561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.it1.Q1(com.google.android.gms.internal.ads.eu1, int, boolean, int, long, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.eu1 S1(com.google.android.gms.internal.ads.eu1 r23, com.google.android.gms.internal.ads.uh r24, android.util.Pair r25) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.it1.S1(com.google.android.gms.internal.ads.eu1, com.google.android.gms.internal.ads.uh, android.util.Pair):com.google.android.gms.internal.ads.eu1");
    }

    public final Pair U1(uh uhVar, int i4, long j) {
        if (uhVar.g()) {
            this.f12448b0 = i4;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f12450c0 = j;
            return null;
        }
        if (i4 == -1 || i4 >= uhVar.a()) {
            i4 = uhVar.k(false);
            uhVar.b(i4, (fh) this.f11937a, 0L).getClass();
            j = bq0.r(0L);
        }
        return uhVar.m((fh) this.f11937a, this.f12462p, i4, bq0.s(j));
    }

    public final void V1(Surface surface) {
        Object obj = this.N;
        boolean z3 = false;
        boolean zE = true;
        if (obj != null && obj != surface) {
            z3 = true;
        }
        long j = z3 ? this.A : -9223372036854775807L;
        nt1 nt1Var = this.f12459m;
        if (!nt1Var.H && nt1Var.j.getThread().isAlive()) {
            za0 za0Var = new za0();
            nt1Var.f14419h.b(30, new Pair(surface, za0Var)).a();
            if (j != -9223372036854775807L) {
                zE = za0Var.e(j);
            }
        }
        if (z3) {
            Object obj2 = this.N;
            Surface surface2 = this.O;
            if (obj2 == surface2) {
                surface2.release();
                this.O = null;
            }
        }
        this.N = surface;
        if (zE) {
            return;
        }
        L1(new us1(2, new ac.m("Detaching surface timed out."), 1003));
    }

    public final void W1(int i4, int i10) {
        yk0 yk0Var = this.Q;
        if (i4 == yk0Var.f18786a && i10 == yk0Var.f18787b) {
            return;
        }
        this.Q = new yk0(i4, i10);
        cl1 cl1Var = new cl1(i4, i10);
        yf0 yf0Var = this.f12460n;
        yf0Var.c(24, cl1Var);
        yf0Var.d();
        X1(2, 14, new yk0(i4, i10));
    }

    public final void X1(int i4, int i10, Object obj) {
        nt1 nt1Var;
        pr1[] pr1VarArr = this.f12455h;
        int length = pr1VarArr.length;
        int i11 = 0;
        while (true) {
            nt1Var = this.f12459m;
            if (i11 >= 2) {
                break;
            }
            pr1 pr1Var = pr1VarArr[i11];
            if (i4 == -1 || pr1Var.f15083b == i4) {
                M1(this.f12447a0);
                uh uhVar = this.f12447a0.f10872a;
                hu1 hu1Var = new hu1(nt1Var, pr1Var, nt1Var.j);
                mq0.c0(!hu1Var.f11982f);
                hu1Var.f11979c = i10;
                mq0.c0(!hu1Var.f11982f);
                hu1Var.f11980d = obj;
                hu1Var.a();
            }
            i11++;
        }
        pr1[] pr1VarArr2 = this.f12456i;
        int length2 = pr1VarArr2.length;
        for (int i12 = 0; i12 < 2; i12++) {
            pr1 pr1Var2 = pr1VarArr2[i12];
            if (pr1Var2 != null && (i4 == -1 || pr1Var2.f15083b == i4)) {
                M1(this.f12447a0);
                uh uhVar2 = this.f12447a0.f10872a;
                hu1 hu1Var2 = new hu1(nt1Var, pr1Var2, nt1Var.j);
                mq0.c0(!hu1Var2.f11982f);
                hu1Var2.f11979c = i10;
                mq0.c0(!hu1Var2.f11982f);
                hu1Var2.f11980d = obj;
                hu1Var2.a();
            }
        }
    }

    public final void Y1(boolean z3) {
        o0();
        eu1 eu1Var = this.f12447a0;
        int i4 = eu1Var.f10883n;
        int i10 = 0;
        if (i4 == 1) {
            if (z3) {
                i4 = 1;
            } else {
                i4 = 1;
                i10 = 1;
            }
        }
        if (eu1Var.f10881l == z3 && i4 == i10 && eu1Var.f10882m == 1) {
            return;
        }
        this.F++;
        eu1 eu1VarH = eu1Var.h(1, i10, z3);
        int i11 = (i10 << 4) | 1;
        Handler handler = this.f12459m.f14419h.f14385a;
        io0 io0VarG = no0.g();
        io0VarG.f12403a = handler.obtainMessage(1, z3 ? 1 : 0, i11);
        io0VarG.a();
        Q1(eu1VarH, 0, false, 5, -9223372036854775807L, -1);
    }

    public final long Z1() {
        o0();
        if (!s1()) {
            uh uhVarL1 = l1();
            if (uhVarL1.g()) {
                return -9223372036854775807L;
            }
            return bq0.r(uhVarL1.b(o1(), (fh) this.f11937a, 0L).j);
        }
        eu1 eu1Var = this.f12447a0;
        jy1 jy1Var = eu1Var.f10873b;
        uh uhVar = eu1Var.f10872a;
        Object obj = jy1Var.f12875a;
        tg tgVar = this.f12462p;
        uhVar.o(obj, tgVar);
        return bq0.r(tgVar.b(jy1Var.f12876b, jy1Var.f12877c));
    }

    public final long b2() {
        o0();
        if (s1()) {
            eu1 eu1Var = this.f12447a0;
            return eu1Var.f10880k.equals(eu1Var.f10873b) ? bq0.r(this.f12447a0.f10885p) : Z1();
        }
        o0();
        if (this.f12447a0.f10872a.g()) {
            return this.f12450c0;
        }
        eu1 eu1Var2 = this.f12447a0;
        long j = 0;
        if (eu1Var2.f10880k.f12878d != eu1Var2.f10873b.f12878d) {
            return bq0.r(eu1Var2.f10872a.b(o1(), (fh) this.f11937a, 0L).j);
        }
        long j8 = eu1Var2.f10885p;
        if (this.f12447a0.f10880k.b()) {
            eu1 eu1Var3 = this.f12447a0;
            eu1Var3.f10872a.o(eu1Var3.f10880k.f12875a, this.f12462p).f16814f.a(this.f12447a0.f10880k.f12876b).getClass();
        } else {
            j = j8;
        }
        eu1 eu1Var4 = this.f12447a0;
        eu1Var4.f10872a.o(eu1Var4.f10880k.f12875a, this.f12462p);
        return bq0.r(j);
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final int e1() {
        o0();
        return this.f12447a0.f10876e;
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final int f1() {
        o0();
        return this.f12447a0.f10883n;
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final boolean h1() {
        o0();
        return this.f12447a0.f10881l;
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final void i1() {
        o0();
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final go j1() {
        o0();
        return (go) this.f12447a0.f10879i.f11327d;
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final uh l1() {
        o0();
        return this.f12447a0.f10872a;
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final int n1() {
        o0();
        if (!this.f12447a0.f10872a.g()) {
            eu1 eu1Var = this.f12447a0;
            return eu1Var.f10872a.e(eu1Var.f10873b.f12875a);
        }
        int i4 = this.f12448b0;
        if (i4 == -1) {
            return 0;
        }
        return i4;
    }

    public final void o0() {
        this.f12453e.d();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f12466t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = bq0.f9768a;
            Locale locale = Locale.US;
            String strN = a0.g.n("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.U) {
                throw new IllegalStateException(strN);
            }
            ls.y("ExoPlayerImpl", strN, this.V ? null : new IllegalStateException());
            this.V = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final int o1() {
        o0();
        int iM1 = M1(this.f12447a0);
        if (iM1 == -1) {
            return 0;
        }
        return iM1;
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final long q1() {
        o0();
        return bq0.r(P1(this.f12447a0));
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final long r1() {
        o0();
        return bq0.r(this.f12447a0.f10886q);
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final boolean s1() {
        o0();
        return this.f12447a0.f10873b.b();
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final int t1() {
        o0();
        if (s1()) {
            return this.f12447a0.f10873b.f12877c;
        }
        return -1;
    }

    public final void v1(float f10) {
        o0();
        String str = bq0.f9768a;
        float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.S == fMax) {
            return;
        }
        this.S = fMax;
        this.f12459m.f14419h.b(32, Float.valueOf(fMax)).a();
        cl1 cl1Var = new cl1(fMax);
        yf0 yf0Var = this.f12460n;
        yf0Var.c(22, cl1Var);
        yf0Var.d();
    }

    public final void w1(ru1 ru1Var) {
        this.f12465s.f18202f.a(ru1Var);
    }

    public final void x1(fz fzVar) {
        o0();
        this.f12465s.f18202f.b(fzVar);
    }

    public final void y1() {
        String str;
        boolean zE;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = bq0.f9768a;
        HashSet hashSet = y5.f18640a;
        synchronized (y5.class) {
            str = y5.f18641b;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 40 + String.valueOf(str2).length() + 3 + String.valueOf(str).length() + 1);
        je.u.B(sb2, "Release ", hexString, " [AndroidXMedia3/1.9.0-beta01] [", str2);
        sb2.append("] [");
        sb2.append(str);
        sb2.append("]");
        ls.n("ExoPlayerImpl", sb2.toString());
        o0();
        this.f12471y.f(false);
        s5 s5Var = this.f12472z;
        if (s5Var.f15871b) {
            s5Var.f15871b = false;
        }
        ht1 ht1Var = this.D;
        if (ht1Var != null && Build.VERSION.SDK_INT >= 34) {
            ht1Var.a();
        }
        com.google.android.gms.internal.consent_sdk.d dVar = this.C;
        ((no0) dVar.f19299e).f14385a.removeCallbacksAndMessages(null);
        it1 it1Var = (it1) dVar.f19295a;
        nl0 nl0Var = (nl0) dVar.f19296b;
        it1Var.o0();
        nl0Var.getClass();
        it1Var.f12460n.b(nl0Var);
        nt1 nt1Var = this.f12459m;
        if (nt1Var.H || !nt1Var.j.getThread().isAlive()) {
            zE = true;
        } else {
            nt1Var.H = true;
            za0 za0Var = new za0();
            nt1Var.f14419h.b(7, za0Var).a();
            zE = za0Var.e(nt1Var.f14430t);
        }
        if (!zE) {
            yf0 yf0Var = this.f12460n;
            yf0Var.c(10, cl1.j);
            yf0Var.d();
        }
        this.f12460n.e();
        this.f12457k.f14385a.removeCallbacksAndMessages(null);
        l lVar = this.f12467u;
        wu1 wu1Var = this.f12465s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((n) lVar).f14087c.f12502b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.f12907b == wu1Var) {
                kVar.f12908c = true;
                copyOnWriteArrayList.remove(kVar);
            }
        }
        this.f12447a0.getClass();
        eu1 eu1VarT1 = T1(this.f12447a0, 1);
        this.f12447a0 = eu1VarT1;
        eu1 eu1VarG = eu1VarT1.g(eu1VarT1.f10873b);
        this.f12447a0 = eu1VarG;
        eu1VarG.f10885p = eu1VarG.f10887r;
        this.f12447a0.f10886q = 0L;
        no0 no0Var = wu1Var.f18203h;
        no0Var.getClass();
        no0Var.e(new du0(16, wu1Var));
        Surface surface = this.O;
        if (surface != null) {
            surface.release();
            this.O = null;
        }
        i41 i41Var = i50.f12141a;
        this.X = true;
    }

    @Override // com.google.android.gms.internal.ads.hp1
    public final int z() {
        o0();
        if (s1()) {
            return this.f12447a0.f10873b.f12876b;
        }
        return -1;
    }
}
