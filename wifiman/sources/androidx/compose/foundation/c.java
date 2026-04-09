package androidx.compose.foundation;

import E0.AbstractC2640s;
import E0.h0;
import E0.i0;
import E0.r;
import Y0.t;
import Yg.J;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import l0.C6537m;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.Q0;
import m0.R0;
import m0.c1;
import m0.i1;
import mh.InterfaceC6824a;
import o0.C7043j;
import o0.InterfaceC7036c;
import o0.InterfaceC7039f;

/* loaded from: classes.dex */
final class c extends e.c implements r, h0 {

    /* renamed from: n, reason: collision with root package name */
    private long f27778n;

    /* renamed from: o, reason: collision with root package name */
    private AbstractC6713l0 f27779o;

    /* renamed from: p, reason: collision with root package name */
    private float f27780p;

    /* renamed from: q, reason: collision with root package name */
    private i1 f27781q;

    /* renamed from: r, reason: collision with root package name */
    private long f27782r;

    /* renamed from: s, reason: collision with root package name */
    private t f27783s;

    /* renamed from: t, reason: collision with root package name */
    private Q0 f27784t;

    /* renamed from: u, reason: collision with root package name */
    private i1 f27785u;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f27786a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f27787b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC7036c f27788c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(N n10, c cVar, InterfaceC7036c interfaceC7036c) {
            super(0);
            this.f27786a = n10;
            this.f27787b = cVar;
            this.f27788c = interfaceC7036c;
        }

        public final void a() {
            this.f27786a.f51689a = this.f27787b.G2().a(this.f27788c.c(), this.f27788c.getLayoutDirection(), this.f27788c);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public /* synthetic */ c(long j10, AbstractC6713l0 abstractC6713l0, float f10, i1 i1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, abstractC6713l0, f10, i1Var);
    }

    private final void D2(InterfaceC7036c interfaceC7036c) {
        Q0 q0F2 = F2(interfaceC7036c);
        if (!C6733v0.m(this.f27778n, C6733v0.f52951b.e())) {
            R0.c(interfaceC7036c, q0F2, this.f27778n, (60 & 4) != 0 ? 1.0f : 0.0f, (60 & 8) != 0 ? C7043j.f55038a : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? InterfaceC7039f.f55034d1.a() : 0);
        }
        AbstractC6713l0 abstractC6713l0 = this.f27779o;
        if (abstractC6713l0 != null) {
            R0.b(interfaceC7036c, q0F2, abstractC6713l0, this.f27780p, null, null, 0, 56, null);
        }
    }

    private final void E2(InterfaceC7036c interfaceC7036c) {
        if (!C6733v0.m(this.f27778n, C6733v0.f52951b.e())) {
            InterfaceC7039f.u0(interfaceC7036c, this.f27778n, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        AbstractC6713l0 abstractC6713l0 = this.f27779o;
        if (abstractC6713l0 != null) {
            InterfaceC7039f.l0(interfaceC7036c, abstractC6713l0, 0L, 0L, this.f27780p, null, null, 0, 118, null);
        }
    }

    private final Q0 F2(InterfaceC7036c interfaceC7036c) {
        N n10 = new N();
        if (C6537m.f(interfaceC7036c.c(), this.f27782r) && interfaceC7036c.getLayoutDirection() == this.f27783s && AbstractC6492s.d(this.f27785u, this.f27781q)) {
            Q0 q02 = this.f27784t;
            AbstractC6492s.f(q02);
            n10.f51689a = q02;
        } else {
            i0.a(this, new a(n10, this, interfaceC7036c));
        }
        this.f27784t = (Q0) n10.f51689a;
        this.f27782r = interfaceC7036c.c();
        this.f27783s = interfaceC7036c.getLayoutDirection();
        this.f27785u = this.f27781q;
        Object obj = n10.f51689a;
        AbstractC6492s.f(obj);
        return (Q0) obj;
    }

    public final i1 G2() {
        return this.f27781q;
    }

    public final void H2(AbstractC6713l0 abstractC6713l0) {
        this.f27779o = abstractC6713l0;
    }

    public final void I1(i1 i1Var) {
        this.f27781q = i1Var;
    }

    public final void I2(long j10) {
        this.f27778n = j10;
    }

    @Override // E0.r
    public void J(InterfaceC7036c interfaceC7036c) {
        if (this.f27781q == c1.a()) {
            E2(interfaceC7036c);
        } else {
            D2(interfaceC7036c);
        }
        interfaceC7036c.X1();
    }

    public final void a(float f10) {
        this.f27780p = f10;
    }

    @Override // E0.h0
    public void q1() {
        this.f27782r = C6537m.f52356b.a();
        this.f27783s = null;
        this.f27784t = null;
        this.f27785u = null;
        AbstractC2640s.a(this);
    }

    private c(long j10, AbstractC6713l0 abstractC6713l0, float f10, i1 i1Var) {
        this.f27778n = j10;
        this.f27779o = abstractC6713l0;
        this.f27780p = f10;
        this.f27781q = i1Var;
        this.f27782r = C6537m.f52356b.a();
    }
}
