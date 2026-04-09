package x6;

import N7.Ba;
import N7.C1217ic;
import N7.C1322q5;
import N7.C1405w5;
import N7.C1431y3;
import N7.G7;
import N7.R3;
import N7.S2;
import N7.X9;
import N7.Z;
import i7.C4460a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: DivVideoActionHandler.kt */
/* renamed from: x6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5775g {

    /* renamed from: a, reason: collision with root package name */
    public final C5778j f47789a;

    public C5775g(C5778j c5778j) {
        this.f47789a = c5778j;
    }

    public static C1217ic a(S2 s22, String str, A7.d dVar) {
        S2 s2D;
        if (s22 instanceof C1217ic) {
            if (l.b(((C1217ic) s22).f8462t, str)) {
                return (C1217ic) s22;
            }
            return null;
        }
        if (s22 instanceof C1322q5) {
            for (i7.b bVar : C4460a.c((C1322q5) s22, dVar)) {
                C1217ic c1217icA = a(bVar.f38460a.d(), str, bVar.f38461b);
                if (c1217icA != null) {
                    return c1217icA;
                }
            }
            return null;
        }
        if (s22 instanceof C1431y3) {
            for (i7.b bVar2 : C4460a.b((C1431y3) s22, dVar)) {
                C1217ic c1217icA2 = a(bVar2.f38460a.d(), str, bVar2.f38461b);
                if (c1217icA2 != null) {
                    return c1217icA2;
                }
            }
            return null;
        }
        if (s22 instanceof C1405w5) {
            Iterator<T> it = C4460a.i((C1405w5) s22).iterator();
            while (it.hasNext()) {
                C1217ic c1217icA3 = a(((Z) it.next()).d(), str, dVar);
                if (c1217icA3 != null) {
                    return c1217icA3;
                }
            }
            return null;
        }
        if (s22 instanceof G7) {
            for (i7.b bVar3 : C4460a.d((G7) s22, dVar)) {
                C1217ic c1217icA4 = a(bVar3.f38460a.d(), str, bVar3.f38461b);
                if (c1217icA4 != null) {
                    return c1217icA4;
                }
            }
            return null;
        }
        if (s22 instanceof Ba) {
            Iterator<T> it2 = ((Ba) s22).f4949q.iterator();
            while (it2.hasNext()) {
                C1217ic c1217icA5 = a(((Ba.a) it2.next()).f4959a.d(), str, dVar);
                if (c1217icA5 != null) {
                    return c1217icA5;
                }
            }
            return null;
        }
        if (s22 instanceof R3) {
            List<Z> list = ((R3) s22).f6139q;
            if (list == null) {
                return null;
            }
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                C1217ic c1217icA6 = a(((Z) it3.next()).d(), str, dVar);
                if (c1217icA6 != null) {
                    return c1217icA6;
                }
            }
            return null;
        }
        if (!(s22 instanceof X9)) {
            return null;
        }
        Iterator<T> it4 = ((X9) s22).f7743y.iterator();
        while (it4.hasNext()) {
            Z z10 = ((X9.a) it4.next()).f7747c;
            if (z10 != null && (s2D = z10.d()) != null) {
                C1217ic c1217icA7 = a(s2D, str, dVar);
                if (c1217icA7 != null) {
                    return c1217icA7;
                }
            }
        }
        return null;
    }
}
