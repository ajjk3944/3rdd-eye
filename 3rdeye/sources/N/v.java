package N;

import C.C0621h;
import C.S;
import C.X;
import C.d0;
import N.s;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.impl.C1701m;
import androidx.camera.core.impl.J;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: SurfaceProcessorNode.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final u f4460a;

    /* renamed from: b, reason: collision with root package name */
    public final J f4461b;

    /* renamed from: c, reason: collision with root package name */
    public c f4462c;

    /* compiled from: SurfaceProcessorNode.java */
    public class a implements I.c<d0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f4463b;

        public a(s sVar) {
            this.f4463b = sVar;
        }

        @Override // I.c
        public final void onFailure(Throwable th) {
            int i = this.f4463b.f4437f;
            if (i == 2 && (th instanceof CancellationException)) {
                S.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            S.h("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + A2.l.x(i), th);
        }

        @Override // I.c
        public final void onSuccess(d0 d0Var) throws X {
            d0 d0Var2 = d0Var;
            d0Var2.getClass();
            v.this.f4460a.b(d0Var2);
        }
    }

    /* compiled from: SurfaceProcessorNode.java */
    public static abstract class b {
        public abstract List<P.f> a();

        public abstract s b();
    }

    /* compiled from: SurfaceProcessorNode.java */
    public static class c extends HashMap<P.f, s> {
    }

    public v(J j4, u uVar) {
        this.f4461b = j4;
        this.f4460a = uVar;
    }

    public final void a(s sVar, Map.Entry<P.f, s> entry) {
        s value = entry.getValue();
        C0621h c0621h = null;
        C0621h c0621h2 = new C0621h(sVar.f4438g.d(), entry.getKey().a(), sVar.f4434c ? this.f4461b : null, entry.getKey().c(), entry.getKey().g());
        int iB = entry.getKey().b();
        value.getClass();
        G.n.a();
        value.b();
        A2.l.q("Consumer can only be linked once.", !value.f4440j);
        value.f4440j = true;
        s.a aVar = value.f4442l;
        I.j.a(I.j.j(aVar.c(), new r(value, aVar, iB, c0621h2, c0621h), E.u.H()), new a(value), E.u.H());
    }

    public final void b() {
        this.f4460a.release();
        G.n.c(new C2.h(this, 7));
    }

    public final c c(N.c cVar) {
        Rect rect;
        G.n.a();
        this.f4462c = new c();
        Iterator<P.f> it = cVar.f4375b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            s sVar = cVar.f4374a;
            if (!zHasNext) {
                this.f4460a.a(sVar.d(this.f4461b, true));
                for (Map.Entry<P.f, s> entry : this.f4462c.entrySet()) {
                    a(sVar, entry);
                    entry.getValue().a(new J4.e(this, sVar, entry, 1));
                }
                sVar.f4445o.add(new E.k(this.f4462c, 1));
                return this.f4462c;
            }
            P.f next = it.next();
            c cVar2 = this.f4462c;
            Rect rectA = next.a();
            int iC = next.c();
            boolean zG = next.g();
            Matrix matrix = new Matrix(sVar.f4433b);
            RectF rectF = new RectF(rectA);
            Size sizeD = next.d();
            RectF rectF2 = G.o.f1843a;
            float f10 = 0;
            Matrix matrixA = G.o.a(rectF, new RectF(f10, f10, sizeD.getWidth(), sizeD.getHeight()), iC, zG);
            matrix.postConcat(matrixA);
            A2.l.l(G.o.d(G.o.g(G.o.e(rectA), iC), false, next.d()));
            if (next.h()) {
                Rect rectA2 = next.a();
                Rect rect2 = sVar.f4435d;
                A2.l.k("Output crop rect " + next.a() + " must contain input crop rect " + rect2, rectA2.contains(rect2));
                rect = new Rect();
                RectF rectF3 = new RectF(rect2);
                matrixA.mapRect(rectF3);
                rectF3.round(rect);
            } else {
                Size sizeD2 = next.d();
                rect = new Rect(0, 0, sizeD2.getWidth(), sizeD2.getHeight());
            }
            Rect rect3 = rect;
            C1701m.a aVarF = sVar.f4438g.f();
            Size sizeD3 = next.d();
            if (sizeD3 == null) {
                throw new NullPointerException("Null resolution");
            }
            aVarF.f15090a = sizeD3;
            cVar2.put(next, new s(next.e(), next.b(), aVarF.a(), matrix, false, rect3, sVar.i - iC, -1, sVar.f4436e != zG));
        }
    }
}
