package k8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.m;
import com.bumptech.glide.p;
import java.util.ArrayList;
import x7.l;
import z7.j;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final w7.d f28090a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f28091b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f28092c;

    /* renamed from: d, reason: collision with root package name */
    public final p f28093d;

    /* renamed from: e, reason: collision with root package name */
    public final a8.b f28094e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28095f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public m f28096h;

    /* renamed from: i, reason: collision with root package name */
    public d f28097i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public d f28098k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f28099l;

    /* renamed from: m, reason: collision with root package name */
    public d f28100m;

    /* renamed from: n, reason: collision with root package name */
    public int f28101n;

    /* renamed from: o, reason: collision with root package name */
    public int f28102o;

    /* renamed from: p, reason: collision with root package name */
    public int f28103p;

    public f(com.bumptech.glide.b bVar, w7.d dVar, int i4, int i10, Bitmap bitmap) {
        a8.b bVar2 = bVar.f6470a;
        com.bumptech.glide.h hVar = bVar.f6472c;
        Context baseContext = hVar.getBaseContext();
        t8.f.c(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        p pVarC = com.bumptech.glide.b.a(baseContext).f6474e.c(baseContext);
        Context baseContext2 = hVar.getBaseContext();
        t8.f.c(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        m mVarW = com.bumptech.glide.b.a(baseContext2).f6474e.c(baseContext2).i(Bitmap.class).a(p.f6555k).a(((p8.f) ((p8.f) ((p8.f) new p8.f().e(j.f38045b)).u()).q()).j(i4, i10));
        this.f28092c = new ArrayList();
        this.f28093d = pVarC;
        Handler handler = new Handler(Looper.getMainLooper(), new hd.e(1, this));
        this.f28094e = bVar2;
        this.f28091b = handler;
        this.f28096h = mVarW;
        this.f28090a = dVar;
        c(f8.c.f23839b, bitmap);
    }

    public final void a() {
        int i4;
        if (!this.f28095f || this.g) {
            return;
        }
        d dVar = this.f28100m;
        if (dVar != null) {
            this.f28100m = null;
            b(dVar);
            return;
        }
        this.g = true;
        w7.d dVar2 = this.f28090a;
        int i10 = dVar2.f36529l.f36509c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((i10 <= 0 || (i4 = dVar2.f36528k) < 0) ? 0 : (i4 < 0 || i4 >= i10) ? -1 : ((w7.a) r2.f36511e.get(i4)).f36505i);
        int i11 = (dVar2.f36528k + 1) % dVar2.f36529l.f36509c;
        dVar2.f36528k = i11;
        this.f28098k = new d(this.f28091b, i11, jUptimeMillis);
        m mVarC = this.f28096h.a((p8.f) new p8.f().p(new s8.d(Double.valueOf(Math.random())))).C(dVar2);
        mVarC.A(this.f28098k, mVarC);
    }

    public final void b(d dVar) {
        this.g = false;
        boolean z3 = this.j;
        Handler handler = this.f28091b;
        if (z3) {
            handler.obtainMessage(2, dVar).sendToTarget();
            return;
        }
        if (!this.f28095f) {
            this.f28100m = dVar;
            return;
        }
        if (dVar.g != null) {
            Bitmap bitmap = this.f28099l;
            if (bitmap != null) {
                this.f28094e.d(bitmap);
                this.f28099l = null;
            }
            d dVar2 = this.f28097i;
            this.f28097i = dVar;
            ArrayList arrayList = this.f28092c;
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
                    d dVar3 = ((f) bVar.f28075a.f27975b).f28097i;
                    if ((dVar3 != null ? dVar3.f28088e : -1) == r5.f28090a.f36529l.f36509c - 1) {
                        bVar.f28080f++;
                    }
                    int i4 = bVar.g;
                    if (i4 != -1 && bVar.f28080f >= i4) {
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

    public final void c(l lVar, Bitmap bitmap) {
        t8.f.c(lVar, "Argument must not be null");
        t8.f.c(bitmap, "Argument must not be null");
        this.f28099l = bitmap;
        this.f28096h = this.f28096h.a(new p8.f().t(lVar, true));
        this.f28101n = t8.m.c(bitmap);
        this.f28102o = bitmap.getWidth();
        this.f28103p = bitmap.getHeight();
    }
}
