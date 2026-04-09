package k6;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;
import k6.d;

/* loaded from: classes3.dex */
public class i implements d.a, j6.c {

    /* renamed from: f, reason: collision with root package name */
    public static i f21877f;

    /* renamed from: a, reason: collision with root package name */
    public float f21878a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final j6.e f21879b;

    /* renamed from: c, reason: collision with root package name */
    public final j6.b f21880c;

    /* renamed from: d, reason: collision with root package name */
    public j6.d f21881d;

    /* renamed from: e, reason: collision with root package name */
    public c f21882e;

    public i(j6.e eVar, j6.b bVar) {
        this.f21879b = eVar;
        this.f21880c = bVar;
    }

    public static i d() {
        if (f21877f == null) {
            f21877f = new i(new j6.e(), new j6.b());
        }
        return f21877f;
    }

    public final c a() {
        if (this.f21882e == null) {
            this.f21882e = c.e();
        }
        return this.f21882e;
    }

    public void b(Context context) {
        this.f21881d = this.f21879b.a(new Handler(), context, this.f21880c.a(), this);
    }

    public float c() {
        return this.f21878a;
    }

    public void e() {
        b.k().b(this);
        b.k().i();
        o6.a.p().q();
        this.f21881d.d();
    }

    public void f() {
        o6.a.p().s();
        b.k().j();
        this.f21881d.f();
    }

    @Override // j6.c
    public void a(float f10) {
        this.f21878a = f10;
        Iterator it = a().a().iterator();
        while (it.hasNext()) {
            ((i6.h) it.next()).k().b(f10);
        }
    }

    @Override // k6.d.a
    public void a(boolean z10) {
        if (z10) {
            o6.a.p().q();
        } else {
            o6.a.p().o();
        }
    }
}
