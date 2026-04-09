package M;

import F.EnumC2726p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC2726p f12301a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12302b;

    /* renamed from: c, reason: collision with root package name */
    private final u f12303c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12304d;

    public /* synthetic */ v(EnumC2726p enumC2726p, long j10, u uVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC2726p, j10, uVar, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f12301a == vVar.f12301a && C6531g.j(this.f12302b, vVar.f12302b) && this.f12303c == vVar.f12303c && this.f12304d == vVar.f12304d;
    }

    public int hashCode() {
        return (((((this.f12301a.hashCode() * 31) + C6531g.o(this.f12302b)) * 31) + this.f12303c.hashCode()) * 31) + Boolean.hashCode(this.f12304d);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f12301a + ", position=" + ((Object) C6531g.t(this.f12302b)) + ", anchor=" + this.f12303c + ", visible=" + this.f12304d + ')';
    }

    private v(EnumC2726p enumC2726p, long j10, u uVar, boolean z10) {
        this.f12301a = enumC2726p;
        this.f12302b = j10;
        this.f12303c = uVar;
        this.f12304d = z10;
    }
}
