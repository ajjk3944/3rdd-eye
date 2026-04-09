package bs;

import dt.m;
import java.util.Collection;
import java.util.LinkedHashSet;
import ts.n;
import ts.o;

/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f2922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2923d;

    public b(m mVar, LinkedHashSet linkedHashSet, boolean z10) {
        this.f2921b = mVar;
        this.f2922c = linkedHashSet;
        this.f2923d = z10;
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i10 == 3) {
            objArr[0] = "member";
        } else if (i10 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else if (i10 == 3 || i10 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // ts.o
    public final void b(rr.d dVar) {
        if (dVar == null) {
            a(0);
            throw null;
        }
        n.r(dVar, new a(0, this));
        this.f2922c.add(dVar);
    }

    @Override // ts.o
    public final void d(rr.d dVar, rr.d dVar2) {
        if (dVar2 != null) {
            return;
        }
        a(2);
        throw null;
    }

    @Override // ts.o
    public final void p(rr.d dVar, Collection collection) {
        if (dVar == null) {
            a(3);
            throw null;
        }
        if (!this.f2923d || dVar.f() == rr.c.FAKE_OVERRIDE) {
            dVar.y0(collection);
        }
    }
}
