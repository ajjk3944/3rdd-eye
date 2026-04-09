package m0;

import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: m0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6681Q implements S0 {

    /* renamed from: a, reason: collision with root package name */
    private Paint f52837a;

    /* renamed from: b, reason: collision with root package name */
    private int f52838b;

    /* renamed from: c, reason: collision with root package name */
    private Shader f52839c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC6735w0 f52840d;

    /* renamed from: e, reason: collision with root package name */
    private V0 f52841e;

    public C6681Q(Paint paint) {
        this.f52837a = paint;
        this.f52838b = AbstractC6697d0.f52884a.B();
    }

    @Override // m0.S0
    public void A(float f10) {
        AbstractC6682S.u(this.f52837a, f10);
    }

    @Override // m0.S0
    public void B(V0 v02) {
        AbstractC6682S.q(this.f52837a, v02);
        this.f52841e = v02;
    }

    @Override // m0.S0
    public void C(int i10) {
        AbstractC6682S.p(this.f52837a, i10);
    }

    @Override // m0.S0
    public void D(AbstractC6735w0 abstractC6735w0) {
        this.f52840d = abstractC6735w0;
        AbstractC6682S.o(this.f52837a, abstractC6735w0);
    }

    @Override // m0.S0
    public int E() {
        return AbstractC6682S.e(this.f52837a);
    }

    @Override // m0.S0
    public int F() {
        return AbstractC6682S.f(this.f52837a);
    }

    @Override // m0.S0
    public void G(int i10) {
        AbstractC6682S.t(this.f52837a, i10);
    }

    @Override // m0.S0
    public void H(int i10) {
        AbstractC6682S.w(this.f52837a, i10);
    }

    @Override // m0.S0
    public void I(long j10) {
        AbstractC6682S.n(this.f52837a, j10);
    }

    @Override // m0.S0
    public V0 J() {
        return this.f52841e;
    }

    @Override // m0.S0
    public void K(float f10) {
        AbstractC6682S.v(this.f52837a, f10);
    }

    @Override // m0.S0
    public float L() {
        return AbstractC6682S.i(this.f52837a);
    }

    @Override // m0.S0
    public void a(float f10) {
        AbstractC6682S.k(this.f52837a, f10);
    }

    @Override // m0.S0
    public float b() {
        return AbstractC6682S.c(this.f52837a);
    }

    @Override // m0.S0
    public long c() {
        return AbstractC6682S.d(this.f52837a);
    }

    @Override // m0.S0
    public AbstractC6735w0 p() {
        return this.f52840d;
    }

    @Override // m0.S0
    public int r() {
        return this.f52838b;
    }

    @Override // m0.S0
    public int s() {
        return AbstractC6682S.g(this.f52837a);
    }

    @Override // m0.S0
    public void t(boolean z10) {
        AbstractC6682S.l(this.f52837a, z10);
    }

    @Override // m0.S0
    public void u(int i10) {
        AbstractC6682S.s(this.f52837a, i10);
    }

    @Override // m0.S0
    public void v(int i10) {
        if (AbstractC6697d0.E(this.f52838b, i10)) {
            return;
        }
        this.f52838b = i10;
        AbstractC6682S.m(this.f52837a, i10);
    }

    @Override // m0.S0
    public float w() {
        return AbstractC6682S.h(this.f52837a);
    }

    @Override // m0.S0
    public Paint x() {
        return this.f52837a;
    }

    @Override // m0.S0
    public void y(Shader shader) {
        this.f52839c = shader;
        AbstractC6682S.r(this.f52837a, shader);
    }

    @Override // m0.S0
    public Shader z() {
        return this.f52839c;
    }

    public C6681Q() {
        this(AbstractC6682S.j());
    }
}
