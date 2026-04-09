package K6;

import H6.C0672i;
import H6.C0675l;
import N7.C1139d9;
import N7.EnumC1195h5;
import N7.H9;
import N7.S2;
import android.view.View;
import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import z6.C5865d;

/* compiled from: DivSelectBinder.kt */
/* loaded from: classes.dex */
public final class V0 extends H6.B {

    /* renamed from: c, reason: collision with root package name */
    public final B0.f f3351c;

    /* renamed from: d, reason: collision with root package name */
    public final s6.h f3352d;

    /* renamed from: e, reason: collision with root package name */
    public final Q6.d f3353e;

    public V0(D d10, B0.f fVar, s6.h hVar, Q6.d dVar) {
        super(d10);
        this.f3351c = fVar;
        this.f3352d = hVar;
        this.f3353e = dVar;
    }

    @Override // H6.B
    public final void e(View view, C0672i c0672i, S2 s22, S2 s23, C5865d path) {
        j6.d dVarE;
        O6.w wVar = (O6.w) view;
        C1139d9 c1139d9 = (C1139d9) s22;
        kotlin.jvm.internal.l.f(wVar, "<this>");
        kotlin.jvm.internal.l.f(path, "path");
        wVar.setTextAlignment(5);
        C0675l c0675l = c0672i.f2146a;
        wVar.setFocusTracker(c0675l.getInputFocusTracker$div_release());
        C0716d c0716dZ = C0713c.z(wVar, c0672i, I6.p.f2579a, null);
        wVar.setOnTouchListener(c0716dZ != null ? new ViewOnTouchListenerC0710b(c0716dZ, 0) : null);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c1139d9.f8077A.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            A7.d dVar = c0672i.f2147b;
            if (!zHasNext) {
                wVar.setItems(arrayList);
                wVar.setOnItemSelectedListener(new R0(wVar, arrayList, c1139d9, c0672i));
                wVar.b(this.f3352d.a(c0672i, c1139d9.f8089M, new U0(c1139d9, wVar, this.f3353e.a(c0675l.getDivData(), c0675l.getDataTag()), dVar), path));
                A0 a02 = new A0(dVar, c1139d9, wVar);
                wVar.b(c1139d9.f8108m.e(dVar, a02));
                wVar.b(c1139d9.f8119x.d(dVar, a02));
                A7.b<H9> bVar = c1139d9.f8109n;
                wVar.b(bVar.d(dVar, a02));
                m(dVar, c1139d9, wVar);
                C0748o0 c0748o0 = new C0748o0(this, wVar, c1139d9, dVar, 2);
                A7.b<String> bVar2 = c1139d9.f8107l;
                if (bVar2 != null && (dVarE = bVar2.e(dVar, c0748o0)) != null) {
                    wVar.b(dVarE);
                }
                wVar.b(c1139d9.f8111p.d(dVar, c0748o0));
                A7.b<Long> bVar3 = c1139d9.f8112q;
                wVar.b(bVar3 != null ? bVar3.d(dVar, c0748o0) : null);
                wVar.b(c1139d9.f8082F.e(dVar, new C0749p(wVar, 2)));
                A7.b<Long> bVar4 = c1139d9.f8120y;
                if (bVar4 == null) {
                    C0713c.i(wVar, null, bVar.a(dVar));
                } else {
                    L0 l02 = new L0(bVar4, dVar, c1139d9, wVar);
                    wVar.b(bVar4.e(dVar, l02));
                    wVar.b(bVar.d(dVar, l02));
                }
                A7.b<String> bVar5 = c1139d9.f8116u;
                if (bVar5 != null) {
                    wVar.b(bVar5.e(dVar, new F7.h(wVar, 4)));
                }
                wVar.b(c1139d9.f8115t.e(dVar, new E7.a(wVar, 3)));
                return;
            }
            Object next = it.next();
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            C1139d9.a aVar = (C1139d9.a) next;
            A7.b<String> bVar6 = aVar.f8122a;
            if (bVar6 == null) {
                bVar6 = aVar.f8123b;
            }
            arrayList.add(bVar6.a(dVar));
            bVar6.d(dVar, new S0(arrayList, i, wVar));
            i = i10;
        }
    }

    public final void m(A7.d dVar, C1139d9 c1139d9, O6.w wVar) {
        A7.b<String> bVar = c1139d9.f8107l;
        String strA = bVar != null ? bVar.a(dVar) : null;
        EnumC1195h5 enumC1195h5A = c1139d9.f8111p.a(dVar);
        A7.b<Long> bVar2 = c1139d9.f8112q;
        wVar.setTypeface(T1.B.m(this.f3351c, strA, enumC1195h5A, bVar2 != null ? bVar2.a(dVar) : null));
    }
}
