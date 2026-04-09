package k6;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;
import k6.d;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    public static a f21856f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    public n6.f f21857a = new n6.f();

    /* renamed from: b, reason: collision with root package name */
    public Date f21858b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21859c;

    /* renamed from: d, reason: collision with root package name */
    public d f21860d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21861e;

    public a(d dVar) {
        this.f21860d = dVar;
    }

    public static a a() {
        return f21856f;
    }

    public void b(Context context) {
        if (this.f21859c) {
            return;
        }
        this.f21860d.a(context);
        this.f21860d.b(this);
        this.f21860d.i();
        this.f21861e = this.f21860d.g();
        this.f21859c = true;
    }

    public Date c() {
        Date date = this.f21858b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void d() throws JSONException {
        if (!this.f21859c || this.f21858b == null) {
            return;
        }
        Iterator it = c.e().a().iterator();
        while (it.hasNext()) {
            ((i6.h) it.next()).k().i(c());
        }
    }

    public void e() throws JSONException {
        Date dateA = this.f21857a.a();
        Date date = this.f21858b;
        if (date == null || dateA.after(date)) {
            this.f21858b = dateA;
            d();
        }
    }

    @Override // k6.d.a
    public void a(boolean z10) throws JSONException {
        if (!this.f21861e && z10) {
            e();
        }
        this.f21861e = z10;
    }
}
