package z9;

import kotlin.jvm.internal.t;
import kotlinx.serialization.json.internal.k0;

/* loaded from: classes4.dex */
public final class l extends kotlinx.serialization.json.c {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25450c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Object body, boolean z10) {
        super(null);
        kotlin.jvm.internal.p.e(body, "body");
        this.f25450c = z10;
        this.f25451d = body.toString();
    }

    @Override // kotlinx.serialization.json.c
    public String c() {
        return this.f25451d;
    }

    public boolean d() {
        return this.f25450c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.p.a(t.b(l.class), t.b(obj.getClass()))) {
            return false;
        }
        l lVar = (l) obj;
        return d() == lVar.d() && kotlin.jvm.internal.p.a(c(), lVar.c());
    }

    public int hashCode() {
        return (androidx.privacysandbox.ads.adservices.topics.a.a(d()) * 31) + c().hashCode();
    }

    @Override // kotlinx.serialization.json.c
    public String toString() {
        if (!d()) {
            return c();
        }
        StringBuilder sb = new StringBuilder();
        k0.c(sb, c());
        String string = sb.toString();
        kotlin.jvm.internal.p.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
