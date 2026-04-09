package R9;

import S9.S;
import java.io.Serializable;

/* compiled from: JsonElement.kt */
/* loaded from: classes3.dex */
public final class u extends C {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11816b;

    /* renamed from: c, reason: collision with root package name */
    public final O9.e f11817c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11818d;

    public u(Serializable body, boolean z10, O9.e eVar) {
        kotlin.jvm.internal.l.f(body, "body");
        this.f11816b = z10;
        this.f11817c = eVar;
        this.f11818d = body.toString();
        if (eVar != null && !eVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // R9.C
    public final String c() {
        return this.f11818d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f11816b == uVar.f11816b && kotlin.jvm.internal.l.b(this.f11818d, uVar.f11818d);
    }

    public final int hashCode() {
        return this.f11818d.hashCode() + ((this.f11816b ? 1231 : 1237) * 31);
    }

    @Override // R9.C
    public final String toString() {
        boolean z10 = this.f11816b;
        String str = this.f11818d;
        if (!z10) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        S.a(sb, str);
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
