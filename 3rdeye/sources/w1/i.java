package w1;

import F1.c;
import J8.C0692g;
import android.content.Context;
import c9.C2097r;
import c9.C2099t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import w1.AbstractC5715a;
import w1.k;
import w1.l;
import y1.C5796g;
import y1.InterfaceC5791b;
import z1.C5852a;
import z1.C5853b;

/* compiled from: RoomConnectionManager.android.kt */
/* loaded from: classes.dex */
public final class i extends AbstractC5715a {

    /* renamed from: c, reason: collision with root package name */
    public final C5716b f47225c;

    /* renamed from: d, reason: collision with root package name */
    public final l f47226d;

    /* renamed from: e, reason: collision with root package name */
    public final List<k.b> f47227e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC5791b f47228f;

    /* renamed from: g, reason: collision with root package name */
    public F1.b f47229g;

    /* compiled from: RoomConnectionManager.android.kt */
    public static final class a extends l {
        @Override // w1.l
        public final void a(E1.a connection) {
            kotlin.jvm.internal.l.f(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // w1.l
        public final void b(E1.a connection) {
            kotlin.jvm.internal.l.f(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // w1.l
        public final void c(E1.a connection) {
            kotlin.jvm.internal.l.f(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // w1.l
        public final void d(E1.a connection) {
            kotlin.jvm.internal.l.f(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // w1.l
        public final void e(E1.a connection) {
            kotlin.jvm.internal.l.f(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // w1.l
        public final void f(E1.a connection) {
            kotlin.jvm.internal.l.f(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // w1.l
        public final l.a g(E1.a connection) {
            kotlin.jvm.internal.l.f(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    /* compiled from: RoomConnectionManager.android.kt */
    public final class b extends c.a {
        public b(int i) {
            super(i);
        }

        @Override // F1.c.a
        public final void c(G1.d dVar) {
            i.this.f(new C5852a(dVar));
        }

        @Override // F1.c.a
        public final void d(G1.d dVar, int i, int i10) {
            f(dVar, i, i10);
        }

        @Override // F1.c.a
        public final void e(G1.d dVar) {
            C5852a c5852a = new C5852a(dVar);
            i iVar = i.this;
            iVar.h(c5852a);
            iVar.f47229g = dVar;
        }

        @Override // F1.c.a
        public final void f(G1.d dVar, int i, int i10) {
            i.this.g(new C5852a(dVar), i, i10);
        }
    }

    public i(C5716b c5716b, l lVar) {
        int i;
        C5796g c5796g;
        this.f47225c = c5716b;
        this.f47226d = lVar;
        List<k.b> list = c5716b.f47202e;
        this.f47227e = list == null ? C2099t.f18581b : list;
        k.c cVar = c5716b.f47204g;
        String str = c5716b.f47199b;
        E1.b bVar = c5716b.f47216t;
        if (bVar == null) {
            c.InterfaceC0026c interfaceC0026c = c5716b.f47200c;
            if (interfaceC0026c == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            Context context = c5716b.f47198a;
            kotlin.jvm.internal.l.f(context, "context");
            this.f47228f = new C5853b(new A3.c(interfaceC0026c.a(new c.b(context, str, new b(lVar.f47260a), false, false))));
        } else {
            if (str == null) {
                c5796g = new C5796g(new AbstractC5715a.C0543a(this, bVar));
            } else {
                AbstractC5715a.C0543a c0543a = new AbstractC5715a.C0543a(this, bVar);
                kotlin.jvm.internal.l.f(cVar, "<this>");
                int[] iArr = AbstractC5715a.b.f47197a;
                int i10 = iArr[cVar.ordinal()];
                if (i10 == 1) {
                    i = 1;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + cVar + '\'').toString());
                    }
                    i = 4;
                }
                int i11 = iArr[cVar.ordinal()];
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + cVar + '\'').toString());
                }
                c5796g = new C5796g(c0543a, str, i);
            }
            this.f47228f = c5796g;
        }
        boolean z10 = cVar == k.c.WRITE_AHEAD_LOGGING;
        F1.c cVarJ = j();
        if (cVarJ != null) {
            cVarJ.setWriteAheadLoggingEnabled(z10);
        }
    }

    @Override // w1.AbstractC5715a
    public final List<k.b> c() {
        return this.f47227e;
    }

    @Override // w1.AbstractC5715a
    public final C5716b d() {
        return this.f47225c;
    }

    @Override // w1.AbstractC5715a
    public final l e() {
        return this.f47226d;
    }

    public final F1.c j() {
        A3.c cVar;
        InterfaceC5791b interfaceC5791b = this.f47228f;
        C5853b c5853b = interfaceC5791b instanceof C5853b ? (C5853b) interfaceC5791b : null;
        if (c5853b == null || (cVar = c5853b.f48411b) == null) {
            return null;
        }
        return (F1.c) cVar.f36c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(C5716b c5716b, D8.g gVar) {
        this.f47225c = c5716b;
        this.f47226d = new a(-1, "", "");
        List list = C2099t.f18581b;
        List list2 = c5716b.f47202e;
        this.f47227e = list2 == null ? list : list2;
        ArrayList arrayListZ0 = C2097r.z0(list2 != null ? list2 : list, new j(new C0692g(this, 2)));
        Context context = c5716b.f47198a;
        kotlin.jvm.internal.l.f(context, "context");
        k.d migrationContainer = c5716b.f47201d;
        kotlin.jvm.internal.l.f(migrationContainer, "migrationContainer");
        k.c journalMode = c5716b.f47204g;
        kotlin.jvm.internal.l.f(journalMode, "journalMode");
        Executor queryExecutor = c5716b.f47205h;
        kotlin.jvm.internal.l.f(queryExecutor, "queryExecutor");
        Executor transactionExecutor = c5716b.i;
        kotlin.jvm.internal.l.f(transactionExecutor, "transactionExecutor");
        List<Object> typeConverters = c5716b.f47213q;
        kotlin.jvm.internal.l.f(typeConverters, "typeConverters");
        List<Object> autoMigrationSpecs = c5716b.f47214r;
        kotlin.jvm.internal.l.f(autoMigrationSpecs, "autoMigrationSpecs");
        this.f47228f = new C5853b(new A3.c((F1.c) gVar.invoke(new C5716b(context, c5716b.f47199b, c5716b.f47200c, migrationContainer, arrayListZ0, c5716b.f47203f, journalMode, queryExecutor, transactionExecutor, c5716b.f47206j, c5716b.f47207k, c5716b.f47208l, c5716b.f47209m, c5716b.f47210n, c5716b.f47211o, c5716b.f47212p, typeConverters, autoMigrationSpecs, c5716b.f47215s, c5716b.f47216t, c5716b.f47217u))));
        boolean z10 = journalMode == k.c.WRITE_AHEAD_LOGGING;
        F1.c cVarJ = j();
        if (cVarJ != null) {
            cVarJ.setWriteAheadLoggingEnabled(z10);
        }
    }
}
