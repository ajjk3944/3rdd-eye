package q5;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;
import q5.d;

/* loaded from: classes3.dex */
public class i implements d.a, p5.c {

    /* renamed from: f, reason: collision with root package name */
    public static i f24071f;

    /* renamed from: a, reason: collision with root package name */
    public float f24072a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final p5.e f24073b;

    /* renamed from: c, reason: collision with root package name */
    public final p5.b f24074c;

    /* renamed from: d, reason: collision with root package name */
    public p5.d f24075d;

    /* renamed from: e, reason: collision with root package name */
    public c f24076e;

    public i(p5.e eVar, p5.b bVar) {
        this.f24073b = eVar;
        this.f24074c = bVar;
    }

    public static i d() {
        if (f24071f == null) {
            f24071f = new i(new p5.e(), new p5.b());
        }
        return f24071f;
    }

    public final c a() {
        if (this.f24076e == null) {
            this.f24076e = c.e();
        }
        return this.f24076e;
    }

    public void b(Context context) {
        this.f24075d = this.f24073b.a(new Handler(), context, this.f24074c.a(), this);
    }

    public float c() {
        return this.f24072a;
    }

    public void e() {
        b.k().b(this);
        b.k().i();
        u5.a.p().q();
        this.f24075d.d();
    }

    public void f() {
        u5.a.p().s();
        b.k().j();
        this.f24075d.e();
    }

    @Override // p5.c
    public void a(float f10) {
        this.f24072a = f10;
        Iterator it = a().a().iterator();
        while (it.hasNext()) {
            ((o5.g) it.next()).t().b(f10);
        }
    }

    @Override // q5.d.a
    public void a(boolean z10) {
        if (z10) {
            u5.a.p().q();
        } else {
            u5.a.p().o();
        }
    }
}
