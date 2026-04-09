package Gj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* loaded from: classes2.dex */
public class f implements Ej.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f7526a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Ej.b f7527b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f7528c;

    /* renamed from: d, reason: collision with root package name */
    private Method f7529d;

    /* renamed from: e, reason: collision with root package name */
    private Fj.a f7530e;

    /* renamed from: f, reason: collision with root package name */
    private Queue f7531f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7532g;

    public f(String str, Queue queue, boolean z10) {
        this.f7526a = str;
        this.f7531f = queue;
        this.f7532g = z10;
    }

    private Ej.b e() {
        if (this.f7530e == null) {
            this.f7530e = new Fj.a(this, this.f7531f);
        }
        return this.f7530e;
    }

    @Override // Ej.b
    public void a(String str, Object obj) {
        b().a(str, obj);
    }

    Ej.b b() {
        return this.f7527b != null ? this.f7527b : this.f7532g ? c.f7525a : e();
    }

    @Override // Ej.b
    public void c(String str, Object obj, Object obj2) {
        b().c(str, obj, obj2);
    }

    @Override // Ej.b
    public void d(String str, Object obj) {
        b().d(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f7526a.equals(((f) obj).f7526a);
    }

    public boolean f() {
        Boolean bool = this.f7528c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f7529d = this.f7527b.getClass().getMethod("log", Fj.c.class);
            this.f7528c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f7528c = Boolean.FALSE;
        }
        return this.f7528c.booleanValue();
    }

    @Override // Ej.b
    public void g(String str, Object obj, Object obj2) {
        b().g(str, obj, obj2);
    }

    @Override // Ej.b
    public String getName() {
        return this.f7526a;
    }

    @Override // Ej.b
    public void h(String str, Object... objArr) {
        b().h(str, objArr);
    }

    public int hashCode() {
        return this.f7526a.hashCode();
    }

    public boolean i() {
        return this.f7527b instanceof c;
    }

    @Override // Ej.b
    public boolean isDebugEnabled() {
        return b().isDebugEnabled();
    }

    @Override // Ej.b
    public void j(String str, Object obj, Object obj2) {
        b().j(str, obj, obj2);
    }

    public boolean k() {
        return this.f7527b == null;
    }

    @Override // Ej.b
    public void l(String str) {
        b().l(str);
    }

    @Override // Ej.b
    public boolean m() {
        return b().m();
    }

    @Override // Ej.b
    public void n(String str, Object obj) {
        b().n(str, obj);
    }

    @Override // Ej.b
    public void o(String str, Object... objArr) {
        b().o(str, objArr);
    }

    @Override // Ej.b
    public void p(String str, Throwable th2) {
        b().p(str, th2);
    }

    public void q(Fj.c cVar) {
        if (f()) {
            try {
                this.f7529d.invoke(this.f7527b, cVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    @Override // Ej.b
    public void r(String str, Throwable th2) {
        b().r(str, th2);
    }

    @Override // Ej.b
    public void s(String str, Throwable th2) {
        b().s(str, th2);
    }

    @Override // Ej.b
    public void t(String str) {
        b().t(str);
    }

    public void u(Ej.b bVar) {
        this.f7527b = bVar;
    }

    @Override // Ej.b
    public void v(String str, Object... objArr) {
        b().v(str, objArr);
    }
}
