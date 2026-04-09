package r0;

import Y0.n;
import Y0.r;
import Y0.s;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6537m;
import m0.AbstractC6665E0;
import m0.AbstractC6735w0;
import m0.J0;
import o0.InterfaceC7039f;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7551a extends AbstractC7554d {

    /* renamed from: g, reason: collision with root package name */
    private final J0 f59937g;

    /* renamed from: h, reason: collision with root package name */
    private final long f59938h;

    /* renamed from: i, reason: collision with root package name */
    private final long f59939i;

    /* renamed from: j, reason: collision with root package name */
    private int f59940j;

    /* renamed from: k, reason: collision with root package name */
    private final long f59941k;

    /* renamed from: l, reason: collision with root package name */
    private float f59942l;

    /* renamed from: m, reason: collision with root package name */
    private AbstractC6735w0 f59943m;

    public /* synthetic */ C7551a(J0 j02, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j02, j10, j11);
    }

    private final long p(long j10, long j11) {
        if (n.h(j10) < 0 || n.i(j10) < 0 || r.g(j11) < 0 || r.f(j11) < 0 || r.g(j11) > this.f59937g.getWidth() || r.f(j11) > this.f59937g.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j11;
    }

    @Override // r0.AbstractC7554d
    protected boolean a(float f10) {
        this.f59942l = f10;
        return true;
    }

    @Override // r0.AbstractC7554d
    protected boolean e(AbstractC6735w0 abstractC6735w0) {
        this.f59943m = abstractC6735w0;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7551a)) {
            return false;
        }
        C7551a c7551a = (C7551a) obj;
        return AbstractC6492s.d(this.f59937g, c7551a.f59937g) && n.g(this.f59938h, c7551a.f59938h) && r.e(this.f59939i, c7551a.f59939i) && AbstractC6665E0.d(this.f59940j, c7551a.f59940j);
    }

    public int hashCode() {
        return (((((this.f59937g.hashCode() * 31) + n.j(this.f59938h)) * 31) + r.h(this.f59939i)) * 31) + AbstractC6665E0.e(this.f59940j);
    }

    @Override // r0.AbstractC7554d
    public long l() {
        return s.d(this.f59941k);
    }

    @Override // r0.AbstractC7554d
    protected void n(InterfaceC7039f interfaceC7039f) {
        InterfaceC7039f.u1(interfaceC7039f, this.f59937g, this.f59938h, this.f59939i, 0L, s.a(Math.round(C6537m.i(interfaceC7039f.c())), Math.round(C6537m.g(interfaceC7039f.c()))), this.f59942l, null, this.f59943m, 0, this.f59940j, 328, null);
    }

    public final void o(int i10) {
        this.f59940j = i10;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.f59937g + ", srcOffset=" + ((Object) n.m(this.f59938h)) + ", srcSize=" + ((Object) r.i(this.f59939i)) + ", filterQuality=" + ((Object) AbstractC6665E0.f(this.f59940j)) + ')';
    }

    public /* synthetic */ C7551a(J0 j02, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j02, (i10 & 2) != 0 ? n.f24536b.a() : j10, (i10 & 4) != 0 ? s.a(j02.getWidth(), j02.getHeight()) : j11, null);
    }

    private C7551a(J0 j02, long j10, long j11) {
        this.f59937g = j02;
        this.f59938h = j10;
        this.f59939i = j11;
        this.f59940j = AbstractC6665E0.f52788a.a();
        this.f59941k = p(j10, j11);
        this.f59942l = 1.0f;
    }
}
