package i7;

import H6.C0675l;
import N7.C1154e9;
import b9.C1992A;
import b9.m;
import b9.n;
import k6.C5246y;
import o6.C5426c;

/* compiled from: VariableMutationHandler.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final a f38481a = new a();

    /* compiled from: VariableMutationHandler.kt */
    public static final class a {
        public static Z6.f a(C0675l div2View, String name, String value, A7.d resolver) {
            C5426c expressionsRuntime$div_release;
            Object objA;
            kotlin.jvm.internal.l.f(div2View, "div2View");
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(value, "value");
            kotlin.jvm.internal.l.f(resolver, "resolver");
            p6.h runtimeStore$div_release = div2View.getRuntimeStore$div_release();
            if (runtimeStore$div_release == null || (expressionsRuntime$div_release = runtimeStore$div_release.c(resolver)) == null) {
                expressionsRuntime$div_release = div2View.getExpressionsRuntime$div_release();
            }
            Z6.d dVarA = expressionsRuntime$div_release != null ? expressionsRuntime$div_release.f44858b.a(name) : null;
            if (dVarA == null) {
                Z6.f fVar = new Z6.f(C1154e9.i("Variable '", name, "' not defined!"), null);
                C5246y.d(div2View, fVar);
                return fVar;
            }
            try {
                dVarA.d(value);
                objA = C1992A.f18074a;
            } catch (Throwable th) {
                objA = n.a(th);
            }
            Throwable thA = m.a(objA);
            if (thA == null) {
                return null;
            }
            l.f38481a.getClass();
            Z6.f fVar2 = new Z6.f("Variable '" + name + "' mutation failed!", thA);
            C5246y.d(div2View, fVar2);
            return fVar2;
        }

        public static void b(C0675l c0675l, String name, A7.d dVar, p9.l lVar) {
            C5426c expressionsRuntime$div_release;
            Object objA;
            kotlin.jvm.internal.l.f(name, "name");
            p6.h runtimeStore$div_release = c0675l.getRuntimeStore$div_release();
            if (runtimeStore$div_release == null || (expressionsRuntime$div_release = runtimeStore$div_release.c(dVar)) == null) {
                expressionsRuntime$div_release = c0675l.getExpressionsRuntime$div_release();
            }
            Z6.d dVarA = expressionsRuntime$div_release != null ? expressionsRuntime$div_release.f44858b.a(name) : null;
            if (dVarA == null) {
                C5246y.d(c0675l, new Z6.f(C1154e9.i("Variable '", name, "' not defined!"), null));
                return;
            }
            try {
                dVarA.e((Z6.d) lVar.invoke(dVarA));
                objA = C1992A.f18074a;
            } catch (Throwable th) {
                objA = n.a(th);
            }
            Throwable thA = m.a(objA);
            if (thA == null) {
                return;
            }
            l.f38481a.getClass();
            C5246y.d(c0675l, new Z6.f("Variable '" + name + "' mutation failed!", thA));
        }
    }
}
