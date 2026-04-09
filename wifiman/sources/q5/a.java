package Q5;

import Y0.f;
import Y0.t;
import Yg.m;
import Yg.n;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6525a;
import l0.AbstractC6538n;
import l0.C6535k;
import m0.C6683T;
import m0.Q0;
import m0.U0;
import m0.i1;
import mh.InterfaceC6824a;
import o6.C7090a;
import o6.C7094e;
import o6.InterfaceC7092c;
import u6.InterfaceC8137b;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: Q5.a$a, reason: collision with other inner class name */
    public static final class C0673a implements InterfaceC7092c {

        /* renamed from: a, reason: collision with root package name */
        private final m f19181a = n.b(b.f19185a);

        /* renamed from: b, reason: collision with root package name */
        private final m f19182b = n.b(C0674a.f19184a);

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1 f19183c;

        /* renamed from: Q5.a$a$a, reason: collision with other inner class name */
        static final class C0674a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0674a f19184a = new C0674a();

            C0674a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Matrix invoke() {
                return new Matrix();
            }
        }

        /* renamed from: Q5.a$a$b */
        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f19185a = new b();

            b() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final float[] invoke() {
                return new float[8];
            }
        }

        C0673a(i1 i1Var) {
            this.f19183c = i1Var;
        }

        private final Matrix b() {
            return (Matrix) this.f19182b.getValue();
        }

        private final float[] c() {
            return (float[]) this.f19181a.getValue();
        }

        @Override // o6.InterfaceC7092c
        public void a(InterfaceC8137b context, Paint paint, Path path, float f10, float f11, float f12, float f13) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(paint, "paint");
            AbstractC6492s.i(path, "path");
            Q0 q0A = this.f19183c.a(AbstractC6538n.a(f12 - f10, f13 - f11), context.h() ? t.Ltr : t.Rtl, f.a(context.getDensity(), context.y()));
            if (q0A instanceof Q0.b) {
                path.addRect(f10, f11, f12, f13, Path.Direction.CCW);
            } else if (q0A instanceof Q0.c) {
                a.a(path, f10, f11, f12, f13, ((Q0.c) q0A).b(), c());
            } else if (q0A instanceof Q0.a) {
                b().setTranslate(f10, f11);
                U0 u0B = ((Q0.a) q0A).b();
                if (!(u0B instanceof C6683T)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                path.addPath(((C6683T) u0B).v(), b());
            }
            context.d().drawPath(path, paint);
        }
    }

    public static final void a(Path path, float f10, float f11, float f12, float f13, C6535k rect, float[] radii) {
        AbstractC6492s.i(path, "<this>");
        AbstractC6492s.i(rect, "rect");
        AbstractC6492s.i(radii, "radii");
        radii[0] = AbstractC6525a.d(rect.h());
        radii[1] = AbstractC6525a.e(rect.h());
        radii[2] = AbstractC6525a.d(rect.i());
        radii[3] = AbstractC6525a.e(rect.i());
        radii[4] = AbstractC6525a.d(rect.c());
        radii[5] = AbstractC6525a.e(rect.c());
        radii[6] = AbstractC6525a.d(rect.b());
        radii[7] = AbstractC6525a.e(rect.b());
        path.addRoundRect(f10, f11, f12, f13, radii, Path.Direction.CCW);
    }

    public static final InterfaceC7092c b(i1 i1Var) {
        AbstractC6492s.i(i1Var, "<this>");
        return new C0673a(i1Var);
    }

    public static final C7090a c(C7094e dashedShape, InterfaceC7092c shape, float f10, float f11, C7090a.EnumC2003a fitStrategy) {
        AbstractC6492s.i(dashedShape, "$this$dashedShape");
        AbstractC6492s.i(shape, "shape");
        AbstractC6492s.i(fitStrategy, "fitStrategy");
        return new C7090a(shape, f10, f11, fitStrategy);
    }

    public static /* synthetic */ C7090a d(C7094e c7094e, InterfaceC7092c interfaceC7092c, float f10, float f11, C7090a.EnumC2003a enumC2003a, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            enumC2003a = C7090a.EnumC2003a.Resize;
        }
        return c(c7094e, interfaceC7092c, f10, f11, enumC2003a);
    }
}
