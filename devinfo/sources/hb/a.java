package hb;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.yq;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import nk.k;
import pa.b;
import pa.u;
import t6.d0;
import t6.e;
import t6.g0;
import t6.h;
import t6.j0;
import va.l;
import va.o;
import va.r;
import va.s0;
import vk.i;
import zj.n;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public Object f25039a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25040b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25041c;

    public a(Context context, b bVar) {
        if (u.f31554a == null) {
            synchronized (u.class) {
                try {
                    if (u.f31554a == null) {
                        o oVar = r.g.f36158b;
                        yq yqVar = new yq();
                        oVar.getClass();
                        u.f31554a = (s0) new l(oVar, context, yqVar).d(context, false);
                    }
                } finally {
                }
            }
        }
        this.f25039a = u.f31554a;
        this.f25041c = context.getApplicationContext();
        this.f25040b = bVar;
    }

    public j0 a() {
        j0 j0VarB = b();
        e eVar = ((b7.r) this.f25040b).j;
        boolean z3 = (Build.VERSION.SDK_INT >= 24 && eVar.b()) || eVar.f34338e || eVar.f34336c || eVar.f34337d;
        b7.r rVar = (b7.r) this.f25040b;
        if (rVar.f2044q) {
            if (z3) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (rVar.g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        String str = rVar.f2051x;
        if (str == null) {
            List listQ0 = i.Q0(rVar.f2032c, new String[]{"."});
            String strU0 = listQ0.size() == 1 ? (String) listQ0.get(0) : (String) n.h0(listQ0);
            if (strU0.length() > 127) {
                strU0 = i.U0(127, strU0);
            }
            rVar.f2051x = strU0;
        } else if (str.length() > 127) {
            ((b7.r) this.f25040b).f2051x = i.U0(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        k.d(uuidRandomUUID, "randomUUID(...)");
        this.f25039a = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        k.d(string, "toString(...)");
        b7.r rVar2 = (b7.r) this.f25040b;
        k.e(rVar2, "other");
        this.f25040b = new b7.r(string, rVar2.f2031b, rVar2.f2032c, rVar2.f2033d, new h(rVar2.f2034e), new h(rVar2.f2035f), rVar2.g, rVar2.f2036h, rVar2.f2037i, new e(rVar2.j), rVar2.f2038k, rVar2.f2039l, rVar2.f2040m, rVar2.f2041n, rVar2.f2042o, rVar2.f2043p, rVar2.f2044q, rVar2.f2045r, rVar2.f2046s, rVar2.f2048u, rVar2.f2049v, rVar2.f2050w, rVar2.f2051x, rVar2.f2052y, 524288);
        return j0VarB;
    }

    public abstract j0 b();

    public void c() {
        try {
            ((s0) this.f25039a).A(((b) this.f25040b).f31521a);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    public a(Class cls) {
        UUID uuidRandomUUID = UUID.randomUUID();
        k.d(uuidRandomUUID, "randomUUID(...)");
        this.f25039a = uuidRandomUUID;
        String string = ((UUID) this.f25039a).toString();
        k.d(string, "toString(...)");
        this.f25040b = new b7.r(string, (g0) null, cls.getName(), (String) null, (h) null, (h) null, 0L, 0L, 0L, (e) null, 0, (t6.a) null, 0L, 0L, 0L, 0L, false, (d0) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(w.H(1));
        linkedHashSet.add(strArr[0]);
        this.f25041c = linkedHashSet;
    }
}
