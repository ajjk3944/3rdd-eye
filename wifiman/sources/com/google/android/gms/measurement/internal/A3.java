package com.google.android.gms.measurement.internal;

import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C4333e;
import com.google.android.gms.internal.measurement.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r3.AbstractC7570h;
import r3.C7571i;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class A3 extends AbstractBinderC4943r2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4833d7 f35772a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f35773b;

    /* renamed from: c, reason: collision with root package name */
    private String f35774c;

    public A3(C4833d7 c4833d7) {
        this(c4833d7, null);
    }

    public static /* synthetic */ void f(A3 a32, Bundle bundle, String str, t7 t7Var) throws SQLException {
        boolean zP = a32.f35772a.s0().p(N.f36072d1);
        boolean zP2 = a32.f35772a.s0().p(N.f36078f1);
        if (bundle.isEmpty() && zP) {
            C4933q c4933qV0 = a32.f35772a.v0();
            c4933qV0.j();
            c4933qV0.q();
            try {
                c4933qV0.x().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                c4933qV0.zzj().C().b("Error clearing default event params", e10);
                return;
            }
        }
        a32.f35772a.v0().m0(str, bundle);
        if (a32.f35772a.v0().l0(str, t7Var.f36746F)) {
            if (zP2) {
                a32.f35772a.v0().a0(str, Long.valueOf(t7Var.f36746F), null, bundle);
            } else {
                a32.f35772a.v0().a0(str, null, null, bundle);
            }
        }
    }

    public static /* synthetic */ void n0(A3 a32, t7 t7Var) {
        a32.f35772a.K0();
        a32.f35772a.y0(t7Var);
    }

    public static /* synthetic */ void o0(A3 a32, t7 t7Var, Bundle bundle, InterfaceC4959t2 interfaceC4959t2, String str) {
        a32.f35772a.K0();
        try {
            interfaceC4959t2.E(a32.f35772a.n(t7Var, bundle));
        } catch (RemoteException e10) {
            a32.f35772a.zzj().C().c("Failed to return trigger URIs for app", str, e10);
        }
    }

    public static /* synthetic */ void p0(A3 a32, t7 t7Var, C4861h c4861h) {
        a32.f35772a.K0();
        a32.f35772a.H((String) AbstractC7901p.l(t7Var.f36748a), c4861h);
    }

    public static /* synthetic */ void q0(A3 a32, String str, Q6 q62, InterfaceC4999y2 interfaceC4999y2) {
        a32.f35772a.K0();
        S6 s6H = a32.f35772a.h(str, q62);
        try {
            interfaceC4999y2.k(s6H);
            a32.f35772a.zzj().G().c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(s6H.f36206a.size()));
        } catch (RemoteException e10) {
            a32.f35772a.zzj().C().c("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    private final void r0(Runnable runnable) {
        AbstractC7901p.l(runnable);
        if (this.f35772a.zzl().G()) {
            runnable.run();
        } else {
            this.f35772a.zzl().C(runnable);
        }
    }

    private final void s0(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.f35772a.zzj().C().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f35773b == null) {
                    this.f35773b = Boolean.valueOf("com.google.android.gms".equals(this.f35774c) || com.google.android.gms.common.util.p.a(this.f35772a.zza(), Binder.getCallingUid()) || C7571i.a(this.f35772a.zza()).c(Binder.getCallingUid()));
                }
                if (this.f35773b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f35772a.zzj().C().b("Measurement Service called with invalid calling package. appId", L2.r(str));
                throw e10;
            }
        }
        if (this.f35774c == null && AbstractC7570h.k(this.f35772a.zza(), Binder.getCallingUid(), str)) {
            this.f35774c = str;
        }
        if (str.equals(this.f35774c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    public static /* synthetic */ void u0(A3 a32, t7 t7Var) {
        a32.f35772a.K0();
        a32.f35772a.w0(t7Var);
    }

    private final void v0(t7 t7Var, boolean z10) {
        AbstractC7901p.l(t7Var);
        AbstractC7901p.f(t7Var.f36748a);
        s0(t7Var.f36748a, false);
        this.f35772a.I0().g0(t7Var.f36749b, t7Var.f36763p);
    }

    private final void w0(Runnable runnable) {
        AbstractC7901p.l(runnable);
        if (this.f35772a.zzl().G()) {
            runnable.run();
        } else {
            this.f35772a.zzl().z(runnable);
        }
    }

    private final void y0(L l10, t7 t7Var) {
        this.f35772a.K0();
        this.f35772a.u(l10, t7Var);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void D(final t7 t7Var) {
        AbstractC7901p.f(t7Var.f36748a);
        AbstractC7901p.l(t7Var.f36768u);
        r0(new Runnable() { // from class: com.google.android.gms.measurement.internal.B3
            @Override // java.lang.Runnable
            public final void run() {
                A3.n0(this.f35794a, t7Var);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void G(long j10, String str, String str2, String str3) {
        w0(new K3(this, str2, str3, str, j10));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final C4917o H(t7 t7Var) {
        v0(t7Var, false);
        AbstractC7901p.f(t7Var.f36748a);
        try {
            return (C4917o) this.f35772a.zzl().x(new V3(this, t7Var)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f35772a.zzj().C().c("Failed to get consent. appId", L2.r(t7Var.f36748a), e10);
            return new C4917o(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final List I(String str, String str2, String str3) {
        s0(str, true);
        try {
            return (List) this.f35772a.zzl().s(new Q3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f35772a.zzj().C().b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void J(final Bundle bundle, final t7 t7Var) {
        v0(t7Var, false);
        final String str = t7Var.f36748a;
        AbstractC7901p.l(str);
        w0(new Runnable() { // from class: com.google.android.gms.measurement.internal.G3
            @Override // java.lang.Runnable
            public final void run() throws SQLException {
                A3.f(this.f35876a, bundle, str, t7Var);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void N(final t7 t7Var, final C4861h c4861h) {
        if (this.f35772a.s0().p(N.f36040P0)) {
            v0(t7Var, false);
            w0(new Runnable() { // from class: com.google.android.gms.measurement.internal.z3
                @Override // java.lang.Runnable
                public final void run() {
                    A3.p0(this.f36904a, t7Var, c4861h);
                }
            });
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void O(t7 t7Var, final Q6 q62, final InterfaceC4999y2 interfaceC4999y2) {
        if (this.f35772a.s0().p(N.f36040P0)) {
            v0(t7Var, false);
            final String str = (String) AbstractC7901p.l(t7Var.f36748a);
            this.f35772a.zzl().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.E3
                @Override // java.lang.Runnable
                public final void run() {
                    A3.q0(this.f35851a, str, q62, interfaceC4999y2);
                }
            });
        } else {
            try {
                interfaceC4999y2.k(new S6(Collections.emptyList()));
                this.f35772a.zzj().G().a("[sgtm] Client upload is not enabled on the service side.");
            } catch (RemoteException e10) {
                this.f35772a.zzj().H().b("[sgtm] UploadBatchesCallback failed.", e10);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void Q(final t7 t7Var) {
        AbstractC7901p.f(t7Var.f36748a);
        AbstractC7901p.l(t7Var.f36768u);
        r0(new Runnable() { // from class: com.google.android.gms.measurement.internal.D3
            @Override // java.lang.Runnable
            public final void run() {
                A3.u0(this.f35838a, t7Var);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final List W(t7 t7Var, boolean z10) {
        v0(t7Var, false);
        String str = t7Var.f36748a;
        AbstractC7901p.l(str);
        try {
            List<u7> list = (List) this.f35772a.zzl().s(new I3(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (u7 u7Var : list) {
                if (z10 || !x7.D0(u7Var.f36790c)) {
                    arrayList.add(new r7(u7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f35772a.zzj().C().c("Failed to get user properties. appId", L2.r(t7Var.f36748a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f35772a.zzj().C().c("Failed to get user properties. appId", L2.r(t7Var.f36748a), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void X(L l10, t7 t7Var) {
        AbstractC7901p.l(l10);
        v0(t7Var, false);
        w0(new U3(this, l10, t7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void a0(t7 t7Var) {
        v0(t7Var, false);
        w0(new F3(this, t7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final List c0(String str, String str2, t7 t7Var) {
        v0(t7Var, false);
        String str3 = t7Var.f36748a;
        AbstractC7901p.l(str3);
        try {
            return (List) this.f35772a.zzl().s(new R3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f35772a.zzj().C().b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void d0(t7 t7Var) {
        AbstractC7901p.f(t7Var.f36748a);
        s0(t7Var.f36748a, false);
        w0(new S3(this, t7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final String e(t7 t7Var) {
        v0(t7Var, false);
        return this.f35772a.b0(t7Var);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void g(C4877j c4877j) {
        AbstractC7901p.l(c4877j);
        AbstractC7901p.l(c4877j.f36545c);
        AbstractC7901p.f(c4877j.f36543a);
        s0(c4877j.f36543a, true);
        w0(new M3(this, new C4877j(c4877j)));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void g0(final t7 t7Var, final Bundle bundle, final InterfaceC4959t2 interfaceC4959t2) {
        v0(t7Var, false);
        final String str = (String) AbstractC7901p.l(t7Var.f36748a);
        this.f35772a.zzl().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.C3
            @Override // java.lang.Runnable
            public final void run() {
                A3.o0(this.f35804a, t7Var, bundle, interfaceC4959t2, str);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final List h(t7 t7Var, Bundle bundle) {
        v0(t7Var, false);
        AbstractC7901p.l(t7Var.f36748a);
        if (!this.f35772a.s0().p(N.f36087i1)) {
            try {
                return (List) this.f35772a.zzl().s(new CallableC4812b4(this, t7Var, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.f35772a.zzj().C().c("Failed to get trigger URIs. appId", L2.r(t7Var.f36748a), e10);
                return Collections.emptyList();
            }
        }
        try {
            return (List) this.f35772a.zzl().x(new Y3(this, t7Var, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.f35772a.zzj().C().c("Failed to get trigger URIs. appId", L2.r(t7Var.f36748a), e11);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void i(C4877j c4877j, t7 t7Var) {
        AbstractC7901p.l(c4877j);
        AbstractC7901p.l(c4877j.f36545c);
        v0(t7Var, false);
        C4877j c4877j2 = new C4877j(c4877j);
        c4877j2.f36543a = t7Var.f36748a;
        w0(new N3(this, c4877j2, t7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void j0(L l10, String str, String str2) {
        AbstractC7901p.l(l10);
        AbstractC7901p.f(str);
        s0(str, true);
        w0(new X3(this, l10, str));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void k0(t7 t7Var) {
        AbstractC7901p.f(t7Var.f36748a);
        AbstractC7901p.l(t7Var.f36768u);
        r0(new T3(this, t7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final List m0(String str, String str2, boolean z10, t7 t7Var) {
        v0(t7Var, false);
        String str3 = t7Var.f36748a;
        AbstractC7901p.l(str3);
        try {
            List<u7> list = (List) this.f35772a.zzl().s(new P3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (u7 u7Var : list) {
                if (z10 || !x7.D0(u7Var.f36790c)) {
                    arrayList.add(new r7(u7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f35772a.zzj().C().c("Failed to query user properties. appId", L2.r(t7Var.f36748a), e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            this.f35772a.zzj().C().c("Failed to query user properties. appId", L2.r(t7Var.f36748a), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void o(r7 r7Var, t7 t7Var) {
        AbstractC7901p.l(r7Var);
        v0(t7Var, false);
        w0(new Z3(this, r7Var, t7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final List p(String str, String str2, String str3, boolean z10) {
        s0(str, true);
        try {
            List<u7> list = (List) this.f35772a.zzl().s(new O3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (u7 u7Var : list) {
                if (z10 || !x7.D0(u7Var.f36790c)) {
                    arrayList.add(new r7(u7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f35772a.zzj().C().c("Failed to get user properties as. appId", L2.r(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            this.f35772a.zzj().C().c("Failed to get user properties as. appId", L2.r(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void t(t7 t7Var) {
        v0(t7Var, false);
        w0(new L3(this, t7Var));
    }

    final L t0(L l10, t7 t7Var) {
        K k10;
        if ("_cmp".equals(l10.f35974a) && (k10 = l10.f35975b) != null && k10.b() != 0) {
            String strK = l10.f35975b.k("_cis");
            if ("referrer broadcast".equals(strK) || "referrer API".equals(strK)) {
                this.f35772a.zzj().F().b("Event has been filtered ", l10.toString());
                return new L("_cmpx", l10.f35975b, l10.f35976c, l10.f35977d);
            }
        }
        return l10;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void u(t7 t7Var) {
        v0(t7Var, false);
        w0(new H3(this, t7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final byte[] x(L l10, String str) {
        AbstractC7901p.f(str);
        AbstractC7901p.l(l10);
        s0(str, true);
        this.f35772a.zzj().B().b("Log and bundle. event", this.f35772a.x0().c(l10.f35974a));
        long jB = this.f35772a.zzb().b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f35772a.zzl().x(new W3(this, l10, str)).get();
            if (bArr == null) {
                this.f35772a.zzj().C().b("Log and bundle returned null. appId", L2.r(str));
                bArr = new byte[0];
            }
            this.f35772a.zzj().B().d("Log and bundle processed. event, size, time_ms", this.f35772a.x0().c(l10.f35974a), Integer.valueOf(bArr.length), Long.valueOf((this.f35772a.zzb().b() / 1000000) - jB));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            this.f35772a.zzj().C().d("Failed to log and bundle. appId, event, error", L2.r(str), this.f35772a.x0().c(l10.f35974a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f35772a.zzj().C().d("Failed to log and bundle. appId, event, error", L2.r(str), this.f35772a.x0().c(l10.f35974a), e);
            return null;
        }
    }

    final void x0(L l10, t7 t7Var) {
        boolean zE;
        if (!this.f35772a.B0().U(t7Var.f36748a)) {
            y0(l10, t7Var);
            return;
        }
        this.f35772a.zzj().G().b("EES config found for", t7Var.f36748a);
        C4873i3 c4873i3B0 = this.f35772a.B0();
        String str = t7Var.f36748a;
        com.google.android.gms.internal.measurement.C c10 = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.C) c4873i3B0.f36533j.c(str);
        if (c10 == null) {
            this.f35772a.zzj().G().b("EES not loaded for", t7Var.f36748a);
            y0(l10, t7Var);
            return;
        }
        try {
            Map mapM = this.f35772a.H0().M(l10.f35975b.g(), true);
            String strA = AbstractC4898l4.a(l10.f35974a);
            if (strA == null) {
                strA = l10.f35974a;
            }
            zE = c10.e(new C4333e(strA, l10.f35977d, mapM));
        } catch (zzc unused) {
            this.f35772a.zzj().C().c("EES error. appId, eventName", t7Var.f36749b, l10.f35974a);
            zE = false;
        }
        if (!zE) {
            this.f35772a.zzj().G().b("EES was not applied to event", l10.f35974a);
            y0(l10, t7Var);
            return;
        }
        if (c10.h()) {
            this.f35772a.zzj().G().b("EES edited event", l10.f35974a);
            y0(this.f35772a.H0().D(c10.a().d()), t7Var);
        } else {
            y0(l10, t7Var);
        }
        if (c10.g()) {
            for (C4333e c4333e : c10.a().f()) {
                this.f35772a.zzj().G().b("EES logging created event", c4333e.e());
                y0(this.f35772a.H0().D(c4333e), t7Var);
            }
        }
    }

    private A3(C4833d7 c4833d7, String str) {
        AbstractC7901p.l(c4833d7);
        this.f35772a = c4833d7;
        this.f35774c = null;
    }
}
