package androidx.work.impl;

import C0.C0146b;
import C0.l;
import C0.s;
import G0.b;
import K4.c;
import V2.e;
import V2.h;
import android.content.Context;
import c1.g;
import h0.C2351a;
import java.util.HashMap;
import q5.i;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f5676t = 0;

    /* renamed from: m, reason: collision with root package name */
    public volatile c f5677m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C2351a f5678n;

    /* renamed from: o, reason: collision with root package name */
    public volatile h f5679o;

    /* renamed from: p, reason: collision with root package name */
    public volatile e f5680p;

    /* renamed from: q, reason: collision with root package name */
    public volatile C2351a f5681q;

    /* renamed from: r, reason: collision with root package name */
    public volatile g f5682r;

    /* renamed from: s, reason: collision with root package name */
    public volatile h f5683s;

    @Override // C0.p
    public final l d() {
        return new l(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // C0.p
    public final b e(C0146b c0146b) {
        s sVar = new s(c0146b, new L4.e(this), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = c0146b.f1030a;
        i.e(context, "context");
        return c0146b.f1032c.j(new A1.s(context, c0146b.f1031b, sVar, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C2351a o() {
        C2351a c2351a;
        if (this.f5678n != null) {
            return this.f5678n;
        }
        synchronized (this) {
            try {
                if (this.f5678n == null) {
                    this.f5678n = new C2351a(this, 22);
                }
                c2351a = this.f5678n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2351a;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h p() {
        h hVar;
        if (this.f5683s != null) {
            return this.f5683s;
        }
        synchronized (this) {
            try {
                if (this.f5683s == null) {
                    this.f5683s = new h(this, 20);
                }
                hVar = this.f5683s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e q() {
        e eVar;
        if (this.f5680p != null) {
            return this.f5680p;
        }
        synchronized (this) {
            try {
                if (this.f5680p == null) {
                    this.f5680p = new e(this);
                }
                eVar = this.f5680p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C2351a r() {
        C2351a c2351a;
        if (this.f5681q != null) {
            return this.f5681q;
        }
        synchronized (this) {
            try {
                if (this.f5681q == null) {
                    this.f5681q = new C2351a(this, 23);
                }
                c2351a = this.f5681q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2351a;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final g s() {
        g gVar;
        if (this.f5682r != null) {
            return this.f5682r;
        }
        synchronized (this) {
            try {
                if (this.f5682r == null) {
                    this.f5682r = new g(this);
                }
                gVar = this.f5682r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c t() {
        c cVar;
        if (this.f5677m != null) {
            return this.f5677m;
        }
        synchronized (this) {
            try {
                if (this.f5677m == null) {
                    this.f5677m = new c(this);
                }
                cVar = this.f5677m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h u() {
        h hVar;
        if (this.f5679o != null) {
            return this.f5679o;
        }
        synchronized (this) {
            try {
                if (this.f5679o == null) {
                    this.f5679o = new h(this, 21);
                }
                hVar = this.f5679o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }
}
