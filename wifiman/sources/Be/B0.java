package Be;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    private final W7.f f1379a;

    /* renamed from: b, reason: collision with root package name */
    private final W7.f f1380b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1381c;

    public B0(W7.f fVar, W7.f fVar2, boolean z10) {
        this.f1379a = fVar;
        this.f1380b = fVar2;
        this.f1381c = z10;
    }

    public final boolean a() {
        return this.f1381c;
    }

    public final W7.f b() {
        return this.f1379a;
    }

    public final W7.f c() {
        return this.f1380b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return AbstractC6492s.d(this.f1379a, b02.f1379a) && AbstractC6492s.d(this.f1380b, b02.f1380b) && this.f1381c == b02.f1381c;
    }

    public int hashCode() {
        W7.f fVar = this.f1379a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        W7.f fVar2 = this.f1380b;
        return ((iHashCode + (fVar2 != null ? fVar2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f1381c);
    }

    public String toString() {
        return "Model(signal=" + this.f1379a + ", signalMax=" + this.f1380b + ", connected=" + this.f1381c + ")";
    }

    public /* synthetic */ B0(W7.f fVar, W7.f fVar2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i10 & 2) != 0 ? null : fVar2, (i10 & 4) != 0 ? false : z10);
    }
}
