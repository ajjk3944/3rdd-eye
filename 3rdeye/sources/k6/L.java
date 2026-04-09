package K6;

import H6.C0675l;
import N7.C1175g0;
import N7.Q6;
import android.net.Uri;
import android.view.View;
import b9.C1992A;
import h7.C4421b;
import java.util.LinkedHashMap;

/* compiled from: DivBaseBinder.kt */
/* loaded from: classes.dex */
public final class L extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3263g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3264h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i, Object obj, Object obj2) {
        super(1);
        this.f3263g = i;
        this.f3264h = obj;
        this.i = obj2;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        Uri uriA;
        Object obj2 = this.i;
        Object obj3 = this.f3264h;
        switch (this.f3263g) {
            case 0:
                String id = (String) obj;
                kotlin.jvm.internal.l.f(id, "id");
                ((View) obj3).setNextFocusDownId(((H6.I) obj2).f(id));
                return C1992A.f18074a;
            case 1:
                O6.y yVar = (O6.y) obj3;
                yVar.setMinValue(((Number) obj).longValue());
                ((Z0) obj2).o(yVar);
                return C1992A.f18074a;
            case 2:
                C1175g0 it = (C1175g0) obj;
                kotlin.jvm.internal.l.f(it, "it");
                v1 v1Var = (v1) obj3;
                v1Var.f3667l.getClass();
                C0719e c0719e = v1Var.i;
                c0719e.getClass();
                A7.d resolver = (A7.d) obj2;
                kotlin.jvm.internal.l.f(resolver, "resolver");
                A7.b<Uri> bVar = it.f8256d;
                if (bVar != null && (uriA = bVar.a(resolver)) != null) {
                    if (!C0719e.a(uriA.getScheme())) {
                        int i = C4421b.f38269a;
                        C4421b.a(C7.a.WARNING);
                    } else if (c0719e.f3438d && c0719e.f3435a.get() != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        A7.b<Uri> bVar2 = it.f8259g;
                        if (bVar2 != null) {
                            String string = bVar2.a(resolver).toString();
                            kotlin.jvm.internal.l.e(string, "referer.evaluate(resolver).toString()");
                            linkedHashMap.put("Referer", string);
                        }
                        throw null;
                    }
                }
                return C1992A.f18074a;
            default:
                Q6 strikethrough = (Q6) obj;
                kotlin.jvm.internal.l.f(strikethrough, "strikethrough");
                ((y1) obj3).getClass();
                y1.w((O6.q) obj2, strikethrough);
                return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(v1 v1Var, C0675l c0675l, A7.d dVar, O6.A a10) {
        super(1);
        this.f3263g = 2;
        this.f3264h = v1Var;
        this.i = dVar;
    }
}
