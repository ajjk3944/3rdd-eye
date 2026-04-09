package d;

import Ii.N;
import Ki.k;
import c.AbstractC4137F;
import c.C4147b;
import mh.InterfaceC6839p;

/* renamed from: d.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5268f extends AbstractC4137F {

    /* renamed from: d, reason: collision with root package name */
    private N f45686d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6839p f45687e;

    /* renamed from: f, reason: collision with root package name */
    private C5267e f45688f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f45689g;

    public C5268f(boolean z10, N n10, InterfaceC6839p interfaceC6839p) {
        super(z10);
        this.f45686d = n10;
        this.f45687e = interfaceC6839p;
    }

    @Override // c.AbstractC4137F
    public void c() {
        super.c();
        C5267e c5267e = this.f45688f;
        if (c5267e != null) {
            c5267e.a();
        }
        C5267e c5267e2 = this.f45688f;
        if (c5267e2 != null) {
            c5267e2.f(false);
        }
        this.f45689g = false;
    }

    @Override // c.AbstractC4137F
    public void d() {
        C5267e c5267e = this.f45688f;
        if (c5267e != null && !c5267e.d()) {
            c5267e.a();
            this.f45688f = null;
        }
        if (this.f45688f == null) {
            this.f45688f = new C5267e(this.f45686d, false, this.f45687e, this);
        }
        C5267e c5267e2 = this.f45688f;
        if (c5267e2 != null) {
            c5267e2.b();
        }
        C5267e c5267e3 = this.f45688f;
        if (c5267e3 != null) {
            c5267e3.f(false);
        }
        this.f45689g = false;
    }

    @Override // c.AbstractC4137F
    public void e(C4147b c4147b) {
        super.e(c4147b);
        C5267e c5267e = this.f45688f;
        if (c5267e != null) {
            k.b(c5267e.e(c4147b));
        }
    }

    @Override // c.AbstractC4137F
    public void f(C4147b c4147b) {
        super.f(c4147b);
        C5267e c5267e = this.f45688f;
        if (c5267e != null) {
            c5267e.a();
        }
        if (g()) {
            this.f45688f = new C5267e(this.f45686d, true, this.f45687e, this);
        }
        this.f45689g = true;
    }

    public final void l(InterfaceC6839p interfaceC6839p) {
        this.f45687e = interfaceC6839p;
    }

    public final void m(boolean z10) {
        C5267e c5267e;
        if (!z10 && !this.f45689g && g() && (c5267e = this.f45688f) != null) {
            c5267e.a();
        }
        j(z10);
    }

    public final void n(N n10) {
        this.f45686d = n10;
    }
}
