package aj;

import bj.K;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class x extends AbstractC3866G {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26377a;

    /* renamed from: b, reason: collision with root package name */
    private final Xi.f f26378b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26379c;

    public /* synthetic */ x(Object obj, boolean z10, Xi.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z10, (i10 & 4) != 0 ? null : fVar);
    }

    @Override // aj.AbstractC3866G
    public String b() {
        return this.f26379c;
    }

    public final Xi.f e() {
        return this.f26378b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return f() == xVar.f() && AbstractC6492s.d(b(), xVar.b());
    }

    public boolean f() {
        return this.f26377a;
    }

    public int hashCode() {
        return (Boolean.hashCode(f()) * 31) + b().hashCode();
    }

    @Override // aj.AbstractC3866G
    public String toString() {
        if (!f()) {
            return b();
        }
        StringBuilder sb2 = new StringBuilder();
        K.c(sb2, b());
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Object body, boolean z10, Xi.f fVar) {
        super(null);
        AbstractC6492s.i(body, "body");
        this.f26377a = z10;
        this.f26378b = fVar;
        this.f26379c = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
