package pg;

import android.content.Context;
import android.content.res.Configuration;
import c1.n;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import d0.d1;
import j2.h0;
import java.util.ArrayList;
import nk.k;
import p1.s;
import p1.z;
import r0.m;
import u0.g0;
import u0.l;
import u0.m1;
import u0.o2;
import u0.p;
import u0.q;
import u0.u0;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31961a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f31962b;

    /* renamed from: c, reason: collision with root package name */
    public static final o2 f31963c;

    static {
        long jC = z.c(3724541952L);
        long jC2 = z.c(4294967295L);
        long jC3 = z.c(2315255808L);
        long jC4 = z.c(3019898879L);
        long j = s.f31015d;
        f31961a = new a(jC, jC2, jC3, jC4, s.b(j, 0.95f), j, j, z.c(4292532954L));
        long jC5 = z.c(4294967295L);
        long jC6 = z.c(3724541952L);
        long jC7 = z.c(3019898879L);
        long jC8 = z.c(2315255808L);
        long j8 = s.f31013b;
        f31962b = new a(jC5, jC6, jC7, jC8, s.b(j8, 0.88f), j8, z.c(4282532418L), z.c(4281545523L));
        f31963c = new o2(new b6.a(21));
    }

    public static final void a(final boolean z3, final c1.h hVar, p pVar, final int i4) {
        pVar.X(-925296484);
        int i10 = i4 | 50;
        if (pVar.O(i10 & 1, (i10 & 147) != 146)) {
            pVar.T();
            if ((i4 & 1) == 0 || pVar.y()) {
                z3 = (((Configuration) pVar.j(h0.f27169a)).uiMode & 48) == 32;
            } else {
                pVar.R();
            }
            final boolean z10 = z3;
            pVar.q();
            final Context context = (Context) pVar.j(h0.f27170b);
            Object objL = pVar.L();
            Object obj = l.f34851a;
            if (objL == obj) {
                objL = q.r(b(context, z10));
                pVar.g0(objL);
            }
            final u0 u0Var = (u0) objL;
            Boolean boolValueOf = Boolean.valueOf(z10);
            boolean zG = pVar.g(z10) | pVar.h(context);
            Object objL2 = pVar.L();
            if (zG || objL2 == obj) {
                Object qVar = new nm.q(z10, context, u0Var, null, 1);
                pVar.g0(qVar);
                objL2 = qVar;
            }
            q.d(false, boolValueOf, (mk.e) objL2, pVar);
            boolean zG2 = pVar.g(z10) | pVar.h(context);
            Object objL3 = pVar.L();
            if (zG2 || objL3 == obj) {
                objL3 = new mk.c() { // from class: pg.e
                    @Override // mk.c
                    public final Object invoke(Object obj2) {
                        k.e((g0) obj2, "$this$DisposableEffect");
                        ArrayList arrayList = zh.i.f38298a;
                        com.liuzh.deviceinfo.utilities.f.d();
                        g gVar = new g(z10, context, u0Var);
                        ArrayList arrayList2 = zh.i.f38298a;
                        if (!arrayList2.contains(gVar)) {
                            arrayList2.add(gVar);
                        }
                        return new j0.z(4, gVar);
                    }
                };
                pVar.g0(objL3);
            }
            q.c(u.f37649a, (mk.c) objL3, pVar);
            q.a(f31963c.a(z10 ? f31962b : f31961a), n.c(-1510655012, new d1(4, hVar, u0Var), pVar), pVar, 56);
            z3 = z10;
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new mk.e(z3, hVar, i4) { // from class: pg.f

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f31956a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c1.h f31957b;

                @Override // mk.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iZ = q.z(385);
                    h.a(this.f31956a, this.f31957b, (p) obj2, iZ);
                    return u.f37649a;
                }
            };
        }
    }

    public static final r0.l b(Context context, boolean z3) {
        k.e(context, "context");
        if (z3) {
            ArrayList arrayList = zh.i.f38298a;
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            return m.b(z.b(com.liuzh.deviceinfo.utilities.f.d()), s.f31013b, 0L, 0L, 0L, d.f31949a, 0L, 0L, 0L, d.f31950b, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -548, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        ArrayList arrayList2 = zh.i.f38298a;
        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
        return m.d(z.b(com.liuzh.deviceinfo.utilities.f.d()), s.f31015d, 0L, 0L, 0L, d.f31951c, 0L, 0L, 0L, d.f31952d, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -548, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }
}
