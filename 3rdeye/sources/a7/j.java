package a7;

import N7.C1154e9;

/* compiled from: FunctionArgument.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1667d f14227a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14228b;

    public j(EnumC1667d type, boolean z10) {
        kotlin.jvm.internal.l.f(type, "type");
        this.f14227a = type;
        this.f14228b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f14227a == jVar.f14227a && this.f14228b == jVar.f14228b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f14227a.hashCode() * 31;
        boolean z10 = this.f14228b;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FunctionArgument(type=");
        sb.append(this.f14227a);
        sb.append(", isVariadic=");
        return C1154e9.k(sb, this.f14228b, ')');
    }
}
