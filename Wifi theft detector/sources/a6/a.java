package a6;

import a6.d;
import android.content.Context;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    public static a f152f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    public d6.f f153a = new d6.f();

    /* renamed from: b, reason: collision with root package name */
    public Date f154b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f155c;

    /* renamed from: d, reason: collision with root package name */
    public d f156d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f157e;

    public a(d dVar) {
        this.f156d = dVar;
    }

    public static a a() {
        return f152f;
    }

    public void b(Context context) {
        if (this.f155c) {
            return;
        }
        this.f156d.b(context);
        this.f156d.a(this);
        this.f156d.i();
        this.f157e = this.f156d.g();
        this.f155c = true;
    }

    public Date c() {
        Date date = this.f154b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void d() throws JSONException {
        if (!this.f155c || this.f154b == null) {
            return;
        }
        Iterator it = c.e().a().iterator();
        while (it.hasNext()) {
            ((y5.f) it.next()).p().e(c());
        }
    }

    public void e() throws JSONException {
        Date dateA = this.f153a.a();
        Date date = this.f154b;
        if (date == null || dateA.after(date)) {
            this.f154b = dateA;
            d();
        }
    }

    @Override // a6.d.a
    public void a(boolean z10) throws JSONException {
        if (!this.f157e && z10) {
            e();
        }
        this.f157e = z10;
    }
}
