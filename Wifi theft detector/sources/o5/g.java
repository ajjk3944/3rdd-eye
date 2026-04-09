package o5;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContextType;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;
import q5.i;

/* loaded from: classes3.dex */
public class g extends b {

    /* renamed from: a, reason: collision with root package name */
    public final d f23666a;

    /* renamed from: b, reason: collision with root package name */
    public final c f23667b;

    /* renamed from: c, reason: collision with root package name */
    public final q5.f f23668c;

    /* renamed from: d, reason: collision with root package name */
    public w5.a f23669d;

    /* renamed from: e, reason: collision with root package name */
    public AdSessionStatePublisher f23670e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23671f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23672g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23673h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23674i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23675j;

    public g(c cVar, d dVar) {
        this(cVar, dVar, UUID.randomUUID().toString());
    }

    @Override // o5.b
    public void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f23672g) {
            return;
        }
        this.f23668c.c(view, friendlyObstructionPurpose, str);
    }

    @Override // o5.b
    public void c() {
        if (this.f23672g) {
            return;
        }
        this.f23669d.clear();
        e();
        this.f23672g = true;
        t().u();
        q5.c.e().d(this);
        t().o();
        this.f23670e = null;
    }

    @Override // o5.b
    public void d(View view) {
        if (this.f23672g) {
            return;
        }
        t5.g.c(view, "AdView is null");
        if (n() == view) {
            return;
        }
        m(view);
        t().a();
        i(view);
    }

    @Override // o5.b
    public void e() {
        if (this.f23672g) {
            return;
        }
        this.f23668c.f();
    }

    @Override // o5.b
    public void f(View view) {
        if (this.f23672g) {
            return;
        }
        this.f23668c.g(view);
    }

    @Override // o5.b
    public void g() {
        if (this.f23671f) {
            return;
        }
        this.f23671f = true;
        q5.c.e().f(this);
        this.f23670e.b(i.d().c());
        this.f23670e.h(q5.a.a().c());
        this.f23670e.k(this, this.f23666a);
    }

    public final void h() {
        if (this.f23674i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    public final void i(View view) {
        Collection<g> collectionC = q5.c.e().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (g gVar : collectionC) {
            if (gVar != this && gVar.n() == view) {
                gVar.f23669d.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(List list) {
        if (p()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((w5.a) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    public void k(JSONObject jSONObject) {
        l();
        t().m(jSONObject);
        this.f23675j = true;
    }

    public final void l() {
        if (this.f23675j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public final void m(View view) {
        this.f23669d = new w5.a(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n() {
        return (View) this.f23669d.get();
    }

    public List o() {
        return this.f23668c.a();
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return this.f23671f && !this.f23672g;
    }

    public boolean r() {
        return this.f23672g;
    }

    public String s() {
        return this.f23673h;
    }

    public AdSessionStatePublisher t() {
        return this.f23670e;
    }

    public boolean u() {
        return this.f23667b.b();
    }

    public boolean v() {
        return this.f23667b.c();
    }

    public boolean w() {
        return this.f23671f;
    }

    public void x() {
        h();
        t().v();
        this.f23674i = true;
    }

    public void y() {
        l();
        t().x();
        this.f23675j = true;
    }

    public g(c cVar, d dVar, String str) {
        this.f23668c = new q5.f();
        this.f23671f = false;
        this.f23672g = false;
        this.f23667b = cVar;
        this.f23666a = dVar;
        this.f23673h = str;
        m(null);
        this.f23670e = (dVar.c() == AdSessionContextType.HTML || dVar.c() == AdSessionContextType.JAVASCRIPT) ? new s5.a(str, dVar.j()) : new s5.b(str, dVar.f(), dVar.g());
        this.f23670e.y();
        q5.c.e().b(this);
        this.f23670e.j(cVar);
    }
}
