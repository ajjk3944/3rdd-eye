package V6;

import Ki.w;
import S6.j;
import Yg.J;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class b implements T2.d, U6.a {

    /* renamed from: a, reason: collision with root package name */
    private final S6.k f22980a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f22981b;

    /* renamed from: c, reason: collision with root package name */
    private Ki.t f22982c;

    /* renamed from: d, reason: collision with root package name */
    private Y0.r f22983d;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.request.c f22984e;

    /* renamed from: f, reason: collision with root package name */
    private final List f22985f;

    /* renamed from: g, reason: collision with root package name */
    private Throwable f22986g;

    public b(S6.k imageOptions) {
        AbstractC6492s.i(imageOptions, "imageOptions");
        this.f22980a = imageOptions;
        this.f22981b = new Object();
        this.f22985f = new ArrayList();
    }

    private final long m(long j10) {
        S6.k kVar = this.f22980a;
        if (Y0.r.g(kVar.h()) > 0 && Y0.r.f(kVar.h()) > 0) {
            return this.f22980a.h();
        }
        boolean zH = Y0.b.h(j10);
        int iK = PduHandle.NONE;
        int iL = (zH && n(Y0.b.l(j10))) ? Y0.b.l(j10) : Integer.MIN_VALUE;
        if (Y0.b.g(j10) && n(Y0.b.k(j10))) {
            iK = Y0.b.k(j10);
        }
        return Y0.s.a(iL, iK);
    }

    private final boolean n(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    @Override // Q2.l
    public void a() {
    }

    @Override // Q2.l
    public void b() {
    }

    @Override // U6.a
    public void c(long j10) {
        ArrayList arrayList;
        long jM = m(j10);
        synchronized (this.f22981b) {
            this.f22983d = Y0.r.b(jM);
            arrayList = new ArrayList(this.f22985f);
            this.f22985f.clear();
            J j11 = J.f24997a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((T2.c) it.next()).f(Y0.r.g(jM), Y0.r.f(jM));
        }
    }

    @Override // T2.d
    public void d(T2.c cb2) {
        AbstractC6492s.i(cb2, "cb");
        synchronized (this.f22981b) {
            this.f22985f.remove(cb2);
        }
    }

    @Override // T2.d
    public void e(com.bumptech.glide.request.c cVar) {
        this.f22984e = cVar;
    }

    @Override // Q2.l
    public void f() {
    }

    @Override // T2.d
    public void g(Object resource, U2.b bVar) {
        AbstractC6492s.i(resource, "resource");
    }

    @Override // T2.d
    public void h(Drawable drawable) {
        Ki.w wVarG;
        Ki.t tVar = this.f22982c;
        if (tVar != null) {
            Ki.k.b(Ki.n.b(tVar, new j.a(drawable, this.f22986g)));
        }
        Ki.t tVar2 = this.f22982c;
        if (tVar2 == null || (wVarG = tVar2.g()) == null) {
            return;
        }
        w.a.a(wVarG, null, 1, null);
    }

    @Override // T2.d
    public void i(Drawable drawable) {
        Ki.t tVar = this.f22982c;
        if (tVar != null) {
            Ki.k.b(Ki.n.b(tVar, j.b.f20332a));
        }
    }

    @Override // T2.d
    public com.bumptech.glide.request.c j() {
        return this.f22984e;
    }

    @Override // T2.d
    public void k(Drawable drawable) {
        Ki.w wVarG;
        Ki.t tVar = this.f22982c;
        if (tVar != null) {
            Ki.k.b(Ki.n.b(tVar, j.c.f20333a));
        }
        Ki.t tVar2 = this.f22982c;
        if (tVar2 == null || (wVarG = tVar2.g()) == null) {
            return;
        }
        w.a.a(wVarG, null, 1, null);
    }

    @Override // T2.d
    public void l(T2.c cb2) {
        AbstractC6492s.i(cb2, "cb");
        Y0.r rVar = this.f22983d;
        if (rVar != null) {
            cb2.f(Y0.r.g(rVar.j()), Y0.r.f(rVar.j()));
            return;
        }
        synchronized (this.f22981b) {
            try {
                Y0.r rVar2 = this.f22983d;
                if (rVar2 != null) {
                    cb2.f(Y0.r.g(rVar2.j()), Y0.r.f(rVar2.j()));
                    J j10 = J.f24997a;
                } else {
                    this.f22985f.add(cb2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o(Ki.t producerScope) {
        AbstractC6492s.i(producerScope, "producerScope");
        this.f22982c = producerScope;
    }

    public final void p(Throwable th2) {
        this.f22986g = th2;
    }
}
