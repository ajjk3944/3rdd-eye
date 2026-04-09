package bj;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: bj.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4125h {

    /* renamed from: a, reason: collision with root package name */
    public final o f33446a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33447b;

    public C4125h(o writer) {
        AbstractC6492s.i(writer, "writer");
        this.f33446a = writer;
        this.f33447b = true;
    }

    public final boolean a() {
        return this.f33447b;
    }

    public void b() {
        this.f33447b = true;
    }

    public void c() {
        this.f33447b = false;
    }

    public void d() {
        this.f33447b = false;
    }

    public void e(byte b10) {
        this.f33446a.c(b10);
    }

    public final void f(char c10) {
        this.f33446a.a(c10);
    }

    public void g(double d10) {
        this.f33446a.d(String.valueOf(d10));
    }

    public void h(float f10) {
        this.f33446a.d(String.valueOf(f10));
    }

    public void i(int i10) {
        this.f33446a.c(i10);
    }

    public void j(long j10) {
        this.f33446a.c(j10);
    }

    public final void k(String v10) {
        AbstractC6492s.i(v10, "v");
        this.f33446a.d(v10);
    }

    public void l(short s10) {
        this.f33446a.c(s10);
    }

    public void m(boolean z10) {
        this.f33446a.d(String.valueOf(z10));
    }

    public void n(String value) {
        AbstractC6492s.i(value, "value");
        this.f33446a.b(value);
    }

    protected final void o(boolean z10) {
        this.f33447b = z10;
    }

    public void p() {
    }

    public void q() {
    }
}
