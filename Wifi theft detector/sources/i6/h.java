package i6;

import android.view.View;
import com.iab.omid.library.vungle.adsession.AdSessionContextType;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k6.i;

/* loaded from: classes3.dex */
public class h extends b {

    /* renamed from: a, reason: collision with root package name */
    public final d f21621a;

    /* renamed from: b, reason: collision with root package name */
    public final c f21622b;

    /* renamed from: c, reason: collision with root package name */
    public final k6.f f21623c;

    /* renamed from: d, reason: collision with root package name */
    public q6.a f21624d;

    /* renamed from: e, reason: collision with root package name */
    public AdSessionStatePublisher f21625e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21626f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21627g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21628h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21629i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21630j;

    public h(c cVar, d dVar) {
        this(cVar, dVar, UUID.randomUUID().toString());
    }

    @Override // i6.b
    public void b() {
        if (this.f21627g) {
            return;
        }
        this.f21624d.clear();
        u();
        this.f21627g = true;
        k().q();
        k6.c.e().d(this);
        k().l();
        this.f21625e = null;
    }

    @Override // i6.b
    public void c(View view) {
        if (this.f21627g || l() == view) {
            return;
        }
        i(view);
        k().a();
        f(view);
    }

    @Override // i6.b
    public void d() {
        if (this.f21626f || this.f21625e == null) {
            return;
        }
        this.f21626f = true;
        k6.c.e().f(this);
        this.f21625e.b(i.d().c());
        this.f21625e.i(k6.a.a().c());
        this.f21625e.f(this, this.f21621a);
    }

    public final void e() {
        if (this.f21629i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    public final void f(View view) {
        Collection<h> collectionC = k6.c.e().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (h hVar : collectionC) {
            if (hVar != this && hVar.l() == view) {
                hVar.f21624d.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g(List list) {
        if (n()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((q6.a) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    public final void h() {
        if (this.f21630j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public final void i(View view) {
        this.f21624d = new q6.a(view);
    }

    public String j() {
        return this.f21628h;
    }

    public AdSessionStatePublisher k() {
        return this.f21625e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View l() {
        return (View) this.f21624d.get();
    }

    public List m() {
        return this.f21623c.a();
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return this.f21626f && !this.f21627g;
    }

    public boolean p() {
        return this.f21627g;
    }

    public boolean q() {
        return this.f21622b.b();
    }

    public boolean r() {
        return this.f21626f;
    }

    public void s() {
        e();
        k().r();
        this.f21629i = true;
    }

    public void t() {
        h();
        k().t();
        this.f21630j = true;
    }

    public void u() {
        if (this.f21627g) {
            return;
        }
        this.f21623c.b();
    }

    public h(c cVar, d dVar, String str) {
        this.f21623c = new k6.f();
        this.f21626f = false;
        this.f21627g = false;
        this.f21622b = cVar;
        this.f21621a = dVar;
        this.f21628h = str;
        i(null);
        this.f21625e = (dVar.d() == AdSessionContextType.HTML || dVar.d() == AdSessionContextType.JAVASCRIPT) ? new m6.a(str, dVar.l()) : new m6.b(str, dVar.g(), dVar.h());
        this.f21625e.u();
        k6.c.e().b(this);
        this.f21625e.e(cVar);
    }
}
