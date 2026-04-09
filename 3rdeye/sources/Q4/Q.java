package Q4;

import N7.C1094a9;
import Q4.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* loaded from: classes2.dex */
public final class Q extends f0.e.d.a.b.AbstractC0140d {

    /* renamed from: a, reason: collision with root package name */
    public final String f11089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11090b;

    /* renamed from: c, reason: collision with root package name */
    public final List<f0.e.d.a.b.AbstractC0140d.AbstractC0141a> f11091c;

    public Q() {
        throw null;
    }

    public Q(int i, String str, List list) {
        this.f11089a = str;
        this.f11090b = i;
        this.f11091c = list;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0140d
    public final List<f0.e.d.a.b.AbstractC0140d.AbstractC0141a> a() {
        return this.f11091c;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0140d
    public final int b() {
        return this.f11090b;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0140d
    public final String c() {
        return this.f11089a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0140d)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0140d abstractC0140d = (f0.e.d.a.b.AbstractC0140d) obj;
        return this.f11089a.equals(abstractC0140d.c()) && this.f11090b == abstractC0140d.b() && this.f11091c.equals(abstractC0140d.a());
    }

    public final int hashCode() {
        return ((((this.f11089a.hashCode() ^ 1000003) * 1000003) ^ this.f11090b) * 1000003) ^ this.f11091c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.f11089a);
        sb.append(", importance=");
        sb.append(this.f11090b);
        sb.append(", frames=");
        return C1094a9.h(sb, this.f11091c, "}");
    }
}
