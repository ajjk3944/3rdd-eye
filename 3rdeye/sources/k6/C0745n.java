package K6;

import H6.C0672i;
import H6.C0675l;
import N7.C1175g0;
import android.view.View;
import b9.C1992A;
import j6.g;
import java.util.Iterator;
import java.util.List;
import p9.InterfaceC5480a;

/* compiled from: DivActionBinder.kt */
/* renamed from: K6.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0745n {

    /* renamed from: a, reason: collision with root package name */
    public final j6.h f3536a;

    /* renamed from: b, reason: collision with root package name */
    public final g.a f3537b;

    /* renamed from: c, reason: collision with root package name */
    public final C0719e f3538c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3539d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3540e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3541f;

    /* renamed from: g, reason: collision with root package name */
    public final C0760v f3542g;

    /* compiled from: DivActionBinder.kt */
    /* renamed from: K6.n$a */
    public final class a extends E.u {

        /* renamed from: c, reason: collision with root package name */
        public final C0672i f3543c;

        /* renamed from: d, reason: collision with root package name */
        public final List<C1175g0.a> f3544d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C0745n f3545e;

        /* compiled from: DivActionBinder.kt */
        /* renamed from: K6.n$a$a, reason: collision with other inner class name */
        public static final class C0058a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ C1175g0.a f3546g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ A7.d f3547h;
            public final /* synthetic */ kotlin.jvm.internal.t i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ C0745n f3548j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ C0675l f3549k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0058a(C1175g0.a aVar, A7.d dVar, kotlin.jvm.internal.t tVar, C0745n c0745n, C0675l c0675l, int i) {
                super(0);
                this.f3546g = aVar;
                this.f3547h = dVar;
                this.i = tVar;
                this.f3548j = c0745n;
                this.f3549k = c0675l;
            }

            @Override // p9.InterfaceC5480a
            public final C1992A invoke() {
                C1175g0.a aVar = this.f3546g;
                List<C1175g0> list = aVar.f8265b;
                List<C1175g0> list2 = list;
                List<C1175g0> listG = null;
                if (list2 == null || list2.isEmpty()) {
                    list = null;
                }
                if (list == null) {
                    C1175g0 c1175g0 = aVar.f8264a;
                    if (c1175g0 != null) {
                        listG = E.u.G(c1175g0);
                    }
                } else {
                    listG = list;
                }
                List<C1175g0> list3 = listG;
                if (list3 != null && !list3.isEmpty()) {
                    A7.d dVar = this.f3547h;
                    for (C1175g0 c1175g02 : A9.I.e(listG, dVar)) {
                        C0745n c0745n = this.f3548j;
                        g.a aVar2 = c0745n.f3537b;
                        aVar.f8266c.a(dVar);
                        aVar2.getClass();
                        c0745n.f3538c.b(c1175g02, dVar);
                        C0745n.c(c0745n, this.f3549k, dVar, c1175g02, "menu", null, 48);
                    }
                    this.i.f43657b = true;
                }
                return C1992A.f18074a;
            }
        }

        public a(C0745n c0745n, C0672i context, List<C1175g0.a> items) {
            super(27);
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(items, "items");
            this.f3545e = c0745n;
            this.f3543c = context;
            this.f3544d = items;
        }

        public final void T(o.M m10) {
            C0672i c0672i = this.f3543c;
            C0675l c0675l = c0672i.f2146a;
            androidx.appcompat.view.menu.f fVar = m10.f44569a;
            kotlin.jvm.internal.l.e(fVar, "popupMenu.menu");
            for (C1175g0.a aVar : this.f3544d) {
                int size = fVar.f14436f.size();
                A7.b<String> bVar = aVar.f8266c;
                A7.d dVar = c0672i.f2147b;
                fVar.a(0, 0, 0, bVar.a(dVar)).f14474p = new MenuItemOnMenuItemClickListenerC0743m(c0675l, aVar, dVar, this.f3545e, size);
            }
        }
    }

    /* compiled from: DivActionBinder.kt */
    /* renamed from: K6.n$b */
    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List<C1175g0> f3550g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ A7.d f3551h;
        public final /* synthetic */ String i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ C0745n f3552j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ C0675l f3553k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f3554l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<C1175g0> list, A7.d dVar, String str, C0745n c0745n, C0675l c0675l, View view) {
            super(0);
            this.f3550g = list;
            this.f3551h = dVar;
            this.i = str;
            this.f3552j = c0745n;
            this.f3553k = c0675l;
            this.f3554l = view;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
        @Override // p9.InterfaceC5480a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final b9.C1992A invoke() {
            /*
                Method dump skipped, instructions count: 444
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: K6.C0745n.b.invoke():java.lang.Object");
        }
    }

    public C0745n(j6.h actionHandler, g.a logger, C0719e c0719e, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.l.f(actionHandler, "actionHandler");
        kotlin.jvm.internal.l.f(logger, "logger");
        this.f3536a = actionHandler;
        this.f3537b = logger;
        this.f3538c = c0719e;
        this.f3539d = z10;
        this.f3540e = z11;
        this.f3541f = z12;
        this.f3542g = C0760v.f3652g;
    }

    public static /* synthetic */ void c(C0745n c0745n, j6.y yVar, A7.d dVar, C1175g0 c1175g0, String str, String str2, int i) {
        String str3 = (i & 16) != 0 ? null : str2;
        C0675l c0675l = yVar instanceof C0675l ? (C0675l) yVar : null;
        c0745n.b(yVar, dVar, c1175g0, str, str3, c0675l != null ? c0675l.getActionHandler() : null);
    }

    public final boolean a(j6.y divView, A7.d resolver, C1175g0 action, String str, j6.h hVar) {
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(action, "action");
        if (action.f8254b.a(resolver).booleanValue()) {
            return b(divView, resolver, action, str, null, hVar);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r10.handleActionWithReason(r6, r7, r8, r9, r10) == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(j6.y r5, A7.d r6, N7.C1175g0 r7, java.lang.String r8, java.lang.String r9, j6.h r10) {
        /*
            r4 = this;
            java.lang.String r0 = "divView"
            kotlin.jvm.internal.l.f(r5, r0)
            java.lang.String r0 = "resolver"
            kotlin.jvm.internal.l.f(r6, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.l.f(r7, r0)
            j6.h r0 = r4.f3536a
            boolean r1 = r0.getUseActionUid()
            r2 = 1
            if (r1 == 0) goto L34
            if (r9 == 0) goto L34
            if (r10 == 0) goto L29
            r3 = r7
            r7 = r5
            r5 = r10
            r10 = r8
            r8 = r6
            r6 = r3
            boolean r5 = r5.handleActionWithReason(r6, r7, r8, r9, r10)
            if (r5 != r2) goto L2d
            goto L42
        L29:
            r10 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        L2d:
            j6.h r5 = r4.f3536a
            boolean r5 = r5.handleActionWithReason(r6, r7, r8, r9, r10)
            return r5
        L34:
            r3 = r7
            r7 = r5
            r5 = r10
            r10 = r8
            r8 = r6
            r6 = r3
            if (r5 == 0) goto L43
            boolean r5 = r5.handleActionWithReason(r6, r7, r8, r10)
            if (r5 != r2) goto L43
        L42:
            return r2
        L43:
            boolean r5 = r0.handleActionWithReason(r6, r7, r8, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.C0745n.b(j6.y, A7.d, N7.g0, java.lang.String, java.lang.String, j6.h):boolean");
    }

    public final void d(j6.y divView, A7.d resolver, List list, String str, L l5) {
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (list == null) {
            return;
        }
        for (C1175g0 c1175g0 : A9.I.e(list, resolver)) {
            j6.y yVar = divView;
            A7.d dVar = resolver;
            String str2 = str;
            c(this, yVar, dVar, c1175g0, str2, null, 48);
            if (l5 != null) {
                l5.invoke(c1175g0);
            }
            divView = yVar;
            resolver = dVar;
            str = str2;
        }
    }

    public final void e(C0672i context, View target, List<C1175g0> actions, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(target, "target");
        kotlin.jvm.internal.l.f(actions, "actions");
        A7.d dVar = context.f2147b;
        C0675l c0675l = context.f2146a;
        c0675l.s(new b(actions, dVar, str, this, c0675l, target));
    }

    public final void f(C0672i context, View target, List<C1175g0> actions) {
        Object next;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(target, "target");
        kotlin.jvm.internal.l.f(actions, "actions");
        A7.d dVar = context.f2147b;
        List<C1175g0> listE = A9.I.e(actions, dVar);
        Iterator<T> it = listE.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List<C1175g0.a> list = ((C1175g0) next).f8257e;
            if (list != null && !list.isEmpty()) {
                break;
            }
        }
        C1175g0 c1175g0 = (C1175g0) next;
        if (c1175g0 == null) {
            e(context, target, listE, "click");
            return;
        }
        List<C1175g0.a> list2 = c1175g0.f8257e;
        if (list2 == null) {
            return;
        }
        target.getContext();
        C0675l c0675l = context.f2146a;
        c0675l.v();
        c0675l.J(new A2.l(11));
        this.f3537b.getClass();
        this.f3538c.b(c1175g0, dVar);
        o.M m10 = new o.M(target.getContext(), target, 83);
        androidx.appcompat.view.menu.f fVar = m10.f44569a;
        kotlin.jvm.internal.l.e(fVar, "popupMenu.menu");
        for (C1175g0.a aVar : list2) {
            int size = fVar.f14436f.size();
            fVar.a(0, 0, 0, aVar.f8266c.a(dVar)).f14474p = new MenuItemOnMenuItemClickListenerC0743m(context.f2146a, aVar, dVar, this, size);
        }
        m10.f44571c.d();
    }
}
