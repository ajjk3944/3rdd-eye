package W6;

import H6.C0672i;
import H6.C0675l;
import H6.C0683u;
import K6.C0713c;
import N7.U3;
import N7.X9;
import N7.Z;
import O6.A;
import android.view.View;
import c9.C2092m;
import c9.C2097r;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import z6.C5862a;
import z6.C5865d;
import z6.i;

/* compiled from: DivJoinedStateSwitcher.kt */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final C0675l f13339a;

    /* renamed from: b, reason: collision with root package name */
    public final C0683u f13340b;

    public a(C0675l divView, C0683u c0683u) {
        l.f(divView, "divView");
        this.f13339a = divView;
        this.f13340b = c0683u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // W6.c
    public final void a(U3.a state, List<C5865d> list, A7.d resolver) throws i {
        C0675l c0675l;
        C5865d c5865d;
        C0675l c0675l2;
        C5865d c5865d2;
        boolean z10;
        l.f(state, "state");
        l.f(resolver, "resolver");
        C0675l c0675l3 = this.f13339a;
        View view = c0675l3.getChildAt(0);
        Z z11 = state.f6382a;
        long j4 = state.f6383b;
        ArrayList arrayListX = C2092m.X(String.valueOf(j4));
        if (z11 instanceof Z.m) {
            X9 x92 = ((Z.m) z11).f7825c;
            l.f(x92, "<this>");
            String str = x92.f7730l;
            if (str == null && (str = x92.f7735q) == null) {
                str = "";
            }
            arrayListX.add(str);
        }
        C5865d c5865d3 = new C5865d(j4, C2099t.f18581b, arrayListX);
        int size = list.size();
        if (size != 0) {
            boolean z12 = true;
            if (size != 1) {
                Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it.next();
                while (it.hasNext()) {
                    C5865d otherPath = (C5865d) it.next();
                    C5865d somePath = (C5865d) next;
                    l.f(somePath, "somePath");
                    l.f(otherPath, "otherPath");
                    long j10 = otherPath.f48458a;
                    long j11 = somePath.f48458a;
                    if (j11 != j10) {
                        c0675l2 = c0675l3;
                        z10 = z12;
                        c5865d2 = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it2 = somePath.f48459b.iterator();
                        int i = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                c0675l2 = c0675l3;
                                break;
                            }
                            Object next2 = it2.next();
                            int i10 = i + 1;
                            if (i < 0) {
                                C2092m.a0();
                                throw null;
                            }
                            b9.l lVar = (b9.l) next2;
                            c0675l2 = c0675l3;
                            b9.l lVar2 = (b9.l) C2097r.r0(i, otherPath.f48459b);
                            if (lVar2 == null || !l.b(lVar, lVar2)) {
                                break;
                            }
                            arrayList.add(lVar);
                            c0675l3 = c0675l2;
                            i = i10;
                        }
                        z10 = true;
                        c5865d2 = new C5865d(j11, arrayList, C5865d.a.a(somePath.f48460c, arrayList, true));
                    }
                    next = c5865d2 == null ? c5865d3 : c5865d2;
                    z12 = z10;
                    c0675l3 = c0675l2;
                }
                c0675l = c0675l3;
                c5865d = (C5865d) next;
            } else {
                c0675l = c0675l3;
                c5865d = (C5865d) C2097r.p0(list);
            }
        } else {
            c0675l = c0675l3;
            c5865d = c5865d3;
        }
        if (!c5865d.f48459b.isEmpty()) {
            l.e(view, "rootView");
            b9.l lVarE = C5862a.e(view, state, c5865d, resolver);
            if (lVarE == null) {
                return;
            }
            A a10 = (A) lVarE.f18083b;
            Z.m mVar = (Z.m) lVarE.f18084c;
            if (a10 != null) {
                C5865d path = a10.getPath();
                c5865d3 = path == null ? c5865d : path;
                z11 = mVar;
                view = a10;
            }
        }
        l.e(view, "view");
        C0672i c0672iK = C0713c.K(view);
        if (c0672iK == null) {
            c0672iK = c0675l.getBindingContext$div_release();
        }
        C5865d c5865dD = c5865d3.d();
        C0683u c0683u = this.f13340b;
        c0683u.b(c0672iK, view, z11, c5865dD);
        c0683u.a();
    }
}
