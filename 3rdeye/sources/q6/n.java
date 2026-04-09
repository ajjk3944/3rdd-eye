package Q6;

import N7.B8;

/* compiled from: VariableMonitorView.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f11361a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11362b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11363c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11364d;

    public n(String name, String path, String str, String value) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(path, "path");
        kotlin.jvm.internal.l.f(value, "value");
        this.f11361a = name;
        this.f11362b = path;
        this.f11363c = str;
        this.f11364d = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.l.b(this.f11361a, nVar.f11361a) && kotlin.jvm.internal.l.b(this.f11362b, nVar.f11362b) && kotlin.jvm.internal.l.b(this.f11363c, nVar.f11363c) && kotlin.jvm.internal.l.b(this.f11364d, nVar.f11364d);
    }

    public final int hashCode() {
        return this.f11364d.hashCode() + B4.g.n(B4.g.n(this.f11361a.hashCode() * 31, 31, this.f11362b), 31, this.f11363c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VariableModel(name=");
        sb.append(this.f11361a);
        sb.append(", path=");
        sb.append(this.f11362b);
        sb.append(", type=");
        sb.append(this.f11363c);
        sb.append(", value=");
        return B8.j(sb, this.f11364d, ')');
    }
}
