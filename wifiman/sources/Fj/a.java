package Fj;

import Gj.f;
import java.util.Queue;

/* loaded from: classes2.dex */
public class a implements Ej.b {

    /* renamed from: a, reason: collision with root package name */
    String f6728a;

    /* renamed from: b, reason: collision with root package name */
    f f6729b;

    /* renamed from: c, reason: collision with root package name */
    Queue f6730c;

    public a(f fVar, Queue queue) {
        this.f6729b = fVar;
        this.f6728a = fVar.getName();
        this.f6730c = queue;
    }

    private void b(b bVar, Ej.d dVar, String str, Object[] objArr, Throwable th2) {
        d dVar2 = new d();
        dVar2.j(System.currentTimeMillis());
        dVar2.c(bVar);
        dVar2.d(this.f6729b);
        dVar2.e(this.f6728a);
        dVar2.f(dVar);
        dVar2.g(str);
        dVar2.h(Thread.currentThread().getName());
        dVar2.b(objArr);
        dVar2.i(th2);
        this.f6730c.add(dVar2);
    }

    private void e(b bVar, Ej.d dVar, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            b(bVar, dVar, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            b(bVar, dVar, str, new Object[]{obj, obj2}, null);
        }
    }

    private void f(b bVar, Ej.d dVar, String str, Object[] objArr) {
        Throwable thA = Gj.b.a(objArr);
        if (thA != null) {
            b(bVar, dVar, str, Gj.b.b(objArr), thA);
        } else {
            b(bVar, dVar, str, objArr, null);
        }
    }

    private void i(b bVar, Ej.d dVar, String str, Throwable th2) {
        b(bVar, dVar, str, null, th2);
    }

    private void k(b bVar, Ej.d dVar, String str, Object obj) {
        b(bVar, dVar, str, new Object[]{obj}, null);
    }

    @Override // Ej.b
    public void a(String str, Object obj) {
        k(b.WARN, null, str, obj);
    }

    @Override // Ej.b
    public void c(String str, Object obj, Object obj2) {
        e(b.DEBUG, null, str, obj, obj2);
    }

    @Override // Ej.b
    public void d(String str, Object obj) {
        k(b.TRACE, null, str, obj);
    }

    @Override // Ej.b
    public void g(String str, Object obj, Object obj2) {
        e(b.TRACE, null, str, obj, obj2);
    }

    @Override // Ej.b
    public String getName() {
        return this.f6728a;
    }

    @Override // Ej.b
    public void h(String str, Object... objArr) {
        f(b.WARN, null, str, objArr);
    }

    @Override // Ej.b
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // Ej.b
    public void j(String str, Object obj, Object obj2) {
        e(b.WARN, null, str, obj, obj2);
    }

    @Override // Ej.b
    public void l(String str) {
        i(b.DEBUG, null, str, null);
    }

    @Override // Ej.b
    public boolean m() {
        return true;
    }

    @Override // Ej.b
    public void n(String str, Object obj) {
        k(b.DEBUG, null, str, obj);
    }

    @Override // Ej.b
    public void o(String str, Object... objArr) {
        f(b.DEBUG, null, str, objArr);
    }

    @Override // Ej.b
    public void p(String str, Throwable th2) {
        i(b.INFO, null, str, th2);
    }

    @Override // Ej.b
    public void r(String str, Throwable th2) {
        i(b.WARN, null, str, th2);
    }

    @Override // Ej.b
    public void s(String str, Throwable th2) {
        i(b.DEBUG, null, str, th2);
    }

    @Override // Ej.b
    public void t(String str) {
        i(b.WARN, null, str, null);
    }

    @Override // Ej.b
    public void v(String str, Object... objArr) {
        f(b.TRACE, null, str, objArr);
    }
}
