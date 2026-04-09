package X9;

import Eb.w;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import U9.C3615b;
import U9.C3621h;
import Yg.J;
import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.E;
import com.ui.core.ui.sso.UiSSO;
import gg.AbstractC5912b;
import ha.InterfaceC5970a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import ka.InterfaceC6411a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import s9.d;

/* loaded from: classes3.dex */
public class h extends X9.c {

    public static final class a extends h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(E savedState, com.ui.core.ui.sso.c session, C3621h activityController, InterfaceC6411a vibrator, InterfaceC5970a clipboard) {
            super(savedState, session, activityController, vibrator, clipboard);
            AbstractC6492s.i(savedState, "savedState");
            AbstractC6492s.i(session, "session");
            AbstractC6492s.i(activityController, "activityController");
            AbstractC6492s.i(vibrator, "vibrator");
            AbstractC6492s.i(clipboard, "clipboard");
            b1().setValue(new d.b(P9.b.f18426Z));
            p1(n1());
            I0();
        }

        @Override // X9.h
        protected w.Email n1() {
            C3615b c3615bA;
            UiSSO.d dVarD = p0().d();
            w wVarC = (dVarD == null || (c3615bA = dVarD.a()) == null) ? null : c3615bA.c();
            w.Email email = wVarC instanceof w.Email ? (w.Email) wVarC : null;
            if (email != null) {
                return email;
            }
            throw new IllegalStateException("Email MFA Method params not found");
        }

        @Override // W9.e
        protected AbstractC5912b v0() {
            return G0();
        }
    }

    static final class b implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f24102a = new b();

        b() {
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to submit code";
        }
    }

    public static final class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f24103a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f24104b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s9.d f24105c;

        public c(Throwable th2, h hVar, s9.d dVar) {
            this.f24103a = th2;
            this.f24104b = hVar;
            this.f24105c = dVar;
        }

        public final void a() {
            S9.a.c(b.f24102a, new UiSSO.SuppressedError("Failed to submit code", this.f24103a));
            this.f24104b.W0().setValue(this.f24105c);
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() {
            a();
            return J.f24997a;
        }
    }

    static final class d implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w.Email f24106a;

        d(w.Email email) {
            this.f24106a = email;
        }

        public final CharSequence a(Context ctx, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ctx, "ctx");
            interfaceC3540l.U(1677056753);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1677056753, i10, -1, "com.ui.core.ui.sso.mfa.auth.code.MFAEmailVM.setupUI.<anonymous> (MFAEmailVM.kt:47)");
            }
            String string = ctx.getString(P9.b.f18376A);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{this.f24106a.getEmail()}, 1));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(E savedState, com.ui.core.ui.sso.c session, C3621h activityController, InterfaceC6411a vibrator, InterfaceC5970a clipboard) {
        super(savedState, session, activityController, vibrator, clipboard);
        AbstractC6492s.i(savedState, "savedState");
        AbstractC6492s.i(session, "session");
        AbstractC6492s.i(activityController, "activityController");
        AbstractC6492s.i(vibrator, "vibrator");
        AbstractC6492s.i(clipboard, "clipboard");
        p1(n1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5912b o1(h hVar, Throwable error, s9.d errorString) {
        AbstractC6492s.i(error, "error");
        AbstractC6492s.i(errorString, "errorString");
        AbstractC5912b abstractC5912bF = AbstractC5912b.F(new c(error, hVar, errorString));
        AbstractC6492s.h(abstractC5912bF, "fromCallable(...)");
        return abstractC5912bF;
    }

    @Override // W9.e
    protected AbstractC5912b G0() {
        return r0(p0().g().n(n1()), new InterfaceC6839p() { // from class: X9.g
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return h.o1(this.f24101a, (Throwable) obj, (s9.d) obj2);
            }
        });
    }

    protected w.Email n1() {
        Parcelable parcelable;
        C3615b c3615bA;
        Set setA;
        Object next;
        C3615b c3615bA2;
        UiSSO.d dVarD = p0().d();
        w wVarB = (dVarD == null || (c3615bA2 = dVarD.a()) == null) ? null : c3615bA2.b();
        w.Email email = wVarB instanceof w.Email ? (w.Email) wVarB : null;
        if (email != null) {
            return email;
        }
        UiSSO.d dVarD2 = p0().d();
        if (dVarD2 == null || (c3615bA = dVarD2.a()) == null || (setA = c3615bA.a()) == null) {
            parcelable = null;
        } else {
            Iterator it = setA.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((w) next) instanceof w.Email) {
                    break;
                }
            }
            parcelable = (w) next;
        }
        w.Email email2 = parcelable instanceof w.Email ? (w.Email) parcelable : null;
        if (email2 != null) {
            return email2;
        }
        throw new IllegalStateException("Email MFA Method params not found");
    }

    protected final void p1(w.Email email) {
        if (email != null) {
            Y0().setValue(new d.b(P9.b.f18386F));
            a1().setValue(new d.a(email.getEmail(), new d(email)));
            k0().setValue(Boolean.TRUE);
        }
    }
}
