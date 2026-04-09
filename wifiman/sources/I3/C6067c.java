package i3;

import a3.j;
import c3.AbstractC4208i;
import c3.AbstractC4215p;
import c3.C4220u;
import d3.InterfaceC5291e;
import d3.InterfaceC5299m;
import j3.x;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k3.InterfaceC6370d;
import l3.InterfaceC6542a;

/* renamed from: i3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6067c implements InterfaceC6069e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f48807f = Logger.getLogger(C4220u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f48808a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f48809b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5291e f48810c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6370d f48811d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6542a f48812e;

    public C6067c(Executor executor, InterfaceC5291e interfaceC5291e, x xVar, InterfaceC6370d interfaceC6370d, InterfaceC6542a interfaceC6542a) {
        this.f48809b = executor;
        this.f48810c = interfaceC5291e;
        this.f48808a = xVar;
        this.f48811d = interfaceC6370d;
        this.f48812e = interfaceC6542a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(AbstractC4215p abstractC4215p, AbstractC4208i abstractC4208i) {
        this.f48811d.N(abstractC4215p, abstractC4208i);
        this.f48808a.b(abstractC4215p, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final AbstractC4215p abstractC4215p, j jVar, AbstractC4208i abstractC4208i) {
        try {
            InterfaceC5299m interfaceC5299m = this.f48810c.get(abstractC4215p.b());
            if (interfaceC5299m == null) {
                String str = String.format("Transport backend '%s' is not registered", abstractC4215p.b());
                f48807f.warning(str);
                jVar.a(new IllegalArgumentException(str));
            } else {
                final AbstractC4208i abstractC4208iB = interfaceC5299m.b(abstractC4208i);
                this.f48812e.h(new InterfaceC6542a.InterfaceC1933a() { // from class: i3.b
                    @Override // l3.InterfaceC6542a.InterfaceC1933a
                    public final Object g() {
                        return this.f48804a.d(abstractC4215p, abstractC4208iB);
                    }
                });
                jVar.a(null);
            }
        } catch (Exception e10) {
            f48807f.warning("Error scheduling event " + e10.getMessage());
            jVar.a(e10);
        }
    }

    @Override // i3.InterfaceC6069e
    public void a(final AbstractC4215p abstractC4215p, final AbstractC4208i abstractC4208i, final j jVar) {
        this.f48809b.execute(new Runnable() { // from class: i3.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f48800a.e(abstractC4215p, jVar, abstractC4208i);
            }
        });
    }
}
