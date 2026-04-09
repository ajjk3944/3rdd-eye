package F7;

import c9.C2099t;
import java.util.List;

/* compiled from: RawJsonRepositoryResult.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f1708c;

    /* renamed from: a, reason: collision with root package name */
    public final List<J7.a> f1709a;

    /* renamed from: b, reason: collision with root package name */
    public final List<p> f1710b;

    static {
        C2099t c2099t = C2099t.f18581b;
        f1708c = new s(c2099t, c2099t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(List<? extends J7.a> resultData, List<p> list) {
        kotlin.jvm.internal.l.f(resultData, "resultData");
        this.f1709a = resultData;
        this.f1710b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.l.b(this.f1709a, sVar.f1709a) && kotlin.jvm.internal.l.b(this.f1710b, sVar.f1710b);
    }

    public final int hashCode() {
        return this.f1710b.hashCode() + (this.f1709a.hashCode() * 31);
    }

    public final String toString() {
        return "RawJsonRepositoryResult(resultData=" + this.f1709a + ", errors=" + this.f1710b + ')';
    }
}
