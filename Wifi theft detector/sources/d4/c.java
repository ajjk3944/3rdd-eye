package d4;

import e4.u;
import g4.a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import x3.o;
import x3.t;
import y3.k;

/* loaded from: classes2.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f20745f = Logger.getLogger(t.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final u f20746a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f20747b;

    /* renamed from: c, reason: collision with root package name */
    public final y3.d f20748c;

    /* renamed from: d, reason: collision with root package name */
    public final f4.d f20749d;

    /* renamed from: e, reason: collision with root package name */
    public final g4.a f20750e;

    public c(Executor executor, y3.d dVar, u uVar, f4.d dVar2, g4.a aVar) {
        this.f20747b = executor;
        this.f20748c = dVar;
        this.f20746a = uVar;
        this.f20749d = dVar2;
        this.f20750e = aVar;
    }

    public static /* synthetic */ Object b(c cVar, o oVar, x3.i iVar) {
        cVar.f20749d.F(oVar, iVar);
        cVar.f20746a.a(oVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final c cVar, final o oVar, u3.g gVar, x3.i iVar) {
        cVar.getClass();
        try {
            k kVar = cVar.f20748c.get(oVar.b());
            if (kVar == null) {
                String str = String.format("Transport backend '%s' is not registered", oVar.b());
                f20745f.warning(str);
                gVar.a(new IllegalArgumentException(str));
            } else {
                final x3.i iVarA = kVar.a(iVar);
                cVar.f20750e.a(new a.InterfaceC0402a() { // from class: d4.b
                    @Override // g4.a.InterfaceC0402a
                    public final Object execute() {
                        return c.b(this.f20742a, oVar, iVarA);
                    }
                });
                gVar.a(null);
            }
        } catch (Exception e10) {
            f20745f.warning("Error scheduling event " + e10.getMessage());
            gVar.a(e10);
        }
    }

    @Override // d4.e
    public void a(final o oVar, final x3.i iVar, final u3.g gVar) {
        this.f20747b.execute(new Runnable() { // from class: d4.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f20738a, oVar, gVar, iVar);
            }
        });
    }
}
