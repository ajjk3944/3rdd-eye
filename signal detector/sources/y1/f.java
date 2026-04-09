package y1;

import H1.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.l;
import com.bumptech.glide.n;
import java.util.ArrayList;
import k1.C2619a;
import n1.k;
import o1.InterfaceC2753a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final k1.d f24230a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f24231b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f24232c;

    /* renamed from: d, reason: collision with root package name */
    public final n f24233d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2753a f24234e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24235f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24236g;

    /* renamed from: h, reason: collision with root package name */
    public l f24237h;
    public d i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24238j;

    /* renamed from: k, reason: collision with root package name */
    public d f24239k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f24240l;

    /* renamed from: m, reason: collision with root package name */
    public d f24241m;

    /* renamed from: n, reason: collision with root package name */
    public int f24242n;

    /* renamed from: o, reason: collision with root package name */
    public int f24243o;

    /* renamed from: p, reason: collision with root package name */
    public int f24244p;

    public f(com.bumptech.glide.b bVar, k1.d dVar, int i, int i3, Bitmap bitmap) {
        InterfaceC2753a interfaceC2753a = bVar.f6484a;
        com.bumptech.glide.f fVar = bVar.f6486c;
        Context baseContext = fVar.getBaseContext();
        H1.g.c(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        n nVarB = com.bumptech.glide.b.a(baseContext).f6488e.b(baseContext);
        Context baseContext2 = fVar.getBaseContext();
        H1.g.c(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        n nVarB2 = com.bumptech.glide.b.a(baseContext2).f6488e.b(baseContext2);
        nVarB2.getClass();
        l lVarS = new l(nVarB2.f6568a, nVarB2, Bitmap.class, nVarB2.f6569b).a(n.f6567k).a(((D1.e) ((D1.e) ((D1.e) new D1.e().d(k.f22239b)).q()).n()).i(i, i3));
        this.f24232c = new ArrayList();
        this.f24233d = nVarB;
        Handler handler = new Handler(Looper.getMainLooper(), new J3.l(1, this));
        this.f24234e = interfaceC2753a;
        this.f24231b = handler;
        this.f24237h = lVarS;
        this.f24230a = dVar;
        c(t1.c.f23536b, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f24235f || this.f24236g) {
            return;
        }
        d dVar = this.f24241m;
        if (dVar != null) {
            this.f24241m = null;
            b(dVar);
            return;
        }
        this.f24236g = true;
        k1.d dVar2 = this.f24230a;
        int i3 = dVar2.f21771l.f21749c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((i3 <= 0 || (i = dVar2.f21770k) < 0) ? 0 : (i < 0 || i >= i3) ? -1 : ((C2619a) r2.f21751e.get(i)).i);
        int i6 = (dVar2.f21770k + 1) % dVar2.f21771l.f21749c;
        dVar2.f21770k = i6;
        this.f24239k = new d(this.f24231b, i6, jUptimeMillis);
        l lVarX = this.f24237h.a((D1.e) new D1.e().m(new G1.b(Double.valueOf(Math.random())))).x(dVar2);
        lVarX.v(this.f24239k, lVarX);
    }

    public final void b(d dVar) {
        this.f24236g = false;
        boolean z6 = this.f24238j;
        Handler handler = this.f24231b;
        if (z6) {
            handler.obtainMessage(2, dVar).sendToTarget();
            return;
        }
        if (!this.f24235f) {
            this.f24241m = dVar;
            return;
        }
        if (dVar.f24229g != null) {
            Bitmap bitmap = this.f24240l;
            if (bitmap != null) {
                this.f24234e.e(bitmap);
                this.f24240l = null;
            }
            d dVar2 = this.i;
            this.i = dVar;
            ArrayList arrayList = this.f24232c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) ((e) arrayList.get(size));
                Object callback = bVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    bVar.stop();
                    bVar.invalidateSelf();
                } else {
                    bVar.invalidateSelf();
                    d dVar3 = ((f) bVar.f24213a.f2634b).i;
                    if ((dVar3 != null ? dVar3.f24227e : -1) == r5.f24230a.f21771l.f21749c - 1) {
                        bVar.f24218f++;
                    }
                    int i = bVar.f24219g;
                    if (i != -1 && bVar.f24218f >= i) {
                        bVar.stop();
                    }
                }
            }
            if (dVar2 != null) {
                handler.obtainMessage(2, dVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(l1.l lVar, Bitmap bitmap) {
        H1.g.c(lVar, "Argument must not be null");
        H1.g.c(bitmap, "Argument must not be null");
        this.f24240l = bitmap;
        this.f24237h = this.f24237h.a(new D1.e().p(lVar, true));
        this.f24242n = p.c(bitmap);
        this.f24243o = bitmap.getWidth();
        this.f24244p = bitmap.getHeight();
    }
}
