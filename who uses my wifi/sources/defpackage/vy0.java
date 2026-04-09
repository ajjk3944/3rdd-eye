package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Instant;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vy0 implements i80 {
    public final String f;
    public volatile i80 g;
    public Boolean h;
    public Method i;
    public t83 j;
    public final Queue k;
    public final boolean l;

    public vy0(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f = str;
        this.k = linkedBlockingQueue;
        this.l = z;
    }

    public final i80 a() {
        if (this.g != null) {
            return this.g;
        }
        if (this.l) {
            return vf0.f;
        }
        if (this.j == null) {
            Queue queue = this.k;
            t83 t83Var = new t83(6, false);
            t83Var.h = this;
            t83Var.g = this.f;
            t83Var.i = queue;
            this.j = t83Var;
        }
        return this.j;
    }

    public final boolean b() {
        Boolean bool = this.h;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.i = this.g.getClass().getMethod("log", xy0.class);
            this.h = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.h = Boolean.FALSE;
        }
        return this.h.booleanValue();
    }

    @Override // defpackage.i80
    public final void e(String str, Object... objArr) {
        a().e(str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && vy0.class == obj.getClass() && this.f.equals(((vy0) obj).f);
    }

    @Override // defpackage.i80
    public final void f(String str, Object obj, Object obj2) {
        a().f(str, obj, obj2);
    }

    @Override // defpackage.i80
    public final void g(Instant instant) {
        a().g(instant);
    }

    @Override // defpackage.i80
    public final String getName() {
        return this.f;
    }

    @Override // defpackage.i80
    public final boolean h() {
        return a().h();
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.i80
    public final void i(Integer num) {
        a().i(num);
    }

    @Override // defpackage.i80
    public final void j(String str, Object obj, Object obj2) {
        a().j(str, obj, obj2);
    }

    @Override // defpackage.i80
    public final void k(String str, Object... objArr) {
        a().k(str, objArr);
    }

    @Override // defpackage.i80
    public final void l(String str) {
        a().l(str);
    }

    @Override // defpackage.i80
    public final void m(Object obj, String str) {
        a().m(obj, str);
    }

    @Override // defpackage.i80
    public final void n(String str, Object... objArr) {
        a().n(str, objArr);
    }

    @Override // defpackage.i80
    public final void o(Object obj, String str) {
        a().o(obj, str);
    }

    @Override // defpackage.i80
    public final void p(String str, Exception exc) {
        a().p(str, exc);
    }

    @Override // defpackage.i80
    public final void r(String str) {
        a().r(str);
    }

    @Override // defpackage.i80
    public final boolean s() {
        return a().s();
    }

    @Override // defpackage.i80
    public final void t(IOException iOException) {
        a().t(iOException);
    }

    @Override // defpackage.i80
    public final void u(IOException iOException) {
        a().u(iOException);
    }
}
