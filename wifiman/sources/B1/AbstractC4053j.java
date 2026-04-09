package b1;

import Yg.J;
import android.util.Log;
import androidx.compose.ui.layout.t;
import g1.C5850h;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import m0.p1;
import mh.InterfaceC6835l;

/* renamed from: b1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4053j {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f32745a = false;

    /* renamed from: b1.j$a */
    public static final class a {
        a() {
        }
    }

    /* renamed from: b1.j$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5850h f32746a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C5850h c5850h) {
            super(1);
            this.f32746a = c5850h;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            if (!Float.isNaN(this.f32746a.f47502f) || !Float.isNaN(this.f32746a.f47503g)) {
                cVar.y1(p1.a(Float.isNaN(this.f32746a.f47502f) ? 0.5f : this.f32746a.f47502f, Float.isNaN(this.f32746a.f47503g) ? 0.5f : this.f32746a.f47503g));
            }
            if (!Float.isNaN(this.f32746a.f47504h)) {
                cVar.m(this.f32746a.f47504h);
            }
            if (!Float.isNaN(this.f32746a.f47505i)) {
                cVar.d(this.f32746a.f47505i);
            }
            if (!Float.isNaN(this.f32746a.f47506j)) {
                cVar.e(this.f32746a.f47506j);
            }
            if (!Float.isNaN(this.f32746a.f47507k)) {
                cVar.j(this.f32746a.f47507k);
            }
            if (!Float.isNaN(this.f32746a.f47508l)) {
                cVar.f(this.f32746a.f47508l);
            }
            if (!Float.isNaN(this.f32746a.f47509m)) {
                cVar.o(this.f32746a.f47509m);
            }
            if (!Float.isNaN(this.f32746a.f47510n) || !Float.isNaN(this.f32746a.f47511o)) {
                cVar.i(Float.isNaN(this.f32746a.f47510n) ? 1.0f : this.f32746a.f47510n);
                cVar.g(Float.isNaN(this.f32746a.f47511o) ? 1.0f : this.f32746a.f47511o);
            }
            if (Float.isNaN(this.f32746a.f47512p)) {
                return;
            }
            cVar.a(this.f32746a.f47512p);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return J.f24997a;
        }
    }

    public static final void c(C4040B c4040b, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0.B b10 = (C0.B) list.get(i10);
            Object objA = androidx.compose.ui.layout.f.a(b10);
            if (objA == null && (objA = m.a(b10)) == null) {
                objA = d();
            }
            c4040b.s(objA.toString(), b10);
            Object objB = m.b(b10);
            if (objB != null && (objB instanceof String) && (objA instanceof String)) {
                c4040b.y((String) objA, (String) objB);
            }
        }
    }

    public static final Object d() {
        return new a();
    }

    public static final void e(t.a aVar, androidx.compose.ui.layout.t tVar, C5850h c5850h, long j10) {
        if (c5850h.f47514r != 8) {
            if (c5850h.d()) {
                t.a.j(aVar, tVar, Y0.o.a(c5850h.f47498b - Y0.n.h(j10), c5850h.f47499c - Y0.n.i(j10)), 0.0f, 2, null);
                return;
            } else {
                aVar.u(tVar, c5850h.f47498b - Y0.n.h(j10), c5850h.f47499c - Y0.n.i(j10), Float.isNaN(c5850h.f47509m) ? 0.0f : c5850h.f47509m, new b(c5850h));
                return;
            }
        }
        if (f32745a) {
            Log.d("CCL", "Widget: " + c5850h.c() + " is Gone. Skipping placement.");
        }
    }

    public static /* synthetic */ void f(t.a aVar, androidx.compose.ui.layout.t tVar, C5850h c5850h, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = Y0.n.f24536b.a();
        }
        e(aVar, tVar, c5850h, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(j1.e eVar) {
        return eVar.q() + " width " + eVar.O() + " minWidth " + eVar.D() + " maxWidth " + eVar.B() + " height " + eVar.u() + " minHeight " + eVar.C() + " maxHeight " + eVar.A() + " HDB " + eVar.x() + " VDB " + eVar.M() + " MCW " + eVar.f49936w + " MCH " + eVar.f49938x + " percentW " + eVar.f49859B + " percentH " + eVar.f49865E;
    }
}
