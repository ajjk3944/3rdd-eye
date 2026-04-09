package androidx.compose.ui.platform;

import java.util.List;

/* renamed from: androidx.compose.ui.platform.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3927i1 implements E0.n0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f29394a;

    /* renamed from: b, reason: collision with root package name */
    private final List f29395b;

    /* renamed from: c, reason: collision with root package name */
    private Float f29396c;

    /* renamed from: d, reason: collision with root package name */
    private Float f29397d;

    /* renamed from: e, reason: collision with root package name */
    private J0.h f29398e;

    /* renamed from: f, reason: collision with root package name */
    private J0.h f29399f;

    public C3927i1(int i10, List list, Float f10, Float f11, J0.h hVar, J0.h hVar2) {
        this.f29394a = i10;
        this.f29395b = list;
        this.f29396c = f10;
        this.f29397d = f11;
        this.f29398e = hVar;
        this.f29399f = hVar2;
    }

    public final J0.h a() {
        return this.f29398e;
    }

    public final Float b() {
        return this.f29396c;
    }

    public final Float c() {
        return this.f29397d;
    }

    public final int d() {
        return this.f29394a;
    }

    public final J0.h e() {
        return this.f29399f;
    }

    public final void f(J0.h hVar) {
        this.f29398e = hVar;
    }

    public final void g(Float f10) {
        this.f29396c = f10;
    }

    public final void h(Float f10) {
        this.f29397d = f10;
    }

    @Override // E0.n0
    public boolean h0() {
        return this.f29395b.contains(this);
    }

    public final void i(J0.h hVar) {
        this.f29399f = hVar;
    }
}
