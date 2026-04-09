package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22350b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final o0[] f22351a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public final class a extends x1 {

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f22352h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: e, reason: collision with root package name */
        public final o f22353e;

        /* renamed from: f, reason: collision with root package name */
        public y0 f22354f;

        public a(o oVar) {
            this.f22353e = oVar;
        }

        public final b B() {
            return (b) f22352h.get(this);
        }

        public final y0 C() {
            y0 y0Var = this.f22354f;
            if (y0Var != null) {
                return y0Var;
            }
            kotlin.jvm.internal.p.t("handle");
            return null;
        }

        public final void E(b bVar) {
            f22352h.set(this, bVar);
        }

        public final void F(y0 y0Var) {
            this.f22354f = y0Var;
        }

        @Override // l9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            y((Throwable) obj);
            return y8.s.f25199a;
        }

        @Override // kotlinx.coroutines.e0
        public void y(Throwable th) {
            if (th != null) {
                Object objI = this.f22353e.i(th);
                if (objI != null) {
                    this.f22353e.C(objI);
                    b bVarB = B();
                    if (bVarB != null) {
                        bVarB.j();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.d().decrementAndGet(e.this) == 0) {
                o oVar = this.f22353e;
                o0[] o0VarArr = e.this.f22351a;
                ArrayList arrayList = new ArrayList(o0VarArr.length);
                for (o0 o0Var : o0VarArr) {
                    arrayList.add(o0Var.l());
                }
                oVar.resumeWith(Result.b(arrayList));
            }
        }
    }

    public final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        public final a[] f22356a;

        public b(a[] aVarArr) {
            this.f22356a = aVarArr;
        }

        @Override // kotlinx.coroutines.n
        public void i(Throwable th) {
            j();
        }

        @Override // l9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Throwable) obj);
            return y8.s.f25199a;
        }

        public final void j() {
            for (a aVar : this.f22356a) {
                aVar.C().d();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f22356a + ']';
        }
    }

    public e(o0[] o0VarArr) {
        this.f22351a = o0VarArr;
        this.notCompletedCount$volatile = o0VarArr.length;
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f22350b;
    }

    public final Object c(c9.c cVar) {
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        pVar.F();
        int length = this.f22351a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            o0 o0Var = this.f22351a[i10];
            o0Var.start();
            a aVar = new a(pVar);
            aVar.F(o0Var.U(aVar));
            y8.s sVar = y8.s.f25199a;
            aVarArr[i10] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].E(bVar);
        }
        if (pVar.d()) {
            bVar.j();
        } else {
            pVar.e(bVar);
        }
        Object objW = pVar.w();
        if (objW == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objW;
    }
}
