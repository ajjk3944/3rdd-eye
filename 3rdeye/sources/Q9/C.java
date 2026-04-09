package Q9;

import O9.k;
import O9.l;
import b9.C2001h;
import c9.C2097r;
import p9.InterfaceC5480a;

/* compiled from: Enums.kt */
/* loaded from: classes3.dex */
public final class C extends C1547o0 {

    /* renamed from: l, reason: collision with root package name */
    public final k.b f11395l;

    /* renamed from: m, reason: collision with root package name */
    public final b9.p f11396m;

    /* compiled from: Enums.kt */
    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<O9.e[]> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f11397g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f11398h;
        public final /* synthetic */ C i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, String str, C c10) {
            super(0);
            this.f11397g = i;
            this.f11398h = str;
            this.i = c10;
        }

        @Override // p9.InterfaceC5480a
        public final O9.e[] invoke() {
            int i = this.f11397g;
            O9.e[] eVarArr = new O9.e[i];
            for (int i10 = 0; i10 < i; i10++) {
                eVarArr[i10] = O9.j.b(this.f11398h + '.' + this.i.f11512e[i10], l.d.f10526a, new O9.e[0], O9.i.f10520g);
            }
            return eVarArr;
        }
    }

    public C(String str, int i) {
        super(str, null, i);
        this.f11395l = k.b.f10522a;
        this.f11396m = C2001h.b(new a(i, str, this));
    }

    @Override // Q9.C1547o0, O9.e
    public final O9.k e() {
        return this.f11395l;
    }

    @Override // Q9.C1547o0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof O9.e)) {
            return false;
        }
        O9.e eVar = (O9.e) obj;
        if (eVar.e() != k.b.f10522a) {
            return false;
        }
        return this.f11508a.equals(eVar.a()) && kotlin.jvm.internal.l.b(C1545n0.a(this), C1545n0.a(eVar));
    }

    @Override // Q9.C1547o0
    public final int hashCode() {
        int iHashCode = this.f11508a.hashCode();
        O9.g gVar = new O9.g(this);
        int iHashCode2 = 1;
        while (gVar.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) gVar.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // Q9.C1547o0, O9.e
    public final O9.e i(int i) {
        return ((O9.e[]) this.f11396m.getValue())[i];
    }

    @Override // Q9.C1547o0
    public final String toString() {
        return C2097r.u0(new O9.h(this, 0), ", ", this.f11508a.concat("("), ")", null, 56);
    }
}
