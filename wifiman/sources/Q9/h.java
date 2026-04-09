package Q9;

import Ii.N;
import Li.AbstractC3222i;
import Q9.h;
import Q9.j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.H0;
import T.InterfaceC3540l;
import T.L0;
import Yg.J;
import Yg.v;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.P;
import c2.AbstractC4197c;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f2.C5501G;
import f2.C5512k;
import f2.n;
import f2.w;
import f2.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f19253a = AbstractC3561w.f(new InterfaceC6824a() { // from class: Q9.b
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return h.f();
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private static final H0 f19254b = AbstractC3561w.f(new InterfaceC6824a() { // from class: Q9.c
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return h.e();
        }
    });

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f19255a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19256b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f19257c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f19258d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f19259e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f19260f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f19261g;

        /* renamed from: Q9.h$a$a, reason: collision with other inner class name */
        static final class C0676a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f19262a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f19263b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ w f19264c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f19265d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Activity f19266e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f19267f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0676a(w wVar, InterfaceC6824a interfaceC6824a, Activity activity, String str, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f19264c = wVar;
                this.f19265d = interfaceC6824a;
                this.f19266e = activity;
                this.f19267f = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J E(C5501G c5501g) {
                c5501g.c(true);
                return J.f24997a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J v(String str, z zVar) {
                zVar.d(str, new InterfaceC6835l() { // from class: Q9.g
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return h.a.C0676a.E((C5501G) obj);
                    }
                });
                return J.f24997a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C0676a c0676a = new C0676a(this.f19264c, this.f19265d, this.f19266e, this.f19267f, interfaceC5380e);
                c0676a.f19263b = obj;
                return c0676a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                AbstractC5467b.g();
                if (this.f19262a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                j.a aVar = (j.a) this.f19263b;
                if (aVar instanceof j.a.C0677a) {
                    if (!this.f19264c.Z()) {
                        this.f19265d.invoke();
                    }
                } else if (aVar instanceof j.a.c) {
                    j.a.c cVar = (j.a.c) aVar;
                    i.b(this.f19264c, cVar.a(), cVar.b());
                    if (!this.f19264c.Z()) {
                        this.f19265d.invoke();
                    }
                } else if (aVar instanceof j.a.d) {
                    n.W(this.f19264c, ((j.a.d) aVar).a().a(), null, null, 6, null);
                } else if (aVar instanceof j.a.b) {
                    j.a.b bVar = (j.a.b) aVar;
                    if (!n.d0(this.f19264c, bVar.a().a(), false, false, 4, null)) {
                        w wVar = this.f19264c;
                        String strA = bVar.a().a();
                        final String str = this.f19267f;
                        wVar.V(strA, new InterfaceC6835l() { // from class: Q9.f
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj2) {
                                return h.a.C0676a.v(str, (z) obj2);
                            }
                        });
                    }
                } else {
                    if (!(aVar instanceof j.a.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f19266e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((j.a.e) aVar).a())));
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.a aVar, InterfaceC5380e interfaceC5380e) {
                return ((C0676a) create(aVar, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, w wVar, InterfaceC6824a interfaceC6824a, Activity activity, String str, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f19257c = jVar;
            this.f19258d = wVar;
            this.f19259e = interfaceC6824a;
            this.f19260f = activity;
            this.f19261g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f19257c, this.f19258d, this.f19259e, this.f19260f, this.f19261g, interfaceC5380e);
            aVar.f19256b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f19255a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            AbstractC3222i.D(AbstractC3222i.I(this.f19257c.a(), new C0676a(this.f19258d, this.f19259e, this.f19260f, this.f19261g, null)), (N) this.f19256b);
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f19268a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f19269b;

        b(q qVar, w wVar) {
            this.f19268a = qVar;
            this.f19269b = wVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1319861922, i10, -1, "com.ui.core.ui.sso.arch.routing.Navigation.<anonymous> (Navigation.kt:71)");
            }
            this.f19268a.s(this.f19269b, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j e() {
        throw new IllegalStateException("No view router set");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final R9.f f() {
        throw new IllegalStateException("No vm provider set");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(final android.app.Activity r17, final mh.InterfaceC6824a r18, final java.lang.String r19, mh.InterfaceC6824a r20, f2.w r21, final mh.q r22, T.InterfaceC3540l r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q9.h.g(android.app.Activity, mh.a, java.lang.String, mh.a, f2.w, mh.q, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(Activity activity) {
        activity.onBackPressed();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(Activity activity, InterfaceC6824a interfaceC6824a, String str, InterfaceC6824a interfaceC6824a2, w wVar, q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        g(activity, interfaceC6824a, str, interfaceC6824a2, wVar, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final H0 j() {
        return f19254b;
    }

    public static final H0 k() {
        return f19253a;
    }

    public static final R9.a l(C5512k c5512k, Class modelClass, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(c5512k, "<this>");
        AbstractC6492s.i(modelClass, "modelClass");
        interfaceC3540l.U(1940515227);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1940515227, i10, -1, "com.ui.core.ui.sso.arch.routing.vm (Navigation.kt:81)");
        }
        R9.a aVarM = m(modelClass, c5512k.d(), c5512k.O(), interfaceC3540l, (i10 >> 3) & 14, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return aVarM;
    }

    public static final R9.a m(Class modelClass, Bundle bundle, AbstractC4013k lifecycle, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(lifecycle, "lifecycle");
        interfaceC3540l.U(-886646653);
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-886646653, i10, -1, "com.ui.core.ui.sso.arch.routing.vm (Navigation.kt:94)");
        }
        InterfaceC6839p interfaceC6839pA = ((R9.f) interfaceC3540l.t(f19253a)).a();
        Object objT = interfaceC3540l.t(AndroidCompositionLocals_androidKt.j());
        if (bundle == null) {
            bundle = new Bundle();
        }
        R9.a aVar = (R9.a) AbstractC4197c.b(modelClass, null, null, (P.c) interfaceC6839pA.invoke(objT, bundle), null, interfaceC3540l, i10 & 14, 22);
        R9.e.d(aVar, lifecycle, interfaceC3540l, (i10 >> 3) & 112);
        R9.e.g(aVar, interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return aVar;
    }
}
