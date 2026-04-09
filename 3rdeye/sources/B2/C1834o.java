package b2;

import N7.H7;

/* compiled from: WorkSpec.kt */
/* renamed from: b2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1834o {

    /* renamed from: a, reason: collision with root package name */
    public final String f17128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17129b;

    public C1834o(String workSpecId, int i) {
        kotlin.jvm.internal.l.f(workSpecId, "workSpecId");
        this.f17128a = workSpecId;
        this.f17129b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1834o)) {
            return false;
        }
        C1834o c1834o = (C1834o) obj;
        return kotlin.jvm.internal.l.b(this.f17128a, c1834o.f17128a) && this.f17129b == c1834o.f17129b;
    }

    public final int hashCode() {
        return (this.f17128a.hashCode() * 31) + this.f17129b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f17128a);
        sb.append(", generation=");
        return H7.p(sb, this.f17129b, ')');
    }
}
