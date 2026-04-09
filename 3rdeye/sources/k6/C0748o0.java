package K6;

import H6.C0672i;
import H6.C0675l;
import N7.AbstractC1293o4;
import N7.C1139d9;
import N7.C1322q5;
import N7.C1447z5;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.Ka;
import N7.T2;
import android.util.DisplayMetrics;
import android.view.View;
import b9.C1992A;
import k6.C5228g;
import k6.C5246y;
import org.json.JSONArray;

/* compiled from: DivGridBinder.kt */
/* renamed from: K6.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748o0 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3564h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3565j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3566k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0748o0(Object obj, View view, Object obj2, Object obj3, int i) {
        super(1);
        this.f3563g = i;
        this.i = obj;
        this.f3565j = view;
        this.f3566k = obj2;
        this.f3564h = obj3;
    }

    @Override // p9.l
    public final Object invoke(Object it) {
        switch (this.f3563g) {
            case 0:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                A7.b bVar = (A7.b) this.f3565j;
                A7.d dVar = (A7.d) this.f3564h;
                ((O6.k) this.i).setGravity(C0713c.F((EnumC1305p2) bVar.a(dVar), (EnumC1319q2) ((A7.b) this.f3566k).a(dVar)));
                return C1992A.f18074a;
            case 1:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                C1447z5 c1447z5 = (C1447z5) this.f3566k;
                A7.b<Integer> bVar2 = c1447z5.f10049P;
                A7.d dVar2 = (A7.d) this.f3564h;
                Integer numA = bVar2 != null ? bVar2.a(dVar2) : null;
                T2 t2A = c1447z5.f10050Q.a(dVar2);
                ((C0752q0) this.i).getClass();
                C0752q0.q((O6.n) this.f3565j, numA, t2A);
                return C1992A.f18074a;
            case 2:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                ((V0) this.i).m((A7.d) this.f3564h, (C1139d9) this.f3566k, (O6.w) this.f3565j);
                return C1992A.f18074a;
            case 3:
                kotlin.jvm.internal.l.f(it, "it");
                AbstractC1293o4 abstractC1293o4 = (AbstractC1293o4) this.f3566k;
                ((Z0) this.i).getClass();
                O6.y yVar = (O6.y) this.f3565j;
                DisplayMetrics displayMetrics = yVar.getResources().getDisplayMetrics();
                kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
                yVar.setThumbDrawable(C0713c.b0(abstractC1293o4, displayMetrics, (A7.d) this.f3564h));
                return C1992A.f18074a;
            case 4:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                Ka ka2 = (Ka) this.f3566k;
                A7.b<Long> bVar3 = ka2.f5638L;
                A7.d dVar3 = (A7.d) this.f3564h;
                Long lA = bVar3 != null ? bVar3.a(dVar3) : null;
                A7.b<Long> bVar4 = ka2.f5639M;
                Long lA2 = bVar4 != null ? bVar4.a(dVar3) : null;
                ((y1) this.i).getClass();
                y1.r((O6.q) this.f3565j, lA, lA2);
                return C1992A.f18074a;
            case 5:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                ((L6.b) this.i).m((O6.v) this.f3565j, (C0672i) this.f3566k, (C1322q5) this.f3564h);
                return C1992A.f18074a;
            default:
                JSONArray array = (JSONArray) it;
                kotlin.jvm.internal.l.f(array, "array");
                int length = array.length();
                Object obj = this.f3564h;
                Integer num = (Integer) this.i;
                if (num == null || num.intValue() == length) {
                    return C5228g.a(array, new C9.r(obj, 10));
                }
                v9.g gVarO = v9.h.O(0, length);
                int iIntValue = num.intValue();
                if (gVarO.f47096b <= iIntValue && iIntValue <= gVarO.f47097c) {
                    return C5228g.a(array, new H6.y(6, num, obj));
                }
                C5246y.d((C0675l) this.f3565j, new IndexOutOfBoundsException("Index out of bound (" + num + ") for mutation " + ((String) this.f3566k) + " (" + length + ')'));
                return array;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0748o0(Object obj, Object obj2, A7.d dVar, Object obj3, int i) {
        super(1);
        this.f3563g = i;
        this.i = obj;
        this.f3565j = obj2;
        this.f3564h = dVar;
        this.f3566k = obj3;
    }
}
