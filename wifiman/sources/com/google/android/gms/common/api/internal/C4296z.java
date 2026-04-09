package com.google.android.gms.common.api.internal;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.tasks.TaskCompletionSource;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import o.C7010a;
import r3.C7564b;
import r3.C7566d;
import s3.AbstractC7900o;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.common.api.internal.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4296z implements e.a, e.b {

    /* renamed from: b, reason: collision with root package name */
    private final a.f f34861b;

    /* renamed from: c, reason: collision with root package name */
    private final C4273b f34862c;

    /* renamed from: d, reason: collision with root package name */
    private final C4288q f34863d;

    /* renamed from: j, reason: collision with root package name */
    private final int f34866j;

    /* renamed from: k, reason: collision with root package name */
    private final O f34867k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f34868l;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ C4276e f34872p;

    /* renamed from: a, reason: collision with root package name */
    private final Queue f34860a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f34864e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Map f34865f = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private final List f34869m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    private C7564b f34870n = null;

    /* renamed from: o, reason: collision with root package name */
    private int f34871o = 0;

    public C4296z(C4276e c4276e, com.google.android.gms.common.api.d dVar) {
        this.f34872p = c4276e;
        a.f fVarM = dVar.m(c4276e.f34836n.getLooper(), this);
        this.f34861b = fVarM;
        this.f34862c = dVar.j();
        this.f34863d = new C4288q();
        this.f34866j = dVar.l();
        if (fVarM.m()) {
            this.f34867k = dVar.n(c4276e.f34827e, c4276e.f34836n);
        } else {
            this.f34867k = null;
        }
    }

    static /* bridge */ /* synthetic */ void B(C4296z c4296z, B b10) {
        if (c4296z.f34869m.contains(b10) && !c4296z.f34868l) {
            if (c4296z.f34861b.isConnected()) {
                c4296z.j();
            } else {
                c4296z.E();
            }
        }
    }

    static /* bridge */ /* synthetic */ void C(C4296z c4296z, B b10) {
        C7566d[] c7566dArrG;
        if (c4296z.f34869m.remove(b10)) {
            c4296z.f34872p.f34836n.removeMessages(15, b10);
            c4296z.f34872p.f34836n.removeMessages(16, b10);
            C7566d c7566d = b10.f34749b;
            ArrayList arrayList = new ArrayList(c4296z.f34860a.size());
            for (V v10 : c4296z.f34860a) {
                if ((v10 instanceof H) && (c7566dArrG = ((H) v10).g(c4296z)) != null && com.google.android.gms.common.util.b.b(c7566dArrG, c7566d)) {
                    arrayList.add(v10);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                V v11 = (V) arrayList.get(i10);
                c4296z.f34860a.remove(v11);
                v11.b(new UnsupportedApiCallException(c7566d));
            }
        }
    }

    private final C7566d e(C7566d[] c7566dArr) {
        if (c7566dArr != null && c7566dArr.length != 0) {
            C7566d[] c7566dArrJ = this.f34861b.j();
            if (c7566dArrJ == null) {
                c7566dArrJ = new C7566d[0];
            }
            C7010a c7010a = new C7010a(c7566dArrJ.length);
            for (C7566d c7566d : c7566dArrJ) {
                c7010a.put(c7566d.b(), Long.valueOf(c7566d.e()));
            }
            for (C7566d c7566d2 : c7566dArr) {
                Long l10 = (Long) c7010a.get(c7566d2.b());
                if (l10 == null || l10.longValue() < c7566d2.e()) {
                    return c7566d2;
                }
            }
        }
        return null;
    }

    private final void g(C7564b c7564b) {
        Iterator it = this.f34864e.iterator();
        if (!it.hasNext()) {
            this.f34864e.clear();
            return;
        }
        AbstractC5487d.a(it.next());
        if (AbstractC7900o.a(c7564b, C7564b.f60070e)) {
            this.f34861b.d();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Status status) {
        AbstractC7901p.d(this.f34872p.f34836n);
        i(status, null, false);
    }

    private final void i(Status status, Exception exc, boolean z10) {
        AbstractC7901p.d(this.f34872p.f34836n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f34860a.iterator();
        while (it.hasNext()) {
            V v10 = (V) it.next();
            if (!z10 || v10.f34789a == 2) {
                if (status != null) {
                    v10.a(status);
                } else {
                    v10.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void j() {
        ArrayList arrayList = new ArrayList(this.f34860a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            V v10 = (V) arrayList.get(i10);
            if (!this.f34861b.isConnected()) {
                return;
            }
            if (p(v10)) {
                this.f34860a.remove(v10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        D();
        g(C7564b.f60070e);
        o();
        Iterator it = this.f34865f.values().iterator();
        if (it.hasNext()) {
            AbstractC5487d.a(it.next());
            throw null;
        }
        j();
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(int i10) {
        D();
        this.f34868l = true;
        this.f34863d.c(i10, this.f34861b.l());
        C4273b c4273b = this.f34862c;
        C4276e c4276e = this.f34872p;
        c4276e.f34836n.sendMessageDelayed(Message.obtain(c4276e.f34836n, 9, c4273b), 5000L);
        C4273b c4273b2 = this.f34862c;
        C4276e c4276e2 = this.f34872p;
        c4276e2.f34836n.sendMessageDelayed(Message.obtain(c4276e2.f34836n, 11, c4273b2), 120000L);
        this.f34872p.f34829g.c();
        Iterator it = this.f34865f.values().iterator();
        if (it.hasNext()) {
            AbstractC5487d.a(it.next());
            throw null;
        }
    }

    private final void m() {
        this.f34872p.f34836n.removeMessages(12, this.f34862c);
        C4273b c4273b = this.f34862c;
        C4276e c4276e = this.f34872p;
        c4276e.f34836n.sendMessageDelayed(c4276e.f34836n.obtainMessage(12, c4273b), this.f34872p.f34823a);
    }

    private final void n(V v10) {
        v10.d(this.f34863d, a());
        try {
            v10.c(this);
        } catch (DeadObjectException unused) {
            c(1);
            this.f34861b.b("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void o() {
        if (this.f34868l) {
            C4276e c4276e = this.f34872p;
            c4276e.f34836n.removeMessages(11, this.f34862c);
            C4276e c4276e2 = this.f34872p;
            c4276e2.f34836n.removeMessages(9, this.f34862c);
            this.f34868l = false;
        }
    }

    private final boolean p(V v10) throws Resources.NotFoundException {
        if (!(v10 instanceof H)) {
            n(v10);
            return true;
        }
        H h10 = (H) v10;
        C7566d c7566dE = e(h10.g(this));
        if (c7566dE == null) {
            n(v10);
            return true;
        }
        Log.w("GoogleApiManager", this.f34861b.getClass().getName() + " could not execute call because it requires feature (" + c7566dE.b() + ", " + c7566dE.e() + ").");
        if (!this.f34872p.f34837o || !h10.f(this)) {
            h10.b(new UnsupportedApiCallException(c7566dE));
            return true;
        }
        B b10 = new B(this.f34862c, c7566dE, null);
        int iIndexOf = this.f34869m.indexOf(b10);
        if (iIndexOf >= 0) {
            B b11 = (B) this.f34869m.get(iIndexOf);
            this.f34872p.f34836n.removeMessages(15, b11);
            C4276e c4276e = this.f34872p;
            c4276e.f34836n.sendMessageDelayed(Message.obtain(c4276e.f34836n, 15, b11), 5000L);
            return false;
        }
        this.f34869m.add(b10);
        C4276e c4276e2 = this.f34872p;
        c4276e2.f34836n.sendMessageDelayed(Message.obtain(c4276e2.f34836n, 15, b10), 5000L);
        C4276e c4276e3 = this.f34872p;
        c4276e3.f34836n.sendMessageDelayed(Message.obtain(c4276e3.f34836n, 16, b10), 120000L);
        C7564b c7564b = new C7564b(2, null);
        if (q(c7564b)) {
            return false;
        }
        this.f34872p.e(c7564b, this.f34866j);
        return false;
    }

    private final boolean q(C7564b c7564b) {
        synchronized (C4276e.f34821r) {
            try {
                C4276e c4276e = this.f34872p;
                if (c4276e.f34833k == null || !c4276e.f34834l.contains(this.f34862c)) {
                    return false;
                }
                this.f34872p.f34833k.h(c7564b, this.f34866j);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean r(boolean z10) {
        AbstractC7901p.d(this.f34872p.f34836n);
        if (!this.f34861b.isConnected() || !this.f34865f.isEmpty()) {
            return false;
        }
        if (!this.f34863d.e()) {
            this.f34861b.b("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        m();
        return false;
    }

    public final void D() {
        AbstractC7901p.d(this.f34872p.f34836n);
        this.f34870n = null;
    }

    public final void E() {
        AbstractC7901p.d(this.f34872p.f34836n);
        if (this.f34861b.isConnected() || this.f34861b.c()) {
            return;
        }
        try {
            C4276e c4276e = this.f34872p;
            int iB = c4276e.f34829g.b(c4276e.f34827e, this.f34861b);
            if (iB == 0) {
                C4276e c4276e2 = this.f34872p;
                a.f fVar = this.f34861b;
                D d10 = new D(c4276e2, fVar, this.f34862c);
                if (fVar.m()) {
                    ((O) AbstractC7901p.l(this.f34867k)).q0(d10);
                }
                try {
                    this.f34861b.f(d10);
                    return;
                } catch (SecurityException e10) {
                    H(new C7564b(10), e10);
                    return;
                }
            }
            C7564b c7564b = new C7564b(iB, null);
            Log.w("GoogleApiManager", "The service for " + this.f34861b.getClass().getName() + " is not available: " + c7564b.toString());
            H(c7564b, null);
        } catch (IllegalStateException e11) {
            H(new C7564b(10), e11);
        }
    }

    public final void F(V v10) {
        AbstractC7901p.d(this.f34872p.f34836n);
        if (this.f34861b.isConnected()) {
            if (p(v10)) {
                m();
                return;
            } else {
                this.f34860a.add(v10);
                return;
            }
        }
        this.f34860a.add(v10);
        C7564b c7564b = this.f34870n;
        if (c7564b == null || !c7564b.g()) {
            E();
        } else {
            H(this.f34870n, null);
        }
    }

    final void G() {
        this.f34871o++;
    }

    public final void H(C7564b c7564b, Exception exc) {
        AbstractC7901p.d(this.f34872p.f34836n);
        O o10 = this.f34867k;
        if (o10 != null) {
            o10.r0();
        }
        D();
        this.f34872p.f34829g.c();
        g(c7564b);
        if ((this.f34861b instanceof u3.e) && c7564b.b() != 24) {
            this.f34872p.f34824b = true;
            C4276e c4276e = this.f34872p;
            c4276e.f34836n.sendMessageDelayed(c4276e.f34836n.obtainMessage(19), 300000L);
        }
        if (c7564b.b() == 4) {
            h(C4276e.f34820q);
            return;
        }
        if (this.f34860a.isEmpty()) {
            this.f34870n = c7564b;
            return;
        }
        if (exc != null) {
            AbstractC7901p.d(this.f34872p.f34836n);
            i(null, exc, false);
            return;
        }
        if (!this.f34872p.f34837o) {
            h(C4276e.f(this.f34862c, c7564b));
            return;
        }
        i(C4276e.f(this.f34862c, c7564b), null, true);
        if (this.f34860a.isEmpty() || q(c7564b) || this.f34872p.e(c7564b, this.f34866j)) {
            return;
        }
        if (c7564b.b() == 18) {
            this.f34868l = true;
        }
        if (!this.f34868l) {
            h(C4276e.f(this.f34862c, c7564b));
            return;
        }
        C4276e c4276e2 = this.f34872p;
        c4276e2.f34836n.sendMessageDelayed(Message.obtain(c4276e2.f34836n, 9, this.f34862c), 5000L);
    }

    public final void I(C7564b c7564b) {
        AbstractC7901p.d(this.f34872p.f34836n);
        a.f fVar = this.f34861b;
        fVar.b("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c7564b));
        H(c7564b, null);
    }

    public final void J() {
        AbstractC7901p.d(this.f34872p.f34836n);
        if (this.f34868l) {
            E();
        }
    }

    public final void K() {
        AbstractC7901p.d(this.f34872p.f34836n);
        h(C4276e.f34819p);
        this.f34863d.d();
        for (AbstractC4280i abstractC4280i : (AbstractC4280i[]) this.f34865f.keySet().toArray(new AbstractC4280i[0])) {
            F(new U(null, new TaskCompletionSource()));
        }
        g(new C7564b(4));
        if (this.f34861b.isConnected()) {
            this.f34861b.e(new C4295y(this));
        }
    }

    public final void L() {
        AbstractC7901p.d(this.f34872p.f34836n);
        if (this.f34868l) {
            o();
            C4276e c4276e = this.f34872p;
            h(c4276e.f34828f.g(c4276e.f34827e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f34861b.b("Timing out connection while resuming.");
        }
    }

    public final boolean a() {
        return this.f34861b.m();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC4282k
    public final void b(C7564b c7564b) {
        H(c7564b, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC4275d
    public final void c(int i10) {
        if (Looper.myLooper() == this.f34872p.f34836n.getLooper()) {
            l(i10);
        } else {
            this.f34872p.f34836n.post(new RunnableC4293w(this, i10));
        }
    }

    public final boolean d() {
        return r(true);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC4275d
    public final void f(Bundle bundle) {
        if (Looper.myLooper() == this.f34872p.f34836n.getLooper()) {
            k();
        } else {
            this.f34872p.f34836n.post(new RunnableC4292v(this));
        }
    }

    public final int s() {
        return this.f34866j;
    }

    final int t() {
        return this.f34871o;
    }

    public final a.f v() {
        return this.f34861b;
    }

    public final Map x() {
        return this.f34865f;
    }
}
