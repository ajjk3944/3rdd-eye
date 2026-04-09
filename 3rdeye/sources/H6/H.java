package H6;

import A9.C0575f;
import K6.C0713c;
import N7.C1431y3;
import N7.Z;
import O6.C1482h;
import O6.C1483i;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import b9.C1992A;
import f9.C4351i;
import f9.InterfaceC4347e;
import i7.C4460a;
import java.util.Iterator;
import p7.C5477i;
import p7.InterfaceC5474f;
import p7.InterfaceC5475g;
import q7.C5496b;
import q7.C5497c;

/* compiled from: DivViewCreator.kt */
/* loaded from: classes.dex */
public final class H extends i7.j<View> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2045a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5475g f2046b;

    /* renamed from: c, reason: collision with root package name */
    public final A f2047c;

    /* renamed from: d, reason: collision with root package name */
    public C5477i f2048d;

    /* compiled from: DivViewCreator.kt */
    @h9.e(c = "com.yandex.div.core.view2.DivViewCreator$viewPreCreationProfile$1$1", f = "DivViewCreator.kt", l = {54}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C5477i>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f2049l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C5496b f2050m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f2051n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5496b c5496b, String str, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f2050m = c5496b;
            this.f2051n = str;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f2050m, this.f2051n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C5477i> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Throwable {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f2049l;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            this.f2049l = 1;
            Object objH = C0575f.h(A9.U.f212b, new C5497c(this.f2050m, this.f2051n, null), this);
            return objH == aVar ? aVar : objH;
        }
    }

    public H(Context context, InterfaceC5475g interfaceC5475g, A a10, C5477i viewPreCreationProfile, C5496b c5496b) {
        kotlin.jvm.internal.l.f(viewPreCreationProfile, "viewPreCreationProfile");
        this.f2045a = context;
        this.f2046b = interfaceC5475g;
        this.f2047c = a10;
        String str = viewPreCreationProfile.f45276a;
        if (str != null) {
            C5477i c5477i = (C5477i) C0575f.g(C4351i.f37871b, new a(c5496b, str, null));
            if (c5477i != null) {
                viewPreCreationProfile = c5477i;
            }
        }
        this.f2048d = viewPreCreationProfile;
        final int i = 0;
        interfaceC5475g.m("DIV2.TEXT_VIEW", new InterfaceC5474f(this) { // from class: H6.C

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2036b;

            {
                this.f2036b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i) {
                    case 0:
                        H this$0 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new O6.q(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.k(this$02.f2045a);
                    case 2:
                        H this$03 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new C1482h(this$03.f2045a);
                    default:
                        H this$04 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$04, "this$0");
                        return new O6.D(this$04.f2045a);
                }
            }
        }, viewPreCreationProfile.f45277b.f45251a);
        final int i10 = 3;
        interfaceC5475g.m("DIV2.IMAGE_VIEW", new InterfaceC5474f(this) { // from class: H6.E

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2040b;

            {
                this.f2040b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i10) {
                    case 0:
                        H this$0 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new C1483i(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.t(this$02.f2045a);
                    case 2:
                        H this$03 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new O6.y(this$03.f2045a);
                    default:
                        H this$04 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$04, "this$0");
                        return new O6.n(this$04.f2045a);
                }
            }
        }, viewPreCreationProfile.f45278c.f45251a);
        final int i11 = 0;
        interfaceC5475g.m("DIV2.IMAGE_GIF_VIEW", new InterfaceC5474f(this) { // from class: H6.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2038b;

            {
                this.f2038b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i11) {
                    case 0:
                        H this$0 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new O6.j(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.v(this$02.f2045a);
                    case 2:
                        H this$03 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new O6.s(this$03.f2045a);
                    default:
                        H this$04 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$04, "this$0");
                        return new O6.B(this$04.f2045a);
                }
            }
        }, viewPreCreationProfile.f45279d.f45251a);
        final int i12 = 0;
        interfaceC5475g.m("DIV2.OVERLAP_CONTAINER_VIEW", new InterfaceC5474f(this) { // from class: H6.E

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2040b;

            {
                this.f2040b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i12) {
                    case 0:
                        H this$0 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new C1483i(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.t(this$02.f2045a);
                    case 2:
                        H this$03 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new O6.y(this$03.f2045a);
                    default:
                        H this$04 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$04, "this$0");
                        return new O6.n(this$04.f2045a);
                }
            }
        }, viewPreCreationProfile.f45280e.f45251a);
        final int i13 = 0;
        interfaceC5475g.m("DIV2.LINEAR_CONTAINER_VIEW", new InterfaceC5474f(this) { // from class: H6.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2042b;

            {
                this.f2042b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i13) {
                    case 0:
                        H this$0 = this.f2042b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new O6.r(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2042b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.C(this$02.f2045a);
                    default:
                        H this$03 = this.f2042b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new O6.p(this$03.f2045a);
                }
            }
        }, viewPreCreationProfile.f45281f.f45251a);
        interfaceC5475g.m("DIV2.WRAP_CONTAINER_VIEW", new G(this, 0), viewPreCreationProfile.f45282g.f45251a);
        final int i14 = 1;
        interfaceC5475g.m("DIV2.GRID_VIEW", new InterfaceC5474f(this) { // from class: H6.C

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2036b;

            {
                this.f2036b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i14) {
                    case 0:
                        H this$0 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new O6.q(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.k(this$02.f2045a);
                    case 2:
                        H this$03 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new C1482h(this$03.f2045a);
                    default:
                        H this$04 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$04, "this$0");
                        return new O6.D(this$04.f2045a);
                }
            }
        }, viewPreCreationProfile.f45283h.f45251a);
        final int i15 = 1;
        interfaceC5475g.m("DIV2.GALLERY_VIEW", new InterfaceC5474f(this) { // from class: H6.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2038b;

            {
                this.f2038b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i15) {
                    case 0:
                        H this$0 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new O6.j(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.v(this$02.f2045a);
                    case 2:
                        H this$03 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new O6.s(this$03.f2045a);
                    default:
                        H this$04 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$04, "this$0");
                        return new O6.B(this$04.f2045a);
                }
            }
        }, viewPreCreationProfile.i.f45251a);
        final int i16 = 1;
        interfaceC5475g.m("DIV2.PAGER_VIEW", new InterfaceC5474f(this) { // from class: H6.E

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2040b;

            {
                this.f2040b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i16) {
                    case 0:
                        H this$0 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new C1483i(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.t(this$02.f2045a);
                    case 2:
                        H this$03 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new O6.y(this$03.f2045a);
                    default:
                        H this$04 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$04, "this$0");
                        return new O6.n(this$04.f2045a);
                }
            }
        }, viewPreCreationProfile.f45284j.f45251a);
        final int i17 = 1;
        interfaceC5475g.m("DIV2.TAB_VIEW", new InterfaceC5474f(this) { // from class: H6.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2042b;

            {
                this.f2042b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i17) {
                    case 0:
                        H this$0 = this.f2042b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new O6.r(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2042b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.C(this$02.f2045a);
                    default:
                        H this$03 = this.f2042b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new O6.p(this$03.f2045a);
                }
            }
        }, viewPreCreationProfile.f45285k.f45251a);
        interfaceC5475g.m("DIV2.STATE", new G(this, 1), viewPreCreationProfile.f45286l.f45251a);
        final int i18 = 2;
        interfaceC5475g.m("DIV2.CUSTOM", new InterfaceC5474f(this) { // from class: H6.C

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2036b;

            {
                this.f2036b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i18) {
                    case 0:
                        H this$0 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new O6.q(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.k(this$02.f2045a);
                    case 2:
                        H this$03 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new C1482h(this$03.f2045a);
                    default:
                        H this$04 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$04, "this$0");
                        return new O6.D(this$04.f2045a);
                }
            }
        }, viewPreCreationProfile.f45287m.f45251a);
        final int i19 = 2;
        interfaceC5475g.m("DIV2.INDICATOR", new InterfaceC5474f(this) { // from class: H6.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2038b;

            {
                this.f2038b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i19) {
                    case 0:
                        H this$0 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new O6.j(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.v(this$02.f2045a);
                    case 2:
                        H this$03 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new O6.s(this$03.f2045a);
                    default:
                        H this$04 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$04, "this$0");
                        return new O6.B(this$04.f2045a);
                }
            }
        }, viewPreCreationProfile.f45288n.f45251a);
        final int i20 = 2;
        interfaceC5475g.m("DIV2.SLIDER", new InterfaceC5474f(this) { // from class: H6.E

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2040b;

            {
                this.f2040b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i20) {
                    case 0:
                        H this$0 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new C1483i(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.t(this$02.f2045a);
                    case 2:
                        H this$03 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new O6.y(this$03.f2045a);
                    default:
                        H this$04 = this.f2040b;
                        kotlin.jvm.internal.l.f(this$04, "this$0");
                        return new O6.n(this$04.f2045a);
                }
            }
        }, viewPreCreationProfile.f45289o.f45251a);
        final int i21 = 2;
        interfaceC5475g.m("DIV2.INPUT", new InterfaceC5474f(this) { // from class: H6.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2042b;

            {
                this.f2042b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i21) {
                    case 0:
                        H this$0 = this.f2042b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new O6.r(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2042b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.C(this$02.f2045a);
                    default:
                        H this$03 = this.f2042b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new O6.p(this$03.f2045a);
                }
            }
        }, viewPreCreationProfile.f45290p.f45251a);
        interfaceC5475g.m("DIV2.SELECT", new G(this, 2), viewPreCreationProfile.f45291q.f45251a);
        final int i22 = 3;
        interfaceC5475g.m("DIV2.VIDEO", new InterfaceC5474f(this) { // from class: H6.C

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2036b;

            {
                this.f2036b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i22) {
                    case 0:
                        H this$0 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new O6.q(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.k(this$02.f2045a);
                    case 2:
                        H this$03 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new C1482h(this$03.f2045a);
                    default:
                        H this$04 = this.f2036b;
                        kotlin.jvm.internal.l.f(this$04, "this$0");
                        return new O6.D(this$04.f2045a);
                }
            }
        }, viewPreCreationProfile.f45292r.f45251a);
        final int i23 = 3;
        interfaceC5475g.m("DIV2.SWITCH", new InterfaceC5474f(this) { // from class: H6.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2038b;

            {
                this.f2038b = this;
            }

            @Override // p7.InterfaceC5474f
            public final View a() {
                switch (i23) {
                    case 0:
                        H this$0 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$0, "this$0");
                        return new O6.j(this$0.f2045a);
                    case 1:
                        H this$02 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$02, "this$0");
                        return new O6.v(this$02.f2045a);
                    case 2:
                        H this$03 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$03, "this$0");
                        return new O6.s(this$03.f2045a);
                    default:
                        H this$04 = this.f2038b;
                        kotlin.jvm.internal.l.f(this$04, "this$0");
                        return new O6.B(this$04.f2045a);
                }
            }
        }, viewPreCreationProfile.f45293s.f45251a);
    }

    @Override // i7.j
    public final View f(Z.e data, A7.d dVar) {
        kotlin.jvm.internal.l.f(data, "data");
        ViewGroup viewGroup = (ViewGroup) a(data, dVar);
        Iterator<T> it = C4460a.i(data.f7817c).iterator();
        while (it.hasNext()) {
            viewGroup.addView(o((Z) it.next(), dVar));
        }
        return viewGroup;
    }

    @Override // i7.j
    public final View i(Z.k data, A7.d dVar) {
        kotlin.jvm.internal.l.f(data, "data");
        return new O6.x(this.f2045a);
    }

    public final View o(Z div, A7.d resolver) {
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (!this.f2047c.n(div, resolver).booleanValue()) {
            return new Space(this.f2045a);
        }
        View viewN = n(div, resolver);
        viewN.setBackground(P6.a.f10657a);
        return viewN;
    }

    @Override // i7.j
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final View a(Z data, A7.d resolver) {
        String str;
        kotlin.jvm.internal.l.f(data, "data");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (data instanceof Z.a) {
            C1431y3 c1431y3 = ((Z.a) data).f7813c;
            str = C0713c.T(c1431y3, resolver) ? "DIV2.WRAP_CONTAINER_VIEW" : c1431y3.f9830G.a(resolver) == C1431y3.b.OVERLAP ? "DIV2.OVERLAP_CONTAINER_VIEW" : "DIV2.LINEAR_CONTAINER_VIEW";
        } else if (data instanceof Z.b) {
            str = "DIV2.CUSTOM";
        } else if (data instanceof Z.c) {
            str = "DIV2.GALLERY_VIEW";
        } else if (data instanceof Z.d) {
            str = "DIV2.IMAGE_GIF_VIEW";
        } else if (data instanceof Z.e) {
            str = "DIV2.GRID_VIEW";
        } else if (data instanceof Z.f) {
            str = "DIV2.IMAGE_VIEW";
        } else if (data instanceof Z.g) {
            str = "DIV2.INDICATOR";
        } else if (data instanceof Z.h) {
            str = "DIV2.INPUT";
        } else if (data instanceof Z.i) {
            str = "DIV2.PAGER_VIEW";
        } else if (data instanceof Z.j) {
            str = "DIV2.SELECT";
        } else if (data instanceof Z.l) {
            str = "DIV2.SLIDER";
        } else if (data instanceof Z.n) {
            str = "DIV2.SWITCH";
        } else if (data instanceof Z.m) {
            str = "DIV2.STATE";
        } else if (data instanceof Z.o) {
            str = "DIV2.TAB_VIEW";
        } else if (data instanceof Z.p) {
            str = "DIV2.TEXT_VIEW";
        } else if (data instanceof Z.q) {
            str = "DIV2.VIDEO";
        } else {
            if (!(data instanceof Z.k)) {
                throw new b9.j();
            }
            str = "";
        }
        return this.f2046b.d(str);
    }
}
