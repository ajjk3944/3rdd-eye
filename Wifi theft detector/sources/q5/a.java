package q5;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;
import q5.d;

/* loaded from: classes3.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    public static a f24046f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    public t5.f f24047a = new t5.f();

    /* renamed from: b, reason: collision with root package name */
    public Date f24048b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24049c;

    /* renamed from: d, reason: collision with root package name */
    public d f24050d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24051e;

    public a(d dVar) {
        this.f24050d = dVar;
    }

    public static a a() {
        return f24046f;
    }

    public void b(Context context) {
        if (this.f24049c) {
            return;
        }
        this.f24050d.a(context);
        this.f24050d.b(this);
        this.f24050d.i();
        this.f24051e = this.f24050d.g();
        this.f24049c = true;
    }

    public Date c() {
        Date date = this.f24048b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void d() {
        if (!this.f24049c || this.f24048b == null) {
            return;
        }
        Iterator it = c.e().a().iterator();
        while (it.hasNext()) {
            ((o5.g) it.next()).t().h(c());
        }
    }

    public void e() {
        Date dateA = this.f24047a.a();
        Date date = this.f24048b;
        if (date == null || dateA.after(date)) {
            this.f24048b = dateA;
            d();
        }
    }

    @Override // q5.d.a
    public void a(boolean z10) {
        if (!this.f24051e && z10) {
            e();
        }
        this.f24051e = z10;
    }
}
