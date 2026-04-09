package aa;

import Eb.w;
import Li.N;
import Li.P;
import Q9.j;
import U9.AbstractC3619f;
import U9.C3615b;
import U9.C3621h;
import U9.C3622i;
import Yg.J;
import com.ui.core.ui.sso.UiSSO;
import dh.InterfaceC5380e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import s9.b;
import s9.d;

/* loaded from: classes3.dex */
public final class f extends d {

    /* renamed from: e, reason: collision with root package name */
    private final com.ui.core.ui.sso.c f25837e;

    /* renamed from: f, reason: collision with root package name */
    private final C3621h f25838f;

    /* renamed from: g, reason: collision with root package name */
    private final C3615b f25839g;

    /* renamed from: h, reason: collision with root package name */
    private final N f25840h;

    /* renamed from: i, reason: collision with root package name */
    private final N f25841i;

    /* renamed from: j, reason: collision with root package name */
    private final N f25842j;

    /* renamed from: k, reason: collision with root package name */
    private final N f25843k;

    /* renamed from: l, reason: collision with root package name */
    private final N f25844l;

    /* renamed from: m, reason: collision with root package name */
    private final N f25845m;

    /* renamed from: n, reason: collision with root package name */
    private final N f25846n;

    public f(com.ui.core.ui.sso.c session, C3621h activityController) {
        C3615b c3615bA;
        Object next;
        AbstractC6492s.i(session, "session");
        AbstractC6492s.i(activityController, "activityController");
        this.f25837e = session;
        this.f25838f = activityController;
        UiSSO.d dVarD = session.d();
        if (dVarD == null || (c3615bA = dVarD.a()) == null) {
            throw new IllegalStateException("MFA params unavailable.");
        }
        this.f25839g = c3615bA;
        this.f25840h = P.a(new d.b(P9.b.f18408Q));
        this.f25841i = P.a(new d.b(P9.b.f18406P));
        this.f25842j = P.a(o0(c3615bA));
        Iterator it = c3615bA.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((w) next) instanceof w.Backup) {
                    break;
                }
            }
        }
        this.f25843k = P.a(Boolean.valueOf(next != null));
        this.f25844l = P.a(new d.b(P9.b.f18404O));
        this.f25845m = P.a(new d.b(P9.b.f18402N));
        this.f25846n = P.a(Boolean.TRUE);
    }

    private final String n0(w wVar) {
        if (wVar instanceof w.Backup) {
            return ((w.Backup) wVar).getId();
        }
        if (wVar instanceof w.Email) {
            w.Email email = (w.Email) wVar;
            return email.getId() + "-" + email.getEmail();
        }
        if (!(wVar instanceof w.Sms)) {
            if (wVar instanceof w.Push) {
                return ((w.Push) wVar).getId();
            }
            if (wVar instanceof w.Totp) {
                return ((w.Totp) wVar).getId();
            }
            if (wVar instanceof w.Unknown) {
                return ((w.Unknown) wVar).getId();
            }
            throw new NoWhenBranchMatchedException();
        }
        w.Sms sms = (w.Sms) wVar;
        return sms.getId() + "-" + sms.getPhoneNumber();
    }

    private final List o0(C3615b c3615b) {
        ArrayList arrayList = new ArrayList();
        for (final w wVar : c3615b.a()) {
            if (!AbstractC6492s.d(c3615b.b().getId(), wVar.getId())) {
                if (wVar instanceof w.Push) {
                    arrayList.add(0, new Z9.a(n0(wVar), new b.a(P9.a.f18369f, null, null, 6, null), false, new d.b(P9.b.f18425Y0), new d.c(((w.Push) wVar).getName())));
                } else if (wVar instanceof w.Totp) {
                    arrayList.add(new Z9.a(n0(wVar), new b.a(P9.a.f18365b, null, null, 6, null), true, new d.b(P9.b.f18424Y), new d.c("")));
                } else if (wVar instanceof w.Email) {
                    arrayList.add(new Z9.a(n0(wVar), new b.a(P9.a.f18366c, null, null, 6, null), true, new d.b(P9.b.f18426Z), new d.c(((w.Email) wVar).getEmail())));
                } else if (wVar instanceof w.Sms) {
                    arrayList.add(new Z9.a(n0(wVar), new b.a(P9.a.f18367d, null, null, 6, null), true, new d.b(P9.b.f18430b0), new d.c(((w.Sms) wVar).getPhoneNumber())));
                } else {
                    if (!(wVar instanceof w.Backup) && !(wVar instanceof w.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    S9.a.d(new InterfaceC6824a() { // from class: aa.e
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return f.p0(this.f25835a, wVar);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p0(f fVar, w wVar) {
        return "MFA method " + fVar.n0(wVar) + " presentation skipped";
    }

    private final AbstractC3619f q0(w wVar) {
        if (wVar instanceof w.Push) {
            return AbstractC3619f.d.f22195a;
        }
        if (wVar instanceof w.Email) {
            return AbstractC3619f.b.f22191a;
        }
        if (wVar instanceof w.Sms) {
            return AbstractC3619f.C0820f.f22199a;
        }
        if (wVar instanceof w.Totp) {
            return AbstractC3619f.a.f22189a;
        }
        if (wVar instanceof w.Backup) {
            return AbstractC3619f.e.f22197a;
        }
        if (wVar instanceof w.Unknown) {
            throw new IllegalStateException("Unknown TwoFaAuthenticator method can't be routed to any screen");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // aa.d
    public Object H(InterfaceC5380e interfaceC5380e) {
        this.f25838f.e0(C3622i.f22212a);
        return J.f24997a;
    }

    @Override // aa.d
    public N L() {
        return this.f25841i;
    }

    @Override // aa.d
    public N P() {
        return this.f25840h;
    }

    @Override // aa.d
    public N e0() {
        return this.f25846n;
    }

    @Override // aa.d
    public N f0() {
        return this.f25845m;
    }

    @Override // aa.d
    public N g0() {
        return this.f25843k;
    }

    @Override // aa.d
    public N h0() {
        return this.f25844l;
    }

    @Override // aa.d
    public N i0() {
        return this.f25842j;
    }

    @Override // aa.d
    public Object j0(InterfaceC5380e interfaceC5380e) {
        this.f25838f.e0(C3621h.a.InterfaceC0821a.b.f22211a);
        return J.f24997a;
    }

    @Override // aa.d
    public Object k0(String str, InterfaceC5380e interfaceC5380e) {
        Object next;
        C3615b c3615bA;
        Iterator it = this.f25839g.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC6492s.d(n0((w) next), str)) {
                break;
            }
        }
        w wVar = (w) next;
        if (wVar == null) {
            throw new IllegalStateException("Selected method id not found in available methods");
        }
        UiSSO.d dVarD = this.f25837e.d();
        if (dVarD != null && (c3615bA = dVarD.a()) != null) {
            c3615bA.d(wVar);
        }
        X().b(new j.a.d(q0(wVar)));
        return J.f24997a;
    }

    @Override // aa.d
    public Object l0(InterfaceC5380e interfaceC5380e) {
        X().b(new j.a.d(AbstractC3619f.e.f22197a));
        return J.f24997a;
    }
}
