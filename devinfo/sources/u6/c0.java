package u6;

import a0.x0;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.xz;
import java.util.ArrayList;
import t6.g0;
import xk.a1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final b7.r f35132a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f35133b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35134c;

    /* renamed from: d, reason: collision with root package name */
    public final i0.f f35135d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f35136e;

    /* renamed from: f, reason: collision with root package name */
    public final t6.b f35137f;
    public final t6.x g;

    /* renamed from: h, reason: collision with root package name */
    public final a7.a f35138h;

    /* renamed from: i, reason: collision with root package name */
    public final WorkDatabase f35139i;
    public final b7.y j;

    /* renamed from: k, reason: collision with root package name */
    public final b7.e f35140k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f35141l;

    /* renamed from: m, reason: collision with root package name */
    public final String f35142m;

    /* renamed from: n, reason: collision with root package name */
    public final a1 f35143n;

    public c0(xz xzVar) {
        b7.r rVar = (b7.r) xzVar.f18589f;
        this.f35132a = rVar;
        this.f35133b = (Context) xzVar.f18584a;
        String str = rVar.f2030a;
        this.f35134c = str;
        this.f35135d = (i0.f) xzVar.f18590h;
        this.f35136e = (x0) xzVar.f18586c;
        t6.b bVar = (t6.b) xzVar.f18585b;
        this.f35137f = bVar;
        this.g = bVar.f34315d;
        this.f35138h = (a7.a) xzVar.f18587d;
        WorkDatabase workDatabase = (WorkDatabase) xzVar.f18588e;
        this.f35139i = workDatabase;
        this.j = workDatabase.w();
        this.f35140k = workDatabase.r();
        ArrayList arrayList = (ArrayList) xzVar.g;
        this.f35141l = arrayList;
        this.f35142m = d.h.w(d.h.A("Work [ id=", str, ", tags={ "), zj.n.g0(arrayList, ",", null, null, null, 62), " } ]");
        this.f35143n = xk.x.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(final u6.c0 r23, ek.c r24) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.c0.a(u6.c0, ek.c):java.lang.Object");
    }

    public final void b(int i4) {
        b7.y yVar = this.j;
        g0 g0Var = g0.f34349a;
        String str = this.f35134c;
        yVar.h(g0Var, str);
        this.g.getClass();
        yVar.g(System.currentTimeMillis(), str);
        yVar.f(this.f35132a.f2049v, str);
        yVar.e(-1L, str);
        yVar.i(i4, str);
    }

    public final void c() {
        this.g.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        b7.y yVar = this.j;
        String str = this.f35134c;
        yVar.g(jCurrentTimeMillis, str);
        yVar.h(g0.f34349a, str);
        yVar.getClass();
        ((Number) com.bumptech.glide.f.r(yVar.f2066a, false, true, new b7.c(str, 10))).intValue();
        yVar.f(this.f35132a.f2049v, str);
        yVar.getClass();
        com.bumptech.glide.f.r(yVar.f2066a, false, true, new b7.c(str, 11));
        yVar.e(-1L, str);
    }

    public final void d(t6.t tVar) {
        nk.k.e(tVar, "result");
        String str = this.f35134c;
        ArrayList arrayListV = cm.g.v(str);
        while (true) {
            boolean zIsEmpty = arrayListV.isEmpty();
            b7.y yVar = this.j;
            if (zIsEmpty) {
                t6.h hVar = ((t6.q) tVar).f34392a;
                nk.k.d(hVar, "getOutputData(...)");
                yVar.f(this.f35132a.f2049v, str);
                yVar.getClass();
                com.bumptech.glide.f.r(yVar.f2066a, false, true, new b7.b(6, hVar, str));
                return;
            }
            String str2 = (String) zj.n.l0(arrayListV);
            if (yVar.c(str2) != g0.f34354f) {
                yVar.h(g0.f34352d, str2);
            }
            arrayListV.addAll(this.f35140k.a(str2));
        }
    }
}
