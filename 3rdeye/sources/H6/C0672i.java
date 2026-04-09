package H6;

/* compiled from: BindingContext.kt */
/* renamed from: H6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0672i {

    /* renamed from: a, reason: collision with root package name */
    public final C0675l f2146a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.d f2147b;

    /* renamed from: c, reason: collision with root package name */
    public final p6.h f2148c;

    public C0672i(C0675l c0675l, A7.d dVar, p6.h hVar) {
        this.f2146a = c0675l;
        this.f2147b = dVar;
        this.f2148c = hVar;
    }

    public final C0672i a(A7.d resolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        return kotlin.jvm.internal.l.b(this.f2147b, resolver) ? this : new C0672i(this.f2146a, resolver, this.f2148c);
    }
}
