package y5;

import a6.h;
import android.view.View;
import com.iab.omid.library.unity3d.adsession.AdSessionContextType;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;
import d6.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class f extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f25144k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final d f25145a;

    /* renamed from: b, reason: collision with root package name */
    public final c f25146b;

    /* renamed from: d, reason: collision with root package name */
    public g6.a f25148d;

    /* renamed from: e, reason: collision with root package name */
    public AdSessionStatePublisher f25149e;

    /* renamed from: h, reason: collision with root package name */
    public final String f25152h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25153i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25154j;

    /* renamed from: c, reason: collision with root package name */
    public final List f25147c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f25150f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25151g = false;

    public f(c cVar, d dVar) {
        this.f25146b = cVar;
        this.f25145a = dVar;
        String string = UUID.randomUUID().toString();
        this.f25152h = string;
        k(null);
        this.f25149e = (dVar.c() == AdSessionContextType.HTML || dVar.c() == AdSessionContextType.JAVASCRIPT) ? new c6.a(string, dVar.j()) : new c6.b(string, dVar.f(), dVar.g());
        this.f25149e.t();
        a6.c.e().b(this);
        this.f25149e.h(cVar);
    }

    @Override // y5.b
    public void b() {
        if (this.f25151g) {
            return;
        }
        this.f25148d.clear();
        u();
        this.f25151g = true;
        p().p();
        a6.c.e().d(this);
        p().l();
        this.f25149e = null;
    }

    @Override // y5.b
    public void c(View view) {
        if (this.f25151g) {
            return;
        }
        g.c(view, "AdView is null");
        if (h() == view) {
            return;
        }
        k(view);
        p().a();
        i(view);
    }

    @Override // y5.b
    public void d() {
        if (this.f25150f) {
            return;
        }
        this.f25150f = true;
        a6.c.e().f(this);
        this.f25149e.b(h.d().c());
        this.f25149e.e(a6.a.a().c());
        this.f25149e.i(this, this.f25145a);
    }

    public final void e() {
        if (this.f25153i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(List list) {
        if (l()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((g6.a) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    public final void g() {
        if (this.f25154j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View h() {
        return (View) this.f25148d.get();
    }

    public final void i(View view) {
        Collection<f> collectionC = a6.c.e().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (f fVar : collectionC) {
            if (fVar != this && fVar.h() == view) {
                fVar.f25148d.clear();
            }
        }
    }

    public List j() {
        return this.f25147c;
    }

    public final void k(View view) {
        this.f25148d = new g6.a(view);
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return this.f25150f && !this.f25151g;
    }

    public boolean n() {
        return this.f25151g;
    }

    public String o() {
        return this.f25152h;
    }

    public AdSessionStatePublisher p() {
        return this.f25149e;
    }

    public boolean q() {
        return this.f25146b.b();
    }

    public boolean r() {
        return this.f25150f;
    }

    public void s() {
        e();
        p().q();
        this.f25153i = true;
    }

    public void t() {
        g();
        p().s();
        this.f25154j = true;
    }

    public void u() {
        if (this.f25151g) {
            return;
        }
        this.f25147c.clear();
    }
}
