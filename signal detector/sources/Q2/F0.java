package q2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.C0649No;
import com.google.android.gms.internal.ads.Q7;
import j2.AbstractC2547c;
import j2.AbstractC2555k;
import j2.C2552h;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import k2.InterfaceC2625d;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2806a f23106e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC2547c f23107f;

    /* renamed from: g, reason: collision with root package name */
    public C2552h[] f23108g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2625d f23109h;

    /* renamed from: j, reason: collision with root package name */
    public j2.t f23110j;

    /* renamed from: k, reason: collision with root package name */
    public String f23111k;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC2555k f23112l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23113m;

    /* renamed from: a, reason: collision with root package name */
    public final BinderC0569Jc f23102a = new BinderC0569Jc();

    /* renamed from: c, reason: collision with root package name */
    public final j2.s f23104c = new j2.s();

    /* renamed from: d, reason: collision with root package name */
    public final C0649No f23105d = new C0649No(this);

    /* renamed from: n, reason: collision with root package name */
    public final AtomicLong f23114n = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final c1 f23103b = c1.f23184a;
    public L i = null;

    public F0(AbstractC2555k abstractC2555k) {
        this.f23112l = abstractC2555k;
        new AtomicBoolean(false);
    }

    public static d1 a(Context context, C2552h[] c2552hArr) {
        for (C2552h c2552h : c2552hArr) {
            if (c2552h.equals(C2552h.f21339k)) {
                return new d1("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        d1 d1Var = new d1(context, c2552hArr);
        d1Var.f23196j = false;
        return d1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2 A[Catch: RemoteException -> 0x00d0, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d0, blocks: (B:28:0x009e, B:30:0x00a4, B:32:0x00b2, B:34:0x00c4, B:37:0x00d2), top: B:54:0x009e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(q2.E0 r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.F0.b(q2.E0):void");
    }

    public final void c(InterfaceC2806a interfaceC2806a) {
        try {
            this.f23106e = interfaceC2806a;
            L l2 = this.i;
            if (l2 != null) {
                l2.q2(interfaceC2806a != null ? new BinderC2836p(interfaceC2806a) : null);
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    public final void d(C2552h... c2552hArr) {
        AbstractC2555k abstractC2555k = this.f23112l;
        this.f23108g = c2552hArr;
        try {
            L l2 = this.i;
            if (l2 != null) {
                l2.D1(a(abstractC2555k.getContext(), this.f23108g));
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
        abstractC2555k.requestLayout();
    }

    public final void e(InterfaceC2625d interfaceC2625d) {
        try {
            this.f23109h = interfaceC2625d;
            L l2 = this.i;
            if (l2 != null) {
                l2.C3(interfaceC2625d != null ? new Q7(interfaceC2625d) : null);
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }
}
