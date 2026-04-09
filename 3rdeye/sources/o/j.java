package O;

import A2.l;
import C.C0621h;
import C.S;
import C.X;
import C.d0;
import E.u;
import G.n;
import N.r;
import N.s;
import androidx.camera.core.impl.J;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: DualSurfaceProcessorNode.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final h f10166a;

    /* renamed from: b, reason: collision with root package name */
    public final J f10167b;

    /* renamed from: c, reason: collision with root package name */
    public final J f10168c;

    /* renamed from: d, reason: collision with root package name */
    public c f10169d;

    /* renamed from: e, reason: collision with root package name */
    public O.b f10170e;

    /* compiled from: DualSurfaceProcessorNode.java */
    public class a implements I.c<d0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f10171b;

        public a(s sVar) {
            this.f10171b = sVar;
        }

        @Override // I.c
        public final void onFailure(Throwable th) {
            int i = this.f10171b.f4437f;
            if (i == 2 && (th instanceof CancellationException)) {
                S.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            S.h("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + l.x(i), th);
        }

        @Override // I.c
        public final void onSuccess(d0 d0Var) throws IOException, X {
            d0 d0Var2 = d0Var;
            d0Var2.getClass();
            j.this.f10166a.b(d0Var2);
        }
    }

    /* compiled from: DualSurfaceProcessorNode.java */
    public static abstract class b {
        public abstract List<d> a();

        public abstract s b();

        public abstract s c();
    }

    /* compiled from: DualSurfaceProcessorNode.java */
    public static class c extends HashMap<d, s> {
    }

    public j(J j4, J j10, h hVar) {
        this.f10167b = j4;
        this.f10168c = j10;
        this.f10166a = hVar;
    }

    public final void a(J j4, J j10, s sVar, s sVar2, Map.Entry<d, s> entry) {
        s value = entry.getValue();
        C0621h c0621h = new C0621h(sVar.f4438g.d(), entry.getKey().a().a(), sVar.f4434c ? j4 : null, entry.getKey().a().c(), entry.getKey().a().g());
        C0621h c0621h2 = new C0621h(sVar2.f4438g.d(), entry.getKey().b().a(), sVar2.f4434c ? j10 : null, entry.getKey().b().c(), entry.getKey().b().g());
        int iB = entry.getKey().a().b();
        value.getClass();
        n.a();
        value.b();
        l.q("Consumer can only be linked once.", !value.f4440j);
        value.f4440j = true;
        s.a aVar = value.f4442l;
        I.j.a(I.j.j(aVar.c(), new r(value, aVar, iB, c0621h, c0621h2), u.H()), new a(value), u.H());
    }
}
