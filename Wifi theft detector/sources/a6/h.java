package a6;

import a6.d;
import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class h implements d.a, z5.c {

    /* renamed from: f, reason: collision with root package name */
    public static h f171f;

    /* renamed from: a, reason: collision with root package name */
    public float f172a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final z5.e f173b;

    /* renamed from: c, reason: collision with root package name */
    public final z5.b f174c;

    /* renamed from: d, reason: collision with root package name */
    public z5.d f175d;

    /* renamed from: e, reason: collision with root package name */
    public c f176e;

    public h(z5.e eVar, z5.b bVar) {
        this.f173b = eVar;
        this.f174c = bVar;
    }

    public static h d() {
        if (f171f == null) {
            f171f = new h(new z5.e(), new z5.b());
        }
        return f171f;
    }

    public final c a() {
        if (this.f176e == null) {
            this.f176e = c.e();
        }
        return this.f176e;
    }

    public void b(Context context) {
        this.f175d = this.f173b.a(new Handler(), context, this.f174c.a(), this);
    }

    public float c() {
        return this.f172a;
    }

    public void e() {
        b.k().a(this);
        b.k().i();
        e6.a.p().q();
        this.f175d.d();
    }

    public void f() {
        e6.a.p().s();
        b.k().j();
        this.f175d.e();
    }

    @Override // z5.c
    public void a(float f10) {
        this.f172a = f10;
        Iterator it = a().a().iterator();
        while (it.hasNext()) {
            ((y5.f) it.next()).p().b(f10);
        }
    }

    @Override // a6.d.a
    public void a(boolean z10) {
        if (z10) {
            e6.a.p().q();
        } else {
            e6.a.p().o();
        }
    }
}
