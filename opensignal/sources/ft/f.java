package ft;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class f extends ts.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractCollection f9080c;

    public /* synthetic */ f(AbstractCollection abstractCollection, int i10) {
        this.f9079b = i10;
        this.f9080c = abstractCollection;
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // ts.o
    public final void b(rr.d dVar) {
        switch (this.f9079b) {
            case 0:
                br.l.e(dVar, "fakeOverride");
                ts.n.r(dVar, null);
                ((ArrayList) this.f9080c).add(dVar);
                return;
            default:
                if (dVar == null) {
                    a(0);
                    throw null;
                }
                ts.n.r(dVar, null);
                ((LinkedHashSet) this.f9080c).add(dVar);
                return;
        }
    }

    @Override // ts.o
    public final void d(rr.d dVar, rr.d dVar2) {
        switch (this.f9079b) {
            case 0:
                br.l.e(dVar2, "fromCurrent");
                if (dVar2 instanceof ur.u) {
                    ((ur.u) dVar2).C1(rr.q.f21713a, dVar);
                    return;
                }
                return;
            default:
                if (dVar2 != null) {
                    return;
                }
                a(2);
                throw null;
        }
    }
}
