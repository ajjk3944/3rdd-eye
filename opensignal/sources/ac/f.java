package ac;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import bc.a0;
import bc.b0;
import bc.w;
import cc.s;
import com.staircase3.opensignal.activities.TowersActivity;
import dd.r;
import h7.r1;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f326a;

    /* renamed from: b, reason: collision with root package name */
    public final String f327b;

    /* renamed from: c, reason: collision with root package name */
    public final r1 f328c;

    /* renamed from: d, reason: collision with root package name */
    public final bm.e f329d;

    /* renamed from: e, reason: collision with root package name */
    public final b f330e;

    /* renamed from: f, reason: collision with root package name */
    public final bc.a f331f;

    /* renamed from: g, reason: collision with root package name */
    public final int f332g;

    /* renamed from: h, reason: collision with root package name */
    public final df.c f333h;

    /* renamed from: i, reason: collision with root package name */
    public final bc.d f334i;

    public f(Context context, TowersActivity towersActivity, bm.e eVar, b bVar, e eVar2) {
        s.i(context, "Null context is not permitted.");
        s.i(eVar, "Api must not be null.");
        s.i(eVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        s.i(applicationContext, "The provided context did not have an application context.");
        this.f326a = applicationContext;
        int i10 = Build.VERSION.SDK_INT;
        String strA = (i10 < 30 || i10 < 30) ? null : h3.b.a(context);
        this.f327b = strA;
        this.f328c = i10 >= 31 ? new r1(6, context.getAttributionSource()) : null;
        this.f329d = eVar;
        this.f330e = bVar;
        bc.a aVar = new bc.a(eVar, bVar, strA);
        this.f331f = aVar;
        bc.d dVarD = bc.d.d(applicationContext);
        this.f334i = dVarD;
        this.f332g = dVarD.D.getAndIncrement();
        this.f333h = eVar2.f325a;
        if (towersActivity != null && Looper.myLooper() == Looper.getMainLooper()) {
            bc.f fVarB = bc.e.b(towersActivity);
            bc.k kVar = (bc.k) fVarB.c(bc.k.class, "ConnectionlessLifecycleHelper");
            if (kVar == null) {
                Object obj = zb.c.f26813d;
                kVar = new bc.k(fVarB, dVarD);
            }
            kVar.f2618y.add(aVar);
            dVarD.e(kVar);
        }
        yh.a aVar2 = dVarD.J;
        aVar2.sendMessage(aVar2.obtainMessage(7, this));
    }

    public final bm.d a() {
        bm.d dVar = new bm.d(9);
        Set set = Collections.EMPTY_SET;
        if (((u.f) dVar.f2826d) == null) {
            dVar.f2826d = new u.f(0);
        }
        ((u.f) dVar.f2826d).addAll(set);
        Context context = this.f326a;
        dVar.f2828r = context.getClass().getName();
        dVar.f2827g = context.getPackageName();
        return dVar;
    }

    public final r b(bc.g gVar, int i10) {
        s.i(gVar, "Listener key cannot be null.");
        bc.d dVar = this.f334i;
        dVar.getClass();
        dd.h hVar = new dd.h();
        dVar.b(hVar, i10, this);
        w wVar = new w(new a0(gVar, hVar), dVar.E.get(), this);
        yh.a aVar = dVar.J;
        aVar.sendMessage(aVar.obtainMessage(13, wVar));
        return hVar.f7294a;
    }

    public final r c(int i10, bc.j jVar) {
        dd.h hVar = new dd.h();
        bc.d dVar = this.f334i;
        dVar.getClass();
        dVar.b(hVar, jVar.f2611c, this);
        w wVar = new w(new b0(i10, jVar, hVar, this.f333h), dVar.E.get(), this);
        yh.a aVar = dVar.J;
        aVar.sendMessage(aVar.obtainMessage(4, wVar));
        return hVar.f7294a;
    }
}
