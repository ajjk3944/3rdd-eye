package com.ui.core.ui.sso;

import Ii.N;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.O;
import U9.C3621h;
import U9.y;
import Yg.J;
import Yg.v;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.d;
import androidx.compose.ui.platform.C3929j0;
import androidx.fragment.app.AbstractActivityC3999j;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.P;
import com.ui.core.ui.sso.UiSSO;
import com.ui.core.ui.sso.a;
import com.ui.core.ui.sso.d;
import com.ui.core.ui.sso.login.g;
import com.ui.sso.api.UiAccountApi;
import da.AbstractC5324f;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f2.AbstractC5498D;
import f2.C5512k;
import f2.u;
import f2.w;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import mh.r;
import org.snmp4j.util.SnmpConfigurator;
import q.InterfaceC7383b;
import q2.InterfaceC7418f;
import s.AbstractC7852m;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002,-B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ+\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\r\u0010\tJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/ui/core/ui/sso/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "T", "Ljava/lang/Class;", "clazz", "I1", "(Ljava/lang/Class;)Ljava/lang/Object;", "containerFragmentClass", "K1", "activityClass", "J1", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "s0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/ui/core/ui/sso/UiSSO$f;", "O1", "()Lcom/ui/core/ui/sso/UiSSO$f;", "screen", "Lcom/ui/core/ui/sso/UiSSO$c;", "L1", "()Lcom/ui/core/ui/sso/UiSSO$c;", "entryPoint", "", "M1", "()Z", "hasToolbar", "Lcom/ui/core/ui/sso/d$b;", "N1", "()Lcom/ui/core/ui/sso/d$b;", "host", "Lcom/ui/core/ui/sso/UiSSO$g;", "P1", "()Lcom/ui/core/ui/sso/UiSSO$g;", "theme", "t1", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTH_PROTOCOL, "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends Fragment {

    /* renamed from: t1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: com.ui.core.ui.sso.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(UiSSO.f screen, Bundle bundle) {
            AbstractC6492s.i(screen, "screen");
            d dVar = new d();
            if (bundle == null) {
                bundle = A1.d.a();
            }
            bundle.putParcelable("screen", screen);
            dVar.v1(bundle);
            return dVar;
        }

        private Companion() {
        }
    }

    public interface b {
        P9.k A();

        void C();

        void H();

        void w(UiSSO.a aVar);
    }

    static final class c implements InterfaceC6839p {

        public static final class a extends Q9.a {
            a() {
            }
        }

        static final class b implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f41430a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f41431b;

            static final class a implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f41432a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ w f41433b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f41434c;

                /* renamed from: com.ui.core.ui.sso.d$c$b$a$a, reason: collision with other inner class name */
                static final class C1315a implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ w f41435a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ String f41436b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ d f41437c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ SSOAccountVM f41438d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ C3621h f41439e;

                    /* renamed from: com.ui.core.ui.sso.d$c$b$a$a$a, reason: collision with other inner class name */
                    static final class C1316a implements r {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ d f41440a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SSOAccountVM f41441b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ w f41442c;

                        C1316a(d dVar, SSOAccountVM sSOAccountVM, w wVar) {
                            this.f41440a = dVar;
                            this.f41441b = sSOAccountVM;
                            this.f41442c = wVar;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final J e(SSOAccountVM sSOAccountVM, w wVar, g.a.b mfaEvent) throws Resources.NotFoundException {
                            AbstractC6492s.i(mfaEvent, "mfaEvent");
                            sSOAccountVM.v0(mfaEvent.a(), mfaEvent.b());
                            f2.n.W(wVar, a.b.f41413a.a(), null, null, 6, null);
                            return J.f24997a;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final J f(d dVar) {
                            dVar.N1().C();
                            return J.f24997a;
                        }

                        public final void c(InterfaceC7383b composable, C5512k it, InterfaceC3540l interfaceC3540l, int i10) {
                            AbstractC6492s.i(composable, "$this$composable");
                            AbstractC6492s.i(it, "it");
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.Q(-531049465, i10, -1, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:134)");
                            }
                            d dVar = this.f41440a;
                            SSOAccountVM sSOAccountVM = this.f41441b;
                            interfaceC3540l.U(-434745981);
                            boolean zL = interfaceC3540l.l(this.f41441b) | interfaceC3540l.l(this.f41442c);
                            final SSOAccountVM sSOAccountVM2 = this.f41441b;
                            final w wVar = this.f41442c;
                            Object objF = interfaceC3540l.f();
                            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                                objF = new InterfaceC6835l() { // from class: com.ui.core.ui.sso.j
                                    @Override // mh.InterfaceC6835l
                                    public final Object invoke(Object obj) {
                                        return d.c.b.a.C1315a.C1316a.e(sSOAccountVM2, wVar, (g.a.b) obj);
                                    }
                                };
                                interfaceC3540l.K(objF);
                            }
                            InterfaceC6835l interfaceC6835l = (InterfaceC6835l) objF;
                            interfaceC3540l.J();
                            boolean zM1 = this.f41440a.M1();
                            boolean z10 = this.f41440a.L1() == UiSSO.c.LOGIN;
                            Bundle bundleQ = this.f41440a.q();
                            String string = bundleQ != null ? bundleQ.getString("login_extra_button_label") : null;
                            interfaceC3540l.U(-434726481);
                            boolean zT = interfaceC3540l.T(this.f41440a);
                            final d dVar2 = this.f41440a;
                            Object objF2 = interfaceC3540l.f();
                            if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
                                objF2 = new InterfaceC6824a() { // from class: com.ui.core.ui.sso.k
                                    @Override // mh.InterfaceC6824a
                                    public final Object invoke() {
                                        return d.c.b.a.C1315a.C1316a.f(dVar2);
                                    }
                                };
                                interfaceC3540l.K(objF2);
                            }
                            interfaceC3540l.J();
                            com.ui.core.ui.sso.login.b.c(dVar, sSOAccountVM, interfaceC6835l, zM1, z10, string, (InterfaceC6824a) objF2, interfaceC3540l, 0, 0);
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.P();
                            }
                        }

                        @Override // mh.r
                        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                            c((InterfaceC7383b) obj, (C5512k) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                            return J.f24997a;
                        }
                    }

                    /* renamed from: com.ui.core.ui.sso.d$c$b$a$a$b, reason: collision with other inner class name */
                    static final class C1317b implements r {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ d f41443a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SSOAccountVM f41444b;

                        C1317b(d dVar, SSOAccountVM sSOAccountVM) {
                            this.f41443a = dVar;
                            this.f41444b = sSOAccountVM;
                        }

                        public final void a(InterfaceC7383b composable, C5512k it, InterfaceC3540l interfaceC3540l, int i10) {
                            AbstractC6492s.i(composable, "$this$composable");
                            AbstractC6492s.i(it, "it");
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.Q(279350320, i10, -1, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:152)");
                            }
                            ba.d.c(this.f41443a, this.f41444b, interfaceC3540l, 0);
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.P();
                            }
                        }

                        @Override // mh.r
                        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                            a((InterfaceC7383b) obj, (C5512k) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                            return J.f24997a;
                        }
                    }

                    /* renamed from: com.ui.core.ui.sso.d$c$b$a$a$c, reason: collision with other inner class name */
                    static final class C1318c implements r {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ d f41445a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SSOAccountVM f41446b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ C3621h f41447c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ w f41448d;

                        C1318c(d dVar, SSOAccountVM sSOAccountVM, C3621h c3621h, w wVar) {
                            this.f41445a = dVar;
                            this.f41446b = sSOAccountVM;
                            this.f41447c = c3621h;
                            this.f41448d = wVar;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final J e(w wVar) throws Resources.NotFoundException {
                            f2.n.W(wVar, a.c.f41415a.a(), null, null, 6, null);
                            return J.f24997a;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final J f(SSOAccountVM sSOAccountVM, w wVar, UiSSO.a authResponse) throws Resources.NotFoundException {
                            AbstractC6492s.i(authResponse, "authResponse");
                            sSOAccountVM.u0(authResponse);
                            f2.n.W(wVar, a.e.f41419a.a(), null, null, 6, null);
                            return J.f24997a;
                        }

                        public final void c(InterfaceC7383b composable, C5512k it, InterfaceC3540l interfaceC3540l, int i10) {
                            AbstractC6492s.i(composable, "$this$composable");
                            AbstractC6492s.i(it, "it");
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.Q(137070479, i10, -1, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:156)");
                            }
                            d dVar = this.f41445a;
                            SSOAccountVM sSOAccountVM = this.f41446b;
                            C3621h c3621h = this.f41447c;
                            interfaceC3540l.U(-434699436);
                            boolean zL = interfaceC3540l.l(this.f41448d);
                            final w wVar = this.f41448d;
                            Object objF = interfaceC3540l.f();
                            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                                objF = new InterfaceC6824a() { // from class: com.ui.core.ui.sso.l
                                    @Override // mh.InterfaceC6824a
                                    public final Object invoke() {
                                        return d.c.b.a.C1315a.C1318c.e(wVar);
                                    }
                                };
                                interfaceC3540l.K(objF);
                            }
                            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF;
                            interfaceC3540l.J();
                            interfaceC3540l.U(-434694753);
                            boolean zL2 = interfaceC3540l.l(this.f41446b) | interfaceC3540l.l(this.f41448d);
                            final SSOAccountVM sSOAccountVM2 = this.f41446b;
                            final w wVar2 = this.f41448d;
                            Object objF2 = interfaceC3540l.f();
                            if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                                objF2 = new InterfaceC6835l() { // from class: com.ui.core.ui.sso.m
                                    @Override // mh.InterfaceC6835l
                                    public final Object invoke(Object obj) {
                                        return d.c.b.a.C1315a.C1318c.f(sSOAccountVM2, wVar2, (UiSSO.a) obj);
                                    }
                                };
                                interfaceC3540l.K(objF2);
                            }
                            interfaceC3540l.J();
                            y.C(dVar, sSOAccountVM, c3621h, interfaceC6824a, (InterfaceC6835l) objF2, interfaceC3540l, 0);
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.P();
                            }
                        }

                        @Override // mh.r
                        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                            c((InterfaceC7383b) obj, (C5512k) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                            return J.f24997a;
                        }
                    }

                    /* renamed from: com.ui.core.ui.sso.d$c$b$a$a$d, reason: collision with other inner class name */
                    static final class C1319d implements r {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ d f41449a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SSOAccountVM f41450b;

                        C1319d(d dVar, SSOAccountVM sSOAccountVM) {
                            this.f41449a = dVar;
                            this.f41450b = sSOAccountVM;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final J c(d dVar) {
                            dVar.N1().H();
                            return J.f24997a;
                        }

                        public final void b(InterfaceC7383b composable, C5512k it, InterfaceC3540l interfaceC3540l, int i10) {
                            AbstractC6492s.i(composable, "$this$composable");
                            AbstractC6492s.i(it, "it");
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.Q(-5209362, i10, -1, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:172)");
                            }
                            d dVar = this.f41449a;
                            SSOAccountVM sSOAccountVM = this.f41450b;
                            boolean zM1 = dVar.M1();
                            boolean z10 = this.f41449a.L1() == UiSSO.c.REGISTER;
                            Bundle bundleQ = this.f41449a.q();
                            String string = bundleQ != null ? bundleQ.getString("login_extra_button_label") : null;
                            interfaceC3540l.U(-434659950);
                            boolean zT = interfaceC3540l.T(this.f41449a);
                            final d dVar2 = this.f41449a;
                            Object objF = interfaceC3540l.f();
                            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                                objF = new InterfaceC6824a() { // from class: com.ui.core.ui.sso.n
                                    @Override // mh.InterfaceC6824a
                                    public final Object invoke() {
                                        return d.c.b.a.C1315a.C1319d.c(dVar2);
                                    }
                                };
                                interfaceC3540l.K(objF);
                            }
                            interfaceC3540l.J();
                            AbstractC5324f.c(dVar, sSOAccountVM, zM1, z10, string, (InterfaceC6824a) objF, interfaceC3540l, 0, 0);
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.P();
                            }
                        }

                        @Override // mh.r
                        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                            b((InterfaceC7383b) obj, (C5512k) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                            return J.f24997a;
                        }
                    }

                    /* renamed from: com.ui.core.ui.sso.d$c$b$a$a$e */
                    static final class e implements r {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ d f41451a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SSOAccountVM f41452b;

                        e(d dVar, SSOAccountVM sSOAccountVM) {
                            this.f41451a = dVar;
                            this.f41452b = sSOAccountVM;
                        }

                        public final void a(InterfaceC7383b composable, C5512k it, InterfaceC3540l interfaceC3540l, int i10) {
                            AbstractC6492s.i(composable, "$this$composable");
                            AbstractC6492s.i(it, "it");
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.Q(-147489203, i10, -1, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:186)");
                            }
                            fa.d.c(this.f41451a, this.f41452b, interfaceC3540l, 0);
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.P();
                            }
                        }

                        @Override // mh.r
                        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                            a((InterfaceC7383b) obj, (C5512k) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                            return J.f24997a;
                        }
                    }

                    C1315a(w wVar, String str, d dVar, SSOAccountVM sSOAccountVM, C3621h c3621h) {
                        this.f41435a = wVar;
                        this.f41436b = str;
                        this.f41437c = dVar;
                        this.f41438d = sSOAccountVM;
                        this.f41439e = c3621h;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final J f(d dVar, SSOAccountVM sSOAccountVM, w wVar, C3621h c3621h, u NavHost) {
                        AbstractC6492s.i(NavHost, "$this$NavHost");
                        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: com.ui.core.ui.sso.h
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return d.c.b.a.C1315a.h((androidx.compose.animation.d) obj);
                            }
                        };
                        InterfaceC6835l interfaceC6835l2 = new InterfaceC6835l() { // from class: com.ui.core.ui.sso.i
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return d.c.b.a.C1315a.i((androidx.compose.animation.d) obj);
                            }
                        };
                        g2.k.b(NavHost, a.C1314a.f41411a.a(), null, null, null, null, null, null, null, b0.c.c(-531049465, true, new C1316a(dVar, sSOAccountVM, wVar)), 254, null);
                        g2.k.b(NavHost, a.d.f41417a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, b0.c.c(279350320, true, new C1317b(dVar, sSOAccountVM)), 230, null);
                        g2.k.b(NavHost, a.b.f41413a.a(), null, null, null, null, null, null, null, b0.c.c(137070479, true, new C1318c(dVar, sSOAccountVM, c3621h, wVar)), 254, null);
                        g2.k.b(NavHost, a.c.f41415a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, b0.c.c(-5209362, true, new C1319d(dVar, sSOAccountVM)), 230, null);
                        g2.k.b(NavHost, a.e.f41419a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, b0.c.c(-147489203, true, new e(dVar, sSOAccountVM)), 230, null);
                        return J.f24997a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final androidx.compose.animation.i h(androidx.compose.animation.d dVar) {
                        AbstractC6492s.i(dVar, "<this>");
                        return androidx.compose.animation.d.c(dVar, d.a.f27532a.c(), null, null, 6, null);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final androidx.compose.animation.k i(androidx.compose.animation.d dVar) {
                        AbstractC6492s.i(dVar, "<this>");
                        return androidx.compose.animation.d.a(dVar, d.a.f27532a.d(), null, null, 6, null);
                    }

                    public final void e(InterfaceC3540l interfaceC3540l, int i10) {
                        if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                            interfaceC3540l.C();
                            return;
                        }
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(-1615279862, i10, -1, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:125)");
                        }
                        w wVar = this.f41435a;
                        String str = this.f41436b;
                        interfaceC3540l.U(773334553);
                        boolean zT = interfaceC3540l.T(this.f41437c) | interfaceC3540l.l(this.f41438d) | interfaceC3540l.l(this.f41435a) | interfaceC3540l.l(this.f41439e);
                        final d dVar = this.f41437c;
                        final SSOAccountVM sSOAccountVM = this.f41438d;
                        final w wVar2 = this.f41435a;
                        final C3621h c3621h = this.f41439e;
                        Object objF = interfaceC3540l.f();
                        if (zT || objF == InterfaceC3540l.f21100a.a()) {
                            objF = new InterfaceC6835l() { // from class: com.ui.core.ui.sso.g
                                @Override // mh.InterfaceC6835l
                                public final Object invoke(Object obj) {
                                    return d.c.b.a.C1315a.f(dVar, sSOAccountVM, wVar2, c3621h, (u) obj);
                                }
                            };
                            interfaceC3540l.K(objF);
                        }
                        interfaceC3540l.J();
                        g2.m.b(wVar, str, null, null, null, null, null, null, null, null, (InterfaceC6835l) objF, interfaceC3540l, 0, 0, 1020);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                    }

                    @Override // mh.InterfaceC6839p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        e((InterfaceC3540l) obj, ((Number) obj2).intValue());
                        return J.f24997a;
                    }
                }

                /* renamed from: com.ui.core.ui.sso.d$c$b$a$b, reason: collision with other inner class name */
                static final class C1320b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f41453a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ d f41454b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ SSOAccountVM f41455c;

                    /* renamed from: com.ui.core.ui.sso.d$c$b$a$b$a, reason: collision with other inner class name */
                    static final class C1321a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                        /* renamed from: a, reason: collision with root package name */
                        int f41456a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SSOAccountVM f41457b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ d f41458c;

                        /* renamed from: com.ui.core.ui.sso.d$c$b$a$b$a$a, reason: collision with other inner class name */
                        static final class C1322a implements InterfaceC3221h {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ d f41459a;

                            C1322a(d dVar) {
                                this.f41459a = dVar;
                            }

                            @Override // Li.InterfaceC3221h
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final Object a(UiSSO.a aVar, InterfaceC5380e interfaceC5380e) {
                                this.f41459a.N1().w(aVar);
                                return J.f24997a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1321a(SSOAccountVM sSOAccountVM, d dVar, InterfaceC5380e interfaceC5380e) {
                            super(2, interfaceC5380e);
                            this.f41457b = sSOAccountVM;
                            this.f41458c = dVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                            return new C1321a(this.f41457b, this.f41458c, interfaceC5380e);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object objG = AbstractC5467b.g();
                            int i10 = this.f41456a;
                            if (i10 == 0) {
                                v.b(obj);
                                InterfaceC3220g interfaceC3220gQ0 = this.f41457b.q0();
                                C1322a c1322a = new C1322a(this.f41458c);
                                this.f41456a = 1;
                                if (interfaceC3220gQ0.b(c1322a, this) == objG) {
                                    return objG;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                v.b(obj);
                            }
                            return J.f24997a;
                        }

                        @Override // mh.InterfaceC6839p
                        /* renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                            return ((C1321a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1320b(d dVar, SSOAccountVM sSOAccountVM, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f41454b = dVar;
                        this.f41455c = sSOAccountVM;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new C1320b(this.f41454b, this.f41455c, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objG = AbstractC5467b.g();
                        int i10 = this.f41453a;
                        if (i10 == 0) {
                            v.b(obj);
                            d dVar = this.f41454b;
                            AbstractC4013k.b bVar = AbstractC4013k.b.STARTED;
                            C1321a c1321a = new C1321a(this.f41455c, dVar, null);
                            this.f41453a = 1;
                            if (A.b(dVar, bVar, c1321a, this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v.b(obj);
                        }
                        return J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                        return ((C1320b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                    }
                }

                a(d dVar, w wVar, String str) {
                    this.f41432a = dVar;
                    this.f41433b = wVar;
                    this.f41434c = str;
                }

                public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                    boolean zA;
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-983425694, i10, -1, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:115)");
                    }
                    Bundle bundleQ = this.f41432a.q();
                    AbstractC4013k abstractC4013kO = this.f41432a.O();
                    AbstractC6492s.h(abstractC4013kO, "<get-lifecycle>(...)");
                    SSOAccountVM sSOAccountVM = (SSOAccountVM) Q9.h.m(SSOAccountVM.class, bundleQ, abstractC4013kO, interfaceC3540l, 0, 0);
                    interfaceC3540l.U(-710193841);
                    Object objF = interfaceC3540l.f();
                    InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
                    if (objF == aVar.a()) {
                        objF = new C3621h();
                        interfaceC3540l.K(objF);
                    }
                    C3621h c3621h = (C3621h) objF;
                    interfaceC3540l.J();
                    UiSSO.g gVarP1 = this.f41432a.P1();
                    interfaceC3540l.U(-710191313);
                    if (gVarP1 == UiSSO.g.FOLLOW_SYSTEM) {
                        zA = AbstractC7852m.a(interfaceC3540l, 0);
                    } else if (gVarP1 == UiSSO.g.LIGHT) {
                        zA = false;
                    } else {
                        if (gVarP1 != UiSSO.g.DARK) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zA = true;
                    }
                    interfaceC3540l.J();
                    la.g.j(zA, null, b0.c.e(-1615279862, true, new C1315a(this.f41433b, this.f41434c, this.f41432a, sSOAccountVM, c3621h), interfaceC3540l, 54), interfaceC3540l, 384, 2);
                    w wVar = this.f41433b;
                    interfaceC3540l.U(-710044787);
                    boolean zT = interfaceC3540l.T(this.f41432a) | interfaceC3540l.l(sSOAccountVM);
                    d dVar = this.f41432a;
                    Object objF2 = interfaceC3540l.f();
                    if (zT || objF2 == aVar.a()) {
                        objF2 = new C1320b(dVar, sSOAccountVM, null);
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    O.f(wVar, (InterfaceC6839p) objF2, interfaceC3540l, 0);
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

            b(d dVar, String str) {
                this.f41430a = dVar;
                this.f41431b = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final P.c c(d dVar, InterfaceC7418f savedStateRegistryOwner, Bundle arguments) {
                Bundle bundleQ;
                AbstractC6492s.i(savedStateRegistryOwner, "savedStateRegistryOwner");
                AbstractC6492s.i(arguments, "arguments");
                UiAccountApi.b.a aVar = UiAccountApi.b.f41671a;
                Context contextP1 = dVar.p1();
                AbstractC6492s.h(contextP1, "requireContext(...)");
                UiAccountApi.b bVarA = aVar.a(contextP1);
                dVar.N1().A();
                if (arguments.isEmpty() && (bundleQ = dVar.q()) != null) {
                    arguments.putAll(bundleQ);
                }
                J j10 = J.f24997a;
                return new P9.f(bVarA, null, savedStateRegistryOwner, arguments);
            }

            public final void b(w navController, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(navController, "navController");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1880071756, i10, -1, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:103)");
                }
                d dVar = this.f41430a;
                interfaceC3540l.U(283701318);
                boolean zT = interfaceC3540l.T(this.f41430a);
                final d dVar2 = this.f41430a;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6839p() { // from class: com.ui.core.ui.sso.f
                        @Override // mh.InterfaceC6839p
                        public final Object invoke(Object obj, Object obj2) {
                            return d.c.b.c(dVar2, (InterfaceC7418f) obj, (Bundle) obj2);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                R9.i.c(dVar, (InterfaceC6839p) objF, b0.c.e(-983425694, true, new a(this.f41430a, navController, this.f41431b), interfaceC3540l, 54), interfaceC3540l, 384);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((w) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        /* renamed from: com.ui.core.ui.sso.d$c$c, reason: collision with other inner class name */
        public /* synthetic */ class C1323c {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f41460a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f41461b;

            static {
                int[] iArr = new int[UiSSO.c.values().length];
                try {
                    iArr[UiSSO.c.REGISTER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UiSSO.c.LOGIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f41460a = iArr;
                int[] iArr2 = new int[UiSSO.f.values().length];
                try {
                    iArr2[UiSSO.f.LOGIN.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[UiSSO.f.RESET_PASSWORD.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[UiSSO.f.MFA.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                f41461b = iArr2;
            }
        }

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q9.j c() {
            return new a();
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            String strA;
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1458766239, i10, -1, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:85)");
            }
            int i11 = C1323c.f41461b[d.this.O1().ordinal()];
            if (i11 == 1) {
                int i12 = C1323c.f41460a[d.this.L1().ordinal()];
                if (i12 == 1) {
                    strA = a.c.f41415a.a();
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strA = a.C1314a.f41411a.a();
                }
            } else if (i11 == 2) {
                strA = a.d.f41417a.a();
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                strA = a.b.f41413a.a();
            }
            String str = strA;
            AbstractActivityC3999j abstractActivityC3999jO1 = d.this.o1();
            AbstractC6492s.h(abstractActivityC3999jO1, "requireActivity(...)");
            w wVarD = g2.l.d(new AbstractC5498D[0], interfaceC3540l, 0);
            interfaceC3540l.U(-56915693);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: com.ui.core.ui.sso.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return d.c.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Q9.h.g(abstractActivityC3999jO1, (InterfaceC6824a) objF, str, null, wVarD, b0.c.e(-1880071756, true, new b(d.this, str), interfaceC3540l, 54), interfaceC3540l, 196656, 8);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    private final Object I1(Class clazz) {
        Object objK1 = K1(clazz);
        if (objK1 != null || (objK1 = J1(clazz)) != null) {
            return objK1;
        }
        throw new IllegalStateException("Failed to get ancestor " + clazz.getSimpleName() + "!");
    }

    private final Object J1(Class activityClass) {
        AbstractActivityC3999j abstractActivityC3999jL = l();
        if (abstractActivityC3999jL != null && activityClass.isAssignableFrom(abstractActivityC3999jL.getClass())) {
            return abstractActivityC3999jL;
        }
        return null;
    }

    private final Object K1(Class containerFragmentClass) {
        for (Fragment fragmentF = F(); fragmentF != null; fragmentF = fragmentF.F()) {
            if (containerFragmentClass.isAssignableFrom(fragmentF.getClass())) {
                return fragmentF;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiSSO.c L1() {
        UiSSO.c cVar;
        Bundle bundleQ = q();
        if (bundleQ == null || (cVar = (UiSSO.c) ((Parcelable) A1.c.a(bundleQ, "entry_point", UiSSO.c.class))) == null) {
            throw new IllegalStateException("Entry point not found in arguments!");
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M1() {
        Bundle bundleQ = q();
        if (bundleQ != null) {
            return bundleQ.getBoolean("hasToolbarClose");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b N1() {
        return (b) I1(b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiSSO.f O1() {
        UiSSO.f fVar;
        Bundle bundleQ = q();
        if (bundleQ == null || (fVar = (UiSSO.f) ((Parcelable) A1.c.a(bundleQ, "screen", UiSSO.f.class))) == null) {
            throw new IllegalStateException("Screen not found in arguments!");
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiSSO.g P1() {
        UiSSO.g gVar;
        Bundle bundleQ = q();
        return (bundleQ == null || (gVar = (UiSSO.g) ((Parcelable) A1.c.a(bundleQ, "theme", UiSSO.g.class))) == null) ? UiSSO.g.FOLLOW_SYSTEM : gVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View s0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC6492s.i(inflater, "inflater");
        Context contextP1 = p1();
        AbstractC6492s.h(contextP1, "requireContext(...)");
        C3929j0 c3929j0 = new C3929j0(contextP1, null, 0, 6, null);
        c3929j0.setContent(b0.c.c(1458766239, true, new c()));
        return c3929j0;
    }
}
